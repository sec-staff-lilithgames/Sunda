package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Message;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g7 extends f7 {

    /* renamed from: f, reason: collision with root package name */
    public final Method f22162f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f22163g;

    public g7(Descriptors.FieldDescriptor fieldDescriptor, String str, Class cls, Class cls2, String str2) {
        super(fieldDescriptor, str, cls, cls2, str2);
        this.f22162f = k7.access$1000(this.f22133a, "newBuilder", new Class[0]);
        this.f22163g = k7.access$1000(cls2, a.b.l("get", str, "Builder"), new Class[0]);
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Message.Builder getBuilder(o6 o6Var) {
        return (Message.Builder) k7.access$1100(this.f22163g, o6Var, new Object[0]);
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public Message.Builder newBuilder() {
        return (Message.Builder) k7.access$1100(this.f22162f, null, new Object[0]);
    }

    @Override // com.explorestack.protobuf.f7, com.explorestack.protobuf.u6
    public void set(o6 o6Var, Object obj) {
        if (!this.f22133a.isInstance(obj)) {
            obj = ((Message.Builder) k7.access$1100(this.f22162f, null, new Object[0])).mergeFrom((Message) obj).buildPartial();
        }
        super.set(o6Var, obj);
    }
}
