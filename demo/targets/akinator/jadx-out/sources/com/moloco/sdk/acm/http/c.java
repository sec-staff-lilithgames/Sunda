package com.moloco.sdk.acm.http;

import a1.k;
import io.ktor.client.HttpClient;
import kotlin.jvm.internal.e0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static HttpClient f45622b;

    /* renamed from: c, reason: collision with root package name */
    public static String f45623c;

    /* renamed from: a, reason: collision with root package name */
    public static final c f45621a = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final o f45624d = q.lazy(new k(4));

    public static final h b() {
        HttpClient httpClient = f45622b;
        String str = null;
        if (httpClient == null) {
            e0.throwUninitializedPropertyAccessException("httpClient");
            httpClient = null;
        }
        String str2 = f45623c;
        if (str2 == null) {
            e0.throwUninitializedPropertyAccessException("apiUrl");
        } else {
            str = str2;
        }
        return new h(httpClient, str);
    }

    public final void a(HttpClient httpClient, String apiUrl) {
        e0.checkNotNullParameter(httpClient, "httpClient");
        e0.checkNotNullParameter(apiUrl, "apiUrl");
        if (f45622b == null) {
            f45622b = httpClient;
            f45623c = apiUrl;
        }
    }

    public final f a() {
        return (f) f45624d.getValue();
    }
}
