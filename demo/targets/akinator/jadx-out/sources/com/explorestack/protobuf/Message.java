package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface Message extends MessageLite, MessageOrBuilder {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Builder extends MessageLite.Builder, MessageOrBuilder {
        Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Message build();

        Message buildPartial();

        Builder clear();

        Builder clearField(Descriptors.FieldDescriptor fieldDescriptor);

        Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

        /* renamed from: clone */
        Builder mo500clone();

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ MessageLite getDefaultInstanceForType();

        @Override // com.explorestack.protobuf.MessageOrBuilder
        Descriptors.Descriptor getDescriptorForType();

        Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor);

        Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10);

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        /* synthetic */ boolean isInitialized();

        boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

        boolean mergeDelimitedFrom(InputStream inputStream, m5 m5Var) throws IOException;

        Builder mergeFrom(ByteString byteString) throws InvalidProtocolBufferException;

        Builder mergeFrom(ByteString byteString, m5 m5Var) throws InvalidProtocolBufferException;

        Builder mergeFrom(Message message);

        Builder mergeFrom(y yVar) throws IOException;

        Builder mergeFrom(y yVar, m5 m5Var) throws IOException;

        Builder mergeFrom(InputStream inputStream) throws IOException;

        Builder mergeFrom(InputStream inputStream, m5 m5Var) throws IOException;

        Builder mergeFrom(byte[] bArr) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, int i10, int i11, m5 m5Var) throws InvalidProtocolBufferException;

        Builder mergeFrom(byte[] bArr, m5 m5Var) throws InvalidProtocolBufferException;

        Builder mergeUnknownFields(gc gcVar);

        Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor);

        Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

        Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj);

        Builder setUnknownFields(gc gcVar);
    }

    boolean equals(Object obj);

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    fa getParserForType();

    int hashCode();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();

    Builder newBuilderForType();

    Builder toBuilder();

    String toString();
}
