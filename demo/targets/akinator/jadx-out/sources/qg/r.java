package qg;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class r extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public int f83222b;

    /* renamed from: c, reason: collision with root package name */
    public int f83223c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83224e;

    /* renamed from: f, reason: collision with root package name */
    public int f83225f;

    public r(Context context) {
        this(context, null);
    }

    public int getItemSpacing() {
        return this.f83223c;
    }

    public int getLineSpacing() {
        return this.f83222b;
    }

    public int getRowCount() {
        return this.f83225f;
    }

    public int getRowIndex(View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.f83224e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int marginEnd;
        int marginStart;
        boolean z11;
        int i14 = 0;
        if (getChildCount() == 0) {
            this.f83225f = 0;
            return;
        }
        boolean z12 = true;
        this.f83225f = 1;
        boolean z13 = getLayoutDirection() == 1;
        int paddingRight = z13 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z13 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i15 = 0;
        int measuredWidth = paddingRight;
        int i16 = paddingTop;
        while (i15 < getChildCount()) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z11 = z12;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i14;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i17 = i12 - i10;
                z11 = z12;
                int i18 = i17 - paddingLeft;
                if (!this.f83224e && measuredWidth2 > i18) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i16 = paddingTop + this.f83222b;
                    this.f83225f++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f83225f - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (z13) {
                    childAt.layout(i17 - measuredWidth2, i16, (i17 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i16, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f83223c;
                paddingTop = measuredHeight;
            }
            i15++;
            z12 = z11;
            i14 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i13 = 0;
                    i14 = 0;
                }
                int i19 = i13;
                if (childAt.getMeasuredWidth() + paddingLeft + i14 > paddingRight && !isSingleLine()) {
                    paddingLeft = getPaddingLeft();
                    i16 = paddingTop + this.f83222b;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i14 + i19 + this.f83223c + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i19;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i12) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f83223c = i10;
    }

    public void setLineSpacing(int i10) {
        this.f83222b = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f83224e = z10;
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f83224e = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uf.a.f88467o, 0, 0);
        this.f83222b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f83223c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public r(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f83224e = false;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, uf.a.f88467o, 0, 0);
        this.f83222b = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f83223c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
