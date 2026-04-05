package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface p9 {
    p9 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

    p9 clearField(Descriptors.FieldDescriptor fieldDescriptor);

    p9 clearOneof(Descriptors.OneofDescriptor oneofDescriptor);

    h5 findExtensionByName(i5 i5Var, String str);

    h5 findExtensionByNumber(i5 i5Var, Descriptors.Descriptor descriptor, int i10);

    Object finish();

    o9 getContainerType();

    Descriptors.Descriptor getDescriptorForType();

    Object getField(Descriptors.FieldDescriptor fieldDescriptor);

    Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor);

    gd getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor);

    boolean hasField(Descriptors.FieldDescriptor fieldDescriptor);

    boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor);

    p9 newEmptyTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message);

    p9 newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message);

    Object parseGroup(y yVar, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

    Object parseMessage(y yVar, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

    Object parseMessageFromBytes(ByteString byteString, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException;

    p9 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj);

    p9 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj);
}
