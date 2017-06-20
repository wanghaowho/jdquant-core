/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.jd.quant.core.domain.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-06-15")
public class TInformer implements org.apache.thrift.TBase<TInformer, TInformer._Fields>, java.io.Serializable, Cloneable, Comparable<TInformer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInformer");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LOG_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("log_list", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PLOT_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("plot_map", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TInformerStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TInformerTupleSchemeFactory();

  public String date; // optional
  public java.util.List<TLogOutput> log_list; // optional
  public java.util.Map<String,Double> plot_map; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    LOG_LIST((short)2, "log_list"),
    PLOT_MAP((short)3, "plot_map");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATE
          return DATE;
        case 2: // LOG_LIST
          return LOG_LIST;
        case 3: // PLOT_MAP
          return PLOT_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.DATE,_Fields.LOG_LIST,_Fields.PLOT_MAP};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOG_LIST, new org.apache.thrift.meta_data.FieldMetaData("log_list", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TLogOutput.class))));
    tmpMap.put(_Fields.PLOT_MAP, new org.apache.thrift.meta_data.FieldMetaData("plot_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInformer.class, metaDataMap);
  }

  public TInformer() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInformer(TInformer other) {
    if (other.isSetDate()) {
      this.date = other.date;
    }
    if (other.isSetLog_list()) {
      java.util.List<TLogOutput> __this__log_list = new java.util.ArrayList<TLogOutput>(other.log_list.size());
      for (TLogOutput other_element : other.log_list) {
        __this__log_list.add(new TLogOutput(other_element));
      }
      this.log_list = __this__log_list;
    }
    if (other.isSetPlot_map()) {
      java.util.Map<String,Double> __this__plot_map = new java.util.HashMap<String,Double>(other.plot_map);
      this.plot_map = __this__plot_map;
    }
  }

  public TInformer deepCopy() {
    return new TInformer(this);
  }

  @Override
  public void clear() {
    this.date = null;
    this.log_list = null;
    this.plot_map = null;
  }

  public String getDate() {
    return this.date;
  }

  public TInformer setDate(String date) {
    this.date = date;
    return this;
  }

  public void unsetDate() {
    this.date = null;
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return this.date != null;
  }

  public void setDateIsSet(boolean value) {
    if (!value) {
      this.date = null;
    }
  }

  public int getLog_listSize() {
    return (this.log_list == null) ? 0 : this.log_list.size();
  }

  public java.util.Iterator<TLogOutput> getLog_listIterator() {
    return (this.log_list == null) ? null : this.log_list.iterator();
  }

  public void addToLog_list(TLogOutput elem) {
    if (this.log_list == null) {
      this.log_list = new java.util.ArrayList<TLogOutput>();
    }
    this.log_list.add(elem);
  }

  public java.util.List<TLogOutput> getLog_list() {
    return this.log_list;
  }

  public TInformer setLog_list(java.util.List<TLogOutput> log_list) {
    this.log_list = log_list;
    return this;
  }

  public void unsetLog_list() {
    this.log_list = null;
  }

  /** Returns true if field log_list is set (has been assigned a value) and false otherwise */
  public boolean isSetLog_list() {
    return this.log_list != null;
  }

  public void setLog_listIsSet(boolean value) {
    if (!value) {
      this.log_list = null;
    }
  }

  public int getPlot_mapSize() {
    return (this.plot_map == null) ? 0 : this.plot_map.size();
  }

  public void putToPlot_map(String key, double val) {
    if (this.plot_map == null) {
      this.plot_map = new java.util.HashMap<String,Double>();
    }
    this.plot_map.put(key, val);
  }

  public java.util.Map<String,Double> getPlot_map() {
    return this.plot_map;
  }

  public TInformer setPlot_map(java.util.Map<String,Double> plot_map) {
    this.plot_map = plot_map;
    return this;
  }

  public void unsetPlot_map() {
    this.plot_map = null;
  }

  /** Returns true if field plot_map is set (has been assigned a value) and false otherwise */
  public boolean isSetPlot_map() {
    return this.plot_map != null;
  }

  public void setPlot_mapIsSet(boolean value) {
    if (!value) {
      this.plot_map = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((String)value);
      }
      break;

    case LOG_LIST:
      if (value == null) {
        unsetLog_list();
      } else {
        setLog_list((java.util.List<TLogOutput>)value);
      }
      break;

    case PLOT_MAP:
      if (value == null) {
        unsetPlot_map();
      } else {
        setPlot_map((java.util.Map<String,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return getDate();

    case LOG_LIST:
      return getLog_list();

    case PLOT_MAP:
      return getPlot_map();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATE:
      return isSetDate();
    case LOG_LIST:
      return isSetLog_list();
    case PLOT_MAP:
      return isSetPlot_map();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInformer)
      return this.equals((TInformer)that);
    return false;
  }

  public boolean equals(TInformer that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_date = true && this.isSetDate();
    boolean that_present_date = true && that.isSetDate();
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (!this.date.equals(that.date))
        return false;
    }

    boolean this_present_log_list = true && this.isSetLog_list();
    boolean that_present_log_list = true && that.isSetLog_list();
    if (this_present_log_list || that_present_log_list) {
      if (!(this_present_log_list && that_present_log_list))
        return false;
      if (!this.log_list.equals(that.log_list))
        return false;
    }

    boolean this_present_plot_map = true && this.isSetPlot_map();
    boolean that_present_plot_map = true && that.isSetPlot_map();
    if (this_present_plot_map || that_present_plot_map) {
      if (!(this_present_plot_map && that_present_plot_map))
        return false;
      if (!this.plot_map.equals(that.plot_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDate()) ? 131071 : 524287);
    if (isSetDate())
      hashCode = hashCode * 8191 + date.hashCode();

    hashCode = hashCode * 8191 + ((isSetLog_list()) ? 131071 : 524287);
    if (isSetLog_list())
      hashCode = hashCode * 8191 + log_list.hashCode();

    hashCode = hashCode * 8191 + ((isSetPlot_map()) ? 131071 : 524287);
    if (isSetPlot_map())
      hashCode = hashCode * 8191 + plot_map.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TInformer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLog_list()).compareTo(other.isSetLog_list());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLog_list()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.log_list, other.log_list);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlot_map()).compareTo(other.isSetPlot_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlot_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plot_map, other.plot_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TInformer(");
    boolean first = true;

    if (isSetDate()) {
      sb.append("date:");
      if (this.date == null) {
        sb.append("null");
      } else {
        sb.append(this.date);
      }
      first = false;
    }
    if (isSetLog_list()) {
      if (!first) sb.append(", ");
      sb.append("log_list:");
      if (this.log_list == null) {
        sb.append("null");
      } else {
        sb.append(this.log_list);
      }
      first = false;
    }
    if (isSetPlot_map()) {
      if (!first) sb.append(", ");
      sb.append("plot_map:");
      if (this.plot_map == null) {
        sb.append("null");
      } else {
        sb.append(this.plot_map);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TInformerStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TInformerStandardScheme getScheme() {
      return new TInformerStandardScheme();
    }
  }

  private static class TInformerStandardScheme extends org.apache.thrift.scheme.StandardScheme<TInformer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInformer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.date = iprot.readString();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOG_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.log_list = new java.util.ArrayList<TLogOutput>(_list0.size);
                TLogOutput _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TLogOutput();
                  _elem1.read(iprot);
                  struct.log_list.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLog_listIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PLOT_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map3 = iprot.readMapBegin();
                struct.plot_map = new java.util.HashMap<String,Double>(2*_map3.size);
                String _key4;
                double _val5;
                for (int _i6 = 0; _i6 < _map3.size; ++_i6)
                {
                  _key4 = iprot.readString();
                  _val5 = iprot.readDouble();
                  struct.plot_map.put(_key4, _val5);
                }
                iprot.readMapEnd();
              }
              struct.setPlot_mapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInformer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.date != null) {
        if (struct.isSetDate()) {
          oprot.writeFieldBegin(DATE_FIELD_DESC);
          oprot.writeString(struct.date);
          oprot.writeFieldEnd();
        }
      }
      if (struct.log_list != null) {
        if (struct.isSetLog_list()) {
          oprot.writeFieldBegin(LOG_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.log_list.size()));
            for (TLogOutput _iter7 : struct.log_list)
            {
              _iter7.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.plot_map != null) {
        if (struct.isSetPlot_map()) {
          oprot.writeFieldBegin(PLOT_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, struct.plot_map.size()));
            for (java.util.Map.Entry<String, Double> _iter8 : struct.plot_map.entrySet())
            {
              oprot.writeString(_iter8.getKey());
              oprot.writeDouble(_iter8.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInformerTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TInformerTupleScheme getScheme() {
      return new TInformerTupleScheme();
    }
  }

  private static class TInformerTupleScheme extends org.apache.thrift.scheme.TupleScheme<TInformer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInformer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetLog_list()) {
        optionals.set(1);
      }
      if (struct.isSetPlot_map()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDate()) {
        oprot.writeString(struct.date);
      }
      if (struct.isSetLog_list()) {
        {
          oprot.writeI32(struct.log_list.size());
          for (TLogOutput _iter9 : struct.log_list)
          {
            _iter9.write(oprot);
          }
        }
      }
      if (struct.isSetPlot_map()) {
        {
          oprot.writeI32(struct.plot_map.size());
          for (java.util.Map.Entry<String, Double> _iter10 : struct.plot_map.entrySet())
          {
            oprot.writeString(_iter10.getKey());
            oprot.writeDouble(_iter10.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInformer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.date = iprot.readString();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list11 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.log_list = new java.util.ArrayList<TLogOutput>(_list11.size);
          TLogOutput _elem12;
          for (int _i13 = 0; _i13 < _list11.size; ++_i13)
          {
            _elem12 = new TLogOutput();
            _elem12.read(iprot);
            struct.log_list.add(_elem12);
          }
        }
        struct.setLog_listIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map14 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.plot_map = new java.util.HashMap<String,Double>(2*_map14.size);
          String _key15;
          double _val16;
          for (int _i17 = 0; _i17 < _map14.size; ++_i17)
          {
            _key15 = iprot.readString();
            _val16 = iprot.readDouble();
            struct.plot_map.put(_key15, _val16);
          }
        }
        struct.setPlot_mapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
