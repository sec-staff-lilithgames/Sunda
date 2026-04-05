package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene jpo;

    public hmu(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.jpo = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i10) {
        nq.jpo(1, this.jpo, i10);
        return com.bytedance.sdk.component.utils.jpo.jpo(jSONObject);
    }
}
