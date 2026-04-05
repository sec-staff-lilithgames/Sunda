package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import m3.a;
import qg.j0;
import ug.d;
import yg.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class MaterialDivider extends View {

    /* renamed from: b, reason: collision with root package name */
    public final j f29238b;

    /* renamed from: c, reason: collision with root package name */
    public int f29239c;

    /* renamed from: e, reason: collision with root package name */
    public int f29240e;

    /* renamed from: f, reason: collision with root package name */
    public int f29241f;

    /* renamed from: g, reason: collision with root package name */
    public int f29242g;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f29240e;
    }

    public int getDividerInsetEnd() {
        return this.f29242g;
    }

    public int getDividerInsetStart() {
        return this.f29241f;
    }

    public int getDividerThickness() {
        return this.f29239c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        super.onDraw(canvas);
        boolean z10 = getLayoutDirection() == 1;
        int i11 = z10 ? this.f29242g : this.f29241f;
        if (z10) {
            width = getWidth();
            i10 = this.f29241f;
        } else {
            width = getWidth();
            i10 = this.f29242g;
        }
        int i12 = width - i10;
        int bottom = getBottom() - getTop();
        j jVar = this.f29238b;
        jVar.setBounds(i11, 0, i12, bottom);
        jVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i12 = this.f29239c;
            if (i12 > 0 && measuredHeight != i12) {
                measuredHeight = i12;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i10) {
        if (this.f29240e != i10) {
            this.f29240e = i10;
            this.f29238b.setFillColor(ColorStateList.valueOf(i10));
            invalidate();
        }
    }

    public void setDividerColorResource(int i10) {
        setDividerColor(a.getColor(getContext(), i10));
    }

    public void setDividerInsetEnd(int i10) {
        this.f29242g = i10;
    }

    public void setDividerInsetEndResource(int i10) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(int i10) {
        this.f29241f = i10;
    }

    public void setDividerInsetStartResource(int i10) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(int i10) {
        if (this.f29239c != i10) {
            this.f29239c = i10;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i10) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i10));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i10);
        Context context2 = getContext();
        this.f29238b = new j();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88478z, i10, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.f29239c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f29241f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f29242g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setDividerColor(d.getColorStateList(context2, typedArrayObtainStyledAttributes, 0).getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
