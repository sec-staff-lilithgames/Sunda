package com.inmobi.media;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.ironsource.C3271ic;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W2 extends X9 {
    public final int A;
    public final String B;
    public final boolean C;

    /* renamed from: y, reason: collision with root package name */
    public final Map f32429y;

    /* renamed from: z, reason: collision with root package name */
    public final int f32430z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(Map requestedConfigMap, Te uidMap, String url, int i10, int i11, boolean z10, String accountId, boolean z11) {
        super(C3271ic.f36944b, (requestedConfigMap.get("root") != null || sv.n0.trim(url).toString().length() == 0) ? RootConfig.DEFAULT_FALLBACK_URL : url, uidMap, z10, (F5) null, "application/x-www-form-urlencoded", 64);
        kotlin.jvm.internal.e0.checkNotNullParameter(requestedConfigMap, "requestedConfigMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(uidMap, "uidMap");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(accountId, "accountId");
        this.f32429y = requestedConfigMap;
        this.f32430z = i10;
        this.A = i11;
        this.B = accountId;
        this.C = z11;
    }

    @Override // com.inmobi.media.X9
    public final void f() throws JSONException {
        String string;
        this.f32512u = false;
        super.f();
        HashMap map = this.f32502k;
        if (map != null) {
            S2 s22 = new S2();
            try {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry entry : this.f32429y.entrySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", entry.getKey());
                    jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, s22.a((String) entry.getKey(), ((Config) entry.getValue()).getAccountId$media_release()));
                    jSONArray.put(jSONObject);
                }
                string = jSONArray.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            } catch (JSONException unused) {
                string = "";
            }
        }
        HashMap map2 = this.f32502k;
        if (map2 != null) {
        }
        if (this.C) {
            this.f32500i.put("rip", QpyI.HMxINfqDKeLP);
        }
    }
}
