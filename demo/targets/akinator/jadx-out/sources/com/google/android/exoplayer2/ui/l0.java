package com.google.android.exoplayer2.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l0 {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final u f28234a;

    /* renamed from: b, reason: collision with root package name */
    public final View f28235b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f28236c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f28237d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f28238e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f28239f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f28240g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f28241h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f28242i;

    /* renamed from: j, reason: collision with root package name */
    public final View f28243j;

    /* renamed from: k, reason: collision with root package name */
    public final View f28244k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f28245l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f28246m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f28247n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f28248o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f28249p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f28250q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f28251r;

    /* renamed from: s, reason: collision with root package name */
    public final a0 f28252s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f28253t;

    /* renamed from: v, reason: collision with root package name */
    public final a0 f28255v;

    /* renamed from: x, reason: collision with root package name */
    public final p f28257x;

    /* renamed from: u, reason: collision with root package name */
    public final a0 f28254u = new a0(this, 4);

    /* renamed from: w, reason: collision with root package name */
    public final a0 f28256w = new a0(this, 6);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f28259z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f28258y = new ArrayList();

    public l0(u uVar) throws Resources.NotFoundException {
        this.f28234a = uVar;
        final int i10 = 0;
        this.f28252s = new a0(this, i10);
        final int i11 = 3;
        this.f28253t = new a0(this, i11);
        int i12 = 5;
        this.f28255v = new a0(this, i12);
        final int i13 = 1;
        this.f28257x = new p(this, i13);
        this.f28235b = uVar.findViewById(R.id.exo_controls_background);
        this.f28236c = (ViewGroup) uVar.findViewById(R.id.exo_center_controls);
        this.f28238e = (ViewGroup) uVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) uVar.findViewById(R.id.exo_bottom_bar);
        this.f28237d = viewGroup;
        this.f28242i = (ViewGroup) uVar.findViewById(R.id.exo_time);
        View viewFindViewById = uVar.findViewById(R.id.exo_progress);
        this.f28243j = viewFindViewById;
        this.f28239f = (ViewGroup) uVar.findViewById(R.id.exo_basic_controls);
        this.f28240g = (ViewGroup) uVar.findViewById(R.id.exo_extra_controls);
        this.f28241h = (ViewGroup) uVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = uVar.findViewById(R.id.exo_overflow_show);
        this.f28244k = viewFindViewById2;
        View viewFindViewById3 = uVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, i12));
            viewFindViewById3.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, i12));
        }
        final int i14 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.exoplayer2.ui.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f28173b;

            {
                this.f28173b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        l0 l0Var = this.f28173b;
                        l0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = l0Var.f28235b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = l0Var.f28236c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = l0Var.f28238e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f28173b;
                        l0Var2.getClass();
                        l0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        l0 l0Var3 = this.f28173b;
                        l0Var3.getClass();
                        l0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        l0 l0Var4 = this.f28173b;
                        l0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = l0Var4.f28235b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = l0Var4.f28236c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = l0Var4.f28238e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new c0(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.exoplayer2.ui.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f28173b;

            {
                this.f28173b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        l0 l0Var = this.f28173b;
                        l0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = l0Var.f28235b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = l0Var.f28236c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = l0Var.f28238e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f28173b;
                        l0Var2.getClass();
                        l0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        l0 l0Var3 = this.f28173b;
                        l0Var3.getClass();
                        l0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        l0 l0Var4 = this.f28173b;
                        l0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = l0Var4.f28235b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = l0Var4.f28236c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = l0Var4.f28238e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new d0(this));
        Resources resources = uVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28245l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new e0(this, uVar));
        animatorSet.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension)).with(c(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f28246m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new f0(this, uVar));
        animatorSet2.play(c(viewFindViewById, dimension, dimension2)).with(c(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f28247n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new g0(this, uVar));
        animatorSet3.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension2)).with(c(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f28248o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new h0(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension, 0.0f)).with(c(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f28249p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new i0(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension2, 0.0f)).with(c(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f28250q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.exoplayer2.ui.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f28173b;

            {
                this.f28173b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        l0 l0Var = this.f28173b;
                        l0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = l0Var.f28235b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = l0Var.f28236c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = l0Var.f28238e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f28173b;
                        l0Var2.getClass();
                        l0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        l0 l0Var3 = this.f28173b;
                        l0Var3.getClass();
                        l0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        l0 l0Var4 = this.f28173b;
                        l0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = l0Var4.f28235b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = l0Var4.f28236c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = l0Var4.f28238e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new j0(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f28251r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.google.android.exoplayer2.ui.b0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f28173b;

            {
                this.f28173b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        l0 l0Var = this.f28173b;
                        l0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = l0Var.f28235b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = l0Var.f28236c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = l0Var.f28238e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        l0 l0Var2 = this.f28173b;
                        l0Var2.getClass();
                        l0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        l0 l0Var3 = this.f28173b;
                        l0Var3.getClass();
                        l0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        l0 l0Var4 = this.f28173b;
                        l0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = l0Var4.f28235b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = l0Var4.f28236c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = l0Var4.f28238e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new k0(this));
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public static ObjectAnimator c(View view, float f10, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static boolean f(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    public final void a(float f10) {
        ViewGroup viewGroup = this.f28241h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f28242i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f28239f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final void d(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f28234a.postDelayed(runnable, j10);
        }
    }

    public final void e(int i10) {
        int i11 = this.f28259z;
        this.f28259z = i10;
        u uVar = this.f28234a;
        if (i10 == 2) {
            uVar.setVisibility(8);
        } else if (i11 == 2) {
            uVar.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator it = uVar.f28338f.iterator();
            while (it.hasNext()) {
                ((z) it.next()).onVisibilityChange(uVar.getVisibility());
            }
        }
    }

    public final void g() {
        if (!this.C) {
            e(0);
            resetHideCallbacks();
            return;
        }
        int i10 = this.f28259z;
        if (i10 == 1) {
            this.f28248o.start();
        } else if (i10 == 2) {
            this.f28249p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        resetHideCallbacks();
    }

    public boolean getShowButton(View view) {
        return view != null && this.f28258y.contains(view);
    }

    public void hide() {
        int i10 = this.f28259z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.C) {
            e(2);
        } else if (this.f28259z == 1) {
            this.f28246m.start();
        } else {
            this.f28247n.start();
        }
    }

    public void hideImmediately() {
        int i10 = this.f28259z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        removeHideCallbacks();
        e(2);
    }

    public boolean isAnimationEnabled() {
        return this.C;
    }

    public boolean isFullyVisible() {
        return this.f28259z == 0 && this.f28234a.isVisible();
    }

    public void onAttachedToWindow() {
        this.f28234a.addOnLayoutChangeListener(this.f28257x);
    }

    public void onDetachedFromWindow() {
        this.f28234a.removeOnLayoutChangeListener(this.f28257x);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f28235b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void removeHideCallbacks() {
        a0 a0Var = this.f28256w;
        u uVar = this.f28234a;
        uVar.removeCallbacks(a0Var);
        uVar.removeCallbacks(this.f28253t);
        uVar.removeCallbacks(this.f28255v);
        uVar.removeCallbacks(this.f28254u);
    }

    public void resetHideCallbacks() {
        if (this.f28259z == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.f28234a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                d(this.f28256w, showTimeoutMs);
            } else if (this.f28259z == 1) {
                d(this.f28254u, 2000L);
            } else {
                d(this.f28255v, showTimeoutMs);
            }
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.C = z10;
    }

    public void setShowButton(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f28258y;
        if (!z10) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && f(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public void show() {
        u uVar = this.f28234a;
        if (!uVar.isVisible()) {
            uVar.setVisibility(0);
            uVar.e();
            View view = uVar.f28360q;
            if (view != null) {
                view.requestFocus();
            }
        }
        g();
    }
}
