package io.ktor.client.plugins.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AcceptAllCookiesStorage$addCookie$2$2 extends f0 implements l {
    final /* synthetic */ Cookie $cookie;
    final /* synthetic */ Url $requestUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptAllCookiesStorage$addCookie$2$2(Cookie cookie, Url url) {
        super(1);
        this.$cookie = cookie;
        this.$requestUrl = url;
    }

    @Override // kv.l
    public final Boolean invoke(Cookie it) {
        e0.checkNotNullParameter(it, "it");
        return Boolean.valueOf(e0.areEqual(it.getName(), this.$cookie.getName()) && CookiesStorageKt.matches(it, this.$requestUrl));
    }
}
