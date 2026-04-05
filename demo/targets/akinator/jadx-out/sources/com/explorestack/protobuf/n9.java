package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n9 implements p9 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f22405a;

    public n9(b6 b6Var) {
        this.f22405a = b6Var;
    }

    @Override // com.explorestack.protobuf.p9
    public p9 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        this.f22405a.addRepeatedField(fieldDescriptor, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.p9
    public p9 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        this.f22405a.clearField(fieldDescriptor);
        return this;
    }

    @Override // com.explorestack.protobuf.p9
    public h5 findExtensionByName(i5 i5Var, String str) {
        return i5Var.findImmutableExtensionByName(str);
    }

    @Override // com.explorestack.protobuf.p9
    public h5 findExtensionByNumber(i5 i5Var, Descriptors.Descriptor descriptor, int i10) {
        return i5Var.findImmutableExtensionByNumber(descriptor, i10);
    }

    @Override // com.explorestack.protobuf.p9
    public Object finish() {
        throw new UnsupportedOperationException("finish() called on FieldSet object");
    }

    @Override // com.explorestack.protobuf.p9
    public o9 getContainerType() {
        return o9.f22439c;
    }

    @Override // com.explorestack.protobuf.p9
    public Descriptors.Descriptor getDescriptorForType() {
        throw new UnsupportedOperationException("getDescriptorForType() called on FieldSet object");
    }

    @Override // com.explorestack.protobuf.p9
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.f22405a.getField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.p9
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        return null;
    }

    @Override // com.explorestack.protobuf.p9
    public gd getUtf8Validation(Descriptors.FieldDescriptor fieldDescriptor) {
        return fieldDescriptor.needsUtf8Check() ? gd.f22179c : gd.f22178b;
    }

    @Override // com.explorestack.protobuf.p9
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.f22405a.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.p9
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return false;
    }

    @Override // com.explorestack.protobuf.p9
    public p9 newEmptyTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
        throw new UnsupportedOperationException("newEmptyTargetForField() called on FieldSet object");
    }

    @Override // com.explorestack.protobuf.p9
    public p9 newMergeTargetForField(Descriptors.FieldDescriptor fieldDescriptor, Message message) {
        throw new UnsupportedOperationException("newMergeTargetForField() called on FieldSet object");
    }

    @Override // com.explorestack.protobuf.p9
    public Object parseGroup(y yVar, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
        Message message2;
        Message.Builder builderNewBuilderForType = message.newBuilderForType();
        if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
            builderNewBuilderForType.mergeFrom(message2);
        }
        yVar.readGroup(fieldDescriptor.getNumber(), builderNewBuilderForType, m5Var);
        return builderNewBuilderForType.buildPartial();
    }

    @Override // com.explorestack.protobuf.p9
    public Object parseMessage(y yVar, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
        Message message2;
        Message.Builder builderNewBuilderForType = message.newBuilderForType();
        if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
            builderNewBuilderForType.mergeFrom(message2);
        }
        yVar.readMessage(builderNewBuilderForType, m5Var);
        return builderNewBuilderForType.buildPartial();
    }

    @Override // com.explorestack.protobuf.p9
    public Object parseMessageFromBytes(ByteString byteString, m5 m5Var, Descriptors.FieldDescriptor fieldDescriptor, Message message) throws IOException {
        Message message2;
        Message.Builder builderNewBuilderForType = message.newBuilderForType();
        if (!fieldDescriptor.isRepeated() && (message2 = (Message) getField(fieldDescriptor)) != null) {
            builderNewBuilderForType.mergeFrom(message2);
        }
        builderNewBuilderForType.mergeFrom(byteString, m5Var);
        return builderNewBuilderForType.buildPartial();
    }

    @Override // com.explorestack.protobuf.p9
    public p9 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        this.f22405a.setField(fieldDescriptor, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.p9
    public p9 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        this.f22405a.setRepeatedField(fieldDescriptor, i10, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.p9
    public p9 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this;
    }
}
