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
public final class l2 extends s6 implements m2 {

    /* renamed from: m, reason: collision with root package name */
    public static final l2 f22324m = new l2();

    /* renamed from: n, reason: collision with root package name */
    public static final h2 f22325n = new h2();

    /* renamed from: c, reason: collision with root package name */
    public int f22326c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22328f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22330h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22331i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22332j;

    /* renamed from: l, reason: collision with root package name */
    public byte f22334l = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f22327e = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f22329g = 0;

    /* renamed from: k, reason: collision with root package name */
    public List f22333k = Collections.EMPTY_LIST;

    public static l2 getDefaultInstance() {
        return f22324m;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.C;
    }

    public static i2 newBuilder() {
        return f22324m.toBuilder();
    }

    public static l2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (l2) k7.parseDelimitedWithIOException(f22325n, inputStream);
    }

    public static l2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22325n;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return super.equals(obj);
        }
        l2 l2Var = (l2) obj;
        if (hasCtype() != l2Var.hasCtype()) {
            return false;
        }
        if ((hasCtype() && this.f22327e != l2Var.f22327e) || hasPacked() != l2Var.hasPacked()) {
            return false;
        }
        if ((hasPacked() && getPacked() != l2Var.getPacked()) || hasJstype() != l2Var.hasJstype()) {
            return false;
        }
        if ((hasJstype() && this.f22329g != l2Var.f22329g) || hasLazy() != l2Var.hasLazy()) {
            return false;
        }
        if ((hasLazy() && getLazy() != l2Var.getLazy()) || hasDeprecated() != l2Var.hasDeprecated()) {
            return false;
        }
        if ((!hasDeprecated() || getDeprecated() == l2Var.getDeprecated()) && hasWeak() == l2Var.hasWeak()) {
            return (!hasWeak() || getWeak() == l2Var.getWeak()) && getUninterpretedOptionList().equals(l2Var.getUninterpretedOptionList()) && this.unknownFields.equals(l2Var.unknownFields) && this.f22625b.getAllFields().equals(l2Var.f22625b.getAllFields());
        }
        return false;
    }

    @Override // com.explorestack.protobuf.m2
    public DescriptorProtos$FieldOptions$CType getCtype() {
        DescriptorProtos$FieldOptions$CType descriptorProtos$FieldOptions$CTypeValueOf = DescriptorProtos$FieldOptions$CType.valueOf(this.f22327e);
        return descriptorProtos$FieldOptions$CTypeValueOf == null ? DescriptorProtos$FieldOptions$CType.STRING : descriptorProtos$FieldOptions$CTypeValueOf;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getDeprecated() {
        return this.f22331i;
    }

    @Override // com.explorestack.protobuf.m2
    public DescriptorProtos$FieldOptions$JSType getJstype() {
        DescriptorProtos$FieldOptions$JSType descriptorProtos$FieldOptions$JSTypeValueOf = DescriptorProtos$FieldOptions$JSType.valueOf(this.f22329g);
        return descriptorProtos$FieldOptions$JSTypeValueOf == null ? DescriptorProtos$FieldOptions$JSType.JS_NORMAL : descriptorProtos$FieldOptions$JSTypeValueOf;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getLazy() {
        return this.f22330h;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getPacked() {
        return this.f22328f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22325n;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeEnumSize = (this.f22326c & 1) != 0 ? h0.computeEnumSize(1, this.f22327e) : 0;
        if ((this.f22326c & 2) != 0) {
            iComputeEnumSize += h0.computeBoolSize(2, this.f22328f);
        }
        if ((this.f22326c & 16) != 0) {
            iComputeEnumSize += h0.computeBoolSize(3, this.f22331i);
        }
        if ((this.f22326c & 8) != 0) {
            iComputeEnumSize += h0.computeBoolSize(5, this.f22330h);
        }
        if ((this.f22326c & 4) != 0) {
            iComputeEnumSize += h0.computeEnumSize(6, this.f22329g);
        }
        if ((this.f22326c & 32) != 0) {
            iComputeEnumSize += h0.computeBoolSize(10, this.f22332j);
        }
        for (int i11 = 0; i11 < this.f22333k.size(); i11++) {
            iComputeEnumSize += h0.computeMessageSize(999, (MessageLite) this.f22333k.get(i11));
        }
        int serializedSize = this.unknownFields.getSerializedSize() + this.f22625b.getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.m2
    public v4 getUninterpretedOption(int i10) {
        return (v4) this.f22333k.get(i10);
    }

    @Override // com.explorestack.protobuf.m2
    public int getUninterpretedOptionCount() {
        return this.f22333k.size();
    }

    @Override // com.explorestack.protobuf.m2
    public List<v4> getUninterpretedOptionList() {
        return this.f22333k;
    }

    @Override // com.explorestack.protobuf.m2
    public w4 getUninterpretedOptionOrBuilder(int i10) {
        return (w4) this.f22333k.get(i10);
    }

    @Override // com.explorestack.protobuf.m2
    public List<? extends w4> getUninterpretedOptionOrBuilderList() {
        return this.f22333k;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean getWeak() {
        return this.f22332j;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasCtype() {
        return (this.f22326c & 1) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasDeprecated() {
        return (this.f22326c & 16) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasJstype() {
        return (this.f22326c & 4) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasLazy() {
        return (this.f22326c & 8) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasPacked() {
        return (this.f22326c & 2) != 0;
    }

    @Override // com.explorestack.protobuf.m2
    public boolean hasWeak() {
        return (this.f22326c & 32) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasCtype()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + this.f22327e;
        }
        if (hasPacked()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + x7.hashBoolean(getPacked());
        }
        if (hasJstype()) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + this.f22329g;
        }
        if (hasLazy()) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + x7.hashBoolean(getLazy());
        }
        if (hasDeprecated()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + x7.hashBoolean(getDeprecated());
        }
        if (hasWeak()) {
            iHashCode = p0.o2.B(iHashCode, 37, 10, 53) + x7.hashBoolean(getWeak());
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
        return x4.D.ensureFieldAccessorsInitialized(l2.class, i2.class);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22334l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getUninterpretedOptionCount(); i10++) {
            if (!getUninterpretedOption(i10).isInitialized()) {
                this.f22334l = (byte) 0;
                return false;
            }
        }
        if (this.f22625b.isInitialized()) {
            this.f22334l = (byte) 1;
            return true;
        }
        this.f22334l = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new l2();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        r6 r6Var = new r6(this);
        if ((this.f22326c & 1) != 0) {
            h0Var.writeEnum(1, this.f22327e);
        }
        if ((this.f22326c & 2) != 0) {
            h0Var.writeBool(2, this.f22328f);
        }
        if ((this.f22326c & 16) != 0) {
            h0Var.writeBool(3, this.f22331i);
        }
        if ((this.f22326c & 8) != 0) {
            h0Var.writeBool(5, this.f22330h);
        }
        if ((this.f22326c & 4) != 0) {
            h0Var.writeEnum(6, this.f22329g);
        }
        if ((this.f22326c & 32) != 0) {
            h0Var.writeBool(10, this.f22332j);
        }
        for (int i10 = 0; i10 < this.f22333k.size(); i10++) {
            h0Var.writeMessage(999, (MessageLite) this.f22333k.get(i10));
        }
        r6Var.writeUntil(536870912, h0Var);
        this.unknownFields.writeTo(h0Var);
    }

    public static i2 newBuilder(l2 l2Var) {
        return f22324m.toBuilder().mergeFrom(l2Var);
    }

    public static l2 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(byteBuffer, m5Var);
    }

    public static l2 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (l2) k7.parseDelimitedWithIOException(f22325n, inputStream, m5Var);
    }

    public static l2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.s6, com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public l2 getDefaultInstanceForType() {
        return f22324m;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public i2 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public i2 toBuilder() {
        if (this == f22324m) {
            return new i2();
        }
        return new i2().mergeFrom(this);
    }

    public static l2 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        i2 i2Var = new i2(p6Var);
        i2Var.f22216e = 0;
        i2Var.f22218g = 0;
        i2Var.f22222k = Collections.EMPTY_LIST;
        if (k7.alwaysUseFieldBuilders) {
            i2Var.j();
        }
        return i2Var;
    }

    public static l2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(bArr);
    }

    public static l2 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (l2) f22325n.parseFrom(bArr, m5Var);
    }

    public static l2 parseFrom(InputStream inputStream) throws IOException {
        return (l2) k7.parseWithIOException(f22325n, inputStream);
    }

    public static l2 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (l2) k7.parseWithIOException(f22325n, inputStream, m5Var);
    }

    public static l2 parseFrom(y yVar) throws IOException {
        return (l2) k7.parseWithIOException(f22325n, yVar);
    }

    public static l2 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (l2) k7.parseWithIOException(f22325n, yVar, m5Var);
    }
}
