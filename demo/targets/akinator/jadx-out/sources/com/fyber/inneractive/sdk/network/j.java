package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j extends l {

    /* renamed from: g, reason: collision with root package name */
    public final HttpURLConnection f24232g;

    public j(HttpURLConnection httpURLConnection, int i10, FilterInputStream filterInputStream, Map map, String str) {
        this.f24232g = httpURLConnection;
        this.f24237a = i10;
        this.f24239c = filterInputStream;
        this.f24240d = map;
        this.f24241e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            HttpURLConnection httpURLConnection = this.f24232g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.a();
    }
}
