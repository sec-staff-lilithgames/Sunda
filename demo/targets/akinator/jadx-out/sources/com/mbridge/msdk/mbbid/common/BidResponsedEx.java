package com.mbridge.msdk.mbbid.common;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BidResponsedEx extends BidResponsed {
    public static final String KEY_CID = "cid";
    public static final String KEY_MACORS = "macors";
    public static final String TAG = "BidResponsedEx";
    private String cid;

    public static BidResponsedEx parseBidResponsedEx(JSONObject jSONObject, String str) {
        BidResponsedEx bidResponsedEx;
        BidResponsedEx bidResponsedEx2 = null;
        if (jSONObject != null) {
            try {
                bidResponsedEx = new BidResponsedEx();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                bidResponsedEx.setBidId(jSONObject.optString("bid"));
                bidResponsedEx.setCur(jSONObject.optString(BidResponsed.KEY_CUR));
                bidResponsedEx.setPrice(jSONObject.optString("price"));
                bidResponsedEx.setCid(jSONObject.optString(KEY_CID));
                bidResponsedEx.setBidToken(jSONObject.optString("token"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_MACORS);
                String strOptString = jSONObject.optString(BidResponsed.KEY_LN);
                String strOptString2 = jSONObject.optString(BidResponsed.KEY_WN);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = jSONObjectOptJSONObject.getString(next);
                        strOptString = replaceUrl(strOptString, next, string);
                        strOptString2 = replaceUrl(strOptString2, next, string);
                    }
                }
                bidResponsedEx.setLn(strOptString);
                bidResponsedEx.setWn(strOptString2);
                return bidResponsedEx;
            } catch (Throwable th3) {
                th = th3;
                bidResponsedEx2 = bidResponsedEx;
                p0.b(TAG, th.getMessage());
                return bidResponsedEx2;
            }
        }
        return bidResponsedEx2;
    }

    private static String replaceUrl(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return str.replaceAll("\\{" + str2 + "\\}", str3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setLn(String str) {
        this.f41608ln = str;
    }

    public void setWn(String str) {
        this.f41609wn = str;
    }

    public static String decodePrice(String str) {
        return str;
    }
}
