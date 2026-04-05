package com.explorestack.protobuf;

import com.explorestack.protobuf.Message;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b7 extends a7 {

    /* renamed from: c, reason: collision with root package name */
    public final Method f21946c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f21947d;

    public b7(String str, Class cls, Class cls2) {
        super(str, cls, cls2);
        this.f21946c = k7.access$1000(this.f21848a, "newBuilder", new Class[0]);
        this.f21947d = k7.access$1000(cls2, a.b.l("get", str, "Builder"), new Class[]{Integer.TYPE});
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public void addRepeated(o6 o6Var, Object obj) {
        if (!this.f21848a.isInstance(obj)) {
            obj = ((Message.Builder) k7.access$1100(this.f21946c, null, new Object[0])).mergeFrom((Message) obj).build();
        }
        super.addRepeated(o6Var, obj);
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Message.Builder getRepeatedBuilder(o6 o6Var, int i10) {
        return (Message.Builder) k7.access$1100(this.f21947d, o6Var, new Object[]{Integer.valueOf(i10)});
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public Message.Builder newBuilder() {
        return (Message.Builder) k7.access$1100(this.f21946c, null, new Object[0]);
    }

    @Override // com.explorestack.protobuf.a7, com.explorestack.protobuf.u6
    public void setRepeated(o6 o6Var, int i10, Object obj) {
        if (!this.f21848a.isInstance(obj)) {
            obj = ((Message.Builder) k7.access$1100(this.f21946c, null, new Object[0])).mergeFrom((Message) obj).build();
        }
        super.setRepeated(o6Var, i10, obj);
    }
}
