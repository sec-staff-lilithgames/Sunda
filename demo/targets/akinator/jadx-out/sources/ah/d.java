package ah;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.digidust.elokence.akinator.freemium.R;
import qg.t0;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class d extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final c f4415k = new c();

    /* renamed from: b, reason: collision with root package name */
    public final p f4416b;

    /* renamed from: c, reason: collision with root package name */
    public int f4417c;

    /* renamed from: e, reason: collision with root package name */
    public final float f4418e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4419f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4420g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4421h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f4422i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f4423j;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        Drawable drawableWrap;
        super(fh.a.wrap(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, uf.a.M);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f4417c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f4416b = p.builder(context2, attributeSet, 0, 0).build();
        }
        this.f4418e = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(t0.parseTintMode(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4419f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f4420g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f4421h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f4415k);
        setFocusable(true);
        if (getBackground() == null) {
            int iLayer = jg.b.layer(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            p pVar = this.f4416b;
            if (pVar != null) {
                int i10 = e.f4424a;
                yg.j jVar = new yg.j(pVar);
                jVar.setFillColor(ColorStateList.valueOf(iLayer));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i11 = e.f4424a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iLayer);
                gradientDrawable = gradientDrawable2;
            }
            if (this.f4422i != null) {
                drawableWrap = p3.a.wrap(gradientDrawable);
                drawableWrap.setTintList(this.f4422i);
            } else {
                drawableWrap = p3.a.wrap(gradientDrawable);
            }
            setBackground(drawableWrap);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f4419f;
    }

    public int getAnimationMode() {
        return this.f4417c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4418e;
    }

    public int getMaxInlineActionWidth() {
        return this.f4421h;
    }

    public int getMaxWidth() {
        return this.f4420g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f4420g;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f4417c = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f4422i != null) {
            drawable = p3.a.wrap(drawable.mutate());
            drawable.setTintList(this.f4422i);
            drawable.setTintMode(this.f4423j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f4422i = colorStateList;
        if (getBackground() != null) {
            Drawable drawableWrap = p3.a.wrap(getBackground().mutate());
            drawableWrap.setTintList(colorStateList);
            drawableWrap.setTintMode(this.f4423j);
            if (drawableWrap != getBackground()) {
                super.setBackgroundDrawable(drawableWrap);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f4423j = mode;
        if (getBackground() != null) {
            Drawable drawableWrap = p3.a.wrap(getBackground().mutate());
            drawableWrap.setTintMode(mode);
            if (drawableWrap != getBackground()) {
                super.setBackgroundDrawable(drawableWrap);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f4415k);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(e eVar) {
    }
}
