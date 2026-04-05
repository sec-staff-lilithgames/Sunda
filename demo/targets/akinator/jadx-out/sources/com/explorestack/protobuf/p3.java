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
public final class p3 extends s6 implements q3 {

    /* renamed from: i, reason: collision with root package name */
    public static final p3 f22481i = new p3();

    /* renamed from: j, reason: collision with root package name */
    public static final m3 f22482j = new m3();

    /* renamed from: c, reason: collision with root package name */
    public int f22483c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22484e;

    /* renamed from: h, reason: collision with root package name */
    public byte f22487h = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f22485f = 0;

    /* renamed from: g, reason: collision with root package name */
    public List f22486g = Collections.EMPTY_LIST;

    public static p3 getDefaultInstance() {
        return f22481i;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.M;
    }

    public static n3 newBuilder() {
        return f22481i.toBuilder();
    }

    public static p3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (p3) k7.parseDelimitedWithIOException(f22482j, inputStream);
    }

    public static p3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22482j;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return super.equals(obj);
        }
        p3 p3Var = (p3) obj;
        if (hasDeprecated() != p3Var.hasDeprecated()) {
            return false;
        }
        if ((!hasDeprecated() || getDeprecated() == p3Var.getDeprecated()) && hasIdempotencyLevel() == p3Var.hasIdempotencyLevel()) {
            return (!hasIdempotencyLevel() || this.f22485f == p3Var.f22485f) && getUninterpretedOptionList().equals(p3Var.getUninterpretedOptionList()) && this.unknownFields.equals(p3Var.unknownFields) && this.f22625b.getAllFields().equals(p3Var.f22625b.getAllFields());
        }
        return false;
    }

    @Override // com.explorestack.protobuf.q3
    public boolean getDeprecated() {
        return this.f22484e;
    }

    @Override // com.explorestack.protobuf.q3
    public DescriptorProtos$MethodOptions$IdempotencyLevel getIdempotencyLevel() {
        DescriptorProtos$MethodOptions$IdempotencyLevel descriptorProtos$MethodOptions$IdempotencyLevelValueOf = DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(this.f22485f);
        return descriptorProtos$MethodOptions$IdempotencyLevelValueOf == null ? DescriptorProtos$MethodOptions$IdempotencyLevel.IDEMPOTENCY_UNKNOWN : descriptorProtos$MethodOptions$IdempotencyLevelValueOf;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22482j;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeBoolSize = (this.f22483c & 1) != 0 ? h0.computeBoolSize(33, this.f22484e) : 0;
        if ((this.f22483c & 2) != 0) {
            iComputeBoolSize += h0.computeEnumSize(34, this.f22485f);
        }
        for (int i11 = 0; i11 < this.f22486g.size(); i11++) {
            iComputeBoolSize += h0.computeMessageSize(999, (MessageLite) this.f22486g.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.q3
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22486g.get(i10);
    }

    @Override // com.explorestack.protobuf.q3
    public int getUninterpretedOptionCount() {
        return this.f22486g.size();
    }

    @Override // com.explorestack.protobuf.q3
    public List<v4> getUninterpretedOptionList() {
        return this.f22486g;
    }

    @Override // com.explorestack.protobuf.q3
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22486g.get(i10);
    }

    @Override // com.explorestack.protobuf.q3
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22486g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.q3
    public boolean hasDeprecated() {
        return (this.f22483c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.q3
    public boolean hasIdempotencyLevel() {
        return (this.f22483c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 33, 53) + x7.hashBoolean(getDeprecated());
        }
        if (hasIdempotencyLevel()) {
            iHashCode = p0.o2.B(iHashCode, 37, 34, 53) + this.f22485f;
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
        return x4.N.ensureFieldAccessorsInitialized(p3.class, n3.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22487h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22487h = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22487h = (byte) 1;
            return true;
        }
        this.f22487h = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new p3();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22483c & 1) != 0) {
            h0Var.writeBool(33, this.f22484e);
        }
        if ((this.f22483c & 2) != 0) {
            h0Var.writeEnum(34, this.f22485f);
        }
        for (int i10 = 0; i10 < this.f22486g.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22486g.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static n3 newBuilder(p3 p3Var) {
        return f22481i.toBuilder().mergeFrom(p3Var);
    }

    public static p3 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(byteBuffer, m5Var);
    }

    public static p3 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (p3) k7.parseDelimitedWithIOException(f22482j, inputStream, m5Var);
    }

    public static p3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public p3 getDefaultInstanceForType() {
        return f22481i;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public n3 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public n3 toBuilder() {
        if (this == f22481i) {
            return new n3();
        }
        return new n3().mergeFrom(this);
    }

    public static p3 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        n3 n3Var = new n3(p6Var);
        n3Var.f22396f = 0;
        n3Var.f22397g = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            n3Var.j();
        }
        return n3Var;
    }

    public static p3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(bArr);
    }

    public static p3 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (p3) f22482j.parseFrom(bArr, m5Var);
    }

    public static p3 parseFrom(InputStream inputStream) throws IOException {
        return (p3) k7.parseWithIOException(f22482j, inputStream);
    }

    public static p3 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (p3) k7.parseWithIOException(f22482j, inputStream, m5Var);
    }

    public static p3 parseFrom(y yVar) throws IOException {
        return (p3) k7.parseWithIOException(f22482j, yVar);
    }

    public static p3 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (p3) k7.parseWithIOException(f22482j, yVar, m5Var);
    }
}
