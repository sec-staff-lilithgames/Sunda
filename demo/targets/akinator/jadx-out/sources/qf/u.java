package qf;

import com.google.android.exoplayer2.util.n1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f83012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83013b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f83014c;

    /* renamed from: d, reason: collision with root package name */
    public int f83015d;

    /* renamed from: e, reason: collision with root package name */
    public int f83016e;

    /* renamed from: f, reason: collision with root package name */
    public int f83017f;

    /* renamed from: g, reason: collision with root package name */
    public a[] f83018g;

    public u(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // qf.c
    public synchronized a allocate() {
        a aVar;
        try {
            this.f83016e++;
            int i10 = this.f83017f;
            if (i10 > 0) {
                a[] aVarArr = this.f83018g;
                int i11 = i10 - 1;
                this.f83017f = i11;
                aVar = (a) com.google.android.exoplayer2.util.a.checkNotNull(aVarArr[i11]);
                this.f83018g[this.f83017f] = null;
            } else {
                aVar = new a(new byte[this.f83013b], 0);
                int i12 = this.f83016e;
                a[] aVarArr2 = this.f83018g;
                if (i12 > aVarArr2.length) {
                    this.f83018g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // qf.c
    public int getIndividualAllocationLength() {
        return this.f83013b;
    }

    @Override // qf.c
    public synchronized int getTotalBytesAllocated() {
        return this.f83016e * this.f83013b;
    }

    @Override // qf.c
    public synchronized void release(a aVar) {
        a[] aVarArr = this.f83018g;
        int i10 = this.f83017f;
        this.f83017f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f83016e--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.f83012a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i10) {
        boolean z10 = i10 < this.f83015d;
        this.f83015d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // qf.c
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, n1.ceilDivide(this.f83015d, this.f83013b) - this.f83016e);
            int i11 = this.f83017f;
            if (iMax >= i11) {
                return;
            }
            if (this.f83014c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) com.google.android.exoplayer2.util.a.checkNotNull(this.f83018g[i10]);
                    if (aVar.f82906a == this.f83014c) {
                        i10++;
                    } else {
                        a aVar2 = (a) com.google.android.exoplayer2.util.a.checkNotNull(this.f83018g[i12]);
                        if (aVar2.f82906a != this.f83014c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f83018g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f83017f) {
                    return;
                }
            }
            Arrays.fill(this.f83018g, iMax, this.f83017f, (Object) null);
            this.f83017f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public u(boolean z10, int i10, int i11) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0);
        com.google.android.exoplayer2.util.a.checkArgument(i11 >= 0);
        this.f83012a = z10;
        this.f83013b = i10;
        this.f83017f = i11;
        this.f83018g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f83014c = null;
            return;
        }
        this.f83014c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f83018g[i12] = new a(this.f83014c, i12 * i10);
        }
    }

    @Override // qf.c
    public synchronized void release(b bVar) {
        while (bVar != null) {
            try {
                a[] aVarArr = this.f83018g;
                int i10 = this.f83017f;
                this.f83017f = i10 + 1;
                aVarArr[i10] = bVar.getAllocation();
                this.f83016e--;
                bVar = bVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }
}
