package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2830j3 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2830j3 f32954a;

    /* renamed from: b, reason: collision with root package name */
    public static LinkedList f32955b;

    /* renamed from: c, reason: collision with root package name */
    public static LinkedList f32956c;

    /* renamed from: d, reason: collision with root package name */
    public static SignalsConfig f32957d;

    /* renamed from: e, reason: collision with root package name */
    public static AdConfig f32958e;

    /* renamed from: f, reason: collision with root package name */
    public static byte[] f32959f;

    /* renamed from: g, reason: collision with root package name */
    public static String f32960g;

    static {
        List<String> listEmptyList;
        AdConfig.ContextualDataConfig contextualData;
        C2830j3 c2830j3 = new C2830j3();
        f32954a = c2830j3;
        LinkedList linkedList = new LinkedList();
        f32955b = linkedList;
        Object objClone = linkedList.clone();
        kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f32956c = (LinkedList) objClone;
        C2814i3 c2814i3 = new C2814i3();
        C2797h3 c2797h3 = new C2797h3();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("signals", C2925od.b(), c2814i3);
        f32957d = configA instanceof SignalsConfig ? (SignalsConfig) configA : null;
        Config configA2 = O2.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, C2925od.b(), c2797h3);
        f32958e = configA2 instanceof AdConfig ? (AdConfig) configA2 : null;
        SignalsConfig signalsConfig = f32957d;
        f32959f = AbstractC2933p4.a(signalsConfig != null ? signalsConfig.getAK() : null);
        AdConfig adConfig = f32958e;
        if (adConfig == null || (contextualData = adConfig.getContextualData()) == null || (listEmptyList = contextualData.getSkipFields()) == null) {
            listEmptyList = uu.p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C2847k3.f32996j);
        arrayList.removeAll(listEmptyList);
        f32960g = uu.y0.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
        c2830j3.b();
    }

    public static final void a() {
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        kotlin.jvm.internal.e0.checkNotNull("j3");
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f32958e;
        int maxAdRecords = 0;
        long expiryTime = jCurrentTimeMillis - (((adConfig == null || (contextualData3 = adConfig.getContextualData()) == null) ? 0 : contextualData3.getExpiryTime()) * 1000);
        AdConfig adConfig2 = f32958e;
        a(expiryTime, (adConfig2 == null || (contextualData2 = adConfig2.getContextualData()) == null) ? 0 : contextualData2.getMaxAdRecords());
        Object objClone = f32955b.clone();
        kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        f32956c = (LinkedList) objClone;
        AdConfig adConfig3 = f32958e;
        if (adConfig3 != null && (contextualData = adConfig3.getContextualData()) != null) {
            maxAdRecords = contextualData.getMaxAdRecords();
        }
        kotlin.jvm.internal.e0.checkNotNull("j3");
        C2763f3 c2763f3 = (C2763f3) AbstractC2807hd.f32902d.getValue();
        c2763f3.getClass();
        c2763f3.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + maxAdRecords + ") foo);", null);
    }

    public static String c() {
        AdConfig.ContextualDataConfig contextualData;
        kotlin.jvm.internal.e0.checkNotNull("j3");
        if (f32960g.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdConfig adConfig = f32958e;
        long expiryTime = jCurrentTimeMillis - (((adConfig == null || (contextualData = adConfig.getContextualData()) == null) ? 0 : contextualData.getExpiryTime()) * 1000);
        LinkedList linkedList = f32956c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C2916o4) obj).f33178b >= expiryTime) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(sv.n0.trim(((C2916o4) it.next()).f33177a).toString());
        }
        String string = jSONArray.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static boolean d() {
        boolean z10;
        AdConfig.ContextualDataConfig contextualData;
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6 i6A = H6.a(contextD, "c_data_store");
            kotlin.jvm.internal.e0.checkNotNullParameter("isEnabled", C3191e4.h.W);
            z10 = i6A.f31866a.getBoolean("isEnabled", true);
        } else {
            z10 = true;
        }
        if (!z10) {
            kotlin.jvm.internal.e0.checkNotNull("j3");
            return false;
        }
        AdConfig adConfig = f32958e;
        boolean z11 = ((adConfig == null || (contextualData = adConfig.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        kotlin.jvm.internal.e0.checkNotNull("j3");
        return z11;
    }

    public final void b() {
        Context contextD = C2925od.d();
        if (contextD != null) {
            kotlin.jvm.internal.e0.checkNotNull("j3");
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6 i6A = H6.a(contextD, "c_data_store");
            Context contextD2 = C2925od.d();
            int akv = 1;
            if (contextD2 != null) {
                I6 i6A2 = H6.a(contextD2, "c_data_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("akv", C3191e4.h.W);
                akv = i6A2.f31866a.getInt("akv", 1);
            }
            SignalsConfig signalsConfig = f32957d;
            if (signalsConfig == null || signalsConfig.getAKV() != akv) {
                kotlin.jvm.internal.e0.checkNotNull("j3");
                SignalsConfig signalsConfig2 = f32957d;
                if (signalsConfig2 != null) {
                    akv = signalsConfig2.getAKV();
                }
                I6.a(i6A, "akv", akv, false, 4, (Object) null);
                e();
            }
        }
    }

    public final void e() {
        synchronized (this) {
            kotlin.jvm.internal.e0.checkNotNull("j3");
            C2763f3 c2763f3 = (C2763f3) AbstractC2807hd.f32902d.getValue();
            c2763f3.getClass();
            try {
                C3.a(c2763f3.f32382a, null, null);
            } catch (Exception unused) {
            }
            LinkedList linkedList = new LinkedList();
            f32955b = linkedList;
            Object objClone = linkedList.clone();
            kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            f32956c = (LinkedList) objClone;
        }
    }

    public static void a(long j10, int i10) {
        kotlin.jvm.internal.e0.checkNotNull("j3");
        for (int size = f32955b.size(); size > i10; size--) {
            f32955b.remove();
        }
        kotlin.jvm.internal.e0.checkNotNull("j3");
        Iterator it = f32955b.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
            if (((C2916o4) next).f33178b >= j10) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
