/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1457620275577137218L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"username\",\"type\":\"string\",\"default\":\"NULL\"},{\"name\":\"age\",\"type\":\"int\",\"default\":-1},{\"name\":\"address\",\"type\":{\"type\":\"record\",\"name\":\"address\",\"fields\":[{\"name\":\"district\",\"type\":\"string\",\"default\":\"NULL\"},{\"name\":\"province\",\"type\":\"string\",\"default\":\"NULL\"}]}},{\"name\":\"sex\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"sex\",\"symbols\":[\"MALE\",\"FEMALE\"]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<User> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this User to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a User from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a User instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private int id;
  private java.lang.CharSequence username;
  private int age;
  private address address;
  private sex sex;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param username The new value for username
   * @param age The new value for age
   * @param address The new value for address
   * @param sex The new value for sex
   */
  public User(java.lang.Integer id, java.lang.CharSequence username, java.lang.Integer age, address address, sex sex) {
    this.id = id;
    this.username = username;
    this.age = age;
    this.address = address;
    this.sex = sex;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return username;
    case 2: return age;
    case 3: return address;
    case 4: return sex;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: username = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    case 3: address = (address)value$; break;
    case 4: sex = (sex)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public int getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(int value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'username' field.
   * @return The value of the 'username' field.
   */
  public java.lang.CharSequence getUsername() {
    return username;
  }


  /**
   * Sets the value of the 'username' field.
   * @param value the value to set.
   */
  public void setUsername(java.lang.CharSequence value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public int getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return The value of the 'address' field.
   */
  public address getAddress() {
    return address;
  }


  /**
   * Sets the value of the 'address' field.
   * @param value the value to set.
   */
  public void setAddress(address value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'sex' field.
   * @return The value of the 'sex' field.
   */
  public sex getSex() {
    return sex;
  }


  /**
   * Sets the value of the 'sex' field.
   * @param value the value to set.
   */
  public void setSex(sex value) {
    this.sex = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static User.Builder newBuilder() {
    return new User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static User.Builder newBuilder(User.Builder other) {
    if (other == null) {
      return new User.Builder();
    } else {
      return new User.Builder(other);
    }
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static User.Builder newBuilder(User other) {
    if (other == null) {
      return new User.Builder();
    } else {
      return new User.Builder(other);
    }
  }

  /**
   * RecordBuilder for User instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private int id;
    private java.lang.CharSequence username;
    private int age;
    private address address;
    private address.Builder addressBuilder;
    private sex sex;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasAddressBuilder()) {
        this.addressBuilder = address.newBuilder(other.getAddressBuilder());
      }
      if (isValidValue(fields()[4], other.sex)) {
        this.sex = data().deepCopy(fields()[4].schema(), other.sex);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(User other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.username)) {
        this.username = data().deepCopy(fields()[1].schema(), other.username);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.address)) {
        this.address = data().deepCopy(fields()[3].schema(), other.address);
        fieldSetFlags()[3] = true;
      }
      this.addressBuilder = null;
      if (isValidValue(fields()[4], other.sex)) {
        this.sex = data().deepCopy(fields()[4].schema(), other.sex);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public User.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'username' field.
      * @return The value.
      */
    public java.lang.CharSequence getUsername() {
      return username;
    }


    /**
      * Sets the value of the 'username' field.
      * @param value The value of 'username'.
      * @return This builder.
      */
    public User.Builder setUsername(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.username = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'username' field has been set.
      * @return True if the 'username' field has been set, false otherwise.
      */
    public boolean hasUsername() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'username' field.
      * @return This builder.
      */
    public User.Builder clearUsername() {
      username = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public int getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public User.Builder setAge(int value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public User.Builder clearAge() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * @return The value.
      */
    public address getAddress() {
      return address;
    }


    /**
      * Sets the value of the 'address' field.
      * @param value The value of 'address'.
      * @return This builder.
      */
    public User.Builder setAddress(address value) {
      validate(fields()[3], value);
      this.addressBuilder = null;
      this.address = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'address' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public address.Builder getAddressBuilder() {
      if (addressBuilder == null) {
        if (hasAddress()) {
          setAddressBuilder(address.newBuilder(address));
        } else {
          setAddressBuilder(address.newBuilder());
        }
      }
      return addressBuilder;
    }

    /**
     * Sets the Builder instance for the 'address' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public User.Builder setAddressBuilder(address.Builder value) {
      clearAddress();
      addressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'address' field has an active Builder instance
     * @return True if the 'address' field has an active Builder instance
     */
    public boolean hasAddressBuilder() {
      return addressBuilder != null;
    }

    /**
      * Clears the value of the 'address' field.
      * @return This builder.
      */
    public User.Builder clearAddress() {
      address = null;
      addressBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'sex' field.
      * @return The value.
      */
    public sex getSex() {
      return sex;
    }


    /**
      * Sets the value of the 'sex' field.
      * @param value The value of 'sex'.
      * @return This builder.
      */
    public User.Builder setSex(sex value) {
      validate(fields()[4], value);
      this.sex = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'sex' field has been set.
      * @return True if the 'sex' field has been set, false otherwise.
      */
    public boolean hasSex() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'sex' field.
      * @return This builder.
      */
    public User.Builder clearSex() {
      sex = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.username = fieldSetFlags()[1] ? this.username : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        if (addressBuilder != null) {
          try {
            record.address = this.addressBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("address"));
            throw e;
          }
        } else {
          record.address = fieldSetFlags()[3] ? this.address : (address) defaultValue(fields()[3]);
        }
        record.sex = fieldSetFlags()[4] ? this.sex : (sex) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    out.writeString(this.username);

    out.writeInt(this.age);

    this.address.customEncode(out);

    if (this.sex == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.sex.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);

      this.age = in.readInt();

      if (this.address == null) {
        this.address = new address();
      }
      this.address.customDecode(in);

      if (in.readIndex() != 1) {
        in.readNull();
        this.sex = null;
      } else {
        this.sex = sex.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          this.username = in.readString(this.username instanceof Utf8 ? (Utf8)this.username : null);
          break;

        case 2:
          this.age = in.readInt();
          break;

        case 3:
          if (this.address == null) {
            this.address = new address();
          }
          this.address.customDecode(in);
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.sex = null;
          } else {
            this.sex = sex.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









