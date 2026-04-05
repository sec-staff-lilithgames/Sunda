package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: assets/audience_network.dex */
public abstract class OE extends FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final Rect A04;
    public final Rect A05;
    public final OF A06;
    public static String[] A07 = {"ShNBvS5", "b2z1l7evnHkZXpFh4jUAU", "JfQekQfzdw1mJ2RkSzlEvaL1jVLq96XT", "0M9zDLqBQAVDpkbZHtwaURqwF1mV2f1S", "jQ6MUrNiHIuV2Q80zD0eWZ3NfiJ07L6A", "0up6ixfDqbrZOotDwCZ4gMtZBiUGrTem", "xF0da7GYt9A5Qra0MND7i27I5BG4MHvn", "fGPiNZIH9FIGNZUMCtCVq24hO8AJIHug"};
    public static final int[] A0B = {R.attr.colorBackground};
    public static final float A08 = Resources.getSystem().getDisplayMetrics().density;
    public static final int A09 = (int) (A08 * 1.0f);
    public static final OG A0A = new C2136gd();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public OE(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A04 = new Rect();
        this.A05 = new Rect();
        this.A06 = new C2137ge(this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        Color.colorToHSV(color, new float[3]);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        this.A04.left = 0;
        this.A04.top = 0;
        this.A04.right = 0;
        this.A04.bottom = 0;
        float f10 = 10.0f > 50.0f ? 10.0f : 50.0f;
        this.A01 = 0;
        this.A00 = 0;
        A0A.AA8(this.A06, context, colorStateListValueOf, 10.0f, 10.0f, f10);
    }

    static {
        A0A.AA6();
    }

    public OE(Context context) {
        this(context, null);
    }

    public OE(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorStateList getCardBackgroundColor() {
        return A0A.A6t(this.A06);
    }

    public float getCardElevation() {
        return A0A.A7n(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A8K(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A8j(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!(A0A instanceof C2136gd)) {
            int mode = View.MeasureSpec.getMode(i10);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    int minWidth = (int) Math.ceil(A0A.A8Q(this.A06));
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.max(minWidth, View.MeasureSpec.getSize(i10)), mode);
                    break;
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (A07[1].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[4] = "ezVHALe6egolV0dGNwTkgEwTmiIckZEU";
            strArr[5] = "9kVtZpYuS1B6eNaF5MtLQpOmcikxmxeD";
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(A0A.A8P(this.A06)), View.MeasureSpec.getSize(i11)), mode2);
                    break;
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        A0A.AIZ(this.A06, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A0A.AIZ(this.A06, colorStateList);
    }

    public void setCardElevation(float f10) {
        A0A.AIf(this.A06, f10);
    }

    public void setMaxCardElevation(float f10) {
        A0A.AIn(this.A06, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.A00 = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.A01 = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.A03) {
            this.A03 = z10;
            A0A.AEl(this.A06);
        }
    }

    public void setRadius(float f10) {
        A0A.AIz(this.A06, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.A02 != z10) {
            this.A02 = z10;
            A0A.ACm(this.A06);
        }
    }
}
