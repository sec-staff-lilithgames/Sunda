package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    public double f3943a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f3944b;

    @Override // a3.d
    public void getPos(double d10, double[] dArr) {
        double[] dArr2 = this.f3944b;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // a3.d
    public void getSlope(double d10, double[] dArr) {
        for (int i10 = 0; i10 < this.f3944b.length; i10++) {
            dArr[i10] = 0.0d;
        }
    }

    @Override // a3.d
    public double[] getTimePoints() {
        return new double[]{this.f3943a};
    }

    @Override // a3.d
    public void getPos(double d10, float[] fArr) {
        int i10 = 0;
        while (true) {
            double[] dArr = this.f3944b;
            if (i10 >= dArr.length) {
                return;
            }
            fArr[i10] = (float) dArr[i10];
            i10++;
        }
    }

    @Override // a3.d
    public double getSlope(double d10, int i10) {
        return 0.0d;
    }

    @Override // a3.d
    public double getPos(double d10, int i10) {
        return this.f3944b[i10];
    }
}
