package com.inmobi.media;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Sa implements Va {

    /* renamed from: a, reason: collision with root package name */
    public final Ra f32268a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc f32269b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32270c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f32271d;

    public Sa(Ra ra2, Hc hc2) {
        this.f32268a = ra2;
        this.f32269b = hc2;
        String id2 = w0.i.c("toString(...)");
        this.f32270c = id2;
        this.f32271d = new AtomicBoolean(false);
        C2799h5 c2799h5 = Ka.f31952a;
        if (c2799h5 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "listener");
            c2799h5.f32453b.put(id2, new WeakReference(this));
            Iterator it = c2799h5.f32453b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
        }
        H3 h32 = Ka.f31953b;
        if (h32 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
            kotlin.jvm.internal.e0.checkNotNullParameter(this, "listener");
            h32.f32453b.put(id2, new WeakReference(this));
            Iterator it2 = h32.f32453b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public static final void a(Sa this$0, String json) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "$json");
        this$0.getClass();
        try {
            for (Ja ja2 : this$0.a(json)) {
                this$0.c(ja2.f31917e);
                a(ja2);
            }
        } catch (JSONException unused) {
            a(this$0, (short) 2243);
            Ra ra2 = this$0.f32268a;
            if (ra2 != null) {
                EnumC3000t4[] enumC3000t4Arr = EnumC3000t4.f33385a;
                ((C2991sc) ra2).a("", -104, "Ping JSON is invalid", System.currentTimeMillis(), 0);
            }
        } catch (Exception e10) {
            a(this$0, (short) 2244);
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        } catch (NoClassDefFoundError e11) {
            a(this$0, (short) 2245);
            Y5 y53 = Y5.f32563a;
            C2796h2 event = new C2796h2(e11);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
        }
    }

    public final void b(String json) {
        kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
        ((ScheduledThreadPoolExecutor) F4.f31770b.getValue()).execute(new zk.n(10, this, json));
    }

    public final void c(String priority) {
        Hc hc2 = this.f32269b;
        if (hc2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
            Map mapA = hc2.a();
            mapA.put("trigger", priority);
            Ya.a("PingStarted", mapA);
        }
    }

    public static void a(Ja ja2) {
        Objects.toString(ja2);
        if (kotlin.jvm.internal.e0.areEqual(ja2.f31917e, "high")) {
            C2799h5 c2799h5 = Ka.f31952a;
            if (c2799h5 != null) {
                c2799h5.b(ja2);
                return;
            }
            return;
        }
        H3 h32 = Ka.f31953b;
        if (h32 != null) {
            h32.b(ja2);
        }
    }

    public final List a(String str) {
        URI uri;
        String host;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            a(this, (short) 2253);
            Ra ra2 = this.f32268a;
            if (ra2 != null) {
                EnumC3000t4[] enumC3000t4Arr = EnumC3000t4.f33385a;
                ((C2991sc) ra2).a("", -105, "Ping array is empty", System.currentTimeMillis(), 0);
            }
            return uu.p0.emptyList();
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                a(this, (short) 2254);
            } else {
                String strOptString = jSONObjectOptJSONObject.optString("id");
                if (strOptString != null && !sv.n0.isBlank(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("url");
                    if (strOptString2 != null && !sv.n0.isBlank(strOptString2)) {
                        kotlin.jvm.internal.e0.checkNotNull(strOptString2);
                        try {
                            uri = new URI(strOptString2);
                        } catch (Exception unused) {
                        }
                        if ((kotlin.jvm.internal.e0.areEqual(uri.getScheme(), "http") || kotlin.jvm.internal.e0.areEqual(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) && (host = uri.getHost()) != null && !sv.n0.isBlank(host)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    kotlin.jvm.internal.e0.checkNotNull(next);
                                    String strOptString3 = jSONObjectOptJSONObject2.optString(next, "");
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString3, "optString(...)");
                                    linkedHashMap.put(next, strOptString3);
                                }
                            }
                            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("allowRedirects", true);
                            String strOptString4 = jSONObjectOptJSONObject.optString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "normal");
                            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("ackRequired", false);
                            kotlin.jvm.internal.e0.checkNotNull(strOptString);
                            String str2 = strOptString4 == null ? "normal" : strOptString4;
                            String str3 = this.f32270c;
                            Hc hc2 = this.f32269b;
                            arrayList.add(new Ja(strOptString2, strOptString, linkedHashMap, zOptBoolean, str2, zOptBoolean2, 0, str3, System.currentTimeMillis(), null, hc2 != null ? hc2.f31847a : null));
                        } else {
                            a(this, (short) 2256);
                            Ra ra3 = this.f32268a;
                            if (ra3 != null) {
                                kotlin.jvm.internal.e0.checkNotNull(strOptString);
                                EnumC3000t4[] enumC3000t4Arr2 = EnumC3000t4.f33385a;
                                ((C2991sc) ra3).a(strOptString, -102, "Ping url is invalid", System.currentTimeMillis(), 0);
                            }
                        }
                    } else {
                        a(this, (short) 2252);
                        Ra ra4 = this.f32268a;
                        if (ra4 != null) {
                            kotlin.jvm.internal.e0.checkNotNull(strOptString);
                            EnumC3000t4[] enumC3000t4Arr3 = EnumC3000t4.f33385a;
                            ((C2991sc) ra4).a(strOptString, -103, "Ping URL is missing", System.currentTimeMillis(), 0);
                        }
                    }
                } else {
                    a(this, (short) 2255);
                    Ra ra5 = this.f32268a;
                    if (ra5 != null) {
                        kotlin.jvm.internal.e0.checkNotNull(strOptString);
                        EnumC3000t4[] enumC3000t4Arr4 = EnumC3000t4.f33385a;
                        ((C2991sc) ra5).a(strOptString, -101, "Ping ID is missing", System.currentTimeMillis(), 0);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(Sa sa2, short s10) {
        Hc hc2 = sa2.f32269b;
        if (hc2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = hc2.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            Ya.a("PingFailed", mapA);
        }
    }
}
