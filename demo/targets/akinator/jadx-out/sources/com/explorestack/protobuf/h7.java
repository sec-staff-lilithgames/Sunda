package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h7 extends f7 {

    /* renamed from: f, reason: collision with root package name */
    public final Method f22200f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22201g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f22202h;

    public h7(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
        super(fieldDescriptor, str, cls, cls2, str2);
        this.f22200f = k7.access$1000(cls, a.b.l("get", str, "Bytes"), new Class[0]);
        this.f22201g = k7.access$1000(cls2, a.b.l("get", str, "Bytes"), new Class[0]);
        this.f22202h = k7.access$1000(cls2, a.b.l("set", str, "Bytes"), new Class[]{ByteString.class});
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Object getRaw(k7 k7Var) {
        return k7.access$1100(this.f22200f, k7Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public void set(o6 o6Var, Object obj) {
        if (obj instanceof ByteString) {
            k7.access$1100(this.f22202h, o6Var, new Object[]{obj});
        } else {
            super.set(o6Var, obj);
        }
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Object getRaw(o6 o6Var) {
        return k7.access$1100(this.f22201g, o6Var, new Object[0]);
    }
}
