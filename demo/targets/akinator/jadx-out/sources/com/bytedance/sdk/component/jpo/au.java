package com.bytedance.sdk.component.jpo;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class au {
    private final Map<String, Object> jpo = new ConcurrentHashMap();

    private au() {
    }

    public static au jpo() {
        return new au();
    }

    public String jd() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : this.jpo.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public au jpo(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.jpo.put(str, obj);
        }
        return this;
    }
}
