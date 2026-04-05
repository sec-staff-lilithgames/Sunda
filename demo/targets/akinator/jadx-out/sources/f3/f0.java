package f3;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 extends a3.c0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends f0 {

        /* renamed from: k, reason: collision with root package name */
        public final String f55331k;

        /* renamed from: l, reason: collision with root package name */
        public final SparseArray f55332l;

        /* renamed from: m, reason: collision with root package name */
        public final SparseArray f55333m = new SparseArray();

        /* renamed from: n, reason: collision with root package name */
        public float[] f55334n;

        public a(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
            this.f55331k = str.split(",")[1];
            this.f55332l = sparseArray;
        }

        @Override // a3.c0
        public void setPoint(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // f3.f0
        public boolean setProperty(View view, float f10, long j10, a3.i iVar) {
            this.f3945a.getPos(f10, this.f55334n);
            float[] fArr = this.f55334n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f3953i;
            if (Float.isNaN(this.f3954j)) {
                float floatValue = iVar.getFloatValue(view, this.f55331k, 0);
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
                float[] fArr2 = this.f3951g;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f3952h;
                float f14 = this.f55334n[i10];
                this.f3952h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA) + f12;
                i10++;
            }
            f3.a.setInterpolatedValue((androidx.constraintlayout.widget.b) this.f55332l.valueAt(0), view, this.f3951g);
            if (f11 != 0.0f) {
                this.f3952h = true;
            }
            return this.f3952h;
        }

        @Override // a3.c0
        public void setup(int i10) {
            SparseArray sparseArray = this.f55332l;
            int size = sparseArray.size();
            int iNumberOfInterpolatedValues = ((androidx.constraintlayout.widget.b) sparseArray.valueAt(0)).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i11 = iNumberOfInterpolatedValues + 2;
            this.f55334n = new float[i11];
            this.f3951g = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) sparseArray.valueAt(i12);
                float[] fArr = (float[]) this.f55333m.valueAt(i12);
                dArr[i12] = iKeyAt * 0.01d;
                bVar.getValuesToInterpolate(this.f55334n);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f55334n.length) {
                        dArr2[i12][i13] = r10[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iNumberOfInterpolatedValues] = fArr[0];
                dArr3[iNumberOfInterpolatedValues + 1] = fArr[1];
            }
            this.f3945a = a3.d.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, androidx.constraintlayout.widget.b bVar, float f10, int i11, float f11) {
            this.f55332l.append(i10, bVar);
            this.f55333m.append(i10, new float[]{f10, f11});
            this.f3946b = Math.max(this.f3946b, i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends f0 {
        public boolean setPathRotate(View view, a3.i iVar, float f10, long j10, double d10, double d11) {
            view.setRotation(get(f10, j10, view, iVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f3952h;
        }

        @Override // f3.f0
        public boolean setProperty(View view, float f10, long j10, a3.i iVar) {
            return this.f3952h;
        }
    }

    public static f0 makeCustomSpline(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
        return new a(str, sparseArray);
    }

    public static f0 makeSpline(String str, long j10) {
        f0 j0Var;
        str.getClass();
        switch (str) {
            case "rotationX":
                j0Var = new j0();
                break;
            case "rotationY":
                j0Var = new k0();
                break;
            case "translationX":
                j0Var = new n0();
                break;
            case "translationY":
                j0Var = new o0();
                break;
            case "translationZ":
                j0Var = new p0();
                break;
            case "progress":
                h0 h0Var = new h0();
                h0Var.f55336k = false;
                j0Var = h0Var;
                break;
            case "scaleX":
                j0Var = new l0();
                break;
            case "scaleY":
                j0Var = new m0();
                break;
            case "rotation":
                j0Var = new i0();
                break;
            case "elevation":
                j0Var = new g0();
                break;
            case "transitionPathRotate":
                j0Var = new b();
                break;
            case "alpha":
                j0Var = new e0();
                break;
            default:
                return null;
        }
        j0Var.f3953i = j10;
        return j0Var;
    }

    public float get(float f10, long j10, View view, a3.i iVar) {
        this.f3945a.getPos(f10, this.f3951g);
        float[] fArr = this.f3951g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f3952h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f3954j)) {
            float floatValue = iVar.getFloatValue(view, this.f3950f, 0);
            this.f3954j = floatValue;
            if (Float.isNaN(floatValue)) {
                this.f3954j = 0.0f;
            }
        }
        float f12 = (float) (((((j10 - this.f3953i) * 1.0E-9d) * f11) + this.f3954j) % 1.0d);
        this.f3954j = f12;
        iVar.setFloatValue(view, this.f3950f, 0, f12);
        this.f3953i = j10;
        float f13 = this.f3951g[0];
        float fA = (a(this.f3954j) * f13) + this.f3951g[2];
        this.f3952h = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fA;
    }

    public abstract boolean setProperty(View view, float f10, long j10, a3.i iVar);
}
