package com.inmobi.media;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ga {
    public static final boolean a(Context context, String permission) {
        kotlin.jvm.internal.e0.checkNotNullParameter(permission, "permission");
        if (context == null) {
            return false;
        }
        return context.checkCallingOrSelfPermission(permission) == 0;
    }
}
