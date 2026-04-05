package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {
    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final SimpleDateFormat a(String pattern) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ROOT);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
