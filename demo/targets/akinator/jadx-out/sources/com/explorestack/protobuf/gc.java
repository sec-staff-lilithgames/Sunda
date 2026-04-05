package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gc implements MessageLite {

    /* renamed from: e, reason: collision with root package name */
    public static final gc f22174e;

    /* renamed from: f, reason: collision with root package name */
    public static final fc f22175f;

    /* renamed from: b, reason: collision with root package name */
    public final Map f22176b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f22177c;

    static {
        Map map = Collections.EMPTY_MAP;
        f22174e = new gc(map, map);
        f22175f = new fc();
    }

    public gc(Map map, Map map2) {
        this.f22176b = map;
        this.f22177c = map2;
    }

    public static gc getDefaultInstance() {
        return f22174e;
    }

    public static cc newBuilder(gc gcVar) {
        return newBuilder().mergeFrom(gcVar);
    }

    public static gc parseFrom(y yVar) throws IOException {
        return newBuilder().mergeFrom(yVar).build();
    }

    public final void a(i0 i0Var) {
        if (i0Var.fieldOrder() == jd.f22281c) {
            for (Map.Entry entry : this.f22177c.entrySet()) {
                ((ec) entry.getValue()).b(((Integer) entry.getKey()).intValue(), i0Var);
            }
            return;
        }
        for (Map.Entry entry2 : this.f22176b.entrySet()) {
            ((ec) entry2.getValue()).b(((Integer) entry2.getKey()).intValue(), i0Var);
        }
    }

    public Map<Integer, ec> asMap() {
        return this.f22176b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gc) {
            return this.f22176b.equals(((gc) obj).f22176b);
        }
        return false;
    }

    public ec getField(int i10) {
        ec ecVar = (ec) this.f22176b.get(Integer.valueOf(i10));
        return ecVar == null ? ec.getDefaultInstance() : ecVar;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int serializedSize = 0;
        for (Map.Entry entry : this.f22176b.entrySet()) {
            serializedSize += ((ec) entry.getValue()).getSerializedSize(((Integer) entry.getKey()).intValue());
        }
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int serializedSizeAsMessageSetExtension = 0;
        for (Map.Entry entry : this.f22176b.entrySet()) {
            serializedSizeAsMessageSetExtension += ((ec) entry.getValue()).getSerializedSizeAsMessageSetExtension(((Integer) entry.getKey()).intValue());
        }
        return serializedSizeAsMessageSetExtension;
    }

    public boolean hasField(int i10) {
        return this.f22176b.containsKey(Integer.valueOf(i10));
    }

    public int hashCode() {
        return this.f22176b.hashCode();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return true;
    }

    @Override // com.explorestack.protobuf.MessageLite
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            h0 h0VarNewInstance = h0.newInstance(bArr);
            writeTo(h0VarNewInstance);
            h0VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public ByteString toByteString() {
        try {
            ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            writeTo(codedBuilderNewCodedBuilder.getCodedOutput());
            return codedBuilderNewCodedBuilder.build();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public String toString() {
        return TextFormat.printer().printToString(this);
    }

    public void writeAsMessageSetTo(h0 h0Var) throws IOException {
        for (Map.Entry entry : this.f22176b.entrySet()) {
            ((ec) entry.getValue()).writeAsMessageSetExtensionTo(((Integer) entry.getKey()).intValue(), h0Var);
        }
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        h0 h0VarNewInstance = h0.newInstance(outputStream);
        h0VarNewInstance.writeRawVarint32(getSerializedSize());
        writeTo(h0VarNewInstance);
        h0VarNewInstance.flush();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (Map.Entry entry : this.f22176b.entrySet()) {
            ((ec) entry.getValue()).writeTo(((Integer) entry.getKey()).intValue(), h0Var);
        }
    }

    public static cc newBuilder() {
        cc ccVar = new cc();
        ccVar.f22036b = Collections.EMPTY_MAP;
        ccVar.f22037c = 0;
        ccVar.f22038e = null;
        return ccVar;
    }

    public static gc parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return newBuilder().mergeFrom(byteString).build();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public gc getDefaultInstanceForType() {
        return f22174e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final fc getParserForType() {
        return f22175f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public cc newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public cc toBuilder() {
        return newBuilder().mergeFrom(this);
    }

    public static gc parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return newBuilder().mergeFrom(bArr).build();
    }

    public static gc parseFrom(InputStream inputStream) throws IOException {
        return newBuilder().mergeFrom(inputStream).build();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(OutputStream outputStream) throws IOException {
        h0 h0VarNewInstance = h0.newInstance(outputStream);
        writeTo(h0VarNewInstance);
        h0VarNewInstance.flush();
    }
}
