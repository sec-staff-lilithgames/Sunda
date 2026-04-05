package com.explorestack.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b5 extends AbstractMessage.Builder {

    /* renamed from: b, reason: collision with root package name */
    public final Descriptors.Descriptor f21938b;

    /* renamed from: e, reason: collision with root package name */
    public final Descriptors.FieldDescriptor[] f21940e;

    /* renamed from: c, reason: collision with root package name */
    public b6 f21939c = b6.newFieldSet();

    /* renamed from: f, reason: collision with root package name */
    public gc f21941f = gc.getDefaultInstance();

    public b5(Descriptors.Descriptor descriptor) {
        this.f21938b = descriptor;
        this.f21940e = new Descriptors.FieldDescriptor[descriptor.toProto().getOneofDeclCount()];
    }

    public static c5 b(b5 b5Var) throws InvalidProtocolBufferException {
        if (b5Var.isInitialized()) {
            return b5Var.buildPartial();
        }
        Descriptors.Descriptor descriptor = b5Var.f21938b;
        b6 b6Var = b5Var.f21939c;
        Descriptors.FieldDescriptor[] fieldDescriptorArr = b5Var.f21940e;
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) new c5(descriptor, b6Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), b5Var.f21941f)).asInvalidProtocolBufferException();
    }

    public final void c() {
        if (this.f21939c.isImmutable()) {
            this.f21939c = this.f21939c.m501clone();
        }
    }

    public final void d(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.f21938b) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        return this.f21939c.getAllFields();
    }

    @Override // com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.Descriptor getDescriptorForType() {
        return this.f21938b;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        d(fieldDescriptor);
        Object field = this.f21939c.getField(fieldDescriptor);
        return field == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? c5.getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : field;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a dynamic message type.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public Descriptors.FieldDescriptor getOneofFieldDescriptor(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() == this.f21938b) {
            return this.f21940e[oneofDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        d(fieldDescriptor);
        return this.f21939c.getRepeatedField(fieldDescriptor, i10);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a dynamic message type.");
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        d(fieldDescriptor);
        return this.f21939c.getRepeatedFieldCount(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public gc getUnknownFields() {
        return this.f21941f;
    }

    @Override // com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        d(fieldDescriptor);
        return this.f21939c.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() == this.f21938b) {
            return this.f21940e[oneofDescriptor.getIndex()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return c5.b(this.f21938b, this.f21939c);
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        d(fieldDescriptor);
        c();
        this.f21939c.addRepeatedField(fieldDescriptor, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        d(fieldDescriptor);
        c();
        Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
        if (containingOneof != null) {
            int index = containingOneof.getIndex();
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f21940e;
            if (fieldDescriptorArr[index] == fieldDescriptor) {
                fieldDescriptorArr[index] = null;
            }
        }
        this.f21939c.clearField(fieldDescriptor);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
        d(fieldDescriptor);
        if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return new b5(fieldDescriptor.getMessageType());
        }
        throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        d(fieldDescriptor);
        c();
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
            if (fieldDescriptor.isRepeated()) {
                for (Object obj2 : (List) obj) {
                    Charset charset = x7.f22881a;
                    obj2.getClass();
                    if (!(obj2 instanceof Descriptors.EnumValueDescriptor)) {
                        throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                    }
                }
            } else {
                Charset charset2 = x7.f22881a;
                obj.getClass();
                if (!(obj instanceof Descriptors.EnumValueDescriptor)) {
                    throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }
        Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
        if (containingOneof != null) {
            int index = containingOneof.getIndex();
            Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f21940e;
            Descriptors.FieldDescriptor fieldDescriptor2 = fieldDescriptorArr[index];
            if (fieldDescriptor2 != null && fieldDescriptor2 != fieldDescriptor) {
                this.f21939c.clearField(fieldDescriptor2);
            }
            fieldDescriptorArr[index] = fieldDescriptor;
        } else if (fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO3 && !fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE && obj.equals(fieldDescriptor.getDefaultValue())) {
            this.f21939c.clearField(fieldDescriptor);
            return this;
        }
        this.f21939c.setField(fieldDescriptor, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        d(fieldDescriptor);
        c();
        this.f21939c.setRepeatedField(fieldDescriptor, i10, obj);
        return this;
    }

    @Override // com.explorestack.protobuf.Message.Builder
    public b5 setUnknownFields(gc gcVar) {
        this.f21941f = gcVar;
        return this;
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public c5 build() {
        if (isInitialized()) {
            return buildPartial();
        }
        b6 b6Var = this.f21939c;
        Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f21940e;
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) new c5(this.f21938b, b6Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f21941f));
    }

    @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public c5 buildPartial() {
        Descriptors.Descriptor descriptor = this.f21938b;
        if (descriptor.getOptions().getMapEntry()) {
            for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                if (fieldDescriptor.isOptional() && !this.f21939c.hasField(fieldDescriptor)) {
                    if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        this.f21939c.setField(fieldDescriptor, c5.getDefaultInstance(fieldDescriptor.getMessageType()));
                    } else {
                        this.f21939c.setField(fieldDescriptor, fieldDescriptor.getDefaultValue());
                    }
                }
            }
        }
        this.f21939c.makeImmutable();
        b6 b6Var = this.f21939c;
        Descriptors.FieldDescriptor[] fieldDescriptorArr = this.f21940e;
        return new c5(descriptor, b6Var, (Descriptors.FieldDescriptor[]) Arrays.copyOf(fieldDescriptorArr, fieldDescriptorArr.length), this.f21941f);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b5 clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        if (oneofDescriptor.getContainingType() == this.f21938b) {
            Descriptors.FieldDescriptor fieldDescriptor = this.f21940e[oneofDescriptor.getIndex()];
            if (fieldDescriptor != null) {
                clearField(fieldDescriptor);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public c5 getDefaultInstanceForType() {
        return c5.getDefaultInstance(this.f21938b);
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b5 mergeFrom(Message message) {
        if (message instanceof c5) {
            c5 c5Var = (c5) message;
            Descriptors.FieldDescriptor[] fieldDescriptorArr = c5Var.f21984e;
            if (c5Var.f21982b == this.f21938b) {
                c();
                this.f21939c.mergeFrom(c5Var.f21983c);
                mergeUnknownFields(c5Var.f21985f);
                int i10 = 0;
                while (true) {
                    Descriptors.FieldDescriptor[] fieldDescriptorArr2 = this.f21940e;
                    if (i10 >= fieldDescriptorArr2.length) {
                        return this;
                    }
                    Descriptors.FieldDescriptor fieldDescriptor = fieldDescriptorArr2[i10];
                    if (fieldDescriptor == null) {
                        fieldDescriptorArr2[i10] = fieldDescriptorArr[i10];
                    } else {
                        Descriptors.FieldDescriptor fieldDescriptor2 = fieldDescriptorArr[i10];
                        if (fieldDescriptor2 != null && fieldDescriptor != fieldDescriptor2) {
                            this.f21939c.clearField(fieldDescriptor);
                            fieldDescriptorArr2[i10] = fieldDescriptorArr[i10];
                        }
                    }
                    i10++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            return (b5) super.mergeFrom(message);
        }
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public b5 mergeUnknownFields(gc gcVar) {
        this.f21941f = gc.newBuilder(this.f21941f).mergeFrom(gcVar).build();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public b5 clear() {
        if (this.f21939c.isImmutable()) {
            this.f21939c = b6.newFieldSet();
        } else {
            this.f21939c.clear();
        }
        this.f21941f = gc.getDefaultInstance();
        return this;
    }

    @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a
    /* renamed from: clone */
    public b5 mo500clone() {
        b5 b5Var = new b5(this.f21938b);
        b5Var.f21939c.mergeFrom(this.f21939c);
        b5Var.mergeUnknownFields(this.f21941f);
        Descriptors.FieldDescriptor[] fieldDescriptorArr = b5Var.f21940e;
        Descriptors.FieldDescriptor[] fieldDescriptorArr2 = this.f21940e;
        System.arraycopy(fieldDescriptorArr2, 0, fieldDescriptorArr, 0, fieldDescriptorArr2.length);
        return b5Var;
    }
}
