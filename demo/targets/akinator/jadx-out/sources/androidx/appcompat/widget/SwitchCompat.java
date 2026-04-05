package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import e4.t;
import java.lang.reflect.InvocationTargetException;
import q.f4;
import q.g3;
import q.h3;
import q.i3;
import q.l1;
import q.n3;
import q.t1;
import q.v0;
import q.z;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements t1 {
    public static final g3 T = new g3(Float.class, "thumbPos");
    public static final int[] U = {R.attr.state_checked};
    public final int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public final TextPaint K;
    public ColorStateList L;
    public StaticLayout M;
    public StaticLayout N;
    public n.a O;
    public ObjectAnimator P;
    public z Q;
    public h3 R;
    public final Rect S;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f5086b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f5087c;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f5088e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5089f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5090g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f5091h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f5092i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f5093j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5094k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5095l;

    /* renamed from: m, reason: collision with root package name */
    public int f5096m;

    /* renamed from: n, reason: collision with root package name */
    public int f5097n;

    /* renamed from: o, reason: collision with root package name */
    public int f5098o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5099p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f5100q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f5101r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f5102s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f5103t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5104u;

    /* renamed from: v, reason: collision with root package name */
    public int f5105v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5106w;

    /* renamed from: x, reason: collision with root package name */
    public float f5107x;

    /* renamed from: y, reason: collision with root package name */
    public float f5108y;

    /* renamed from: z, reason: collision with root package name */
    public final VelocityTracker f5109z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.Q == null) {
            this.Q = new z(this);
        }
        return this.Q;
    }

    private boolean getTargetCheckedState() {
        return this.B > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((f4.isLayoutRtl(this) ? 1.0f - this.B : this.B) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f5091h;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.S;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f5086b;
        Rect opticalBounds = drawable2 != null ? l1.getOpticalBounds(drawable2) : l1.f82172c;
        return ((((this.C - this.E) - rect.left) - rect.right) - opticalBounds.left) - opticalBounds.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f5102s = charSequence;
        TransformationMethod transformationMethodWrapTransformationMethod = getEmojiTextViewHelper().wrapTransformationMethod(this.O);
        if (transformationMethodWrapTransformationMethod != null) {
            charSequence = transformationMethodWrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.f5103t = charSequence;
        this.N = null;
        if (this.f5104u) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f5100q = charSequence;
        TransformationMethod transformationMethodWrapTransformationMethod = getEmojiTextViewHelper().wrapTransformationMethod(this.O);
        if (transformationMethodWrapTransformationMethod != null) {
            charSequence = transformationMethodWrapTransformationMethod.getTransformation(charSequence, this);
        }
        this.f5101r = charSequence;
        this.M = null;
        if (this.f5104u) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f5086b;
        if (drawable != null) {
            if (this.f5089f || this.f5090g) {
                Drawable drawableMutate = p3.a.wrap(drawable).mutate();
                this.f5086b = drawableMutate;
                if (this.f5089f) {
                    p3.a.setTintList(drawableMutate, this.f5087c);
                }
                if (this.f5090g) {
                    p3.a.setTintMode(this.f5086b, this.f5088e);
                }
                if (this.f5086b.isStateful()) {
                    this.f5086b.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f5091h;
        if (drawable != null) {
            if (this.f5094k || this.f5095l) {
                Drawable drawableMutate = p3.a.wrap(drawable).mutate();
                this.f5091h = drawableMutate;
                if (this.f5094k) {
                    p3.a.setTintList(drawableMutate, this.f5092i);
                }
                if (this.f5095l) {
                    p3.a.setTintMode(this.f5091h, this.f5093j);
                }
                if (this.f5091h.isStateful()) {
                    this.f5091h.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f5100q);
        setTextOffInternal(this.f5102s);
        requestLayout();
    }

    public final void d() {
        if (this.R == null && this.Q.isEnabled() && s4.s.isConfigured()) {
            s4.s sVar = s4.s.get();
            int loadState = sVar.getLoadState();
            if (loadState == 3 || loadState == 0) {
                h3 h3Var = new h3(this);
                this.R = h3Var;
                sVar.registerInitCallback(h3Var);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.F;
        int i13 = this.G;
        int i14 = this.H;
        int i15 = this.I;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f5086b;
        Rect opticalBounds = drawable != null ? l1.getOpticalBounds(drawable) : l1.f82172c;
        Drawable drawable2 = this.f5091h;
        Rect rect = this.S;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (opticalBounds != null) {
                int i17 = opticalBounds.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = opticalBounds.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = opticalBounds.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = opticalBounds.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f5091h.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f5091h.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f5086b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.E + rect.right;
            this.f5086b.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                p3.a.setHotspotBounds(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f5086b;
        if (drawable != null) {
            p3.a.setHotspot(drawable, f10, f11);
        }
        Drawable drawable2 = this.f5091h;
        if (drawable2 != null) {
            p3.a.setHotspot(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f5086b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f5091h;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!f4.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f5098o : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (f4.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.C;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f5098o : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f5104u;
    }

    public boolean getSplitTrack() {
        return this.f5099p;
    }

    public int getSwitchMinWidth() {
        return this.f5097n;
    }

    public int getSwitchPadding() {
        return this.f5098o;
    }

    public CharSequence getTextOff() {
        return this.f5102s;
    }

    public CharSequence getTextOn() {
        return this.f5100q;
    }

    public Drawable getThumbDrawable() {
        return this.f5086b;
    }

    public final float getThumbPosition() {
        return this.B;
    }

    public int getThumbTextPadding() {
        return this.f5096m;
    }

    public ColorStateList getThumbTintList() {
        return this.f5087c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f5088e;
    }

    public Drawable getTrackDrawable() {
        return this.f5091h;
    }

    public ColorStateList getTrackTintList() {
        return this.f5092i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f5093j;
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5086b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5091h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.P;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.P.end();
        this.P = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f5091h;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.G;
        int i11 = this.I;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f5086b;
        if (drawable != null) {
            if (!this.f5099p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = l1.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.M : this.N;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.L;
            TextPaint textPaint = this.K;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f5100q : this.f5102s;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f5086b != null) {
            Drawable drawable = this.f5091h;
            Rect rect = this.S;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = l1.getOpticalBounds(this.f5086b);
            iMax = Math.max(0, opticalBounds.left - rect.left);
            iMax2 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            iMax = 0;
        }
        if (f4.isLayoutRtl(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.C + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.C) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.D;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.D + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.D;
        }
        this.F = paddingLeft;
        this.G = paddingTop;
        this.I = height;
        this.H = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.f5104u) {
            StaticLayout staticLayout = this.M;
            TextPaint textPaint = this.K;
            if (staticLayout == null) {
                CharSequence charSequence = this.f5101r;
                this.M = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.N == null) {
                CharSequence charSequence2 = this.f5103t;
                this.N = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f5086b;
        Rect rect = this.S;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f5086b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f5086b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.E = Math.max(this.f5104u ? (this.f5096m * 2) + Math.max(this.M.getWidth(), this.N.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f5091h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f5091h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f5086b;
        if (drawable3 != null) {
            Rect opticalBounds = l1.getOpticalBounds(drawable3);
            iMax = Math.max(iMax, opticalBounds.left);
            iMax2 = Math.max(iMax2, opticalBounds.right);
        }
        int iMax3 = this.J ? Math.max(this.f5097n, (this.E * 2) + iMax + iMax2) : this.f5097n;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.C = iMax3;
        this.D = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f5100q : this.f5102s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f5100q;
                if (string == null) {
                    string = getResources().getString(com.digidust.elokence.akinator.freemium.R.string.abc_capital_on);
                }
                z1.setStateDescription(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f5102s;
            if (string2 == null) {
                string2 = getResources().getString(com.digidust.elokence.akinator.freemium.R.string.abc_capital_off);
            }
            z1.setStateDescription(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.P;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, T, zIsChecked ? 1.0f : 0.0f);
        this.P = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.P.setAutoCancel(true);
        this.P.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // q.t1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
        setTextOnInternal(this.f5100q);
        setTextOffInternal(this.f5102s);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.J = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f82316b.getFilters(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f5104u != z10) {
            this.f5104u = z10;
            requestLayout();
            if (z10) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f5099p = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f5097n = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f5098o = i10;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i10) {
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, i10, k.a.f70001y);
        ColorStateList colorStateList = n3VarObtainStyledAttributes.getColorStateList(3);
        if (colorStateList != null) {
            this.L = colorStateList;
        } else {
            this.L = getTextColors();
        }
        int dimensionPixelSize = n3VarObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f10 = dimensionPixelSize;
            TextPaint textPaint = this.K;
            if (f10 != textPaint.getTextSize()) {
                textPaint.setTextSize(f10);
                requestLayout();
            }
        }
        int i11 = n3VarObtainStyledAttributes.getInt(1, -1);
        setSwitchTypeface(i11 != 1 ? i11 != 2 ? i11 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, n3VarObtainStyledAttributes.getInt(2, -1));
        if (n3VarObtainStyledAttributes.getBoolean(14, false)) {
            this.O = new n.a(getContext());
        } else {
            this.O = null;
        }
        setTextOnInternal(this.f5100q);
        setTextOffInternal(this.f5102s);
        n3VarObtainStyledAttributes.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i10) {
        TextPaint textPaint = this.K;
        if (i10 <= 0) {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            textPaint.setFakeBoldText((i11 & 1) != 0);
            textPaint.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f5102s;
        if (string == null) {
            string = getResources().getString(com.digidust.elokence.akinator.freemium.R.string.abc_capital_off);
        }
        z1.setStateDescription(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f5100q;
        if (string == null) {
            string = getResources().getString(com.digidust.elokence.akinator.freemium.R.string.abc_capital_on);
        }
        z1.setStateDescription(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5086b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5086b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.B = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(l.a.getDrawable(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f5096m = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f5087c = colorStateList;
        this.f5089f = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f5088e = mode;
        this.f5090g = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5091h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5091h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(l.a.getDrawable(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f5092i = colorStateList;
        this.f5094k = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f5093j = mode;
        this.f5095l = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5086b || drawable == this.f5091h;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f5087c = null;
        this.f5088e = null;
        this.f5089f = false;
        this.f5090g = false;
        this.f5092i = null;
        this.f5093j = null;
        this.f5094k = false;
        this.f5095l = false;
        this.f5109z = VelocityTracker.obtain();
        this.J = true;
        this.S = new Rect();
        i3.checkAppCompatTheme(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = k.a.f70000x;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        z1.saveAttributeDataForStyleable(this, context, iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        Drawable drawable = n3VarObtainStyledAttributes.getDrawable(2);
        this.f5086b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        Drawable drawable2 = n3VarObtainStyledAttributes.getDrawable(11);
        this.f5091h = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        setTextOnInternal(n3VarObtainStyledAttributes.getText(0));
        setTextOffInternal(n3VarObtainStyledAttributes.getText(1));
        this.f5104u = n3VarObtainStyledAttributes.getBoolean(3, true);
        this.f5096m = n3VarObtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f5097n = n3VarObtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f5098o = n3VarObtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f5099p = n3VarObtainStyledAttributes.getBoolean(4, false);
        ColorStateList colorStateList = n3VarObtainStyledAttributes.getColorStateList(9);
        if (colorStateList != null) {
            this.f5087c = colorStateList;
            this.f5089f = true;
        }
        PorterDuff.Mode tintMode = l1.parseTintMode(n3VarObtainStyledAttributes.getInt(10, -1), null);
        if (this.f5088e != tintMode) {
            this.f5088e = tintMode;
            this.f5090g = true;
        }
        if (this.f5089f || this.f5090g) {
            a();
        }
        ColorStateList colorStateList2 = n3VarObtainStyledAttributes.getColorStateList(12);
        if (colorStateList2 != null) {
            this.f5092i = colorStateList2;
            this.f5094k = true;
        }
        PorterDuff.Mode tintMode2 = l1.parseTintMode(n3VarObtainStyledAttributes.getInt(13, -1), null);
        if (this.f5093j != tintMode2) {
            this.f5093j = tintMode2;
            this.f5095l = true;
        }
        if (this.f5094k || this.f5095l) {
            b();
        }
        int resourceId = n3VarObtainStyledAttributes.getResourceId(7, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        new v0(this).f(attributeSet, i10);
        n3VarObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5106w = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.K;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
