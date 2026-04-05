package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import ao.kwoC.zAQQWzBxnS;
import com.google.android.material.chip.Chip;
import fh.a;
import gg.b;
import gg.d;
import gg.e;
import gg.f;
import qg.j0;
import qg.u;
import qg.v;
import ug.g;
import vf.h;
import x3.z1;
import y3.c;
import y3.k;
import yg.m;
import yg.p;
import yg.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class Chip extends AppCompatCheckBox implements e, y, v {

    /* renamed from: g, reason: collision with root package name */
    public f f29105g;

    /* renamed from: h, reason: collision with root package name */
    public InsetDrawable f29106h;

    /* renamed from: i, reason: collision with root package name */
    public RippleDrawable f29107i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f29108j;

    /* renamed from: k, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f29109k;

    /* renamed from: l, reason: collision with root package name */
    public u f29110l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29111m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29112n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29113o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f29114p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29115q;

    /* renamed from: r, reason: collision with root package name */
    public int f29116r;

    /* renamed from: s, reason: collision with root package name */
    public int f29117s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f29118t;

    /* renamed from: u, reason: collision with root package name */
    public final d f29119u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f29120v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f29121w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f29122x;

    /* renamed from: y, reason: collision with root package name */
    public final b f29123y;

    /* renamed from: z, reason: collision with root package name */
    public static final Rect f29104z = new Rect();
    public static final int[] A = {R.attr.state_selected};
    public static final int[] B = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f29122x;
        rectF.setEmpty();
        if (c() && this.f29108j != null) {
            this.f29105g.getCloseIconTouchBounds(rectF);
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f29121w;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private g getTextAppearance() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getTextAppearance();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f29113o != z10) {
            this.f29113o = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f29112n != z10) {
            this.f29112n = z10;
            refreshDrawableState();
        }
    }

    public final boolean c() {
        f fVar = this.f29105g;
        return (fVar == null || fVar.getCloseIcon() == null) ? false : true;
    }

    public final void d() {
        if (c() && isCloseIconVisible() && this.f29108j != null) {
            z1.setAccessibilityDelegate(this, this.f29119u);
            this.f29120v = true;
        } else {
            z1.setAccessibilityDelegate(this, null);
            this.f29120v = false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f29120v ? super.dispatchHoverEvent(motionEvent) : this.f29119u.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f29120v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f29119u;
        if (!dVar.dispatchKeyEvent(keyEvent) || dVar.getKeyboardFocusedVirtualViewId() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f fVar = this.f29105g;
        boolean closeIconState = false;
        int i10 = 0;
        closeIconState = false;
        if (fVar != null && fVar.isCloseIconStateful()) {
            f fVar2 = this.f29105g;
            ?? IsEnabled = isEnabled();
            int i11 = IsEnabled;
            if (this.f29114p) {
                i11 = IsEnabled + 1;
            }
            int i12 = i11;
            if (this.f29113o) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f29112n) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.f29114p) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f29113o) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f29112n) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            closeIconState = fVar2.setCloseIconState(iArr);
        }
        if (closeIconState) {
            invalidate();
        }
    }

    public final void e() {
        this.f29107i = new RippleDrawable(vg.b.sanitizeRippleDrawableColor(this.f29105g.getRippleColor()), getBackgroundDrawable(), null);
        this.f29105g.setUseCompatRipple(false);
        setBackground(this.f29107i);
        f();
    }

    public boolean ensureAccessibleTouchTarget(int i10) {
        this.f29117s = i10;
        if (shouldEnsureMinTouchTargetSize()) {
            int iMax = Math.max(0, i10 - this.f29105g.getIntrinsicHeight());
            int iMax2 = Math.max(0, i10 - this.f29105g.getIntrinsicWidth());
            if (iMax2 > 0 || iMax > 0) {
                int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
                int i12 = iMax > 0 ? iMax / 2 : 0;
                if (this.f29106h != null) {
                    Rect rect = new Rect();
                    this.f29106h.getPadding(rect);
                    if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                        e();
                        return true;
                    }
                }
                if (getMinHeight() != i10) {
                    setMinHeight(i10);
                }
                if (getMinWidth() != i10) {
                    setMinWidth(i10);
                }
                this.f29106h = new InsetDrawable((Drawable) this.f29105g, i11, i12, i11, i12);
                e();
                return true;
            }
            InsetDrawable insetDrawable = this.f29106h;
            if (insetDrawable == null) {
                e();
                return false;
            }
            if (insetDrawable != null) {
                this.f29106h = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
            }
        } else {
            InsetDrawable insetDrawable2 = this.f29106h;
            if (insetDrawable2 == null) {
                e();
                return false;
            }
            if (insetDrawable2 != null) {
                this.f29106h = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                e();
                return false;
            }
        }
        return false;
    }

    public final void f() {
        f fVar;
        if (TextUtils.isEmpty(getText()) || (fVar = this.f29105g) == null) {
            return;
        }
        int iR = (int) (this.f29105g.r() + this.f29105g.getTextEndPadding() + fVar.getChipEndPadding());
        int iQ = (int) (this.f29105g.q() + this.f29105g.getTextStartPadding() + this.f29105g.getChipStartPadding());
        if (this.f29106h != null) {
            Rect rect = new Rect();
            this.f29106h.getPadding(rect);
            iQ += rect.left;
            iR += rect.right;
        }
        setPaddingRelative(iQ, getPaddingTop(), iR, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        f fVar = this.f29105g;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        g textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.updateDrawState(getContext(), paint, this.f29123y);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f29118t)) {
            return this.f29118t;
        }
        if (!isCheckable()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).isSingleSelection()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f29106h;
        return insetDrawable == null ? this.f29105g : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCheckedIcon();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCheckedIconTint();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipBackgroundColor();
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return Math.max(0.0f, fVar.getChipCornerRadius());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f29105g;
    }

    public float getChipEndPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipEndPadding();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipIcon();
        }
        return null;
    }

    public float getChipIconSize() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipIconSize();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipIconTint();
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipMinHeight();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipStrokeColor();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getChipStrokeWidth();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIcon();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIconContentDescription();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIconEndPadding();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIconSize();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getCloseIconTint();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getEllipsize();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f29120v) {
            d dVar = this.f29119u;
            if (dVar.getKeyboardFocusedVirtualViewId() == 1 || dVar.getAccessibilityFocusedVirtualViewId() == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public h getHideMotionSpec() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getHideMotionSpec();
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getIconEndPadding();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getIconStartPadding();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getRippleColor();
        }
        return null;
    }

    @Override // yg.y
    public p getShapeAppearanceModel() {
        return this.f29105g.getShapeAppearanceModel();
    }

    public h getShowMotionSpec() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getShowMotionSpec();
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getTextEndPadding();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f29105g;
        if (fVar != null) {
            return fVar.getTextStartPadding();
        }
        return 0.0f;
    }

    public boolean isCheckable() {
        f fVar = this.f29105g;
        return fVar != null && fVar.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        f fVar = this.f29105g;
        return fVar != null && fVar.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        f fVar = this.f29105g;
        return fVar != null && fVar.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        f fVar = this.f29105g;
        return fVar != null && fVar.isCloseIconVisible();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this, this.f29105g);
    }

    @Override // gg.e
    public void onChipDrawableSizeChange() {
        ensureAccessibleTouchTarget(this.f29117s);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f29120v) {
            this.f29119u.onFocusChanged(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            c cVarWrap = c.wrap(accessibilityNodeInfo);
            int i10 = -1;
            if (chipGroup.isSingleLine()) {
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i11 >= chipGroup.getChildCount()) {
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i11);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            i10 = i12;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            }
            cVarWrap.setCollectionItemInfo(k.obtain(chipGroup.getRowIndex(this), 1, i10, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f29116r != i10) {
            this.f29116r = i10;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f29112n
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f29112n
            if (r0 == 0) goto L35
            r5.performCloseIconClick()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean performCloseIconClick() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f29108j;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f29120v) {
            this.f29119u.sendEventForVirtualView(1, 1);
        }
        return z10;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f29118t = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f29107i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f29107i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckable(z10);
        }
    }

    public void setCheckableResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckableResource(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        f fVar = this.f29105g;
        if (fVar == null) {
            this.f29111m = z10;
        } else if (fVar.isCheckable()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIcon(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIconResource(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIconTint(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIconTintResource(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIconVisible(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipBackgroundColor(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipBackgroundColorResource(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipCornerRadius(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipCornerRadiusResource(i10);
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f29105g;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.setDelegate(null);
            }
            this.f29105g = fVar;
            fVar.P0 = false;
            fVar.setDelegate(this);
            ensureAccessibleTouchTarget(this.f29117s);
        }
    }

    public void setChipEndPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipEndPadding(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipEndPaddingResource(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIcon(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconResource(i10);
        }
    }

    public void setChipIconSize(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconSize(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconSizeResource(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconTint(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconTintResource(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconVisible(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipMinHeight(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipMinHeightResource(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStartPadding(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStartPaddingResource(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStrokeColor(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStrokeColorResource(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStrokeWidth(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipStrokeWidthResource(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIcon(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconContentDescription(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconEndPadding(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconEndPaddingResource(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconResource(i10);
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconSize(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconSizeResource(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconStartPadding(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconStartPaddingResource(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconTint(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconTintResource(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setElevation(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f29105g == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setEllipsize(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f29115q = z10;
        ensureAccessibleTouchTarget(this.f29117s);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h hVar) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setHideMotionSpec(hVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setHideMotionSpecResource(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setIconEndPadding(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setIconEndPaddingResource(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setIconStartPadding(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setIconStartPaddingResource(i10);
        }
    }

    @Override // qg.v
    public void setInternalOnCheckedChangeListener(u uVar) {
        this.f29110l = uVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f29105g == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setMaxWidth(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f29109k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f29108j = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setRippleColor(colorStateList);
        }
        if (this.f29105g.getUseCompatRipple()) {
            return;
        }
        e();
    }

    public void setRippleColorResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setRippleColorResource(i10);
            if (this.f29105g.getUseCompatRipple()) {
                return;
            }
            e();
        }
    }

    @Override // yg.y
    public void setShapeAppearanceModel(p pVar) {
        this.f29105g.setShapeAppearanceModel(pVar);
    }

    public void setShowMotionSpec(h hVar) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setShowMotionSpec(hVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setShowMotionSpecResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        f fVar = this.f29105g;
        if (fVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(fVar.P0 ? null : charSequence, bufferType);
        f fVar2 = this.f29105g;
        if (fVar2 != null) {
            fVar2.setText(charSequence);
        }
    }

    public void setTextAppearance(g gVar) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextAppearance(gVar);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextEndPadding(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextEndPaddingResource(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextSize(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextStartPadding(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextStartPaddingResource(i10);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.f29115q;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCloseIconVisible(z10);
        }
        d();
    }

    public Chip(Context context, AttributeSet attributeSet, int i10) {
        super(a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i10);
        this.f29121w = new Rect();
        this.f29122x = new RectF();
        this.f29123y = new b(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        f fVarCreateFromAttributes = f.createFromAttributes(context2, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Chip_Action);
        int[] iArr = uf.a.f88459g;
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, iArr, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f29115q = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f29117s = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, ug.c.resolveMinimumAccessibleTouchTarget(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(fVarCreateFromAttributes);
        fVarCreateFromAttributes.setElevation(getElevation());
        TypedArray typedArrayObtainStyledAttributes2 = j0.obtainStyledAttributes(context2, attributeSet, iArr, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f29119u = new d(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new gg.c(this));
        }
        setChecked(this.f29111m);
        setText(fVarCreateFromAttributes.getText());
        setEllipsize(fVarCreateFromAttributes.getEllipsize());
        g();
        if (!this.f29105g.P0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (shouldEnsureMinTouchTargetSize()) {
            setMinHeight(this.f29117s);
        }
        this.f29116r = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gg.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip chip = this.f57651b;
                u uVar = chip.f29110l;
                if (uVar != null) {
                    ((qg.a) uVar).onCheckedChanged((Object) chip, z10);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f29109k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                }
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setCheckedIconVisible(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setChipIconVisible(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException(zAQQWzBxnS.XFEYeNpplIaqvYy);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextAppearanceResource(i10);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        f fVar = this.f29105g;
        if (fVar != null) {
            fVar.setTextAppearanceResource(i10);
        }
        g();
    }
}
