package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c7 extends f7 {

    /* renamed from: f, reason: collision with root package name */
    public final Descriptors.EnumDescriptor f22020f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22021g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22022h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22023i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22024j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f22025k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f22026l;

    public c7(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
        super(fieldDescriptor, str, cls, cls2, str2);
        this.f22020f = fieldDescriptor.getEnumType();
        this.f22021g = k7.access$1000(this.f22133a, "valueOf", new Class[]{Descriptors.EnumValueDescriptor.class});
        this.f22022h = k7.access$1000(this.f22133a, "getValueDescriptor", new Class[0]);
        boolean zSupportsUnknownEnumValue = fieldDescriptor.getFile().supportsUnknownEnumValue();
        this.f22023i = zSupportsUnknownEnumValue;
        if (zSupportsUnknownEnumValue) {
            this.f22024j = k7.access$1000(cls, a.b.l("get", str, "Value"), new Class[0]);
            this.f22025k = k7.access$1000(cls2, a.b.l("get", str, "Value"), new Class[0]);
            this.f22026l = k7.access$1000(cls2, a.b.l("set", str, "Value"), new Class[]{Integer.TYPE});
        }
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Object get(k7 k7Var) {
        if (this.f22023i) {
            return this.f22020f.findValueByNumberCreatingIfUnknown(((Integer) k7.access$1100(this.f22024j, k7Var, new Object[0])).intValue());
        }
        return k7.access$1100(this.f22022h, super.get(k7Var), new Object[0]);
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public void set(o6 o6Var, Object obj) {
        if (this.f22023i) {
            k7.access$1100(this.f22026l, o6Var, new Object[]{Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber())});
        } else {
            super.set(o6Var, k7.access$1100(this.f22021g, null, new Object[]{obj}));
        }
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Object get(o6 o6Var) {
        if (this.f22023i) {
            return this.f22020f.findValueByNumberCreatingIfUnknown(((Integer) k7.access$1100(this.f22025k, o6Var, new Object[0])).intValue());
        }
        return k7.access$1100(this.f22022h, super.get(o6Var), new Object[0]);
    }
}
