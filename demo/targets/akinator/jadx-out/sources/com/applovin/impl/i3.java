package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class i3 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f14129e = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f14130f = {com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(com.applovin.impl.sdk.k kVar) {
        return r0.a((String) kVar.a(o3.f14948h7), "1.0/mediate", kVar);
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return r0.a((String) kVar.a(o3.f14947g7), "1.0/mediate", kVar);
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            n5.a(jSONObject, kVar);
        }
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            kVar.c(x4.F);
            return;
        }
        JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f14130f);
        kVar.b(x4.F, jSONObjectShallowCopy.toString());
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject jSONObjectShallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(jSONObjectShallowCopy, f14129e);
            kVar.b(x4.E, jSONObjectShallowCopy.toString());
            n5.a(jSONObjectShallowCopy);
        }
    }

    public static void g(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers") && JsonUtils.valueExists(jSONObject, "signal_providers")) {
            try {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    hashSet.add(JsonUtils.getString(jSONArray.getJSONObject(i10), "name", null));
                }
                HashSet hashSet2 = new HashSet();
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
                Iterator it = JsonUtils.toList(jSONObject2.names()).iterator();
                while (it.hasNext()) {
                    hashSet2.addAll(JsonUtils.getList(jSONObject2, (String) it.next(), null));
                }
                if (hashSet.equals(hashSet2)) {
                    return;
                }
                Set differenceSet = CollectionUtils.getDifferenceSet(hashSet, hashSet2);
                com.applovin.impl.sdk.o.h("MediationConnectionUtils", "\"signal_providers\" contains extra network(s): " + differenceSet);
                Set differenceSet2 = CollectionUtils.getDifferenceSet(hashSet2, hashSet);
                com.applovin.impl.sdk.o.h("MediationConnectionUtils", "\"ad_unit_signal_providers\" contains extra network(s): " + differenceSet2);
                kVar.E().a(c2.M0, "signalProvidersMismatch", CollectionUtils.hashMap("details", "extraSignalProviderNetworks=" + differenceSet + ",extraAdUnitSignalProviderNetworks=" + differenceSet2));
                k1.a("Networks within \"signal_providers\" and \"ad_unit_signal_providers\" do not match.", new Object[0]);
            } catch (JSONException e10) {
                com.applovin.impl.sdk.o.c("MediationConnectionUtils", "Failed to parse JSON", e10);
                kVar.E().a("MediationConnectionUtils", "verifyBidderNetworksMatchFromJson", e10);
                k1.a((Throwable) e10, "Failed to parse JSON in verifyBidderNetworksMatchFromJson", new Object[0]);
            }
        }
    }

    public static String h(com.applovin.impl.sdk.k kVar) {
        v4 v4Var = o3.f14971s8;
        return r0.a((String) kVar.a(((Boolean) kVar.a(v4Var)).booleanValue() ? o3.f14969r8 : o3.f14948h7), ((Boolean) kVar.a(v4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", kVar);
    }

    public static String i(com.applovin.impl.sdk.k kVar) {
        v4 v4Var = o3.f14971s8;
        return r0.a((String) kVar.a(((Boolean) kVar.a(v4Var)).booleanValue() ? o3.f14967q8 : o3.f14947g7), ((Boolean) kVar.a(v4Var)).booleanValue() ? "2.0/mediate_debug" : "1.0/mediate_debug", kVar);
    }
}
