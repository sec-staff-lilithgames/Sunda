package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k3 extends k7 implements l3 {

    /* renamed from: k, reason: collision with root package name */
    public static final k3 f22291k = new k3();

    /* renamed from: l, reason: collision with root package name */
    public static final i3 f22292l = new i3();

    /* renamed from: b, reason: collision with root package name */
    public int f22293b;

    /* renamed from: g, reason: collision with root package name */
    public p3 f22297g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22298h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22299i;

    /* renamed from: j, reason: collision with root package name */
    public byte f22300j = -1;

    /* renamed from: c, reason: collision with root package name */
    public volatile Serializable f22294c = "";

    /* renamed from: e, reason: collision with root package name */
    public volatile Serializable f22295e = "";

    /* renamed from: f, reason: collision with root package name */
    public volatile Serializable f22296f = "";

    public static k3 getDefaultInstance() {
        return f22291k;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return x4.f22856w;
    }

    public static j3 newBuilder() {
        return f22291k.toBuilder();
    }

    public static k3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k3) k7.parseDelimitedWithIOException(f22292l, inputStream);
    }

    public static k3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22292l;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return super.equals(obj);
        }
        k3 k3Var = (k3) obj;
        if (hasName() != k3Var.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(k3Var.getName())) || hasInputType() != k3Var.hasInputType()) {
            return false;
        }
        if ((hasInputType() && !getInputType().equals(k3Var.getInputType())) || hasOutputType() != k3Var.hasOutputType()) {
            return false;
        }
        if ((hasOutputType() && !getOutputType().equals(k3Var.getOutputType())) || hasOptions() != k3Var.hasOptions()) {
            return false;
        }
        if ((hasOptions() && !getOptions().equals(k3Var.getOptions())) || hasClientStreaming() != k3Var.hasClientStreaming()) {
            return false;
        }
        if ((!hasClientStreaming() || getClientStreaming() == k3Var.getClientStreaming()) && hasServerStreaming() == k3Var.hasServerStreaming()) {
            return (!hasServerStreaming() || getServerStreaming() == k3Var.getServerStreaming()) && this.unknownFields.equals(k3Var.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean getClientStreaming() {
        return this.f22298h;
    }

    @Override // com.explorestack.protobuf.l3
    public String getInputType() {
        Serializable serializable = this.f22295e;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22295e = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getInputTypeBytes() {
        Serializable serializable = this.f22295e;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22295e = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public String getName() {
        Serializable serializable = this.f22294c;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22294c = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getNameBytes() {
        Serializable serializable = this.f22294c;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22294c = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public p3 getOptions() {
        p3 p3Var = this.f22297g;
        return p3Var == null ? p3.getDefaultInstance() : p3Var;
    }

    @Override // com.explorestack.protobuf.l3
    public q3 getOptionsOrBuilder() {
        p3 p3Var = this.f22297g;
        return p3Var == null ? p3.getDefaultInstance() : p3Var;
    }

    @Override // com.explorestack.protobuf.l3
    public String getOutputType() {
        Serializable serializable = this.f22296f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        ByteString byteString = (ByteString) serializable;
        String stringUtf8 = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.f22296f = stringUtf8;
        }
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.l3
    public ByteString getOutputTypeBytes() {
        Serializable serializable = this.f22296f;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22296f = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22292l;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = (this.f22293b & 1) != 0 ? k7.computeStringSize(1, this.f22294c) : 0;
        if ((this.f22293b & 2) != 0) {
            iComputeStringSize += k7.computeStringSize(2, this.f22295e);
        }
        if ((this.f22293b & 4) != 0) {
            iComputeStringSize += k7.computeStringSize(3, this.f22296f);
        }
        if ((this.f22293b & 8) != 0) {
            iComputeStringSize += h0.computeMessageSize(4, getOptions());
        }
        if ((this.f22293b & 16) != 0) {
            iComputeStringSize += h0.computeBoolSize(5, this.f22298h);
        }
        if ((this.f22293b & 32) != 0) {
            iComputeStringSize += h0.computeBoolSize(6, this.f22299i);
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean getServerStreaming() {
        return this.f22299i;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasClientStreaming() {
        return (this.f22293b & 16) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasInputType() {
        return (this.f22293b & 2) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasName() {
        return (this.f22293b & 1) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasOptions() {
        return (this.f22293b & 8) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasOutputType() {
        return (this.f22293b & 4) != 0;
    }

    @Override // com.explorestack.protobuf.l3
    public boolean hasServerStreaming() {
        return (this.f22293b & 32) != 0;
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
        if (hasInputType()) {
            iHashCode = p0.o2.B(iHashCode, 37, 2, 53) + getInputType().hashCode();
        }
        if (hasOutputType()) {
            iHashCode = p0.o2.B(iHashCode, 37, 3, 53) + getOutputType().hashCode();
        }
        if (hasOptions()) {
            iHashCode = p0.o2.B(iHashCode, 37, 4, 53) + getOptions().hashCode();
        }
        if (hasClientStreaming()) {
            iHashCode = p0.o2.B(iHashCode, 37, 5, 53) + x7.hashBoolean(getClientStreaming());
        }
        if (hasServerStreaming()) {
            iHashCode = p0.o2.B(iHashCode, 37, 6, 53) + x7.hashBoolean(getServerStreaming());
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return x4.f22857x.ensureFieldAccessorsInitialized(k3.class, j3.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22300j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!hasOptions() || getOptions().isInitialized()) {
            this.f22300j = (byte) 1;
            return true;
        }
        this.f22300j = (byte) 0;
        return false;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new k3();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if ((this.f22293b & 1) != 0) {
            k7.writeString(h0Var, 1, this.f22294c);
        }
        if ((this.f22293b & 2) != 0) {
            k7.writeString(h0Var, 2, this.f22295e);
        }
        if ((this.f22293b & 4) != 0) {
            k7.writeString(h0Var, 3, this.f22296f);
        }
        if ((this.f22293b & 8) != 0) {
            h0Var.writeMessage(4, getOptions());
        }
        if ((this.f22293b & 16) != 0) {
            h0Var.writeBool(5, this.f22298h);
        }
        if ((this.f22293b & 32) != 0) {
            h0Var.writeBool(6, this.f22299i);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static j3 newBuilder(k3 k3Var) {
        return f22291k.toBuilder().mergeFrom(k3Var);
    }

    public static k3 parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(byteBuffer, m5Var);
    }

    public static k3 parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (k3) k7.parseDelimitedWithIOException(f22292l, inputStream, m5Var);
    }

    public static k3 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public k3 getDefaultInstanceForType() {
        return f22291k;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public j3 newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public j3 toBuilder() {
        if (this == f22291k) {
            return new j3();
        }
        return new j3().mergeFrom(this);
    }

    public static k3 parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        j3 j3Var = new j3(p6Var);
        j3Var.f22264c = "";
        j3Var.f22265e = "";
        j3Var.f22266f = "";
        if (k7.alwaysUseFieldBuilders && j3Var.f22268h == null) {
            j3Var.f22268h = new xa(j3Var.getOptions(), j3Var.getParentForChildren(), j3Var.isClean());
            j3Var.f22267g = null;
        }
        return j3Var;
    }

    public static k3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(bArr);
    }

    public static k3 parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (k3) f22292l.parseFrom(bArr, m5Var);
    }

    public static k3 parseFrom(InputStream inputStream) throws IOException {
        return (k3) k7.parseWithIOException(f22292l, inputStream);
    }

    public static k3 parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (k3) k7.parseWithIOException(f22292l, inputStream, m5Var);
    }

    public static k3 parseFrom(y yVar) throws IOException {
        return (k3) k7.parseWithIOException(f22292l, yVar);
    }

    public static k3 parseFrom(y yVar, m5 m5Var) throws IOException {
        return (k3) k7.parseWithIOException(f22292l, yVar, m5Var);
    }
}
