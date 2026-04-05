package sn;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.media3.common.util.a1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {
    public static byte[] adjustRequestData(byte[] bArr) {
        return a1.f60679a >= 27 ? bArr : a1.getUtf8Bytes(a1.fromUtf8Bytes(bArr).replace('+', '-').replace('/', '_'));
    }

    public static byte[] adjustResponseData(byte[] bArr) throws JSONException {
        if (a1.f60679a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(a1.fromUtf8Bytes(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(jSONObject2.getString(CampaignEx.JSON_KEY_AD_K).replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kid\":\"");
                sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return a1.getUtf8Bytes(sb2.toString());
        } catch (JSONException e10) {
            io.bidmachine.media3.common.util.b0.e("ClearKeyUtil", "Failed to adjust response data: " + a1.fromUtf8Bytes(bArr), e10);
            return bArr;
        }
    }
}
