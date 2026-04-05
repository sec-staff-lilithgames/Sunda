package ij;

import android.view.LayoutInflater;
import hj.s;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59641a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59642b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59643c;

    public e(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f59641a = aVar;
        this.f59642b = aVar2;
        this.f59643c = aVar3;
    }

    public static e create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new e(aVar, aVar2, aVar3);
    }

    public static d newInstance(s sVar, LayoutInflater layoutInflater, o oVar) {
        return new d(sVar, layoutInflater, oVar);
    }

    @Override // gj.c, gj.f, ru.a
    public d get() {
        return newInstance((s) this.f59641a.get(), (LayoutInflater) this.f59642b.get(), (o) this.f59643c.get());
    }
}
