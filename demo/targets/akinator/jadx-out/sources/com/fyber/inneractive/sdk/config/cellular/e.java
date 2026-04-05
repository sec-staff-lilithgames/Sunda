package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e {
    public static d a(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? new c(context) : new g(context);
    }
}
