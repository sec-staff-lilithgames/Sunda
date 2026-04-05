package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface g3 {
    int getFieldNumber() throws IOException;

    int getTag();

    <T> void mergeGroupField(T t10, m3 m3Var, s0 s0Var) throws IOException;

    <T> void mergeMessageField(T t10, m3 m3Var, s0 s0Var) throws IOException;

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    x readBytes() throws IOException;

    void readBytesList(List<x> list) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> list) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> list) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> list) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> list) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> list) throws IOException;

    @Deprecated
    <T> T readGroup(Class<T> cls, s0 s0Var) throws IOException;

    @Deprecated
    <T> T readGroupBySchemaWithCheck(m3 m3Var, s0 s0Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, m3 m3Var, s0 s0Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    <K, V> void readMap(Map<K, V> map, i2 i2Var, s0 s0Var) throws IOException;

    <T> T readMessage(Class<T> cls, s0 s0Var) throws IOException;

    <T> T readMessageBySchemaWithCheck(m3 m3Var, s0 s0Var) throws IOException;

    <T> void readMessageList(List<T> list, m3 m3Var, s0 s0Var) throws IOException;

    <T> void readMessageList(List<T> list, Class<T> cls, s0 s0Var) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> list) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> list) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> list) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> list) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    void readStringListRequireUtf8(List<String> list) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> list) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> list) throws IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws IOException;
}
