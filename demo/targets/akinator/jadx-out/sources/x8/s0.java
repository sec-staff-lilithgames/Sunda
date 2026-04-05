package x8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91867a;

    public s0(int i10) {
        this.f91867a = i10;
    }

    @Override // x8.u0
    public void drawRoundedCorners(Canvas canvas, Paint paint, RectF rectF) {
        int i10 = this.f91867a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
    }
}
