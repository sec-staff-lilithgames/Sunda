package com.moloco.sdk.internal;

import android.net.Uri;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k f47249a;

    public z(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k persistentHttpRequest) {
        e0.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        this.f47249a = persistentHttpRequest;
    }

    @Override // com.moloco.sdk.internal.y
    public boolean a(String url, long j10, s sVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVarD;
        e0.checkNotNullParameter(url, "url");
        if (sVar != null) {
            try {
                cVarD = sVar.d();
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e10.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVarD = null;
        }
        Uri uriBuild = Uri.parse(a(url, j10, cVarD)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar = this.f47249a;
        String string = uriBuild.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        kVar.a(string);
        return true;
    }

    public final String a(String str, long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        String strA;
        if (cVar != null && (strA = com.moloco.sdk.internal.utils.b.a(str, cVar.a())) != null) {
            str = strA;
        }
        return com.moloco.sdk.internal.utils.b.a(str, j10);
    }
}
