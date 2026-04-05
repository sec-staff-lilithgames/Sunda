package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final ju.a f11138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11139c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f11140e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicInteger f11141f = new AtomicInteger();

    public w(ju.a aVar, int i10, st.g gVar) {
        this.f11138b = aVar;
        this.f11139c = i10;
        this.f11140e = gVar;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        ju.a aVar = this.f11138b;
        aVar.subscribe(i0Var);
        if (this.f11141f.incrementAndGet() == this.f11139c) {
            aVar.connect(this.f11140e);
        }
    }
}
