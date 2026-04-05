package cu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class v extends AtomicInteger implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f51088b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f51089c;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f51092g;

    /* renamed from: e, reason: collision with root package name */
    public final iu.d f51090e = new iu.d();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f51091f = new AtomicLong();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f51093h = new AtomicInteger();

    public v(tw.c cVar, int i10, int i11) {
        this.f51088b = cVar;
        t[] tVarArr = new t[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            tVarArr[i12] = new t(this, i11);
        }
        this.f51089c = tVarArr;
        this.f51093h.lazySet(i10);
    }

    public final void a() {
        for (t tVar : this.f51089c) {
            tVar.cancel();
        }
    }

    public final void b() {
        for (t tVar : this.f51089c) {
            tVar.f51085g = null;
        }
    }

    public abstract void c();

    @Override // tw.d
    public void cancel() {
        if (this.f51092g) {
            return;
        }
        this.f51092g = true;
        a();
        if (getAndIncrement() == 0) {
            b();
        }
    }

    public abstract void onComplete();

    public abstract void onError(Throwable th2);

    public abstract void onNext(t tVar, Object obj);

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f51091f, j10);
            c();
        }
    }
}
