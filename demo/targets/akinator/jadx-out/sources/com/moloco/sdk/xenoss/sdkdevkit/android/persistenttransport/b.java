package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import io.ktor.http.ContentType;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public final e f50277b;

    public b(e delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f50277b = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        e0.checkNotNullParameter(url, "url");
        this.f50277b.a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ContentType contentType, String str) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(contentType, "contentType");
        d.a(this.f50277b, url, body, contentType, null, 8, null);
    }
}
