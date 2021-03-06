/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.mastercard.fcspr.types.Settlement;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Settlement extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2561789526259159413L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Settlement\",\"namespace\":\"com.mastercard.fcspr.types.Settlement\",\"fields\":[{\"name\":\"Time\",\"type\":\"long\",\"default\":-1},{\"name\":\"Cycle\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"Date\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"Priority\",\"type\":\"string\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public long Time;
  @Deprecated public java.lang.CharSequence Cycle;
  @Deprecated public java.lang.CharSequence Date;
  @Deprecated public java.lang.CharSequence Priority;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Settlement() {}

  /**
   * All-args constructor.
   * @param Time The new value for Time
   * @param Cycle The new value for Cycle
   * @param Date The new value for Date
   * @param Priority The new value for Priority
   */
  public Settlement(java.lang.Long Time, java.lang.CharSequence Cycle, java.lang.CharSequence Date, java.lang.CharSequence Priority) {
    this.Time = Time;
    this.Cycle = Cycle;
    this.Date = Date;
    this.Priority = Priority;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Time;
    case 1: return Cycle;
    case 2: return Date;
    case 3: return Priority;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Time = (java.lang.Long)value$; break;
    case 1: Cycle = (java.lang.CharSequence)value$; break;
    case 2: Date = (java.lang.CharSequence)value$; break;
    case 3: Priority = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Time' field.
   * @return The value of the 'Time' field.
   */
  public java.lang.Long getTime() {
    return Time;
  }

  /**
   * Sets the value of the 'Time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.Long value) {
    this.Time = value;
  }

  /**
   * Gets the value of the 'Cycle' field.
   * @return The value of the 'Cycle' field.
   */
  public java.lang.CharSequence getCycle() {
    return Cycle;
  }

  /**
   * Sets the value of the 'Cycle' field.
   * @param value the value to set.
   */
  public void setCycle(java.lang.CharSequence value) {
    this.Cycle = value;
  }

  /**
   * Gets the value of the 'Date' field.
   * @return The value of the 'Date' field.
   */
  public java.lang.CharSequence getDate() {
    return Date;
  }

  /**
   * Sets the value of the 'Date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.Date = value;
  }

  /**
   * Gets the value of the 'Priority' field.
   * @return The value of the 'Priority' field.
   */
  public java.lang.CharSequence getPriority() {
    return Priority;
  }

  /**
   * Sets the value of the 'Priority' field.
   * @param value the value to set.
   */
  public void setPriority(java.lang.CharSequence value) {
    this.Priority = value;
  }

  /**
   * Creates a new Settlement RecordBuilder.
   * @return A new Settlement RecordBuilder
   */
  public static com.mastercard.fcspr.types.Settlement.Settlement.Builder newBuilder() {
    return new com.mastercard.fcspr.types.Settlement.Settlement.Builder();
  }

  /**
   * Creates a new Settlement RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Settlement RecordBuilder
   */
  public static com.mastercard.fcspr.types.Settlement.Settlement.Builder newBuilder(com.mastercard.fcspr.types.Settlement.Settlement.Builder other) {
    return new com.mastercard.fcspr.types.Settlement.Settlement.Builder(other);
  }

  /**
   * Creates a new Settlement RecordBuilder by copying an existing Settlement instance.
   * @param other The existing instance to copy.
   * @return A new Settlement RecordBuilder
   */
  public static com.mastercard.fcspr.types.Settlement.Settlement.Builder newBuilder(com.mastercard.fcspr.types.Settlement.Settlement other) {
    return new com.mastercard.fcspr.types.Settlement.Settlement.Builder(other);
  }

  /**
   * RecordBuilder for Settlement instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Settlement>
    implements org.apache.avro.data.RecordBuilder<Settlement> {

    private long Time;
    private java.lang.CharSequence Cycle;
    private java.lang.CharSequence Date;
    private java.lang.CharSequence Priority;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.mastercard.fcspr.types.Settlement.Settlement.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Time)) {
        this.Time = data().deepCopy(fields()[0].schema(), other.Time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Cycle)) {
        this.Cycle = data().deepCopy(fields()[1].schema(), other.Cycle);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Date)) {
        this.Date = data().deepCopy(fields()[2].schema(), other.Date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Priority)) {
        this.Priority = data().deepCopy(fields()[3].schema(), other.Priority);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Settlement instance
     * @param other The existing instance to copy.
     */
    private Builder(com.mastercard.fcspr.types.Settlement.Settlement other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Time)) {
        this.Time = data().deepCopy(fields()[0].schema(), other.Time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Cycle)) {
        this.Cycle = data().deepCopy(fields()[1].schema(), other.Cycle);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Date)) {
        this.Date = data().deepCopy(fields()[2].schema(), other.Date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Priority)) {
        this.Priority = data().deepCopy(fields()[3].schema(), other.Priority);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'Time' field.
      * @return The value.
      */
    public java.lang.Long getTime() {
      return Time;
    }

    /**
      * Sets the value of the 'Time' field.
      * @param value The value of 'Time'.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder setTime(long value) {
      validate(fields()[0], value);
      this.Time = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Time' field has been set.
      * @return True if the 'Time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Time' field.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Cycle' field.
      * @return The value.
      */
    public java.lang.CharSequence getCycle() {
      return Cycle;
    }

    /**
      * Sets the value of the 'Cycle' field.
      * @param value The value of 'Cycle'.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder setCycle(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Cycle = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Cycle' field has been set.
      * @return True if the 'Cycle' field has been set, false otherwise.
      */
    public boolean hasCycle() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Cycle' field.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder clearCycle() {
      Cycle = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return Date;
    }

    /**
      * Sets the value of the 'Date' field.
      * @param value The value of 'Date'.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.Date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Date' field has been set.
      * @return True if the 'Date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Date' field.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder clearDate() {
      Date = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Priority' field.
      * @return The value.
      */
    public java.lang.CharSequence getPriority() {
      return Priority;
    }

    /**
      * Sets the value of the 'Priority' field.
      * @param value The value of 'Priority'.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder setPriority(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Priority = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Priority' field has been set.
      * @return True if the 'Priority' field has been set, false otherwise.
      */
    public boolean hasPriority() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Priority' field.
      * @return This builder.
      */
    public com.mastercard.fcspr.types.Settlement.Settlement.Builder clearPriority() {
      Priority = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Settlement build() {
      try {
        Settlement record = new Settlement();
        record.Time = fieldSetFlags()[0] ? this.Time : (java.lang.Long) defaultValue(fields()[0]);
        record.Cycle = fieldSetFlags()[1] ? this.Cycle : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Date = fieldSetFlags()[2] ? this.Date : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Priority = fieldSetFlags()[3] ? this.Priority : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
