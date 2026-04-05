package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c5 extends AbstractMessage {

    /* renamed from: b, reason: collision with root package name */
    public final Descriptors.Descriptor f21982b;

    /* renamed from: c, reason: collision with root package name */
    public final b6 f21983c;

    /* renamed from: e, reason: collision with root package name */
    public final Descriptors.FieldDescriptor[] f21984e;

    /* renamed from: f, reason: collision with root package name */
    public final gc f21985f;

    /* renamed from: g, reason: collision with root package name */
    public int f21986g = -1;

    public c5(Descriptors.Descriptor descriptor, b6 b6Var, Descriptors.FieldDescriptor[] fieldDescriptorArr, gc gcVar) {
        this.f21982b = descriptor;
        this.f21983c = b6Var;
        this.f21984e = fieldDescriptorArr;
        this.f21985f = gcVar;
    }

    public static boolean b(Descriptors.Descriptor descriptor, b6 b6Var) {
        for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
            if (fieldDescriptor.isRequired() && !b6Var.hasField(fieldDescriptor)) {
                return false;
            }
        }
        return b6Var.isInitialized();
    }

    public static c5 getDefaultInstance(Descriptors.Descriptor descriptor) {
        return new c5(descriptor, b6.emptySet(), new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()], gc.getDefaultInstance());
    }

    public static b5 newBuilder(Descriptors.Descriptor descriptor) {
        return new b5(descriptor);
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, y yVar) throws IOException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(yVar));
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.f21983c.getAllFields();
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f21982b;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        c(fieldDescriptor);
        Object field = this.f21983c.getField(fieldDescriptor);
        return field == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : field;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() == this.f21982b) {
            return this.f21984e[oneofDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public fa getParserForType() {
        return new a5(this);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        c(fieldDescriptor);
        return this.f21983c.getRepeatedField(fieldDescriptor, i10);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        c(fieldDescriptor);
        return this.f21983c.getRepeatedFieldCount(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int serializedSize;
        int serializedSize2;
        int i10 = this.f21986g;
        if (i10 != -1) {
            return i10;
        }
        boolean messageSetWireFormat = this.f21982b.getOptions().getMessageSetWireFormat();
        gc gcVar = this.f21985f;
        b6 b6Var = this.f21983c;
        if (messageSetWireFormat) {
            serializedSize = b6Var.getMessageSetSerializedSize();
            serializedSize2 = gcVar.getSerializedSizeAsMessageSet();
        } else {
            serializedSize = b6Var.getSerializedSize();
            serializedSize2 = gcVar.getSerializedSize();
        }
        int i11 = serializedSize2 + serializedSize;
        this.f21986g = i11;
        return i11;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public gc getUnknownFields() {
        return this.f21985f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        c(fieldDescriptor);
        return this.f21983c.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() == this.f21982b) {
            return this.f21984e[oneofDescriptor.getIndex()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return b(this.f21982b, this.f21983c);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        boolean messageSetWireFormat = this.f21982b.getOptions().getMessageSetWireFormat();
        gc gcVar = this.f21985f;
        b6 b6Var = this.f21983c;
        if (messageSetWireFormat) {
            b6Var.writeMessageSetTo(h0Var);
            gcVar.writeAsMessageSetTo(h0Var);
        } else {
            b6Var.writeTo(h0Var);
            gcVar.writeTo(h0Var);
        }
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, y yVar, i5 i5Var) throws IOException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(yVar, (m5) i5Var));
    }

    public static b5 newBuilder(Message message) {
        return new b5(message.getDescriptorForType()).mergeFrom(message);
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, ByteString byteString) throws InvalidProtocolBufferException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(byteString));
    }

    public final void c(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() == this.f21982b) {
        } else {
            throw new IllegalArgumentException(KGUkpTlXZlJLy.XXnhLxqCDsi);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public c5 getDefaultInstanceForType() {
        return getDefaultInstance(this.f21982b);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b5 newBuilderForType() {
        return new b5(this.f21982b);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public b5 toBuilder() {
        return newBuilderForType().mergeFrom((Message) this);
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, ByteString byteString, i5 i5Var) throws InvalidProtocolBufferException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(byteString, (m5) i5Var));
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, byte[] bArr) throws InvalidProtocolBufferException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(bArr));
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, byte[] bArr, i5 i5Var) throws InvalidProtocolBufferException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(bArr, (m5) i5Var));
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, InputStream inputStream) throws IOException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(inputStream));
    }

    public static c5 parseFrom(Descriptors.Descriptor descriptor, InputStream inputStream, i5 i5Var) throws IOException {
        return b5.b((b5) newBuilder(descriptor).mergeFrom(inputStream, (m5) i5Var));
    }
}
