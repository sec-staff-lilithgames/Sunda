package db;

import android.text.TextUtils;
import org.json.JSONObject;
import ua.c;
import ya.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {
    public static c a(String str) {
        if (TextUtils.isEmpty(str)) {
            cb.b.b("%s : empty one dt", "OneDTParser");
            return new c("", -1L);
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data");
            if (jSONObjectOptJSONObject != null && "onedtid".equalsIgnoreCase(jSONObjectOptJSONObject.optString("propertyName", ""))) {
                return new c(jSONObjectOptJSONObject.optString("propertyValue", ""), jSONObjectOptJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e10) {
            ya.b.a(d.ONE_DT_PARSE_ERROR, e10);
            cb.b.b("%s : failed parse one dt", "OneDTParser");
        }
        return new c("", -1L);
    }
}
