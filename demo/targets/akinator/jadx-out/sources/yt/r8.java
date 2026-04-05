package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r8 extends mt.l implements mt.q, pt.c {

    /* renamed from: o, reason: collision with root package name */
    public static final s8[] f96253o = new s8[0];

    /* renamed from: p, reason: collision with root package name */
    public static final s8[] f96254p = new s8[0];

    /* renamed from: f, reason: collision with root package name */
    public final int f96257f;

    /* renamed from: g, reason: collision with root package name */
    public final int f96258g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f96259h;

    /* renamed from: j, reason: collision with root package name */
    public volatile vt.o f96261j;

    /* renamed from: k, reason: collision with root package name */
    public int f96262k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f96263l;

    /* renamed from: m, reason: collision with root package name */
    public Throwable f96264m;

    /* renamed from: n, reason: collision with root package name */
    public int f96265n;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f96255c = new AtomicInteger();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f96260i = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f96256e = new AtomicReference(f96253o);

    public r8(int i10, boolean z10) {
        this.f96257f = i10;
        this.f96258g = i10 - (i10 >> 2);
        this.f96259h = z10;
    }

    @Override // pt.c
    public void dispose() {
        vt.o oVar;
        hu.g.cancel(this.f96260i);
        if (this.f96255c.getAndIncrement() != 0 || (oVar = this.f96261j) == null) {
            return;
        }
        oVar.clear();
    }

    public final void e() {
        for (s8 s8Var : (s8[]) this.f96256e.getAndSet(f96254p)) {
            if (s8Var.get() != Long.MIN_VALUE) {
                s8Var.f96316b.onComplete();
            }
        }
    }

    public final void f() {
        AtomicReference atomicReference;
        Throwable th2;
        Throwable th3;
        if (this.f96255c.getAndIncrement() != 0) {
            return;
        }
        vt.o oVar = this.f96261j;
        int i10 = this.f96265n;
        int i11 = this.f96258g;
        boolean z10 = this.f96262k != 1;
        AtomicReference atomicReference2 = this.f96256e;
        s8[] s8VarArr = (s8[]) atomicReference2.get();
        int iAddAndGet = 1;
        while (true) {
            int length = s8VarArr.length;
            if (oVar == null || length == 0) {
                atomicReference = atomicReference2;
            } else {
                int length2 = s8VarArr.length;
                long j10 = Long.MAX_VALUE;
                long j11 = Long.MAX_VALUE;
                int i12 = 0;
                while (i12 < length2) {
                    s8 s8Var = s8VarArr[i12];
                    AtomicReference atomicReference3 = atomicReference2;
                    long j12 = s8Var.get() - s8Var.f96318e;
                    if (j12 == Long.MIN_VALUE) {
                        length--;
                    } else if (j11 > j12) {
                        j11 = j12;
                    }
                    i12++;
                    atomicReference2 = atomicReference3;
                }
                atomicReference = atomicReference2;
                long j13 = 0;
                if (length == 0) {
                    j11 = 0;
                }
                while (j11 != j13) {
                    if (isDisposed()) {
                        oVar.clear();
                        return;
                    }
                    boolean z11 = this.f96263l;
                    if (z11 && !this.f96259h && (th3 = this.f96264m) != null) {
                        g(th3);
                        return;
                    }
                    try {
                        Object objPoll = oVar.poll();
                        boolean z12 = objPoll == null;
                        if (z11 && z12) {
                            Throwable th4 = this.f96264m;
                            if (th4 != null) {
                                g(th4);
                                return;
                            } else {
                                e();
                                return;
                            }
                        }
                        if (z12) {
                            break;
                        }
                        int length3 = s8VarArr.length;
                        int i13 = 0;
                        boolean z13 = false;
                        while (i13 < length3) {
                            s8 s8Var2 = s8VarArr[i13];
                            long j14 = s8Var2.get();
                            if (j14 != Long.MIN_VALUE) {
                                if (j14 != j10) {
                                    s8Var2.f96318e++;
                                }
                                s8Var2.f96316b.onNext(objPoll);
                            } else {
                                z13 = true;
                            }
                            i13++;
                            j10 = Long.MAX_VALUE;
                        }
                        j11--;
                        if (z10 && (i10 = i10 + 1) == i11) {
                            ((tw.d) this.f96260i.get()).request(i11);
                            i10 = 0;
                        }
                        s8[] s8VarArr2 = (s8[]) atomicReference.get();
                        if (z13 || s8VarArr2 != s8VarArr) {
                            s8VarArr = s8VarArr2;
                            break;
                        } else {
                            j13 = 0;
                            j10 = Long.MAX_VALUE;
                        }
                    } catch (Throwable th5) {
                        qt.d.throwIfFatal(th5);
                        hu.g.cancel(this.f96260i);
                        g(th5);
                        return;
                    }
                }
                if (j11 == j13) {
                    if (isDisposed()) {
                        oVar.clear();
                        return;
                    }
                    boolean z14 = this.f96263l;
                    if (z14 && !this.f96259h && (th2 = this.f96264m) != null) {
                        g(th2);
                        return;
                    }
                    if (z14 && oVar.isEmpty()) {
                        Throwable th6 = this.f96264m;
                        if (th6 != null) {
                            g(th6);
                            return;
                        } else {
                            e();
                            return;
                        }
                    }
                }
            }
            this.f96265n = i10;
            iAddAndGet = this.f96255c.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (oVar == null) {
                oVar = this.f96261j;
            }
            s8VarArr = (s8[]) atomicReference.get();
            atomicReference2 = atomicReference;
        }
    }

    public final void g(Throwable th2) {
        for (s8 s8Var : (s8[]) this.f96256e.getAndSet(f96254p)) {
            if (s8Var.get() != Long.MIN_VALUE) {
                s8Var.f96316b.onError(th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(s8 s8Var) {
        s8[] s8VarArr;
        while (true) {
            AtomicReference atomicReference = this.f96256e;
            s8[] s8VarArr2 = (s8[]) atomicReference.get();
            int length = s8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (s8VarArr2[i10] == s8Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                s8VarArr = f96253o;
            } else {
                s8[] s8VarArr3 = new s8[length - 1];
                System.arraycopy(s8VarArr2, 0, s8VarArr3, 0, i10);
                System.arraycopy(s8VarArr2, i10 + 1, s8VarArr3, i10, (length - i10) - 1);
                s8VarArr = s8VarArr3;
            }
            while (!atomicReference.compareAndSet(s8VarArr2, s8VarArr)) {
                if (atomicReference.get() != s8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96260i.get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f96263l) {
            return;
        }
        this.f96263l = true;
        f();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96263l) {
            mu.a.onError(th2);
            return;
        }
        this.f96264m = th2;
        this.f96263l = true;
        f();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96263l) {
            return;
        }
        if (this.f96262k != 0 || this.f96261j.offer(obj)) {
            f();
        } else {
            ((tw.d) this.f96260i.get()).cancel();
            onError(new qt.e());
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f96260i, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f96262k = iRequestFusion;
                    this.f96261j = lVar;
                    this.f96263l = true;
                    f();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f96262k = iRequestFusion;
                    this.f96261j = lVar;
                    iu.z.request(dVar, this.f96257f);
                    return;
                }
            }
            this.f96261j = iu.z.createQueue(this.f96257f);
            iu.z.request(dVar, this.f96257f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        s8 s8Var = new s8(cVar, this);
        cVar.onSubscribe(s8Var);
        while (true) {
            AtomicReference atomicReference = this.f96256e;
            s8[] s8VarArr = (s8[]) atomicReference.get();
            if (s8VarArr == f96254p) {
                Throwable th2 = this.f96264m;
                if (th2 != null) {
                    cVar.onError(th2);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            int length = s8VarArr.length;
            s8[] s8VarArr2 = new s8[length + 1];
            System.arraycopy(s8VarArr, 0, s8VarArr2, 0, length);
            s8VarArr2[length] = s8Var;
            while (!atomicReference.compareAndSet(s8VarArr, s8VarArr2)) {
                if (atomicReference.get() != s8VarArr) {
                    break;
                }
            }
            if (s8Var.isCancelled()) {
                h(s8Var);
                return;
            } else {
                f();
                return;
            }
        }
    }
}
