package ij;

import android.view.LayoutInflater;
import hj.s;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59662a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59663b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59664c;

    public i(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f59662a = aVar;
        this.f59663b = aVar2;
        this.f59664c = aVar3;
    }

    public static i create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new i(aVar, aVar2, aVar3);
    }

    public static h newInstance(s sVar, LayoutInflater layoutInflater, o oVar) {
        return new h(sVar, layoutInflater, oVar);
    }

    @Override // gj.c, gj.f, ru.a
    public h get() {
        return newInstance((s) this.f59662a.get(), (LayoutInflater) this.f59663b.get(), (o) this.f59664c.get());
    }
}
