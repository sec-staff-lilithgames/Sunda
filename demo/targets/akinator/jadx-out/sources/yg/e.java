package yg;

import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class e {
    @Deprecated
    public void getCornerPath(float f10, float f11, v vVar) {
    }

    public void getCornerPath(v vVar, float f10, float f11, float f12) {
        getCornerPath(f10, f11, vVar);
    }

    public void getCornerPath(v vVar, float f10, float f11, RectF rectF, d dVar) {
        getCornerPath(vVar, f10, f11, dVar.getCornerSize(rectF));
    }
}
