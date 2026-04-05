package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static d get(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new s(dArr, dArr2);
        }
        if (i10 != 2) {
            return new r(dArr, dArr2);
        }
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        c cVar = new c();
        cVar.f3943a = d10;
        cVar.f3944b = dArr3;
        return cVar;
    }

    public static d getArc(int[] iArr, double[] dArr, double[][] dArr2) {
        return new b(iArr, dArr, dArr2);
    }

    public abstract double getPos(double d10, int i10);

    public abstract void getPos(double d10, double[] dArr);

    public abstract void getPos(double d10, float[] fArr);

    public abstract double getSlope(double d10, int i10);

    public abstract void getSlope(double d10, double[] dArr);

    public abstract double[] getTimePoints();
}
