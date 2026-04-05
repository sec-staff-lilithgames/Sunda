package com.digidust.elokence.akinator.graphic.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AutoFitTextureView extends TextureView {

    /* renamed from: b, reason: collision with root package name */
    public int f21755b;

    /* renamed from: c, reason: collision with root package name */
    public int f21756c;

    public AutoFitTextureView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f21755b;
        if (i13 == 0 || (i12 = this.f21756c) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (size2 * i13) / i12) {
            setMeasuredDimension(size, (i12 * size) / i13);
        } else {
            setMeasuredDimension((i13 * size2) / i12, size2);
        }
    }

    public void setAspectRatio(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f21755b = i10;
        this.f21756c = i11;
        requestLayout();
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21755b = 0;
        this.f21756c = 0;
    }
}
