package a3;

import com.ironsource.C3191e4;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public d f4044a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f4045b = new int[10];

    /* renamed from: c, reason: collision with root package name */
    public float[] f4046c = new float[10];

    /* renamed from: d, reason: collision with root package name */
    public int f4047d;

    /* renamed from: e, reason: collision with root package name */
    public String f4048e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a extends x {

        /* renamed from: f, reason: collision with root package name */
        public final o f4049f;

        /* renamed from: g, reason: collision with root package name */
        public float[] f4050g;

        public a(String str, o oVar) {
            String str2 = str.split(",")[1];
            this.f4049f = oVar;
        }

        @Override // a3.x
        public void setPoint(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setProperty(c3.f fVar, float f10) {
            this.f4044a.getPos(f10, this.f4050g);
            fVar.setCustomValue(this.f4049f.valueAt(0), this.f4050g);
        }

        @Override // a3.x
        public void setup(int i10) {
            o oVar = this.f4049f;
            int size = oVar.size();
            int iNumberOfInterpolatedValues = oVar.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f4050g = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = oVar.keyAt(i11);
                y2.b bVarValueAt = oVar.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                bVarValueAt.getValuesToInterpolate(this.f4050g);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f4050g.length) {
                        dArr2[i11][i12] = r7[i12];
                        i12++;
                    }
                }
            }
            this.f4044a = d.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, y2.b bVar) {
            this.f4049f.append(i10, bVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class b extends x {

        /* renamed from: f, reason: collision with root package name */
        public final p f4051f;

        /* renamed from: g, reason: collision with root package name */
        public float[] f4052g;

        public b(String str, p pVar) {
            String str2 = str.split(",")[1];
            this.f4051f = pVar;
        }

        @Override // a3.x
        public void setPoint(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // a3.x
        public void setProperty(i0 i0Var, float f10) {
            setProperty((y2.h) i0Var, f10);
        }

        @Override // a3.x
        public void setup(int i10) {
            p pVar = this.f4051f;
            int size = pVar.size();
            int iNumberOfInterpolatedValues = pVar.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f4052g = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = pVar.keyAt(i11);
                y2.c cVarValueAt = pVar.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                cVarValueAt.getValuesToInterpolate(this.f4052g);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f4052g.length) {
                        dArr2[i11][i12] = r7[i12];
                        i12++;
                    }
                }
            }
            this.f4044a = d.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, y2.c cVar) {
            this.f4051f.append(i10, cVar);
        }

        public void setProperty(y2.h hVar, float f10) {
            this.f4044a.getPos(f10, this.f4052g);
            this.f4051f.valueAt(0).setInterpolatedValue(hVar, this.f4052g);
        }
    }

    public static x makeCustomSpline(String str, o oVar) {
        return new a(str, oVar);
    }

    public static x makeCustomSplineSet(String str, p pVar) {
        return new b(str, pVar);
    }

    public static x makeSpline(String str, long j10) {
        w wVar = new w();
        wVar.f4043f = str;
        return wVar;
    }

    public float get(float f10) {
        return (float) this.f4044a.getPos(f10, 0);
    }

    public d getCurveFit() {
        return this.f4044a;
    }

    public float getSlope(float f10) {
        return (float) this.f4044a.getSlope(f10, 0);
    }

    public void setPoint(int i10, float f10) {
        int[] iArr = this.f4045b;
        if (iArr.length < this.f4047d + 1) {
            this.f4045b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f4046c;
            this.f4046c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f4045b;
        int i11 = this.f4047d;
        iArr2[i11] = i10;
        this.f4046c[i11] = f10;
        this.f4047d = i11 + 1;
    }

    public void setProperty(i0 i0Var, float f10) {
        i0Var.setValue(e0.getId(this.f4048e), get(f10));
    }

    public void setType(String str) {
        this.f4048e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(int r18) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.x.setup(int):void");
    }

    public String toString() {
        String string = this.f4048e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f4047d; i10++) {
            StringBuilder sbT = a.b.t(string, C3191e4.i.f36529d);
            sbT.append(this.f4045b[i10]);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(this.f4046c[i10]));
            sbT.append(VPCjETNfjxu.eLVCMqLOZsWj);
            string = sbT.toString();
        }
        return string;
    }
}
