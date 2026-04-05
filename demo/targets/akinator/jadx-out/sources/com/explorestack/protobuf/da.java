package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class da extends k7 implements ea {

    /* renamed from: f, reason: collision with root package name */
    public static final da f22056f = new da();

    /* renamed from: g, reason: collision with root package name */
    public static final ba f22057g = new ba();

    /* renamed from: c, reason: collision with root package name */
    public Any f22059c;

    /* renamed from: e, reason: collision with root package name */
    public byte f22060e = -1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Serializable f22058b = "";

    public static da getDefaultInstance() {
        return f22056f;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ub.f22725c;
    }

    public static ca newBuilder() {
        return f22056f.toBuilder();
    }

    public static da parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (da) k7.parseDelimitedWithIOException(f22057g, inputStream);
    }

    public static da parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(byteBuffer);
    }

    public static fa parser() {
        return f22057g;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da)) {
            return super.equals(obj);
        }
        da daVar = (da) obj;
        if (getName().equals(daVar.getName()) && hasValue() == daVar.hasValue()) {
            return (!hasValue() || getValue().equals(daVar.getValue())) && this.unknownFields.equals(daVar.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.ea
    public String getName() {
        Serializable serializable = this.f22058b;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        String stringUtf8 = ((ByteString) serializable).toStringUtf8();
        this.f22058b = stringUtf8;
        return stringUtf8;
    }

    @Override // com.explorestack.protobuf.ea
    public ByteString getNameBytes() {
        Serializable serializable = this.f22058b;
        if (!(serializable instanceof String)) {
            return (ByteString) serializable;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) serializable);
        this.f22058b = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return f22057g;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !getNameBytes().isEmpty() ? k7.computeStringSize(1, this.f22058b) : 0;
        if (this.f22059c != null) {
            iComputeStringSize += h0.computeMessageSize(2, getValue());
        }
        int serializedSize = this.unknownFields.getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public final gc getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.ea
    public Any getValue() {
        Any any = this.f22059c;
        return any == null ? Any.getDefaultInstance() : any;
    }

    @Override // com.explorestack.protobuf.ea
    public g getValueOrBuilder() {
        return getValue();
    }

    @Override // com.explorestack.protobuf.ea
    public boolean hasValue() {
        return this.f22059c != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = getName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
        if (hasValue()) {
            iHashCode = getValue().hashCode() + p0.o2.B(iHashCode, 37, 2, 53);
        }
        int iHashCode2 = this.unknownFields.hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.k7
    public final i7 internalGetFieldAccessorTable() {
        return ub.f22726d.ensureFieldAccessorsInitialized(da.class, ca.class);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.f22060e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f22060e = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.k7
    public final Object newInstance(j7 j7Var) {
        return new da();
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        if (!getNameBytes().isEmpty()) {
            k7.writeString(h0Var, 1, this.f22058b);
        }
        if (this.f22059c != null) {
            h0Var.writeMessage(2, getValue());
        }
        this.unknownFields.writeTo(h0Var);
    }

    public static ca newBuilder(da daVar) {
        return f22056f.toBuilder().mergeFrom(daVar);
    }

    public static da parseFrom(ByteBuffer byteBuffer, m5 m5Var) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(byteBuffer, m5Var);
    }

    public static da parseDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (da) k7.parseDelimitedWithIOException(f22057g, inputStream, m5Var);
    }

    public static da parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public da getDefaultInstanceForType() {
        return f22056f;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public ca newBuilderForType() {
        return newBuilder();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public ca toBuilder() {
        if (this == f22056f) {
            return new ca();
        }
        return new ca().mergeFrom(this);
    }

    public static da parseFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(byteString, m5Var);
    }

    @Override // com.explorestack.protobuf.k7
    public final Message.Builder newBuilderForType(p6 p6Var) {
        ca caVar = new ca(p6Var);
        caVar.f22033b = "";
        return caVar;
    }

    public static da parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(bArr);
    }

    public static da parseFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException {
        return (da) f22057g.parseFrom(bArr, m5Var);
    }

    public static da parseFrom(InputStream inputStream) throws IOException {
        return (da) k7.parseWithIOException(f22057g, inputStream);
    }

    public static da parseFrom(InputStream inputStream, m5 m5Var) throws IOException {
        return (da) k7.parseWithIOException(f22057g, inputStream, m5Var);
    }

    public static da parseFrom(y yVar) throws IOException {
        return (da) k7.parseWithIOException(f22057g, yVar);
    }

    public static da parseFrom(y yVar, m5 m5Var) throws IOException {
        return (da) k7.parseWithIOException(f22057g, yVar, m5Var);
    }
}
