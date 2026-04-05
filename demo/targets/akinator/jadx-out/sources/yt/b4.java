package yt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b4 extends AtomicInteger implements mt.q, tw.d {

    /* renamed from: t, reason: collision with root package name */
    public static final a4[] f95203t = new a4[0];

    /* renamed from: u, reason: collision with root package name */
    public static final a4[] f95204u = new a4[0];

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95205b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95206c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95208f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95209g;

    /* renamed from: h, reason: collision with root package name */
    public volatile vt.n f95210h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95211i;

    /* renamed from: j, reason: collision with root package name */
    public final iu.d f95212j = new iu.d();

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f95213k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f95214l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicLong f95215m;

    /* renamed from: n, reason: collision with root package name */
    public tw.d f95216n;

    /* renamed from: o, reason: collision with root package name */
    public long f95217o;

    /* renamed from: p, reason: collision with root package name */
    public long f95218p;

    /* renamed from: q, reason: collision with root package name */
    public int f95219q;

    /* renamed from: r, reason: collision with root package name */
    public int f95220r;

    /* renamed from: s, reason: collision with root package name */
    public final int f95221s;

    public b4(tw.c cVar, st.o oVar, boolean z10, int i10, int i11) {
        AtomicReference atomicReference = new AtomicReference();
        this.f95214l = atomicReference;
        this.f95215m = new AtomicLong();
        this.f95205b = cVar;
        this.f95206c = oVar;
        this.f95207e = z10;
        this.f95208f = i10;
        this.f95209g = i11;
        this.f95221s = Math.max(1, i10 >> 1);
        atomicReference.lazySet(f95203t);
    }

    public final boolean a() {
        if (this.f95213k) {
            vt.n nVar = this.f95210h;
            if (nVar != null) {
                nVar.clear();
                return true;
            }
        } else {
            if (this.f95207e || this.f95212j.get() == null) {
                return false;
            }
            vt.n nVar2 = this.f95210h;
            if (nVar2 != null) {
                nVar2.clear();
            }
            Throwable thTerminate = this.f95212j.terminate();
            if (thTerminate != iu.m.f68415a) {
                this.f95205b.onError(thTerminate);
            }
        }
        return true;
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.b4.c():void");
    }

    @Override // tw.d
    public void cancel() {
        vt.n nVar;
        a4[] a4VarArr;
        if (this.f95213k) {
            return;
        }
        this.f95213k = true;
        this.f95216n.cancel();
        AtomicReference atomicReference = this.f95214l;
        a4[] a4VarArr2 = (a4[]) atomicReference.get();
        a4[] a4VarArr3 = f95204u;
        if (a4VarArr2 != a4VarArr3 && (a4VarArr = (a4[]) atomicReference.getAndSet(a4VarArr3)) != a4VarArr3) {
            for (a4 a4Var : a4VarArr) {
                a4Var.dispose();
            }
            Throwable thTerminate = this.f95212j.terminate();
            if (thTerminate != null && thTerminate != iu.m.f68415a) {
                mu.a.onError(thTerminate);
            }
        }
        if (getAndIncrement() != 0 || (nVar = this.f95210h) == null) {
            return;
        }
        nVar.clear();
    }

    public final vt.n d() {
        vt.n dVar = this.f95210h;
        if (dVar == null) {
            dVar = this.f95208f == Integer.MAX_VALUE ? new eu.d(this.f95209g) : new eu.c(this.f95208f);
            this.f95210h = dVar;
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(a4 a4Var) {
        a4[] a4VarArr;
        while (true) {
            AtomicReference atomicReference = this.f95214l;
            a4[] a4VarArr2 = (a4[]) atomicReference.get();
            int length = a4VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (a4VarArr2[i10] == a4Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                a4VarArr = f95203t;
            } else {
                a4[] a4VarArr3 = new a4[length - 1];
                System.arraycopy(a4VarArr2, 0, a4VarArr3, 0, i10);
                System.arraycopy(a4VarArr2, i10 + 1, a4VarArr3, i10, (length - i10) - 1);
                a4VarArr = a4VarArr3;
            }
            while (!atomicReference.compareAndSet(a4VarArr2, a4VarArr)) {
                if (atomicReference.get() != a4VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95211i) {
            return;
        }
        this.f95211i = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95211i) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f95212j.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        this.f95211i = true;
        if (!this.f95207e) {
            for (a4 a4Var : (a4[]) this.f95214l.getAndSet(f95204u)) {
                a4Var.dispose();
            }
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95211i) {
            return;
        }
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f95206c.apply(obj), "The mapper returned a null Publisher");
            if (!(bVar instanceof Callable)) {
                long j10 = this.f95217o;
                this.f95217o = 1 + j10;
                a4 a4Var = new a4(this, j10);
                AtomicReference atomicReference = this.f95214l;
                while (true) {
                    a4[] a4VarArr = (a4[]) atomicReference.get();
                    if (a4VarArr == f95204u) {
                        a4Var.dispose();
                        return;
                    }
                    int length = a4VarArr.length;
                    a4[] a4VarArr2 = new a4[length + 1];
                    System.arraycopy(a4VarArr, 0, a4VarArr2, 0, length);
                    a4VarArr2[length] = a4Var;
                    while (!atomicReference.compareAndSet(a4VarArr, a4VarArr2)) {
                        if (atomicReference.get() != a4VarArr) {
                            break;
                        }
                    }
                    bVar.subscribe(a4Var);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) bVar).call();
                if (objCall == null) {
                    if (this.f95208f == Integer.MAX_VALUE || this.f95213k) {
                        return;
                    }
                    int i10 = this.f95220r + 1;
                    this.f95220r = i10;
                    int i11 = this.f95221s;
                    if (i10 == i11) {
                        this.f95220r = 0;
                        this.f95216n.request(i11);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j11 = this.f95215m.get();
                    vt.n nVarD = this.f95210h;
                    if (j11 == 0 || !(nVarD == null || nVarD.isEmpty())) {
                        if (nVarD == null) {
                            nVarD = d();
                        }
                        if (!nVarD.offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.f95205b.onNext(objCall);
                        if (j11 != Long.MAX_VALUE) {
                            this.f95215m.decrementAndGet();
                        }
                        if (this.f95208f != Integer.MAX_VALUE && !this.f95213k) {
                            int i12 = this.f95220r + 1;
                            this.f95220r = i12;
                            int i13 = this.f95221s;
                            if (i12 == i13) {
                                this.f95220r = 0;
                                this.f95216n.request(i13);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!d().offer(objCall)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                c();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                this.f95212j.addThrowable(th2);
                b();
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            this.f95216n.cancel();
            onError(th3);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95216n, dVar)) {
            this.f95216n = dVar;
            this.f95205b.onSubscribe(this);
            if (this.f95213k) {
                return;
            }
            int i10 = this.f95208f;
            if (i10 == Integer.MAX_VALUE) {
                dVar.request(Long.MAX_VALUE);
            } else {
                dVar.request(i10);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95215m, j10);
            b();
        }
    }
}
