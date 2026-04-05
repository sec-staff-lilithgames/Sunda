package pg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y {
    public static final y4.a B = vf.a.f89242c;
    public static final int C = R.attr.motionDurationLong2;
    public static final int D = R.attr.motionEasingEmphasizedInterpolator;
    public static final int E = R.attr.motionDurationMedium1;
    public static final int F = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] G = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] I = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] J = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] K = {android.R.attr.state_enabled};
    public static final int[] L = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public yg.p f81252a;

    /* renamed from: b, reason: collision with root package name */
    public v f81253b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f81254c;

    /* renamed from: d, reason: collision with root package name */
    public e f81255d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f81256e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81257f;

    /* renamed from: h, reason: collision with root package name */
    public float f81259h;

    /* renamed from: i, reason: collision with root package name */
    public float f81260i;

    /* renamed from: j, reason: collision with root package name */
    public float f81261j;

    /* renamed from: k, reason: collision with root package name */
    public int f81262k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f81263l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f81264m;

    /* renamed from: n, reason: collision with root package name */
    public vf.h f81265n;

    /* renamed from: o, reason: collision with root package name */
    public vf.h f81266o;

    /* renamed from: q, reason: collision with root package name */
    public int f81268q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f81270s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f81271t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f81272u;

    /* renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f81273v;

    /* renamed from: w, reason: collision with root package name */
    public final o f81274w;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81258g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f81267p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f81269r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f81275x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public final RectF f81276y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f81277z = new RectF();
    public final Matrix A = new Matrix();

    public y(FloatingActionButton floatingActionButton, o oVar) {
        this.f81273v = floatingActionButton;
        this.f81274w = oVar;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f81273v.getDrawable();
        if (drawable == null || this.f81268q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f81276y;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f11 = this.f81268q;
        RectF rectF2 = this.f81277z;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f81268q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        if (this.f81271t == null) {
            this.f81271t = new ArrayList();
        }
        this.f81271t.add(animatorListener);
    }

    public final AnimatorSet b(vf.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f81273v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        hVar.getTiming("opacity").apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.getTiming("scale").apply(objectAnimatorOfFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new u());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.getTiming("scale").apply(objectAnimatorOfFloat3);
        if (i10 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new u());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.A;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new vf.f(), new t(this), new Matrix(matrix));
        hVar.getTiming("iconScale").apply(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        vf.b.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f10, int i10, int i11, final float f11, final float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f81273v;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f13 = this.f81267p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pg.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                y yVar = this.f81234a;
                yVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = yVar.f81273v;
                floatingActionButton2.setAlpha(vf.a.lerp(alpha, f10, 0.0f, 0.2f, fFloatValue));
                float f14 = scaleX;
                float f15 = f11;
                floatingActionButton2.setScaleX(vf.a.lerp(f14, f15, fFloatValue));
                floatingActionButton2.setScaleY(vf.a.lerp(scaleY, f15, fFloatValue));
                float f16 = f13;
                float f17 = f12;
                yVar.f81267p = vf.a.lerp(f16, f17, fFloatValue);
                float fLerp = vf.a.lerp(f16, f17, fFloatValue);
                Matrix matrix2 = matrix;
                yVar.a(fLerp, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        vf.b.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(sg.o.resolveThemeDuration(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(sg.o.resolveThemeInterpolator(floatingActionButton.getContext(), i11, vf.a.f89241b));
        return animatorSet;
    }

    public final AnimatorSet d(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f81273v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(B);
        return animatorSet;
    }

    public final void e(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f81273v;
        if (floatingActionButton.getStateListAnimator() == this.f81263l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(G, d(f10, f12));
            stateListAnimator.addState(H, d(f10, f11));
            stateListAnimator.addState(I, d(f10, f11));
            stateListAnimator.addState(J, d(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(B);
            stateListAnimator.addState(K, animatorSet);
            stateListAnimator.addState(L, d(0.0f, 0.0f));
            this.f81263l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (this.f81274w.isCompatPaddingEnabled() || (this.f81257f && floatingActionButton.getSizeDimension() < this.f81262k)) {
            h();
        }
    }

    public final void f() {
        ArrayList arrayList = this.f81272u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p) ((w) it.next())).onTranslationChanged();
            }
        }
    }

    public final void g(yg.p pVar) {
        this.f81252a = pVar;
        v vVar = this.f81253b;
        if (vVar != null) {
            vVar.setShapeAppearanceModel(pVar);
        }
        Drawable.Callback callback = this.f81254c;
        if (callback instanceof yg.y) {
            ((yg.y) callback).setShapeAppearanceModel(pVar);
        }
        e eVar = this.f81255d;
        if (eVar != null) {
            eVar.setShapeAppearanceModel(pVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r9 = this;
            pg.o r0 = r9.f81274w
            boolean r1 = r0.isCompatPaddingEnabled()
            android.graphics.Rect r2 = r9.f81275x
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r9.f81273v
            r4 = 0
            if (r1 == 0) goto L46
            boolean r1 = r9.f81257f
            if (r1 == 0) goto L1e
            int r1 = r9.f81262k
            int r5 = r3.getSizeDimension()
            int r1 = r1 - r5
            int r1 = r1 / 2
            int r4 = java.lang.Math.max(r1, r4)
        L1e:
            boolean r1 = r9.f81258g
            if (r1 == 0) goto L2a
            float r1 = r3.getElevation()
            float r5 = r9.f81261j
            float r1 = r1 + r5
            goto L2b
        L2a:
            r1 = 0
        L2b:
            double r5 = (double) r1
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r4, r5)
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r6
            double r6 = (double) r1
            double r6 = java.lang.Math.ceil(r6)
            int r1 = (int) r6
            int r1 = java.lang.Math.max(r4, r1)
            r2.set(r5, r1, r5, r1)
            goto L60
        L46:
            boolean r1 = r9.f81257f
            if (r1 == 0) goto L5d
            int r1 = r3.getSizeDimension()
            int r5 = r9.f81262k
            if (r1 >= r5) goto L5d
            int r1 = r3.getSizeDimension()
            int r5 = r5 - r1
            int r5 = r5 / 2
            r2.set(r5, r5, r5, r5)
            goto L60
        L5d:
            r2.set(r4, r4, r4, r4)
        L60:
            android.graphics.drawable.RippleDrawable r1 = r9.f81256e
            java.lang.String r4 = "Didn't initialize content background"
            w3.i.checkNotNull(r1, r4)
            boolean r1 = r0.isCompatPaddingEnabled()
            if (r1 != 0) goto L80
            boolean r1 = r9.f81257f
            if (r1 == 0) goto L7a
            int r1 = r3.getSizeDimension()
            int r3 = r9.f81262k
            if (r1 >= r3) goto L7a
            goto L80
        L7a:
            android.graphics.drawable.RippleDrawable r1 = r9.f81256e
            r0.setBackgroundDrawable(r1)
            goto L92
        L80:
            android.graphics.drawable.InsetDrawable r3 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r4 = r9.f81256e
            int r5 = r2.left
            int r6 = r2.top
            int r7 = r2.right
            int r8 = r2.bottom
            r3.<init>(r4, r5, r6, r7, r8)
            r0.setBackgroundDrawable(r3)
        L92:
            int r1 = r2.left
            int r3 = r2.top
            int r4 = r2.right
            int r2 = r2.bottom
            r0.setShadowPadding(r1, r3, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.y.h():void");
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = this.f81271t;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }
}
