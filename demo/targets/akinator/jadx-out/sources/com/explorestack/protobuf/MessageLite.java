package com.explorestack.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface MessageLite extends j9 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Builder extends j9, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        Builder clear();

        /* renamed from: clone */
        Builder mo500clone();

        @Override // com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException;

        Builder mergeFrom(MessageLite messageLite);

        Builder mergeFrom(y yVar) throws IOException;

        Builder mergeFrom(y yVar, m5 m5Var) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, m5 m5Var) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException;
    }

    @Override // com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    fa getParserForType();

    int getSerializedSize();

    @Override // com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    ByteString toByteString();

    void writeDelimitedTo(OutputStream outputStream) throws IOException;

    void writeTo(h0 h0Var) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
