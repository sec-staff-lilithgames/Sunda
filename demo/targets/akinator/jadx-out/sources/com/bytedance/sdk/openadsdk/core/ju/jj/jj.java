package com.bytedance.sdk.openadsdk.core.ju.jj;

import android.content.Context;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.opi;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj {
    private final String jpo = "UGenV3OpenLinks";

    /* renamed from: jd, reason: collision with root package name */
    private final String f20517jd = "landingStyle";
    private final String wqx = "url";

    /* renamed from: cm, reason: collision with root package name */
    private final String f20516cm = "fallbackUrl";

    public void jpo(Context context, boolean z10, dt dtVar, String str, Map<String, String> map, com.bytedance.sdk.openadsdk.core.widget.my myVar) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            if (jpo(Integer.parseInt(map.get("landingStyle")), map.get("url"), map.get("fallbackUrl"))) {
                opi.jpo(context, z10, jpo(map), dtVar, str, tic.jpo(str), null, myVar);
            }
        } catch (Throwable th2) {
            nmd.wqx("UGenV3OpenLinks", th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean jpo(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L1f
            r2 = 2
            if (r4 == r2) goto Lb
            r6 = 3
            if (r4 == r6) goto L1f
            goto L26
        Lb:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 == 0) goto L18
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 == 0) goto L18
            return r0
        L18:
            boolean r4 = com.bytedance.sdk.component.utils.opi.jpo(r6)
            if (r4 != 0) goto L26
            return r0
        L1f:
            boolean r4 = com.bytedance.sdk.component.utils.opi.jpo(r5)
            if (r4 != 0) goto L26
            return r0
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ju.jj.jj.jpo(int, java.lang.String, java.lang.String):boolean");
    }

    private JSONObject jpo(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }
}
