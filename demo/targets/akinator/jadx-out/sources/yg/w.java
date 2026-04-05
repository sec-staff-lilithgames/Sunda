package yg;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class w {

    /* renamed from: b, reason: collision with root package name */
    public static final Matrix f94554b = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f94555a = new Matrix();

    public abstract void draw(Matrix matrix, xg.a aVar, int i10, Canvas canvas);

    public final void draw(xg.a aVar, int i10, Canvas canvas) {
        draw(f94554b, aVar, i10, canvas);
    }
}
