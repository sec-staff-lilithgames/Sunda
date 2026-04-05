package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import hj.t;
import hj.z;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ResizableImageView extends AppCompatImageView {

    /* renamed from: b, reason: collision with root package name */
    public int f29687b;

    public ResizableImageView(Context context) {
        super(context);
        b(context);
    }

    public final z a(int i10, int i11) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i10 > maxWidth) {
            t.logdNumber("Image: capping width", maxWidth);
            i11 = (i11 * maxWidth) / i10;
            i10 = maxWidth;
        }
        if (i11 > maxHeight) {
            t.logdNumber("Image: capping height", maxHeight);
            i10 = (i10 * maxHeight) / i11;
        } else {
            maxHeight = i11;
        }
        return new z(i10, maxHeight);
    }

    public final void b(Context context) {
        this.f29687b = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        t.logdPair("Image: intrinsic width, height", drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        z zVarA = a((int) Math.ceil((r10 * this.f29687b) / 160), (int) Math.ceil((r9 * this.f29687b) / 160));
        int i12 = zVarA.f58994a;
        int i13 = zVarA.f58995b;
        t.logdPair("Image: new target dimensions", i12, i13);
        setMeasuredDimension(i12, i13);
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = iMax;
        float f11 = iMax2;
        t.logdPair("Image: min width, height", f10, f11);
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        t.logdPair("Image: actual width, height", f12, f13);
        float f14 = measuredWidth < iMax ? f10 / f12 : 1.0f;
        float f15 = measuredHeight < iMax2 ? f11 / f13 : 1.0f;
        if (f14 <= f15) {
            f14 = f15;
        }
        if (f14 > 1.0d) {
            int iCeil = (int) Math.ceil(f12 * f14);
            int iCeil2 = (int) Math.ceil(f13 * f14);
            StringBuilder sbF = i.f(measuredWidth, measuredHeight, "Measured dimension (", "x", ") too small.  Resizing to ");
            sbF.append(iCeil);
            sbF.append("x");
            sbF.append(iCeil2);
            t.logd(sbF.toString());
            z zVarA2 = a(iCeil, iCeil2);
            setMeasuredDimension(zVarA2.f58994a, zVarA2.f58995b);
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public ResizableImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b(context);
    }
}
