package j1;

import android.graphics.Canvas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f68881a = new i0();

    public final void enableZ(Canvas canvas, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
