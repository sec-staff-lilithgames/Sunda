package f3;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q extends a3.x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends q {

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f55337f;

        /* renamed from: g, reason: collision with root package name */
        public float[] f55338g;

        public a(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
            String str2 = str.split(",")[1];
            this.f55337f = sparseArray;
        }

        @Override // a3.x
        public void setPoint(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // f3.q
        public void setProperty(View view, float f10) {
            this.f4044a.getPos(f10, this.f55338g);
            f3.a.setInterpolatedValue((androidx.constraintlayout.widget.b) this.f55337f.valueAt(0), view, this.f55338g);
        }

        @Override // a3.x
        public void setup(int i10) {
            SparseArray sparseArray = this.f55337f;
            int size = sparseArray.size();
            int iNumberOfInterpolatedValues = ((androidx.constraintlayout.widget.b) sparseArray.valueAt(0)).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.f55338g = new float[iNumberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iNumberOfInterpolatedValues);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) sparseArray.valueAt(i11);
                dArr[i11] = iKeyAt * 0.01d;
                bVar.getValuesToInterpolate(this.f55338g);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f55338g.length) {
                        dArr2[i11][i12] = r7[i12];
                        i12++;
                    }
                }
            }
            this.f4044a = a3.d.get(i10, dArr, dArr2);
        }

        public void setPoint(int i10, androidx.constraintlayout.widget.b bVar) {
            this.f55337f.append(i10, bVar);
        }
    }

    public static q makeCustomSpline(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
        return new a(str, sparseArray);
    }

    public static q makeSpline(String str) {
        str.getClass();
        switch (str) {
            case "progress":
                u uVar = new u();
                uVar.f55339f = false;
                break;
        }
        return new p();
    }

    public abstract void setProperty(View view, float f10);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends q {
        public void setPathRotate(View view, float f10, double d10, double d11) {
            view.setRotation(get(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // f3.q
        public void setProperty(View view, float f10) {
        }
    }
}
