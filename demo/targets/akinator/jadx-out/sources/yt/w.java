package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final rt.a f96473c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96474e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f96475f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f96476g = new AtomicInteger();

    public w(rt.a aVar, int i10, st.g gVar) {
        this.f96473c = aVar;
        this.f96474e = i10;
        this.f96475f = gVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        rt.a aVar = this.f96473c;
        aVar.subscribe(cVar);
        if (this.f96476g.incrementAndGet() == this.f96474e) {
            aVar.connect(this.f96475f);
        }
    }
}
