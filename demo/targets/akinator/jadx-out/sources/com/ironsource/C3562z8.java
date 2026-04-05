package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3562z8 implements J7 {
    @Override // com.ironsource.J7
    public String a(Map<String, Object> map) {
        try {
            return "data=" + Base64.encodeToString(new JSONObject().put(G5.Q, G5.R).put("data", new JSONObject(map)).toString().getBytes(), 2);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }
}
