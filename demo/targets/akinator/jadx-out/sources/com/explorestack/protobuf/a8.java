package com.explorestack.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a8 implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public Map.Entry f21850b;

    public b8 getField() {
        return (b8) this.f21850b.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f21850b.getKey();
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        b8 b8Var = (b8) this.f21850b.getValue();
        if (b8Var == null) {
            return null;
        }
        return b8Var.getValue();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((b8) this.f21850b.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
