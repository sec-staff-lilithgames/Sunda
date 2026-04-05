package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import io.ktor.http.ContentType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {
    public static /* synthetic */ void a(e eVar, String str, byte[] bArr, ContentType contentType, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPost");
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        eVar.a(str, bArr, contentType, str2);
    }
}
