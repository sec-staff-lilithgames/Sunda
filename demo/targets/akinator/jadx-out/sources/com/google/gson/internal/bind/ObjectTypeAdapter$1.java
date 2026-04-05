package com.google.gson.internal.bind;

import com.google.gson.Gson;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class ObjectTypeAdapter$1 implements com.google.gson.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.i0 f29939b;

    public ObjectTypeAdapter$1(com.google.gson.i0 i0Var) {
        this.f29939b = i0Var;
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        if (aVar.getRawType() == Object.class) {
            return new q(gson, this.f29939b);
        }
        return null;
    }
}
