package bu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class za extends AtomicBoolean implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11318b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11319c;

    /* renamed from: e, reason: collision with root package name */
    public final long f11320e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f11321f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.m0 f11322g;

    /* renamed from: h, reason: collision with root package name */
    public final eu.d f11323h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11324i;

    /* renamed from: j, reason: collision with root package name */
    public pt.c f11325j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f11326k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f11327l;

    public za(mt.i0 i0Var, long j10, long j11, TimeUnit timeUnit, mt.m0 m0Var, int i10, boolean z10) {
        this.f11318b = i0Var;
        this.f11319c = j10;
        this.f11320e = j11;
        this.f11321f = timeUnit;
        this.f11322g = m0Var;
        this.f11323h = new eu.d(i10);
        this.f11324i = z10;
    }

    public final void a() {
        Throwable th2;
        if (compareAndSet(false, true)) {
            mt.i0 i0Var = this.f11318b;
            eu.d dVar = this.f11323h;
            boolean z10 = this.f11324i;
            long jNow = this.f11322g.now(this.f11321f) - this.f11320e;
            while (!this.f11326k) {
                if (!z10 && (th2 = this.f11327l) != null) {
                    dVar.clear();
                    i0Var.onError(th2);
                    return;
                }
                Object objPoll = dVar.poll();
                if (objPoll == null) {
                    Throwable th3 = this.f11327l;
                    if (th3 != null) {
                        i0Var.onError(th3);
                        return;
                    } else {
                        i0Var.onComplete();
                        return;
                    }
                }
                Object objPoll2 = dVar.poll();
                if (((Long) objPoll).longValue() >= jNow) {
                    i0Var.onNext(objPoll2);
                }
            }
            dVar.clear();
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f11326k) {
            return;
        }
        this.f11326k = true;
        this.f11325j.dispose();
        if (compareAndSet(false, true)) {
            this.f11323h.clear();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f11326k;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11327l = th2;
        a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long jNow = this.f11322g.now(this.f11321f);
        long j10 = this.f11319c;
        boolean z10 = j10 == Long.MAX_VALUE;
        Long lValueOf = Long.valueOf(jNow);
        eu.d dVar = this.f11323h;
        dVar.offer(lValueOf, obj);
        while (!dVar.isEmpty()) {
            if (((Long) dVar.peek()).longValue() > jNow - this.f11320e && (z10 || (dVar.size() >> 1) <= j10)) {
                return;
            }
            dVar.poll();
            dVar.poll();
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f11325j, cVar)) {
            this.f11325j = cVar;
            this.f11318b.onSubscribe(this);
        }
    }
}
