package dh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.textfield.TextInputLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f52286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52287b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52288c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f52289d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f52290e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f52291f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f52292g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f52293h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f52294i;

    /* renamed from: j, reason: collision with root package name */
    public int f52295j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f52296k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f52297l;

    /* renamed from: m, reason: collision with root package name */
    public final float f52298m;

    /* renamed from: n, reason: collision with root package name */
    public int f52299n;

    /* renamed from: o, reason: collision with root package name */
    public int f52300o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f52301p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f52302q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f52303r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f52304s;

    /* renamed from: t, reason: collision with root package name */
    public int f52305t;

    /* renamed from: u, reason: collision with root package name */
    public int f52306u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f52307v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f52308w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f52309x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f52310y;

    /* renamed from: z, reason: collision with root package name */
    public int f52311z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f52292g = context;
        this.f52293h = textInputLayout;
        this.f52298m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f52286a = sg.o.resolveThemeDuration(context, R.attr.motionDurationShort4, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f52287b = sg.o.resolveThemeDuration(context, R.attr.motionDurationMedium4, 167);
        this.f52288c = sg.o.resolveThemeDuration(context, R.attr.motionDurationShort4, 167);
        this.f52289d = sg.o.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, vf.a.f89243d);
        LinearInterpolator linearInterpolator = vf.a.f89240a;
        this.f52290e = sg.o.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f52291f = sg.o.resolveThemeInterpolator(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i10) {
        if (this.f52294i == null && this.f52296k == null) {
            Context context = this.f52292g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f52294i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f52294i;
            TextInputLayout textInputLayout = this.f52293h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f52296k = new FrameLayout(context);
            this.f52294i.addView(this.f52296k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.f52296k.setVisibility(0);
            this.f52296k.addView(appCompatTextView);
        } else {
            this.f52294i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f52294i.setVisibility(0);
        this.f52295j++;
    }

    public final void b() {
        if (this.f52294i != null) {
            TextInputLayout textInputLayout = this.f52293h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f52292g;
                boolean zIsFontScaleAtLeast1_3 = ug.d.isFontScaleAtLeast1_3(context);
                LinearLayout linearLayout = this.f52294i;
                int paddingStart = editText.getPaddingStart();
                if (zIsFontScaleAtLeast1_3) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zIsFontScaleAtLeast1_3) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zIsFontScaleAtLeast1_3) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f52297l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, AppCompatTextView appCompatTextView, int i10, int i11, int i12) {
        if (appCompatTextView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f52288c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f52287b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f52290e : this.f52291f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f52298m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f52286a);
            objectAnimatorOfFloat2.setInterpolator(this.f52289d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f52303r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f52310y;
    }

    public final void f() {
        this.f52301p = null;
        c();
        if (this.f52299n == 1) {
            if (!this.f52309x || TextUtils.isEmpty(this.f52308w)) {
                this.f52300o = 0;
            } else {
                this.f52300o = 2;
            }
        }
        i(this.f52299n, this.f52300o, h(this.f52303r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f52294i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f52296k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i11 = this.f52295j - 1;
        this.f52295j = i11;
        LinearLayout linearLayout2 = this.f52294i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f52293h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f52300o == this.f52299n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f52297l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f52309x, this.f52310y, 2, i10, i11);
            d(arrayList, this.f52302q, this.f52303r, 1, i10, i11);
            vf.b.playTogether(animatorSet, arrayList);
            animatorSet.addListener(new s(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f52299n = i11;
        }
        TextInputLayout textInputLayout = this.f52293h;
        textInputLayout.t();
        textInputLayout.w(z10, false);
        textInputLayout.z();
    }
}
