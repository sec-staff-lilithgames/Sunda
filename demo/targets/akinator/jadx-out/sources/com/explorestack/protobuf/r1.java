package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r1 extends k7 implements s1 {

    /* renamed from: h, reason: collision with root package name */
    public static final r1 f22531h = new r1();

    /* renamed from: i, reason: collision with root package name */
    public static final p1 f22532i = new p1();

    /* renamed from: b, reason: collision with root package name */
    public int f22533b;

    /* renamed from: e, reason: collision with root package name */
    public int f22535e;

    /* renamed from: f, reason: collision with root package name */
    public v1 f22536f;

    /* renamed from: g, reason: collision with root package name */
    public byte f22537g = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22534c = "";

    public static r1 getDefaultInstance() {
        return f22531h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22852s;
    }

    public static q1 newBuilder() {
        return f22531h.toBuilder();
    }

    public static r1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (r1) k7.parseDelimitedWithIOException(f22532i, inputStream);
    }

    public static r1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22532i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return super.equals(obj);
        }
        r1 r1Var = (r1) obj;
        if (hasName() != r1Var.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(r1Var.getName())) || hasNumber() != r1Var.hasNumber()) {
            return false;
        }
        if ((!hasNumber() || getNumber() == r1Var.getNumber()) && hasOptions() == r1Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(r1Var.getOptions())) && this.unknownFields.equals(r1Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.s1
    public String getName() {
        Serializable serializable = this.f22534c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22534c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.s1
    public ByteString getNameBytes() {
        Serializable serializable = this.f22534c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22534c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.s1
    public int getNumber() {
        return this.f22535e;
    }

    @Override // com.explorestack.protobuf.s1
    public v1 getOptions() {
        v1 v1Var = this.f22536f;
        return v1Var == null ? v1.getDefaultInstance() : v1Var;
    }

    @Override // com.explorestack.protobuf.s1
    public w1 getOptionsOrBuilder() {
        v1 v1Var = this.f22536f;
        return v1Var == null ? v1.getDefaultInstance() : v1Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22532i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22533b & 1) != 0 ? k7.computeStringSize(1, this.f22534c) : 0;
        if ((this.f22533b & 2) != 0) {
            iComputeStringSize += h0.computeInt32Size(2, this.f22535e);
        }
        if ((this.f22533b & 4) != 0) {
            iComputeStringSize += h0.computeMessageSize(3, getOptions());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasName() {
        return (this.f22533b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasNumber() {
        return (this.f22533b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.s1
    public boolean hasOptions() {
        return (this.f22533b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasName()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getName().hashCode();
        }
        if (hasNumber()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getNumber();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getOptions().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22853t.ensureFieldAccessorsInitialized(r1.class, q1.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22537g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22537g = (byte) 1;
            return true;
        }
        this.f22537g = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new r1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22533b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22534c);
        }
        if ((this.f22533b & 2) != 0) {
            h0Var.writeInt32(2, this.f22535e);
        }
        if ((this.f22533b & 4) != 0) {
            h0Var.writeMessage(3, getOptions());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static q1 newBuilder(r1 r1Var) {
        return f22531h.toBuilder().mergeFrom(r1Var);
    }

    public static r1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(byteBuffer, m5Var);
    }

    public static r1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (r1) k7.parseDelimitedWithIOException(f22532i, inputStream, m5Var);
    }

    public static r1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public r1 getDefaultInstanceForType() {
        return f22531h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public q1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public q1 toBuilder() {
        if (this == f22531h) {
            return new q1();
        }
        return new q1().mergeFrom(this);
    }

    public static r1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        q1 q1Var = new q1(p6Var);
        q1Var.f22509c = "";
        if (k7.alwaysUseFieldBuilders && q1Var.f22512g == null) {
            q1Var.f22512g = new xa(q1Var.getOptions(), q1Var.getParentForChildren(), q1Var.isClean());
            q1Var.f22511f = null;
        }
        return q1Var;
    }

    public static r1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(bArr);
    }

    public static r1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (r1) f22532i.parseFrom(bArr, m5Var);
    }

    public static r1 parseFrom(InputStream inputStream) throws IOException {
        return (r1) k7.parseWithIOException(f22532i, inputStream);
    }

    public static r1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (r1) k7.parseWithIOException(f22532i, inputStream, m5Var);
    }

    public static r1 parseFrom(y yVar) throws IOException {
        return (r1) k7.parseWithIOException(f22532i, yVar);
    }

    public static r1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (r1) k7.parseWithIOException(f22532i, yVar, m5Var);
    }
}
