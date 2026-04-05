package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import java.io.Closeable;
import java.util.List;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface CookiesStorage extends Closeable {
    Object addCookie(Url url, Cookie cookie, d<? super x0> dVar);

    Object get(Url url, d<? super List<Cookie>> dVar);
}
