package com.bytedance.adsdk.ugeno.wqx;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.my;
import com.bytedance.adsdk.ugeno.wqx.jpo;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static String jpo(String str, JSONObject jSONObject) {
        jpo jpoVarWqx;
        jpo.InterfaceC0067jpo interfaceC0067jpoJpo;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (jpoVarWqx = my.jpo().wqx()) != null && (interfaceC0067jpoJpo = jpoVarWqx.jpo(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0067jpoJpo.jpo(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
