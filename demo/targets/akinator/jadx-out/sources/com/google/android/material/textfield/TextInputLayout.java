package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import dh.a0;
import dh.b0;
import dh.d0;
import dh.e0;
import dh.f;
import dh.f0;
import dh.g0;
import dh.h;
import dh.l;
import dh.n;
import dh.q;
import dh.u;
import dh.x;
import dh.z;
import e4.t;
import e6.m;
import e6.m0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import q.l1;
import q.n3;
import q.w;
import qg.c0;
import qg.g;
import qg.i;
import qg.j0;
import qg.t0;
import sg.o;
import ug.d;
import x3.b;
import x3.z1;
import y3.c;
import yg.j;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] F0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public m A;
    public boolean A0;
    public ColorStateList B;
    public ValueAnimator B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public ColorStateList E;
    public boolean E0;
    public boolean F;
    public CharSequence G;
    public boolean H;
    public j I;
    public j J;
    public StateListDrawable K;
    public boolean L;
    public j M;
    public j N;
    public p O;
    public boolean P;
    public final int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0, reason: collision with root package name */
    public int f29467a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f29468b;

    /* renamed from: b0, reason: collision with root package name */
    public final Rect f29469b0;

    /* renamed from: c, reason: collision with root package name */
    public final z f29470c;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f29471c0;

    /* renamed from: d0, reason: collision with root package name */
    public final RectF f29472d0;

    /* renamed from: e, reason: collision with root package name */
    public final q f29473e;

    /* renamed from: e0, reason: collision with root package name */
    public Typeface f29474e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f29475f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f29476f0;

    /* renamed from: g, reason: collision with root package name */
    public EditText f29477g;

    /* renamed from: g0, reason: collision with root package name */
    public int f29478g0;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f29479h;

    /* renamed from: h0, reason: collision with root package name */
    public final LinkedHashSet f29480h0;

    /* renamed from: i, reason: collision with root package name */
    public int f29481i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorDrawable f29482i0;

    /* renamed from: j, reason: collision with root package name */
    public int f29483j;

    /* renamed from: j0, reason: collision with root package name */
    public int f29484j0;

    /* renamed from: k, reason: collision with root package name */
    public int f29485k;

    /* renamed from: k0, reason: collision with root package name */
    public Drawable f29486k0;

    /* renamed from: l, reason: collision with root package name */
    public int f29487l;

    /* renamed from: l0, reason: collision with root package name */
    public ColorStateList f29488l0;

    /* renamed from: m, reason: collision with root package name */
    public final u f29489m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f29490m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29491n;

    /* renamed from: n0, reason: collision with root package name */
    public int f29492n0;

    /* renamed from: o, reason: collision with root package name */
    public int f29493o;

    /* renamed from: o0, reason: collision with root package name */
    public int f29494o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29495p;

    /* renamed from: p0, reason: collision with root package name */
    public int f29496p0;

    /* renamed from: q, reason: collision with root package name */
    public e0 f29497q;

    /* renamed from: q0, reason: collision with root package name */
    public ColorStateList f29498q0;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f29499r;

    /* renamed from: r0, reason: collision with root package name */
    public int f29500r0;

    /* renamed from: s, reason: collision with root package name */
    public int f29501s;

    /* renamed from: s0, reason: collision with root package name */
    public int f29502s0;

    /* renamed from: t, reason: collision with root package name */
    public int f29503t;

    /* renamed from: t0, reason: collision with root package name */
    public int f29504t0;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f29505u;

    /* renamed from: u0, reason: collision with root package name */
    public int f29506u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29507v;

    /* renamed from: v0, reason: collision with root package name */
    public int f29508v0;

    /* renamed from: w, reason: collision with root package name */
    public AppCompatTextView f29509w;

    /* renamed from: w0, reason: collision with root package name */
    public int f29510w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f29511x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f29512x0;

    /* renamed from: y, reason: collision with root package name */
    public int f29513y;

    /* renamed from: y0, reason: collision with root package name */
    public final g f29514y0;

    /* renamed from: z, reason: collision with root package name */
    public m f29515z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f29516z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new com.google.android.material.textfield.a();

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f29517e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f29518f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29517e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29518f = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f29517e) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f29517e, parcel, i10);
            parcel.writeInt(this.f29518f ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends b {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f29519d;

        public a(TextInputLayout textInputLayout) {
            this.f29519d = textInputLayout;
        }

        @Override // x3.b
        public void onInitializeAccessibilityNodeInfo(View view, c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            TextInputLayout textInputLayout = this.f29519d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean z10 = textInputLayout.f29512x0;
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            z zVar = textInputLayout.f29470c;
            View view2 = zVar.f52328c;
            if (view2.getVisibility() == 0) {
                cVar.setLabelFor(view2);
                cVar.setTraversalAfter(view2);
            } else {
                cVar.setTraversalAfter(zVar.f52330f);
            }
            if (!zIsEmpty) {
                cVar.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                cVar.setText(string);
                if (!z10 && placeholderText != null) {
                    cVar.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.setHintText(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    cVar.setText(string);
                }
                cVar.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                cVar.setError(error);
            }
            View view3 = textInputLayout.f29489m.f52310y;
            if (view3 != null) {
                cVar.setLabelFor(view3);
            }
            textInputLayout.f29473e.b().onInitializeAccessibilityNodeInfo(view, cVar);
        }

        @Override // x3.b
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f29519d.f29473e.b().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f29477g;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.I;
        }
        int color = jg.b.getColor(this.f29477g, com.digidust.elokence.akinator.freemium.R.attr.colorControlHighlight);
        int i10 = this.R;
        int[][] iArr = F0;
        if (i10 != 2) {
            if (i10 != 1) {
                return null;
            }
            j jVar = this.I;
            int i11 = this.f29467a0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{jg.b.layer(color, i11, 0.1f), i11}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.I;
        int color2 = jg.b.getColor(context, com.digidust.elokence.akinator.freemium.R.attr.colorSurface, "TextInputLayout");
        j jVar3 = new j(jVar2.getShapeAppearanceModel());
        int iLayer = jg.b.layer(color, color2, 0.1f);
        jVar3.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        jVar3.setTint(color2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color2});
        j jVar4 = new j(jVar2.getShapeAppearanceModel());
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.K == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.K = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.K.addState(new int[0], h(false));
        }
        return this.K;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.J == null) {
            this.J = h(true);
        }
        return this.J;
    }

    public static void m(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z10);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f29477g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f29477g = editText;
        int i10 = this.f29481i;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f29485k);
        }
        int i11 = this.f29483j;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f29487l);
        }
        this.L = false;
        k();
        setTextInputAccessibilityDelegate(new a(this));
        Typeface typeface = this.f29477g.getTypeface();
        g gVar = this.f29514y0;
        gVar.setTypefaces(typeface);
        gVar.setExpandedTextSize(this.f29477g.getTextSize());
        gVar.setExpandedLetterSpacing(this.f29477g.getLetterSpacing());
        int gravity = this.f29477g.getGravity();
        gVar.setCollapsedTextGravity((gravity & (-113)) | 48);
        gVar.setExpandedTextGravity(gravity);
        this.f29510w0 = editText.getMinimumHeight();
        this.f29477g.addTextChangedListener(new a0(this, editText));
        if (this.f29488l0 == null) {
            this.f29488l0 = this.f29477g.getHintTextColors();
        }
        if (this.F) {
            if (TextUtils.isEmpty(this.G)) {
                CharSequence hint = this.f29477g.getHint();
                this.f29479h = hint;
                setHint(hint);
                this.f29477g.setHint((CharSequence) null);
            }
            this.H = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.f29499r != null) {
            p(this.f29477g.getText());
        }
        t();
        this.f29489m.b();
        this.f29470c.bringToFront();
        q qVar = this.f29473e;
        qVar.bringToFront();
        Iterator it = this.f29480h0.iterator();
        while (it.hasNext()) {
            ((n) ((f0) it.next())).onEditTextAttached(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.G)) {
            return;
        }
        this.G = charSequence;
        this.f29514y0.setText(charSequence);
        if (this.f29512x0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f29507v == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f29509w;
            if (appCompatTextView != null) {
                this.f29468b.addView(appCompatTextView);
                this.f29509w.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f29509w;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f29509w = null;
        }
        this.f29507v = z10;
    }

    public final void a() {
        if (this.f29477g == null || this.R != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f29477g;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f29514y0.getCollapsedTextHeight() + this.f29475f), this.f29477g.getPaddingEnd(), getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (d.isFontScaleAtLeast2_0(getContext())) {
            EditText editText2 = this.f29477g;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f29477g.getPaddingEnd(), getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (d.isFontScaleAtLeast1_3(getContext())) {
            EditText editText3 = this.f29477g;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f29477g.getPaddingEnd(), getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public void addOnEditTextAttachedListener(f0 f0Var) {
        this.f29480h0.add(f0Var);
        if (this.f29477g != null) {
            ((n) f0Var).onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(g0 g0Var) {
        this.f29473e.f52263l.add(g0Var);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f29468b;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f10) {
        g gVar = this.f29514y0;
        if (gVar.getExpansionFraction() == f10) {
            return;
        }
        if (this.B0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.B0 = valueAnimator;
            valueAnimator.setInterpolator(o.resolveThemeInterpolator(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionEasingEmphasizedInterpolator, vf.a.f89241b));
            this.B0.setDuration(o.resolveThemeDuration(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionDurationMedium4, 167));
            this.B0.addUpdateListener(new d0(this));
        }
        this.B0.setFloatValues(gVar.getExpansionFraction(), f10);
        this.B0.start();
    }

    public final void c() {
        int i10;
        int i11;
        j jVar = this.I;
        if (jVar == null) {
            return;
        }
        p shapeAppearanceModel = jVar.getShapeAppearanceModel();
        p pVar = this.O;
        if (shapeAppearanceModel != pVar) {
            this.I.setShapeAppearanceModel(pVar);
        }
        if (this.R == 2 && (i10 = this.T) > -1 && (i11 = this.W) != 0) {
            this.I.setStroke(i10, i11);
        }
        int iLayer = this.f29467a0;
        if (this.R == 1) {
            iLayer = jg.b.layer(jg.b.getColor(this, com.digidust.elokence.akinator.freemium.R.attr.colorSurface, 0), this.f29467a0);
        }
        this.f29467a0 = iLayer;
        this.I.setFillColor(ColorStateList.valueOf(iLayer));
        j jVar2 = this.M;
        if (jVar2 != null && this.N != null) {
            if (this.T > -1 && this.W != 0) {
                jVar2.setFillColor(this.f29477g.isFocused() ? ColorStateList.valueOf(this.f29492n0) : ColorStateList.valueOf(this.W));
                this.N.setFillColor(ColorStateList.valueOf(this.W));
            }
            invalidate();
        }
        u();
    }

    public void clearOnEditTextAttachedListeners() {
        this.f29480h0.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.f29473e.f52263l.clear();
    }

    public final Rect d(Rect rect) {
        if (this.f29477g == null) {
            throw new IllegalStateException();
        }
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        int i10 = rect.bottom;
        Rect rect2 = this.f29471c0;
        rect2.bottom = i10;
        int i11 = this.R;
        if (i11 == 1) {
            rect2.left = i(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.S;
            rect2.right = j(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = i(rect.left, zIsLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, zIsLayoutRtl);
            return rect2;
        }
        rect2.left = this.f29477g.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.f29477g.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f29477g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f29479h != null) {
            boolean z10 = this.H;
            this.H = false;
            CharSequence hint = editText.getHint();
            this.f29477g.setHint(this.f29479h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f29477g.setHint(hint);
                this.H = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f29468b;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f29477g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.D0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.D0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        j jVar;
        super.draw(canvas);
        boolean z10 = this.F;
        g gVar = this.f29514y0;
        if (z10) {
            gVar.draw(canvas);
        }
        if (this.N == null || (jVar = this.M) == null) {
            return;
        }
        jVar.draw(canvas);
        if (this.f29477g.isFocused()) {
            Rect bounds = this.N.getBounds();
            Rect bounds2 = this.M.getBounds();
            float expansionFraction = gVar.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = vf.a.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = vf.a.lerp(iCenterX, bounds2.right, expansionFraction);
            this.N.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.C0) {
            return;
        }
        this.C0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        g gVar = this.f29514y0;
        boolean state = gVar != null ? gVar.setState(drawableState) : false;
        if (this.f29477g != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (state) {
            invalidate();
        }
        this.C0 = false;
    }

    public final int e() {
        if (this.F) {
            int i10 = this.R;
            g gVar = this.f29514y0;
            if (i10 == 0) {
                return (int) gVar.getCollapsedTextHeight();
            }
            if (i10 == 2) {
                return getHintMaxLines() == 1 ? (int) (gVar.getCollapsedTextHeight() / 2.0f) : Math.max(0, (int) (gVar.getCollapsedTextHeight() - (gVar.getCollapsedSingleLineHeight() / 2.0f)));
            }
        }
        return 0;
    }

    public final m f() {
        m mVar = new m();
        mVar.setDuration(o.resolveThemeDuration(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionDurationShort2, 87));
        mVar.setInterpolator(o.resolveThemeInterpolator(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionEasingLinearInterpolator, vf.a.f89240a));
        return mVar;
    }

    public final boolean g() {
        return this.F && !TextUtils.isEmpty(this.G) && (this.I instanceof h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f29477g;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i10 = this.R;
        if (i10 == 1 || i10 == 2) {
            return this.I;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f29467a0;
    }

    public int getBoxBackgroundMode() {
        return this.R;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.S;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        RectF rectF = this.f29472d0;
        return zIsLayoutRtl ? this.O.getBottomLeftCornerSize().getCornerSize(rectF) : this.O.getBottomRightCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        RectF rectF = this.f29472d0;
        return zIsLayoutRtl ? this.O.getBottomRightCornerSize().getCornerSize(rectF) : this.O.getBottomLeftCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        RectF rectF = this.f29472d0;
        return zIsLayoutRtl ? this.O.getTopLeftCornerSize().getCornerSize(rectF) : this.O.getTopRightCornerSize().getCornerSize(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        RectF rectF = this.f29472d0;
        return zIsLayoutRtl ? this.O.getTopRightCornerSize().getCornerSize(rectF) : this.O.getTopLeftCornerSize().getCornerSize(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f29496p0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f29498q0;
    }

    public int getBoxStrokeWidth() {
        return this.U;
    }

    public int getBoxStrokeWidthFocused() {
        return this.V;
    }

    public int getCounterMaxLength() {
        return this.f29493o;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f29491n && this.f29495p && (appCompatTextView = this.f29499r) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.C;
    }

    public ColorStateList getCounterTextColor() {
        return this.B;
    }

    public ColorStateList getCursorColor() {
        return this.D;
    }

    public ColorStateList getCursorErrorColor() {
        return this.E;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f29488l0;
    }

    public EditText getEditText() {
        return this.f29477g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f29473e.f52260i.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f29473e.f52260i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f29473e.f52266o;
    }

    public int getEndIconMode() {
        return this.f29473e.f52262k;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f29473e.f52267p;
    }

    public CheckableImageButton getEndIconView() {
        return this.f29473e.f52260i;
    }

    public CharSequence getError() {
        u uVar = this.f29489m;
        if (uVar.f52302q) {
            return uVar.f52301p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f29489m.f52305t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f29489m.f52304s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f29489m.f52303r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f29473e.f52256e.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f29489m;
        if (uVar.f52309x) {
            return uVar.f52308w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f29489m.f52310y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.F) {
            return this.G;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f29514y0.getCollapsedTextHeight();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f29514y0.getCurrentCollapsedTextColor();
    }

    public int getHintMaxLines() {
        return this.f29514y0.getExpandedMaxLines();
    }

    public ColorStateList getHintTextColor() {
        return this.f29490m0;
    }

    public e0 getLengthCounter() {
        return this.f29497q;
    }

    public int getMaxEms() {
        return this.f29483j;
    }

    public int getMaxWidth() {
        return this.f29487l;
    }

    public int getMinEms() {
        return this.f29481i;
    }

    public int getMinWidth() {
        return this.f29485k;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f29473e.f52260i.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f29473e.f52260i.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f29507v) {
            return this.f29505u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f29513y;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f29511x;
    }

    public CharSequence getPrefixText() {
        return this.f29470c.f52329e;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f29470c.f52328c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f29470c.f52328c;
    }

    public p getShapeAppearanceModel() {
        return this.O;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f29470c.f52330f.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f29470c.f52330f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f29470c.f52333i;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f29470c.f52334j;
    }

    public CharSequence getSuffixText() {
        return this.f29473e.f52269r;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f29473e.f52270s.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f29473e.f52270s;
    }

    public Typeface getTypeface() {
        return this.f29474e0;
    }

    public final j h(boolean z10) throws Resources.NotFoundException {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f29477g;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        p pVarBuild = p.builder().setTopLeftCornerSize(f10).setTopRightCornerSize(f10).setBottomLeftCornerSize(dimensionPixelOffset).setBottomRightCornerSize(dimensionPixelOffset).build();
        EditText editText2 = this.f29477g;
        j jVarCreateWithElevationOverlay = j.createWithElevationOverlay(getContext(), popupElevation, editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null);
        jVarCreateWithElevationOverlay.setShapeAppearanceModel(pVarBuild);
        jVarCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return jVarCreateWithElevationOverlay;
    }

    public final int i(int i10, boolean z10) {
        return ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f29477g.getCompoundPaddingLeft() : this.f29473e.c() : this.f29470c.a()) + i10;
    }

    public boolean isCounterEnabled() {
        return this.f29491n;
    }

    public boolean isEndIconCheckable() {
        return this.f29473e.f52260i.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.f29473e.d();
    }

    public boolean isErrorEnabled() {
        return this.f29489m.f52302q;
    }

    public boolean isExpandedHintEnabled() {
        return this.f29516z0;
    }

    public boolean isHelperTextEnabled() {
        return this.f29489m.f52309x;
    }

    public boolean isHintAnimationEnabled() {
        return this.A0;
    }

    public boolean isHintEnabled() {
        return this.F;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.f29473e.f52262k == 1;
    }

    public boolean isProvidingHint() {
        return this.H;
    }

    public boolean isStartIconCheckable() {
        return this.f29470c.f52330f.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.f29470c.f52330f.getVisibility() == 0;
    }

    public final int j(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f29477g.getCompoundPaddingRight() : this.f29470c.a() : this.f29473e.c());
    }

    public final void k() {
        int i10 = this.R;
        if (i10 == 0) {
            this.I = null;
            this.M = null;
            this.N = null;
        } else if (i10 == 1) {
            this.I = new j(this.O);
            this.M = new j();
            this.N = new j();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(a.b.f(this.R, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.F || (this.I instanceof h)) {
                this.I = new j(this.O);
            } else {
                p pVar = this.O;
                int i11 = h.K;
                if (pVar == null) {
                    pVar = new p();
                }
                f fVar = new f(pVar, new RectF());
                dh.g gVar = new dh.g(fVar);
                gVar.J = fVar;
                this.I = gVar;
            }
            this.M = null;
            this.N = null;
        }
        u();
        z();
        if (this.R == 1) {
            if (d.isFontScaleAtLeast2_0(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (d.isFontScaleAtLeast1_3(getContext())) {
                this.S = getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.R != 0) {
            v();
        }
        EditText editText = this.f29477g;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.R;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void l() {
        if (g()) {
            int width = this.f29477g.getWidth();
            int gravity = this.f29477g.getGravity();
            g gVar = this.f29514y0;
            RectF rectF = this.f29472d0;
            gVar.getCollapsedTextBottomTextBounds(rectF, width, gravity);
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f10 = rectF.left;
            float f11 = this.Q;
            rectF.left = f10 - f11;
            rectF.right += f11;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.T);
            rectF.top = 0.0f;
            h hVar = (h) this.I;
            hVar.getClass();
            hVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i10) {
        try {
            t.setTextAppearance(appCompatTextView, i10);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        t.setTextAppearance(appCompatTextView, com.digidust.elokence.akinator.freemium.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(m3.a.getColor(getContext(), com.digidust.elokence.akinator.freemium.R.color.design_error));
    }

    public final boolean o() {
        u uVar = this.f29489m;
        return (uVar.f52300o != 1 || uVar.f52303r == null || TextUtils.isEmpty(uVar.f52301p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f29514y0.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int iMax;
        q qVar = this.f29473e;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z10 = false;
        this.E0 = false;
        if (this.f29477g != null && this.f29477g.getMeasuredHeight() < (iMax = Math.max(qVar.getMeasuredHeight(), this.f29470c.getMeasuredHeight()))) {
            this.f29477g.setMinimumHeight(iMax);
            z10 = true;
        }
        boolean zS = s();
        if (z10 || zS) {
            this.f29477g.post(new com.unity3d.services.banners.view.a(this, 9));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int compoundPaddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f29477g;
        if (editText != null) {
            Rect rect = this.f29469b0;
            i.getDescendantRect(this, editText, rect);
            j jVar = this.M;
            if (jVar != null) {
                int i14 = rect.bottom;
                jVar.setBounds(rect.left, i14 - this.U, rect.right, i14);
            }
            j jVar2 = this.N;
            if (jVar2 != null) {
                int i15 = rect.bottom;
                jVar2.setBounds(rect.left, i15 - this.V, rect.right, i15);
            }
            if (this.F) {
                float textSize = this.f29477g.getTextSize();
                g gVar = this.f29514y0;
                gVar.setExpandedTextSize(textSize);
                int gravity = this.f29477g.getGravity();
                gVar.setCollapsedTextGravity((gravity & (-113)) | 48);
                gVar.setExpandedTextGravity(gravity);
                gVar.setCollapsedBounds(d(rect));
                if (this.f29477g == null) {
                    throw new IllegalStateException();
                }
                float expandedTextSingleLineHeight = getHintMaxLines() == 1 ? gVar.getExpandedTextSingleLineHeight() : gVar.getExpandedTextFullSingleLineHeight() * gVar.getExpandedLineCount();
                int compoundPaddingLeft = this.f29477g.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.f29471c0;
                rect2.left = compoundPaddingLeft;
                if (this.R != 1 || this.f29477g.getMinLines() > 1) {
                    compoundPaddingTop = (this.f29477g.getCompoundPaddingTop() + rect.top) - ((this.R != 0 || getHintMaxLines() == 1) ? 0 : (int) (gVar.getExpandedTextSingleLineHeight() / 2.0f));
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (expandedTextSingleLineHeight / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.f29477g.getCompoundPaddingRight();
                rect2.bottom = (this.R != 1 || this.f29477g.getMinLines() > 1) ? rect.bottom - this.f29477g.getCompoundPaddingBottom() : (int) (rect2.top + expandedTextSingleLineHeight);
                gVar.setExpandedBounds(rect2);
                gVar.recalculate();
                if (!g() || this.f29512x0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) throws c0 {
        EditText editText;
        super.onMeasure(i10, i11);
        boolean z10 = this.E0;
        q qVar = this.f29473e;
        if (!z10) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.E0 = true;
        }
        if (this.f29509w != null && (editText = this.f29477g) != null) {
            this.f29509w.setGravity(editText.getGravity());
            this.f29509w.setPadding(this.f29477g.getCompoundPaddingLeft(), this.f29477g.getCompoundPaddingTop(), this.f29477g.getCompoundPaddingRight(), this.f29477g.getCompoundPaddingBottom());
        }
        qVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f29477g.getMeasuredWidth() - this.f29477g.getCompoundPaddingLeft()) - this.f29477g.getCompoundPaddingRight();
        g gVar = this.f29514y0;
        gVar.updateTextHeights(measuredWidth);
        EditText editText2 = this.f29477g;
        Rect rect = this.f29469b0;
        i.getDescendantRect(this, editText2, rect);
        gVar.setCollapsedBounds(d(rect));
        v();
        a();
        if (this.f29477g == null) {
            return;
        }
        float expandedTextHeight = gVar.getExpandedTextHeight();
        if (this.f29505u != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.f29509w.getPaint());
            textPaint.setTextSize(this.f29509w.getTextSize());
            textPaint.setTypeface(this.f29509w.getTypeface());
            textPaint.setLetterSpacing(this.f29509w.getLetterSpacing());
            collapsedTextHeight = (this.R == 1 ? gVar.getCollapsedTextHeight() + this.S + this.f29475f : 0.0f) + qg.d0.obtain(this.f29505u, textPaint, measuredWidth).setIsRtl(getLayoutDirection() == 1).setIncludePad(true).setLineSpacing(this.f29509w.getLineSpacingExtra(), this.f29509w.getLineSpacingMultiplier()).setStaticLayoutBuilderConfigurer(new af.g(this, 21)).build().getHeight();
        }
        float fMax = Math.max(expandedTextHeight, collapsedTextHeight);
        if (this.f29477g.getMeasuredHeight() < fMax) {
            this.f29477g.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f29517e);
        if (savedState.f29518f) {
            post(new dh.c0(this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.P) {
            yg.d topLeftCornerSize = this.O.getTopLeftCornerSize();
            RectF rectF = this.f29472d0;
            float cornerSize = topLeftCornerSize.getCornerSize(rectF);
            float cornerSize2 = this.O.getTopRightCornerSize().getCornerSize(rectF);
            p pVarBuild = p.builder().setTopLeftCorner(this.O.getTopRightCorner()).setTopRightCorner(this.O.getTopLeftCorner()).setBottomLeftCorner(this.O.getBottomRightCorner()).setBottomRightCorner(this.O.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(this.O.getBottomRightCornerSize().getCornerSize(rectF)).setBottomRightCornerSize(this.O.getBottomLeftCornerSize().getCornerSize(rectF)).build();
            this.P = z10;
            setShapeAppearanceModel(pVarBuild);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (o()) {
            savedState.f29517e = getError();
        }
        q qVar = this.f29473e;
        savedState.f29518f = qVar.f52262k != 0 && qVar.f52260i.isChecked();
        return savedState;
    }

    public final void p(Editable editable) {
        int iCountLength = ((com.google.android.gms.internal.ads.a) this.f29497q).countLength(editable);
        boolean z10 = this.f29495p;
        int i10 = this.f29493o;
        if (i10 == -1) {
            this.f29499r.setText(String.valueOf(iCountLength));
            this.f29499r.setContentDescription(null);
            this.f29495p = false;
        } else {
            this.f29495p = iCountLength > i10;
            Context context = getContext();
            this.f29499r.setContentDescription(context.getString(this.f29495p ? com.digidust.elokence.akinator.freemium.R.string.character_counter_overflowed_content_description : com.digidust.elokence.akinator.freemium.R.string.character_counter_content_description, Integer.valueOf(iCountLength), Integer.valueOf(this.f29493o)));
            if (z10 != this.f29495p) {
                q();
            }
            this.f29499r.setText(v3.c.getInstance().unicodeWrap(getContext().getString(com.digidust.elokence.akinator.freemium.R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.f29493o))));
        }
        if (this.f29477g == null || z10 == this.f29495p) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z10) {
        q qVar = this.f29473e;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        if (qVar.f52262k == 1) {
            checkableImageButton.performClick();
            if (z10) {
                checkableImageButton.jumpDrawablesToCurrentState();
            }
        }
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f29499r;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.f29495p ? this.f29501s : this.f29503t);
            if (!this.f29495p && (colorStateList2 = this.B) != null) {
                this.f29499r.setTextColor(colorStateList2);
            }
            if (!this.f29495p || (colorStateList = this.C) == null) {
                return;
            }
            this.f29499r.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListOrNull = this.D;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = jg.b.getColorStateListOrNull(getContext(), com.digidust.elokence.akinator.freemium.R.attr.colorControlActivated);
        }
        EditText editText = this.f29477g;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = p3.a.wrap(this.f29477g.getTextCursorDrawable()).mutate();
        if ((o() || (this.f29499r != null && this.f29495p)) && (colorStateList = this.E) != null) {
            colorStateListOrNull = colorStateList;
        }
        drawableMutate.setTintList(colorStateListOrNull);
    }

    public void refreshEndIconDrawableState() {
        q qVar = this.f29473e;
        kc.p.N(qVar.f52254b, qVar.f52260i, qVar.f52264m);
    }

    public void refreshErrorIconDrawableState() {
        q qVar = this.f29473e;
        kc.p.N(qVar.f52254b, qVar.f52256e, qVar.f52257f);
    }

    public void refreshStartIconDrawableState() {
        z zVar = this.f29470c;
        kc.p.N(zVar.f52327b, zVar.f52330f, zVar.f52331g);
    }

    public void removeOnEditTextAttachedListener(f0 f0Var) {
        this.f29480h0.remove(f0Var);
    }

    public void removeOnEndIconChangedListener(g0 g0Var) {
        this.f29473e.f52263l.remove(g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s():boolean");
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f29467a0 != i10) {
            this.f29467a0 = i10;
            this.f29500r0 = i10;
            this.f29504t0 = i10;
            this.f29506u0 = i10;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(m3.a.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f29500r0 = defaultColor;
        this.f29467a0 = defaultColor;
        this.f29502s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f29504t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f29506u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.R) {
            return;
        }
        this.R = i10;
        if (this.f29477g != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.S = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.O = this.O.toBuilder().setTopLeftCorner(i10, this.O.getTopLeftCornerSize()).setTopRightCorner(i10, this.O.getTopRightCornerSize()).setBottomLeftCorner(i10, this.O.getBottomLeftCornerSize()).setBottomRightCorner(i10, this.O.getBottomRightCornerSize()).build();
        c();
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        this.P = zIsLayoutRtl;
        float f14 = zIsLayoutRtl ? f11 : f10;
        if (!zIsLayoutRtl) {
            f10 = f11;
        }
        float f15 = zIsLayoutRtl ? f13 : f12;
        if (!zIsLayoutRtl) {
            f12 = f13;
        }
        j jVar = this.I;
        if (jVar != null && jVar.getTopLeftCornerResolvedSize() == f14 && this.I.getTopRightCornerResolvedSize() == f10 && this.I.getBottomLeftCornerResolvedSize() == f15 && this.I.getBottomRightCornerResolvedSize() == f12) {
            return;
        }
        this.O = this.O.toBuilder().setTopLeftCornerSize(f14).setTopRightCornerSize(f10).setBottomLeftCornerSize(f15).setBottomRightCornerSize(f12).build();
        c();
    }

    public void setBoxCornerRadiiResources(int i10, int i11, int i12, int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f29496p0 != i10) {
            this.f29496p0 = i10;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f29492n0 = colorStateList.getDefaultColor();
            this.f29508v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f29494o0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f29496p0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f29496p0 != colorStateList.getDefaultColor()) {
            this.f29496p0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f29498q0 != colorStateList) {
            this.f29498q0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.U = i10;
        z();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.V = i10;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f29491n != z10) {
            u uVar = this.f29489m;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f29499r = appCompatTextView;
                appCompatTextView.setId(com.digidust.elokence.akinator.freemium.R.id.textinput_counter);
                Typeface typeface = this.f29474e0;
                if (typeface != null) {
                    this.f29499r.setTypeface(typeface);
                }
                this.f29499r.setMaxLines(1);
                uVar.a(this.f29499r, 2);
                ((ViewGroup.MarginLayoutParams) this.f29499r.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.f29499r != null) {
                    EditText editText = this.f29477g;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f29499r, 2);
                this.f29499r = null;
            }
            this.f29491n = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f29493o != i10) {
            if (i10 > 0) {
                this.f29493o = i10;
            } else {
                this.f29493o = -1;
            }
            if (!this.f29491n || this.f29499r == null) {
                return;
            }
            EditText editText = this.f29477g;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f29501s != i10) {
            this.f29501s = i10;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f29503t != i10) {
            this.f29503t = i10;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (o() || (this.f29499r != null && this.f29495p)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f29488l0 = colorStateList;
        this.f29490m0 = colorStateList;
        if (this.f29477g != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f29473e.f52260i.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f29473e.f52260i.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        q qVar = this.f29473e;
        CharSequence text = i10 != 0 ? qVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        q qVar = this.f29473e;
        Drawable drawable = i10 != 0 ? l.a.getDrawable(qVar.getContext(), i10) : null;
        TextInputLayout textInputLayout = qVar.f52254b;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            kc.p.a(textInputLayout, checkableImageButton, qVar.f52264m, qVar.f52265n);
            kc.p.N(textInputLayout, checkableImageButton, qVar.f52264m);
        }
    }

    public void setEndIconMinSize(int i10) {
        q qVar = this.f29473e;
        if (i10 < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != qVar.f52266o) {
            qVar.f52266o = i10;
            CheckableImageButton checkableImageButton = qVar.f52260i;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = qVar.f52256e;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f29473e.g(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f29473e;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        View.OnLongClickListener onLongClickListener = qVar.f52268q;
        checkableImageButton.setOnClickListener(onClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f29473e;
        qVar.f52268q = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f29473e;
        qVar.f52267p = scaleType;
        qVar.f52260i.setScaleType(scaleType);
        qVar.f52256e.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f29473e;
        if (qVar.f52264m != colorStateList) {
            qVar.f52264m = colorStateList;
            kc.p.a(qVar.f52254b, qVar.f52260i, colorStateList, qVar.f52265n);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f29473e;
        if (qVar.f52265n != mode) {
            qVar.f52265n = mode;
            kc.p.a(qVar.f52254b, qVar.f52260i, qVar.f52264m, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f29473e.h(z10);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f29489m;
        if (!uVar.f52302q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.f52301p = charSequence;
        uVar.f52303r.setText(charSequence);
        int i10 = uVar.f52299n;
        if (i10 != 1) {
            uVar.f52300o = 1;
        }
        uVar.i(i10, uVar.f52300o, uVar.h(uVar.f52303r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        u uVar = this.f29489m;
        uVar.f52305t = i10;
        AppCompatTextView appCompatTextView = uVar.f52303r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f29489m;
        uVar.f52304s = charSequence;
        AppCompatTextView appCompatTextView = uVar.f52303r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        u uVar = this.f29489m;
        TextInputLayout textInputLayout = uVar.f52293h;
        if (uVar.f52302q == z10) {
            return;
        }
        uVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(uVar.f52292g);
            uVar.f52303r = appCompatTextView;
            appCompatTextView.setId(com.digidust.elokence.akinator.freemium.R.id.textinput_error);
            uVar.f52303r.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f52303r.setTypeface(typeface);
            }
            int i10 = uVar.f52306u;
            uVar.f52306u = i10;
            AppCompatTextView appCompatTextView2 = uVar.f52303r;
            if (appCompatTextView2 != null) {
                uVar.f52293h.n(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = uVar.f52307v;
            uVar.f52307v = colorStateList;
            AppCompatTextView appCompatTextView3 = uVar.f52303r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f52304s;
            uVar.f52304s = charSequence;
            AppCompatTextView appCompatTextView4 = uVar.f52303r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = uVar.f52305t;
            uVar.f52305t = i11;
            AppCompatTextView appCompatTextView5 = uVar.f52303r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i11);
            }
            uVar.f52303r.setVisibility(4);
            uVar.a(uVar.f52303r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f52303r, 0);
            uVar.f52303r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f52302q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        q qVar = this.f29473e;
        qVar.i(i10 != 0 ? l.a.getDrawable(qVar.getContext(), i10) : null);
        kc.p.N(qVar.f52254b, qVar.f52256e, qVar.f52257f);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f29473e;
        CheckableImageButton checkableImageButton = qVar.f52256e;
        View.OnLongClickListener onLongClickListener = qVar.f52259h;
        checkableImageButton.setOnClickListener(onClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f29473e;
        qVar.f52259h = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f52256e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f29473e;
        if (qVar.f52257f != colorStateList) {
            qVar.f52257f = colorStateList;
            kc.p.a(qVar.f52254b, qVar.f52256e, colorStateList, qVar.f52258g);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f29473e;
        if (qVar.f52258g != mode) {
            qVar.f52258g = mode;
            kc.p.a(qVar.f52254b, qVar.f52256e, qVar.f52257f, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        u uVar = this.f29489m;
        uVar.f52306u = i10;
        AppCompatTextView appCompatTextView = uVar.f52303r;
        if (appCompatTextView != null) {
            uVar.f52293h.n(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f29489m;
        uVar.f52307v = colorStateList;
        AppCompatTextView appCompatTextView = uVar.f52303r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f29516z0 != z10) {
            this.f29516z0 = z10;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        u uVar = this.f29489m;
        uVar.c();
        uVar.f52308w = charSequence;
        uVar.f52310y.setText(charSequence);
        int i10 = uVar.f52299n;
        if (i10 != 2) {
            uVar.f52300o = 2;
        }
        uVar.i(i10, uVar.f52300o, uVar.h(uVar.f52310y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f29489m;
        uVar.A = colorStateList;
        AppCompatTextView appCompatTextView = uVar.f52310y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        u uVar = this.f29489m;
        TextInputLayout textInputLayout = uVar.f52293h;
        if (uVar.f52309x == z10) {
            return;
        }
        uVar.c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(uVar.f52292g);
            uVar.f52310y = appCompatTextView;
            appCompatTextView.setId(com.digidust.elokence.akinator.freemium.R.id.textinput_helper_text);
            uVar.f52310y.setTextAlignment(5);
            Typeface typeface = uVar.B;
            if (typeface != null) {
                uVar.f52310y.setTypeface(typeface);
            }
            uVar.f52310y.setVisibility(4);
            uVar.f52310y.setAccessibilityLiveRegion(1);
            int i10 = uVar.f52311z;
            uVar.f52311z = i10;
            AppCompatTextView appCompatTextView2 = uVar.f52310y;
            if (appCompatTextView2 != null) {
                t.setTextAppearance(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = uVar.A;
            uVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = uVar.f52310y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            uVar.a(uVar.f52310y, 1);
            uVar.f52310y.setAccessibilityDelegate(new dh.t(uVar));
        } else {
            uVar.c();
            int i11 = uVar.f52299n;
            if (i11 == 2) {
                uVar.f52300o = 0;
            }
            uVar.i(i11, uVar.f52300o, uVar.h(uVar.f52310y, ""));
            uVar.g(uVar.f52310y, 1);
            uVar.f52310y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        uVar.f52309x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        u uVar = this.f29489m;
        uVar.f52311z = i10;
        AppCompatTextView appCompatTextView = uVar.f52310y;
        if (appCompatTextView != null) {
            t.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.F) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.A0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.F) {
            this.F = z10;
            if (z10) {
                CharSequence hint = this.f29477g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.G)) {
                        setHint(hint);
                    }
                    this.f29477g.setHint((CharSequence) null);
                }
                this.H = true;
            } else {
                this.H = false;
                if (!TextUtils.isEmpty(this.G) && TextUtils.isEmpty(this.f29477g.getHint())) {
                    this.f29477g.setHint(this.G);
                }
                setHintInternal(null);
            }
            if (this.f29477g != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i10) {
        g gVar = this.f29514y0;
        gVar.setCollapsedMaxLines(i10);
        gVar.setExpandedMaxLines(i10);
        requestLayout();
    }

    public void setHintTextAppearance(int i10) {
        g gVar = this.f29514y0;
        gVar.setCollapsedTextAppearance(i10);
        this.f29490m0 = gVar.getCollapsedTextColor();
        if (this.f29477g != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f29490m0 != colorStateList) {
            if (this.f29488l0 == null) {
                this.f29514y0.setCollapsedTextColor(colorStateList);
            }
            this.f29490m0 = colorStateList;
            if (this.f29477g != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(e0 e0Var) {
        this.f29497q = e0Var;
    }

    public void setMaxEms(int i10) {
        this.f29483j = i10;
        EditText editText = this.f29477g;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f29487l = i10;
        EditText editText = this.f29477g;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f29481i = i10;
        EditText editText = this.f29477g;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f29485k = i10;
        EditText editText = this.f29477g;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        q qVar = this.f29473e;
        qVar.f52260i.setContentDescription(i10 != 0 ? qVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        q qVar = this.f29473e;
        qVar.f52260i.setImageDrawable(i10 != 0 ? l.a.getDrawable(qVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        q qVar = this.f29473e;
        if (z10 && qVar.f52262k != 1) {
            qVar.g(1);
        } else if (z10) {
            qVar.getClass();
        } else {
            qVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f29473e;
        qVar.f52264m = colorStateList;
        kc.p.a(qVar.f52254b, qVar.f52260i, colorStateList, qVar.f52265n);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f29473e;
        qVar.f52265n = mode;
        kc.p.a(qVar.f52254b, qVar.f52260i, qVar.f52264m, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f29509w == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f29509w = appCompatTextView;
            appCompatTextView.setId(com.digidust.elokence.akinator.freemium.R.id.textinput_placeholder);
            this.f29509w.setImportantForAccessibility(1);
            this.f29509w.setAccessibilityLiveRegion(1);
            m mVarF = f();
            this.f29515z = mVarF;
            mVarF.setStartDelay(67L);
            this.A = f();
            setPlaceholderTextAppearance(this.f29513y);
            setPlaceholderTextColor(this.f29511x);
            z1.setAccessibilityDelegate(this.f29509w, new b0());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f29507v) {
                setPlaceholderTextEnabled(true);
            }
            this.f29505u = charSequence;
        }
        EditText editText = this.f29477g;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f29513y = i10;
        AppCompatTextView appCompatTextView = this.f29509w;
        if (appCompatTextView != null) {
            t.setTextAppearance(appCompatTextView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f29511x != colorStateList) {
            this.f29511x = colorStateList;
            AppCompatTextView appCompatTextView = this.f29509w;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f29470c;
        zVar.getClass();
        zVar.f52329e = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f52328c.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i10) {
        t.setTextAppearance(this.f29470c.f52328c, i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f29470c.f52328c.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(p pVar) {
        j jVar = this.I;
        if (jVar == null || jVar.getShapeAppearanceModel() == pVar) {
            return;
        }
        this.O = pVar;
        c();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f29470c.f52330f.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        z zVar = this.f29470c;
        if (i10 < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != zVar.f52333i) {
            zVar.f52333i = i10;
            CheckableImageButton checkableImageButton = zVar.f52330f;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f29470c;
        CheckableImageButton checkableImageButton = zVar.f52330f;
        View.OnLongClickListener onLongClickListener = zVar.f52335k;
        checkableImageButton.setOnClickListener(onClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f29470c;
        zVar.f52335k = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f52330f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        kc.p.P(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f29470c;
        zVar.f52334j = scaleType;
        zVar.f52330f.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f29470c;
        if (zVar.f52331g != colorStateList) {
            zVar.f52331g = colorStateList;
            kc.p.a(zVar.f52327b, zVar.f52330f, colorStateList, zVar.f52332h);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f29470c;
        if (zVar.f52332h != mode) {
            zVar.f52332h = mode;
            kc.p.a(zVar.f52327b, zVar.f52330f, zVar.f52331g, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f29470c.c(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f29473e;
        qVar.getClass();
        qVar.f52269r = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f52270s.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i10) {
        t.setTextAppearance(this.f29473e.f52270s, i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f29473e.f52270s.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(a aVar) {
        EditText editText = this.f29477g;
        if (editText != null) {
            z1.setAccessibilityDelegate(editText, aVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f29474e0) {
            this.f29474e0 = typeface;
            this.f29514y0.setTypefaces(typeface);
            u uVar = this.f29489m;
            if (typeface != uVar.B) {
                uVar.B = typeface;
                AppCompatTextView appCompatTextView = uVar.f52303r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = uVar.f52310y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f29499r;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f29477g;
        if (editText == null || this.R != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (l1.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (o()) {
            background.setColorFilter(w.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f29495p && (appCompatTextView = this.f29499r) != null) {
            background.setColorFilter(w.getPorterDuffColorFilter(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            p3.a.clearColorFilter(background);
            this.f29477g.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.f29477g;
        if (editText == null || this.I == null) {
            return;
        }
        if ((this.L || editText.getBackground() == null) && this.R != 0) {
            this.f29477g.setBackground(getEditTextBoxBackground());
            this.L = true;
        }
    }

    public final void v() {
        if (this.R != 1) {
            FrameLayout frameLayout = this.f29468b;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f29477g;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f29477g;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f29488l0;
        g gVar = this.f29514y0;
        if (colorStateList2 != null) {
            gVar.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f29488l0;
            gVar.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f29508v0) : this.f29508v0));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.f29489m.f52303r;
            gVar.setCollapsedAndExpandedTextColor(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f29495p && (appCompatTextView = this.f29499r) != null) {
            gVar.setCollapsedAndExpandedTextColor(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f29490m0) != null) {
            gVar.setCollapsedTextColor(colorStateList);
        }
        q qVar = this.f29473e;
        z zVar = this.f29470c;
        if (z12 || !this.f29516z0 || (isEnabled() && z13)) {
            if (z11 || this.f29512x0) {
                ValueAnimator valueAnimator = this.B0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.B0.cancel();
                }
                if (z10 && this.A0) {
                    b(1.0f);
                } else {
                    gVar.setExpansionFraction(1.0f);
                }
                this.f29512x0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.f29477g;
                x(editText3 != null ? editText3.getText() : null);
                zVar.f52336l = false;
                zVar.e();
                qVar.f52271t = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z11 || !this.f29512x0) {
            ValueAnimator valueAnimator2 = this.B0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B0.cancel();
            }
            if (z10 && this.A0) {
                b(0.0f);
            } else {
                gVar.setExpansionFraction(0.0f);
            }
            if (g() && !((h) this.I).J.f52229w.isEmpty() && g()) {
                ((h) this.I).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f29512x0 = true;
            AppCompatTextView appCompatTextView3 = this.f29509w;
            if (appCompatTextView3 != null && this.f29507v) {
                appCompatTextView3.setText((CharSequence) null);
                m0.beginDelayedTransition(this.f29468b, this.A);
                this.f29509w.setVisibility(4);
            }
            zVar.f52336l = true;
            zVar.e();
            qVar.f52271t = true;
            qVar.n();
        }
    }

    public final void x(Editable editable) {
        int iCountLength = ((com.google.android.gms.internal.ads.a) this.f29497q).countLength(editable);
        FrameLayout frameLayout = this.f29468b;
        if (iCountLength != 0 || this.f29512x0) {
            AppCompatTextView appCompatTextView = this.f29509w;
            if (appCompatTextView == null || !this.f29507v) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            m0.beginDelayedTransition(frameLayout, this.A);
            this.f29509w.setVisibility(4);
            return;
        }
        if (this.f29509w == null || !this.f29507v || TextUtils.isEmpty(this.f29505u)) {
            return;
        }
        this.f29509w.setText(this.f29505u);
        m0.beginDelayedTransition(frameLayout, this.f29515z);
        this.f29509w.setVisibility(0);
        this.f29509w.bringToFront();
    }

    public final void y(boolean z10, boolean z11) {
        int defaultColor = this.f29498q0.getDefaultColor();
        int colorForState = this.f29498q0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f29498q0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.W = colorForState2;
        } else if (z11) {
            this.W = colorForState;
        } else {
            this.W = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.I == null || this.R == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f29477g) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f29477g) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.W = this.f29508v0;
        } else if (o()) {
            if (this.f29498q0 != null) {
                y(z11, z10);
            } else {
                this.W = getErrorCurrentTextColors();
            }
        } else if (!this.f29495p || (appCompatTextView = this.f29499r) == null) {
            if (z11) {
                this.W = this.f29496p0;
            } else if (z10) {
                this.W = this.f29494o0;
            } else {
                this.W = this.f29492n0;
            }
        } else if (this.f29498q0 != null) {
            y(z11, z10);
        } else {
            this.W = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        q qVar = this.f29473e;
        TextInputLayout textInputLayout = qVar.f52254b;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        TextInputLayout textInputLayout2 = qVar.f52254b;
        qVar.l();
        kc.p.N(textInputLayout2, qVar.f52256e, qVar.f52257f);
        kc.p.N(textInputLayout2, checkableImageButton, qVar.f52264m);
        if (qVar.b() instanceof l) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                kc.p.a(textInputLayout, checkableImageButton, qVar.f52264m, qVar.f52265n);
            } else {
                Drawable drawableMutate = p3.a.wrap(checkableImageButton.getDrawable()).mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        refreshStartIconDrawableState();
        if (this.R == 2) {
            int i10 = this.T;
            if (z11 && isEnabled()) {
                this.T = this.V;
            } else {
                this.T = this.U;
            }
            if (this.T != i10 && g() && !this.f29512x0) {
                if (g()) {
                    ((h) this.I).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.R == 1) {
            if (!isEnabled()) {
                this.f29467a0 = this.f29502s0;
            } else if (z10 && !z11) {
                this.f29467a0 = this.f29506u0;
            } else if (z11) {
                this.f29467a0 = this.f29504t0;
            } else {
                this.f29467a0 = this.f29500r0;
            }
        }
        c();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.textInputStyle);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f29470c.f52330f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f29470c.b(drawable);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_Design_TextInputLayout), attributeSet, i10);
        this.f29481i = -1;
        this.f29483j = -1;
        this.f29485k = -1;
        this.f29487l = -1;
        this.f29489m = new u(this);
        this.f29497q = new com.google.android.gms.internal.ads.a(21);
        this.f29469b0 = new Rect();
        this.f29471c0 = new Rect();
        this.f29472d0 = new RectF();
        this.f29480h0 = new LinkedHashSet();
        g gVar = new g(this);
        this.f29514y0 = gVar;
        this.E0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f29468b = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = vf.a.f89240a;
        gVar.setTextSizeInterpolator(linearInterpolator);
        gVar.setPositionInterpolator(linearInterpolator);
        gVar.setCollapsedTextGravity(8388659);
        n3 n3VarObtainTintedStyledAttributes = j0.obtainTintedStyledAttributes(context2, attributeSet, uf.a.R, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        z zVar = new z(this, n3VarObtainTintedStyledAttributes);
        this.f29470c = zVar;
        this.F = n3VarObtainTintedStyledAttributes.getBoolean(48, true);
        setHint(n3VarObtainTintedStyledAttributes.getText(4));
        this.A0 = n3VarObtainTintedStyledAttributes.getBoolean(47, true);
        this.f29516z0 = n3VarObtainTintedStyledAttributes.getBoolean(42, true);
        if (n3VarObtainTintedStyledAttributes.hasValue(6)) {
            setMinEms(n3VarObtainTintedStyledAttributes.getInt(6, -1));
        } else if (n3VarObtainTintedStyledAttributes.hasValue(3)) {
            setMinWidth(n3VarObtainTintedStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(5)) {
            setMaxEms(n3VarObtainTintedStyledAttributes.getInt(5, -1));
        } else if (n3VarObtainTintedStyledAttributes.hasValue(2)) {
            setMaxWidth(n3VarObtainTintedStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.O = p.builder(context2, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_Design_TextInputLayout).build();
        this.Q = context2.getResources().getDimensionPixelOffset(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.S = n3VarObtainTintedStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f29475f = getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.U = n3VarObtainTintedStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.V = n3VarObtainTintedStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.digidust.elokence.akinator.freemium.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.T = this.U;
        float dimension = n3VarObtainTintedStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = n3VarObtainTintedStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = n3VarObtainTintedStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = n3VarObtainTintedStyledAttributes.getDimension(11, -1.0f);
        p.a builder = this.O.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.O = builder.build();
        ColorStateList colorStateList = d.getColorStateList(context2, n3VarObtainTintedStyledAttributes, 7);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.f29500r0 = defaultColor;
            this.f29467a0 = defaultColor;
            if (colorStateList.isStateful()) {
                this.f29502s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.f29504t0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f29506u0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f29504t0 = this.f29500r0;
                ColorStateList colorStateList2 = l.a.getColorStateList(context2, com.digidust.elokence.akinator.freemium.R.color.mtrl_filled_background_color);
                this.f29502s0 = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.f29506u0 = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f29467a0 = 0;
            this.f29500r0 = 0;
            this.f29502s0 = 0;
            this.f29504t0 = 0;
            this.f29506u0 = 0;
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(1)) {
            ColorStateList colorStateList3 = n3VarObtainTintedStyledAttributes.getColorStateList(1);
            this.f29490m0 = colorStateList3;
            this.f29488l0 = colorStateList3;
        }
        ColorStateList colorStateList4 = d.getColorStateList(context2, n3VarObtainTintedStyledAttributes, 14);
        this.f29496p0 = n3VarObtainTintedStyledAttributes.getColor(14, 0);
        this.f29492n0 = m3.a.getColor(context2, com.digidust.elokence.akinator.freemium.R.color.mtrl_textinput_default_box_stroke_color);
        this.f29508v0 = m3.a.getColor(context2, com.digidust.elokence.akinator.freemium.R.color.mtrl_textinput_disabled_color);
        this.f29494o0 = m3.a.getColor(context2, com.digidust.elokence.akinator.freemium.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.getColorStateList(context2, n3VarObtainTintedStyledAttributes, 15));
        }
        if (n3VarObtainTintedStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(n3VarObtainTintedStyledAttributes.getResourceId(50, 0));
        }
        this.D = n3VarObtainTintedStyledAttributes.getColorStateList(24);
        this.E = n3VarObtainTintedStyledAttributes.getColorStateList(25);
        int resourceId = n3VarObtainTintedStyledAttributes.getResourceId(40, 0);
        CharSequence text = n3VarObtainTintedStyledAttributes.getText(35);
        int i11 = n3VarObtainTintedStyledAttributes.getInt(34, 1);
        boolean z10 = n3VarObtainTintedStyledAttributes.getBoolean(36, false);
        int resourceId2 = n3VarObtainTintedStyledAttributes.getResourceId(45, 0);
        boolean z11 = n3VarObtainTintedStyledAttributes.getBoolean(44, false);
        CharSequence text2 = n3VarObtainTintedStyledAttributes.getText(43);
        int resourceId3 = n3VarObtainTintedStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = n3VarObtainTintedStyledAttributes.getText(57);
        boolean z12 = n3VarObtainTintedStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(n3VarObtainTintedStyledAttributes.getInt(19, -1));
        this.f29503t = n3VarObtainTintedStyledAttributes.getResourceId(22, 0);
        this.f29501s = n3VarObtainTintedStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(n3VarObtainTintedStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i11);
        setCounterOverflowTextAppearance(this.f29501s);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f29503t);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (n3VarObtainTintedStyledAttributes.hasValue(41)) {
            setErrorTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(41));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(46)) {
            setHelperTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(46));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(51)) {
            setHintTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(51));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(23)) {
            setCounterTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(23));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(21));
        }
        if (n3VarObtainTintedStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(n3VarObtainTintedStyledAttributes.getColorStateList(59));
        }
        q qVar = new q(this, n3VarObtainTintedStyledAttributes);
        this.f29473e = qVar;
        boolean z13 = n3VarObtainTintedStyledAttributes.getBoolean(0, true);
        setHintMaxLines(n3VarObtainTintedStyledAttributes.getInt(49, 1));
        n3VarObtainTintedStyledAttributes.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z13);
        setHelperTextEnabled(z11);
        setErrorEnabled(z10);
        setCounterEnabled(z12);
        setHelperText(text2);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f29473e.f52260i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f29473e.f52260i.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f29473e.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f29473e.f52260i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f29473e;
        TextInputLayout textInputLayout = qVar.f52254b;
        CheckableImageButton checkableImageButton = qVar.f52260i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            kc.p.a(textInputLayout, checkableImageButton, qVar.f52264m, qVar.f52265n);
            kc.p.N(textInputLayout, checkableImageButton, qVar.f52264m);
        }
    }
}
