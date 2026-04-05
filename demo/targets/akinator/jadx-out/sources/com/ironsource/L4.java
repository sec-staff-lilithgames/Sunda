package com.ironsource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class L4 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    public static final L4 f34800a = new L4();

    private L4() {
    }

    @Override // com.ironsource.X3
    public InputStream a(String url) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
