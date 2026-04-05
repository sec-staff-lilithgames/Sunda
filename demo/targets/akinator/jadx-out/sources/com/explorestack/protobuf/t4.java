package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t4 extends k7 implements u4 {

    /* renamed from: g, reason: collision with root package name */
    public static final t4 f22655g = new t4();

    /* renamed from: h, reason: collision with root package name */
    public static final r4 f22656h = new r4();

    /* renamed from: b, reason: collision with root package name */
    public int f22657b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22659e;

    /* renamed from: f, reason: collision with root package name */
    public byte f22660f = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22658c = "";

    public static t4 getDefaultInstance() {
        return f22655g;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.Q;
    }

    public static s4 newBuilder() {
        return f22655g.toBuilder();
    }

    public static t4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (t4) k7.parseDelimitedWithIOException(f22656h, inputStream);
    }

    public static t4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22656h;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return super.equals(obj);
        }
        t4 t4Var = (t4) obj;
        if (hasNamePart() != t4Var.hasNamePart()) {
            return false;
        }
        if ((!hasNamePart() || getNamePart().equals(t4Var.getNamePart())) && hasIsExtension() == t4Var.hasIsExtension()) {
            return (!hasIsExtension() || getIsExtension() == t4Var.getIsExtension()) && this.unknownFields.equals(t4Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean getIsExtension() {
        return this.f22659e;
    }

    @Override // com.explorestack.protobuf.u4
    public String getNamePart() {
        Serializable serializable = this.f22658c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22658c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.u4
    public ByteString getNamePartBytes() {
        Serializable serializable = this.f22658c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22658c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22656h;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22657b & 1) != 0 ? k7.computeStringSize(1, this.f22658c) : 0;
        if ((this.f22657b & 2) != 0) {
            iComputeStringSize += h0.computeBoolSize(2, this.f22659e);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean hasIsExtension() {
        return (this.f22657b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.u4
    public boolean hasNamePart() {
        return (this.f22657b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasNamePart()) {
            iHashCode = p0.o2.B(iHashCode, 37, 1, 53) + getNamePart().hashCode();
        }
        if (hasIsExtension()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + x7.hashBoolean(getIsExtension());
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.R.ensureFieldAccessorsInitialized(t4.class, s4.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22660f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasNamePart()) {
            this.f22660f = (byte) 0;
            return false;
        }
        if (hasIsExtension()) {
            this.f22660f = (byte) 1;
            return true;
        }
        this.f22660f = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new t4();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22657b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22658c);
        }
        if ((this.f22657b & 2) != 0) {
            h0Var.writeBool(2, this.f22659e);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static s4 newBuilder(t4 t4Var) {
        return f22655g.toBuilder().mergeFrom(t4Var);
    }

    public static t4 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(byteBuffer, m5Var);
    }

    public static t4 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (t4) k7.parseDelimitedWithIOException(f22656h, inputStream, m5Var);
    }

    public static t4 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public t4 getDefaultInstanceForType() {
        return f22655g;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s4 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public s4 toBuilder() {
        if (this == f22655g) {
            return new s4();
        }
        return new s4().mergeFrom(this);
    }

    public static t4 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        s4 s4Var = new s4(p6Var);
        s4Var.f22611c = "";
        return s4Var;
    }

    public static t4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(bArr);
    }

    public static t4 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (t4) f22656h.parseFrom(bArr, m5Var);
    }

    public static t4 parseFrom(InputStream inputStream) throws IOException {
        return (t4) k7.parseWithIOException(f22656h, inputStream);
    }

    public static t4 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (t4) k7.parseWithIOException(f22656h, inputStream, m5Var);
    }

    public static t4 parseFrom(y yVar) throws IOException {
        return (t4) k7.parseWithIOException(f22656h, yVar);
    }

    public static t4 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (t4) k7.parseWithIOException(f22656h, yVar, m5Var);
    }
}
