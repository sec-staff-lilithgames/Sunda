package bu;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k3 extends AtomicInteger implements pt.c, mt.i0 {

    /* renamed from: s, reason: collision with root package name */
    public static final j3[] f10498s = new j3[0];

    /* renamed from: t, reason: collision with root package name */
    public static final j3[] f10499t = new j3[0];

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10500b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10501c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10502e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10503f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10504g;

    /* renamed from: h, reason: collision with root package name */
    public volatile vt.n f10505h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10506i;

    /* renamed from: j, reason: collision with root package name */
    public final iu.d f10507j = new iu.d();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f10508k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f10509l;

    /* renamed from: m, reason: collision with root package name */
    public pt.c f10510m;

    /* renamed from: n, reason: collision with root package name */
    public long f10511n;

    /* renamed from: o, reason: collision with root package name */
    public long f10512o;

    /* renamed from: p, reason: collision with root package name */
    public int f10513p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayDeque f10514q;

    /* renamed from: r, reason: collision with root package name */
    public int f10515r;

    public k3(int i10, int i11, mt.i0 i0Var, st.o oVar, boolean z10) {
        this.f10500b = i0Var;
        this.f10501c = oVar;
        this.f10502e = z10;
        this.f10503f = i10;
        this.f10504g = i11;
        if (i10 != Integer.MAX_VALUE) {
            this.f10514q = new ArrayDeque(i10);
        }
        this.f10509l = new AtomicReference(f10498s);
    }

    public final boolean a() {
        if (!this.f10508k) {
            Throwable th2 = (Throwable) this.f10507j.get();
            if (this.f10502e || th2 == null) {
                return false;
            }
            b();
            Throwable thTerminate = this.f10507j.terminate();
            if (thTerminate != iu.m.f68415a) {
                this.f10500b.onError(thTerminate);
            }
        }
        return true;
    }

    public final boolean b() {
        j3[] j3VarArr;
        this.f10510m.dispose();
        AtomicReference atomicReference = this.f10509l;
        j3[] j3VarArr2 = (j3[]) atomicReference.get();
        j3[] j3VarArr3 = f10499t;
        if (j3VarArr2 == j3VarArr3 || (j3VarArr = (j3[]) atomicReference.getAndSet(j3VarArr3)) == j3VarArr3) {
            return false;
        }
        for (j3 j3Var : j3VarArr) {
            j3Var.dispose();
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101 A[PHI: r4
      0x0101: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e0, B:88:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.k3.d():void");
    }

    @Override // pt.c
    public void dispose() {
        Throwable thTerminate;
        if (this.f10508k) {
            return;
        }
        this.f10508k = true;
        if (!b() || (thTerminate = this.f10507j.terminate()) == null || thTerminate == iu.m.f68415a) {
            return;
        }
        mu.a.onError(thTerminate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(j3 j3Var) {
        j3[] j3VarArr;
        while (true) {
            AtomicReference atomicReference = this.f10509l;
            j3[] j3VarArr2 = (j3[]) atomicReference.get();
            int length = j3VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (j3VarArr2[i10] == j3Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                j3VarArr = f10498s;
            } else {
                j3[] j3VarArr3 = new j3[length - 1];
                System.arraycopy(j3VarArr2, 0, j3VarArr3, 0, i10);
                System.arraycopy(j3VarArr2, i10 + 1, j3VarArr3, i10, (length - i10) - 1);
                j3VarArr = j3VarArr3;
            }
            while (!atomicReference.compareAndSet(j3VarArr2, j3VarArr)) {
                if (atomicReference.get() != j3VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(mt.g0 g0Var) {
        boolean z10;
        do {
            z10 = false;
            if (!(g0Var instanceof Callable)) {
                long j10 = this.f10511n;
                this.f10511n = 1 + j10;
                j3 j3Var = new j3(this, j10);
                AtomicReference atomicReference = this.f10509l;
                while (true) {
                    j3[] j3VarArr = (j3[]) atomicReference.get();
                    if (j3VarArr == f10499t) {
                        j3Var.dispose();
                        return;
                    }
                    int length = j3VarArr.length;
                    j3[] j3VarArr2 = new j3[length + 1];
                    System.arraycopy(j3VarArr, 0, j3VarArr2, 0, length);
                    j3VarArr2[length] = j3Var;
                    while (!atomicReference.compareAndSet(j3VarArr, j3VarArr2)) {
                        if (atomicReference.get() != j3VarArr) {
                            break;
                        }
                    }
                    g0Var.subscribe(j3Var);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) g0Var).call();
                if (objCall != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f10500b.onNext(objCall);
                        if (decrementAndGet() != 0) {
                            d();
                        }
                    } else {
                        vt.n dVar = this.f10505h;
                        if (dVar == null) {
                            dVar = this.f10503f == Integer.MAX_VALUE ? new eu.d(this.f10504g) : new eu.c(this.f10503f);
                            this.f10505h = dVar;
                        }
                        if (dVar.offer(objCall)) {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            d();
                        } else {
                            onError(new IllegalStateException("Scalar queue full?!"));
                        }
                    }
                }
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f10507j.addThrowable(th2);
                c();
            }
            if (this.f10503f == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    g0Var = (mt.g0) this.f10514q.poll();
                    if (g0Var == null) {
                        this.f10515r--;
                        z10 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } while (!z10);
        c();
    }

    public final void g(int i10) {
        while (true) {
            int i11 = i10 - 1;
            if (i10 == 0) {
                return;
            }
            synchronized (this) {
                try {
                    mt.g0 g0Var = (mt.g0) this.f10514q.poll();
                    if (g0Var == null) {
                        this.f10515r--;
                    } else {
                        f(g0Var);
                    }
                } finally {
                }
            }
            i10 = i11;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10508k;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10506i) {
            return;
        }
        this.f10506i = true;
        c();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10506i) {
            mu.a.onError(th2);
        } else if (!this.f10507j.addThrowable(th2)) {
            mu.a.onError(th2);
        } else {
            this.f10506i = true;
            c();
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10506i) {
            return;
        }
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10501c.apply(obj), "The mapper returned a null ObservableSource");
            if (this.f10503f != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i10 = this.f10515r;
                        if (i10 == this.f10503f) {
                            this.f10514q.offer(g0Var);
                            return;
                        }
                        this.f10515r = i10 + 1;
                    } finally {
                    }
                }
            }
            f(g0Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10510m.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10510m, cVar)) {
            this.f10510m = cVar;
            this.f10500b.onSubscribe(this);
        }
    }
}
