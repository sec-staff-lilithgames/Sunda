package com.explorestack.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class w8 implements v8 {

    /* renamed from: a, reason: collision with root package name */
    public final s8 f22813a;

    public w8(s8 s8Var) {
        this.f22813a = s8Var;
    }

    @Override // com.explorestack.protobuf.v8
    public Message convertKeyAndValueToMessage(Object obj, Object obj2) {
        return this.f22813a.newBuilderForType().setKey(obj).setValue(obj2).buildPartial();
    }

    @Override // com.explorestack.protobuf.v8
    public void convertMessageToKeyAndValue(Message message, Map<Object, Object> map) {
        s8 s8Var = (s8) message;
        map.put(s8Var.getKey(), s8Var.getValue());
    }

    @Override // com.explorestack.protobuf.v8
    public Message getMessageDefaultInstance() {
        return this.f22813a;
    }
}
