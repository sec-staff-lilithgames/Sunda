package com.bytedance.sdk.openadsdk.xyk;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.nzb;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class cm extends jpo {
    public static wqx jpo;

    public static String jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, String str) {
        wqx wqxVarJpo;
        Map map;
        if (!nzb.wqx() || (wqxVarJpo = jd.jpo("net")) == null || (map = (Map) wqxVarJpo.jpo(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                wqxVar.jd(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
