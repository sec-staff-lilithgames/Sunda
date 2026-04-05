package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q6 extends o6 implements t6 {

    /* renamed from: b, reason: collision with root package name */
    public z5 f22524b;

    public final <Type> q6 addExtension(f5 f5Var, Type type) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        c();
        this.f22524b.addRepeatedField(e5VarAccess$500.getDescriptor(), e5VarAccess$500.d());
        onChanged();
        return this;
    }

    public final void c() {
        if (this.f22524b == null) {
            this.f22524b = b6.newBuilder();
        }
    }

    public final q6 clearExtension(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        c();
        this.f22524b.clearField(e5VarAccess$500.getDescriptor());
        onChanged();
        return this;
    }

    public final boolean e() {
        z5 z5Var = this.f22524b;
        if (z5Var == null) {
            return true;
        }
        return z5Var.isInitialized();
    }

    public final void f(s6 s6Var) {
        if (s6Var.f22625b != null) {
            c();
            this.f22524b.mergeFrom(s6Var.f22625b);
            onChanged();
        }
    }

    public final void g(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        Map mapB = b();
        z5 z5Var = this.f22524b;
        if (z5Var != null) {
            mapB.putAll(z5Var.getAllFields());
        }
        return Collections.unmodifiableMap(mapB);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ Message getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        Descriptors.FieldDescriptor descriptor = e5VarAccess$500.getDescriptor();
        z5 z5Var = this.f22524b;
        if ((z5Var == null ? null : z5Var.getField(descriptor)) != null) {
            return (Type) e5VarAccess$500.a();
        }
        if (descriptor.isRepeated()) {
            return (Type) Collections.EMPTY_LIST;
        }
        if (descriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            return (Type) e5VarAccess$500.getMessageDefaultInstance();
        }
        descriptor.getDefaultValue();
        return (Type) e5VarAccess$500.a();
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> int getExtensionCount(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        Descriptors.FieldDescriptor descriptor = e5VarAccess$500.getDescriptor();
        z5 z5Var = this.f22524b;
        if (z5Var == null) {
            return 0;
        }
        return z5Var.getRepeatedFieldCount(descriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.getField(fieldDescriptor);
        }
        g(fieldDescriptor);
        z5 z5Var = this.f22524b;
        Object field = z5Var == null ? null : z5Var.getField(fieldDescriptor);
        return field == null ? fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? c5.getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : field;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.getFieldBuilder(fieldDescriptor);
        }
        g(fieldDescriptor);
        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        c();
        Object value = this.f22524b.f22948a.get(fieldDescriptor);
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        if (value == null) {
            b5 b5VarNewBuilder = c5.newBuilder(fieldDescriptor.getMessageType());
            this.f22524b.setField(fieldDescriptor, b5VarNewBuilder);
            onChanged();
            return b5VarNewBuilder;
        }
        if (value instanceof Message.Builder) {
            return (Message.Builder) value;
        }
        if (!(value instanceof Message)) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        Message.Builder builder = ((Message) value).toBuilder();
        this.f22524b.setField(fieldDescriptor, builder);
        onChanged();
        return builder;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        if (!fieldDescriptor.isExtension()) {
            return super.getRepeatedField(fieldDescriptor, i10);
        }
        g(fieldDescriptor);
        z5 z5Var = this.f22524b;
        if (z5Var != null) {
            return z5Var.getRepeatedField(fieldDescriptor, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
    public Message.Builder getRepeatedFieldBuilder(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        if (!fieldDescriptor.isExtension()) {
            return super.getRepeatedFieldBuilder(fieldDescriptor, i10);
        }
        g(fieldDescriptor);
        c();
        if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        Object objB = this.f22524b.b(fieldDescriptor, i10);
        if (objB instanceof Message.Builder) {
            return (Message.Builder) objB;
        }
        if (!(objB instanceof Message)) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        Message.Builder builder = ((Message) objB).toBuilder();
        this.f22524b.setRepeatedField(fieldDescriptor, i10, builder);
        onChanged();
        return builder;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.getRepeatedFieldCount(fieldDescriptor);
        }
        g(fieldDescriptor);
        z5 z5Var = this.f22524b;
        if (z5Var == null) {
            return 0;
        }
        return z5Var.getRepeatedFieldCount(fieldDescriptor);
    }

    public final void h(e5 e5Var) {
        if (e5Var.getDescriptor().getContainingType() == getDescriptorForType()) {
            return;
        }
        throw new IllegalArgumentException("Extension is for type \"" + e5Var.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        z5 z5Var = this.f22524b;
        if (z5Var == null) {
            return false;
        }
        return z5Var.hasField(e5VarAccess$500.getDescriptor());
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.hasField(fieldDescriptor);
        }
        g(fieldDescriptor);
        z5 z5Var = this.f22524b;
        if (z5Var == null) {
            return false;
        }
        return z5Var.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.b.a, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return super.isInitialized() && e();
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
        return fieldDescriptor.isExtension() ? c5.newBuilder(fieldDescriptor.getMessageType()) : super.newBuilderForField(fieldDescriptor);
    }

    public final <Type> q6 setExtension(f5 f5Var, Type type) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        c();
        this.f22524b.setField(e5VarAccess$500.getDescriptor(), e5VarAccess$500.e());
        onChanged();
        return this;
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q6 addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        if (fieldDescriptor.isExtension()) {
            g(fieldDescriptor);
            c();
            this.f22524b.addRepeatedField(fieldDescriptor, obj);
            onChanged();
            return this;
        }
        return (q6) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q6 clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.isExtension()) {
            g(fieldDescriptor);
            c();
            this.f22524b.clearField(fieldDescriptor);
            onChanged();
            return this;
        }
        return (q6) super.clearField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q6 setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        if (fieldDescriptor.isExtension()) {
            g(fieldDescriptor);
            c();
            this.f22524b.setField(fieldDescriptor, obj);
            onChanged();
            return this;
        }
        return (q6) super.setField(fieldDescriptor, obj);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.Message.Builder
    public q6 setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
        if (fieldDescriptor.isExtension()) {
            g(fieldDescriptor);
            c();
            this.f22524b.setRepeatedField(fieldDescriptor, i10, obj);
            onChanged();
            return this;
        }
        return (q6) super.setRepeatedField(fieldDescriptor, i10, obj);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(e5 e5Var) {
        return hasExtension((f5) e5Var);
    }

    @Override // com.explorestack.protobuf.o6, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
    public q6 clear() {
        this.f22524b = null;
        return (q6) super.clear();
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> int getExtensionCount(e5 e5Var) {
        return getExtensionCount((f5) e5Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(e6 e6Var) {
        return hasExtension((f5) e6Var);
    }

    public final <Type> q6 clearExtension(e5 e5Var) {
        return clearExtension((f5) e5Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> int getExtensionCount(e6 e6Var) {
        return getExtensionCount((f5) e6Var);
    }

    public <Type> q6 clearExtension(e6 e6Var) {
        return clearExtension((f5) e6Var);
    }

    public final <Type> q6 setExtension(f5 f5Var, int i10, Type type) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        c();
        this.f22524b.setRepeatedField(e5VarAccess$500.getDescriptor(), i10, e5VarAccess$500.d());
        onChanged();
        return this;
    }

    public final <Type> q6 addExtension(e5 e5Var, Type type) {
        return addExtension((f5) e5Var, (e5) type);
    }

    public <Type> q6 addExtension(e6 e6Var, Type type) {
        return addExtension((f5) e6Var, (e6) type);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(f5 f5Var, int i10) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        h(e5VarAccess$500);
        Descriptors.FieldDescriptor descriptor = e5VarAccess$500.getDescriptor();
        z5 z5Var = this.f22524b;
        if (z5Var != null) {
            z5Var.getRepeatedField(descriptor, i10);
            return (Type) e5VarAccess$500.c();
        }
        throw new IndexOutOfBoundsException();
    }

    public final <Type> q6 setExtension(e5 e5Var, Type type) {
        return setExtension((f5) e5Var, (e5) type);
    }

    public <Type> q6 setExtension(e6 e6Var, Type type) {
        return setExtension((f5) e6Var, (e6) type);
    }

    public final <Type> q6 setExtension(e5 e5Var, int i10, Type type) {
        return setExtension((f5) e5Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(e5 e5Var) {
        return (Type) getExtension((f5) e5Var);
    }

    public <Type> q6 setExtension(e6 e6Var, int i10, Type type) {
        return setExtension((f5) e6Var, i10, (int) type);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(e6 e6Var) {
        return (Type) getExtension((f5) e6Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(e5 e5Var, int i10) {
        return (Type) getExtension((f5) e5Var, i10);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(e6 e6Var, int i10) {
        return (Type) getExtension((f5) e6Var, i10);
    }
}
