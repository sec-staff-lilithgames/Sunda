package io.bidmachine.media3.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final k f61660a;

    /* renamed from: b, reason: collision with root package name */
    public final View f61661b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f61662c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f61663d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f61664e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f61665f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f61666g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f61667h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f61668i;

    /* renamed from: j, reason: collision with root package name */
    public final View f61669j;

    /* renamed from: k, reason: collision with root package name */
    public final View f61670k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f61671l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f61672m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f61673n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f61674o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f61675p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f61676q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f61677r;

    /* renamed from: s, reason: collision with root package name */
    public final p f61678s;

    /* renamed from: t, reason: collision with root package name */
    public final p f61679t;

    /* renamed from: v, reason: collision with root package name */
    public final p f61681v;

    /* renamed from: x, reason: collision with root package name */
    public final com.google.android.exoplayer2.ui.p f61683x;

    /* renamed from: u, reason: collision with root package name */
    public final p f61680u = new p(this, 4);

    /* renamed from: w, reason: collision with root package name */
    public final p f61682w = new p(this, 6);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f61685z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f61684y = new ArrayList();

    public a0(k kVar) throws Resources.NotFoundException {
        this.f61660a = kVar;
        final int i10 = 0;
        this.f61678s = new p(this, i10);
        final int i11 = 3;
        this.f61679t = new p(this, i11);
        int i12 = 5;
        this.f61681v = new p(this, i12);
        this.f61683x = new com.google.android.exoplayer2.ui.p(this, i12);
        final int i13 = 1;
        this.f61661b = kVar.findViewById(R.id.exo_controls_background);
        this.f61662c = (ViewGroup) kVar.findViewById(R.id.exo_center_controls);
        this.f61664e = (ViewGroup) kVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) kVar.findViewById(R.id.exo_bottom_bar);
        this.f61663d = viewGroup;
        this.f61668i = (ViewGroup) kVar.findViewById(R.id.exo_time);
        View viewFindViewById = kVar.findViewById(R.id.exo_progress);
        this.f61669j = viewFindViewById;
        this.f61665f = (ViewGroup) kVar.findViewById(R.id.exo_basic_controls);
        this.f61666g = (ViewGroup) kVar.findViewById(R.id.exo_extra_controls);
        this.f61667h = (ViewGroup) kVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = kVar.findViewById(R.id.exo_overflow_show);
        this.f61670k = viewFindViewById2;
        View viewFindViewById3 = kVar.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i14 = 25;
            viewFindViewById2.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, i14));
            viewFindViewById3.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, i14));
        }
        final int i15 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: io.bidmachine.media3.ui.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f61870b;

            {
                this.f61870b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        a0 a0Var = this.f61870b;
                        a0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = a0Var.f61661b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = a0Var.f61662c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = a0Var.f61664e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.f61870b;
                        a0Var2.getClass();
                        a0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        a0 a0Var3 = this.f61870b;
                        a0Var3.getClass();
                        a0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        a0 a0Var4 = this.f61870b;
                        a0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = a0Var4.f61661b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = a0Var4.f61662c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = a0Var4.f61664e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new r(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: io.bidmachine.media3.ui.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f61870b;

            {
                this.f61870b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        a0 a0Var = this.f61870b;
                        a0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = a0Var.f61661b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = a0Var.f61662c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = a0Var.f61664e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.f61870b;
                        a0Var2.getClass();
                        a0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        a0 a0Var3 = this.f61870b;
                        a0Var3.getClass();
                        a0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        a0 a0Var4 = this.f61870b;
                        a0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = a0Var4.f61661b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = a0Var4.f61662c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = a0Var4.f61664e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new s(this));
        Resources resources = kVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f61671l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new t(this, kVar));
        animatorSet.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension)).with(c(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f61672m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new u(this, kVar));
        animatorSet2.play(c(viewFindViewById, dimension, dimension2)).with(c(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f61673n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new v(this, kVar));
        animatorSet3.play(valueAnimatorOfFloat).with(c(viewFindViewById, 0.0f, dimension2)).with(c(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f61674o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new w(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension, 0.0f)).with(c(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f61675p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new x(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(c(viewFindViewById, dimension2, 0.0f)).with(c(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f61676q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: io.bidmachine.media3.ui.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f61870b;

            {
                this.f61870b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        a0 a0Var = this.f61870b;
                        a0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = a0Var.f61661b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = a0Var.f61662c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = a0Var.f61664e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.f61870b;
                        a0Var2.getClass();
                        a0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        a0 a0Var3 = this.f61870b;
                        a0Var3.getClass();
                        a0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        a0 a0Var4 = this.f61870b;
                        a0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = a0Var4.f61661b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = a0Var4.f61662c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = a0Var4.f61664e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new y(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f61677r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: io.bidmachine.media3.ui.q

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f61870b;

            {
                this.f61870b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i15) {
                    case 0:
                        a0 a0Var = this.f61870b;
                        a0Var.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = a0Var.f61661b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = a0Var.f61662c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = a0Var.f61664e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        a0 a0Var2 = this.f61870b;
                        a0Var2.getClass();
                        a0Var2.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        a0 a0Var3 = this.f61870b;
                        a0Var3.getClass();
                        a0Var3.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        a0 a0Var4 = this.f61870b;
                        a0Var4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = a0Var4.f61661b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = a0Var4.f61662c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = a0Var4.f61664e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new z(this));
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
        ViewGroup viewGroup = this.f61667h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f61668i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f61665f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final void d(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f61660a.postDelayed(runnable, j10);
        }
    }

    public final void e(int i10) {
        int i11 = this.f61685z;
        this.f61685z = i10;
        k kVar = this.f61660a;
        if (i10 == 2) {
            kVar.setVisibility(8);
        } else if (i11 == 2) {
            kVar.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator it = kVar.f61778f.iterator();
            while (it.hasNext()) {
                ((o) it.next()).onVisibilityChange(kVar.getVisibility());
            }
        }
    }

    public final void g() {
        if (!this.C) {
            e(0);
            resetHideCallbacks();
            return;
        }
        int i10 = this.f61685z;
        if (i10 == 1) {
            this.f61674o.start();
        } else if (i10 == 2) {
            this.f61675p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        resetHideCallbacks();
    }

    public boolean getShowButton(View view) {
        return view != null && this.f61684y.contains(view);
    }

    public void hide() {
        int i10 = this.f61685z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.C) {
            e(2);
        } else if (this.f61685z == 1) {
            this.f61672m.start();
        } else {
            this.f61673n.start();
        }
    }

    public void hideImmediately() {
        int i10 = this.f61685z;
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
        return this.f61685z == 0 && this.f61660a.isVisible();
    }

    public void onAttachedToWindow() {
        this.f61660a.addOnLayoutChangeListener(this.f61683x);
    }

    public void onDetachedFromWindow() {
        this.f61660a.removeOnLayoutChangeListener(this.f61683x);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f61661b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void removeHideCallbacks() {
        p pVar = this.f61682w;
        k kVar = this.f61660a;
        kVar.removeCallbacks(pVar);
        kVar.removeCallbacks(this.f61679t);
        kVar.removeCallbacks(this.f61681v);
        kVar.removeCallbacks(this.f61680u);
    }

    public void resetHideCallbacks() {
        if (this.f61685z == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.f61660a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                d(this.f61682w, showTimeoutMs);
            } else if (this.f61685z == 1) {
                d(this.f61680u, 2000L);
            } else {
                d(this.f61681v, showTimeoutMs);
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
        ArrayList arrayList = this.f61684y;
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

    public void show() throws Resources.NotFoundException {
        k kVar = this.f61660a;
        if (!kVar.isVisible()) {
            kVar.setVisibility(0);
            kVar.e();
            ImageView imageView = kVar.f61800q;
            if (imageView != null) {
                imageView.requestFocus();
            }
        }
        g();
    }
}
