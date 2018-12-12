/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TweetValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5687806148301763312L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TweetValue\",\"namespace\":\"model\",\"fields\":[{\"name\":\"content\",\"type\":\"string\",\"doc\":\"The content of the tweet\"},{\"name\":\"authorId\",\"type\":\"int\",\"doc\":\"Identifies the author of the tweet\"},{\"name\":\"timestamp\",\"type\":\"int\",\"doc\":\"The time of creation of the tweet\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"location\",\"type\":\"string\",\"doc\":\"The location of the tweet\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"Tags associated to this tweet\"},{\"name\":\"mentions\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"Ids of Users mentioned in this tweet\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TweetValue> ENCODER =
      new BinaryMessageEncoder<TweetValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TweetValue> DECODER =
      new BinaryMessageDecoder<TweetValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<TweetValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<TweetValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TweetValue>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this TweetValue to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a TweetValue from a ByteBuffer. */
  public static TweetValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The content of the tweet */
  @Deprecated public java.lang.CharSequence content;
  /** Identifies the author of the tweet */
  @Deprecated public int authorId;
  /** The time of creation of the tweet */
  @Deprecated public int timestamp;
  /** The location of the tweet */
  @Deprecated public java.lang.CharSequence location;
  /** Tags associated to this tweet */
  @Deprecated public java.util.List<java.lang.CharSequence> tags;
  /** Ids of Users mentioned in this tweet */
  @Deprecated public java.util.List<java.lang.Integer> mentions;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TweetValue() {}

  /**
   * All-args constructor.
   * @param content The content of the tweet
   * @param authorId Identifies the author of the tweet
   * @param timestamp The time of creation of the tweet
   * @param location The location of the tweet
   * @param tags Tags associated to this tweet
   * @param mentions Ids of Users mentioned in this tweet
   */
  public TweetValue(java.lang.CharSequence content, java.lang.Integer authorId, java.lang.Integer timestamp, java.lang.CharSequence location, java.util.List<java.lang.CharSequence> tags, java.util.List<java.lang.Integer> mentions) {
    this.content = content;
    this.authorId = authorId;
    this.timestamp = timestamp;
    this.location = location;
    this.tags = tags;
    this.mentions = mentions;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return content;
    case 1: return authorId;
    case 2: return timestamp;
    case 3: return location;
    case 4: return tags;
    case 5: return mentions;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: content = (java.lang.CharSequence)value$; break;
    case 1: authorId = (java.lang.Integer)value$; break;
    case 2: timestamp = (java.lang.Integer)value$; break;
    case 3: location = (java.lang.CharSequence)value$; break;
    case 4: tags = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: mentions = (java.util.List<java.lang.Integer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'content' field.
   * @return The content of the tweet
   */
  public java.lang.CharSequence getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * The content of the tweet
   * @param value the value to set.
   */
  public void setContent(java.lang.CharSequence value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'authorId' field.
   * @return Identifies the author of the tweet
   */
  public java.lang.Integer getAuthorId() {
    return authorId;
  }

  /**
   * Sets the value of the 'authorId' field.
   * Identifies the author of the tweet
   * @param value the value to set.
   */
  public void setAuthorId(java.lang.Integer value) {
    this.authorId = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The time of creation of the tweet
   */
  public java.lang.Integer getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * The time of creation of the tweet
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Integer value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The location of the tweet
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * The location of the tweet
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * @return Tags associated to this tweet
   */
  public java.util.List<java.lang.CharSequence> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * Tags associated to this tweet
   * @param value the value to set.
   */
  public void setTags(java.util.List<java.lang.CharSequence> value) {
    this.tags = value;
  }

  /**
   * Gets the value of the 'mentions' field.
   * @return Ids of Users mentioned in this tweet
   */
  public java.util.List<java.lang.Integer> getMentions() {
    return mentions;
  }

  /**
   * Sets the value of the 'mentions' field.
   * Ids of Users mentioned in this tweet
   * @param value the value to set.
   */
  public void setMentions(java.util.List<java.lang.Integer> value) {
    this.mentions = value;
  }

  /**
   * Creates a new TweetValue RecordBuilder.
   * @return A new TweetValue RecordBuilder
   */
  public static model.TweetValue.Builder newBuilder() {
    return new model.TweetValue.Builder();
  }

  /**
   * Creates a new TweetValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TweetValue RecordBuilder
   */
  public static model.TweetValue.Builder newBuilder(model.TweetValue.Builder other) {
    return new model.TweetValue.Builder(other);
  }

  /**
   * Creates a new TweetValue RecordBuilder by copying an existing TweetValue instance.
   * @param other The existing instance to copy.
   * @return A new TweetValue RecordBuilder
   */
  public static model.TweetValue.Builder newBuilder(model.TweetValue other) {
    return new model.TweetValue.Builder(other);
  }

  /**
   * RecordBuilder for TweetValue instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TweetValue>
    implements org.apache.avro.data.RecordBuilder<TweetValue> {

    /** The content of the tweet */
    private java.lang.CharSequence content;
    /** Identifies the author of the tweet */
    private int authorId;
    /** The time of creation of the tweet */
    private int timestamp;
    /** The location of the tweet */
    private java.lang.CharSequence location;
    /** Tags associated to this tweet */
    private java.util.List<java.lang.CharSequence> tags;
    /** Ids of Users mentioned in this tweet */
    private java.util.List<java.lang.Integer> mentions;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(model.TweetValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.content)) {
        this.content = data().deepCopy(fields()[0].schema(), other.content);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.authorId)) {
        this.authorId = data().deepCopy(fields()[1].schema(), other.authorId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tags)) {
        this.tags = data().deepCopy(fields()[4].schema(), other.tags);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mentions)) {
        this.mentions = data().deepCopy(fields()[5].schema(), other.mentions);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing TweetValue instance
     * @param other The existing instance to copy.
     */
    private Builder(model.TweetValue other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.content)) {
        this.content = data().deepCopy(fields()[0].schema(), other.content);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.authorId)) {
        this.authorId = data().deepCopy(fields()[1].schema(), other.authorId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[2].schema(), other.timestamp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tags)) {
        this.tags = data().deepCopy(fields()[4].schema(), other.tags);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.mentions)) {
        this.mentions = data().deepCopy(fields()[5].schema(), other.mentions);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'content' field.
      * The content of the tweet
      * @return The value.
      */
    public java.lang.CharSequence getContent() {
      return content;
    }

    /**
      * Sets the value of the 'content' field.
      * The content of the tweet
      * @param value The value of 'content'.
      * @return This builder.
      */
    public model.TweetValue.Builder setContent(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.content = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * The content of the tweet
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'content' field.
      * The content of the tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearContent() {
      content = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'authorId' field.
      * Identifies the author of the tweet
      * @return The value.
      */
    public java.lang.Integer getAuthorId() {
      return authorId;
    }

    /**
      * Sets the value of the 'authorId' field.
      * Identifies the author of the tweet
      * @param value The value of 'authorId'.
      * @return This builder.
      */
    public model.TweetValue.Builder setAuthorId(int value) {
      validate(fields()[1], value);
      this.authorId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'authorId' field has been set.
      * Identifies the author of the tweet
      * @return True if the 'authorId' field has been set, false otherwise.
      */
    public boolean hasAuthorId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'authorId' field.
      * Identifies the author of the tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearAuthorId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * The time of creation of the tweet
      * @return The value.
      */
    public java.lang.Integer getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * The time of creation of the tweet
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public model.TweetValue.Builder setTimestamp(int value) {
      validate(fields()[2], value);
      this.timestamp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * The time of creation of the tweet
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * The time of creation of the tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearTimestamp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * The location of the tweet
      * @return The value.
      */
    public java.lang.CharSequence getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * The location of the tweet
      * @param value The value of 'location'.
      * @return This builder.
      */
    public model.TweetValue.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.location = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * The location of the tweet
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'location' field.
      * The location of the tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearLocation() {
      location = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'tags' field.
      * Tags associated to this tweet
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getTags() {
      return tags;
    }

    /**
      * Sets the value of the 'tags' field.
      * Tags associated to this tweet
      * @param value The value of 'tags'.
      * @return This builder.
      */
    public model.TweetValue.Builder setTags(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.tags = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'tags' field has been set.
      * Tags associated to this tweet
      * @return True if the 'tags' field has been set, false otherwise.
      */
    public boolean hasTags() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'tags' field.
      * Tags associated to this tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearTags() {
      tags = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'mentions' field.
      * Ids of Users mentioned in this tweet
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getMentions() {
      return mentions;
    }

    /**
      * Sets the value of the 'mentions' field.
      * Ids of Users mentioned in this tweet
      * @param value The value of 'mentions'.
      * @return This builder.
      */
    public model.TweetValue.Builder setMentions(java.util.List<java.lang.Integer> value) {
      validate(fields()[5], value);
      this.mentions = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'mentions' field has been set.
      * Ids of Users mentioned in this tweet
      * @return True if the 'mentions' field has been set, false otherwise.
      */
    public boolean hasMentions() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'mentions' field.
      * Ids of Users mentioned in this tweet
      * @return This builder.
      */
    public model.TweetValue.Builder clearMentions() {
      mentions = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TweetValue build() {
      try {
        TweetValue record = new TweetValue();
        record.content = fieldSetFlags()[0] ? this.content : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.authorId = fieldSetFlags()[1] ? this.authorId : (java.lang.Integer) defaultValue(fields()[1]);
        record.timestamp = fieldSetFlags()[2] ? this.timestamp : (java.lang.Integer) defaultValue(fields()[2]);
        record.location = fieldSetFlags()[3] ? this.location : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.tags = fieldSetFlags()[4] ? this.tags : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.mentions = fieldSetFlags()[5] ? this.mentions : (java.util.List<java.lang.Integer>) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TweetValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<TweetValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TweetValue>
    READER$ = (org.apache.avro.io.DatumReader<TweetValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
