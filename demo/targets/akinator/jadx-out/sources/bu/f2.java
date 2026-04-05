package bu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f2 implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10296c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10297e;

    /* renamed from: f, reason: collision with root package name */
    public final m0.a f10298f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10299g;

    /* renamed from: h, reason: collision with root package name */
    public pt.c f10300h;

    public f2(mt.i0 i0Var, long j10, TimeUnit timeUnit, m0.a aVar, boolean z10) {
        this.f10295b = i0Var;
        this.f10296c = j10;
        this.f10297e = timeUnit;
        this.f10298f = aVar;
        this.f10299g = z10;
    }

    @Override // pt.c
    public void dispose() {
        this.f10300h.dispose();
        this.f10298f.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10298f.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10298f.schedule(new c2(this), this.f10296c, this.f10297e);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10298f.schedule(new d2(this, th2), this.f10299g ? this.f10296c : 0L, this.f10297e);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10298f.schedule(new e2(this, obj), this.f10296c, this.f10297e);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10300h, cVar)) {
            this.f10300h = cVar;
            this.f10295b.onSubscribe(this);
        }
    }
}
