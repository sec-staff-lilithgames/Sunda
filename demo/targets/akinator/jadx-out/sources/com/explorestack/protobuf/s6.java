package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s6 extends k7 implements t6 {

    /* renamed from: b, reason: collision with root package name */
    public final b6 f22625b;

    public s6() {
        this.f22625b = b6.newFieldSet();
    }

    public final void e(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != getDescriptorForType()) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    public final void f(e5 e5Var) {
        if (e5Var.getDescriptor().getContainingType() == getDescriptorForType()) {
            return;
        }
        throw new IllegalArgumentException("Extension is for type \"" + e5Var.getDescriptor().getContainingType().getFullName() + "\" which does not match message type \"" + getDescriptorForType().getFullName() + "\".");
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        Map mapB = b(false);
        mapB.putAll(this.f22625b.getAllFields());
        return Collections.unmodifiableMap(mapB);
    }

    @Override // com.explorestack.protobuf.k7
    public Map<Descriptors.FieldDescriptor, Object> getAllFieldsRaw() {
        Map mapB = b(false);
        mapB.putAll(this.f22625b.getAllFields());
        return Collections.unmodifiableMap(mapB);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ Message getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public abstract /* synthetic */ MessageLite getDefaultInstanceForType();

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        f(e5VarAccess$500);
        Descriptors.FieldDescriptor descriptor = e5VarAccess$500.getDescriptor();
        if (this.f22625b.getField(descriptor) != null) {
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
        f(e5VarAccess$500);
        return this.f22625b.getRepeatedFieldCount(e5VarAccess$500.getDescriptor());
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.getField(fieldDescriptor);
        }
        e(fieldDescriptor);
        Object field = this.f22625b.getField(fieldDescriptor);
        return field == null ? fieldDescriptor.isRepeated() ? Collections.EMPTY_LIST : fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE ? c5.getDefaultInstance(fieldDescriptor.getMessageType()) : fieldDescriptor.getDefaultValue() : field;
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10) {
        if (!fieldDescriptor.isExtension()) {
            return super.getRepeatedField(fieldDescriptor, i10);
        }
        e(fieldDescriptor);
        return this.f22625b.getRepeatedField(fieldDescriptor, i10);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.getRepeatedFieldCount(fieldDescriptor);
        }
        e(fieldDescriptor);
        return this.f22625b.getRepeatedFieldCount(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(f5 f5Var) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        f(e5VarAccess$500);
        return this.f22625b.hasField(e5VarAccess$500.getDescriptor());
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.MessageOrBuilder
    public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        if (!fieldDescriptor.isExtension()) {
            return super.hasField(fieldDescriptor);
        }
        e(fieldDescriptor);
        return this.f22625b.hasField(fieldDescriptor);
    }

    @Override // com.explorestack.protobuf.k7, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public boolean isInitialized() {
        return super.isInitialized() && this.f22625b.isInitialized();
    }

    @Override // com.explorestack.protobuf.k7
    public final void makeExtensionsImmutable() {
        this.f22625b.makeImmutable();
    }

    @Override // com.explorestack.protobuf.k7
    public final boolean parseUnknownField(y yVar, cc ccVar, m5 m5Var, int i10) {
        yVar.getClass();
        return q9.d(yVar, ccVar, m5Var, getDescriptorForType(), new n9(this.f22625b), i10);
    }

    @Override // com.explorestack.protobuf.k7
    public final boolean parseUnknownFieldProto3(y yVar, cc ccVar, m5 m5Var, int i10) {
        return parseUnknownField(yVar, ccVar, m5Var, i10);
    }

    public s6(q6 q6Var) {
        b6 b6VarBuild;
        super(q6Var);
        z5 z5Var = q6Var.f22524b;
        if (z5Var == null) {
            b6VarBuild = b6.emptySet();
        } else {
            b6VarBuild = z5Var.build();
        }
        this.f22625b = b6VarBuild;
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(e5 e5Var) {
        return hasExtension((f5) e5Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> int getExtensionCount(e5 e5Var) {
        return getExtensionCount((f5) e5Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> boolean hasExtension(e6 e6Var) {
        return hasExtension((f5) e6Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> int getExtensionCount(e6 e6Var) {
        return getExtensionCount((f5) e6Var);
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(f5 f5Var, int i10) {
        e5 e5VarAccess$500 = k7.access$500(f5Var);
        f(e5VarAccess$500);
        this.f22625b.getRepeatedField(e5VarAccess$500.getDescriptor(), i10);
        return (Type) e5VarAccess$500.c();
    }

    @Override // com.explorestack.protobuf.t6
    public final <Type> Type getExtension(e5 e5Var) {
        return (Type) getExtension((f5) e5Var);
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
