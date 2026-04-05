package as;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7992b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7993c;

    public n(byte[] bArr, int i10, int i11) {
        this.f7993c = bArr;
        this.f7991a = i10;
        this.f7992b = i11;
    }

    public void a(n nVar) {
        double[] dArr = (double[]) this.f7993c;
        int i10 = nVar.f7992b;
        double[] dArr2 = (double[]) nVar.f7993c;
        int i11 = this.f7991a;
        int i12 = this.f7992b;
        int i13 = (i11 + i12) << 1;
        while (i12 < i13) {
            double d10 = dArr[i12];
            int i14 = i12 + 1;
            double d11 = dArr[i14];
            int i15 = i10 + 1;
            dArr[i12] = bc.g.fma(d10, dArr2[i10], dArr2[i15] * d11);
            dArr[i14] = bc.g.fma(-d10, dArr2[i15], d11 * dArr2[i10]);
            i10 += 2;
            i12 += 2;
        }
    }

    public void b(n nVar) {
        int i10 = nVar.f7992b;
        double[] dArr = (double[]) nVar.f7993c;
        int i11 = this.f7991a;
        int i12 = this.f7992b;
        int i13 = (i11 + i12) << 1;
        while (i12 < i13) {
            double[] dArr2 = (double[]) this.f7993c;
            double d10 = dArr2[i12];
            dArr2[i12] = dArr[i10] * d10;
            dArr2[i12 + 1] = d10 * dArr[i10 + 1];
            i10 += 2;
            i12 += 2;
        }
    }

    public double c(int i10) {
        return ((double[]) this.f7993c)[(i10 << 1) + this.f7992b + 1];
    }

    public void d(int i10, double d10) {
        ((double[]) this.f7993c)[(i10 << 1) + this.f7992b + 1] = d10;
    }

    public int e(int i10) {
        return (i10 << 1) + this.f7992b + 1;
    }

    public void f(int i10, bc.i iVar) {
        int iM = m(i10);
        int iE = e(i10);
        double[] dArr = (double[]) this.f7993c;
        double d10 = dArr[iM];
        double d11 = dArr[iE];
        dArr[iM] = bc.g.fma(d10, iVar.f9033a, (-d11) * iVar.f9034b);
        dArr[iE] = bc.g.fma(d10, iVar.f9034b, iVar.f9033a * d11);
    }

    public void g(int i10, bc.i iVar) {
        int iM = m(i10);
        int iE = e(i10);
        double[] dArr = (double[]) this.f7993c;
        double d10 = dArr[iM];
        double d11 = -dArr[iE];
        dArr[iM] = bc.g.fma(-d10, iVar.f9034b, iVar.f9033a * d11);
        dArr[iE] = bc.g.fma(d10, iVar.f9033a, d11 * iVar.f9034b);
    }

    public void h(int i10, bc.i iVar) {
        int iM = m(i10);
        int iE = e(i10);
        double[] dArr = (double[]) this.f7993c;
        double d10 = dArr[iM];
        double d11 = dArr[iE];
        dArr[iM] = bc.g.fma(d10, iVar.f9033a, iVar.f9034b * d11);
        dArr[iE] = bc.g.fma(-d10, iVar.f9034b, d11 * iVar.f9033a);
    }

    public void i(int i10, bc.i iVar) {
        int iM = m(i10);
        int iE = e(i10);
        double[] dArr = (double[]) this.f7993c;
        double d10 = dArr[iM];
        double d11 = dArr[iE];
        double d12 = -d10;
        dArr[iM] = bc.g.fma(d12, iVar.f9034b, d11 * iVar.f9033a);
        dArr[iE] = bc.g.fma(d12, iVar.f9033a, (-d11) * iVar.f9034b);
    }

    public void j(n nVar) {
        double[] dArr = (double[]) this.f7993c;
        int i10 = nVar.f7992b;
        double[] dArr2 = (double[]) nVar.f7993c;
        int i11 = this.f7991a;
        int i12 = this.f7992b;
        int i13 = (i11 + i12) << 1;
        while (i12 < i13) {
            double d10 = dArr[i12];
            int i14 = i12 + 1;
            double d11 = dArr[i14];
            double d12 = dArr2[i10];
            double d13 = dArr2[i10 + 1];
            dArr[i12] = bc.g.fma(d10, d12, (-d11) * d13);
            dArr[i14] = bc.g.fma(d10, d13, d11 * d12);
            i10 += 2;
            i12 += 2;
        }
    }

    public double k(int i10) {
        return ((double[]) this.f7993c)[(i10 << 1) + this.f7992b];
    }

    public void l(int i10, double d10) {
        ((double[]) this.f7993c)[(i10 << 1) + this.f7992b] = d10;
    }

    public int m(int i10) {
        return (i10 << 1) + this.f7992b;
    }

    public void n(int i10, double d10, double d11) {
        int iM = m(i10);
        double[] dArr = (double[]) this.f7993c;
        dArr[iM] = d10;
        dArr[iM + 1] = d11;
    }

    public void o() {
        double[] dArr = (double[]) this.f7993c;
        int i10 = this.f7991a;
        int i11 = this.f7992b;
        int i12 = (i10 + i11) << 1;
        while (i11 < i12) {
            double d10 = dArr[i11];
            int i13 = i11 + 1;
            double d11 = dArr[i13];
            dArr[i11] = bc.g.fma(d10, d10, (-d11) * d11);
            dArr[i13] = d10 * 2.0d * d11;
            i11 += 2;
        }
    }

    public n() {
        this.f7993c = new n[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f7991a = 0;
        this.f7992b = 0;
    }

    public n(int i10, int i11) {
        this.f7993c = null;
        this.f7991a = i10;
        int i12 = i11 & 7;
        this.f7992b = i12 == 0 ? 8 : i12;
    }

    public n(int i10) {
        this.f7993c = new double[i10 << 1];
        this.f7991a = i10;
        this.f7992b = 0;
    }

    public n(n nVar, int i10, int i11) {
        this.f7991a = i11 - i10;
        this.f7993c = (double[]) nVar.f7993c;
        this.f7992b = i10 << 1;
    }
}
