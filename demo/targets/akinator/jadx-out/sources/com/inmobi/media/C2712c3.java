package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2712c3 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32701e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Z9 f32702a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f32703b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f32704c;

    /* renamed from: d, reason: collision with root package name */
    public final T2 f32705d;

    public C2712c3(W2 networkRequest, Z9 mNetworkResponse) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkRequest, "networkRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(mNetworkResponse, "mNetworkResponse");
        this.f32702a = mNetworkResponse;
        TreeMap treeMap = new TreeMap(networkRequest.f32429y);
        this.f32703b = treeMap;
        this.f32704c = new LinkedHashMap();
        S9 s92 = mNetworkResponse.f32602d;
        tu.x0 x0Var = null;
        if (s92 != null) {
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "<get-value>(...)");
                Y2 y22 = new Y2(null, (Config) value);
                y22.f32534c = new T2((byte) 0, "Network error in fetching config.");
                LinkedHashMap linkedHashMap = this.f32704c;
                Object key = entry.getKey();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(key, "<get-key>(...)");
                linkedHashMap.put(key, y22);
            }
            this.f32705d = new T2((byte) 0, s92.f32267b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("c3", "TAG");
            tu.v vVarA = X2.a(this.f32703b);
            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(s92.f32266a.f33444a)), tu.e0.to("name", (List) vVarA.component1()), tu.e0.to("lts", (List) vVarA.component2()), tu.e0.to("networkType", R3.x()));
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b("InvalidConfig", mapMutableMapOf, EnumC2993se.f33373a);
            x0Var = tu.x0.f87415a;
        }
        if (x0Var == null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f32702a.a());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    Config config = (Config) this.f32703b.get(next);
                    if (config != null) {
                        kotlin.jvm.internal.e0.checkNotNull(config);
                        Y2 y23 = new Y2(jSONObject2, config);
                        LinkedHashMap linkedHashMap2 = this.f32704c;
                        kotlin.jvm.internal.e0.checkNotNull(next);
                        linkedHashMap2.put(next, y23);
                    }
                }
                tu.v vVarA2 = X2.a(this.f32703b);
                Map mapMutableMapOf2 = uu.p1.mutableMapOf(tu.e0.to("name", (List) vVarA2.component1()), tu.e0.to("lts", (List) vVarA2.component2()));
                C2926oe c2926oe2 = C2926oe.f33217a;
                C2926oe.b("ConfigFetched", mapMutableMapOf2, EnumC2993se.f33373a);
            } catch (JSONException e10) {
                String localizedMessage = e10.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Exception while parsing config";
                } else {
                    kotlin.jvm.internal.e0.checkNotNull(localizedMessage);
                }
                this.f32705d = new T2((byte) 2, localizedMessage);
                tu.v vVarA3 = X2.a(this.f32703b);
                Map mapMutableMapOf3 = uu.p1.mutableMapOf(tu.e0.to(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1), tu.e0.to("name", (List) vVarA3.component1()), tu.e0.to("lts", (List) vVarA3.component2()), tu.e0.to("networkType", R3.x()));
                C2926oe c2926oe3 = C2926oe.f33217a;
                C2926oe.b("InvalidConfig", mapMutableMapOf3, EnumC2993se.f33373a);
            }
        }
    }

    public final boolean a() {
        EnumC3017u4 enumC3017u4;
        S9 s92 = this.f32702a.f32602d;
        if ((s92 != null ? s92.f32266a : null) == EnumC3017u4.f33426i) {
            return true;
        }
        if (s92 == null || (enumC3017u4 = s92.f32266a) == null) {
            enumC3017u4 = EnumC3017u4.f33422e;
        }
        int i10 = enumC3017u4.f33444a;
        return 500 <= i10 && i10 < 600;
    }
}
