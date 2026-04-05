package com.inmobi.media;

import android.graphics.Point;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import bp.oM.DwaEpyvxz;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3106z8 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f33699u = 0;

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f33700a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f33701b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33702c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f33703d;

    /* renamed from: e, reason: collision with root package name */
    public final C2970r8 f33704e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONArray f33705f;

    /* renamed from: g, reason: collision with root package name */
    public C3106z8 f33706g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f33707h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f33708i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f33709j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f33710k;

    /* renamed from: l, reason: collision with root package name */
    public C3011tf f33711l;

    /* renamed from: m, reason: collision with root package name */
    public final AdConfig f33712m;

    /* renamed from: n, reason: collision with root package name */
    public final F5 f33713n;

    /* renamed from: o, reason: collision with root package name */
    public final int f33714o;

    /* renamed from: p, reason: collision with root package name */
    public final C3089y8 f33715p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33716q;

    /* renamed from: r, reason: collision with root package name */
    public P9 f33717r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f33718s;

    /* renamed from: t, reason: collision with root package name */
    public final Map f33719t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3106z8(int i10, JSONObject pubContent, AdConfig adConfig, HashMap map, C3011tf c3011tf, F5 f52) {
        this(i10, pubContent, null, false, adConfig, map, c3011tf, f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
    }

    public static int a(int i10) {
        return (int) (AbstractC2679a4.b() * i10);
    }

    public final C2970r8 b(int i10) {
        C2970r8 c2970r8 = this.f33704e;
        if (c2970r8 != null) {
            int i11 = 0;
            while (i11 < c2970r8.B) {
                try {
                    int i12 = i11 + 1;
                    C2903n8 c2903n8 = (C2903n8) c2970r8.A.get(i11);
                    kotlin.jvm.internal.e0.checkNotNull(c2903n8);
                    if (sv.k0.equals(c2903n8.f33137b, "card_scrollable", true)) {
                        C2970r8 c2970r82 = c2903n8 instanceof C2970r8 ? (C2970r8) c2903n8 : null;
                        if (i10 < (c2970r82 != null ? c2970r82.B : 0)) {
                            C2903n8 c2903n82 = (c2970r82 == null || i10 < 0 || i10 >= c2970r82.B) ? null : (C2903n8) c2970r82.A.get(i10);
                            if (c2903n82 instanceof C2970r8) {
                                return (C2970r8) c2903n82;
                            }
                        }
                        return null;
                    }
                    i11 = i12;
                } catch (IndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            }
        }
        return null;
    }

    public final ArrayList c() {
        HashMap map = this.f33708i;
        return new ArrayList(map != null ? map.keySet() : null);
    }

    public final int d() {
        C2970r8 c2970r8 = this.f33704e;
        if (c2970r8 != null) {
            Iterator it = c2970r8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2903n8 c2903n8 = (C2903n8) it.next();
                if (sv.k0.equals(c2903n8.f33137b, "card_scrollable", true)) {
                    if (c2903n8 instanceof C2970r8) {
                        return ((C2970r8) c2903n8).B;
                    }
                }
            }
        }
        return 0;
    }

    public final JSONObject e() {
        try {
            JSONArray jSONArray = this.f33705f;
            if (jSONArray != null) {
                return jSONArray.getJSONObject(0);
            }
            return null;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return null;
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting Pages - ")));
            return null;
        }
    }

    public final boolean f() {
        C2970r8 c2970r8;
        C2970r8 c2970r82 = this.f33704e;
        if (c2970r82 == null) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return false;
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
            ((G5) f52).b("z8", "Invalid Data Model: No Root Container");
            return false;
        }
        Iterator it = c2970r82.iterator();
        while (true) {
            C2954q8 c2954q8 = (C2954q8) it;
            if (!c2954q8.hasNext()) {
                break;
            }
            C2903n8 c2903n8 = (C2903n8) c2954q8.next();
            if (sv.k0.equals(c2903n8.f33137b, "card_scrollable", true)) {
                c2970r8 = c2903n8 instanceof C2970r8 ? (C2970r8) c2903n8 : null;
            }
        }
        if (c2970r8 == null) {
            F5 f53 = this.f33713n;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                ((G5) f53).b("z8", "No Card Scrollable in the data model");
            }
            return g();
        }
        if (d() > 0) {
            return g();
        }
        F5 f54 = this.f33713n;
        if (f54 == null) {
            return false;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
        ((G5) f54).b("z8", "Invalid Data Model: No Cards in Card Scrollable");
        return false;
    }

    public final boolean g() {
        F5 f52;
        List<C2903n8> listN = n("VIDEO");
        if (listN != null && !listN.isEmpty()) {
            for (C2903n8 c2903n8 : listN) {
                if (c2903n8.f33136a.length() == 0 && (f52 = this.f33713n) != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                    ((G5) f52).b("z8", "Video asset has invalid ID! CTA link resolution may not work");
                }
                C2887m9 c2887m9 = c2903n8 instanceof C2887m9 ? (C2887m9) c2903n8 : null;
                if ((c2887m9 != null ? c2887m9.d() : null) == null) {
                    F5 f53 = this.f33713n;
                    if (f53 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                        ((G5) f53).b("z8", "No Vast XML. Discarding DataModel");
                    }
                    return false;
                }
                InterfaceC3028uf interfaceC3028ufD = c2887m9.d();
                ArrayList arrayList = interfaceC3028ufD != null ? ((C3011tf) interfaceC3028ufD).f33409e : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    F5 f54 = this.f33713n;
                    if (f54 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                        ((G5) f54).b("z8", "No Media files. Discarding DataModel");
                    }
                    return false;
                }
                InterfaceC3028uf interfaceC3028ufD2 = c2887m9.d();
                String strB = interfaceC3028ufD2 != null ? ((C3011tf) interfaceC3028ufD2).b() : null;
                if (strB == null || strB.length() == 0) {
                    F5 f55 = this.f33713n;
                    if (f55 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                        ((G5) f55).b("z8", "Invalid Media URL.Discarding the model");
                    }
                    c2887m9.a("error", uu.p1.hashMapOf(tu.e0.to("[ERRORCODE]", "403")), (V7) null, this.f33713n);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h() throws JSONException {
        C3089y8 c3089y8;
        C3089y8 c3089y82;
        try {
            JSONObject jSONObject = this.f33700a;
            if (jSONObject == null) {
                C3089y8 c3089y83 = this.f33715p;
                if (c3089y83 == null) {
                    return;
                }
                c3089y83.f33604c = new C2903n8((String) null, (String) null, (String) null, (C2920o8) null, 31);
                return;
            }
            if (!jSONObject.isNull("passThroughJson") && (c3089y82 = this.f33715p) != null) {
                c3089y82.f33602a = jSONObject.getJSONObject("passThroughJson");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adContent");
            if (jSONObjectOptJSONObject != null && (c3089y8 = this.f33715p) != null) {
                C3072x8 c3072x8 = c3089y8.f33603b;
                c3072x8.f33567a = jSONObjectOptJSONObject.optString("title", null);
                c3072x8.f33568b = jSONObjectOptJSONObject.optString("description", null);
                c3072x8.f33570d = jSONObjectOptJSONObject.optString("ctaText", null);
                c3072x8.f33569c = jSONObjectOptJSONObject.optString("iconUrl", null);
                c3072x8.f33571e = jSONObjectOptJSONObject.optLong(CampaignEx.JSON_KEY_STAR, 0L);
                c3072x8.f33572f = jSONObjectOptJSONObject.optString("landingPageUrl", null);
                c3072x8.f33573g = jSONObjectOptJSONObject.optBoolean("isApp");
            }
            C2903n8 c2903n8 = new C2903n8((String) null, (String) null, (String) null, (C2920o8) null, 31);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("onClick");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    a(c2903n8, jSONObjectOptJSONObject2);
                } catch (JSONException unused) {
                    F5 f52 = this.f33713n;
                    if (f52 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                        ((G5) f52).b("z8", "JSONException in parsing click params for publisher CTA");
                    }
                }
                if (!jSONObjectOptJSONObject2.isNull("openMode")) {
                    String string = jSONObjectOptJSONObject2.getString("openMode");
                    kotlin.jvm.internal.e0.checkNotNull(string);
                    String strB = b(string);
                    kotlin.jvm.internal.e0.checkNotNullParameter(strB, "<set-?>");
                    c2903n8.f33142g = strB;
                    String strOptString = jSONObjectOptJSONObject2.optString("fallbackUrl");
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
                    c2903n8.a(strOptString);
                }
                c2903n8.f33144i = jSONObjectOptJSONObject2.optBoolean("supportLockScreen", false);
            }
            ArrayList trackers = j(jSONObject);
            if (trackers != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(trackers, "trackers");
                c2903n8.f33154s.addAll(trackers);
            }
            C3089y8 c3089y84 = this.f33715p;
            if (c3089y84 == null) {
                return;
            }
            c3089y84.f33604c = c2903n8;
        } catch (JSONException unused2) {
            F5 f53 = this.f33713n;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                ((G5) f53).b("z8", "Exception in getting publisher values from JSON");
            }
        }
    }

    public final JSONObject i(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.isNull("assetStyle") ? null : jSONObject.getJSONObject("assetStyle");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            if (jSONObject.isNull("assetStyleRef")) {
                return new JSONObject();
            }
            String string = jSONObject.getString("assetStyleRef");
            JSONObject jSONObject3 = this.f33703d;
            JSONObject jSONObjectOptJSONObject = jSONObject3 != null ? jSONObject3.optJSONObject(string) : null;
            return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetStyle - ")));
            }
            return new JSONObject();
        }
    }

    public final ArrayList j(JSONObject jSONObject) throws JSONException {
        if (jSONObject.isNull("trackers")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("trackers");
            kotlin.jvm.internal.e0.checkNotNull(jSONArray);
            if (!D2.a(jSONArray)) {
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    if (!jSONObject2.isNull("trackerType")) {
                        String string = jSONObject2.getString("trackerType");
                        kotlin.jvm.internal.e0.checkNotNull(string);
                        if (kotlin.jvm.internal.e0.areEqual("url_ping", k(string))) {
                            int iOptInt = jSONObject2.optInt("eventId", 0);
                            if (!jSONObject2.isNull("uiEvent")) {
                                String string2 = jSONObject2.getString("uiEvent");
                                kotlin.jvm.internal.e0.checkNotNull(string2);
                                String strG = g(string2);
                                if (!kotlin.jvm.internal.e0.areEqual("unknown", strG)) {
                                    if (kotlin.jvm.internal.e0.areEqual("OMID_VIEWABILITY", strG)) {
                                        kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                                        arrayList.addAll(o(jSONObject2));
                                    } else {
                                        kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
                                        C2752e9 c2752e9A = a(iOptInt, strG, jSONObject2);
                                        if (c2752e9A != null) {
                                            arrayList.add(c2752e9A);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetTrackers - ")));
            }
        }
        return arrayList;
    }

    public final String k(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("assetType");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return "";
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetType - ")));
            return "";
        }
    }

    public final String l(JSONObject jSONObject) throws JSONException {
        try {
            if (!sv.k0.equals(k(jSONObject), QFzuMMDfrzagDN.uxwvDVW, true) && !sv.k0.equals(k(jSONObject), "IMAGE", true) && !sv.k0.equals(k(jSONObject), "GIF", true)) {
                return "";
            }
            String string = jSONObject.getJSONArray("assetValue").getString(0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
            if (string.length() <= 0) {
                return "";
            }
            String string2 = jSONObject.getJSONArray("assetValue").getString(0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return "";
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetUrl - ")));
            return "";
        }
    }

    public final C2903n8 m(String str) {
        HashMap map;
        C2903n8 c2903n8;
        if (str != null && str.length() != 0) {
            HashMap map2 = this.f33709j;
            if (map2 != null && (c2903n8 = (C2903n8) map2.get(str)) != null) {
                return c2903n8;
            }
            C3106z8 c3106z8 = this.f33706g;
            if (c3106z8 != null && (map = c3106z8.f33709j) != null) {
                return (C2903n8) map.get(str);
            }
        }
        return null;
    }

    public final List n(String assetType) {
        ArrayList arrayList;
        kotlin.jvm.internal.e0.checkNotNullParameter(assetType, "assetType");
        HashMap map = this.f33708i;
        return (map == null || (arrayList = (ArrayList) map.get(assetType)) == null) ? uu.p0.emptyList() : arrayList;
    }

    public final ArrayList o(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap map = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> itKeys = jSONObject2.keys();
                kotlin.jvm.internal.e0.checkNotNull(itKeys);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String string = jSONObject2.getString(next);
                    kotlin.jvm.internal.e0.checkNotNull(next);
                    kotlin.jvm.internal.e0.checkNotNull(string);
                    map.put(next, string);
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                if (!jSONObject3.isNull("url")) {
                    String strOptString = jSONObject3.optString("vendor");
                    String strOptString2 = jSONObject3.optString("verificationParams");
                    String string2 = jSONObject3.getString("url");
                    kotlin.jvm.internal.e0.checkNotNull(strOptString);
                    kotlin.jvm.internal.e0.checkNotNull(string2);
                    arrayList.add(new C2972ra(strOptString, strOptString2, string2, map));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C2752e9("", 0, "OMID_VIEWABILITY", map));
                return arrayList;
            }
        } catch (Exception e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", Qf.a(e10, N6.a("z8", "TAG", "Failed to parse OMID tracker : ")));
            }
        }
        return arrayList;
    }

    public final String p(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("dataType");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return "";
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting webViewAssetValue - ")));
            return "";
        }
    }

    public final Y8 q(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long jOptLong = jSONObject.optLong("absolute");
        long jOptLong2 = jSONObject.optLong("percentage");
        String strOptString = jSONObject.optString("reference");
        kotlin.jvm.internal.e0.checkNotNull(strOptString);
        return new Y8(jOptLong, jOptLong2, strOptString, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3106z8(int i10, JSONObject pubContent, C3106z8 c3106z8, boolean z10, AdConfig adConfig, F5 f52) {
        this(i10, pubContent, c3106z8, z10, adConfig, c3106z8.f33719t, null, f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
        kotlin.jvm.internal.e0.checkNotNullParameter(adConfig, "adConfig");
    }

    public final C2903n8 a(C3106z8 c3106z8, C2903n8 c2903n8) {
        Object obj = c2903n8.f33140e;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] strArr = (String[]) new sv.x("\\|").split(str, 0).toArray(new String[0]);
        C2903n8 c2903n8M = c3106z8.m(strArr[0]);
        if (c2903n8M == null) {
            C3106z8 c3106z82 = c3106z8.f33706g;
            if (c3106z82 == null) {
                return null;
            }
            return a(c3106z82, c2903n8);
        }
        if (kotlin.jvm.internal.e0.areEqual(c2903n8M, c2903n8)) {
            return null;
        }
        if (strArr.length == 1) {
            c2903n8M.f33147l = (byte) 1;
            return c2903n8M;
        }
        c2903n8M.f33147l = AbstractC3055w8.a(strArr[1]);
        F5 f52 = this.f33713n;
        if (f52 != null) {
            ((G5) f52).a("z8", j1.o2.o(N6.a("z8", "TAG", DwaEpyvxz.JyETNwmZAAWVP), c2903n8M.f33137b, " )"));
        }
        return c2903n8M;
    }

    public final JSONObject c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.isNull("display") ? new JSONObject() : jSONObject.getJSONObject("display");
            kotlin.jvm.internal.e0.checkNotNull(jSONObject2);
            return jSONObject2;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetDisplayOnProperties - ")));
            }
            return new JSONObject();
        }
    }

    public final String n(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("valueType");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return "";
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetValueType - ")));
            return "";
        }
    }

    public final JSONArray m(JSONObject jSONObject) throws JSONException {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
            return jSONArray;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetValue - ")));
            }
            return new JSONArray();
        }
    }

    public C3106z8(int i10, JSONObject pubContent, C3106z8 c3106z8, boolean z10, AdConfig adConfig, Map map, C3011tf c3011tf, F5 f52) throws JSONException, NumberFormatException {
        byte bH;
        HashMap map2;
        C2903n8 asset;
        C2903n8 c2903n8;
        InterfaceC3028uf interfaceC3028ufD;
        int iA;
        HashMap map3;
        this.f33714o = i10;
        this.f33706g = c3106z8;
        this.f33712m = adConfig;
        this.f33700a = pubContent;
        this.f33701b = (byte) 0;
        this.f33702c = false;
        this.f33711l = c3011tf;
        this.f33709j = new HashMap();
        HashMap map4 = new HashMap();
        this.f33710k = map4;
        this.f33708i = new HashMap();
        this.f33715p = new C3089y8();
        this.f33718s = z10;
        this.f33719t = map;
        this.f33713n = f52;
        try {
            this.f33703d = pubContent.optJSONObject("styleRefs");
            if (pubContent.isNull("orientation")) {
                bH = 0;
            } else {
                String string = pubContent.getString("orientation");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
                bH = h(string);
            }
            this.f33701b = bH;
            this.f33716q = pubContent.optBoolean("shouldAutoOpenLandingPage", true);
            this.f33702c = pubContent.optBoolean("disableBackButton");
            JSONObject jSONObject = pubContent.getJSONObject("rootContainer");
            kotlin.jvm.internal.e0.checkNotNull(jSONObject);
            C2903n8 c2903n8A = a(jSONObject, "CONTAINER", "/rootContainer");
            this.f33704e = c2903n8A instanceof C2970r8 ? (C2970r8) c2903n8A : null;
            h();
            if (pubContent.has("rewards")) {
                this.f33707h = new HashMap();
            }
            C2793h.Companion.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(pubContent, "pubContent");
            if (pubContent.has("rewards")) {
                map2 = new HashMap();
                JSONObject jSONObjectOptJSONObject = pubContent.optJSONObject("rewards");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string2 = jSONObjectOptJSONObject.getString(next);
                        kotlin.jvm.internal.e0.checkNotNull(next);
                        kotlin.jvm.internal.e0.checkNotNull(string2);
                        map2.put(next, string2);
                    }
                }
            } else {
                map2 = null;
            }
            if (map2 != null && (map3 = this.f33707h) != null) {
                map3.putAll(map2);
            }
            a();
            b();
            for (Map.Entry entry : map4.entrySet()) {
                HashMap map5 = this.f33709j;
                if (map5 != null && (asset = (C2903n8) map5.get(entry.getKey())) != null && 4 == asset.f33148m && (asset.f33149n != -1 || asset.f33150o != -1)) {
                    HashMap map6 = this.f33709j;
                    if (map6 != null && (c2903n8 = (C2903n8) map6.get(entry.getValue())) != null && kotlin.jvm.internal.e0.areEqual("VIDEO", c2903n8.f33138c)) {
                        C2887m9 c2887m9 = c2903n8 instanceof C2887m9 ? (C2887m9) c2903n8 : null;
                        if (c2887m9 != null && (interfaceC3028ufD = c2887m9.d()) != null) {
                            C3011tf c3011tf2 = interfaceC3028ufD instanceof C3011tf ? (C3011tf) interfaceC3028ufD : null;
                            if (c3011tf2 != null) {
                                try {
                                    iA = c3011tf2.a();
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    F5 f53 = this.f33713n;
                                    if (f53 != null) {
                                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                                        ((G5) f53).b("z8", "ArrayIndexOutOfBoundsException in getting media duration");
                                    }
                                    iA = 0;
                                }
                                if (iA == 0) {
                                    asset.f33149n = 0;
                                } else {
                                    asset.f33149n = a(asset.f33149n, iA);
                                    asset.f33150o = a(asset.f33150o, iA);
                                }
                                kotlin.jvm.internal.e0.checkNotNullParameter(asset, "asset");
                                ((C2887m9) c2903n8).f33092y.add(asset);
                            }
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray = pubContent.optJSONArray("pages");
            this.f33705f = jSONArrayOptJSONArray == null ? new JSONArray() : jSONArrayOptJSONArray;
        } catch (JSONException e10) {
            F5 f54 = this.f33713n;
            if (f54 != null) {
                ((G5) f54).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting pagesArray - ")));
            }
        }
    }

    public final byte e(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectC = c(jSONObject);
            if (jSONObjectC.isNull("type")) {
                return (byte) 2;
            }
            String string = jSONObjectC.getString("type");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
            return f(string);
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 == null) {
                return (byte) 2;
            }
            ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetDisplay - ")));
            return (byte) 2;
        }
    }

    public final String d(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectC = c(jSONObject);
            String string = jSONObjectC.isNull("reference") ? "" : jSONObjectC.getString("reference");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetDisplayOnReference - ")));
            }
            return "";
        }
    }

    public static String k(String str) {
        Locale US = Locale.US;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) upperCase.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, upperCase, i10);
        int iHashCode = strA.hashCode();
        if (iHashCode == -1430070305) {
            if (!strA.equals("HTML_SCRIPT")) {
                return "unknown";
            }
            return "html_script";
        }
        if (iHashCode == -158113182) {
            if (strA.equals("URL_PING")) {
                return "url_ping";
            }
            return "unknown";
        }
        if (iHashCode == 1110926088 && strA.equals("URL_WEBVIEW_PING")) {
            return "webview_ping";
        }
        return "unknown";
    }

    public static String c(String str) {
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strP.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, strP, i10);
        switch (strA.hashCode()) {
            case -938102371:
                if (!strA.equals(CampaignEx.JSON_KEY_STAR)) {
                    return "CONTAINER";
                }
                return NativeAdContent.ViewTag.RATING;
            case -410956671:
                strA.equals("container");
                return "CONTAINER";
            case 98832:
                if (strA.equals(C3191e4.h.G0)) {
                    return NativeAdContent.ViewTag.CTA;
                }
                return "CONTAINER";
            case 102340:
                if (strA.equals("gif")) {
                    return "GIF";
                }
                return "CONTAINER";
            case 3226745:
                if (strA.equals("icon")) {
                    return NativeAdContent.ViewTag.AD_ICON;
                }
                return "CONTAINER";
            case 3556653:
                if (strA.equals("text")) {
                    return "TEXT";
                }
                return "CONTAINER";
            case 100313435:
                if (strA.equals("image")) {
                    return "IMAGE";
                }
                return "CONTAINER";
            case 110364485:
                if (strA.equals("timer")) {
                    return "TIMER";
                }
                return "CONTAINER";
            case 112202875:
                if (strA.equals("video")) {
                    return "VIDEO";
                }
                return "CONTAINER";
            case 1224424441:
                if (strA.equals(C3191e4.h.K)) {
                    return "WEBVIEW";
                }
                return "CONTAINER";
            default:
                return "CONTAINER";
        }
    }

    public static byte i(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, str, i10);
        return (!kotlin.jvm.internal.e0.areEqual(strA, "paged") && kotlin.jvm.internal.e0.areEqual(strA, "free")) ? (byte) 1 : (byte) 0;
    }

    public static byte l(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, str, i10);
        return (!kotlin.jvm.internal.e0.areEqual(strA, "absolute") && kotlin.jvm.internal.e0.areEqual(strA, "reference")) ? (byte) 1 : (byte) 0;
    }

    public final String f(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("assetId");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetId - ")));
            }
            return String.valueOf(jSONObject.hashCode());
        }
    }

    public static String e(String str) {
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strP.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, strP, i10);
        if (kotlin.jvm.internal.e0.areEqual(strA, "none") || !kotlin.jvm.internal.e0.areEqual(strA, "line")) {
            return "none";
        }
        return "line";
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.b():void");
    }

    public static String d(String str) {
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strP.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, strP, i10);
        if (kotlin.jvm.internal.e0.areEqual(strA, "straight") || !kotlin.jvm.internal.e0.areEqual(strA, "curved")) {
            return "straight";
        }
        return "curved";
    }

    public static byte f(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, str, i10);
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", strA, locale, "this as java.lang.String).toLowerCase(locale)");
        int iHashCode = strP.hashCode();
        if (iHashCode != -921832806) {
            if (iHashCode == -284840886) {
                strP.equals("unknown");
            } else if (iHashCode == 1728122231 && strP.equals("absolute")) {
                return (byte) 3;
            }
        } else if (strP.equals("percentage")) {
            return (byte) 4;
        }
        return (byte) 1;
    }

    public final String g(JSONObject jSONObject) throws JSONException {
        try {
            String string = jSONObject.getString("assetName");
            kotlin.jvm.internal.e0.checkNotNull(string);
            return string;
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetName - ")));
                return "";
            }
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String j(java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            java.lang.String r2 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r7 = b0.e2.p(r0, r1, r7, r0, r2)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L13:
            if (r3 > r0) goto L38
            if (r4 != 0) goto L19
            r5 = r3
            goto L1a
        L19:
            r5 = r0
        L1a:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.e0.compare(r5, r6)
            if (r5 > 0) goto L28
            r5 = r1
            goto L29
        L28:
            r5 = r2
        L29:
            if (r4 != 0) goto L32
            if (r5 != 0) goto L2f
            r4 = r1
            goto L13
        L2f:
            int r3 = r3 + 1
            goto L13
        L32:
            if (r5 != 0) goto L35
            goto L38
        L35:
            int r0 = r0 + (-1)
            goto L13
        L38:
            java.lang.String r7 = com.inmobi.media.S7.a(r0, r1, r7, r3)
            int r0 = r7.hashCode()
            java.lang.String r1 = "none"
            switch(r0) {
                case -1178781136: goto L68;
                case -1026963764: goto L5e;
                case -891985998: goto L54;
                case 3029637: goto L4a;
                case 3387192: goto L46;
                default: goto L45;
            }
        L45:
            goto L70
        L46:
            r7.equals(r1)
            goto L70
        L4a:
            java.lang.String r0 = "bold"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L53
            goto L70
        L53:
            return r0
        L54:
            java.lang.String r0 = "strike"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L5d
            goto L70
        L5d:
            return r0
        L5e:
            java.lang.String r0 = "underline"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L67
            goto L70
        L67:
            return r0
        L68:
            java.lang.String r0 = "italic"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L71
        L70:
            return r1
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.j(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.a():void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.g(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.W8 c(android.graphics.Point r39, android.graphics.Point r40, android.graphics.Point r41, android.graphics.Point r42, org.json.JSONObject r43) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.c(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.W8");
    }

    public final Point h(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectI;
        Point point = new Point();
        try {
            jSONObjectI = i(jSONObject);
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetPosition - ")));
            }
        }
        if (jSONObjectI.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = jSONObjectI.getJSONArray("geometry");
        point.x = a(jSONArray.getInt(0));
        point.y = a(jSONArray.getInt(1));
        return point;
    }

    public static byte h(String str) {
        Locale locale = Locale.US;
        String strP = b0.e2.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) strP.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, strP, i10);
        int iHashCode = strA.hashCode();
        if (iHashCode == -1626174665) {
            strA.equals(rJqlArycrfkilN.mJiKkDTXe);
        } else if (iHashCode != 729267099) {
            if (iHashCode == 1430647483 && strA.equals("landscape")) {
                return (byte) 2;
            }
        } else if (strA.equals("portrait")) {
            return (byte) 1;
        }
        return (byte) 0;
    }

    public static int a(int i10, int i11) {
        if (i10 == -1 || i10 == 0) {
            return i10;
        }
        if (i10 == 25) {
            return i11 / 4;
        }
        if (i10 == 50) {
            return i11 / 2;
        }
        if (i10 != 75) {
            return i10 != 100 ? i11 / 4 : i11;
        }
        return (i11 * 3) / 4;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final com.inmobi.media.C2903n8 a(org.json.JSONObject r46, java.lang.String r47, java.lang.String r48) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.a(org.json.JSONObject, java.lang.String, java.lang.String):com.inmobi.media.n8");
    }

    public final void b(C2903n8 c2903n8, JSONObject jSONObject) throws JSONException {
        String string;
        String string2 = "";
        boolean z10 = false;
        if (jSONObject.isNull("assetOnclick")) {
            string = "";
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("assetOnclick");
            if (jSONObjectOptJSONObject != null && !jSONObjectOptJSONObject.isNull("itemUrl")) {
                string = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
                z10 = true;
            } else {
                F5 f52 = this.f33713n;
                if (f52 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                    ((G5) f52).b("z8", "Missing itemUrl on asset " + jSONObject);
                }
                string = "";
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("assetOnclick");
            if (jSONObjectOptJSONObject2 == null || !jSONObjectOptJSONObject2.isNull("action")) {
                string2 = jSONObject.getJSONObject("assetOnclick").getString("action");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
                z10 = true;
            }
        }
        c2903n8.b(string);
        kotlin.jvm.internal.e0.checkNotNullParameter(string2, "<set-?>");
        c2903n8.f33143h = string2;
        c2903n8.f33141f = z10;
    }

    public final Point b(JSONObject jSONObject, Point point) throws JSONException {
        JSONObject jSONObjectI;
        try {
            jSONObjectI = i(jSONObject);
        } catch (JSONException unused) {
        }
        if (jSONObjectI.isNull("finalGeometry")) {
            return point;
        }
        JSONArray jSONArray = jSONObjectI.getJSONArray("finalGeometry");
        Point point2 = new Point();
        point2.x = a(jSONArray.getInt(0));
        point2.y = a(jSONArray.getInt(1));
        return point2;
    }

    public final Point b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectI;
        Point point = new Point();
        try {
            jSONObjectI = i(jSONObject);
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetDimensions - ")));
            }
        }
        if (jSONObjectI.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = jSONObjectI.getJSONArray("geometry");
        point.x = a(jSONArray.getInt(2));
        point.y = a(jSONArray.getInt(3));
        return point;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.lang.String r7) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = "US"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
            java.lang.String r7 = r7.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r0)
            int r0 = r7.length()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
            r4 = r3
        L19:
            if (r3 > r0) goto L3e
            if (r4 != 0) goto L1f
            r5 = r3
            goto L20
        L1f:
            r5 = r0
        L20:
            char r5 = r7.charAt(r5)
            r6 = 32
            int r5 = kotlin.jvm.internal.e0.compare(r5, r6)
            if (r5 > 0) goto L2e
            r5 = r1
            goto L2f
        L2e:
            r5 = r2
        L2f:
            if (r4 != 0) goto L38
            if (r5 != 0) goto L35
            r4 = r1
            goto L19
        L35:
            int r3 = r3 + 1
            goto L19
        L38:
            if (r5 != 0) goto L3b
            goto L3e
        L3b:
            int r0 = r0 + (-1)
            goto L19
        L3e:
            java.lang.String r7 = com.inmobi.media.S7.a(r0, r1, r7, r3)
            int r0 = r7.hashCode()
            java.lang.String r1 = "EXTERNAL"
            switch(r0) {
                case -2084521848: goto L6e;
                case -1038134325: goto L67;
                case 69805756: goto L5e;
                case 1411860198: goto L55;
                case 1568475786: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L77
        L4c:
            java.lang.String r0 = "EMBEDDED"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L76
            goto L77
        L55:
            java.lang.String r0 = "DEEPLINK"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L76
            goto L77
        L5e:
            java.lang.String r0 = "INAPP"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L76
            goto L77
        L67:
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L76
            goto L77
        L6e:
            java.lang.String r0 = "DOWNLOAD"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L77
        L76:
            return r7
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.b(java.lang.String):java.lang.String");
    }

    public final C3021u8 b(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        String str;
        String str2;
        String strA;
        String str3;
        String str4;
        String str5;
        String strA2;
        int i10;
        int length;
        String strD = "straight";
        String strA3 = "#ff000000";
        if (jSONObject.isNull("border") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("border")) == null || jSONObjectOptJSONObject.isNull(TtmlNode.TAG_STYLE)) {
            str5 = "straight";
            str3 = "#ff000000";
            str4 = "none";
        } else {
            String string = jSONObjectOptJSONObject.getString(TtmlNode.TAG_STYLE);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
            String strE = e(string);
            if (!jSONObjectOptJSONObject.isNull("corner")) {
                String string2 = jSONObjectOptJSONObject.getString("corner");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
                strD = d(string2);
            }
            if (jSONObjectOptJSONObject.isNull("color")) {
                str = strE;
                str2 = strD;
                strA = "#ff000000";
            } else {
                String string3 = jSONObjectOptJSONObject.getString("color");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "getString(...)");
                int length2 = string3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    str = strE;
                    if (i11 > length2) {
                        str2 = strD;
                        break;
                    }
                    str2 = strD;
                    boolean z11 = kotlin.jvm.internal.e0.compare((int) string3.charAt(!z10 ? i11 : length2), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length2--;
                    } else if (z11) {
                        i11++;
                    } else {
                        z10 = true;
                    }
                    strE = str;
                    strD = str2;
                }
                strA = S7.a(length2, 1, string3, i11);
            }
            str3 = strA;
            str4 = str;
            str5 = str2;
        }
        if (jSONObject.isNull(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
            strA2 = "#00000000";
        } else {
            String string4 = jSONObject.getString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string4, "getString(...)");
            int length3 = string4.length() - 1;
            boolean z12 = false;
            int i12 = 0;
            while (i12 <= length3) {
                boolean z13 = z12;
                boolean z14 = kotlin.jvm.internal.e0.compare((int) string4.charAt(!z12 ? i12 : length3), 32) <= 0;
                if (z13) {
                    if (!z14) {
                        break;
                    }
                    length3--;
                } else if (z14) {
                    i12++;
                } else {
                    z12 = true;
                }
                z12 = z13;
            }
            strA2 = S7.a(length3, 1, string4, i12);
        }
        String str6 = strA2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        try {
            String string5 = jSONObject2.getString(ContentDisposition.Parameters.Size);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string5, "getString(...)");
            int i13 = (int) Double.parseDouble(string5);
            if (jSONObject2.isNull("color")) {
                i10 = i13;
            } else {
                String string6 = jSONObject2.getString("color");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string6, "getString(...)");
                int length4 = string6.length() - 1;
                boolean z15 = false;
                int i14 = 0;
                while (true) {
                    if (i14 > length4) {
                        i10 = i13;
                        break;
                    }
                    i10 = i13;
                    boolean z16 = kotlin.jvm.internal.e0.compare((int) string6.charAt(!z15 ? i14 : length4), 32) <= 0;
                    if (z15) {
                        if (!z16) {
                            break;
                        }
                        length4--;
                    } else if (z16) {
                        i14++;
                    } else {
                        i13 = i10;
                        z15 = true;
                    }
                    i13 = i10;
                }
                strA3 = S7.a(length4, 1, string6, i14);
            }
            String str7 = strA3;
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.isNull(TtmlNode.TAG_STYLE) || (length = jSONObject2.getJSONArray(TtmlNode.TAG_STYLE).length()) == 0) {
                arrayList.add("none");
            } else {
                for (int i15 = 0; i15 < length; i15++) {
                    String string7 = jSONObject2.getJSONArray(TtmlNode.TAG_STYLE).getString(i15);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(string7, "getString(...)");
                    arrayList.add(j(string7));
                }
            }
            return new C3021u8(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, str6, i10, str7, arrayList, new Z8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration"))));
        } catch (NumberFormatException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                ((G5) f52).b("z8", "Failure in building text asset! Text size should be an integer");
            }
            JSONException jSONException = new JSONException(e10.getMessage());
            Y5 y52 = Y5.f32563a;
            C2796h2 event = new C2796h2(e10);
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            Y5.f32566d.a(event);
            throw jSONException;
        }
    }

    public final void a(C2903n8 c2903n8, JSONObject jSONObject) throws JSONException {
        String string;
        boolean z10;
        boolean z11 = true;
        String string2 = "";
        if (jSONObject.isNull("itemUrl")) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                ((G5) f52).b("z8", "Missing itemUrl on publisher onClick");
            }
            z10 = false;
            string = "";
        } else {
            string = jSONObject.getString("itemUrl");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
            z10 = true;
        }
        if (jSONObject.isNull("action")) {
            z11 = z10;
        } else {
            string2 = jSONObject.getString("action");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "getString(...)");
        }
        c2903n8.b(string);
        String strOptString = jSONObject.optString("fallbackUrl");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "optString(...)");
        c2903n8.a(strOptString);
        kotlin.jvm.internal.e0.checkNotNullParameter(string2, "<set-?>");
        c2903n8.f33143h = string2;
        c2903n8.f33141f = z11;
        c2903n8.f33156u = jSONObject.optString("appBundleId");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.isNull("geometry")) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("geometry");
                kotlin.jvm.internal.e0.checkNotNull(jSONArray);
                try {
                    int i10 = jSONArray.getInt(2);
                    int i11 = jSONArray.getInt(3);
                    if (i10 > 0 && i11 > 0) {
                        switch (str.hashCode()) {
                            case -1919329183:
                                if (!str.equals("CONTAINER")) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 67056:
                                if (!str.equals(NativeAdContent.ViewTag.CTA)) {
                                    break;
                                }
                                break;
                            case 70564:
                                if (!str.equals("GIF")) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 2241657:
                                if (!str.equals(NativeAdContent.ViewTag.AD_ICON)) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 2571565:
                                if (!str.equals("TEXT")) {
                                    break;
                                }
                                break;
                            case 69775675:
                                if (!str.equals("IMAGE")) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 79826725:
                                if (!str.equals("TIMER")) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 81665115:
                                if (!str.equals("VIDEO")) {
                                    break;
                                } else {
                                    return true;
                                }
                            case 1942407129:
                                if (str.equals("WEBVIEW")) {
                                    return true;
                                }
                                break;
                        }
                        if (jSONObject.isNull("text")) {
                            return false;
                        }
                        try {
                            String string = jSONObject.getJSONObject("text").getString(ContentDisposition.Parameters.Size);
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "getString(...)");
                            if (((int) Double.parseDouble(string)) > 0) {
                                return true;
                            }
                        } catch (NumberFormatException e10) {
                            F5 f52 = this.f33713n;
                            if (f52 != null) {
                                kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                                ((G5) f52).b("z8", "Failure in validating text asset! Text size should be an integer");
                            }
                            Y5 y52 = Y5.f32563a;
                            C2796h2 event = new C2796h2(e10);
                            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                            Y5.f32566d.a(event);
                            return false;
                        }
                    }
                } catch (JSONException e11) {
                    F5 f53 = this.f33713n;
                    if (f53 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("z8", "TAG");
                        ((G5) f53).b("z8", "Exception while getting geometry - " + e11.getMessage());
                    }
                }
                return false;
            } catch (JSONException e12) {
                F5 f54 = this.f33713n;
                if (f54 != null) {
                    ((G5) f54).b("z8", G0.a(e12, N6.a("z8", "TAG", "Exception while getting assetStyle - ")));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c9 A[PHI: r11
      0x00c9: PHI (r11v18 java.lang.String) = 
      (r11v9 java.lang.String)
      (r11v10 java.lang.String)
      (r11v11 java.lang.String)
      (r11v12 java.lang.String)
      (r11v13 java.lang.String)
      (r11v14 java.lang.String)
      (r11v15 java.lang.String)
      (r11v16 java.lang.String)
      (r11v17 java.lang.String)
      (r11v19 java.lang.String)
     binds: [B:91:0x0138, B:88:0x012e, B:85:0x0124, B:82:0x011a, B:75:0x0105, B:72:0x00fb, B:65:0x00e6, B:62:0x00dc, B:59:0x00d2, B:55:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.C2752e9 a(int r17, java.lang.String r18, org.json.JSONObject r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.a(int, java.lang.String, org.json.JSONObject):com.inmobi.media.e9");
    }

    public final InterfaceC3028uf a(JSONObject jSONObject, String str, C2903n8 c2903n8) {
        AdConfig.VastVideoConfig vastVideo;
        if (sv.k0.equals(k(jSONObject), "VIDEO", true)) {
            try {
                if (!jSONObject.isNull("assetValue")) {
                    if (c2903n8 instanceof C2887m9) {
                        Object obj = ((C2887m9) c2903n8).f33140e;
                        if (obj instanceof InterfaceC3028uf) {
                            return (InterfaceC3028uf) obj;
                        }
                    } else {
                        AdConfig adConfig = this.f33712m;
                        if (adConfig != null && (vastVideo = adConfig.getVastVideo()) != null) {
                            return new C2927of(vastVideo, this.f33713n).a(str);
                        }
                    }
                }
                return null;
            } catch (JSONException e10) {
                F5 f52 = this.f33713n;
                if (f52 != null) {
                    ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting videoDescriptor - ")));
                }
            }
        }
        return null;
    }

    public final Point a(JSONObject jSONObject, Point point) throws JSONException {
        JSONObject jSONObjectI;
        try {
            jSONObjectI = i(jSONObject);
        } catch (JSONException unused) {
        }
        if (jSONObjectI.isNull("finalGeometry")) {
            return point;
        }
        JSONArray jSONArray = jSONObjectI.getJSONArray("finalGeometry");
        Point point2 = new Point();
        point2.x = a(jSONArray.getInt(2));
        point2.y = a(jSONArray.getInt(3));
        return point2;
    }

    public final int a(JSONObject jSONObject, boolean z10) throws JSONException {
        JSONObject jSONObjectC;
        String str;
        try {
            jSONObjectC = c(jSONObject);
            str = z10 ? "delay" : "hideAfterDelay";
        } catch (JSONException e10) {
            F5 f52 = this.f33713n;
            if (f52 != null) {
                ((G5) f52).b("z8", G0.a(e10, N6.a("z8", "TAG", "Exception while getting assetDisplayOnDelay - ")));
            }
        }
        if (jSONObjectC.isNull(str)) {
            return -1;
        }
        int i10 = jSONObjectC.getInt(str);
        if (3 != e(jSONObject)) {
            if (4 == e(jSONObject)) {
                if (i10 != 0) {
                    if (1 <= i10 && i10 < 101) {
                        int[] iArr = {25, 50, 75, 100};
                        double d10 = Double.MAX_VALUE;
                        int i11 = -1;
                        for (int i12 = 0; i12 < 4; i12++) {
                            int i13 = i10 - iArr[i12];
                            double d11 = i13 * i13;
                            if (d11 < d10) {
                                i11 = i12;
                                d10 = d11;
                            }
                        }
                        return iArr[i11];
                    }
                }
            }
            return -1;
        }
        return i10;
    }

    public static byte a(String str) {
        Locale US = Locale.US;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.e0.compare((int) upperCase.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        String strA = S7.a(length, 1, upperCase, i10);
        return (!kotlin.jvm.internal.e0.areEqual(strA, "NONE") && kotlin.jvm.internal.e0.areEqual(strA, "EXIT")) ? (byte) 1 : (byte) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[PHI: r8
      0x00e0: PHI (r8v12 java.lang.String) = (r8v7 java.lang.String), (r8v8 java.lang.String), (r8v7 java.lang.String), (r8v10 java.lang.String) binds: [B:55:0x00de, B:89:0x014a, B:86:0x0141, B:83:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.inmobi.media.C2920o8 a(android.graphics.Point r32, android.graphics.Point r33, android.graphics.Point r34, android.graphics.Point r35, org.json.JSONObject r36) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3106z8.a(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.o8");
    }

    public final Z8 a(JSONObject jSONObject) {
        return new Z8(q(jSONObject.optJSONObject("startOffset")), q(jSONObject.optJSONObject("timerDuration")));
    }
}
