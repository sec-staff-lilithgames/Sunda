package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k f45937a;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest) {
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f45937a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.h
    public void a(String burl) {
        e0.checkNotNullParameter(burl, "burl");
        try {
            Uri uri = Uri.parse(burl);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar = this.f45937a;
            String string = uri.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            kVar.a(string);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BUrlTrackerImpl", e10.toString(), null, false, 12, null);
        }
    }
}
