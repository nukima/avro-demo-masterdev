import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user1 = new User(1, "the_first", 16, new address("Nam Tu Liem", "Ha Noi"), sex.MALE);

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("the_second");
        user2.setAddress(new address("Ha Dong", "Ha Noi"));

        User user3 = User.newBuilder().setId(3).setUsername("the_third").setAge(18).setAddress(new address("Cau Giay", "Ha Noi")).setSex(sex.FEMALE).build();

        // Serialize user1, user2, user3 to disk
        User[] users = {user1, user2, user3};
        serialize(users);

        // Deserialize
        deserialize(new File("users.avro"));
    }

    public static void serialize(User[] users) throws IOException {
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        dataFileWriter.create(users[0].getSchema(), new File("users.avro"));
        for(User u : users) {
            dataFileWriter.append(u);
        }
        dataFileWriter.close();
    }
    public static void deserialize(File file) throws IOException {
        DatumReader<User> userDatumReader = new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = new DataFileReader<User>(file, userDatumReader);
        User user = null;

        // Read the file and return data.json
        File data = new File("data.json");
        FileWriter writer = new FileWriter(data);
        writer.write("{\"users\":[");
        if(dataFileReader.hasNext()) {
            user = dataFileReader.next(user);
            writer.write(user.toString());
        }
        while(dataFileReader.hasNext()) {
            writer.write(",");
            user = dataFileReader.next(user);
            writer.write(user.toString());
        }
        writer.write("]}");
        writer.close();

        // print data to console
//        while (dataFileReader.hasNext()) {
//            user = dataFileReader.next(user);
//            System.out.println(user);
//        }
    }

}
