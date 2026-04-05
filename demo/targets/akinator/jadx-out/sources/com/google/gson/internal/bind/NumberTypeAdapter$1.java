package com.google.gson.internal.bind;

import com.google.gson.Gson;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class NumberTypeAdapter$1 implements com.google.gson.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f29938b;

    public NumberTypeAdapter$1(o oVar) {
        this.f29938b = oVar;
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        if (aVar.getRawType() == Number.class) {
            return this.f29938b;
        }
        return null;
    }
}
