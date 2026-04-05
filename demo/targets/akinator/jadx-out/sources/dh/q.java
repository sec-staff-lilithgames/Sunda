package dh;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.n3;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f52254b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f52255c;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f52256e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f52257f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f52258g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f52259h;

    /* renamed from: i, reason: collision with root package name */
    public final CheckableImageButton f52260i;

    /* renamed from: j, reason: collision with root package name */
    public final p f52261j;

    /* renamed from: k, reason: collision with root package name */
    public int f52262k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f52263l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f52264m;

    /* renamed from: n, reason: collision with root package name */
    public PorterDuff.Mode f52265n;

    /* renamed from: o, reason: collision with root package name */
    public int f52266o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView.ScaleType f52267p;

    /* renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f52268q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f52269r;

    /* renamed from: s, reason: collision with root package name */
    public final AppCompatTextView f52270s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f52271t;

    /* renamed from: u, reason: collision with root package name */
    public EditText f52272u;

    /* renamed from: v, reason: collision with root package name */
    public final AccessibilityManager f52273v;

    /* renamed from: w, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f52274w;

    /* renamed from: x, reason: collision with root package name */
    public final m f52275x;

    public q(TextInputLayout textInputLayout, n3 n3Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f52262k = 0;
        this.f52263l = new LinkedHashSet();
        this.f52275x = new m(this);
        n nVar = new n(this);
        this.f52273v = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f52254b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f52255c = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f52256e = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f52260i = checkableImageButtonA2;
        this.f52261j = new p(this, n3Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f52270s = appCompatTextView;
        if (n3Var.hasValue(38)) {
            this.f52257f = ug.d.getColorStateList(getContext(), n3Var, 38);
        }
        if (n3Var.hasValue(39)) {
            this.f52258g = t0.parseTintMode(n3Var.getInt(39, -1), null);
        }
        if (n3Var.hasValue(37)) {
            i(n3Var.getDrawable(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!n3Var.hasValue(54)) {
            if (n3Var.hasValue(32)) {
                this.f52264m = ug.d.getColorStateList(getContext(), n3Var, 32);
            }
            if (n3Var.hasValue(33)) {
                this.f52265n = t0.parseTintMode(n3Var.getInt(33, -1), null);
            }
        }
        if (n3Var.hasValue(30)) {
            g(n3Var.getInt(30, 0));
            if (n3Var.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = n3Var.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(n3Var.getBoolean(26, true));
        } else if (n3Var.hasValue(54)) {
            if (n3Var.hasValue(55)) {
                this.f52264m = ug.d.getColorStateList(getContext(), n3Var, 55);
            }
            if (n3Var.hasValue(56)) {
                this.f52265n = t0.parseTintMode(n3Var.getInt(56, -1), null);
            }
            g(n3Var.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = n3Var.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = n3Var.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f52266o) {
            this.f52266o = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (n3Var.hasValue(31)) {
            ImageView.ScaleType scaleTypeE = kc.p.e(n3Var.getInt(31, -1));
            this.f52267p = scaleTypeE;
            checkableImageButtonA2.setScaleType(scaleTypeE);
            checkableImageButtonA.setScaleType(scaleTypeE);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        e4.t.setTextAppearance(appCompatTextView, n3Var.getResourceId(73, 0));
        if (n3Var.hasValue(74)) {
            appCompatTextView.setTextColor(n3Var.getColorStateList(74));
        }
        CharSequence text3 = n3Var.getText(72);
        this.f52269r = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.addOnEditTextAttachedListener(nVar);
        addOnAttachStateChangeListener(new o(this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (ug.d.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r eVar;
        int i10 = this.f52262k;
        p pVar = this.f52261j;
        SparseArray sparseArray = (SparseArray) pVar.f52252c;
        r rVar = (r) sparseArray.get(i10);
        if (rVar != null) {
            return rVar;
        }
        q qVar = (q) pVar.f52253d;
        if (i10 == -1) {
            eVar = new e(qVar, 0);
        } else if (i10 == 0) {
            eVar = new e(qVar, 1);
        } else if (i10 == 1) {
            eVar = new y(qVar, pVar.f52251b);
        } else if (i10 == 2) {
            eVar = new d(qVar);
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(a.b.e(i10, "Invalid end icon mode: "));
            }
            eVar = new l(qVar);
        }
        sparseArray.append(i10, eVar);
        return eVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f52260i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f52270s.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f52255c.getVisibility() == 0 && this.f52260i.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f52256e.getVisibility() == 0;
    }

    public final void f(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarB = b();
        boolean zH = rVarB.h();
        CheckableImageButton checkableImageButton = this.f52260i;
        boolean z12 = true;
        if (!zH || (zIsChecked = checkableImageButton.isChecked()) == rVarB.i()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!(rVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == ((l) rVarB).f52240l) {
            z12 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z10 || z12) {
            kc.p.N(this.f52254b, checkableImageButton, this.f52264m);
        }
    }

    public final void g(int i10) {
        if (this.f52262k == i10) {
            return;
        }
        r rVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f52274w;
        AccessibilityManager accessibilityManager = this.f52273v;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f52274w = null;
        rVarB.m();
        this.f52262k = i10;
        Iterator it = this.f52263l.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        h(i10 != 0);
        r rVarB2 = b();
        int iC = this.f52261j.f52250a;
        if (iC == 0) {
            iC = rVarB2.c();
        }
        Drawable drawable = iC != 0 ? l.a.getDrawable(getContext(), iC) : null;
        CheckableImageButton checkableImageButton = this.f52260i;
        checkableImageButton.setImageDrawable(drawable);
        TextInputLayout textInputLayout = this.f52254b;
        if (drawable != null) {
            kc.p.a(textInputLayout, checkableImageButton, this.f52264m, this.f52265n);
            kc.p.N(textInputLayout, checkableImageButton, this.f52264m);
        }
        int iB = rVarB2.b();
        CharSequence text = iB != 0 ? getResources().getText(iB) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(rVarB2.h());
        if (!rVarB2.g(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        rVarB2.l();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = rVarB2.getTouchExplorationStateChangeListener();
        this.f52274w = touchExplorationStateChangeListener2;
        if (touchExplorationStateChangeListener2 != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f52274w);
        }
        View.OnClickListener onClickListenerE = rVarB2.e();
        View.OnLongClickListener onLongClickListener = this.f52268q;
        checkableImageButton.setOnClickListener(onClickListenerE);
        kc.p.P(checkableImageButton, onLongClickListener);
        EditText editText = this.f52272u;
        if (editText != null) {
            rVarB2.onEditTextAttached(editText);
            j(rVarB2);
        }
        kc.p.a(textInputLayout, checkableImageButton, this.f52264m, this.f52265n);
        f(true);
    }

    public final void h(boolean z10) {
        if (d() != z10) {
            this.f52260i.setVisibility(z10 ? 0 : 8);
            k();
            m();
            this.f52254b.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f52256e;
        checkableImageButton.setImageDrawable(drawable);
        l();
        kc.p.a(this.f52254b, checkableImageButton, this.f52257f, this.f52258g);
    }

    public final void j(r rVar) {
        if (this.f52272u == null) {
            return;
        }
        if (rVar.d() != null) {
            this.f52272u.setOnFocusChangeListener(rVar.d());
        }
        if (rVar.f() != null) {
            this.f52260i.setOnFocusChangeListener(rVar.f());
        }
    }

    public final void k() {
        this.f52255c.setVisibility((this.f52260i.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f52269r == null || this.f52271t) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f52256e;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f52254b;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.isErrorEnabled() && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.f52262k != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f52254b;
        if (textInputLayout.f29477g == null) {
            return;
        }
        this.f52270s.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f29477g.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f29477g.getPaddingEnd(), textInputLayout.f29477g.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.f52270s;
        int visibility = appCompatTextView.getVisibility();
        int i10 = (this.f52269r == null || this.f52271t) ? 8 : 0;
        if (visibility != i10) {
            b().j(i10 == 0);
        }
        k();
        appCompatTextView.setVisibility(i10);
        this.f52254b.s();
    }
}
