package dh;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f52218e;

    /* renamed from: f, reason: collision with root package name */
    public final int f52219f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f52220g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f52221h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f52222i;

    /* renamed from: j, reason: collision with root package name */
    public final com.applovin.mediation.nativeAds.a f52223j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.material.datepicker.c f52224k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f52225l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f52226m;

    public d(q qVar) {
        super(qVar);
        this.f52223j = new com.applovin.mediation.nativeAds.a(this, 17);
        this.f52224k = new com.google.android.material.datepicker.c(this, 1);
        this.f52218e = sg.o.resolveThemeDuration(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f52219f = sg.o.resolveThemeDuration(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f52220g = sg.o.resolveThemeInterpolator(qVar.getContext(), R.attr.motionEasingLinearInterpolator, vf.a.f89240a);
        this.f52221h = sg.o.resolveThemeInterpolator(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89243d);
    }

    @Override // dh.r
    public final void afterEditTextChanged(Editable editable) {
        if (this.f52277b.f52269r != null) {
            return;
        }
        n(o());
    }

    @Override // dh.r
    public final int b() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // dh.r
    public final int c() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // dh.r
    public final View.OnFocusChangeListener d() {
        return this.f52224k;
    }

    @Override // dh.r
    public final View.OnClickListener e() {
        return this.f52223j;
    }

    @Override // dh.r
    public final View.OnFocusChangeListener f() {
        return this.f52224k;
    }

    @Override // dh.r
    public final void j(boolean z10) {
        if (this.f52277b.f52269r == null) {
            return;
        }
        n(z10);
    }

    @Override // dh.r
    public final void l() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f52221h);
        valueAnimatorOfFloat.setDuration(this.f52219f);
        final int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f52211b;

            {
                this.f52211b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        d dVar = this.f52211b;
                        dVar.getClass();
                        dVar.f52279d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f52211b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f52279d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f52220g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f52218e;
        valueAnimatorOfFloat2.setDuration(i11);
        final int i12 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f52211b;

            {
                this.f52211b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f52211b;
                        dVar.getClass();
                        dVar.f52279d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f52211b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f52279d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f52225l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f52225l.addListener(new b(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i11);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: dh.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f52211b;

            {
                this.f52211b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        d dVar = this.f52211b;
                        dVar.getClass();
                        dVar.f52279d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f52211b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f52279d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f52226m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this));
    }

    @Override // dh.r
    public final void m() {
        EditText editText = this.f52222i;
        if (editText != null) {
            editText.post(new com.unity3d.services.banners.view.a(this, 7));
        }
    }

    public final void n(boolean z10) {
        boolean z11 = this.f52277b.d() == z10;
        if (z10 && !this.f52225l.isRunning()) {
            this.f52226m.cancel();
            this.f52225l.start();
            if (z11) {
                this.f52225l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f52225l.cancel();
        this.f52226m.start();
        if (z11) {
            this.f52226m.end();
        }
    }

    public final boolean o() {
        EditText editText = this.f52222i;
        if (editText != null) {
            return (editText.hasFocus() || this.f52279d.hasFocus()) && this.f52222i.getText().length() > 0;
        }
        return false;
    }

    @Override // dh.r
    public void onEditTextAttached(EditText editText) {
        this.f52222i = editText;
        this.f52276a.setEndIconVisible(o());
    }
}
