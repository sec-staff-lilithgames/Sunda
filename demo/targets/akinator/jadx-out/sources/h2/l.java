package h2;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    public static final void getTextBounds(Paint paint, CharSequence text, int i10, int i11, Rect rect) {
        e0.checkNotNullParameter(paint, "paint");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(text, i10, i11, rect);
    }
}
