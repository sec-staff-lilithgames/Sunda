package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t3 extends k7 implements u3 {

    /* renamed from: g, reason: collision with root package name */
    public static final t3 f22649g = new t3();

    /* renamed from: h, reason: collision with root package name */
    public static final r3 f22650h = new r3();

    /* renamed from: b, reason: collision with root package name */
    public int f22651b;

    /* renamed from: e, reason: collision with root package name */
    public x3 f22653e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22654f = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22652c = "";

    public static t3 getDefaultInstance() {
        return f22649g;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22846m;
    }

    public static s3 newBuilder() {
        return f22649g.toBuilder();
    }

    public static t3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (t3) k7.parseDelimitedWithIOException(f22650h, inputStream);
    }

    public static t3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22650h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return super.equals(obj);
        }
        t3 t3Var = (t3) obj;
        if (hasName() != t3Var.hasName()) {
            return false;
        }
        if ((!hasName() || getName().equals(t3Var.getName())) && hasOptions() == t3Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(t3Var.getOptions())) && this.unknownFields.equals(t3Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.u3
    public String getName() {
        Serializable serializable = this.f22652c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22652c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.u3
    public ByteString getNameBytes() {
        Serializable serializable = this.f22652c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22652c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.u3
    public x3 getOptions() {
        x3 x3Var = this.f22653e;
        return x3Var == null ? x3.getDefaultInstance() : x3Var;
    }

    @Override // com.explorestack.protobuf.u3
    public y3 getOptionsOrBuilder() {
        x3 x3Var = this.f22653e;
        return x3Var == null ? x3.getDefaultInstance() : x3Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22650h;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22651b & 1) != 0 ? k7.computeStringSize(1, this.f22652c) : 0;
        if ((this.f22651b & 2) != 0) {
            iComputeStringSize += h0.computeMessageSize(2, getOptions());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.u3
    public boolean hasName() {
        return (this.f22651b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.u3
    public boolean hasOptions() {
        return (this.f22651b & 2) != 0;
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
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getOptions().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22847n.ensureFieldAccessorsInitialized(t3.class, s3.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22654f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22654f = (byte) 1;
            return true;
        }
        this.f22654f = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new t3();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22651b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22652c);
        }
        if ((this.f22651b & 2) != 0) {
            h0Var.writeMessage(2, getOptions());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static s3 newBuilder(t3 t3Var) {
        return f22649g.toBuilder().mergeFrom(t3Var);
    }

    public static t3 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(byteBuffer, m5Var);
    }

    public static t3 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (t3) k7.parseDelimitedWithIOException(f22650h, inputStream, m5Var);
    }

    public static t3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public t3 getDefaultInstanceForType() {
        return f22649g;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s3 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s3 toBuilder() {
        if (this == f22649g) {
            return new s3();
        }
        return new s3().mergeFrom(this);
    }

    public static t3 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        s3 s3Var = new s3(p6Var);
        s3Var.f22607c = "";
        if (k7.alwaysUseFieldBuilders && s3Var.f22609f == null) {
            s3Var.f22609f = new xa(s3Var.getOptions(), s3Var.getParentForChildren(), s3Var.isClean());
            s3Var.f22608e = null;
        }
        return s3Var;
    }

    public static t3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(bArr);
    }

    public static t3 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (t3) f22650h.parseFrom(bArr, m5Var);
    }

    public static t3 parseFrom(InputStream inputStream) throws IOException {
        return (t3) k7.parseWithIOException(f22650h, inputStream);
    }

    public static t3 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (t3) k7.parseWithIOException(f22650h, inputStream, m5Var);
    }

    public static t3 parseFrom(y yVar) throws IOException {
        return (t3) k7.parseWithIOException(f22650h, yVar);
    }

    public static t3 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (t3) k7.parseWithIOException(f22650h, yVar, m5Var);
    }
}
