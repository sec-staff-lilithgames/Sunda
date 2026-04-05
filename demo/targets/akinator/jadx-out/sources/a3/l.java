package a3;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public t f3981a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f3982b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f3983c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3984d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3985e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3986f;

    /* renamed from: g, reason: collision with root package name */
    public d f3987g;

    /* renamed from: h, reason: collision with root package name */
    public double[] f3988h;

    /* renamed from: i, reason: collision with root package name */
    public double[] f3989i;

    public double getLastPhase() {
        return this.f3988h[1];
    }

    public double getSlope(float f10) {
        d dVar = this.f3987g;
        if (dVar != null) {
            double d10 = f10;
            dVar.getSlope(d10, this.f3989i);
            this.f3987g.getPos(d10, this.f3988h);
        } else {
            double[] dArr = this.f3989i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d11 = f10;
        double value = this.f3981a.getValue(d11, this.f3988h[1]);
        double slope = this.f3981a.getSlope(d11, this.f3988h[1], this.f3989i[1]);
        double[] dArr2 = this.f3989i;
        return (slope * this.f3988h[2]) + (value * dArr2[2]) + dArr2[0];
    }

    public double getValues(float f10) {
        d dVar = this.f3987g;
        if (dVar != null) {
            dVar.getPos(f10, this.f3988h);
        } else {
            double[] dArr = this.f3988h;
            dArr[0] = this.f3985e[0];
            dArr[1] = this.f3986f[0];
            dArr[2] = this.f3982b[0];
        }
        double[] dArr2 = this.f3988h;
        return (this.f3981a.getValue(f10, dArr2[1]) * this.f3988h[2]) + dArr2[0];
    }

    public void setPoint(int i10, int i11, float f10, float f11, float f12, float f13) {
        this.f3983c[i10] = i11 / 100.0d;
        this.f3984d[i10] = f10;
        this.f3985e[i10] = f11;
        this.f3986f[i10] = f12;
        this.f3982b[i10] = f13;
    }

    public void setup(float f10) {
        float[] fArr = this.f3984d;
        t tVar = this.f3981a;
        double[] dArr = this.f3983c;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr.length, 3);
        float[] fArr2 = this.f3982b;
        this.f3988h = new double[fArr2.length + 2];
        this.f3989i = new double[fArr2.length + 2];
        if (dArr[0] > 0.0d) {
            tVar.addPoint(0.0d, fArr[0]);
        }
        int length = dArr.length - 1;
        if (dArr[length] < 1.0d) {
            tVar.addPoint(1.0d, fArr[length]);
        }
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            double[] dArr3 = dArr2[i10];
            dArr3[0] = this.f3985e[i10];
            dArr3[1] = this.f3986f[i10];
            dArr3[2] = fArr2[i10];
            tVar.addPoint(dArr[i10], fArr[i10]);
        }
        tVar.normalize();
        if (dArr.length > 1) {
            this.f3987g = d.get(0, dArr, dArr2);
        } else {
            this.f3987g = null;
        }
    }
}
