package com.applovin.impl;

import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class q1 extends d2 {

    /* renamed from: i, reason: collision with root package name */
    private JSONObject f15119i;

    public q1(com.applovin.impl.sdk.k kVar) {
        super(kVar, c2.b.ERROR);
    }

    public void a(String str, Throwable th2) {
        a(str, th2, new HashMap());
    }

    public void b() {
        this.f15119i = JsonUtils.deserialize((String) this.f13844a.a(v4.I));
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, new HashMap());
    }

    public void a(String str, String str2, Throwable th2, Map map) {
        a(w0.i.d(str, ":", str2), th2, map);
    }

    public void b(String str, String str2, Throwable th2) {
        this.f13844a.r0().a((g5) new p6(this.f13844a, "reportCaughtException", new al.a(11, str, (Object) this, (Object) str2, (Object) th2)), b6.b.OTHER);
    }

    public void a(String str, Throwable th2, Map map) {
        map.put("source", str);
        map.put("top_main_method", th2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th3 : th2.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th3.toString(), map2);
            arrayList.add(map2);
        }
        a(c2.A0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(e2.a((AppLovinAdImpl) bVar));
            map.putAll(e2.a(bVar));
            boolean zO0 = bVar.O0();
            map.put("is_video_stream", String.valueOf(zO0));
            if (zO0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).u1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.S(), map);
            }
        }
        d(c2.F0, map);
    }

    public void a(String str, String str2, int i10, String str3) {
        List listA = a(str2);
        boolean z10 = listA != null;
        if (z10 && listA.contains(Integer.valueOf(i10))) {
            return;
        }
        if (z10 || i10 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i10));
            map.put("error_message", e2.a(str3));
            d(c2.I0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f15119i, StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f15119i, BuildConfig.FLAVOR, null) : integerList;
    }
}
