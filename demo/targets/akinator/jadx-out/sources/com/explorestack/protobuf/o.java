package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o extends k7 implements p {

    /* renamed from: e, reason: collision with root package name */
    public static final o f22407e = new o();

    /* renamed from: f, reason: collision with root package name */
    public static final m f22408f = new m();

    /* renamed from: b, reason: collision with root package name */
    public boolean f22409b;

    /* renamed from: c, reason: collision with root package name */
    public byte f22410c = -1;

    public static o getDefaultInstance() {
        return f22407e;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return id.f22246g;
    }

    public static n newBuilder() {
        return f22407e.toBuilder();
    }

    public static o of(boolean z10) {
        return newBuilder().setValue(z10).build();
    }

    public static o parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (o) k7.parseDelimitedWithIOException(f22408f, inputStream);
    }

    public static o parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22408f;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        return getValue() == oVar.getValue() && this.unknownFields.equals(oVar.unknownFields);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22408f;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.f22409b;
        int serializedSize = this.unknownFields.getSerializedSize() + (z10 ? h0.computeBoolSize(1, z10) : 0);
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.p
    public boolean getValue() {
        return this.f22409b;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.unknownFields.hashCode() + ((x7.hashBoolean(getValue()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return id.f22247h.ensureFieldAccessorsInitialized(o.class, n.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22410c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22410c = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new o();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        boolean z10 = this.f22409b;
        if (z10) {
            h0Var.writeBool(1, z10);
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static n newBuilder(o oVar) {
        return f22407e.toBuilder().mergeFrom(oVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(byteBuffer, m5Var);
    }

    public static o parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (o) k7.parseDelimitedWithIOException(f22408f, inputStream, m5Var);
    }

    public static o parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public o getDefaultInstanceForType() {
        return f22407e;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public n newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public n toBuilder() {
        if (this == f22407e) {
            return new n(null);
        }
        return new n(null).mergeFrom(this);
    }

    public static o parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        return new n(p6Var);
    }

    public static o parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(bArr);
    }

    public static o parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (o) f22408f.parseFrom(bArr, m5Var);
    }

    public static o parseFrom(InputStream inputStream) throws IOException {
        return (o) k7.parseWithIOException(f22408f, inputStream);
    }

    public static o parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (o) k7.parseWithIOException(f22408f, inputStream, m5Var);
    }

    public static o parseFrom(y yVar) throws IOException {
        return (o) k7.parseWithIOException(f22408f, yVar);
    }

    public static o parseFrom(y yVar, m5 m5Var) throws IOException {
        return (o) k7.parseWithIOException(f22408f, yVar, m5Var);
    }
}
