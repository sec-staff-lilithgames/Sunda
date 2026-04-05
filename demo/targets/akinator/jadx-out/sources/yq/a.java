package yq;

import android.content.Context;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a extends TextureView {

    /* renamed from: b, reason: collision with root package name */
    public float f94789b;

    public a(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f94789b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = this.f94789b;
        if ((f12 / (f10 / f11)) - 1.0f > 0.0f) {
            measuredHeight = (int) (f10 / f12);
        } else {
            measuredWidth = (int) (f11 * f12);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setVideoAspectRatio(float f10) {
        if (f10 == 0.0f || this.f94789b == f10) {
            return;
        }
        this.f94789b = f10;
        requestLayout();
    }
}
