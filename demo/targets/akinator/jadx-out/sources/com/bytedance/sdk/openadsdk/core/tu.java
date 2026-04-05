package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.dt;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface tu<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jpo(int i10, String str);

        void jpo(dt.jd jdVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(int i10, String str);

        void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar);
    }

    com.bytedance.sdk.openadsdk.cm.my jd(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpo();

    com.bytedance.sdk.openadsdk.cm.my jpo(JSONObject jSONObject, String str, boolean z10);

    JSONObject jpo(JSONObject jSONObject);

    void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar, int i10, nmd nmdVar);

    void jpo(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hx hxVar, int i10, jpo jpoVar);

    void jpo(String str);

    void jpo(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void jpo(JSONObject jSONObject, jd jdVar);

    void jpo(JSONObject jSONObject, String str);
}
