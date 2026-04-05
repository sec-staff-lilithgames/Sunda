package a3;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public d f3945a;

    /* renamed from: e, reason: collision with root package name */
    public int f3949e;

    /* renamed from: f, reason: collision with root package name */
    public String f3950f;

    /* renamed from: i, reason: collision with root package name */
    public long f3953i;

    /* renamed from: b, reason: collision with root package name */
    public int f3946b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f3947c = new int[10];

    /* renamed from: d, reason: collision with root package name */
    public final float[][] f3948d = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: g, reason: collision with root package name */
    public float[] f3951g = new float[3];

    /* renamed from: h, reason: collision with root package name */
    public boolean f3952h = false;

    /* renamed from: j, reason: collision with root package name */
    public float f3954j = Float.NaN;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c0 {

        /* renamed from: k, reason: collision with root package name */
        public final String f3955k;

        /* renamed from: l, reason: collision with root package name */
        public final p f3956l;

        /* renamed from: m, reason: collision with root package name */
        public final q f3957m;

        /* renamed from: n, reason: collision with root package name */
        public float[] f3958n;

        /* renamed from: o, reason: collision with root package name */
        public float[] f3959o;

        public a(String str, p pVar) {
            q qVar = new q();
            qVar.f4020a = new int[101];
            qVar.f4021b = new float[101][];
            qVar.clear();
            this.f3957m = qVar;
            this.f3955k = str.split(",")[1];
            this.f3956l = pVar;
        }

        @Override // a3.c0
        public void setPoint(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public boolean setProperty(y2.h hVar, float f10, long j10, i iVar) {
            this.f3945a.getPos(f10, this.f3958n);
            float[] fArr = this.f3958n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f3953i;
            if (Float.isNaN(this.f3954j)) {
                float floatValue = iVar.getFloatValue(hVar, this.f3955k, 0);
                this.f3954j = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.f3954j = 0.0f;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * f11) + this.f3954j) % 1.0d);
            this.f3954j = f13;
            this.f3953i = j10;
            float fA = a(f13);
            this.f3952h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f3959o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f3952h;
                float f14 = this.f3958n[i10];
                this.f3952h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA) + f12;
                i10++;
            }
            this.f3956l.valueAt(0).setInterpolatedValue(hVar, this.f3959o);
            if (f11 != 0.0f) {
                this.f3952h = true;
            }
            return this.f3952h;
        }

        @Override // a3.c0
        public void setup(int i10) {
            p pVar = this.f3956l;
            int size = pVar.size();
            int iNumberOfInterpolatedValues = pVar.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = iNumberOfInterpolatedValues + 2;
            this.f3958n = new float[i11];
            this.f3959o = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = pVar.keyAt(i12);
                y2.c cVarValueAt = pVar.valueAt(i12);
                float[] fArrValueAt = this.f3957m.valueAt(i12);
                dArr[i12] = iKeyAt * 0.01d;
                cVarValueAt.getValuesToInterpolate(this.f3958n);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f3958n.length) {
                        dArr2[i12][i13] = r10[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iNumberOfInterpolatedValues] = fArrValueAt[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArrValueAt[1];
            }
            this.f3945a = d.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, y2.c cVar, float f10, int i11, float f11) {
            this.f3956l.append(i10, cVar);
            this.f3957m.append(i10, new float[]{f10, f11});
            this.f3946b = Math.max(this.f3946b, i11);
        }
    }

    public final float a(float f10) {
        float fAbs;
        switch (this.f3946b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                fAbs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * 6.2831855f);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f10 * 6.2831855f);
        }
        return 1.0f - fAbs;
    }

    public d getCurveFit() {
        return this.f3945a;
    }

    public void setPoint(int i10, float f10, float f11, int i11, float f12) {
        int i12 = this.f3949e;
        this.f3947c[i12] = i10;
        float[] fArr = this.f3948d[i12];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        this.f3946b = Math.max(this.f3946b, i11);
        this.f3949e++;
    }

    public void setType(String str) {
        this.f3950f = str;
    }

    public void setup(int i10) {
        float[][] fArr;
        int i11 = this.f3949e;
        if (i11 == 0) {
            System.err.println("Error no points added to " + this.f3950f);
            return;
        }
        int[] iArr = this.f3947c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (true) {
            fArr = this.f3948d;
            if (i12 <= 0) {
                break;
            }
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            int i15 = i12 - 2;
            int i16 = iArr2[i15];
            if (i14 < i16) {
                int i17 = iArr[i16];
                int i18 = i14;
                int i19 = i18;
                while (i18 < i16) {
                    int i20 = iArr[i18];
                    if (i20 <= i17) {
                        int i21 = iArr[i19];
                        iArr[i19] = i20;
                        iArr[i18] = i21;
                        float[] fArr2 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = fArr2;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float[] fArr3 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = fArr3;
                iArr2[i15] = i19 - 1;
                iArr2[i13] = i14;
                int i23 = i12 + 1;
                iArr2[i12] = i16;
                i12 += 2;
                iArr2[i23] = i19 + 1;
            } else {
                i12 = i15;
            }
        }
        int i24 = 0;
        for (int i25 = 1; i25 < iArr.length; i25++) {
            if (iArr[i25] != iArr[i25 - 1]) {
                i24++;
            }
        }
        if (i24 == 0) {
            i24 = 1;
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 3);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f3949e; i27++) {
            if (i27 <= 0 || iArr[i27] != iArr[i27 - 1]) {
                dArr[i26] = iArr[i27] * 0.01d;
                double[] dArr3 = dArr2[i26];
                float[] fArr4 = fArr[i27];
                dArr3[0] = fArr4[0];
                dArr3[1] = fArr4[1];
                dArr3[2] = fArr4[2];
                i26++;
            }
        }
        this.f3945a = d.get(i10, dArr, dArr2);
    }

    public String toString() {
        String string = this.f3950f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f3949e; i10++) {
            StringBuilder sbT = a.b.t(string, C3191e4.i.f36529d);
            sbT.append(this.f3947c[i10]);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(this.f3948d[i10]));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }
}
