package f3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: h, reason: collision with root package name */
    public final float[] f55324h = new float[1];

    /* renamed from: i, reason: collision with root package name */
    public androidx.constraintlayout.widget.b f55325i;

    @Override // a3.m
    public final void a(Object obj) {
        this.f55325i = (androidx.constraintlayout.widget.b) obj;
    }

    @Override // f3.f
    public void setProperty(View view, float f10) {
        float f11 = get(f10);
        float[] fArr = this.f55324h;
        fArr[0] = f11;
        a.setInterpolatedValue(this.f55325i, view, fArr);
    }
}
