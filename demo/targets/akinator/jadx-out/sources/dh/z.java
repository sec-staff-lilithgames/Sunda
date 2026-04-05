package dh;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import q.n3;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class z extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f52327b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f52328c;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f52329e;

    /* renamed from: f, reason: collision with root package name */
    public final CheckableImageButton f52330f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f52331g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f52332h;

    /* renamed from: i, reason: collision with root package name */
    public int f52333i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView.ScaleType f52334j;

    /* renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f52335k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52336l;

    public z(TextInputLayout textInputLayout, n3 n3Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f52327b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f52330f = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f52328c = appCompatTextView;
        if (ug.d.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f52335k;
        checkableImageButton.setOnClickListener(null);
        kc.p.P(checkableImageButton, onLongClickListener);
        this.f52335k = null;
        checkableImageButton.setOnLongClickListener(null);
        kc.p.P(checkableImageButton, null);
        if (n3Var.hasValue(70)) {
            this.f52331g = ug.d.getColorStateList(getContext(), n3Var, 70);
        }
        if (n3Var.hasValue(71)) {
            this.f52332h = t0.parseTintMode(n3Var.getInt(71, -1), null);
        }
        if (n3Var.hasValue(67)) {
            b(n3Var.getDrawable(67));
            if (n3Var.hasValue(66) && checkableImageButton.getContentDescription() != (text = n3Var.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(n3Var.getBoolean(65, true));
        }
        int dimensionPixelSize = n3Var.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f52333i) {
            this.f52333i = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (n3Var.hasValue(69)) {
            ImageView.ScaleType scaleTypeE = kc.p.e(n3Var.getInt(69, -1));
            this.f52334j = scaleTypeE;
            checkableImageButton.setScaleType(scaleTypeE);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        e4.t.setTextAppearance(appCompatTextView, n3Var.getResourceId(61, 0));
        if (n3Var.hasValue(62)) {
            appCompatTextView.setTextColor(n3Var.getColorStateList(62));
        }
        CharSequence text2 = n3Var.getText(60);
        this.f52329e = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final int a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f52330f;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f52328c.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f52330f;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f52331g;
            PorterDuff.Mode mode = this.f52332h;
            TextInputLayout textInputLayout = this.f52327b;
            kc.p.a(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            kc.p.N(textInputLayout, checkableImageButton, this.f52331g);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f52335k;
        checkableImageButton.setOnClickListener(null);
        kc.p.P(checkableImageButton, onLongClickListener);
        this.f52335k = null;
        checkableImageButton.setOnLongClickListener(null);
        kc.p.P(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z10) {
        CheckableImageButton checkableImageButton = this.f52330f;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            checkableImageButton.setVisibility(z10 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.f52327b.f29477g;
        if (editText == null) {
            return;
        }
        this.f52328c.setPaddingRelative(this.f52330f.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i10 = (this.f52329e == null || this.f52336l) ? 8 : 0;
        setVisibility((this.f52330f.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f52328c.setVisibility(i10);
        this.f52327b.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        d();
    }
}
