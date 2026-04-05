package go;

import io.bidmachine.media3.common.util.a1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58323b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f58324c;

    /* renamed from: d, reason: collision with root package name */
    public int f58325d;

    /* renamed from: e, reason: collision with root package name */
    public int f58326e;

    /* renamed from: f, reason: collision with root package name */
    public int f58327f;

    /* renamed from: g, reason: collision with root package name */
    public a[] f58328g;

    public l(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // go.c
    public synchronized a allocate() {
        a aVar;
        try {
            this.f58326e++;
            int i10 = this.f58327f;
            if (i10 > 0) {
                a[] aVarArr = this.f58328g;
                int i11 = i10 - 1;
                this.f58327f = i11;
                aVar = (a) io.bidmachine.media3.common.util.a.checkNotNull(aVarArr[i11]);
                this.f58328g[this.f58327f] = null;
            } else {
                aVar = new a(new byte[this.f58323b], 0);
                int i12 = this.f58326e;
                a[] aVarArr2 = this.f58328g;
                if (i12 > aVarArr2.length) {
                    this.f58328g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // go.c
    public int getIndividualAllocationLength() {
        return this.f58323b;
    }

    @Override // go.c
    public synchronized int getTotalBytesAllocated() {
        return this.f58326e * this.f58323b;
    }

    @Override // go.c
    public synchronized void release(a aVar) {
        a[] aVarArr = this.f58328g;
        int i10 = this.f58327f;
        this.f58327f = i10 + 1;
        aVarArr[i10] = aVar;
        this.f58326e--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.f58322a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i10) {
        boolean z10 = i10 < this.f58325d;
        this.f58325d = i10;
        if (z10) {
            trim();
        }
    }

    @Override // go.c
    public synchronized void trim() {
        try {
            int i10 = 0;
            int iMax = Math.max(0, a1.ceilDivide(this.f58325d, this.f58323b) - this.f58326e);
            int i11 = this.f58327f;
            if (iMax >= i11) {
                return;
            }
            if (this.f58324c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) io.bidmachine.media3.common.util.a.checkNotNull(this.f58328g[i10]);
                    if (aVar.f58293a == this.f58324c) {
                        i10++;
                    } else {
                        a aVar2 = (a) io.bidmachine.media3.common.util.a.checkNotNull(this.f58328g[i12]);
                        if (aVar2.f58293a != this.f58324c) {
                            i12--;
                        } else {
                            a[] aVarArr = this.f58328g;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                iMax = Math.max(iMax, i10);
                if (iMax >= this.f58327f) {
                    return;
                }
            }
            Arrays.fill(this.f58328g, iMax, this.f58327f, (Object) null);
            this.f58327f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public l(boolean z10, int i10, int i11) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0);
        io.bidmachine.media3.common.util.a.checkArgument(i11 >= 0);
        this.f58322a = z10;
        this.f58323b = i10;
        this.f58327f = i11;
        this.f58328g = new a[i11 + 100];
        if (i11 <= 0) {
            this.f58324c = null;
            return;
        }
        this.f58324c = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f58328g[i12] = new a(this.f58324c, i12 * i10);
        }
    }

    @Override // go.c
    public synchronized void release(b bVar) {
        while (bVar != null) {
            try {
                a[] aVarArr = this.f58328g;
                int i10 = this.f58327f;
                this.f58327f = i10 + 1;
                aVarArr[i10] = bVar.getAllocation();
                this.f58326e--;
                bVar = bVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }
}
