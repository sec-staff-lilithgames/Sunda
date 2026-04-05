package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.digidust.elokence.akinator.freemium.R;
import qg.j0;
import qg.l0;
import yg.j;
import yg.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f28878e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f28879a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f28880b0;

    /* renamed from: c0, reason: collision with root package name */
    public ImageView.ScaleType f28881c0;

    /* renamed from: d0, reason: collision with root package name */
    public Boolean f28882d0;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public void clearNavigationIconTint() {
        this.W = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            p3.a.wrap(navigationIcon.mutate()).setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f28881c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    public boolean isLogoAdjustViewBounds() {
        Boolean bool = this.f28882d0;
        return bool != null && bool.booleanValue();
    }

    public boolean isSubtitleCentered() {
        return this.f28880b0;
    }

    public boolean isTitleCentered() {
        return this.f28879a0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f28879a0 || this.f28880b0) {
            TextView titleTextView = l0.getTitleTextView(this);
            TextView subtitleTextView = l0.getSubtitleTextView(this);
            if (titleTextView != null || subtitleTextView != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != titleTextView && childAt != subtitleTextView) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f28879a0 && titleTextView != null) {
                    t(titleTextView, pair);
                }
                if (this.f28880b0 && subtitleTextView != null) {
                    t(subtitleTextView, pair);
                }
            }
        }
        ImageView logoImageView = l0.getLogoImageView(this);
        if (logoImageView != null) {
            Boolean bool = this.f28882d0;
            if (bool != null) {
                logoImageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f28881c0;
            if (scaleType != null) {
                logoImageView.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m.setElevation(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f28882d0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f28882d0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f28881c0 != scaleType) {
            this.f28881c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = p3.a.wrap(drawable.mutate());
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.W = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f28880b0 != z10) {
            this.f28880b0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f28879a0 != z10) {
            this.f28879a0 = z10;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListOrNull;
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.F, i10, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(2, -1));
        }
        this.f28879a0 = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.f28880b0 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        int i11 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f28878e0;
            if (i11 < scaleTypeArr.length) {
                this.f28881c0 = scaleTypeArr[i11];
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f28882d0 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListOrNull = ColorStateList.valueOf(0);
        } else {
            colorStateListOrNull = mg.c.getColorStateListOrNull(background);
        }
        if (colorStateListOrNull != null) {
            j jVar = new j();
            jVar.setFillColor(colorStateListOrNull);
            jVar.initializeElevationOverlay(context2);
            jVar.setElevation(getElevation());
            setBackground(jVar);
        }
    }
}
