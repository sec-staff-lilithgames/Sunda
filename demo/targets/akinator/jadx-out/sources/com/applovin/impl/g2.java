package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g2 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13996a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13997b;

    public g2(com.applovin.impl.sdk.k kVar) {
        this.f13996a = kVar;
        this.f13997b = kVar.O();
    }

    @Override // com.applovin.impl.f2
    public InputStream a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f13996a.a(v4.R2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f13996a.a(v4.S2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f13996a.E().a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (r0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Opened stream to resource ", str, this.f13997b, "HttpUrlConnectionLoader");
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f13996a.g().d(c2.C, mapHashMap);
        return inputStream;
    }
}
