package com.mbridge.msdk.advanced.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f39603a = "NativeAdvancedJsUtils";

    public static void a(Object obj, JSONObject jSONObject) throws JSONException {
        String str;
        JSONArray jSONArray;
        int i10;
        boolean z10;
        String str2;
        File file;
        String str3 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                p0.a(f39603a, e10.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
                JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
                if (jSONArray2 == null || jSONArray2.length() <= 0) {
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                        f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e11) {
                        p0.a(f39603a, e11.getMessage());
                        return;
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                int length = jSONArray2.length();
                int i12 = 0;
                while (i12 < length) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String strOptString = jSONObject3.optString("ref", str3);
                    int i13 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i13 != i11 || TextUtils.isEmpty(strOptString)) {
                        str = str3;
                        jSONArray = jSONArray2;
                        i10 = length;
                        z10 = false;
                        if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                            jSONObject4.put(strOptString, jSONObject5);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                            try {
                                file = new File(strOptString);
                            } catch (Throwable th2) {
                                p0.b(f39603a, th2.getMessage());
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                p0.a(f39603a, "getFileInfo Mraid file " + strOptString);
                                str2 = "file:////" + strOptString;
                            } else {
                                str2 = str;
                            }
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("type", 3);
                            jSONObject6.put("path", str2);
                            jSONObject4.put(strOptString, jSONObject6);
                            jSONArray3.put(jSONObject4);
                        } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put("path", t0.a(strOptString) == null ? str : t0.a(strOptString));
                            jSONObject4.put(strOptString, jSONObject7);
                            jSONArray3.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(c.m().d())).b(strOptString);
                        if (mVarB != null) {
                            jSONArray = jSONArray2;
                            p0.a(f39603a, "VideoBean not null");
                            jSONObject8.put("type", 1);
                            jSONObject8.put("videoDataLength", mVarB.d());
                            String strE = mVarB.e();
                            if (TextUtils.isEmpty(strE)) {
                                i10 = length;
                                p0.a(f39603a, "VideoPath null");
                                jSONObject8.put("path", str3);
                                jSONObject8.put("path4Web", str3);
                                str = str3;
                            } else {
                                i10 = length;
                                str = str3;
                                p0.a(f39603a, "VideoPath not null");
                                jSONObject8.put("path", strE);
                                jSONObject8.put("path4Web", strE);
                            }
                            if (mVarB.b() == 5) {
                                jSONObject8.put("downloaded", 1);
                                z10 = false;
                            } else {
                                z10 = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(strOptString, jSONObject8);
                            jSONArray3.put(jSONObject4);
                        } else {
                            str = str3;
                            jSONArray = jSONArray2;
                            i10 = length;
                            z10 = false;
                            p0.a(f39603a, "VideoBean null");
                        }
                    }
                    i12++;
                    jSONArray2 = jSONArray;
                    length = i10;
                    str3 = str;
                    i11 = 1;
                }
                jSONObject2.put("resource", jSONArray3);
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (Throwable th3) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e12) {
            p0.a(f39603a, e12.getMessage());
            return;
        }
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView, String str, String str2, Object obj) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sq", 1);
            jSONObject.put("action", str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            f.a().a(webView, "thirdPartyCalled", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e10) {
            p0.b(f39603a, e10.getMessage());
        }
    }

    public static void a(WebView webView) {
        p0.b(f39603a, "fireOnJSBridgeConnected");
        f.a().a(webView);
    }

    public static void a(Object obj) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", d.f41879b);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            p0.a(f39603a, e10.getMessage());
        }
    }
}
