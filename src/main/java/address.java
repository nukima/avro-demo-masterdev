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
public class address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3472671772845634695L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"address\",\"fields\":[{\"name\":\"district\",\"type\":\"string\",\"default\":\"NULL\"},{\"name\":\"province\",\"type\":\"string\",\"default\":\"NULL\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<address> ENCODER =
      new BinaryMessageEncoder<address>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<address> DECODER =
      new BinaryMessageDecoder<address>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<address> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<address> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<address> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<address>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this address to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a address from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a address instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static address fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence district;
  private java.lang.CharSequence province;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public address() {}

  /**
   * All-args constructor.
   * @param district The new value for district
   * @param province The new value for province
   */
  public address(java.lang.CharSequence district, java.lang.CharSequence province) {
    this.district = district;
    this.province = province;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return district;
    case 1: return province;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: district = (java.lang.CharSequence)value$; break;
    case 1: province = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'district' field.
   * @return The value of the 'district' field.
   */
  public java.lang.CharSequence getDistrict() {
    return district;
  }


  /**
   * Sets the value of the 'district' field.
   * @param value the value to set.
   */
  public void setDistrict(java.lang.CharSequence value) {
    this.district = value;
  }

  /**
   * Gets the value of the 'province' field.
   * @return The value of the 'province' field.
   */
  public java.lang.CharSequence getProvince() {
    return province;
  }


  /**
   * Sets the value of the 'province' field.
   * @param value the value to set.
   */
  public void setProvince(java.lang.CharSequence value) {
    this.province = value;
  }

  /**
   * Creates a new address RecordBuilder.
   * @return A new address RecordBuilder
   */
  public static address.Builder newBuilder() {
    return new address.Builder();
  }

  /**
   * Creates a new address RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new address RecordBuilder
   */
  public static address.Builder newBuilder(address.Builder other) {
    if (other == null) {
      return new address.Builder();
    } else {
      return new address.Builder(other);
    }
  }

  /**
   * Creates a new address RecordBuilder by copying an existing address instance.
   * @param other The existing instance to copy.
   * @return A new address RecordBuilder
   */
  public static address.Builder newBuilder(address other) {
    if (other == null) {
      return new address.Builder();
    } else {
      return new address.Builder(other);
    }
  }

  /**
   * RecordBuilder for address instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<address>
    implements org.apache.avro.data.RecordBuilder<address> {

    private java.lang.CharSequence district;
    private java.lang.CharSequence province;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(address.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.district)) {
        this.district = data().deepCopy(fields()[0].schema(), other.district);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.province)) {
        this.province = data().deepCopy(fields()[1].schema(), other.province);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing address instance
     * @param other The existing instance to copy.
     */
    private Builder(address other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.district)) {
        this.district = data().deepCopy(fields()[0].schema(), other.district);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.province)) {
        this.province = data().deepCopy(fields()[1].schema(), other.province);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'district' field.
      * @return The value.
      */
    public java.lang.CharSequence getDistrict() {
      return district;
    }


    /**
      * Sets the value of the 'district' field.
      * @param value The value of 'district'.
      * @return This builder.
      */
    public address.Builder setDistrict(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.district = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'district' field has been set.
      * @return True if the 'district' field has been set, false otherwise.
      */
    public boolean hasDistrict() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'district' field.
      * @return This builder.
      */
    public address.Builder clearDistrict() {
      district = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'province' field.
      * @return The value.
      */
    public java.lang.CharSequence getProvince() {
      return province;
    }


    /**
      * Sets the value of the 'province' field.
      * @param value The value of 'province'.
      * @return This builder.
      */
    public address.Builder setProvince(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.province = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'province' field has been set.
      * @return True if the 'province' field has been set, false otherwise.
      */
    public boolean hasProvince() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'province' field.
      * @return This builder.
      */
    public address.Builder clearProvince() {
      province = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public address build() {
      try {
        address record = new address();
        record.district = fieldSetFlags()[0] ? this.district : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.province = fieldSetFlags()[1] ? this.province : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<address>
    WRITER$ = (org.apache.avro.io.DatumWriter<address>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<address>
    READER$ = (org.apache.avro.io.DatumReader<address>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.district);

    out.writeString(this.province);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.district = in.readString(this.district instanceof Utf8 ? (Utf8)this.district : null);

      this.province = in.readString(this.province instanceof Utf8 ? (Utf8)this.province : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.district = in.readString(this.district instanceof Utf8 ? (Utf8)this.district : null);
          break;

        case 1:
          this.province = in.readString(this.province instanceof Utf8 ? (Utf8)this.province : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










