package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 extends k7 implements w0 {

    /* renamed from: h, reason: collision with root package name */
    public static final v0 f22743h = new v0();

    /* renamed from: i, reason: collision with root package name */
    public static final t0 f22744i = new t0();

    /* renamed from: b, reason: collision with root package name */
    public int f22745b;

    /* renamed from: c, reason: collision with root package name */
    public int f22746c;

    /* renamed from: e, reason: collision with root package name */
    public int f22747e;

    /* renamed from: f, reason: collision with root package name */
    public z1 f22748f;

    /* renamed from: g, reason: collision with root package name */
    public byte f22749g = -1;

    public static v0 getDefaultInstance() {
        return f22743h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22838e;
    }

    public static u0 newBuilder() {
        return f22743h.toBuilder();
    }

    public static v0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v0) k7.parseDelimitedWithIOException(f22744i, inputStream);
    }

    public static v0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22744i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return super.equals(obj);
        }
        v0 v0Var = (v0) obj;
        if (hasStart() != v0Var.hasStart()) {
            return false;
        }
        if ((hasStart() && getStart() != v0Var.getStart()) || hasEnd() != v0Var.hasEnd()) {
            return false;
        }
        if ((!hasEnd() || getEnd() == v0Var.getEnd()) && hasOptions() == v0Var.hasOptions()) {
            return (!hasOptions() || getOptions().equals(v0Var.getOptions())) && this.unknownFields.equals(v0Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.w0
    public int getEnd() {
        return this.f22747e;
    }

    @Override // com.explorestack.protobuf.w0
    public z1 getOptions() {
        z1 z1Var = this.f22748f;
        return z1Var == null ? z1.getDefaultInstance() : z1Var;
    }

    @Override // com.explorestack.protobuf.w0
    public a2 getOptionsOrBuilder() {
        z1 z1Var = this.f22748f;
        return z1Var == null ? z1.getDefaultInstance() : z1Var;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22744i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeInt32Size = (this.f22745b & 1) != 0 ? h0.computeInt32Size(1, this.f22746c) : 0;
        if ((this.f22745b & 2) != 0) {
            iComputeInt32Size += h0.computeInt32Size(2, this.f22747e);
        }
        if ((this.f22745b & 4) != 0) {
            iComputeInt32Size += h0.computeMessageSize(3, getOptions());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.w0
    public int getStart() {
        return this.f22746c;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasEnd() {
        return (this.f22745b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasOptions() {
        return (this.f22745b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.w0
    public boolean hasStart() {
        return (this.f22745b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasStart()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getStart();
        }
        if (hasEnd()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getEnd();
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
        return x4.f22839f.ensureFieldAccessorsInitialized(v0.class, u0.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22749g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22749g = (byte) 1;
            return true;
        }
        this.f22749g = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new v0();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22745b & 1) != 0) {
            h0Var.writeInt32(1, this.f22746c);
        }
        if ((this.f22745b & 2) != 0) {
            h0Var.writeInt32(2, this.f22747e);
        }
        if ((this.f22745b & 4) != 0) {
            h0Var.writeMessage(3, getOptions());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static u0 newBuilder(v0 v0Var) {
        return f22743h.toBuilder().mergeFrom(v0Var);
    }

    public static v0 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(byteBuffer, m5Var);
    }

    public static v0 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v0) k7.parseDelimitedWithIOException(f22744i, inputStream, m5Var);
    }

    public static v0 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v0 getDefaultInstanceForType() {
        return f22743h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public u0 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public u0 toBuilder() {
        if (this == f22743h) {
            return new u0();
        }
        return new u0().mergeFrom(this);
    }

    public static v0 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        u0 u0Var = new u0(p6Var);
        if (k7.alwaysUseFieldBuilders && u0Var.f22690g == null) {
            u0Var.f22690g = new xa(u0Var.getOptions(), u0Var.getParentForChildren(), u0Var.isClean());
            u0Var.f22689f = null;
        }
        return u0Var;
    }

    public static v0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(bArr);
    }

    public static v0 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (v0) f22744i.parseFrom(bArr, m5Var);
    }

    public static v0 parseFrom(InputStream inputStream) throws IOException {
        return (v0) k7.parseWithIOException(f22744i, inputStream);
    }

    public static v0 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v0) k7.parseWithIOException(f22744i, inputStream, m5Var);
    }

    public static v0 parseFrom(y yVar) throws IOException {
        return (v0) k7.parseWithIOException(f22744i, yVar);
    }

    public static v0 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (v0) k7.parseWithIOException(f22744i, yVar, m5Var);
    }
}
