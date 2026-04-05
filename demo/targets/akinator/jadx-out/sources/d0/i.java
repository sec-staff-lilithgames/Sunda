package d0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f51389a = new i();

    public final EdgeEffect create(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float getDistance(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float onPullDistance(EdgeEffect edgeEffect, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f10, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
