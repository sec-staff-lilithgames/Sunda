package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v4 extends k7 implements w4 {

    /* renamed from: l, reason: collision with root package name */
    public static final v4 f22756l = new v4();

    /* renamed from: m, reason: collision with root package name */
    public static final p4 f22757m = new p4();

    /* renamed from: b, reason: collision with root package name */
    public int f22758b;

    /* renamed from: f, reason: collision with root package name */
    public long f22761f;

    /* renamed from: g, reason: collision with root package name */
    public long f22762g;

    /* renamed from: h, reason: collision with root package name */
    public double f22763h;

    /* renamed from: k, reason: collision with root package name */
    public byte f22766k = -1;

    /* renamed from: c, reason: collision with root package name */
    public List f22759c = Collections.EMPTY_LIST;

    /* renamed from: e, reason: collision with root package name */
    public volatile Serializable f22760e = "";

    /* renamed from: i, reason: collision with root package name */
    public ByteString f22764i = ByteString.EMPTY;

    /* renamed from: j, reason: collision with root package name */
    public volatile Serializable f22765j = "";

    public static v4 getDefaultInstance() {
        return f22756l;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.O;
    }

    public static q4 newBuilder() {
        return f22756l.toBuilder();
    }

    public static v4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (v4) k7.parseDelimitedWithIOException(f22757m, inputStream);
    }

    public static v4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22757m;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return super.equals(obj);
        }
        v4 v4Var = (v4) obj;
        if (!getNameList().equals(v4Var.getNameList()) || hasIdentifierValue() != v4Var.hasIdentifierValue()) {
            return false;
        }
        if ((hasIdentifierValue() && !getIdentifierValue().equals(v4Var.getIdentifierValue())) || hasPositiveIntValue() != v4Var.hasPositiveIntValue()) {
            return false;
        }
        if ((hasPositiveIntValue() && getPositiveIntValue() != v4Var.getPositiveIntValue()) || hasNegativeIntValue() != v4Var.hasNegativeIntValue()) {
            return false;
        }
        if ((hasNegativeIntValue() && getNegativeIntValue() != v4Var.getNegativeIntValue()) || hasDoubleValue() != v4Var.hasDoubleValue()) {
            return false;
        }
        if ((hasDoubleValue() && Double.doubleToLongBits(getDoubleValue()) != Double.doubleToLongBits(v4Var.getDoubleValue())) || hasStringValue() != v4Var.hasStringValue()) {
            return false;
        }
        if ((!hasStringValue() || getStringValue().equals(v4Var.getStringValue())) && hasAggregateValue() == v4Var.hasAggregateValue()) {
            return (!hasAggregateValue() || getAggregateValue().equals(v4Var.getAggregateValue())) && this.unknownFields.equals(v4Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.w4
    public String getAggregateValue() {
        Serializable serializable = this.f22765j;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22765j = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getAggregateValueBytes() {
        Serializable serializable = this.f22765j;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22765j = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public double getDoubleValue() {
        return this.f22763h;
    }

    @Override // com.explorestack.protobuf.w4
    public String getIdentifierValue() {
        Serializable serializable = this.f22760e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22760e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getIdentifierValueBytes() {
        Serializable serializable = this.f22760e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22760e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.w4
    public t4 getName(int i10) {
        return (t4) this.f22759c.get(i10);
    }

    @Override // com.explorestack.protobuf.w4
    public int getNameCount() {
        return this.f22759c.size();
    }

    @Override // com.explorestack.protobuf.w4
    public List<t4> getNameList() {
        return this.f22759c;
    }

    @Override // com.explorestack.protobuf.w4
    public u4 getNameOrBuilder(int i10) {
        return (u4) this.f22759c.get(i10);
    }

    @Override // com.explorestack.protobuf.w4
    public List<? extends u4> getNameOrBuilderList() {
        return this.f22759c;
    }

    @Override // com.explorestack.protobuf.w4
    public long getNegativeIntValue() {
        return this.f22762g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22757m;
    }

    @Override // com.explorestack.protobuf.w4
    public long getPositiveIntValue() {
        return this.f22761f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = 0;
        for (int i11 = 0; i11 < this.f22759c.size(); i11++) {
            iComputeStringSize += h0.computeMessageSize(2, (MessageLite) this.f22759c.get(i11));
        }
        if ((this.f22758b & 1) != 0) {
            iComputeStringSize += k7.computeStringSize(3, this.f22760e);
        }
        if ((this.f22758b & 2) != 0) {
            iComputeStringSize += h0.computeUInt64Size(4, this.f22761f);
        }
        if ((this.f22758b & 4) != 0) {
            iComputeStringSize += h0.computeInt64Size(5, this.f22762g);
        }
        if ((this.f22758b & 8) != 0) {
            iComputeStringSize += h0.computeDoubleSize(6, this.f22763h);
        }
        if ((this.f22758b & 16) != 0) {
            iComputeStringSize += h0.computeBytesSize(7, this.f22764i);
        }
        if ((this.f22758b & 32) != 0) {
            iComputeStringSize += k7.computeStringSize(8, this.f22765j);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.w4
    public ByteString getStringValue() {
        return this.f22764i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasAggregateValue() {
        return (this.f22758b & 32) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasDoubleValue() {
        return (this.f22758b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasIdentifierValue() {
        return (this.f22758b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasNegativeIntValue() {
        return (this.f22758b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasPositiveIntValue() {
        return (this.f22758b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.w4
    public boolean hasStringValue() {
        return (this.f22758b & 16) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (getNameCount() > 0) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getNameList().hashCode();
        }
        if (hasIdentifierValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getIdentifierValue().hashCode();
        }
        if (hasPositiveIntValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + x7.hashLong(getPositiveIntValue());
        }
        if (hasNegativeIntValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + x7.hashLong(getNegativeIntValue());
        }
        if (hasDoubleValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + x7.hashLong(Double.doubleToLongBits(getDoubleValue()));
        }
        if (hasStringValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 7, 53) + getStringValue().hashCode();
        }
        if (hasAggregateValue()) {
            iHashCode = p0.o2.B(iHashCode, 37, 8, 53) + getAggregateValue().hashCode();
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.P.ensureFieldAccessorsInitialized(v4.class, q4.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22766k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < getNameCount(); i10++) {
            if (!getName(i10).isInitialized()) {
                this.f22766k = (byte) 0;
                return false;
            }
        }
        this.f22766k = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new v4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        for (int i10 = 0; i10 < this.f22759c.size(); i10++) {
            h0Var.writeMessage(2, (MessageLite) this.f22759c.get(i10));
        }
        if ((this.f22758b & 1) != 0) {
            k7.writeString(h0Var, 3, this.f22760e);
        }
        if ((this.f22758b & 2) != 0) {
            h0Var.writeUInt64(4, this.f22761f);
        }
        if ((this.f22758b & 4) != 0) {
            h0Var.writeInt64(5, this.f22762g);
        }
        if ((this.f22758b & 8) != 0) {
            h0Var.writeDouble(6, this.f22763h);
        }
        if ((this.f22758b & 16) != 0) {
            h0Var.writeBytes(7, this.f22764i);
        }
        if ((this.f22758b & 32) != 0) {
            k7.writeString(h0Var, 8, this.f22765j);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static q4 newBuilder(v4 v4Var) {
        return f22756l.toBuilder().mergeFrom(v4Var);
    }

    public static v4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(byteBuffer, m5Var);
    }

    public static v4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v4) k7.parseDelimitedWithIOException(f22757m, inputStream, m5Var);
    }

    public static v4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public v4 getDefaultInstanceForType() {
        return f22756l;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public q4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public q4 toBuilder() {
        if (this == f22756l) {
            return new q4();
        }
        return new q4().mergeFrom(this);
    }

    public static v4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        q4 q4Var = new q4(p6Var);
        q4Var.f22514c = Collections.EMPTY_LIST;
        q4Var.f22516f = "";
        q4Var.f22520j = ByteString.EMPTY;
        q4Var.f22521k = "";
        if (k7.alwaysUseFieldBuilders) {
            q4Var.e();
        }
        return q4Var;
    }

    public static v4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(bArr);
    }

    public static v4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (v4) f22757m.parseFrom(bArr, m5Var);
    }

    public static v4 parseFrom(InputStream inputStream) throws IOException {
        return (v4) k7.parseWithIOException(f22757m, inputStream);
    }

    public static v4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (v4) k7.parseWithIOException(f22757m, inputStream, m5Var);
    }

    public static v4 parseFrom(y yVar) throws IOException {
        return (v4) k7.parseWithIOException(f22757m, yVar);
    }

    public static v4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (v4) k7.parseWithIOException(f22757m, yVar, m5Var);
    }
}
