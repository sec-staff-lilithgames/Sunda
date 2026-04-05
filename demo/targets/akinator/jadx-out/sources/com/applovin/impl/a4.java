package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a4 implements f2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13405a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f13406b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f13407c = new AtomicReference();

    public a4(com.applovin.impl.sdk.k kVar) {
        this.f13405a = kVar;
        this.f13406b = kVar.O();
    }

    private OkHttpClient a() {
        Object objBuild = this.f13407c.get();
        if (objBuild == null) {
            synchronized (this.f13407c) {
                try {
                    objBuild = this.f13407c.get();
                    if (objBuild == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long jIntValue = ((Integer) this.f13405a.a(v4.R2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f13405a.a(v4.S2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (objBuild == null) {
                            objBuild = this.f13407c;
                        }
                        this.f13407c.set(objBuild);
                    }
                } finally {
                }
            }
        }
        if (objBuild == this.f13407c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.f2
    public InputStream a(String str, Map map) throws IOException {
        Response responseExecute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f13405a.E().a("loadResource", str, iCode, responseExecute.message());
        if (r0.a(iCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            b0.e2.y("Opened stream to resource ", str, this.f13406b, "OkHttpLoader");
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f13405a.g().d(c2.C, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
