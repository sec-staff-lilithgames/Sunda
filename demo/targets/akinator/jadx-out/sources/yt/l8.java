package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l8 extends AtomicInteger implements mt.q, pt.c {

    /* renamed from: k, reason: collision with root package name */
    public static final k8[] f95871k = new k8[0];

    /* renamed from: l, reason: collision with root package name */
    public static final k8[] f95872l = new k8[0];

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f95873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95874c;

    /* renamed from: h, reason: collision with root package name */
    public volatile Object f95878h;

    /* renamed from: i, reason: collision with root package name */
    public int f95879i;

    /* renamed from: j, reason: collision with root package name */
    public volatile vt.o f95880j;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f95877g = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95875e = new AtomicReference(f95871k);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f95876f = new AtomicBoolean();

    public l8(AtomicReference atomicReference, int i10) {
        this.f95873b = atomicReference;
        this.f95874c = i10;
    }

    public final boolean a(Object obj, boolean z10) {
        int i10 = 0;
        if (obj != null) {
            boolean zIsComplete = iu.u.isComplete(obj);
            k8[] k8VarArr = f95872l;
            AtomicReference atomicReference = this.f95875e;
            AtomicReference atomicReference2 = this.f95873b;
            if (!zIsComplete) {
                Throwable error = iu.u.getError(obj);
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                k8[] k8VarArr2 = (k8[]) atomicReference.getAndSet(k8VarArr);
                if (k8VarArr2.length != 0) {
                    int length = k8VarArr2.length;
                    while (i10 < length) {
                        k8VarArr2[i10].f95811b.onError(error);
                        i10++;
                    }
                } else {
                    mu.a.onError(error);
                }
                return true;
            }
            if (z10) {
                while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                }
                k8[] k8VarArr3 = (k8[]) atomicReference.getAndSet(k8VarArr);
                int length2 = k8VarArr3.length;
                while (i10 < length2) {
                    k8VarArr3[i10].f95811b.onComplete();
                    i10++;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
    
        if (r11 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012a, code lost:
    
        if (r26.f95879i == 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012c, code lost:
    
        ((tw.d) r26.f95877g.get()).request(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0138, code lost:
    
        r4 = r0;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yt.l8.b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(k8 k8Var) {
        k8[] k8VarArr;
        while (true) {
            AtomicReference atomicReference = this.f95875e;
            k8[] k8VarArr2 = (k8[]) atomicReference.get();
            int length = k8VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (k8VarArr2[i10].equals(k8Var)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                k8VarArr = f95871k;
            } else {
                k8[] k8VarArr3 = new k8[length - 1];
                System.arraycopy(k8VarArr2, 0, k8VarArr3, 0, i10);
                System.arraycopy(k8VarArr2, i10 + 1, k8VarArr3, i10, (length - i10) - 1);
                k8VarArr = k8VarArr3;
            }
            while (!atomicReference.compareAndSet(k8VarArr2, k8VarArr)) {
                if (atomicReference.get() != k8VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f95875e;
        Object obj = atomicReference2.get();
        Object obj2 = f95872l;
        if (obj == obj2 || ((k8[]) atomicReference2.getAndSet(obj2)) == obj2) {
            return;
        }
        do {
            atomicReference = this.f95873b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        hu.g.cancel(this.f95877g);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95875e.get() == f95872l;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95878h == null) {
            this.f95878h = iu.u.complete();
            b();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95878h != null) {
            mu.a.onError(th2);
        } else {
            this.f95878h = iu.u.error(th2);
            b();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95879i != 0 || this.f95880j.offer(obj)) {
            b();
        } else {
            onError(new qt.e("Prefetch queue is full?!"));
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this.f95877g, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f95879i = iRequestFusion;
                    this.f95880j = lVar;
                    this.f95878h = iu.u.complete();
                    b();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f95879i = iRequestFusion;
                    this.f95880j = lVar;
                    dVar.request(this.f95874c);
                    return;
                }
            }
            this.f95880j = new eu.c(this.f95874c);
            dVar.request(this.f95874c);
        }
    }
}
