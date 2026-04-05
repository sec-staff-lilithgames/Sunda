package g3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.gms.ads.AdError;
import g3.l0;
import h2.rl.UeklptUrP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class i0 extends ConstraintLayout implements x3.n0 {

    /* renamed from: z0, reason: collision with root package name */
    public static boolean f56980z0;
    public final a0 A;
    public c B;
    public int C;
    public int D;
    public boolean E;
    public float F;
    public float G;
    public long H;
    public float I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public CopyOnWriteArrayList N;
    public int O;
    public long P;
    public float Q;
    public int R;
    public float S;
    public boolean T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f56981a0;

    /* renamed from: b, reason: collision with root package name */
    public l0 f56982b;

    /* renamed from: b0, reason: collision with root package name */
    public int f56983b0;

    /* renamed from: c, reason: collision with root package name */
    public v f56984c;

    /* renamed from: c0, reason: collision with root package name */
    public int f56985c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f56986d0;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f56987e;

    /* renamed from: e0, reason: collision with root package name */
    public final a3.i f56988e0;

    /* renamed from: f, reason: collision with root package name */
    public float f56989f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f56990f0;

    /* renamed from: g, reason: collision with root package name */
    public int f56991g;

    /* renamed from: g0, reason: collision with root package name */
    public f0 f56992g0;

    /* renamed from: h, reason: collision with root package name */
    public int f56993h;

    /* renamed from: h0, reason: collision with root package name */
    public Runnable f56994h0;

    /* renamed from: i, reason: collision with root package name */
    public int f56995i;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f56996i0;

    /* renamed from: j, reason: collision with root package name */
    public int f56997j;

    /* renamed from: j0, reason: collision with root package name */
    public int f56998j0;

    /* renamed from: k, reason: collision with root package name */
    public int f56999k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f57000k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f57001l;

    /* renamed from: l0, reason: collision with root package name */
    public int f57002l0;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f57003m;

    /* renamed from: m0, reason: collision with root package name */
    public final HashMap f57004m0;

    /* renamed from: n, reason: collision with root package name */
    public long f57005n;

    /* renamed from: n0, reason: collision with root package name */
    public int f57006n0;

    /* renamed from: o, reason: collision with root package name */
    public float f57007o;

    /* renamed from: o0, reason: collision with root package name */
    public int f57008o0;

    /* renamed from: p, reason: collision with root package name */
    public float f57009p;

    /* renamed from: p0, reason: collision with root package name */
    public int f57010p0;

    /* renamed from: q, reason: collision with root package name */
    public float f57011q;

    /* renamed from: q0, reason: collision with root package name */
    public final Rect f57012q0;

    /* renamed from: r, reason: collision with root package name */
    public long f57013r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f57014r0;

    /* renamed from: s, reason: collision with root package name */
    public float f57015s;

    /* renamed from: s0, reason: collision with root package name */
    public h0 f57016s0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f57017t;

    /* renamed from: t0, reason: collision with root package name */
    public final c0 f57018t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f57019u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f57020u0;

    /* renamed from: v, reason: collision with root package name */
    public g0 f57021v;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f57022v0;

    /* renamed from: w, reason: collision with root package name */
    public int f57023w;

    /* renamed from: w0, reason: collision with root package name */
    public View f57024w0;

    /* renamed from: x, reason: collision with root package name */
    public b0 f57025x;

    /* renamed from: x0, reason: collision with root package name */
    public Matrix f57026x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f57027y;

    /* renamed from: y0, reason: collision with root package name */
    public final ArrayList f57028y0;

    /* renamed from: z, reason: collision with root package name */
    public final f3.b f57029z;

    public i0(Context context) {
        super(context);
        this.f56987e = null;
        this.f56989f = 0.0f;
        this.f56991g = -1;
        this.f56993h = -1;
        this.f56995i = -1;
        this.f56997j = 0;
        this.f56999k = 0;
        this.f57001l = true;
        this.f57003m = new HashMap();
        this.f57005n = 0L;
        this.f57007o = 1.0f;
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        this.f57015s = 0.0f;
        this.f57019u = false;
        this.f57023w = 0;
        this.f57027y = false;
        this.f57029z = new f3.b();
        this.A = new a0(this);
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = 0;
        this.P = -1L;
        this.Q = 0.0f;
        this.R = 0;
        this.S = 0.0f;
        this.T = false;
        this.f56988e0 = new a3.i();
        this.f56990f0 = false;
        this.f56994h0 = null;
        this.f56996i0 = null;
        this.f56998j0 = 0;
        this.f57000k0 = false;
        this.f57002l0 = 0;
        this.f57004m0 = new HashMap();
        this.f57012q0 = new Rect();
        this.f57014r0 = false;
        this.f57016s0 = h0.f56973b;
        this.f57018t0 = new c0(this);
        this.f57020u0 = false;
        this.f57022v0 = new RectF();
        this.f57024w0 = null;
        this.f57026x0 = null;
        this.f57028y0 = new ArrayList();
        o(null);
    }

    public static Rect c(i0 i0Var, d3.g gVar) {
        Rect rect = i0Var.f57012q0;
        rect.top = gVar.getY();
        rect.left = gVar.getX();
        rect.right = gVar.getWidth() + rect.left;
        rect.bottom = gVar.getHeight() + rect.top;
        return rect;
    }

    public void addTransitionListener(g0 g0Var) {
        if (this.N == null) {
            this.N = new CopyOnWriteArrayList();
        }
        this.N.add(g0Var);
    }

    public boolean applyViewTransition(int i10, s sVar) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            return l0Var.applyViewTransition(i10, sVar);
        }
        return false;
    }

    public androidx.constraintlayout.widget.k cloneConstraintSet(int i10) {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return null;
        }
        androidx.constraintlayout.widget.k kVarB = l0Var.b(i10);
        androidx.constraintlayout.widget.k kVar = new androidx.constraintlayout.widget.k();
        kVar.clone(kVarB);
        return kVar;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        u0 u0Var;
        ArrayList arrayList = this.M;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((t) it.next()).onPreDraw(canvas);
            }
        }
        j(false);
        l0 l0Var = this.f56982b;
        if (l0Var != null && (u0Var = l0Var.f57081r) != null) {
            ArrayList arrayList2 = u0Var.f57282f;
            ArrayList arrayList3 = u0Var.f57281e;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ((r0) it2.next()).a();
                }
                u0Var.f57281e.removeAll(arrayList2);
                arrayList2.clear();
                if (u0Var.f57281e.isEmpty()) {
                    u0Var.f57281e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.f56982b == null) {
            return;
        }
        if ((this.f57023w & 1) == 1 && !isInEditMode()) {
            this.O++;
            long nanoTime = getNanoTime();
            long j10 = this.P;
            if (j10 != -1) {
                if (nanoTime - j10 > 200000000) {
                    this.Q = ((int) ((this.O / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.O = 0;
                    this.P = nanoTime;
                }
            } else {
                this.P = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            StringBuilder sbU = o2.u(this.Q + " fps " + b.getState(this, this.f56991g) + " -> ");
            sbU.append(b.getState(this, this.f56995i));
            sbU.append(" (progress: ");
            sbU.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sbU.append(" ) state=");
            int i10 = this.f56993h;
            sbU.append(i10 == -1 ? AdError.UNDEFINED_DOMAIN : b.getState(this, i10));
            String string = sbU.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.f57023w > 1) {
            if (this.f57025x == null) {
                this.f57025x = new b0(this);
            }
            this.f57025x.draw(canvas, this.f57003m, this.f56982b.getDuration(), this.f57023w);
        }
        ArrayList arrayList4 = this.M;
        if (arrayList4 != null) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                ((t) it3.next()).onPostDraw(canvas);
            }
        }
    }

    public void enableTransition(int i10, boolean z10) {
        l0.a transition = getTransition(i10);
        if (z10) {
            transition.setEnabled(true);
            return;
        }
        l0 l0Var = this.f56982b;
        if (transition == l0Var.f57066c) {
            Iterator<l0.a> it = l0Var.getTransitionsWithState(this.f56993h).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l0.a next = it.next();
                if (next.isEnabled()) {
                    this.f56982b.f57066c = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    public void enableViewTransition(int i10, boolean z10) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            l0Var.enableViewTransition(i10, z10);
        }
    }

    public void fireTrigger(int i10, boolean z10, float f10) {
        g0 g0Var = this.f57021v;
        if (g0Var != null) {
            g0Var.onTransitionTrigger(this, i10, z10, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.N;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((g0) it.next()).onTransitionTrigger(this, i10, z10, f10);
            }
        }
    }

    public androidx.constraintlayout.widget.k getConstraintSet(int i10) {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return null;
        }
        return l0Var.b(i10);
    }

    public int[] getConstraintSetIds() {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return null;
        }
        return l0Var.getConstraintSetIds();
    }

    public int getCurrentState() {
        return this.f56993h;
    }

    public ArrayList<l0.a> getDefinedTransitions() {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return null;
        }
        return l0Var.getDefinedTransitions();
    }

    public c getDesignTool() {
        if (this.B == null) {
            this.B = new c(this);
        }
        return this.B;
    }

    public int getEndState() {
        return this.f56995i;
    }

    public int[] getMatchingConstraintSetIds(String... strArr) {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return null;
        }
        return l0Var.getMatchingStateLabels(strArr);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f57011q;
    }

    public l0 getScene() {
        return this.f56982b;
    }

    public int getStartState() {
        return this.f56991g;
    }

    public float getTargetPosition() {
        return this.f57015s;
    }

    public l0.a getTransition(int i10) {
        return this.f56982b.getTransitionById(i10);
    }

    public Bundle getTransitionState() {
        if (this.f56992g0 == null) {
            this.f56992g0 = new f0(this);
        }
        this.f56992g0.recordState();
        return this.f56992g0.getTransitionState();
    }

    public long getTransitionTimeMs() {
        if (this.f56982b != null) {
            this.f57007o = r0.getDuration() / 1000.0f;
        }
        return (long) (this.f57007o * 1000.0f);
    }

    public float getVelocity() {
        return this.f56989f;
    }

    public void getViewVelocity(View view, float f10, float f11, float[] fArr, int i10) {
        float[] fArr2;
        float f12;
        char c10;
        char c11;
        double[] dArr;
        float velocity = this.f56989f;
        float f13 = this.f57011q;
        if (this.f56984c != null) {
            float fSignum = Math.signum(this.f57015s - f13);
            float interpolation = this.f56984c.getInterpolation(this.f57011q + 1.0E-5f);
            float interpolation2 = this.f56984c.getInterpolation(this.f57011q);
            velocity = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / this.f57007o;
            f13 = interpolation2;
        }
        v vVar = this.f56984c;
        if (vVar != null) {
            velocity = vVar.getVelocity();
        }
        float f14 = velocity;
        s sVar = (s) this.f57003m.get(view);
        if ((i10 & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float[] fArr3 = sVar.f57241v;
            j0 j0Var = sVar.f57225f;
            float fC = sVar.c(f13, fArr3);
            HashMap map = sVar.f57244y;
            a3.x xVar = map == null ? null : (a3.x) map.get("translationX");
            HashMap map2 = sVar.f57244y;
            a3.x xVar2 = map2 == null ? null : (a3.x) map2.get("translationY");
            c10 = 0;
            HashMap map3 = sVar.f57244y;
            c11 = 1;
            a3.x xVar3 = map3 == null ? null : (a3.x) map3.get("rotation");
            HashMap map4 = sVar.f57244y;
            a3.x xVar4 = map4 == null ? null : (a3.x) map4.get("scaleX");
            f12 = f14;
            HashMap map5 = sVar.f57244y;
            a3.x xVar5 = map5 == null ? null : (a3.x) map5.get("scaleY");
            HashMap map6 = sVar.f57245z;
            f3.f fVar = map6 == null ? null : (f3.f) map6.get("translationX");
            HashMap map7 = sVar.f57245z;
            f3.f fVar2 = map7 == null ? null : (f3.f) map7.get("translationY");
            HashMap map8 = sVar.f57245z;
            f3.f fVar3 = map8 == null ? null : (f3.f) map8.get("rotation");
            HashMap map9 = sVar.f57245z;
            f3.f fVar4 = map9 == null ? null : (f3.f) map9.get("scaleX");
            HashMap map10 = sVar.f57245z;
            f3.f fVar5 = map10 == null ? null : (f3.f) map10.get("scaleY");
            a3.l0 l0Var = new a3.l0();
            l0Var.clear();
            l0Var.setRotationVelocity(xVar3, fC);
            l0Var.setTranslationVelocity(xVar, xVar2, fC);
            l0Var.setScaleVelocity(xVar4, xVar5, fC);
            l0Var.setRotationVelocity(fVar3, fC);
            l0Var.setTranslationVelocity(fVar, fVar2, fC);
            l0Var.setScaleVelocity(fVar4, fVar5, fC);
            a3.d dVar = sVar.f57230k;
            if (dVar != null) {
                double[] dArr2 = sVar.f57235p;
                if (dArr2.length > 0) {
                    double d10 = fC;
                    dVar.getPos(d10, dArr2);
                    sVar.f57230k.getSlope(d10, sVar.f57236q);
                    int[] iArr = sVar.f57234o;
                    double[] dArr3 = sVar.f57236q;
                    double[] dArr4 = sVar.f57235p;
                    j0Var.getClass();
                    j0.e(f10, f11, fArr, iArr, dArr3, dArr4);
                }
                l0Var.applyTransform(f10, f11, width, height, fArr);
            } else if (sVar.f57229j != null) {
                double dC = sVar.c(fC, fArr3);
                sVar.f57229j[0].getSlope(dC, sVar.f57236q);
                sVar.f57229j[0].getPos(dC, sVar.f57235p);
                float f15 = fArr3[0];
                int i11 = 0;
                while (true) {
                    dArr = sVar.f57236q;
                    if (i11 >= dArr.length) {
                        break;
                    }
                    dArr[i11] = dArr[i11] * f15;
                    i11++;
                }
                int[] iArr2 = sVar.f57234o;
                double[] dArr5 = sVar.f57235p;
                j0Var.getClass();
                j0.e(f10, f11, fArr, iArr2, dArr, dArr5);
                l0Var.applyTransform(f10, f11, width, height, fArr);
            } else {
                j0 j0Var2 = sVar.f57226g;
                float f16 = j0Var2.f57036g - j0Var.f57036g;
                float f17 = j0Var2.f57037h - j0Var.f57037h;
                float f18 = j0Var2.f57038i - j0Var.f57038i;
                float f19 = f17 + (j0Var2.f57039j - j0Var.f57039j);
                fArr[0] = ((f16 + f18) * f10) + ((1.0f - f10) * f16);
                fArr[1] = (f19 * f11) + ((1.0f - f11) * f17);
                l0Var.clear();
                l0Var.setRotationVelocity(xVar3, fC);
                l0Var.setTranslationVelocity(xVar, xVar2, fC);
                l0Var.setScaleVelocity(xVar4, xVar5, fC);
                l0Var.setRotationVelocity(fVar3, fC);
                l0Var.setTranslationVelocity(fVar, fVar2, fC);
                l0Var.setScaleVelocity(fVar4, fVar5, fC);
                fArr2 = fArr;
                l0Var.applyTransform(f10, f11, width, height, fArr2);
            }
            fArr2 = fArr;
        } else {
            fArr2 = fArr;
            f12 = f14;
            c10 = 0;
            c11 = 1;
            sVar.d(f13, f10, f11, fArr2);
        }
        if (i10 < 2) {
            fArr2[c10] = fArr2[c10] * f12;
            fArr2[c11] = fArr2[c11] * f12;
        }
    }

    public final void h(float f10) {
        if (this.f56982b == null) {
            return;
        }
        float f11 = this.f57011q;
        float f12 = this.f57009p;
        if (f11 != f12 && this.f57017t) {
            this.f57011q = f12;
        }
        float f13 = this.f57011q;
        if (f13 == f10) {
            return;
        }
        this.f57027y = false;
        this.f57015s = f10;
        this.f57007o = r0.getDuration() / 1000.0f;
        setProgress(this.f57015s);
        this.f56984c = null;
        this.f56987e = this.f56982b.getInterpolator();
        this.f57017t = false;
        this.f57005n = getNanoTime();
        this.f57019u = true;
        this.f57009p = f13;
        this.f57011q = f13;
        invalidate();
    }

    public final void i(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            s sVar = (s) this.f57003m.get(getChildAt(i10));
            if (sVar != null && "button".equals(b.getName(sVar.f57221b)) && sVar.A != null) {
                int i11 = 0;
                while (true) {
                    p[] pVarArr = sVar.A;
                    if (i11 < pVarArr.length) {
                        pVarArr[i11].conditionallyFire(z10 ? -100.0f : 100.0f, sVar.f57221b);
                        i11++;
                    }
                }
            }
        }
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.f57014r0;
    }

    public boolean isInRotation() {
        return this.f57000k0;
    }

    public boolean isInteractionEnabled() {
        return this.f57001l;
    }

    public boolean isViewTransitionEnabled(int i10) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            return l0Var.isViewTransitionEnabled(i10);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[PHI: r3
      0x00d9: PHI (r3v16 float) = (r3v15 float), (r3v17 float), (r3v17 float) binds: [B:47:0x00a7, B:58:0x00cd, B:60:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(boolean r21) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i0.j(boolean):void");
    }

    public void jumpToState(int i10) {
        if (!isAttachedToWindow()) {
            this.f56993h = i10;
        }
        if (this.f56991g == i10) {
            setProgress(0.0f);
        } else if (this.f56995i == i10) {
            setProgress(1.0f);
        } else {
            setTransition(i10, i10);
        }
    }

    public final void k() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f57021v == null && ((copyOnWriteArrayList = this.N) == null || copyOnWriteArrayList.isEmpty())) || this.S == this.f57009p) {
            return;
        }
        if (this.R != -1) {
            g0 g0Var = this.f57021v;
            if (g0Var != null) {
                g0Var.onTransitionStarted(this, this.f56991g, this.f56995i);
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.N;
            if (copyOnWriteArrayList2 != null) {
                Iterator it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    ((g0) it.next()).onTransitionStarted(this, this.f56991g, this.f56995i);
                }
            }
        }
        this.R = -1;
        float f10 = this.f57009p;
        this.S = f10;
        g0 g0Var2 = this.f57021v;
        if (g0Var2 != null) {
            g0Var2.onTransitionChange(this, this.f56991g, this.f56995i, f10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.N;
        if (copyOnWriteArrayList3 != null) {
            Iterator it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                ((g0) it2.next()).onTransitionChange(this, this.f56991g, this.f56995i, this.f57009p);
            }
        }
    }

    public final void l() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if ((this.f57021v != null || ((copyOnWriteArrayList = this.N) != null && !copyOnWriteArrayList.isEmpty())) && this.R == -1) {
            this.R = this.f56993h;
            ArrayList arrayList = this.f57028y0;
            int iIntValue = !arrayList.isEmpty() ? ((Integer) j1.o2.e(1, arrayList)).intValue() : -1;
            int i10 = this.f56993h;
            if (iIntValue != i10 && i10 != -1) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        q();
        Runnable runnable = this.f56994h0;
        if (runnable != null) {
            runnable.run();
            this.f56994h0 = null;
        }
        int[] iArr = this.f56996i0;
        if (iArr == null || this.f56998j0 <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.f56996i0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f56998j0--;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i10) {
        l0.a aVar;
        if (i10 == 0) {
            this.f56982b = null;
            return;
        }
        try {
            l0 l0Var = new l0(getContext(), this, i10);
            this.f56982b = l0Var;
            int i11 = -1;
            if (this.f56993h == -1) {
                this.f56993h = l0Var.g();
                this.f56991g = this.f56982b.g();
                l0.a aVar2 = this.f56982b.f57066c;
                if (aVar2 != null) {
                    i11 = aVar2.f57086c;
                }
                this.f56995i = i11;
            }
            if (!isAttachedToWindow()) {
                this.f56982b = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.f57010p0 = display == null ? 0 : display.getRotation();
                l0 l0Var2 = this.f56982b;
                if (l0Var2 != null) {
                    androidx.constraintlayout.widget.k kVarB = l0Var2.b(this.f56993h);
                    this.f56982b.m(this);
                    ArrayList arrayList = this.M;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((t) it.next()).onFinishedMotionScene(this);
                        }
                    }
                    if (kVarB != null) {
                        kVarB.applyTo(this);
                    }
                    this.f56991g = this.f56993h;
                }
                p();
                f0 f0Var = this.f56992g0;
                if (f0Var != null) {
                    if (this.f57014r0) {
                        post(new w(this));
                        return;
                    } else {
                        f0Var.a();
                        return;
                    }
                }
                l0 l0Var3 = this.f56982b;
                if (l0Var3 == null || (aVar = l0Var3.f57066c) == null || aVar.getAutoTransition() != 4) {
                    return;
                }
                transitionToEnd();
                setState(h0.f56974c);
                setState(h0.f56975e);
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } catch (Exception e11) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e11);
        }
    }

    public final void m(int i10, float f10, float f11, float f12, float[] fArr) {
        View viewById = getViewById(i10);
        s sVar = (s) this.f57003m.get(viewById);
        if (sVar != null) {
            sVar.d(f10, f11, f12, fArr);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? a.b.e(i10, "") : viewById.getContext().getResources().getResourceName(i10)));
        }
    }

    public final boolean n(float f10, float f11, View view, MotionEvent motionEvent) {
        boolean z10;
        boolean zOnTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (n((r3.getLeft() + f10) - view.getScrollX(), (r3.getTop() + f11) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        if (!z10) {
            RectF rectF = this.f57022v0;
            rectF.set(f10, f11, (view.getRight() + f10) - view.getLeft(), (view.getBottom() + f11) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f12 = -f10;
                float f13 = -f11;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f12, f13);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f12, -f13);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f12, f13);
                    if (this.f57026x0 == null) {
                        this.f57026x0 = new Matrix();
                    }
                    matrix.invert(this.f57026x0);
                    motionEventObtain.transform(this.f57026x0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z10;
    }

    public final void o(AttributeSet attributeSet) {
        l0 l0Var;
        f56980z0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.r.f5556o);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.f56982b = new l0(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f56993h = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f57015s = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f57019u = true;
                } else if (index == 0) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                } else if (index == 5) {
                    if (this.f57023w == 0) {
                        this.f57023w = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f57023w = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f56982b == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z10) {
                this.f56982b = null;
            }
        }
        if (this.f57023w != 0) {
            l0 l0Var2 = this.f56982b;
            if (l0Var2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iG = l0Var2.g();
                l0 l0Var3 = this.f56982b;
                androidx.constraintlayout.widget.k kVarB = l0Var3.b(l0Var3.g());
                String name = b.getName(getContext(), iG);
                int childCount = getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    int id2 = childAt.getId();
                    if (id2 == -1) {
                        StringBuilder sbO = e3.g.o("CHECK: ", name, " ALL VIEWS SHOULD HAVE ID's ");
                        sbO.append(childAt.getClass().getName());
                        sbO.append(" does not!");
                        Log.w("MotionLayout", sbO.toString());
                    }
                    if (kVarB.getConstraint(id2) == null) {
                        StringBuilder sbO2 = e3.g.o("CHECK: ", name, " NO CONSTRAINTS for ");
                        sbO2.append(b.getName(childAt));
                        Log.w("MotionLayout", sbO2.toString());
                    }
                }
                int[] knownIds = kVarB.getKnownIds();
                for (int i12 = 0; i12 < knownIds.length; i12++) {
                    int i13 = knownIds[i12];
                    String name2 = b.getName(getContext(), i13);
                    if (findViewById(knownIds[i12]) == null) {
                        Log.w("MotionLayout", "CHECK: " + name + " NO View matches id " + name2);
                    }
                    if (kVarB.getHeight(i13) == -1) {
                        Log.w("MotionLayout", e3.g.l("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                    }
                    if (kVarB.getWidth(i13) == -1) {
                        Log.w("MotionLayout", e3.g.l("CHECK: ", name, "(", name2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator<l0.a> it = this.f56982b.getDefinedTransitions().iterator();
                while (it.hasNext()) {
                    l0.a next = it.next();
                    if (next == this.f56982b.f57066c) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (next.getStartConstraintSetId() == next.getEndConstraintSetId()) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int startConstraintSetId = next.getStartConstraintSetId();
                    int endConstraintSetId = next.getEndConstraintSetId();
                    String name3 = b.getName(getContext(), startConstraintSetId);
                    String name4 = b.getName(getContext(), endConstraintSetId);
                    if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + name3 + "->" + name4);
                    }
                    if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + name3 + "->" + name4);
                    }
                    sparseIntArray.put(startConstraintSetId, endConstraintSetId);
                    sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
                    if (this.f56982b.b(startConstraintSetId) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + name3);
                    }
                    if (this.f56982b.b(endConstraintSetId) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + name3);
                    }
                }
            }
        }
        if (this.f56993h != -1 || (l0Var = this.f56982b) == null) {
            return;
        }
        this.f56993h = l0Var.g();
        this.f56991g = this.f56982b.g();
        l0.a aVar = this.f56982b.f57066c;
        this.f56995i = aVar != null ? aVar.f57086c : -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        l0.a aVar;
        int i10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f57010p0 = display.getRotation();
        }
        l0 l0Var = this.f56982b;
        if (l0Var != null && (i10 = this.f56993h) != -1) {
            androidx.constraintlayout.widget.k kVarB = l0Var.b(i10);
            this.f56982b.m(this);
            ArrayList arrayList = this.M;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).onFinishedMotionScene(this);
                }
            }
            if (kVarB != null) {
                kVarB.applyTo(this);
            }
            this.f56991g = this.f56993h;
        }
        p();
        f0 f0Var = this.f56992g0;
        if (f0Var != null) {
            if (this.f57014r0) {
                post(new z(this));
                return;
            } else {
                f0Var.a();
                return;
            }
        }
        l0 l0Var2 = this.f56982b;
        if (l0Var2 == null || (aVar = l0Var2.f57066c) == null || aVar.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(h0.f56974c);
        setState(h0.f56975e);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        i0 i0Var;
        this.f56990f0 = true;
        try {
            if (this.f56982b == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                this.f56990f0 = false;
                return;
            }
            i0Var = this;
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            try {
                if (i0Var.C != i14 || i0Var.D != i15) {
                    rebuildScene();
                    j(true);
                }
                i0Var.C = i14;
                i0Var.D = i15;
                i0Var.f56990f0 = false;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                i0Var.f56990f0 = false;
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            i0Var = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        boolean z10;
        if (this.f56982b == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z11 = true;
        boolean z12 = (this.f56997j == i10 && this.f56999k == i11) ? false : true;
        if (this.f57020u0) {
            this.f57020u0 = false;
            p();
            q();
            z12 = true;
        }
        if (this.mDirtyHierarchy) {
            z12 = true;
        }
        this.f56997j = i10;
        this.f56999k = i11;
        int iG = this.f56982b.g();
        l0.a aVar = this.f56982b.f57066c;
        int i12 = aVar == null ? -1 : aVar.f57086c;
        c0 c0Var = this.f57018t0;
        if ((z12 || c0Var.isNotConfiguredWith(iG, i12)) && this.f56991g != -1) {
            super.onMeasure(i10, i11);
            c0Var.d(this.f56982b.b(iG), this.f56982b.b(i12));
            c0Var.reEvaluateState();
            c0Var.setMeasuredId(iG, i12);
            z10 = false;
        } else {
            if (z12) {
                super.onMeasure(i10, i11);
            }
            z10 = true;
        }
        if (this.T || z10) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int width = this.mLayoutWidget.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = this.mLayoutWidget.getHeight() + paddingBottom;
            int i13 = this.f56983b0;
            if (i13 == Integer.MIN_VALUE || i13 == 0) {
                width = (int) ((this.f56986d0 * (this.W - r1)) + this.U);
                requestLayout();
            }
            int i14 = this.f56985c0;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                height = (int) ((this.f56986d0 * (this.f56981a0 - r2)) + this.V);
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        float fSignum = Math.signum(this.f57015s - this.f57011q);
        long nanoTime = getNanoTime();
        v vVar = this.f56984c;
        float interpolation = this.f57011q + (!(vVar instanceof f3.b) ? (((nanoTime - this.f57013r) * fSignum) * 1.0E-9f) / this.f57007o : 0.0f);
        if (this.f57017t) {
            interpolation = this.f57015s;
        }
        if ((fSignum <= 0.0f || interpolation < this.f57015s) && (fSignum > 0.0f || interpolation > this.f57015s)) {
            z11 = false;
        } else {
            interpolation = this.f57015s;
        }
        if (vVar != null && !z11) {
            interpolation = this.f57027y ? vVar.getInterpolation((nanoTime - this.f57005n) * 1.0E-9f) : vVar.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f57015s) || (fSignum <= 0.0f && interpolation <= this.f57015s)) {
            interpolation = this.f57015s;
        }
        this.f56986d0 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f56987e;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        float f10 = interpolation;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            s sVar = (s) this.f57003m.get(childAt);
            if (sVar != null) {
                sVar.f(childAt, f10, nanoTime2, this.f56988e0);
            }
        }
        if (this.T) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    @Override // x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        l0.a aVar;
        float f10;
        boolean z10;
        p0 p0Var;
        float f11;
        p0 p0Var2;
        p0 p0Var3;
        p0 touchResponse;
        int i13;
        l0 l0Var = this.f56982b;
        if (l0Var == null || (aVar = l0Var.f57066c) == null || !aVar.isEnabled()) {
            return;
        }
        int i14 = -1;
        if (!aVar.isEnabled() || (touchResponse = aVar.getTouchResponse()) == null || (i13 = touchResponse.f57166e) == -1 || view.getId() == i13) {
            l0.a aVar2 = l0Var.f57066c;
            if ((aVar2 == null || (p0Var3 = aVar2.f57095l) == null) ? false : p0Var3.f57182u) {
                p0 touchResponse2 = aVar.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.getFlags() & 4) != 0) {
                    i14 = i11;
                }
                float f12 = this.f57009p;
                if ((f12 == 1.0f || f12 == 0.0f) && view.canScrollVertically(i14)) {
                    return;
                }
            }
            if (aVar.getTouchResponse() == null || (aVar.getTouchResponse().getFlags() & 1) == 0) {
                f10 = 0.0f;
            } else {
                float f13 = i10;
                float f14 = i11;
                l0.a aVar3 = l0Var.f57066c;
                if (aVar3 == null || (p0Var2 = aVar3.f57095l) == null) {
                    f10 = 0.0f;
                    f11 = 0.0f;
                } else {
                    float[] fArr = p0Var2.f57175n;
                    f10 = 0.0f;
                    p0Var2.f57179r.m(p0Var2.f57165d, p0Var2.f57179r.getProgress(), p0Var2.f57169h, p0Var2.f57168g, fArr);
                    float f15 = p0Var2.f57172k;
                    if (f15 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f11 = (f13 * f15) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f11 = (f14 * p0Var2.f57173l) / fArr[1];
                    }
                }
                float f16 = this.f57011q;
                if ((f16 <= f10 && f11 < f10) || (f16 >= 1.0f && f11 > f10)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new y(view));
                    return;
                }
            }
            float f17 = this.f57009p;
            long nanoTime = getNanoTime();
            float f18 = i10;
            this.F = f18;
            float f19 = i11;
            this.G = f19;
            this.I = (float) ((nanoTime - this.H) * 1.0E-9d);
            this.H = nanoTime;
            l0.a aVar4 = l0Var.f57066c;
            if (aVar4 == null || (p0Var = aVar4.f57095l) == null) {
                z10 = 1;
            } else {
                float[] fArr2 = p0Var.f57175n;
                i0 i0Var = p0Var.f57179r;
                float progress = i0Var.getProgress();
                if (!p0Var.f57174m) {
                    p0Var.f57174m = true;
                    i0Var.setProgress(progress);
                }
                boolean z11 = true;
                p0Var.f57179r.m(p0Var.f57165d, progress, p0Var.f57169h, p0Var.f57168g, fArr2);
                if (Math.abs((p0Var.f57173l * fArr2[1]) + (p0Var.f57172k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f20 = p0Var.f57172k;
                float fMax = Math.max(Math.min(progress + (f20 != f10 ? (f18 * f20) / fArr2[0] : (f19 * p0Var.f57173l) / fArr2[1]), 1.0f), f10);
                z10 = z11;
                if (fMax != i0Var.getProgress()) {
                    i0Var.setProgress(fMax);
                    z10 = z11;
                }
            }
            if (f17 != this.f57009p) {
                iArr[0] = i10;
                iArr[z10] = i11;
            }
            j(false);
            if (iArr[0] == 0 && iArr[z10] == 0) {
                return;
            }
            this.E = z10;
        }
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.E || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.E = false;
    }

    @Override // x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.H = getNanoTime();
        this.I = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            l0Var.setRtl(isRtl());
        }
    }

    @Override // x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        l0.a aVar;
        l0 l0Var = this.f56982b;
        return (l0Var == null || (aVar = l0Var.f57066c) == null || aVar.getTouchResponse() == null || (this.f56982b.f57066c.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    @Override // x3.n0
    public void onStopNestedScroll(View view, int i10) {
        p0 p0Var;
        int i11;
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            float f10 = this.I;
            if (f10 == 0.0f) {
                return;
            }
            float f11 = this.F / f10;
            float f12 = this.G / f10;
            l0.a aVar = l0Var.f57066c;
            if (aVar == null || (p0Var = aVar.f57095l) == null) {
                return;
            }
            p0Var.f57174m = false;
            i0 i0Var = p0Var.f57179r;
            float progress = i0Var.getProgress();
            p0Var.f57179r.m(p0Var.f57165d, progress, p0Var.f57169h, p0Var.f57168g, p0Var.f57175n);
            float f13 = p0Var.f57172k;
            float[] fArr = p0Var.f57175n;
            float f14 = f13 != 0.0f ? (f11 * f13) / fArr[0] : (f12 * p0Var.f57173l) / fArr[1];
            if (!Float.isNaN(f14)) {
                progress += f14 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i11 = p0Var.f57164c) == 3) {
                return;
            }
            i0Var.touchAnimateTo(i11, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r30) {
        /*
            Method dump skipped, instructions count: 1671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof t) {
            t tVar = (t) view;
            if (this.N == null) {
                this.N = new CopyOnWriteArrayList();
            }
            this.N.add(tVar);
            if (tVar.isUsedOnShow()) {
                if (this.K == null) {
                    this.K = new ArrayList();
                }
                this.K.add(tVar);
            }
            if (tVar.isUseOnHide()) {
                if (this.L == null) {
                    this.L = new ArrayList();
                }
                this.L.add(tVar);
            }
            if (tVar.isDecorator()) {
                if (this.M == null) {
                    this.M = new ArrayList();
                }
                this.M.add(tVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.L;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p() {
        l0.a aVar;
        p0 p0Var;
        View viewFindViewById;
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            return;
        }
        if (l0Var.a(this, this.f56993h)) {
            requestLayout();
            return;
        }
        int i10 = this.f56993h;
        if (i10 != -1) {
            this.f56982b.addOnClickListeners(this, i10);
        }
        if (!this.f56982b.o() || (aVar = this.f56982b.f57066c) == null || (p0Var = aVar.f57095l) == null) {
            return;
        }
        i0 i0Var = p0Var.f57179r;
        int i11 = p0Var.f57165d;
        if (i11 != -1) {
            viewFindViewById = i0Var.findViewById(i11);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + b.getName(i0Var.getContext(), p0Var.f57165d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new n0());
            nestedScrollView.setOnScrollChangeListener(new o0());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i10) {
        this.mConstraintLayoutSpec = null;
    }

    public final void q() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (this.f57021v == null && ((copyOnWriteArrayList = this.N) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList arrayList = this.f57028y0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            g0 g0Var = this.f57021v;
            if (g0Var != null) {
                g0Var.onTransitionCompleted(this, num.intValue());
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.N;
            if (copyOnWriteArrayList2 != null) {
                Iterator it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    ((g0) it2.next()).onTransitionCompleted(this, num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.f57018t0.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(g0 g0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.N;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(g0Var);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        l0 l0Var;
        l0.a aVar;
        if (!this.T && this.f56993h == -1 && (l0Var = this.f56982b) != null && (aVar = l0Var.f57066c) != null) {
            int layoutDuringTransition = aVar.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    ((s) this.f57003m.get(getChildAt(i10))).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void rotateTo(int i10, int i11) {
        this.f57000k0 = true;
        this.f57006n0 = getWidth();
        this.f57008o0 = getHeight();
        int rotation = getDisplay().getRotation();
        this.f57002l0 = (rotation + 1) % 4 <= (this.f57010p0 + 1) % 4 ? 2 : 1;
        this.f57010p0 = rotation;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            HashMap map = this.f57004m0;
            f3.d0 d0Var = (f3.d0) map.get(childAt);
            if (d0Var == null) {
                d0Var = new f3.d0();
                map.put(childAt, d0Var);
            }
            d0Var.getState(childAt);
        }
        this.f56991g = -1;
        this.f56995i = i10;
        this.f56982b.n(-1, i10);
        this.f57018t0.d(null, this.f56982b.b(this.f56995i));
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        invalidate();
        transitionToEnd(new x(this));
        if (i11 > 0) {
            this.f57007o = i11 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i10) {
        if (getCurrentState() == -1) {
            transitionToState(i10);
            return;
        }
        int[] iArr = this.f56996i0;
        if (iArr == null) {
            this.f56996i0 = new int[4];
        } else if (iArr.length <= this.f56998j0) {
            this.f56996i0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f56996i0;
        int i11 = this.f56998j0;
        this.f56998j0 = i11 + 1;
        iArr2[i11] = i10;
    }

    public void setDebugMode(int i10) {
        this.f57023w = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f57014r0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f57001l = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f56982b != null) {
            setState(h0.f56975e);
            Interpolator interpolator = this.f56982b.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.L.get(i10)).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((t) this.K.get(i10)).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.f56992g0 == null) {
                this.f56992g0 = new f0(this);
            }
            this.f56992g0.setProgress(f10);
            this.f56992g0.setVelocity(f11);
            return;
        }
        setProgress(f10);
        setState(h0.f56975e);
        this.f56989f = f11;
        if (f11 != 0.0f) {
            h(f11 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f10 == 0.0f || f10 == 1.0f) {
                return;
            }
            h(f10 > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(l0 l0Var) {
        this.f56982b = l0Var;
        l0Var.setRtl(isRtl());
        rebuildScene();
    }

    public void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f56993h = i10;
            return;
        }
        if (this.f56992g0 == null) {
            this.f56992g0 = new f0(this);
        }
        this.f56992g0.setStartState(i10);
        this.f56992g0.setEndState(i10);
    }

    public void setState(h0 h0Var) {
        h0 h0Var2 = h0.f56976f;
        if (h0Var == h0Var2 && this.f56993h == -1) {
            return;
        }
        h0 h0Var3 = this.f57016s0;
        this.f57016s0 = h0Var;
        h0 h0Var4 = h0.f56975e;
        if (h0Var3 == h0Var4 && h0Var == h0Var4) {
            k();
        }
        int iOrdinal = h0Var3.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 && h0Var == h0Var2) {
                l();
                return;
            }
            return;
        }
        if (h0Var == h0Var4) {
            k();
        }
        if (h0Var == h0Var2) {
            l();
        }
    }

    public void setTransition(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f56992g0 == null) {
                this.f56992g0 = new f0(this);
            }
            this.f56992g0.setStartState(i10);
            this.f56992g0.setEndState(i11);
            return;
        }
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            this.f56991g = i10;
            this.f56995i = i11;
            l0Var.n(i10, i11);
            this.f57018t0.d(this.f56982b.b(i10), this.f56982b.b(i11));
            rebuildScene();
            this.f57011q = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i10) {
        l0 l0Var = this.f56982b;
        if (l0Var == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            l0Var.setDuration(i10);
        }
    }

    public void setTransitionListener(g0 g0Var) {
        this.f57021v = g0Var;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f56992g0 == null) {
            this.f56992g0 = new f0(this);
        }
        this.f56992g0.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.f56992g0.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void touchAnimateTo(int r12, float r13, float r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i0.touchAnimateTo(int, float, float):void");
    }

    public void touchSpringTo(float f10, float f11) {
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        p0 p0Var4;
        p0 p0Var5;
        if (this.f56982b == null || this.f57011q == f10) {
            return;
        }
        this.f57027y = true;
        this.f57005n = getNanoTime();
        this.f57007o = this.f56982b.getDuration() / 1000.0f;
        this.f57015s = f10;
        this.f57019u = true;
        float f12 = this.f57011q;
        l0.a aVar = this.f56982b.f57066c;
        float springStopThreshold = 0.0f;
        float springMass = (aVar == null || (p0Var5 = aVar.f57095l) == null) ? 0.0f : p0Var5.getSpringMass();
        l0.a aVar2 = this.f56982b.f57066c;
        float springStiffness = (aVar2 == null || (p0Var4 = aVar2.f57095l) == null) ? 0.0f : p0Var4.getSpringStiffness();
        l0.a aVar3 = this.f56982b.f57066c;
        float springDamping = (aVar3 == null || (p0Var3 = aVar3.f57095l) == null) ? 0.0f : p0Var3.getSpringDamping();
        l0.a aVar4 = this.f56982b.f57066c;
        if (aVar4 != null && (p0Var2 = aVar4.f57095l) != null) {
            springStopThreshold = p0Var2.getSpringStopThreshold();
        }
        float f13 = springStopThreshold;
        l0.a aVar5 = this.f56982b.f57066c;
        this.f57029z.springConfig(f12, f10, f11, springMass, springStiffness, springDamping, f13, (aVar5 == null || (p0Var = aVar5.f57095l) == null) ? 0 : p0Var.getSpringBoundary());
        int i10 = this.f56993h;
        this.f57015s = f10;
        this.f56993h = i10;
        this.f56984c = this.f57029z;
        this.f57017t = false;
        this.f57005n = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        h(1.0f);
        this.f56994h0 = null;
    }

    public void transitionToStart() {
        h(0.0f);
    }

    public void transitionToState(int i10) {
        if (isAttachedToWindow()) {
            transitionToState(i10, -1, -1);
            return;
        }
        if (this.f56992g0 == null) {
            this.f56992g0 = new f0(this);
        }
        this.f56992g0.setEndState(i10);
    }

    public void updateState(int i10, androidx.constraintlayout.widget.k kVar) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            l0Var.setConstraintSet(i10, kVar);
        }
        updateState();
        if (this.f56993h == i10) {
            kVar.applyTo(this);
        }
    }

    public void updateStateAnimate(int i10, androidx.constraintlayout.widget.k kVar, int i11) {
        if (this.f56982b != null && this.f56993h == i10) {
            updateState(R.id.view_transition, getConstraintSet(i10));
            setState(R.id.view_transition, -1, -1);
            updateState(i10, kVar);
            l0.a aVar = new l0.a(-1, this.f56982b, R.id.view_transition, i10);
            aVar.setDuration(i11);
            setTransition(aVar);
            transitionToEnd();
        }
    }

    public void viewTransition(int i10, View... viewArr) {
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            l0Var.viewTransition(i10, viewArr);
        } else {
            Log.e("MotionLayout", " no motionScene");
        }
    }

    public void transitionToStart(Runnable runnable) {
        h(0.0f);
        this.f56994h0 = runnable;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return b.getName(context, this.f56991g) + "->" + b.getName(context, this.f56995i) + " (pos:" + this.f57011q + UeklptUrP.UVUUNHYcIDaT + this.f56989f;
    }

    public void transitionToEnd(Runnable runnable) {
        h(1.0f);
        this.f56994h0 = runnable;
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public void transitionToState(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.f56992g0 == null) {
                this.f56992g0 = new f0(this);
            }
            this.f56992g0.setEndState(i10);
            return;
        }
        transitionToState(i10, -1, -1, i11);
    }

    public void updateState() {
        this.f57018t0.d(this.f56982b.b(this.f56991g), this.f56982b.b(this.f56995i));
        rebuildScene();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i10, int i11, int i12) {
        setState(h0.f56974c);
        this.f56993h = i10;
        this.f56991g = -1;
        this.f56995i = -1;
        androidx.constraintlayout.widget.i iVar = this.mConstraintLayoutSpec;
        if (iVar != null) {
            iVar.updateConstraints(i10, i11, i12);
            return;
        }
        l0 l0Var = this.f56982b;
        if (l0Var != null) {
            l0Var.b(i10).applyTo(this);
        }
    }

    public void setProgress(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f56992g0 == null) {
                this.f56992g0 = new f0(this);
            }
            this.f56992g0.setProgress(f10);
            return;
        }
        h0 h0Var = h0.f56976f;
        h0 h0Var2 = h0.f56975e;
        if (f10 <= 0.0f) {
            if (this.f57011q == 1.0f && this.f56993h == this.f56995i) {
                setState(h0Var2);
            }
            this.f56993h = this.f56991g;
            if (this.f57011q == 0.0f) {
                setState(h0Var);
            }
        } else if (f10 >= 1.0f) {
            if (this.f57011q == 0.0f && this.f56993h == this.f56991g) {
                setState(h0Var2);
            }
            this.f56993h = this.f56995i;
            if (this.f57011q == 1.0f) {
                setState(h0Var);
            }
        } else {
            this.f56993h = -1;
            setState(h0Var2);
        }
        if (this.f56982b == null) {
            return;
        }
        this.f57017t = true;
        this.f57015s = f10;
        this.f57009p = f10;
        this.f57013r = -1L;
        this.f57005n = -1L;
        this.f56984c = null;
        this.f57019u = true;
        invalidate();
    }

    public void transitionToState(int i10, int i11, int i12) {
        transitionToState(i10, i11, i12, -1);
    }

    public void transitionToState(int i10, int i11, int i12, int i13) {
        androidx.constraintlayout.widget.w wVar;
        int iConvertToConstraintSet;
        l0 l0Var = this.f56982b;
        if (l0Var != null && (wVar = l0Var.f57065b) != null && (iConvertToConstraintSet = wVar.convertToConstraintSet(this.f56993h, i10, i11, i12)) != -1) {
            i10 = iConvertToConstraintSet;
        }
        int i14 = this.f56993h;
        if (i14 == i10) {
            return;
        }
        if (this.f56991g == i10) {
            h(0.0f);
            if (i13 > 0) {
                this.f57007o = i13 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f56995i == i10) {
            h(1.0f);
            if (i13 > 0) {
                this.f57007o = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f56995i = i10;
        if (i14 != -1) {
            setTransition(i14, i10);
            h(1.0f);
            this.f57011q = 0.0f;
            transitionToEnd();
            if (i13 > 0) {
                this.f57007o = i13 / 1000.0f;
                return;
            }
            return;
        }
        this.f57027y = false;
        this.f57015s = 1.0f;
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        this.f57013r = getNanoTime();
        this.f57005n = getNanoTime();
        this.f57017t = false;
        this.f56984c = null;
        if (i13 == -1) {
            this.f57007o = this.f56982b.getDuration() / 1000.0f;
        }
        this.f56991g = -1;
        this.f56982b.n(-1, this.f56995i);
        SparseArray sparseArray = new SparseArray();
        if (i13 == 0) {
            this.f57007o = this.f56982b.getDuration() / 1000.0f;
        } else if (i13 > 0) {
            this.f57007o = i13 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap<View, s> map = this.f57003m;
        map.clear();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            map.put(childAt, new s(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f57019u = true;
        androidx.constraintlayout.widget.k kVarB = this.f56982b.b(i10);
        c0 c0Var = this.f57018t0;
        c0Var.d(null, kVarB);
        rebuildScene();
        c0Var.build();
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt(i16);
            s sVar = map.get(childAt2);
            if (sVar != null) {
                j0 j0Var = sVar.f57225f;
                j0Var.f57034e = 0.0f;
                j0Var.f57035f = 0.0f;
                j0Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                sVar.f57227h.setState(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.M != null) {
            for (int i17 = 0; i17 < childCount; i17++) {
                s sVar2 = map.get(getChildAt(i17));
                if (sVar2 != null) {
                    this.f56982b.getKeyFrames(sVar2);
                }
            }
            Iterator it = this.M.iterator();
            while (it.hasNext()) {
                ((t) it.next()).onPreSetup(this, map);
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                s sVar3 = map.get(getChildAt(i18));
                if (sVar3 != null) {
                    sVar3.setup(width, height, this.f57007o, getNanoTime());
                }
            }
        } else {
            for (int i19 = 0; i19 < childCount; i19++) {
                s sVar4 = map.get(getChildAt(i19));
                if (sVar4 != null) {
                    this.f56982b.getKeyFrames(sVar4);
                    sVar4.setup(width, height, this.f57007o, getNanoTime());
                }
            }
        }
        float staggered = this.f56982b.getStaggered();
        if (staggered != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i20 = 0; i20 < childCount; i20++) {
                s sVar5 = map.get(getChildAt(i20));
                float finalY = sVar5.getFinalY() + sVar5.getFinalX();
                fMin = Math.min(fMin, finalY);
                fMax = Math.max(fMax, finalY);
            }
            for (int i21 = 0; i21 < childCount; i21++) {
                s sVar6 = map.get(getChildAt(i21));
                float finalX = sVar6.getFinalX();
                float finalY2 = sVar6.getFinalY();
                sVar6.f57233n = 1.0f / (1.0f - staggered);
                sVar6.f57232m = staggered - ((((finalX + finalY2) - fMin) * staggered) / (fMax - fMin));
            }
        }
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        this.f57019u = true;
        invalidate();
    }

    public void setTransition(int i10) {
        float f10;
        if (this.f56982b != null) {
            l0.a transition = getTransition(i10);
            this.f56991g = transition.getStartConstraintSetId();
            this.f56995i = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.f56992g0 == null) {
                    this.f56992g0 = new f0(this);
                }
                this.f56992g0.setStartState(this.f56991g);
                this.f56992g0.setEndState(this.f56995i);
                return;
            }
            int i11 = this.f56993h;
            if (i11 == this.f56991g) {
                f10 = 0.0f;
            } else {
                f10 = i11 == this.f56995i ? 1.0f : Float.NaN;
            }
            this.f56982b.setTransition(transition);
            this.f57018t0.d(this.f56982b.b(this.f56991g), this.f56982b.b(this.f56995i));
            rebuildScene();
            if (this.f57011q != f10) {
                if (f10 == 0.0f) {
                    i(true);
                    this.f56982b.b(this.f56991g).applyTo(this);
                } else if (f10 == 1.0f) {
                    i(false);
                    this.f56982b.b(this.f56995i).applyTo(this);
                }
            }
            this.f57011q = Float.isNaN(f10) ? 0.0f : f10;
            if (Float.isNaN(f10)) {
                Log.v("MotionLayout", b.getLocation() + " transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f10);
        }
    }

    public void setTransition(l0.a aVar) {
        this.f56982b.setTransition(aVar);
        setState(h0.f56974c);
        int i10 = this.f56993h;
        l0.a aVar2 = this.f56982b.f57066c;
        if (i10 == (aVar2 == null ? -1 : aVar2.f57086c)) {
            this.f57011q = 1.0f;
            this.f57009p = 1.0f;
            this.f57015s = 1.0f;
        } else {
            this.f57011q = 0.0f;
            this.f57009p = 0.0f;
            this.f57015s = 0.0f;
        }
        this.f57013r = aVar.isTransitionFlag(1) ? -1L : getNanoTime();
        int iG = this.f56982b.g();
        l0 l0Var = this.f56982b;
        l0.a aVar3 = l0Var.f57066c;
        int i11 = aVar3 != null ? aVar3.f57086c : -1;
        if (iG == this.f56991g && i11 == this.f56995i) {
            return;
        }
        this.f56991g = iG;
        this.f56995i = i11;
        l0Var.n(iG, i11);
        androidx.constraintlayout.widget.k kVarB = this.f56982b.b(this.f56991g);
        androidx.constraintlayout.widget.k kVarB2 = this.f56982b.b(this.f56995i);
        c0 c0Var = this.f57018t0;
        c0Var.d(kVarB, kVarB2);
        c0Var.setMeasuredId(this.f56991g, this.f56995i);
        c0Var.reEvaluateState();
        rebuildScene();
    }

    public i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56987e = null;
        this.f56989f = 0.0f;
        this.f56991g = -1;
        this.f56993h = -1;
        this.f56995i = -1;
        this.f56997j = 0;
        this.f56999k = 0;
        this.f57001l = true;
        this.f57003m = new HashMap();
        this.f57005n = 0L;
        this.f57007o = 1.0f;
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        this.f57015s = 0.0f;
        this.f57019u = false;
        this.f57023w = 0;
        this.f57027y = false;
        this.f57029z = new f3.b();
        this.A = new a0(this);
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = 0;
        this.P = -1L;
        this.Q = 0.0f;
        this.R = 0;
        this.S = 0.0f;
        this.T = false;
        this.f56988e0 = new a3.i();
        this.f56990f0 = false;
        this.f56994h0 = null;
        this.f56996i0 = null;
        this.f56998j0 = 0;
        this.f57000k0 = false;
        this.f57002l0 = 0;
        this.f57004m0 = new HashMap();
        this.f57012q0 = new Rect();
        this.f57014r0 = false;
        this.f57016s0 = h0.f56973b;
        this.f57018t0 = new c0(this);
        this.f57020u0 = false;
        this.f57022v0 = new RectF();
        this.f57024w0 = null;
        this.f57026x0 = null;
        this.f57028y0 = new ArrayList();
        o(attributeSet);
    }

    public i0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f56987e = null;
        this.f56989f = 0.0f;
        this.f56991g = -1;
        this.f56993h = -1;
        this.f56995i = -1;
        this.f56997j = 0;
        this.f56999k = 0;
        this.f57001l = true;
        this.f57003m = new HashMap();
        this.f57005n = 0L;
        this.f57007o = 1.0f;
        this.f57009p = 0.0f;
        this.f57011q = 0.0f;
        this.f57015s = 0.0f;
        this.f57019u = false;
        this.f57023w = 0;
        this.f57027y = false;
        this.f57029z = new f3.b();
        this.A = new a0(this);
        this.E = false;
        this.J = false;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = 0;
        this.P = -1L;
        this.Q = 0.0f;
        this.R = 0;
        this.S = 0.0f;
        this.T = false;
        this.f56988e0 = new a3.i();
        this.f56990f0 = false;
        this.f56994h0 = null;
        this.f56996i0 = null;
        this.f56998j0 = 0;
        this.f57000k0 = false;
        this.f57002l0 = 0;
        this.f57004m0 = new HashMap();
        this.f57012q0 = new Rect();
        this.f57014r0 = false;
        this.f57016s0 = h0.f56973b;
        this.f57018t0 = new c0(this);
        this.f57020u0 = false;
        this.f57022v0 = new RectF();
        this.f57024w0 = null;
        this.f57026x0 = null;
        this.f57028y0 = new ArrayList();
        o(attributeSet);
    }
}
