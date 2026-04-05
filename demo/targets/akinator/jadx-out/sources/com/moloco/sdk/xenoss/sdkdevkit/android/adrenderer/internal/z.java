package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f50224a = new z();

    public final boolean a(String adm) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        return sv.n0.contains((CharSequence) adm, (CharSequence) "mraid.js", true);
    }

    public final boolean b(String adm) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        return sv.n0.contains((CharSequence) adm, (CharSequence) "<VAST", true);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o c(String adm) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        return b(adm) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50233b : a(adm) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50234c : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o.f50235e;
    }
}
