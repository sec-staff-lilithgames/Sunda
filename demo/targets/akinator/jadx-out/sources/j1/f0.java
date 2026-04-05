package j1;

import android.graphics.Canvas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f68864a = new c();

    public final void drawInto(Canvas targetCanvas, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(targetCanvas, "targetCanvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(targetCanvas);
        block.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    public final c getAndroidCanvas() {
        return this.f68864a;
    }

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
