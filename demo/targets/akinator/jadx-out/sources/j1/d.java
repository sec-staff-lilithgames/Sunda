package j1;

import android.graphics.Canvas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Canvas f68856a = new Canvas();

    public static final e0 ActualCanvas(y0 image) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        c cVar = new c();
        cVar.setInternalCanvas(new Canvas(g.asAndroidBitmap(image)));
        return cVar;
    }

    public static final e0 Canvas(Canvas c10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "c");
        c cVar = new c();
        cVar.setInternalCanvas(c10);
        return cVar;
    }

    public static final Canvas getNativeCanvas(e0 e0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        return ((c) e0Var).getInternalCanvas();
    }
}
