package j1;

import android.graphics.Canvas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    /* renamed from: toAndroidVertexMode-JOOmi9M, reason: not valid java name */
    public static final Canvas.VertexMode m4954toAndroidVertexModeJOOmi9M(int i10) {
        w2 w2Var = x2.f69047b;
        return x2.m5077equalsimpl0(i10, w2Var.m5066getTrianglesc2xauaI()) ? Canvas.VertexMode.TRIANGLES : x2.m5077equalsimpl0(i10, w2Var.m5065getTriangleStripc2xauaI()) ? Canvas.VertexMode.TRIANGLE_STRIP : x2.m5077equalsimpl0(i10, w2Var.m5064getTriangleFanc2xauaI()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}
