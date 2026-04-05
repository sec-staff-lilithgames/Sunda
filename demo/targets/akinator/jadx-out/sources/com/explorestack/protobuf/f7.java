package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f7 implements u6 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22133a;

    /* renamed from: b, reason: collision with root package name */
    public final Descriptors.FieldDescriptor f22134b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22135c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22136d;

    /* renamed from: e, reason: collision with root package name */
    public final e7 f22137e;

    public f7(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
        boolean z10 = (fieldDescriptor.getContainingOneof() == null || fieldDescriptor.getContainingOneof().isSynthetic()) ? false : true;
        this.f22135c = z10;
        boolean z11 = fieldDescriptor.getFile().getSyntax() == Descriptors.FileDescriptor.Syntax.PROTO2 || fieldDescriptor.hasOptionalKeyword() || (!z10 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE);
        this.f22136d = z11;
        e7 e7Var = new e7(str, cls, cls2, str2, z10, z11);
        this.f22134b = fieldDescriptor;
        this.f22133a = e7Var.f22080a.getReturnType();
        this.f22137e = e7Var;
    }

    @Override // com.explorestack.protobuf.u6
    public void addRepeated(o6 o6Var, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public void clear(o6 o6Var) {
        this.f22137e.clear(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(k7 k7Var) {
        return this.f22137e.get(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getBuilder(o6 o6Var) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(k7 k7Var) {
        return get(k7Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(k7 k7Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder getRepeatedBuilder(o6 o6Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(k7 k7Var) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(k7 k7Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(k7 k7Var) {
        boolean z10 = this.f22136d;
        e7 e7Var = this.f22137e;
        if (z10) {
            return e7Var.has(k7Var);
        }
        return this.f22135c ? e7Var.getOneofFieldNumber(k7Var) == this.f22134b.getNumber() : !get(k7Var).equals(r3.getDefaultValue());
    }

    @Override // com.explorestack.protobuf.u6
    public Message.Builder newBuilder() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.explorestack.protobuf.u6
    public void set(o6 o6Var, Object obj) {
        this.f22137e.set(o6Var, obj);
    }

    @Override // com.explorestack.protobuf.u6
    public void setRepeated(o6 o6Var, int i10, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object get(o6 o6Var) {
        return this.f22137e.get(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRaw(o6 o6Var) {
        return get(o6Var);
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeated(o6 o6Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public int getRepeatedCount(o6 o6Var) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public Object getRepeatedRaw(o6 o6Var, int i10) {
        throw new UnsupportedOperationException("getRepeatedFieldRaw() called on a singular field.");
    }

    @Override // com.explorestack.protobuf.u6
    public boolean has(o6 o6Var) {
        boolean z10 = this.f22136d;
        e7 e7Var = this.f22137e;
        if (!z10) {
            boolean z11 = this.f22135c;
            Descriptors.FieldDescriptor fieldDescriptor = this.f22134b;
            if (z11) {
                return e7Var.getOneofFieldNumber(o6Var) == fieldDescriptor.getNumber();
            }
            return !get(o6Var).equals(fieldDescriptor.getDefaultValue());
        }
        return e7Var.has(o6Var);
    }
}
