package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends a implements mt.q {

    /* renamed from: n, reason: collision with root package name */
    public static final r0[] f96291n = new r0[0];

    /* renamed from: o, reason: collision with root package name */
    public static final r0[] f96292o = new r0[0];

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f96293e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96294f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f96295g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f96296h;

    /* renamed from: i, reason: collision with root package name */
    public final bu.s0 f96297i;

    /* renamed from: j, reason: collision with root package name */
    public bu.s0 f96298j;

    /* renamed from: k, reason: collision with root package name */
    public int f96299k;

    /* renamed from: l, reason: collision with root package name */
    public Throwable f96300l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f96301m;

    public s0(mt.l lVar, int i10) {
        super(lVar);
        this.f96294f = i10;
        this.f96293e = new AtomicBoolean();
        bu.s0 s0Var = new bu.s0(i10, 2);
        this.f96297i = s0Var;
        this.f96298j = s0Var;
        this.f96295g = new AtomicReference(f96291n);
    }

    public final void e(r0 r0Var) {
        if (r0Var.getAndIncrement() != 0) {
            return;
        }
        long j10 = r0Var.f96226h;
        int i10 = r0Var.f96225g;
        bu.s0 s0Var = r0Var.f96224f;
        AtomicLong atomicLong = r0Var.f96223e;
        tw.c cVar = r0Var.f96221b;
        int i11 = this.f96294f;
        int iAddAndGet = 1;
        while (true) {
            boolean z10 = this.f96301m;
            boolean z11 = this.f96296h == j10;
            if (z10 && z11) {
                r0Var.f96224f = null;
                Throwable th2 = this.f96300l;
                if (th2 != null) {
                    cVar.onError(th2);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            if (!z11) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    r0Var.f96224f = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        s0Var = (bu.s0) s0Var.f10942b;
                        i10 = 0;
                    }
                    cVar.onNext(((Object[]) s0Var.f10941a)[i10]);
                    i10++;
                    j10++;
                }
            }
            r0Var.f96226h = j10;
            r0Var.f96225g = i10;
            r0Var.f96224f = s0Var;
            iAddAndGet = r0Var.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96301m = true;
        for (r0 r0Var : (r0[]) this.f96295g.getAndSet(f96292o)) {
            e(r0Var);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96301m) {
            mu.a.onError(th2);
            return;
        }
        this.f96300l = th2;
        this.f96301m = true;
        for (r0 r0Var : (r0[]) this.f96295g.getAndSet(f96292o)) {
            e(r0Var);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        int i10 = this.f96299k;
        if (i10 == this.f96294f) {
            bu.s0 s0Var = new bu.s0(i10, 2);
            ((Object[]) s0Var.f10941a)[0] = obj;
            this.f96299k = 1;
            this.f96298j.f10942b = s0Var;
            this.f96298j = s0Var;
        } else {
            ((Object[]) this.f96298j.f10941a)[i10] = obj;
            this.f96299k = i10 + 1;
        }
        this.f96296h++;
        for (r0 r0Var : (r0[]) this.f96295g.get()) {
            e(r0Var);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        dVar.request(Long.MAX_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        r0 r0Var = new r0(cVar, this);
        cVar.onSubscribe(r0Var);
        loop0: while (true) {
            AtomicReference atomicReference = this.f96295g;
            r0[] r0VarArr = (r0[]) atomicReference.get();
            if (r0VarArr != f96292o) {
                int length = r0VarArr.length;
                r0[] r0VarArr2 = new r0[length + 1];
                System.arraycopy(r0VarArr, 0, r0VarArr2, 0, length);
                r0VarArr2[length] = r0Var;
                while (!atomicReference.compareAndSet(r0VarArr, r0VarArr2)) {
                    if (atomicReference.get() != r0VarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f96293e;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            e(r0Var);
        } else {
            this.f95121c.subscribe((mt.q) this);
        }
    }
}
