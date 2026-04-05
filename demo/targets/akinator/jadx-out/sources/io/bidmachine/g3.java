package io.bidmachine;

import android.content.res.AssetManager;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f60365a = new ConcurrentHashMap();

    public static h3 a(AssetManager assetManager, String str) {
        String strStreamToString;
        h3 h3Var = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    strStreamToString = nm.j.streamToString(assetManager.open("bm_networks/" + str));
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    strStreamToString = null;
                }
                if (!TextUtils.isEmpty(strStreamToString)) {
                    JSONObject jSONObject = new JSONObject(strStreamToString);
                    String strOptString = jSONObject.optString("name");
                    String strOptString2 = jSONObject.optString("version");
                    String strOptString3 = jSONObject.optString("classpath");
                    String strOptString4 = jSONObject.optString("sdk_version");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                        h3Var = new h3(strOptString, strOptString2, strOptString3, strOptString4);
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (h3Var != null) {
            f60365a.put(h3Var.getName(), h3Var);
        }
        return h3Var;
    }
}
