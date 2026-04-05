package yt;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final int f95185e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95186f;

    /* renamed from: g, reason: collision with root package name */
    public final Callable f95187g;

    public b0(mt.l lVar, int i10, int i11, Callable<Collection<Object>> callable) {
        super(lVar);
        this.f95185e = i10;
        this.f95186f = i11;
        this.f95187g = callable;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        Callable callable = this.f95187g;
        mt.l lVar = this.f95121c;
        int i10 = this.f95185e;
        int i11 = this.f95186f;
        if (i10 == i11) {
            lVar.subscribe((mt.q) new y(cVar, i10, callable));
        } else if (i11 > i10) {
            lVar.subscribe((mt.q) new a0(cVar, i10, i11, callable));
        } else {
            lVar.subscribe((mt.q) new z(cVar, i10, i11, callable));
        }
    }
}
