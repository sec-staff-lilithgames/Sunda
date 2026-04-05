package com.bytedance.sdk.openadsdk.yd;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.jr.jpo.jpo.jj;
import com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements wqx {

    /* renamed from: jd, reason: collision with root package name */
    private final jd f21664jd;
    private final dt jpo;
    private final Map<String, jj> wqx = new HashMap();

    private jpo(jd jdVar, dt dtVar) {
        this.f21664jd = jdVar;
        this.jpo = dtVar;
    }

    public static jpo jpo(jd jdVar, dt dtVar) {
        return new jpo(jdVar, dtVar);
    }

    @Override // com.bytedance.sdk.openadsdk.yd.wqx
    public void jpo() {
        this.wqx.clear();
    }

    private dt jpo(JSONObject jSONObject, String str) throws JSONException {
        String strJpo;
        if (jSONObject == null) {
            return null;
        }
        dt dtVar = new dt();
        dtVar.my(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            dtVar.se(str);
        }
        if (this.jpo != null) {
            String strJpo2 = dtVar.xur() != null ? dtVar.xur().jpo() : null;
            if (TextUtils.isEmpty(strJpo2)) {
                return this.jpo;
            }
            com.bytedance.sdk.openadsdk.core.model.jj jjVarXur = this.jpo.xur();
            if (jjVarXur != null && strJpo2.equals(jjVarXur.jpo())) {
                return this.jpo;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (jjVarXur != null) {
                try {
                    strJpo = jjVarXur.jpo();
                } catch (JSONException unused) {
                }
            } else {
                strJpo = AbstractJsonLexerKt.NULL;
            }
            jSONObject2.put("lu", strJpo);
            jSONObject2.put("ju", strJpo2);
            dt dtVar2 = this.jpo;
            com.bytedance.sdk.openadsdk.core.cm.jpo(dtVar2, tic.jpo(dtVar2), -5, jSONObject2);
            if (jjVarXur != null && strJpo2.contains("play.google.com/store") && !strJpo2.contains("referrer")) {
                dtVar.xur().jpo(jjVarXur.jpo());
            }
        }
        return dtVar;
    }

    @Override // com.bytedance.sdk.openadsdk.yd.wqx
    public void jpo(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        jpo(context, jpo(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i10, z10);
    }

    private void jpo(Context context, dt dtVar, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || dtVar == null || dtVar.xur() == null || jSONObject == null || this.f21664jd == null || this.wqx.get(dtVar.xur().jpo()) != null) {
            return;
        }
        String strJd = tic.jd(i10);
        if (TextUtils.isEmpty(strJd)) {
            return;
        }
        this.wqx.put(dtVar.xur().jpo(), jpo(context, strJd));
    }

    @Override // com.bytedance.sdk.openadsdk.yd.wqx
    public void jpo(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.jpo == null) {
            return;
        }
        qk.jpo(context, str).wqx(this.jpo);
    }

    @Override // com.bytedance.sdk.openadsdk.yd.wqx
    public void jpo(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) {
            return;
        }
        jpo(jpo(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void jpo(dt dtVar, JSONObject jSONObject) throws JSONException {
        if (this.f21664jd == null || dtVar == null || dtVar.xur() == null) {
            return;
        }
        String strJpo = dtVar.xur().jpo();
        if (this.wqx.containsKey(strJpo)) {
            this.wqx.remove(strJpo);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put("status", "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f21664jd.jpo("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                nmd.wqx("JsAppAdDownloadManager", e10.getMessage());
            }
        }
    }

    private jj jpo(Context context, String str) {
        jj jjVarJpo = qk.jpo(context, str);
        jjVarJpo.jpo(true);
        return jjVarJpo;
    }
}
