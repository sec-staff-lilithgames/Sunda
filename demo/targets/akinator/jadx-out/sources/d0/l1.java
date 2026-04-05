package d0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f51484a = new l1();

    public final EdgeEffect create(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? i.f51389a.create(context, attributeSet) : new EdgeEffect(context);
    }

    public final float getDistanceCompat(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return i.f51389a.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(EdgeEffect edgeEffect, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    public final float onPullDistanceCompat(EdgeEffect edgeEffect, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return i.f51389a.onPullDistance(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }
}
