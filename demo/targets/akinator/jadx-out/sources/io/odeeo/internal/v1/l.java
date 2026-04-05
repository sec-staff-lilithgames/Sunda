package io.odeeo.internal.v1;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {
    public static final int dpToPx(int i10, Context context) {
        e0.checkNotNullParameter(context, "context");
        return (int) (i10 * context.getResources().getDisplayMetrics().density);
    }
}
