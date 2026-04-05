package dg;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import qg.j0;
import yg.j;
import yg.m;
import yg.p;
import yg.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b extends y.b implements Checkable, y {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f52177p = {R.attr.state_checkable};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f52178q = {R.attr.state_checked};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f52179r = {com.digidust.elokence.akinator.freemium.R.attr.state_dragged};

    /* renamed from: l, reason: collision with root package name */
    public final d f52180l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f52181m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52182n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52183o;

    public b(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f52180l.f52188c.getBounds());
        return rectF;
    }

    public final void d() {
        d dVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (dVar = this.f52180l).f52200o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i10 = bounds.bottom;
        dVar.f52200o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
        dVar.f52200o.setBounds(bounds.left, bounds.top, bounds.right, i10);
    }

    public final void e(int i10, int i11, int i12, int i13) {
        super.setContentPadding(i10, i11, i12, i13);
    }

    @Override // y.b
    public ColorStateList getCardBackgroundColor() {
        return this.f52180l.f52188c.getFillColor();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f52180l.f52189d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f52180l.f52195j;
    }

    public int getCheckedIconGravity() {
        return this.f52180l.f52192g;
    }

    public int getCheckedIconMargin() {
        return this.f52180l.f52190e;
    }

    public int getCheckedIconSize() {
        return this.f52180l.f52191f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f52180l.f52197l;
    }

    @Override // y.b
    public int getContentPaddingBottom() {
        return this.f52180l.f52187b.bottom;
    }

    @Override // y.b
    public int getContentPaddingLeft() {
        return this.f52180l.f52187b.left;
    }

    @Override // y.b
    public int getContentPaddingRight() {
        return this.f52180l.f52187b.right;
    }

    @Override // y.b
    public int getContentPaddingTop() {
        return this.f52180l.f52187b.top;
    }

    public float getProgress() {
        return this.f52180l.f52188c.getInterpolation();
    }

    @Override // y.b
    public float getRadius() {
        return this.f52180l.f52188c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.f52180l.f52196k;
    }

    @Override // yg.y
    public p getShapeAppearanceModel() {
        return this.f52180l.f52198m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f52180l.f52199n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f52180l.f52199n;
    }

    public int getStrokeWidth() {
        return this.f52180l.f52193h;
    }

    public boolean isCheckable() {
        d dVar = this.f52180l;
        return dVar != null && dVar.f52204s;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f52182n;
    }

    public boolean isDragged() {
        return this.f52183o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f52180l;
        dVar.j();
        m.setParentAbsoluteElevation(this, dVar.f52188c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f52177p);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f52178q);
        }
        if (isDragged()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f52179r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // y.b, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f52180l.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f52181m) {
            d dVar = this.f52180l;
            if (!dVar.f52203r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.f52203r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // y.b
    public void setCardBackgroundColor(int i10) {
        this.f52180l.f52188c.setFillColor(ColorStateList.valueOf(i10));
    }

    @Override // y.b
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        d dVar = this.f52180l;
        dVar.f52188c.setElevation(dVar.f52186a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        j jVar = this.f52180l.f52189d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        jVar.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f52180l.f52204s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f52182n != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f52180l.f(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        d dVar = this.f52180l;
        if (dVar.f52192g != i10) {
            dVar.f52192g = i10;
            b bVar = dVar.f52186a;
            dVar.e(bVar.getMeasuredWidth(), bVar.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f52180l.f52190e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f52180l.f52190e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f52180l.f(l.a.getDrawable(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f52180l.f52191f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f52180l.f52191f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f52180l;
        dVar.f52197l = colorStateList;
        Drawable drawable = dVar.f52195j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        super.setClickable(z10);
        d dVar = this.f52180l;
        if (dVar != null) {
            dVar.j();
        }
    }

    @Override // y.b
    public void setContentPadding(int i10, int i11, int i12, int i13) {
        d dVar = this.f52180l;
        dVar.f52187b.set(i10, i11, i12, i13);
        dVar.k();
    }

    public void setDragged(boolean z10) {
        if (this.f52183o != z10) {
            this.f52183o = z10;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // y.b
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f52180l.l();
    }

    public void setOnCheckedChangeListener(a aVar) {
    }

    @Override // y.b
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        d dVar = this.f52180l;
        dVar.l();
        dVar.k();
    }

    public void setProgress(float f10) {
        d dVar = this.f52180l;
        dVar.f52188c.setInterpolation(f10);
        j jVar = dVar.f52189d;
        if (jVar != null) {
            jVar.setInterpolation(f10);
        }
        j jVar2 = dVar.f52202q;
        if (jVar2 != null) {
            jVar2.setInterpolation(f10);
        }
    }

    @Override // y.b
    public void setRadius(float f10) {
        super.setRadius(f10);
        d dVar = this.f52180l;
        dVar.g(dVar.f52198m.withCornerSize(f10));
        dVar.f52194i.invalidateSelf();
        if (dVar.h() || (dVar.f52186a.getPreventCornerOverlap() && !dVar.f52188c.isRoundRect())) {
            dVar.k();
        }
        if (dVar.h()) {
            dVar.l();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f52180l;
        dVar.f52196k = colorStateList;
        RippleDrawable rippleDrawable = dVar.f52200o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateList = l.a.getColorStateList(getContext(), i10);
        d dVar = this.f52180l;
        dVar.f52196k = colorStateList;
        RippleDrawable rippleDrawable = dVar.f52200o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // yg.y
    public void setShapeAppearanceModel(p pVar) {
        setClipToOutline(pVar.isRoundRect(getBoundsAsRectF()));
        this.f52180l.g(pVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        d dVar = this.f52180l;
        if (i10 != dVar.f52193h) {
            dVar.f52193h = i10;
            dVar.f52189d.setStroke(i10, dVar.f52199n);
        }
        invalidate();
    }

    @Override // y.b
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        d dVar = this.f52180l;
        dVar.l();
        dVar.k();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.f52182n = !this.f52182n;
            refreshDrawableState();
            d();
            this.f52180l.setChecked(this.f52182n, true);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f52180l;
        if (dVar.f52199n != colorStateList) {
            dVar.f52199n = colorStateList;
            dVar.f52189d.setStroke(dVar.f52193h, colorStateList);
        }
        invalidate();
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_CardView), attributeSet, i10);
        this.f52182n = false;
        this.f52183o = false;
        this.f52181m = true;
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(getContext(), attributeSet, uf.a.f88476x, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_CardView, new int[0]);
        d dVar = new d(this, attributeSet, i10, com.digidust.elokence.akinator.freemium.R.style.Widget_MaterialComponents_CardView);
        this.f52180l = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        j jVar = dVar.f52188c;
        jVar.setFillColor(cardBackgroundColor);
        dVar.f52187b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.k();
        b bVar = dVar.f52186a;
        ColorStateList colorStateList = ug.d.getColorStateList(bVar.getContext(), typedArrayObtainStyledAttributes, 11);
        dVar.f52199n = colorStateList;
        if (colorStateList == null) {
            dVar.f52199n = ColorStateList.valueOf(-1);
        }
        dVar.f52193h = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        dVar.f52204s = z10;
        bVar.setLongClickable(z10);
        dVar.f52197l = ug.d.getColorStateList(bVar.getContext(), typedArrayObtainStyledAttributes, 6);
        dVar.f(ug.d.getDrawable(bVar.getContext(), typedArrayObtainStyledAttributes, 2));
        dVar.f52191f = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 0);
        dVar.f52190e = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        dVar.f52192g = typedArrayObtainStyledAttributes.getInteger(3, 8388661);
        ColorStateList colorStateList2 = ug.d.getColorStateList(bVar.getContext(), typedArrayObtainStyledAttributes, 7);
        dVar.f52196k = colorStateList2;
        if (colorStateList2 == null) {
            dVar.f52196k = ColorStateList.valueOf(jg.b.getColor(bVar, com.digidust.elokence.akinator.freemium.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateList3 = ug.d.getColorStateList(bVar.getContext(), typedArrayObtainStyledAttributes, 1);
        colorStateList3 = colorStateList3 == null ? ColorStateList.valueOf(0) : colorStateList3;
        j jVar2 = dVar.f52189d;
        jVar2.setFillColor(colorStateList3);
        RippleDrawable rippleDrawable = dVar.f52200o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.f52196k);
        }
        jVar.setElevation(bVar.getCardElevation());
        jVar2.setStroke(dVar.f52193h, dVar.f52199n);
        bVar.setBackgroundInternal(dVar.d(jVar));
        Drawable drawableC = dVar.i() ? dVar.c() : jVar2;
        dVar.f52194i = drawableC;
        bVar.setForeground(dVar.d(drawableC));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(KGUkpTlXZlJLy.BLGNBBNCUjRKcb);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // y.b
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f52180l.f52188c.setFillColor(colorStateList);
    }
}
