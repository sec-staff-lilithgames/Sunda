package com.bytedance.adsdk.ugeno.cm;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.cm.jj;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.adsdk.ugeno.cm.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {
    public static jj.jpo jpo(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        jj.jpo jpoVar = new jj.jpo();
        String strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(str, jSONObject);
        Uri uri = Uri.parse(strJpo);
        if (uri == null) {
            return null;
        }
        jpoVar.wqx(strJpo);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            jpoVar.jpo(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        jpoVar.jd(authority);
        jpoVar.cm(jpoVar.jpo() + "://" + jpoVar.jd());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.wqx.jd.jpo(uri.getQueryParameter(str2), jSONObject));
            }
        }
        jpoVar.jpo(map);
        return jpoVar;
    }
}
