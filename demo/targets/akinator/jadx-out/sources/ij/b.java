package ij;

import android.view.LayoutInflater;
import hj.s;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59623a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59624b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59625c;

    public b(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f59623a = aVar;
        this.f59624b = aVar2;
        this.f59625c = aVar3;
    }

    public static b create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new b(aVar, aVar2, aVar3);
    }

    public static a newInstance(s sVar, LayoutInflater layoutInflater, o oVar) {
        return new a(sVar, layoutInflater, oVar);
    }

    @Override // gj.c, gj.f, ru.a
    public a get() {
        return newInstance((s) this.f59623a.get(), (LayoutInflater) this.f59624b.get(), (o) this.f59625c.get());
    }
}
