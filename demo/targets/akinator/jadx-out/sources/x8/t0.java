package x8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f91868a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f91869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f91870c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f91871d;

    public t0(float f10, float f11, float f12, float f13) {
        this.f91868a = f10;
        this.f91869b = f11;
        this.f91870c = f12;
        this.f91871d = f13;
    }

    @Override // x8.u0
    public void drawRoundedCorners(Canvas canvas, Paint paint, RectF rectF) {
        Path path = new Path();
        float f10 = this.f91868a;
        float f11 = this.f91869b;
        float f12 = this.f91870c;
        float f13 = this.f91871d;
        path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }
}
