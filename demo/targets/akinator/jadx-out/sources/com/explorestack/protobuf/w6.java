package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final Descriptors.Descriptor f22808a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22809b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22810c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22811d;

    /* renamed from: e, reason: collision with root package name */
    public final Descriptors.FieldDescriptor f22812e;

    public w6(Descriptors.Descriptor descriptor, int i10, String str, Class cls, Class cls2) {
        this.f22808a = descriptor;
        Descriptors.OneofDescriptor oneofDescriptor = descriptor.getOneofs().get(i10);
        if (oneofDescriptor.isSynthetic()) {
            this.f22809b = null;
            this.f22810c = null;
            this.f22812e = oneofDescriptor.getFields().get(0);
        } else {
            this.f22809b = k7.access$1000(cls, a.b.l("get", str, "Case"), new Class[0]);
            this.f22810c = k7.access$1000(cls2, a.b.l("get", str, "Case"), new Class[0]);
            this.f22812e = null;
        }
        this.f22811d = k7.access$1000(cls2, a.b.k("clear", str), new Class[0]);
    }

    public void clear(o6 o6Var) {
        k7.access$1100(this.f22811d, o6Var, new Object[0]);
    }

    public Descriptors.FieldDescriptor get(k7 k7Var) {
        Descriptors.FieldDescriptor fieldDescriptor = this.f22812e;
        if (fieldDescriptor != null) {
            if (k7Var.hasField(fieldDescriptor)) {
                return fieldDescriptor;
            }
            return null;
        }
        int number = ((o7) k7.access$1100(this.f22809b, k7Var, new Object[0])).getNumber();
        if (number > 0) {
            return this.f22808a.findFieldByNumber(number);
        }
        return null;
    }

    public boolean has(k7 k7Var) {
        Descriptors.FieldDescriptor fieldDescriptor = this.f22812e;
        return fieldDescriptor != null ? k7Var.hasField(fieldDescriptor) : ((o7) k7.access$1100(this.f22809b, k7Var, new Object[0])).getNumber() != 0;
    }

    public boolean has(o6 o6Var) {
        Descriptors.FieldDescriptor fieldDescriptor = this.f22812e;
        if (fieldDescriptor != null) {
            return o6Var.hasField(fieldDescriptor);
        }
        return ((o7) k7.access$1100(this.f22810c, o6Var, new Object[0])).getNumber() != 0;
    }

    public Descriptors.FieldDescriptor get(o6 o6Var) {
        Descriptors.FieldDescriptor fieldDescriptor = this.f22812e;
        if (fieldDescriptor != null) {
            if (o6Var.hasField(fieldDescriptor)) {
                return fieldDescriptor;
            }
            return null;
        }
        int number = ((o7) k7.access$1100(this.f22810c, o6Var, new Object[0])).getNumber();
        if (number > 0) {
            return this.f22808a.findFieldByNumber(number);
        }
        return null;
    }
}
