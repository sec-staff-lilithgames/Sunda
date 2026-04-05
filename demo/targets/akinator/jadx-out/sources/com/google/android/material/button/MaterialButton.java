package com.google.android.material.button;

import a.b;
import a2.s;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import bg.c;
import bg.e;
import bg.f;
import bg.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import qg.j0;
import qg.t0;
import r4.f0;
import sg.o;
import ug.d;
import yg.b0;
import yg.e0;
import yg.j;
import yg.m;
import yg.p;
import yg.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialButton extends AppCompatButton implements Checkable, y {
    public static final int[] H = {R.attr.state_checkable};
    public static final int[] I = {R.attr.state_checked};
    public static final bg.a J = new bg.a("widthIncrease");
    public boolean A;
    public int B;
    public e0 C;
    public int D;
    public float E;
    public float F;
    public r4.e0 G;

    /* renamed from: f, reason: collision with root package name */
    public final g f29039f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f29040g;

    /* renamed from: h, reason: collision with root package name */
    public c f29041h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f29042i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f29043j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f29044k;

    /* renamed from: l, reason: collision with root package name */
    public String f29045l;

    /* renamed from: m, reason: collision with root package name */
    public int f29046m;

    /* renamed from: n, reason: collision with root package name */
    public int f29047n;

    /* renamed from: o, reason: collision with root package name */
    public int f29048o;

    /* renamed from: p, reason: collision with root package name */
    public int f29049p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29050q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29051r;

    /* renamed from: s, reason: collision with root package name */
    public int f29052s;

    /* renamed from: t, reason: collision with root package name */
    public int f29053t;

    /* renamed from: u, reason: collision with root package name */
    public float f29054u;

    /* renamed from: v, reason: collision with root package name */
    public int f29055v;

    /* renamed from: w, reason: collision with root package name */
    public int f29056w;

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout.LayoutParams f29057x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f29058y;

    /* renamed from: z, reason: collision with root package name */
    public int f29059z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public boolean f29060e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29060e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f29060e = parcel.readInt() == 1;
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f29059z = materialButton.getOpticalCenterShift();
        materialButton.i();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.E;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.f29058y && this.A && (jVarA = this.f29039f.a(false)) != null) {
            return (int) (jVarA.getCornerSizeDiffX() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z10) {
        if (!isCheckable() || this.f29050q == z10) {
            return;
        }
        this.f29050q = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.f29050q;
            if (!materialButtonToggleGroup.f29063o) {
                materialButtonToggleGroup.f(getId(), z11);
            }
        }
        if (this.f29051r) {
            return;
        }
        this.f29051r = true;
        Iterator it = this.f29040g.iterator();
        if (it.hasNext()) {
            throw b.c(it);
        }
        this.f29051r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.E != f10) {
            this.E = f10;
            i();
            invalidate();
            if (getParent() instanceof f) {
                f fVar = (f) getParent();
                int i10 = (int) this.E;
                int iIndexOfChild = fVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i11 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i11 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (fVar.c(i11)) {
                            materialButton2 = (MaterialButton) fVar.getChildAt(i11);
                            break;
                        }
                        i11--;
                    }
                }
                int childCount = fVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (fVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) fVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i10);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i10);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i10 / 2);
                materialButton.setDisplayedWidthDecrease((i10 + 1) / 2);
            }
        }
    }

    public void addOnCheckedChangeListener(bg.b bVar) {
        this.f29040g.add(bVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.f29040g.clear();
    }

    public final boolean d() {
        g gVar = this.f29039f;
        return (gVar == null || gVar.f9526r) ? false : true;
    }

    public final void e(boolean z10) {
        if (this.C == null) {
            return;
        }
        if (this.G == null) {
            r4.e0 e0Var = new r4.e0(this, J);
            this.G = e0Var;
            e0Var.setSpring(o.resolveThemeSpringForce(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionSpringFastSpatial, com.digidust.elokence.akinator.freemium.R.style.Motion_Material3_Spring_Standard_Fast_Spatial));
        }
        if (this.A) {
            this.G.animateToFinalPosition(Math.min(this.D, this.C.getSizeChangeForState(getDrawableState()).f94418a.getChange(getWidth())));
            if (z10) {
                this.G.skipToEnd();
            }
        }
    }

    public final void f() {
        int i10 = this.f29052s;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.f29044k, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.f29044k, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.f29044k, null, null);
        }
    }

    public final void g(boolean z10) {
        Drawable drawable = this.f29044k;
        if (drawable != null) {
            Drawable drawableMutate = p3.a.wrap(drawable).mutate();
            this.f29044k = drawableMutate;
            drawableMutate.setTintList(this.f29043j);
            PorterDuff.Mode mode = this.f29042i;
            if (mode != null) {
                this.f29044k.setTintMode(mode);
            }
            int intrinsicWidth = this.f29046m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f29044k.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f29046m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f29044k.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f29044k;
            int i10 = this.f29047n;
            int i11 = this.f29048o;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f29044k.setVisible(true, z10);
        }
        if (z10) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.f29052s;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f29044k) || (((i12 == 3 || i12 == 4) && drawable5 != this.f29044k) || ((i12 == 16 || i12 == 32) && drawable4 != this.f29044k))) {
            f();
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f29045l)) {
            return (isCheckable() ? CompoundButton.class : Button.class).getName();
        }
        return this.f29045l;
    }

    public int getAllowedWidthDecrease() {
        return this.B;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (d()) {
            return this.f29039f.f9518j;
        }
        return 0;
    }

    public f0 getCornerSpringForce() {
        return this.f29039f.f9512d;
    }

    public Drawable getIcon() {
        return this.f29044k;
    }

    public int getIconGravity() {
        return this.f29052s;
    }

    public int getIconPadding() {
        return this.f29049p;
    }

    public int getIconSize() {
        return this.f29046m;
    }

    public ColorStateList getIconTint() {
        return this.f29043j;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f29042i;
    }

    public int getInsetBottom() {
        return this.f29039f.getInsetBottom();
    }

    public int getInsetTop() {
        return this.f29039f.getInsetTop();
    }

    public ColorStateList getRippleColor() {
        if (d()) {
            return this.f29039f.f9523o;
        }
        return null;
    }

    @Override // yg.y
    public p getShapeAppearanceModel() {
        if (d()) {
            return this.f29039f.f9510b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public b0 getStateListShapeAppearanceModel() {
        if (d()) {
            return this.f29039f.f9511c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (d()) {
            return this.f29039f.f9522n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (d()) {
            return this.f29039f.f9519k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        return d() ? this.f29039f.f9521m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return d() ? this.f29039f.f9520l : super.getSupportBackgroundTintMode();
    }

    public final void h(int i10, int i11) {
        if (this.f29044k == null || getLayout() == null) {
            return;
        }
        int i12 = this.f29052s;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f29047n = 0;
                if (i12 == 16) {
                    this.f29048o = 0;
                    g(false);
                    return;
                }
                int intrinsicHeight = this.f29046m;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f29044k.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f29049p) - getPaddingBottom()) / 2);
                if (this.f29048o != iMax) {
                    this.f29048o = iMax;
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f29048o = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f29052s;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f29047n = 0;
            g(false);
            return;
        }
        int intrinsicWidth = this.f29046m;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f29044k.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f29049p) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f29052s == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f29047n != textLayoutWidth) {
            this.f29047n = textLayoutWidth;
            g(false);
        }
    }

    public final void i() {
        int i10 = (int) (this.E - this.F);
        int i11 = (i10 / 2) + this.f29059z;
        getLayoutParams().width = (int) (this.f29054u + i10);
        setPaddingRelative(this.f29055v + i11, getPaddingTop(), (this.f29056w + i10) - i11, getPaddingBottom());
    }

    public boolean isCheckable() {
        g gVar = this.f29039f;
        return gVar != null && gVar.f9528t;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29050q;
    }

    public boolean isOpticalCenterEnabled() {
        return this.f29058y;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.f29039f.f9529u;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d()) {
            m.setParentAbsoluteElevation(this, this.f29039f.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        h(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f29053t != i15) {
            this.f29053t = i15;
            this.f29054u = -1.0f;
        }
        if (this.f29054u == -1.0f) {
            this.f29054u = getMeasuredWidth();
            if (this.f29057x == null && (getParent() instanceof f) && ((f) getParent()).getButtonSizeChange() != null) {
                this.f29057x = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f29057x);
                layoutParams.width = (int) this.f29054u;
                setLayoutParams(layoutParams);
            }
        }
        boolean z11 = false;
        if (this.B == -1) {
            if (this.f29044k == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f29046m;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f29044k.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.B = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f29055v == -1) {
            this.f29055v = getPaddingStart();
        }
        if (this.f29056w == -1) {
            this.f29056w = getPaddingEnd();
        }
        if ((getParent() instanceof f) && ((f) getParent()).getOrientation() == 0) {
            z11 = true;
        }
        this.A = z11;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f29060e);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29060e = this.f29050q;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f29039f.f9529u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f29044k != null) {
            if (this.f29044k.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(bg.b bVar) {
        this.f29040g.remove(bVar);
    }

    public void setA11yClassName(String str) {
        this.f29045l = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!d()) {
            super.setBackgroundColor(i10);
            return;
        }
        g gVar = this.f29039f;
        if (gVar.a(false) != null) {
            gVar.a(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!d()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        g gVar = this.f29039f;
        gVar.f9526r = true;
        MaterialButton materialButton = gVar.f9509a;
        materialButton.setSupportBackgroundTintList(gVar.f9521m);
        materialButton.setSupportBackgroundTintMode(gVar.f9520l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (d()) {
            this.f29039f.f9528t = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (d()) {
            g gVar = this.f29039f;
            if (gVar.f9527s && gVar.f9518j == i10) {
                return;
            }
            gVar.f9518j = i10;
            gVar.f9527s = true;
            gVar.f9510b = gVar.f9510b.withCornerSize(i10);
            gVar.f9511c = null;
            gVar.d();
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(f0 f0Var) {
        g gVar = this.f29039f;
        gVar.f9512d = f0Var;
        if (gVar.f9511c != null) {
            gVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.F = Math.min(i10, this.B);
        i();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (d()) {
            this.f29039f.a(false).setElevation(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f29044k != drawable) {
            this.f29044k = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f29052s != i10) {
            this.f29052s = i10;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f29049p != i10) {
            this.f29049p = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? l.a.getDrawable(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f29046m != i10) {
            this.f29046m = i10;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f29043j != colorStateList) {
            this.f29043j = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f29042i != mode) {
            this.f29042i = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(l.a.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f29039f.setInsetBottom(i10);
    }

    public void setInsetTop(int i10) {
        this.f29039f.setInsetTop(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f29041h = cVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f29058y != z10) {
            this.f29058y = z10;
            g gVar = this.f29039f;
            if (z10) {
                af.g gVar2 = new af.g(this, 5);
                gVar.f9513e = gVar2;
                j jVarA = gVar.a(false);
                if (jVarA != null) {
                    jVarA.setOnCornerSizeChangeListener(gVar2);
                }
            } else {
                gVar.f9513e = null;
                j jVarA2 = gVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.setOnCornerSizeChangeListener(null);
                }
            }
            post(new s(this, 3));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        c cVar = this.f29041h;
        if (cVar != null) {
            ((e) cVar).onPressedChanged(this, z10);
        }
        super.setPressed(z10);
        e(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (d()) {
            g gVar = this.f29039f;
            MaterialButton materialButton = gVar.f9509a;
            if (gVar.f9523o != colorStateList) {
                gVar.f9523o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(vg.b.sanitizeRippleDrawableColor(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (d()) {
            setRippleColor(l.a.getColorStateList(getContext(), i10));
        }
    }

    @Override // yg.y
    public void setShapeAppearanceModel(p pVar) {
        if (!d()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        g gVar = this.f29039f;
        gVar.f9510b = pVar;
        gVar.f9511c = null;
        gVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (d()) {
            g gVar = this.f29039f;
            gVar.f9525q = z10;
            gVar.e();
        }
    }

    public void setSizeChange(e0 e0Var) {
        if (this.C != e0Var) {
            this.C = e0Var;
            e(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!d()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        g gVar = this.f29039f;
        if (gVar.f9512d == null && b0Var.isStateful()) {
            gVar.f9512d = o.resolveThemeSpringForce(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionSpringFastSpatial, com.digidust.elokence.akinator.freemium.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (gVar.f9511c != null) {
                gVar.d();
            }
        }
        gVar.f9511c = b0Var;
        gVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (d()) {
            g gVar = this.f29039f;
            if (gVar.f9522n != colorStateList) {
                gVar.f9522n = colorStateList;
                gVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (d()) {
            setStrokeColor(l.a.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (d()) {
            g gVar = this.f29039f;
            if (gVar.f9519k != i10) {
                gVar.f9519k = i10;
                gVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!d()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        g gVar = this.f29039f;
        if (gVar.f9521m != colorStateList) {
            gVar.f9521m = colorStateList;
            if (gVar.a(false) != null) {
                gVar.a(false).setTintList(gVar.f9521m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!d()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        g gVar = this.f29039f;
        if (gVar.f9520l != mode) {
            gVar.f9520l = mode;
            if (gVar.a(false) == null || gVar.f9520l == null) {
                return;
            }
            gVar.a(false).setTintMode(gVar.f9520l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f29039f.f9529u = z10;
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f29054u = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(int i10) {
        if (this.D != i10) {
            this.D = i10;
            e(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29050q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        p pVarBuild;
        super(fh.a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Button, new int[]{com.digidust.elokence.akinator.freemium.R.attr.materialSizeOverlay}), attributeSet, i10);
        this.f29040g = new LinkedHashSet();
        this.f29050q = false;
        this.f29051r = false;
        this.f29053t = -1;
        this.f29054u = -1.0f;
        this.f29055v = -1;
        this.f29056w = -1;
        this.B = -1;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88471s, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f29049p = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29042i = t0.parseTintMode(i11, mode);
        this.f29043j = d.getColorStateList(getContext(), typedArrayObtainStyledAttributes, 15);
        this.f29044k = d.getDrawable(getContext(), typedArrayObtainStyledAttributes, 11);
        this.f29052s = typedArrayObtainStyledAttributes.getInteger(12, 1);
        this.f29046m = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        b0 b0VarCreate = b0.create(context2, typedArrayObtainStyledAttributes, 19);
        if (b0VarCreate != null) {
            pVarBuild = b0VarCreate.getDefaultShape(true);
        } else {
            pVarBuild = p.builder(context2, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Button).build();
        }
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(17, false);
        g gVar = new g(this, pVarBuild);
        this.f29039f = gVar;
        gVar.f9514f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        gVar.f9515g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        gVar.f9516h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        gVar.f9517i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            gVar.f9518j = dimensionPixelSize;
            gVar.f9510b = gVar.f9510b.withCornerSize(dimensionPixelSize);
            gVar.f9511c = null;
            gVar.d();
            gVar.f9527s = true;
        }
        gVar.f9519k = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, 0);
        gVar.f9520l = t0.parseTintMode(typedArrayObtainStyledAttributes.getInt(8, -1), mode);
        gVar.f9521m = d.getColorStateList(getContext(), typedArrayObtainStyledAttributes, 7);
        gVar.f9522n = d.getColorStateList(getContext(), typedArrayObtainStyledAttributes, 21);
        gVar.f9523o = d.getColorStateList(getContext(), typedArrayObtainStyledAttributes, 18);
        gVar.f9528t = typedArrayObtainStyledAttributes.getBoolean(6, false);
        gVar.f9531w = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        gVar.f9529u = typedArrayObtainStyledAttributes.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            gVar.f9526r = true;
            setSupportBackgroundTintList(gVar.f9521m);
            setSupportBackgroundTintMode(gVar.f9520l);
        } else {
            gVar.c();
        }
        setPaddingRelative(paddingStart + gVar.f9514f, paddingTop + gVar.f9516h, paddingEnd + gVar.f9515g, paddingBottom + gVar.f9517i);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(1, false));
        if (b0VarCreate != null) {
            gVar.f9512d = o.resolveThemeSpringForce(getContext(), com.digidust.elokence.akinator.freemium.R.attr.motionSpringFastSpatial, com.digidust.elokence.akinator.freemium.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (gVar.f9511c != null) {
                gVar.d();
            }
            gVar.f9511c = b0VarCreate;
            gVar.d();
        }
        setOpticalCenterEnabled(z10);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f29049p);
        g(this.f29044k != null);
    }
}
