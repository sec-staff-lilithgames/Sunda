package com.bytedance.sdk.openadsdk.core.yd;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.my;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.ironsource.Hc;
import com.ironsource.Y1;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {
    private static boolean jpo;

    public static long cm() {
        if (sq.cm().vrc()) {
            return jd.jd().jj();
        }
        return 0L;
    }

    public static void jd(String str) {
        if (TextUtils.isEmpty(str) || !sq.cm().vrc()) {
            return;
        }
        jd.jd().jd(str);
    }

    public static String jj() {
        if (sq.cm().vrc()) {
            return jd.jd().cm();
        }
        return null;
    }

    public static void jpo() {
        if (!jpo && sq.cm().vrc()) {
            jd.jd();
            jpo = jd.jd().wqx();
        }
    }

    public static int my() {
        if (sq.cm().vrc()) {
            return jd.jd().qk();
        }
        return 6;
    }

    public static String wqx() {
        return sq.cm().vrc() ? jd.jd().my() : "";
    }

    public static void jd() {
        if (sq.cm().vrc()) {
            jd.jd().jpo();
        }
    }

    public static void jpo(String str) {
        if (sq.cm().vrc()) {
            jd.jd().jpo(str);
        }
    }

    public static void jpo(dt dtVar, String str) {
        long jOptLong;
        long jOptLong2;
        long jOptLong3;
        Object obj;
        if (sq.cm().vrc()) {
            HashMap map = new HashMap();
            map.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            map.put("au_show", str);
            if (dtVar != null) {
                String strHbg = dtVar.hbg();
                boolean zIsEmpty = TextUtils.isEmpty(strHbg);
                String strOptString = Y1.f35726f;
                if (!zIsEmpty) {
                    map.put("request_id", strHbg);
                } else {
                    map.put("request_id", Y1.f35726f);
                }
                try {
                    JSONObject jSONObjectEb = dtVar.eb();
                    String str2 = KerkSviMAy.seoneBDOVYOYurG;
                    long j10 = -1;
                    if (jSONObjectEb != null) {
                        jOptLong = dtVar.eb().optLong("ad_id", -1L);
                        jOptLong2 = dtVar.eb().optLong("rit", -1L);
                        jOptLong3 = dtVar.eb().optLong(str2, -1L);
                        strOptString = dtVar.eb().optString("ad_type", Y1.f35726f);
                    } else {
                        jOptLong = -1;
                        jOptLong2 = -1;
                        jOptLong3 = -1;
                    }
                    map.put("ad_id", Long.valueOf(jOptLong));
                    map.put("rit", Long.valueOf(jOptLong2));
                    map.put(str2, Long.valueOf(jOptLong3));
                    map.put("ad_type", strOptString);
                    Map<String, Object> mapGy = dtVar.gy();
                    if (mapGy != null && (obj = mapGy.get(TTAdConstant.SDK_BIDDING_TYPE)) != null) {
                        j10 = Long.parseLong(obj.toString());
                    }
                    map.put(TTAdConstant.SDK_BIDDING_TYPE, Long.valueOf(j10));
                    jd.jd().jpo(PglSSManager.REPORT_SCENE_ADSHOW, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static Map<String, String> jpo(String str, String str2) {
        if (sq.cm().vrc()) {
            return jd.jd().jpo(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void jpo(MotionEvent motionEvent) {
        if (sq.cm().vrc()) {
            jd.jd().jpo(motionEvent);
        }
    }

    public static void jpo(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        try {
            if (sq.cm().vrc()) {
                jpo();
                if (my() == 0) {
                    jSONObject.put("sec_did", jd.jd().cm());
                    String strJpo = my.jpo(jSONObject.toString());
                    Map<String, String> mapJpo = jd.jd().jpo("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", strJpo != null ? strJpo.getBytes() : new byte[0]);
                    if (mapJpo != null && mapJpo.size() > 0) {
                        for (String str : mapJpo.keySet()) {
                            jSONObject.put(str, mapJpo.get(str));
                        }
                        jSONObject.put("url", "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                        jSONObject.put("pangle_m", strJpo);
                    } else {
                        jSONObject.put("pglx", "8");
                    }
                    jSONObject.put("ec", jd.jd().jj());
                    return;
                }
                jSONObject.put("pglx", String.valueOf(my()));
                return;
            }
            jSONObject.put("pglx", "6");
        } catch (Throwable th2) {
            nmd.wqx("SecSdkHelperUtil", th2.getMessage());
            try {
                jSONObject.put("pglx", Hc.f34588e);
            } catch (JSONException unused) {
            }
        }
    }
}
