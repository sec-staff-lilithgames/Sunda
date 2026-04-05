package j1;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w1 {
    public static final Rect toAndroidRect(i1.j jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<this>");
        return new Rect((int) jVar.getLeft(), (int) jVar.getTop(), (int) jVar.getRight(), (int) jVar.getBottom());
    }

    public static final RectF toAndroidRectF(i1.j jVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<this>");
        return new RectF(jVar.getLeft(), jVar.getTop(), jVar.getRight(), jVar.getBottom());
    }

    public static final i1.j toComposeRect(Rect rect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "<this>");
        return new i1.j(rect.left, rect.top, rect.right, rect.bottom);
    }
}
