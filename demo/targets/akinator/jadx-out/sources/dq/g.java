package dq;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {
    public static final Intent a(Context context, Class<?> clazz) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(clazz, "clazz");
        Intent intent = new Intent(context, clazz);
        intent.addFlags(268435456);
        intent.addFlags(8388608);
        return intent;
    }
}
