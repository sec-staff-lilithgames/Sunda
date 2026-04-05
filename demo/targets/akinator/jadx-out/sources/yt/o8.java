package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o8 extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: m, reason: collision with root package name */
    public static final n8[] f96069m = new n8[0];

    /* renamed from: n, reason: collision with root package name */
    public static final n8[] f96070n = new n8[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f96071b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f96072c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f96073e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f96074f = new AtomicReference(f96069m);

    /* renamed from: g, reason: collision with root package name */
    public final int f96075g;

    /* renamed from: h, reason: collision with root package name */
    public volatile vt.o f96076h;

    /* renamed from: i, reason: collision with root package name */
    public int f96077i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f96078j;

    /* renamed from: k, reason: collision with root package name */
    public Throwable f96079k;

    /* renamed from: l, reason: collision with root package name */
    public int f96080l;

    public o8(AtomicReference atomicReference, int i10) {
        this.f96071b = atomicReference;
        this.f96075g = i10;
    }

    public final boolean a(boolean z10, boolean z11) {
        if (!z10 || !z11) {
            return false;
        }
        Throwable th2 = this.f96079k;
        if (th2 != null) {
            d(th2);
            return true;
        }
        for (n8 n8Var : (n8[]) this.f96074f.getAndSet(f96070n)) {
            if (!n8Var.isCancelled()) {
                n8Var.f96000b.onComplete();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        vt.o oVar = this.f96076h;
        int i10 = this.f96080l;
        int i11 = this.f96075g;
        int i12 = i11 - (i11 >> 2);
        boolean z10 = this.f96077i != 1;
        vt.o oVar2 = oVar;
        int i13 = i10;
        int iAddAndGet = 1;
        while (true) {
            if (oVar2 != null) {
                n8[] n8VarArr = (n8[]) this.f96074f.get();
                long jMin = Long.MAX_VALUE;
                boolean z11 = false;
                for (n8 n8Var : n8VarArr) {
                    long j10 = n8Var.get();
                    if (j10 != Long.MIN_VALUE) {
                        jMin = Math.min(j10 - n8Var.f96002e, jMin);
                        z11 = true;
                    }
                }
                if (!z11) {
                    jMin = 0;
                }
                for (long j11 = 0; jMin != j11; j11 = 0) {
                    boolean z12 = this.f96078j;
                    try {
                        Object objPoll = oVar2.poll();
                        boolean z13 = objPoll == null;
                        if (a(z12, z13)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        for (n8 n8Var2 : n8VarArr) {
                            if (!n8Var2.isCancelled()) {
                                n8Var2.f96000b.onNext(objPoll);
                                n8Var2.f96002e++;
                            }
                        }
                        if (z10 && (i13 = i13 + 1) == i12) {
                            ((tw.d) this.f96072c.get()).request(i12);
                            i13 = 0;
                        }
                        jMin--;
                        if (n8VarArr != this.f96074f.get()) {
                            break;
                        }
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        ((tw.d) this.f96072c.get()).cancel();
                        oVar2.clear();
                        this.f96078j = true;
                        d(th2);
                        return;
                    }
                }
                if (a(this.f96078j, oVar2.isEmpty())) {
                    return;
                }
            }
            this.f96080l = i13;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (oVar2 == null) {
                oVar2 = this.f96076h;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(n8 n8Var) {
        n8[] n8VarArr;
        while (true) {
            AtomicReference atomicReference = this.f96074f;
            n8[] n8VarArr2 = (n8[]) atomicReference.get();
            int length = n8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (n8VarArr2[i10] == n8Var) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                n8VarArr = f96069m;
            } else {
                n8[] n8VarArr3 = new n8[length - 1];
                System.arraycopy(n8VarArr2, 0, n8VarArr3, 0, i10);
                System.arraycopy(n8VarArr2, i10 + 1, n8VarArr3, i10, (length - i10) - 1);
                n8VarArr = n8VarArr3;
            }
            while (!atomicReference.compareAndSet(n8VarArr2, n8VarArr)) {
                if (atomicReference.get() != n8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    public final void d(Throwable th2) {
        for (n8 n8Var : (n8[]) this.f96074f.getAndSet(f96070n)) {
            if (!n8Var.isCancelled()) {
                n8Var.f96000b.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        AtomicReference atomicReference;
        this.f96074f.getAndSet(f96070n);
        do {
            atomicReference = this.f96071b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        hu.g.cancel(this.f96072c);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f96074f.get() == f96070n;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96078j = true;
        b();
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f96078j) {
            mu.a.onError(th2);
            return;
        }
        this.f96079k = th2;
        this.f96078j = true;
        b();
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f96077i != 0 || this.f96076h.offer(obj)) {
            b();
        } else {
            onError(new qt.e("Prefetch queue is full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f96072c, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f96077i = iRequestFusion;
                    this.f96076h = lVar;
                    this.f96078j = true;
                    b();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f96077i = iRequestFusion;
                    this.f96076h = lVar;
                    dVar.request(this.f96075g);
                    return;
                }
            }
            this.f96076h = new eu.c(this.f96075g);
            dVar.request(this.f96075g);
        }
    }
}
