package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f48177a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f48178b = new LinkedHashMap();

    public final void b(int i10) {
        f48178b.remove(Integer.valueOf(i10));
    }

    public final int a(v wv2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wv2, "wv");
        int iHashCode = wv2.hashCode();
        f48178b.put(Integer.valueOf(iHashCode), wv2);
        return iHashCode;
    }

    public final /* synthetic */ <T> T a(int i10) {
        T t10 = (T) f48178b.get(Integer.valueOf(i10));
        kotlin.jvm.internal.e0.reifiedOperationMarker(2, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return t10;
    }
}
