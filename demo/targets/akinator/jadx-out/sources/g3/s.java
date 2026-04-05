package g3;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import f3.f;
import f3.f0;
import f3.q;
import i2.hQ.aTNDubNmpwAqdU;
import j1.o2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class s {
    public p[] A;

    /* renamed from: b, reason: collision with root package name */
    public View f57221b;

    /* renamed from: c, reason: collision with root package name */
    public int f57222c;

    /* renamed from: j, reason: collision with root package name */
    public a3.d[] f57229j;

    /* renamed from: k, reason: collision with root package name */
    public a3.d f57230k;

    /* renamed from: o, reason: collision with root package name */
    public int[] f57234o;

    /* renamed from: p, reason: collision with root package name */
    public double[] f57235p;

    /* renamed from: q, reason: collision with root package name */
    public double[] f57236q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f57237r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f57238s;

    /* renamed from: x, reason: collision with root package name */
    public HashMap f57243x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f57244y;

    /* renamed from: z, reason: collision with root package name */
    public HashMap f57245z;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f57220a = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public boolean f57223d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f57224e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f57225f = new j0();

    /* renamed from: g, reason: collision with root package name */
    public final j0 f57226g = new j0();

    /* renamed from: h, reason: collision with root package name */
    public final q f57227h = new q();

    /* renamed from: i, reason: collision with root package name */
    public final q f57228i = new q();

    /* renamed from: l, reason: collision with root package name */
    public float f57231l = Float.NaN;

    /* renamed from: m, reason: collision with root package name */
    public float f57232m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f57233n = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    public final float[] f57239t = new float[4];

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f57240u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final float[] f57241v = new float[1];

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f57242w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public s(View view) {
        setView(view);
    }

    public static void h(Rect rect, Rect rect2, int i10, int i11, int i12) {
        if (i10 == 1) {
            int i13 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i12 - ((rect.height() + i13) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 2) {
            int i14 = rect.left + rect.right;
            rect2.left = i11 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i14 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 == 3) {
            int i15 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i15 / 2);
            rect2.top = i12 - ((rect.height() + i15) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i10 != 4) {
            return;
        }
        int i16 = rect.left + rect.right;
        rect2.left = i11 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i16 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final int a(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.f57229j[0].getTimePoints();
        if (iArr != null) {
            Iterator it = this.f57240u.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                iArr[i10] = ((j0) it.next()).f57047r;
                i10++;
            }
        }
        int i11 = 0;
        for (int i12 = 0; i12 < timePoints.length; i12++) {
            this.f57229j[0].getPos(timePoints[i12], this.f57235p);
            this.f57225f.b(timePoints[i12], this.f57234o, this.f57235p, fArr, i11);
            i11 += 2;
        }
        return i11 / 2;
    }

    public void addKey(d dVar) {
        this.f57242w.add(dVar);
    }

    public final void b(float[] fArr, int i10) {
        int i11 = i10;
        float f10 = 1.0f;
        float f11 = 1.0f / (i11 - 1);
        HashMap map = this.f57244y;
        a3.x xVar = map == null ? null : (a3.x) map.get("translationX");
        HashMap map2 = this.f57244y;
        a3.x xVar2 = map2 == null ? null : (a3.x) map2.get("translationY");
        HashMap map3 = this.f57245z;
        f3.f fVar = map3 == null ? null : (f3.f) map3.get("translationX");
        HashMap map4 = this.f57245z;
        f3.f fVar2 = map4 != null ? (f3.f) map4.get("translationY") : null;
        int i12 = 0;
        while (i12 < i11) {
            float fMin = i12 * f11;
            float f12 = this.f57233n;
            float f13 = 0.0f;
            if (f12 != f10) {
                float f14 = this.f57232m;
                if (fMin < f14) {
                    fMin = 0.0f;
                }
                if (fMin > f14 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f14) * f12, f10);
                }
            }
            double d10 = fMin;
            a3.g gVar = this.f57225f.f57032b;
            Iterator it = this.f57240u.iterator();
            float f15 = Float.NaN;
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                a3.g gVar2 = j0Var.f57032b;
                if (gVar2 != null) {
                    float f16 = j0Var.f57034e;
                    if (f16 < fMin) {
                        f13 = f16;
                        gVar = gVar2;
                    } else if (Float.isNaN(f15)) {
                        f15 = j0Var.f57034e;
                    }
                }
            }
            if (gVar != null) {
                if (Float.isNaN(f15)) {
                    f15 = 1.0f;
                }
                d10 = (((float) gVar.get((fMin - f13) / r16)) * (f15 - f13)) + f13;
            }
            this.f57229j[0].getPos(d10, this.f57235p);
            a3.d dVar = this.f57230k;
            if (dVar != null) {
                double[] dArr = this.f57235p;
                if (dArr.length > 0) {
                    dVar.getPos(d10, dArr);
                }
            }
            int i13 = i12 * 2;
            this.f57225f.b(d10, this.f57234o, this.f57235p, fArr, i13);
            if (fVar != null) {
                fArr[i13] = fVar.get(fMin) + fArr[i13];
            } else if (xVar != null) {
                fArr[i13] = xVar.get(fMin) + fArr[i13];
            }
            if (fVar2 != null) {
                int i14 = i13 + 1;
                fArr[i14] = fVar2.get(fMin) + fArr[i14];
            } else if (xVar2 != null) {
                int i15 = i13 + 1;
                fArr[i15] = xVar2.get(fMin) + fArr[i15];
            }
            i12++;
            i11 = i10;
            f10 = 1.0f;
        }
    }

    public final float c(float f10, float[] fArr) {
        float f11 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f12 = this.f57233n;
            if (f12 != 1.0d) {
                float f13 = this.f57232m;
                if (f10 < f13) {
                    f10 = 0.0f;
                }
                if (f10 > f13 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f13) * f12, 1.0f);
                }
            }
        }
        a3.g gVar = this.f57225f.f57032b;
        Iterator it = this.f57240u.iterator();
        float f14 = Float.NaN;
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            a3.g gVar2 = j0Var.f57032b;
            if (gVar2 != null) {
                float f15 = j0Var.f57034e;
                if (f15 < f10) {
                    gVar = gVar2;
                    f11 = f15;
                } else if (Float.isNaN(f14)) {
                    f14 = j0Var.f57034e;
                }
            }
        }
        if (gVar != null) {
            float f16 = (Float.isNaN(f14) ? 1.0f : f14) - f11;
            double d10 = (f10 - f11) / f16;
            f10 = (((float) gVar.get(d10)) * f16) + f11;
            if (fArr != null) {
                fArr[0] = (float) gVar.getDiff(d10);
            }
        }
        return f10;
    }

    public final void d(float f10, float f11, float f12, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f57241v;
        float fC = c(f10, fArr2);
        a3.d[] dVarArr = this.f57229j;
        j0 j0Var = this.f57225f;
        int i10 = 0;
        if (dVarArr == null) {
            j0 j0Var2 = this.f57226g;
            float f13 = j0Var2.f57036g - j0Var.f57036g;
            float f14 = j0Var2.f57037h - j0Var.f57037h;
            float f15 = j0Var2.f57038i - j0Var.f57038i;
            float f16 = (j0Var2.f57039j - j0Var.f57039j) + f14;
            fArr[0] = ((f15 + f13) * f11) + ((1.0f - f11) * f13);
            fArr[1] = (f16 * f12) + ((1.0f - f12) * f14);
            return;
        }
        double d10 = fC;
        dVarArr[0].getSlope(d10, this.f57236q);
        this.f57229j[0].getPos(d10, this.f57235p);
        float f17 = fArr2[0];
        while (true) {
            dArr = this.f57236q;
            if (i10 >= dArr.length) {
                break;
            }
            dArr[i10] = dArr[i10] * f17;
            i10++;
        }
        a3.d dVar = this.f57230k;
        if (dVar == null) {
            int[] iArr = this.f57234o;
            double[] dArr2 = this.f57235p;
            j0Var.getClass();
            j0.e(f11, f12, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f57235p;
        if (dArr3.length > 0) {
            dVar.getPos(d10, dArr3);
            this.f57230k.getSlope(d10, this.f57236q);
            int[] iArr2 = this.f57234o;
            double[] dArr4 = this.f57236q;
            double[] dArr5 = this.f57235p;
            j0Var.getClass();
            j0.e(f11, f12, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e(float f10, int i10, float f11) {
        j0 j0Var = this.f57226g;
        float f12 = j0Var.f57036g;
        j0 j0Var2 = this.f57225f;
        float f13 = j0Var2.f57036g;
        float f14 = f12 - f13;
        float f15 = j0Var.f57037h;
        float f16 = j0Var2.f57037h;
        float f17 = f15 - f16;
        float f18 = (j0Var2.f57038i / 2.0f) + f13;
        float f19 = (j0Var2.f57039j / 2.0f) + f16;
        float fHypot = (float) Math.hypot(f14, f17);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f20 = f10 - f18;
        float f21 = f11 - f19;
        if (((float) Math.hypot(f20, f21)) == 0.0f) {
            return 0.0f;
        }
        float f22 = (f21 * f17) + (f20 * f14);
        if (i10 == 0) {
            return f22 / fHypot;
        }
        if (i10 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f22 * f22));
        }
        if (i10 == 2) {
            return f20 / f14;
        }
        if (i10 == 3) {
            return f21 / f14;
        }
        if (i10 == 4) {
            return f20 / f17;
        }
        if (i10 != 5) {
            return 0.0f;
        }
        return f21 / f17;
    }

    public final boolean f(View view, float f10, long j10, a3.i iVar) {
        f0.b bVar;
        boolean z10;
        int i10;
        boolean z11;
        float f11;
        boolean z12;
        j0 j0Var;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        View view2 = view;
        float fC = c(f10, null);
        int i11 = this.E;
        if (i11 != -1) {
            float f18 = 1.0f / i11;
            float fFloor = ((float) Math.floor(fC / f18)) * f18;
            float f19 = (fC % f18) / f18;
            if (!Float.isNaN(this.F)) {
                f19 = (f19 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fC = ((interpolator != null ? interpolator.getInterpolation(f19) : ((double) f19) > 0.5d ? 1.0f : 0.0f) * f18) + fFloor;
        }
        HashMap map = this.f57244y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((f3.q) it.next()).setProperty(view2, fC);
            }
        }
        HashMap map2 = this.f57243x;
        if (map2 != null) {
            bVar = null;
            boolean property = false;
            for (f3.f0 f0Var : map2.values()) {
                if (f0Var instanceof f0.b) {
                    bVar = (f0.b) f0Var;
                } else {
                    property |= f0Var.setProperty(view2, fC, j10, iVar);
                }
            }
            z10 = property;
        } else {
            bVar = null;
            z10 = false;
        }
        a3.d[] dVarArr = this.f57229j;
        j0 j0Var2 = this.f57225f;
        if (dVarArr != null) {
            double d10 = fC;
            dVarArr[0].getPos(d10, this.f57235p);
            this.f57229j[0].getSlope(d10, this.f57236q);
            a3.d dVar = this.f57230k;
            if (dVar != null) {
                double[] dArr = this.f57235p;
                if (dArr.length > 0) {
                    dVar.getPos(d10, dArr);
                    this.f57230k.getSlope(d10, this.f57236q);
                }
            }
            if (this.H) {
                f11 = fC;
                z12 = z10;
                j0Var = j0Var2;
                f12 = 2.0f;
            } else {
                int[] iArr = this.f57234o;
                double[] dArr2 = this.f57235p;
                double[] dArr3 = this.f57236q;
                f12 = 2.0f;
                boolean z13 = this.f57223d;
                float f20 = j0Var2.f57036g;
                float fCos = j0Var2.f57037h;
                float f21 = j0Var2.f57038i;
                int i12 = 1;
                float f22 = j0Var2.f57039j;
                f11 = fC;
                if (iArr.length != 0) {
                    f14 = f21;
                    if (j0Var2.f57048s.length <= iArr[iArr.length - 1]) {
                        int i13 = iArr[iArr.length - 1] + 1;
                        j0Var2.f57048s = new double[i13];
                        j0Var2.f57049t = new double[i13];
                    }
                } else {
                    f14 = f21;
                }
                Arrays.fill(j0Var2.f57048s, Double.NaN);
                for (int i14 = 0; i14 < iArr.length; i14++) {
                    double[] dArr4 = j0Var2.f57048s;
                    int i15 = iArr[i14];
                    dArr4[i15] = dArr2[i14];
                    j0Var2.f57049t[i15] = dArr3[i14];
                }
                float f23 = Float.NaN;
                float f24 = 0.0f;
                float f25 = 0.0f;
                float f26 = 0.0f;
                int i16 = 0;
                float f27 = f14;
                float f28 = 0.0f;
                while (true) {
                    double[] dArr5 = j0Var2.f57048s;
                    f15 = f22;
                    if (i16 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i16])) {
                        f17 = f24;
                    } else {
                        f17 = f24;
                        float f29 = (float) (Double.isNaN(j0Var2.f57048s[i16]) ? 0.0d : j0Var2.f57048s[i16] + 0.0d);
                        float f30 = (float) j0Var2.f57049t[i16];
                        if (i16 == i12) {
                            f24 = f30;
                            f22 = f15;
                            f20 = f29;
                        } else if (i16 == 2) {
                            f25 = f30;
                            f24 = f17;
                            f22 = f15;
                            fCos = f29;
                        } else if (i16 == 3) {
                            f28 = f30;
                            f24 = f17;
                            f22 = f15;
                            f27 = f29;
                        } else if (i16 == 4) {
                            f26 = f30;
                            f24 = f17;
                            f22 = f29;
                        } else if (i16 == 5) {
                            f24 = f17;
                            f22 = f15;
                            f23 = f29;
                        }
                        i16++;
                        i12 = 1;
                    }
                    f24 = f17;
                    f22 = f15;
                    i16++;
                    i12 = 1;
                }
                float f31 = f24;
                s sVar = j0Var2.f57045p;
                if (sVar != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    sVar.getCenter(d10, fArr, fArr2);
                    float f32 = fArr[0];
                    float f33 = fArr[1];
                    float f34 = fArr2[0];
                    float f35 = fArr2[1];
                    z12 = z10;
                    j0Var = j0Var2;
                    double d11 = f20;
                    double d12 = fCos;
                    float fSin = (float) (((Math.sin(d12) * d11) + f32) - (f27 / 2.0f));
                    fCos = (float) ((f33 - (Math.cos(d12) * d11)) - (f15 / 2.0f));
                    double d13 = f31;
                    double d14 = f25;
                    float fCos2 = (float) ((Math.cos(d12) * d11 * d14) + (Math.sin(d12) * d13) + f34);
                    float fSin2 = (float) ((Math.sin(d12) * d11 * d14) + (f35 - (Math.cos(d12) * d13)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f23)) {
                        f16 = fSin;
                    } else {
                        f16 = fSin;
                        view2.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + f23));
                    }
                    f20 = f16;
                } else {
                    z12 = z10;
                    j0Var = j0Var2;
                    if (!Float.isNaN(f23)) {
                        view2.setRotation(f23 + ((float) Math.toDegrees(Math.atan2((f26 / 2.0f) + f25, (f28 / 2.0f) + f31))) + 0.0f);
                    }
                }
                float f36 = f20 + 0.5f;
                int i17 = (int) f36;
                float f37 = fCos + 0.5f;
                int i18 = (int) f37;
                int i19 = (int) (f36 + f27);
                int i20 = (int) (f37 + f15);
                int i21 = i19 - i17;
                int i22 = i20 - i18;
                if (i21 != view2.getMeasuredWidth() || i22 != view2.getMeasuredHeight() || z13) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(i22, 1073741824));
                }
                view2.layout(i17, i18, i19, i20);
                this.f57223d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f12;
                    float right = (this.D.getRight() + this.D.getLeft()) / f12;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap map3 = this.f57244y;
            if (map3 != null) {
                for (a3.x xVar : map3.values()) {
                    if (xVar instanceof q.b) {
                        double[] dArr6 = this.f57236q;
                        if (dArr6.length > 1) {
                            double d15 = dArr6[0];
                            double d16 = dArr6[1];
                            f13 = f11;
                            ((q.b) xVar).setPathRotate(view2, f13, d15, d16);
                            view2 = view;
                            f11 = f13;
                        } else {
                            f13 = f11;
                        }
                    } else {
                        f13 = f11;
                    }
                    view2 = view;
                    f11 = f13;
                }
            }
            fC = f11;
            if (bVar != null) {
                double[] dArr7 = this.f57236q;
                view2 = view;
                i10 = 1;
                boolean pathRotate = bVar.setPathRotate(view2, iVar, fC, j10, dArr7[0], dArr7[1]);
                fC = fC;
                z11 = z12 | pathRotate;
            } else {
                view2 = view;
                i10 = 1;
                z11 = z12;
            }
            int i23 = i10;
            while (true) {
                a3.d[] dVarArr2 = this.f57229j;
                if (i23 >= dVarArr2.length) {
                    break;
                }
                a3.d dVar2 = dVarArr2[i23];
                float[] fArr3 = this.f57239t;
                dVar2.getPos(d10, fArr3);
                f3.a.setInterpolatedValue((androidx.constraintlayout.widget.b) j0Var.f57046q.get(this.f57237r[i23 - 1]), view2, fArr3);
                i23++;
            }
            q qVar = this.f57227h;
            if (qVar.f57189c == 0) {
                if (fC <= 0.0f) {
                    view2.setVisibility(qVar.f57190e);
                } else {
                    q qVar2 = this.f57228i;
                    if (fC >= 1.0f) {
                        view2.setVisibility(qVar2.f57190e);
                    } else if (qVar2.f57190e != qVar.f57190e) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i24 = 0;
                while (true) {
                    p[] pVarArr = this.A;
                    if (i24 >= pVarArr.length) {
                        break;
                    }
                    pVarArr[i24].conditionallyFire(fC, view2);
                    i24++;
                }
            }
        } else {
            boolean z14 = z10;
            i10 = 1;
            float f38 = j0Var2.f57036g;
            j0 j0Var3 = this.f57226g;
            float fA = o2.a(j0Var3.f57036g, f38, fC, f38);
            float f39 = j0Var2.f57037h;
            float fA2 = o2.a(j0Var3.f57037h, f39, fC, f39);
            float f40 = j0Var2.f57038i;
            float f41 = j0Var3.f57038i;
            float fA3 = o2.a(f41, f40, fC, f40);
            float f42 = j0Var2.f57039j;
            float f43 = j0Var3.f57039j;
            float f44 = fA + 0.5f;
            int i25 = (int) f44;
            float f45 = fA2 + 0.5f;
            int i26 = (int) f45;
            int i27 = (int) (f44 + fA3);
            int iA = (int) (f45 + o2.a(f43, f42, fC, f42));
            int i28 = i27 - i25;
            int i29 = iA - i26;
            if (f41 != f40 || f43 != f42 || this.f57223d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i28, 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                this.f57223d = false;
            }
            view2.layout(i25, i26, i27, iA);
            z11 = z14;
        }
        HashMap map4 = this.f57245z;
        if (map4 != null) {
            for (f3.f fVar : map4.values()) {
                if (fVar instanceof f.a) {
                    double[] dArr8 = this.f57236q;
                    ((f.a) fVar).setPathRotate(view2, fC, dArr8[0], dArr8[i10]);
                } else {
                    fVar.setProperty(view2, fC);
                }
            }
        }
        return z11;
    }

    public final void g(j0 j0Var) {
        j0Var.d((int) this.f57221b.getX(), (int) this.f57221b.getY(), this.f57221b.getWidth(), this.f57221b.getHeight());
    }

    public int getAnimateRelativeTo() {
        return this.f57225f.f57043n;
    }

    public void getCenter(double d10, float[] fArr, float[] fArr2) {
        float f10;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f57229j[0].getPos(d10, dArr);
        this.f57229j[0].getSlope(d10, dArr2);
        float f11 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f57234o;
        j0 j0Var = this.f57225f;
        float f12 = j0Var.f57036g;
        float f13 = j0Var.f57037h;
        float f14 = j0Var.f57038i;
        float f15 = j0Var.f57039j;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f19;
                f11 = f20;
            } else if (i11 == 2) {
                f13 = f19;
                f18 = f20;
            } else if (i11 == 3) {
                f14 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f15 = f19;
                f17 = f20;
            }
        }
        float fCos = (f16 / 2.0f) + f11;
        float fSin = (f17 / 2.0f) + f18;
        s sVar = j0Var.f57045p;
        if (sVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            sVar.getCenter(d10, fArr3, fArr4);
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr4[0];
            float f24 = fArr4[1];
            double d11 = f12;
            double d12 = f13;
            float fSin2 = (float) (((Math.sin(d12) * d11) + f21) - (f14 / 2.0f));
            float fCos2 = (float) ((f22 - (Math.cos(d12) * d11)) - (f15 / 2.0f));
            double d13 = f11;
            double d14 = f18;
            f10 = 2.0f;
            f13 = fCos2;
            fCos = (float) ((Math.cos(d12) * d14) + (Math.sin(d12) * d13) + f23);
            fSin = (float) ((Math.sin(d12) * d14) + (f24 - (Math.cos(d12) * d13)));
            f12 = fSin2;
        } else {
            f10 = 2.0f;
        }
        fArr[0] = (f14 / f10) + f12 + 0.0f;
        fArr[1] = (f15 / f10) + f13 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public float getCenterX() {
        return 0.0f;
    }

    public float getCenterY() {
        return 0.0f;
    }

    public int getDrawPath() {
        int iMax = this.f57225f.f57033c;
        Iterator it = this.f57240u.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((j0) it.next()).f57033c);
        }
        return Math.max(iMax, this.f57226g.f57033c);
    }

    public float getFinalHeight() {
        return this.f57226g.f57039j;
    }

    public float getFinalWidth() {
        return this.f57226g.f57038i;
    }

    public float getFinalX() {
        return this.f57226g.f57036g;
    }

    public float getFinalY() {
        return this.f57226g.f57037h;
    }

    public int getKeyFrameInfo(int i10, int[] iArr) {
        float[] fArr = new float[2];
        Iterator it = this.f57242w.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i13 = dVar.f56928d;
            if (i13 == i10 || i10 != -1) {
                iArr[i12] = 0;
                iArr[i12 + 1] = i13;
                int i14 = dVar.f56925a;
                iArr[i12 + 2] = i14;
                double d10 = i14 / 100.0f;
                this.f57229j[0].getPos(d10, this.f57235p);
                this.f57225f.b(d10, this.f57234o, this.f57235p, fArr, 0);
                iArr[i12 + 3] = Float.floatToIntBits(fArr[0]);
                int i15 = i12 + 4;
                iArr[i15] = Float.floatToIntBits(fArr[1]);
                if (dVar instanceof k) {
                    k kVar = (k) dVar;
                    iArr[i12 + 5] = kVar.f57059p;
                    iArr[i12 + 6] = Float.floatToIntBits(kVar.f57055l);
                    i15 = i12 + 7;
                    iArr[i15] = Float.floatToIntBits(kVar.f57056m);
                }
                int i16 = i15 + 1;
                iArr[i12] = i16 - i12;
                i11++;
                i12 = i16;
            }
        }
        return i11;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator it = this.f57242w.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i12 = dVar.f56925a;
            iArr[i10] = (dVar.f56928d * 1000) + i12;
            double d10 = i12 / 100.0f;
            this.f57229j[0].getPos(d10, this.f57235p);
            this.f57225f.b(d10, this.f57234o, this.f57235p, fArr, i11);
            i11 += 2;
            i10++;
        }
        return i10;
    }

    public float getStartHeight() {
        return this.f57225f.f57039j;
    }

    public float getStartWidth() {
        return this.f57225f.f57038i;
    }

    public float getStartX() {
        return this.f57225f.f57036g;
    }

    public float getStartY() {
        return this.f57225f.f57037h;
    }

    public int getTransformPivotTarget() {
        return this.C;
    }

    public View getView() {
        return this.f57221b;
    }

    public void remeasure() {
        this.f57223d = true;
    }

    public void setDrawPath(int i10) {
        this.f57225f.f57033c = i10;
    }

    public void setPathMotionArc(int i10) {
        this.B = i10;
    }

    public void setStartState(f3.d0 d0Var, View view, int i10, int i11, int i12) {
        j0 j0Var = this.f57225f;
        j0Var.f57034e = 0.0f;
        j0Var.f57035f = 0.0f;
        Rect rect = new Rect();
        if (i10 == 1) {
            int i13 = d0Var.f55327b + d0Var.f55329d;
            rect.left = ((d0Var.f55328c + d0Var.f55330e) - d0Var.width()) / 2;
            rect.top = i11 - ((d0Var.height() + i13) / 2);
            rect.right = d0Var.width() + rect.left;
            rect.bottom = d0Var.height() + rect.top;
        } else if (i10 == 2) {
            int i14 = d0Var.f55327b + d0Var.f55329d;
            rect.left = i12 - ((d0Var.width() + (d0Var.f55328c + d0Var.f55330e)) / 2);
            rect.top = (i14 - d0Var.height()) / 2;
            rect.right = d0Var.width() + rect.left;
            rect.bottom = d0Var.height() + rect.top;
        }
        j0Var.d(rect.left, rect.top, rect.width(), rect.height());
        this.f57227h.setState(rect, view, i10, d0Var.f55326a);
    }

    public void setTransformPivotTarget(int i10) {
        this.C = i10;
        this.D = null;
    }

    public void setView(View view) {
        this.f57221b = view;
        this.f57222c = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i10, int i11, float f10, long j10) {
        ArrayList arrayList;
        HashSet hashSet;
        String[] strArr;
        Iterator it;
        char c10;
        int i12;
        int i13;
        androidx.constraintlayout.widget.b bVar;
        f3.f0 f0VarMakeSpline;
        androidx.constraintlayout.widget.b bVar2;
        Integer num;
        HashSet hashSet2;
        f3.q qVarMakeSpline;
        androidx.constraintlayout.widget.b bVar3;
        q qVar;
        ArrayList arrayList2;
        float fMin;
        float fA;
        new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashMap<String, Integer> map = new HashMap<>();
        int i14 = this.B;
        j0 j0Var = this.f57225f;
        int i15 = -1;
        if (i14 != -1) {
            j0Var.f57042m = i14;
        }
        q qVar2 = this.f57227h;
        float f11 = qVar2.f57192g;
        q qVar3 = this.f57228i;
        if (q.a(f11, qVar3.f57192g)) {
            hashSet4.add("alpha");
        }
        if (q.a(qVar2.f57193h, qVar3.f57193h)) {
            hashSet4.add("elevation");
        }
        int i16 = qVar2.f57190e;
        int i17 = qVar3.f57190e;
        if (i16 != i17 && qVar2.f57189c == 0 && (i16 == 0 || i17 == 0)) {
            hashSet4.add("alpha");
        }
        if (q.a(qVar2.f57194i, qVar3.f57194i)) {
            hashSet4.add("rotation");
        }
        if (!Float.isNaN(qVar2.f57203r) || !Float.isNaN(qVar3.f57203r)) {
            hashSet4.add("transitionPathRotate");
        }
        if (!Float.isNaN(qVar2.f57204s) || !Float.isNaN(qVar3.f57204s)) {
            hashSet4.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (q.a(qVar2.f57195j, qVar3.f57195j)) {
            hashSet4.add("rotationX");
        }
        if (q.a(qVar2.f57188b, qVar3.f57188b)) {
            hashSet4.add("rotationY");
        }
        if (q.a(qVar2.f57198m, qVar3.f57198m)) {
            hashSet4.add("transformPivotX");
        }
        if (q.a(qVar2.f57199n, qVar3.f57199n)) {
            hashSet4.add("transformPivotY");
        }
        if (q.a(qVar2.f57196k, qVar3.f57196k)) {
            hashSet4.add("scaleX");
        }
        if (q.a(qVar2.f57197l, qVar3.f57197l)) {
            hashSet4.add("scaleY");
        }
        if (q.a(qVar2.f57200o, qVar3.f57200o)) {
            hashSet4.add("translationX");
        }
        if (q.a(qVar2.f57201p, qVar3.f57201p)) {
            hashSet4.add("translationY");
        }
        if (q.a(qVar2.f57202q, qVar3.f57202q)) {
            hashSet4.add("translationZ");
        }
        float f12 = Float.NaN;
        j0 j0Var2 = this.f57226g;
        ArrayList arrayList3 = this.f57240u;
        ArrayList arrayList4 = this.f57242w;
        int i18 = 0;
        if (arrayList4 != null) {
            Iterator it2 = arrayList4.iterator();
            ArrayList arrayList5 = null;
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (dVar instanceof k) {
                    k kVar = (k) dVar;
                    j0 j0Var3 = new j0();
                    j0Var3.f57033c = i18;
                    j0Var3.f57040k = f12;
                    j0Var3.f57041l = f12;
                    j0Var3.f57042m = i15;
                    j0Var3.f57043n = i15;
                    j0Var3.f57044o = f12;
                    j0Var3.f57045p = null;
                    j0Var3.f57046q = new LinkedHashMap();
                    j0Var3.f57047r = i18;
                    j0Var3.f57048s = new double[18];
                    j0Var3.f57049t = new double[18];
                    if (j0Var.f57043n != i15) {
                        float f13 = kVar.f56925a / 100.0f;
                        j0Var3.f57034e = f13;
                        j0Var3.f57033c = kVar.f57052i;
                        j0Var3.f57047r = kVar.f57059p;
                        float f14 = Float.isNaN(kVar.f57053j) ? f13 : kVar.f57053j;
                        float f15 = Float.isNaN(kVar.f57054k) ? f13 : kVar.f57054k;
                        arrayList2 = arrayList4;
                        float f16 = j0Var2.f57038i - j0Var.f57038i;
                        float f17 = j0Var2.f57039j;
                        float f18 = j0Var.f57039j;
                        j0Var3.f57035f = j0Var3.f57034e;
                        j0Var3.f57038i = (int) ((f16 * f14) + r15);
                        j0Var3.f57039j = (int) (((f17 - f18) * f15) + f18);
                        qVar = qVar3;
                        if (kVar.f57059p != 2) {
                            float f19 = Float.isNaN(kVar.f57055l) ? f13 : kVar.f57055l;
                            float f20 = j0Var2.f57036g;
                            float f21 = j0Var.f57036g;
                            j0Var3.f57036g = o2.a(f20, f21, f19, f21);
                            if (!Float.isNaN(kVar.f57056m)) {
                                f13 = kVar.f57056m;
                            }
                            float f22 = j0Var2.f57037h;
                            float f23 = j0Var.f57037h;
                            j0Var3.f57037h = o2.a(f22, f23, f13, f23);
                        } else {
                            if (Float.isNaN(kVar.f57055l)) {
                                float f24 = j0Var2.f57036g;
                                float f25 = j0Var.f57036g;
                                fMin = o2.a(f24, f25, f13, f25);
                            } else {
                                fMin = Math.min(f15, f14) * kVar.f57055l;
                            }
                            j0Var3.f57036g = fMin;
                            if (Float.isNaN(kVar.f57056m)) {
                                float f26 = j0Var2.f57037h;
                                float f27 = j0Var.f57037h;
                                fA = o2.a(f26, f27, f13, f27);
                            } else {
                                fA = kVar.f57056m;
                            }
                            j0Var3.f57037h = fA;
                        }
                        j0Var3.f57043n = j0Var.f57043n;
                        j0Var3.f57032b = a3.g.getInterpolator(kVar.f57050g);
                        j0Var3.f57042m = kVar.f57051h;
                    } else {
                        qVar = qVar3;
                        arrayList2 = arrayList4;
                        int i19 = kVar.f57059p;
                        if (i19 == 1) {
                            float f28 = kVar.f56925a / 100.0f;
                            j0Var3.f57034e = f28;
                            j0Var3.f57033c = kVar.f57052i;
                            float f29 = Float.isNaN(kVar.f57053j) ? f28 : kVar.f57053j;
                            float f30 = Float.isNaN(kVar.f57054k) ? f28 : kVar.f57054k;
                            float f31 = j0Var2.f57038i - j0Var.f57038i;
                            float f32 = f28;
                            float f33 = j0Var2.f57039j - j0Var.f57039j;
                            j0Var3.f57035f = j0Var3.f57034e;
                            if (!Float.isNaN(kVar.f57055l)) {
                                f32 = kVar.f57055l;
                            }
                            float f34 = (j0Var.f57038i / 2.0f) + j0Var.f57036g;
                            float f35 = j0Var.f57037h;
                            float f36 = j0Var.f57039j;
                            float f37 = ((j0Var2.f57038i / 2.0f) + j0Var2.f57036g) - f34;
                            float f38 = ((j0Var2.f57039j / 2.0f) + j0Var2.f57037h) - ((f36 / 2.0f) + f35);
                            float f39 = f37 * f32;
                            float f40 = (f31 * f29) / 2.0f;
                            j0Var3.f57036g = (int) ((r7 + f39) - f40);
                            float f41 = f32 * f38;
                            float f42 = (f33 * f30) / 2.0f;
                            j0Var3.f57037h = (int) ((f35 + f41) - f42);
                            j0Var3.f57038i = (int) (r7 + r12);
                            j0Var3.f57039j = (int) (f36 + r15);
                            float f43 = Float.isNaN(kVar.f57056m) ? 0.0f : kVar.f57056m;
                            float f44 = (-f38) * f43;
                            float f45 = f37 * f43;
                            j0Var3.f57047r = 1;
                            float f46 = (int) ((j0Var.f57036g + f39) - f40);
                            float f47 = (int) ((j0Var.f57037h + f41) - f42);
                            j0Var3.f57036g = f46 + f44;
                            j0Var3.f57037h = f47 + f45;
                            j0Var3.f57043n = j0Var3.f57043n;
                            j0Var3.f57032b = a3.g.getInterpolator(kVar.f57050g);
                            j0Var3.f57042m = kVar.f57051h;
                        } else if (i19 == 2) {
                            float f48 = kVar.f56925a / 100.0f;
                            j0Var3.f57034e = f48;
                            j0Var3.f57033c = kVar.f57052i;
                            float f49 = Float.isNaN(kVar.f57053j) ? f48 : kVar.f57053j;
                            float f50 = Float.isNaN(kVar.f57054k) ? f48 : kVar.f57054k;
                            float f51 = j0Var2.f57038i;
                            float f52 = j0Var.f57038i;
                            float f53 = f51 - f52;
                            float f54 = j0Var2.f57039j;
                            float f55 = j0Var.f57039j;
                            float f56 = f54 - f55;
                            j0Var3.f57035f = j0Var3.f57034e;
                            float f57 = (f52 / 2.0f) + j0Var.f57036g;
                            float f58 = j0Var.f57037h;
                            float f59 = (f51 / 2.0f) + j0Var2.f57036g;
                            float f60 = ((f54 / 2.0f) + j0Var2.f57037h) - ((f55 / 2.0f) + f58);
                            float f61 = f53 * f49;
                            j0Var3.f57036g = (int) ((((f59 - f57) * f48) + r7) - (f61 / 2.0f));
                            float f62 = f56 * f50;
                            j0Var3.f57037h = (int) (((f60 * f48) + f58) - (f62 / 2.0f));
                            j0Var3.f57038i = (int) (f52 + f61);
                            j0Var3.f57039j = (int) (f55 + f62);
                            j0Var3.f57047r = 2;
                            if (!Float.isNaN(kVar.f57055l)) {
                                j0Var3.f57036g = (int) (kVar.f57055l * (i10 - ((int) j0Var3.f57038i)));
                            }
                            if (!Float.isNaN(kVar.f57056m)) {
                                j0Var3.f57037h = (int) (kVar.f57056m * (i11 - ((int) j0Var3.f57039j)));
                            }
                            j0Var3.f57043n = j0Var3.f57043n;
                            j0Var3.f57032b = a3.g.getInterpolator(kVar.f57050g);
                            j0Var3.f57042m = kVar.f57051h;
                        } else if (i19 != 3) {
                            float f63 = kVar.f56925a / 100.0f;
                            j0Var3.f57034e = f63;
                            j0Var3.f57033c = kVar.f57052i;
                            float f64 = Float.isNaN(kVar.f57053j) ? f63 : kVar.f57053j;
                            float f65 = Float.isNaN(kVar.f57054k) ? f63 : kVar.f57054k;
                            float f66 = j0Var2.f57038i;
                            float f67 = j0Var.f57038i;
                            float f68 = f66 - f67;
                            float f69 = j0Var2.f57039j;
                            float f70 = j0Var.f57039j;
                            float f71 = f69 - f70;
                            j0Var3.f57035f = j0Var3.f57034e;
                            float f72 = (f67 / 2.0f) + j0Var.f57036g;
                            float f73 = j0Var.f57037h;
                            float f74 = ((f66 / 2.0f) + j0Var2.f57036g) - f72;
                            float f75 = ((f69 / 2.0f) + j0Var2.f57037h) - ((f70 / 2.0f) + f73);
                            float f76 = (f68 * f64) / 2.0f;
                            j0Var3.f57036g = (int) (((f74 * f63) + r7) - f76);
                            float f77 = (f71 * f65) / 2.0f;
                            j0Var3.f57037h = (int) (((f75 * f63) + f73) - f77);
                            j0Var3.f57038i = (int) (f67 + r27);
                            j0Var3.f57039j = (int) (f70 + r30);
                            float f78 = Float.isNaN(kVar.f57055l) ? f63 : kVar.f57055l;
                            float f79 = Float.isNaN(kVar.f57058o) ? 0.0f : kVar.f57058o;
                            float f80 = f78;
                            float f81 = Float.isNaN(kVar.f57056m) ? f63 : kVar.f57056m;
                            float f82 = Float.isNaN(kVar.f57057n) ? 0.0f : kVar.f57057n;
                            j0Var3.f57047r = 0;
                            j0Var3.f57036g = (int) (((f82 * f75) + ((f80 * f74) + j0Var.f57036g)) - f76);
                            j0Var3.f57037h = (int) (((f75 * f81) + ((f74 * f79) + j0Var.f57037h)) - f77);
                            j0Var3.f57032b = a3.g.getInterpolator(kVar.f57050g);
                            j0Var3.f57042m = kVar.f57051h;
                        } else {
                            float f83 = kVar.f56925a / 100.0f;
                            j0Var3.f57034e = f83;
                            j0Var3.f57033c = kVar.f57052i;
                            float f84 = Float.isNaN(kVar.f57053j) ? f83 : kVar.f57053j;
                            float f85 = Float.isNaN(kVar.f57054k) ? f83 : kVar.f57054k;
                            float f86 = j0Var2.f57038i;
                            float f87 = j0Var.f57038i;
                            float f88 = f86 - f87;
                            float f89 = j0Var2.f57039j;
                            float f90 = j0Var.f57039j;
                            float f91 = f89 - f90;
                            j0Var3.f57035f = j0Var3.f57034e;
                            float f92 = (f87 / 2.0f) + j0Var.f57036g;
                            float f93 = (f90 / 2.0f) + j0Var.f57037h;
                            float f94 = (f86 / 2.0f) + j0Var2.f57036g;
                            float f95 = (f89 / 2.0f) + j0Var2.f57037h;
                            if (f92 > f94) {
                                f92 = f94;
                                f94 = f92;
                            }
                            if (f93 <= f95) {
                                f93 = f95;
                                f95 = f93;
                            }
                            float f96 = f94 - f92;
                            float f97 = f93 - f95;
                            float f98 = (f88 * f84) / 2.0f;
                            j0Var3.f57036g = (int) (((f96 * f83) + r7) - f98);
                            float f99 = (f91 * f85) / 2.0f;
                            j0Var3.f57037h = (int) (((f97 * f83) + r7) - f99);
                            j0Var3.f57038i = (int) (f87 + r27);
                            j0Var3.f57039j = (int) (f90 + r30);
                            float f100 = Float.isNaN(kVar.f57055l) ? f83 : kVar.f57055l;
                            float f101 = Float.isNaN(kVar.f57058o) ? 0.0f : kVar.f57058o;
                            float f102 = f100;
                            float f103 = Float.isNaN(kVar.f57056m) ? f83 : kVar.f57056m;
                            float f104 = Float.isNaN(kVar.f57057n) ? 0.0f : kVar.f57057n;
                            j0Var3.f57047r = 0;
                            j0Var3.f57036g = (int) (((f104 * f97) + ((f102 * f96) + j0Var.f57036g)) - f98);
                            j0Var3.f57037h = (int) (((f97 * f103) + ((f96 * f101) + j0Var.f57037h)) - f99);
                            j0Var3.f57032b = a3.g.getInterpolator(kVar.f57050g);
                            j0Var3.f57042m = kVar.f57051h;
                        }
                    }
                    if (Collections.binarySearch(arrayList3, j0Var3) == 0) {
                        Log.e("MotionController", " KeyPath position \"" + j0Var3.f57035f + aTNDubNmpwAqdU.drDVnKkpkn);
                    }
                    arrayList3.add((-r7) - 1, j0Var3);
                    int i20 = kVar.f57063f;
                    if (i20 != -1) {
                        this.f57224e = i20;
                    }
                } else {
                    qVar = qVar3;
                    arrayList2 = arrayList4;
                    if (dVar instanceof h) {
                        dVar.getAttributeNames(hashSet5);
                    } else if (dVar instanceof n) {
                        dVar.getAttributeNames(hashSet3);
                    } else if (dVar instanceof p) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add((p) dVar);
                        arrayList5 = arrayList6;
                    } else {
                        dVar.setInterpolation(map);
                        dVar.getAttributeNames(hashSet4);
                    }
                }
                arrayList4 = arrayList2;
                qVar3 = qVar;
                i15 = -1;
                i18 = 0;
                f12 = Float.NaN;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        q qVar4 = qVar3;
        ArrayList arrayList7 = arrayList4;
        if (arrayList != null) {
            this.A = (p[]) arrayList.toArray(new p[0]);
        }
        if (hashSet4.isEmpty()) {
            hashSet = hashSet3;
        } else {
            this.f57244y = new HashMap();
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    Iterator it4 = arrayList7.iterator();
                    while (it4.hasNext()) {
                        d dVar2 = (d) it4.next();
                        HashSet hashSet6 = hashSet3;
                        HashMap map2 = dVar2.f56929e;
                        if (map2 != null && (bVar3 = (androidx.constraintlayout.widget.b) map2.get(str2)) != null) {
                            sparseArray.append(dVar2.f56925a, bVar3);
                        }
                        hashSet3 = hashSet6;
                    }
                    hashSet2 = hashSet3;
                    qVarMakeSpline = f3.q.makeCustomSpline(str, (SparseArray<androidx.constraintlayout.widget.b>) sparseArray);
                } else {
                    hashSet2 = hashSet3;
                    qVarMakeSpline = f3.q.makeSpline(str);
                }
                if (qVarMakeSpline != null) {
                    qVarMakeSpline.setType(str);
                    this.f57244y.put(str, qVarMakeSpline);
                }
                hashSet3 = hashSet2;
            }
            hashSet = hashSet3;
            if (arrayList7 != null) {
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    d dVar3 = (d) it5.next();
                    if (dVar3 instanceof f) {
                        dVar3.addValues(this.f57244y);
                    }
                }
            }
            qVar2.addValues(this.f57244y, 0);
            qVar4.addValues(this.f57244y, 100);
            for (String str3 : this.f57244y.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                a3.x xVar = (a3.x) this.f57244y.get(str3);
                if (xVar != null) {
                    xVar.setup(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f57243x == null) {
                this.f57243x = new HashMap();
            }
            Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                String str4 = (String) it6.next();
                if (!this.f57243x.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            d dVar4 = (d) it7.next();
                            HashMap map3 = dVar4.f56929e;
                            if (map3 != null && (bVar2 = (androidx.constraintlayout.widget.b) map3.get(str5)) != null) {
                                sparseArray2.append(dVar4.f56925a, bVar2);
                            }
                        }
                        f0VarMakeSpline = f3.f0.makeCustomSpline(str4, sparseArray2);
                    } else {
                        f0VarMakeSpline = f3.f0.makeSpline(str4, j10);
                    }
                    if (f0VarMakeSpline != null) {
                        f0VarMakeSpline.setType(str4);
                        this.f57243x.put(str4, f0VarMakeSpline);
                    }
                }
            }
            if (arrayList7 != null) {
                Iterator it8 = arrayList7.iterator();
                while (it8.hasNext()) {
                    d dVar5 = (d) it8.next();
                    if (dVar5 instanceof n) {
                        ((n) dVar5).addTimeValues(this.f57243x);
                    }
                }
            }
            for (String str6 : this.f57243x.keySet()) {
                ((f3.f0) this.f57243x.get(str6)).setup(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = arrayList3.size();
        int i21 = size + 2;
        j0[] j0VarArr = new j0[i21];
        j0VarArr[0] = j0Var;
        j0VarArr[size + 1] = j0Var2;
        if (arrayList3.size() > 0 && this.f57224e == -1) {
            this.f57224e = 0;
        }
        Iterator it9 = arrayList3.iterator();
        int i22 = 1;
        while (it9.hasNext()) {
            j0VarArr[i22] = (j0) it9.next();
            i22++;
        }
        HashSet hashSet7 = new HashSet();
        for (String str7 : j0Var2.f57046q.keySet()) {
            if (j0Var.f57046q.containsKey(str7)) {
                if (!hashSet4.contains("CUSTOM," + str7)) {
                    hashSet7.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet7.toArray(new String[0]);
        this.f57237r = strArr2;
        this.f57238s = new int[strArr2.length];
        int i23 = 0;
        while (true) {
            strArr = this.f57237r;
            if (i23 >= strArr.length) {
                break;
            }
            String str8 = strArr[i23];
            this.f57238s[i23] = 0;
            int i24 = 0;
            while (true) {
                if (i24 >= i21) {
                    break;
                }
                if (j0VarArr[i24].f57046q.containsKey(str8) && (bVar = (androidx.constraintlayout.widget.b) j0VarArr[i24].f57046q.get(str8)) != null) {
                    int[] iArr = this.f57238s;
                    iArr[i23] = bVar.numberOfInterpolatedValues() + iArr[i23];
                    break;
                }
                i24++;
            }
            i23++;
        }
        boolean z10 = j0VarArr[0].f57042m != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        int i25 = 1;
        while (i25 < i21) {
            j0 j0Var4 = j0VarArr[i25];
            j0 j0Var5 = j0VarArr[i25 - 1];
            boolean zA = j0.a(j0Var4.f57036g, j0Var5.f57036g);
            boolean zA2 = j0.a(j0Var4.f57037h, j0Var5.f57037h);
            boolean z11 = z10;
            zArr[0] = j0.a(j0Var4.f57035f, j0Var5.f57035f) | zArr[0];
            boolean z12 = zA | zA2 | z11;
            zArr[1] = zArr[1] | z12;
            zArr[2] = zArr[2] | z12;
            zArr[3] = zArr[3] | j0.a(j0Var4.f57038i, j0Var5.f57038i);
            zArr[4] = zArr[4] | j0.a(j0Var4.f57039j, j0Var5.f57039j);
            i25++;
            z10 = z11;
        }
        int i26 = 0;
        for (int i27 = 1; i27 < length; i27++) {
            if (zArr[i27]) {
                i26++;
            }
        }
        this.f57234o = new int[i26];
        int iMax = Math.max(2, i26);
        this.f57235p = new double[iMax];
        this.f57236q = new double[iMax];
        int i28 = 0;
        for (int i29 = 1; i29 < length; i29++) {
            if (zArr[i29]) {
                this.f57234o[i28] = i29;
                i28++;
            }
        }
        int[] iArr2 = {i21, this.f57234o.length};
        Class cls = Double.TYPE;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
        double[] dArr2 = new double[i21];
        int i30 = 0;
        while (i30 < i21) {
            j0 j0Var6 = j0VarArr[i30];
            double[] dArr3 = dArr[i30];
            int[] iArr3 = this.f57234o;
            HashSet hashSet8 = hashSet5;
            j0[] j0VarArr2 = j0VarArr;
            float[] fArr = {j0Var6.f57035f, j0Var6.f57036g, j0Var6.f57037h, j0Var6.f57038i, j0Var6.f57039j, j0Var6.f57040k};
            int i31 = 0;
            int i32 = 0;
            while (i31 < iArr3.length) {
                if (iArr3[i31] < 6) {
                    i13 = i30;
                    dArr3[i32] = fArr[r10];
                    i32++;
                } else {
                    i13 = i30;
                }
                i31++;
                i30 = i13;
            }
            int i33 = i30;
            dArr2[i33] = j0VarArr2[i33].f57034e;
            i30 = i33 + 1;
            hashSet5 = hashSet8;
            j0VarArr = j0VarArr2;
        }
        HashSet hashSet9 = hashSet5;
        j0[] j0VarArr3 = j0VarArr;
        int i34 = 0;
        while (true) {
            int[] iArr4 = this.f57234o;
            if (i34 >= iArr4.length) {
                break;
            }
            if (iArr4[i34] < 6) {
                String strO = o2.o(new StringBuilder(), j0.f57031u[this.f57234o[i34]], " [");
                for (int i35 = 0; i35 < i21; i35++) {
                    StringBuilder sbU = p0.o2.u(strO);
                    sbU.append(dArr[i35][i34]);
                    strO = sbU.toString();
                }
            }
            i34++;
        }
        this.f57229j = new a3.d[this.f57237r.length + 1];
        int i36 = 0;
        while (true) {
            String[] strArr3 = this.f57237r;
            if (i36 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i36];
            int i37 = 0;
            int i38 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i37 < i21) {
                if (j0VarArr3[i37].f57046q.containsKey(str9)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i21];
                        androidx.constraintlayout.widget.b bVar4 = (androidx.constraintlayout.widget.b) j0VarArr3[i37].f57046q.get(str9);
                        dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i21, bVar4 == null ? 0 : bVar4.numberOfInterpolatedValues());
                    }
                    j0 j0Var7 = j0VarArr3[i37];
                    double[] dArr6 = dArr4;
                    double[][] dArr7 = dArr5;
                    dArr6[i38] = j0Var7.f57034e;
                    double[] dArr8 = dArr7[i38];
                    androidx.constraintlayout.widget.b bVar5 = (androidx.constraintlayout.widget.b) j0Var7.f57046q.get(str9);
                    if (bVar5 != null) {
                        if (bVar5.numberOfInterpolatedValues() == 1) {
                            dArr8[0] = bVar5.getValueToInterpolate();
                        } else {
                            int iNumberOfInterpolatedValues = bVar5.numberOfInterpolatedValues();
                            bVar5.getValuesToInterpolate(new float[iNumberOfInterpolatedValues]);
                            int i39 = 0;
                            int i40 = 0;
                            while (i39 < iNumberOfInterpolatedValues) {
                                double[] dArr9 = dArr8;
                                dArr9[i40] = r13[i39];
                                i39++;
                                dArr8 = dArr9;
                                i40++;
                                i36 = i36;
                            }
                        }
                    }
                    i12 = i36;
                    i38++;
                    dArr4 = dArr6;
                    dArr5 = dArr7;
                } else {
                    i12 = i36;
                }
                i37++;
                i36 = i12;
            }
            int i41 = i36;
            double[] dArrCopyOf = Arrays.copyOf(dArr4, i38);
            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr5, i38);
            int i42 = i41 + 1;
            this.f57229j[i42] = a3.d.get(this.f57224e, dArrCopyOf, dArr10);
            i36 = i42;
        }
        this.f57229j[0] = a3.d.get(this.f57224e, dArr2, dArr);
        if (j0VarArr3[0].f57042m != -1) {
            int[] iArr5 = new int[i21];
            double[] dArr11 = new double[i21];
            double[][] dArr12 = (double[][]) Array.newInstance((Class<?>) cls, i21, 2);
            for (int i43 = 0; i43 < i21; i43++) {
                iArr5[i43] = j0VarArr3[i43].f57042m;
                dArr11[i43] = r7.f57034e;
                double[] dArr13 = dArr12[i43];
                dArr13[0] = r7.f57036g;
                dArr13[1] = r7.f57037h;
            }
            this.f57230k = a3.d.getArc(iArr5, dArr11, dArr12);
        }
        this.f57245z = new HashMap();
        if (arrayList7 != null) {
            Iterator it10 = hashSet9.iterator();
            float f105 = Float.NaN;
            while (it10.hasNext()) {
                String str10 = (String) it10.next();
                f3.f fVarMakeSpline = f3.f.makeSpline(str10);
                if (fVarMakeSpline != null) {
                    if (fVarMakeSpline.variesByPath() && Float.isNaN(f105)) {
                        float[] fArr2 = new float[2];
                        float f106 = 1.0f / 99;
                        double d10 = 0.0d;
                        double d11 = 0.0d;
                        int i44 = 0;
                        float fHypot = 0.0f;
                        while (i44 < 100) {
                            float f107 = i44 * f106;
                            double d12 = d10;
                            double d13 = f107;
                            a3.g gVar = j0Var.f57032b;
                            Iterator it11 = arrayList3.iterator();
                            float f108 = Float.NaN;
                            float f109 = 0.0f;
                            while (it11.hasNext()) {
                                j0 j0Var8 = (j0) it11.next();
                                Iterator it12 = it10;
                                a3.g gVar2 = j0Var8.f57032b;
                                if (gVar2 != null) {
                                    float f110 = j0Var8.f57034e;
                                    if (f110 < f107) {
                                        f109 = f110;
                                        gVar = gVar2;
                                    } else if (Float.isNaN(f108)) {
                                        f108 = j0Var8.f57034e;
                                    }
                                }
                                it10 = it12;
                            }
                            Iterator it13 = it10;
                            if (gVar != null) {
                                if (Float.isNaN(f108)) {
                                    f108 = 1.0f;
                                }
                                d13 = (((float) gVar.get((f107 - f109) / r20)) * (f108 - f109)) + f109;
                            }
                            this.f57229j[0].getPos(d13, this.f57235p);
                            float[] fArr3 = fArr2;
                            this.f57225f.b(d13, this.f57234o, this.f57235p, fArr3, 0);
                            if (i44 > 0) {
                                c10 = 0;
                                fHypot += (float) Math.hypot(d11 - fArr3[1], d12 - fArr3[0]);
                            } else {
                                c10 = 0;
                            }
                            d10 = fArr3[c10];
                            i44++;
                            d11 = fArr3[1];
                            fArr2 = fArr3;
                            it10 = it13;
                        }
                        it = it10;
                        f105 = fHypot;
                    } else {
                        it = it10;
                    }
                    fVarMakeSpline.setType(str10);
                    this.f57245z.put(str10, fVarMakeSpline);
                    it10 = it;
                }
            }
            Iterator it14 = arrayList7.iterator();
            while (it14.hasNext()) {
                d dVar6 = (d) it14.next();
                if (dVar6 instanceof h) {
                    ((h) dVar6).addCycleValues(this.f57245z);
                }
            }
            Iterator it15 = this.f57245z.values().iterator();
            while (it15.hasNext()) {
                ((f3.f) it15.next()).setup(f105);
            }
        }
    }

    public void setupRelative(s sVar) {
        this.f57225f.setupRelative(sVar, sVar.f57225f);
        this.f57226g.setupRelative(sVar, sVar.f57226g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(" start: x: ");
        j0 j0Var = this.f57225f;
        sb2.append(j0Var.f57036g);
        sb2.append(" y: ");
        sb2.append(j0Var.f57037h);
        sb2.append(" end: x: ");
        j0 j0Var2 = this.f57226g;
        sb2.append(j0Var2.f57036g);
        sb2.append(" y: ");
        sb2.append(j0Var2.f57037h);
        return sb2.toString();
    }
}
