package io.odeeo.internal.f;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.odeeo.internal.q0.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {
    public static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return g0.f65861a >= 27 ? bArr : g0.getUtf8Bytes(a(g0.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) throws JSONException {
        if (g0.f65861a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(g0.fromUtf8Bytes(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(b(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K)));
                sb2.append("\",\"kid\":\"");
                sb2.append(b(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return g0.getUtf8Bytes(sb2.toString());
        } catch (JSONException e10) {
            io.odeeo.internal.q0.p.e("ClearKeyUtil", "Failed to adjust response data: " + g0.fromUtf8Bytes(bArr), e10);
            return bArr;
        }
    }

    public static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
