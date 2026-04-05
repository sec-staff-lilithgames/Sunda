package com.explorestack.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class l implements la {
    public static l newInstance(ByteBuffer byteBuffer, boolean z10) {
        if (byteBuffer.hasArray()) {
            return new k(byteBuffer, z10);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int getFieldNumber() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int getTag();

    public abstract int getTotalBytesRead();

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ boolean readBool() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readBoolList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ ByteString readBytes() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readBytesList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ double readDouble() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readDoubleList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readEnum() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readEnumList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readFixed32() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readFixed32List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ long readFixed64() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readFixed64List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ float readFloat() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readFloatList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    @Deprecated
    public abstract /* synthetic */ Object readGroup(Class cls, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    @Deprecated
    public abstract /* synthetic */ Object readGroupBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, ua uaVar, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    @Deprecated
    public abstract /* synthetic */ void readGroupList(List list, Class cls, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readInt32() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readInt32List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ long readInt64() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readInt64List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readMap(Map map, t8 t8Var, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ Object readMessage(Class cls, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ Object readMessageBySchemaWithCheck(ua uaVar, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readMessageList(List list, ua uaVar, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readMessageList(List list, Class cls, m5 m5Var) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readSFixed32() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readSFixed32List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ long readSFixed64() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readSFixed64List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readSInt32() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readSInt32List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ long readSInt64() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readSInt64List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ String readString() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readStringList(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readStringListRequireUtf8(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ String readStringRequireUtf8() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ int readUInt32() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readUInt32List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ long readUInt64() throws IOException;

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ void readUInt64List(List list) throws IOException;

    @Override // com.explorestack.protobuf.la
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    @Override // com.explorestack.protobuf.la
    public abstract /* synthetic */ boolean skipField() throws IOException;
}
