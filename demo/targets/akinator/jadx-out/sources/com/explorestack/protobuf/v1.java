package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v1 extends s6 implements w1 {

    /* renamed from: h, reason: collision with root package name */
    public static final v1 f22750h = new v1();

    /* renamed from: i, reason: collision with root package name */
    public static final t1 f22751i = new t1();

    /* renamed from: c, reason: collision with root package name */
    public int f22752c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22753e;

    /* renamed from: g, reason: collision with root package name */
    public byte f22755g = -1;

    /* renamed from: f, reason: collision with root package name */
    public List f22754f = Collections.EMPTY_LIST;

    public static v1 getDefaultInstance() {
        return f22750h;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.I;
    }

    public static u1 newBuilder() {
        return f22750h.toBuilder();
    }

    public static v1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v1) k7.parseDelimitedWithIOException(f22751i, inputStream);
    }

    public static v1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22751i;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return super.equals(obj);
        }
        v1 v1Var = (v1) obj;
        if (hasDeprecated() != v1Var.hasDeprecated()) {
            return false;
        }
        return (!hasDeprecated() || getDeprecated() == v1Var.getDeprecated()) && getUninterpretedOptionList().equals(v1Var.getUninterpretedOptionList()) && this.unknownFields.equals(v1Var.unknownFields) && this.f22625b.getAllFields().equals(v1Var.f22625b.getAllFields());
    }

    @Override // com.explorestack.protobuf.w1
    public boolean getDeprecated() {
        return this.f22753e;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22751i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeBoolSize = (this.f22752c & 1) != 0 ? h0.computeBoolSize(1, this.f22753e) : 0;
        for (int i11 = 0; i11 < this.f22754f.size(); i11++) {
            iComputeBoolSize += h0.computeMessageSize(999, (MessageLite) this.f22754f.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.w1
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22754f.get(i10);
    }

    @Override // com.explorestack.protobuf.w1
    public int getUninterpretedOptionCount() {
        return this.f22754f.size();
    }

    @Override // com.explorestack.protobuf.w1
    public List<v4> getUninterpretedOptionList() {
        return this.f22754f;
    }

    @Override // com.explorestack.protobuf.w1
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22754f.get(i10);
    }

    @Override // com.explorestack.protobuf.w1
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22754f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.w1
    public boolean hasDeprecated() {
        return (this.f22752c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + x7.hashBoolean(getDeprecated());
        }
        if (getUninterpretedOptionCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 999, 53) + getUninterpretedOptionList().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (AbstractMessage.hashFields(iHashCode, this.f22625b.getAllFields()) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.J.ensureFieldAccessorsInitialized(v1.class, u1.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22755g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22755g = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22755g = (byte) 1;
            return true;
        }
        this.f22755g = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new v1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22752c & 1) != 0) {
            h0Var.writeBool(1, this.f22753e);
        }
        for (int i10 = 0; i10 < this.f22754f.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22754f.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static u1 newBuilder(v1 v1Var) {
        return f22750h.toBuilder().mergeFrom(v1Var);
    }

    public static v1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(byteBuffer, m5Var);
    }

    public static v1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v1) k7.parseDelimitedWithIOException(f22751i, inputStream, m5Var);
    }

    public static v1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v1 getDefaultInstanceForType() {
        return f22750h;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public u1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public u1 toBuilder() {
        if (this == f22750h) {
            return new u1();
        }
        return new u1().mergeFrom(this);
    }

    public static v1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        u1 u1Var = new u1(p6Var);
        u1Var.f22693f = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            u1Var.j();
        }
        return u1Var;
    }

    public static v1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(bArr);
    }

    public static v1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (v1) f22751i.parseFrom(bArr, m5Var);
    }

    public static v1 parseFrom(InputStream inputStream) throws IOException {
        return (v1) k7.parseWithIOException(f22751i, inputStream);
    }

    public static v1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v1) k7.parseWithIOException(f22751i, inputStream, m5Var);
    }

    public static v1 parseFrom(y yVar) throws IOException {
        return (v1) k7.parseWithIOException(f22751i, yVar);
    }

    public static v1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (v1) k7.parseWithIOException(f22751i, yVar, m5Var);
    }
}
