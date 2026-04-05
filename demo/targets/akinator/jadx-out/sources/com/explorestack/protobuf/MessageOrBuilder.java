package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface MessageOrBuilder extends j9 {
    List<String> findInitializationErrors();

    Map<Descriptors.FieldDescriptor, Object> getAllFields();

    @Override // com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    Message getDefaultInstanceForType();

    /* synthetic */ MessageLite getDefaultInstanceForType();

    Descriptors.Descriptor getDescriptorForType();

    Object getField(Descriptors.FieldDescriptor fieldDescriptor);

    String getInitializationErrorString();

    Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

    Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10);

    int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor);

    gc getUnknownFields();

    boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

    boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

    /* synthetic */ boolean isInitialized();
}
