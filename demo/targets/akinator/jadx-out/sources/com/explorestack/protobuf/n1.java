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
public final class n1 extends s6 implements o1 {

    /* renamed from: i, reason: collision with root package name */
    public static final n1 f22387i = new n1();

    /* renamed from: j, reason: collision with root package name */
    public static final l1 f22388j = new l1();

    /* renamed from: c, reason: collision with root package name */
    public int f22389c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22390e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22391f;

    /* renamed from: h, reason: collision with root package name */
    public byte f22393h = -1;

    /* renamed from: g, reason: collision with root package name */
    public List f22392g = Collections.EMPTY_LIST;

    public static n1 getDefaultInstance() {
        return f22387i;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.G;
    }

    public static m1 newBuilder() {
        return f22387i.toBuilder();
    }

    public static n1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (n1) k7.parseDelimitedWithIOException(f22388j, inputStream);
    }

    public static n1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22388j;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return super.equals(obj);
        }
        n1 n1Var = (n1) obj;
        if (hasAllowAlias() != n1Var.hasAllowAlias()) {
            return false;
        }
        if ((!hasAllowAlias() || getAllowAlias() == n1Var.getAllowAlias()) && hasDeprecated() == n1Var.hasDeprecated()) {
            return (!hasDeprecated() || getDeprecated() == n1Var.getDeprecated()) && getUninterpretedOptionList().equals(n1Var.getUninterpretedOptionList()) && this.unknownFields.equals(n1Var.unknownFields) && this.f22625b.getAllFields().equals(n1Var.f22625b.getAllFields());
        }
        return false;
    }

    @Override // com.explorestack.protobuf.o1
    public boolean getAllowAlias() {
        return this.f22390e;
    }

    @Override // com.explorestack.protobuf.o1
    public boolean getDeprecated() {
        return this.f22391f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22388j;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeBoolSize = (this.f22389c & 1) != 0 ? h0.computeBoolSize(2, this.f22390e) : 0;
        if ((2 & this.f22389c) != 0) {
            iComputeBoolSize += h0.computeBoolSize(3, this.f22391f);
        }
        for (int i11 = 0; i11 < this.f22392g.size(); i11++) {
            iComputeBoolSize += h0.computeMessageSize(999, (MessageLite) this.f22392g.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.o1
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22392g.get(i10);
    }

    @Override // com.explorestack.protobuf.o1
    public int getUninterpretedOptionCount() {
        return this.f22392g.size();
    }

    @Override // com.explorestack.protobuf.o1
    public List<v4> getUninterpretedOptionList() {
        return this.f22392g;
    }

    @Override // com.explorestack.protobuf.o1
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22392g.get(i10);
    }

    @Override // com.explorestack.protobuf.o1
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22392g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.o1
    public boolean hasAllowAlias() {
        return (this.f22389c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.o1
    public boolean hasDeprecated() {
        return (this.f22389c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasAllowAlias()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + x7.hashBoolean(getAllowAlias());
        }
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + x7.hashBoolean(getDeprecated());
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
        return x4.H.ensureFieldAccessorsInitialized(n1.class, m1.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22393h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22393h = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22393h = (byte) 1;
            return true;
        }
        this.f22393h = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new n1();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22389c & 1) != 0) {
            h0Var.writeBool(2, this.f22390e);
        }
        if ((this.f22389c & 2) != 0) {
            h0Var.writeBool(3, this.f22391f);
        }
        for (int i10 = 0; i10 < this.f22392g.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22392g.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static m1 newBuilder(n1 n1Var) {
        return f22387i.toBuilder().mergeFrom(n1Var);
    }

    public static n1 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(byteBuffer, m5Var);
    }

    public static n1 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (n1) k7.parseDelimitedWithIOException(f22388j, inputStream, m5Var);
    }

    public static n1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public n1 getDefaultInstanceForType() {
        return f22387i;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public m1 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public m1 toBuilder() {
        if (this == f22387i) {
            return new m1();
        }
        return new m1().mergeFrom(this);
    }

    public static n1 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        m1 m1Var = new m1(p6Var);
        m1Var.f22369g = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            m1Var.j();
        }
        return m1Var;
    }

    public static n1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(bArr);
    }

    public static n1 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (n1) f22388j.parseFrom(bArr, m5Var);
    }

    public static n1 parseFrom(InputStream inputStream) throws IOException {
        return (n1) k7.parseWithIOException(f22388j, inputStream);
    }

    public static n1 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (n1) k7.parseWithIOException(f22388j, inputStream, m5Var);
    }

    public static n1 parseFrom(y yVar) throws IOException {
        return (n1) k7.parseWithIOException(f22388j, yVar);
    }

    public static n1 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (n1) k7.parseWithIOException(f22388j, yVar, m5Var);
    }
}
