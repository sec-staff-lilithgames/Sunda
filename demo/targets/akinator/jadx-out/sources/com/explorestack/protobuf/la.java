package com.explorestack.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface la {
    int getFieldNumber() throws IOException;

    int getTag();

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> list) throws IOException;

    ByteString readBytes() throws IOException;

    void readBytesList(List<ByteString> list) throws IOException;

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
    <T> T readGroup(Class<T> cls, m5 m5Var) throws IOException;

    @Deprecated
    <T> T readGroupBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, ua uaVar, m5 m5Var) throws IOException;

    @Deprecated
    <T> void readGroupList(List<T> list, Class<T> cls, m5 m5Var) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> list) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> list) throws IOException;

    <K, V> void readMap(Map<K, V> map, t8 t8Var, m5 m5Var) throws IOException;

    <T> T readMessage(Class<T> cls, m5 m5Var) throws IOException;

    <T> T readMessageBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException;

    <T> void readMessageList(List<T> list, ua uaVar, m5 m5Var) throws IOException;

    <T> void readMessageList(List<T> list, Class<T> cls, m5 m5Var) throws IOException;

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
