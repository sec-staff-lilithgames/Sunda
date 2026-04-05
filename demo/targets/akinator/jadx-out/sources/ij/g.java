package ij;

import android.view.LayoutInflater;
import hj.s;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59648a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59649b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59650c;

    public g(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f59648a = aVar;
        this.f59649b = aVar2;
        this.f59650c = aVar3;
    }

    public static g create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new g(aVar, aVar2, aVar3);
    }

    public static f newInstance(s sVar, LayoutInflater layoutInflater, o oVar) {
        return new f(sVar, layoutInflater, oVar);
    }

    @Override // gj.c, gj.f, ru.a
    public f get() {
        return newInstance((s) this.f59648a.get(), (LayoutInflater) this.f59649b.get(), (o) this.f59650c.get());
    }
}
