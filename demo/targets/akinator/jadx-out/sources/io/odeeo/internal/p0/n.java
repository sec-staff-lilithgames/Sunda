package io.odeeo.internal.p0;

import io.odeeo.internal.q0.g0;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65648b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f65649c;

    /* renamed from: d, reason: collision with root package name */
    public final a[] f65650d;

    /* renamed from: e, reason: collision with root package name */
    public int f65651e;

    /* renamed from: f, reason: collision with root package name */
    public int f65652f;

    /* renamed from: g, reason: collision with root package name */
    public int f65653g;

    /* renamed from: h, reason: collision with root package name */
    public a[] f65654h;

    public n(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // io.odeeo.internal.p0.b
    public synchronized a allocate() {
        a aVar;
        try {
            this.f65652f++;
            int i10 = this.f65653g;
            if (i10 > 0) {
                a[] aVarArr = this.f65654h;
                int i11 = i10 - 1;
                this.f65653g = i11;
                aVar = (a) io.odeeo.internal.q0.a.checkNotNull(aVarArr[i11]);
                this.f65654h[this.f65653g] = null;
            } else {
                aVar = new a(new byte[this.f65648b], 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // io.odeeo.internal.p0.b
    public int getIndividualAllocationLength() {
        return this.f65648b;
    }

    @Override // io.odeeo.internal.p0.b
    public synchronized int getTotalBytesAllocated() {
        return this.f65652f * this.f65648b;
    }

    @Override // io.odeeo.internal.p0.b
    public synchronized void release(a aVar) {
        a[] aVarArr = this.f65650d;
        aVarArr[0] = aVar;
        release(aVarArr);
    }

    public synchronized void reset() {
        if (this.f65647a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i10) {
        boolean z10 = i10 < this.f65651e;
        this.f65651e = i10;
        if (z10) {
            trim();
        }
    }

    @Override // io.odeeo.internal.p0.b
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, g0.ceilDivide(this.f65651e, this.f65648b) - this.f65652f);
            int i11 = this.f65653g;
            if (iMax >= i11) {
                return;
            }
            if (this.f65649c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) io.odeeo.internal.q0.a.checkNotNull(this.f65654h[i10]);
                    if (aVar.f65581a == this.f65649c) {
                        i10++;
                    } else {
                        a aVar2 = (a) io.odeeo.internal.q0.a.checkNotNull(this.f65654h[i12]);
                        if (aVar2.f65581a != this.f65649c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f65654h;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f65653g) {
                    return;
                }
            }
            Arrays.fill(this.f65654h, iMax, this.f65653g, (Object) null);
            this.f65653g = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public n(boolean z10, int i10, int i11) {
        io.odeeo.internal.q0.a.checkArgument(i10 > 0);
        io.odeeo.internal.q0.a.checkArgument(i11 >= 0);
        this.f65647a = z10;
        this.f65648b = i10;
        this.f65653g = i11;
        this.f65654h = new a[i11 + 100];
        if (i11 > 0) {
            this.f65649c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f65654h[i12] = new a(this.f65649c, i12 * i10);
            }
        } else {
            this.f65649c = null;
        }
        this.f65650d = new a[1];
    }

    @Override // io.odeeo.internal.p0.b
    public synchronized void release(a[] aVarArr) {
        try {
            int i10 = this.f65653g;
            int length = aVarArr.length + i10;
            a[] aVarArr2 = this.f65654h;
            if (length >= aVarArr2.length) {
                this.f65654h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                a[] aVarArr3 = this.f65654h;
                int i11 = this.f65653g;
                this.f65653g = i11 + 1;
                aVarArr3[i11] = aVar;
            }
            this.f65652f -= aVarArr.length;
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
