package com.bytedance.sdk.component.utils;

import a.b;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.utils.jpo$jpo, reason: collision with other inner class name */
    public static class C0093jpo {
        static final Random jpo = jpo.wqx();
    }

    public static String jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strJpo = jpo();
        String strJpo2 = jpo(strJpo, 32);
        String strJd = jd();
        return b.m("3", strJpo, strJd, (strJpo2 == null || strJd == null) ? null : com.bytedance.sdk.component.cm.jpo.jpo(str, strJd, strJpo2));
    }

    public static JSONObject jpo(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : jpo(jSONObject.toString());
    }

    public static String wqx(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strJpo = jpo(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strJpo == null) ? str : com.bytedance.sdk.component.cm.jpo.jd(str.substring(49), strSubstring, strJpo);
    }

    public static JSONObject jpo(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strJd = jd(str);
                    if (!TextUtils.isEmpty(strJd)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strJd);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        }
        return jSONObject;
    }

    public static Random wqx() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String jd() {
        String strJpo = jpo(8);
        if (strJpo == null || strJpo.length() != 16) {
            return null;
        }
        return strJpo;
    }

    public static String jpo() {
        String strJpo = jpo(16);
        if (strJpo == null || strJpo.length() != 32) {
            return null;
        }
        return strJpo;
    }

    public static String jpo(String str, int i10) {
        if (str == null || str.length() != i10) {
            return null;
        }
        int i11 = i10 / 2;
        return str.substring(i11, i10) + str.substring(0, i11);
    }

    public static String jpo(int i10) {
        try {
            byte[] bArr = new byte[i10];
            C0093jpo.jpo.nextBytes(bArr);
            return my.jpo(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
