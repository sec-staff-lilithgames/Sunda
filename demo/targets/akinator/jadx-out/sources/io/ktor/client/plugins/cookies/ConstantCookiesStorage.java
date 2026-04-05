package io.ktor.client.plugins.cookies;

import io.bidmachine.protobuf.EventTypeExtended;
import io.ktor.http.Cookie;
import io.ktor.http.URLBuilder;
import io.ktor.http.Url;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.x0;
import uu.y0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ConstantCookiesStorage implements CookiesStorage {
    private final List<Cookie> storage;

    public ConstantCookiesStorage(Cookie... cookies) {
        e0.checkNotNullParameter(cookies, "cookies");
        ArrayList arrayList = new ArrayList(cookies.length);
        for (Cookie cookie : cookies) {
            arrayList.add(CookiesStorageKt.fillDefaults(cookie, new URLBuilder(null, null, 0, null, null, null, null, null, false, EventTypeExtended.EVENT_TYPE_EXTENDED_AD_EXPIRED_VALUE, null).build()));
        }
        this.storage = y0.toList(arrayList);
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public Object addCookie(Url url, Cookie cookie, d<? super x0> dVar) {
        return x0.f87415a;
    }

    @Override // io.ktor.client.plugins.cookies.CookiesStorage
    public Object get(Url url, d<? super List<Cookie>> dVar) {
        List<Cookie> list = this.storage;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (CookiesStorageKt.matches((Cookie) obj, url)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
