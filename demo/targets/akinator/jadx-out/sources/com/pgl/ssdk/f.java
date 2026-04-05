package com.pgl.ssdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.applovin.shadow.okio.Segment;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f50467a = 28800;

    /* renamed from: b, reason: collision with root package name */
    public static int f50468b = 5;

    public static long a(long j10, InputStream inputStream) throws IOException {
        if (j10 != -1) {
            return j10;
        }
        byte[] bArr = new byte[Segment.SIZE];
        long j11 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return j11;
            }
            j11 += i10;
        }
    }

    public static long b() {
        Context contextB = z.b();
        if (contextB == null) {
            return 0L;
        }
        long jA = ax.a(contextB, "pgl_frt", 0L);
        if (jA != 0) {
            return jA;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ax.b(contextB, "pgl_frt", jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized void c() {
        if (d()) {
            String strC = v.c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            if (file.exists()) {
                JSONObject jSONObjectA = a(file, true);
                jSONObjectA.put("apk_info", v.b());
                jSONObjectA.put("app_name", ab.d(z.b()));
                PglSSManager pglSSManager = PglSSManager.getInstance();
                if (pglSSManager == null) {
                    au.a(String.valueOf(jSONObjectA));
                    return;
                }
                PglSSCallBack pglCallBack = pglSSManager.getPglCallBack();
                if (pglCallBack != null) {
                    pglCallBack.reportSoftDecData("detailed_app_info", jSONObjectA.toString());
                }
            }
        }
    }

    private static boolean d() {
        int iA = ax.a(z.b(), "pgl_is_hit", 0);
        au.a("hitsTimes " + iA);
        if (iA > 0) {
            return false;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - b();
        au.a("runningTime ".concat(String.valueOf(jCurrentTimeMillis)));
        if (jCurrentTimeMillis < f50467a) {
            return false;
        }
        ax.b(z.b(), "pgl_is_hit", 1);
        return e();
    }

    private static boolean e() {
        boolean z10 = f50468b == 100;
        return !z10 ? ((int) ((Math.random() * 100.0d) + 1.0d)) <= f50468b : z10;
    }

    public static void a(JSONObject jSONObject, String str, List<String> list, boolean z10) throws JSONException {
        if (jSONObject == null || list == null || list.isEmpty()) {
            return;
        }
        if (z10) {
            try {
                jSONObject.put(str + "_size", list.size());
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put(str, n.a(list));
    }

    private static JSONObject a(List<String> list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : list) {
            if (str.endsWith(".png")) {
                arrayList2.add(str.substring(0, str.lastIndexOf(".png")));
            } else if (str.endsWith(".xml")) {
                arrayList.add(str.substring(0, str.lastIndexOf(".xml")));
            } else {
                arrayList3.add(str);
            }
        }
        a(jSONObject, "xml", arrayList, true);
        a(jSONObject, "png", arrayList2, true);
        a(jSONObject, "other", arrayList3, true);
        return jSONObject;
    }

    public static JSONObject a() throws JSONException {
        String[] strArr;
        Context contextB = z.b();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (contextB != null) {
            ApplicationInfo applicationInfo = contextB.getApplicationInfo();
            String str = applicationInfo.nativeLibraryDir;
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        for (File file2 : fileArrListFiles) {
                            arrayList.add(file2.getName());
                        }
                    }
                    if ("arm64".equals(file.getName())) {
                        a(jSONObject2, "v8a", arrayList, false);
                    } else {
                        a(jSONObject2, "v7a", arrayList, false);
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put("lib", jSONObject2);
                    }
                }
            }
            if (arrayList.isEmpty() && (strArr = applicationInfo.splitPublicSourceDirs) != null) {
                for (String str2 : strArr) {
                    if (str2.endsWith("armeabi-v7a.apk") || str2.endsWith("arm64_v8a.apk")) {
                        File file3 = new File(str2);
                        if (file3.exists()) {
                            return a(file3, false);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:89|3)|(13:91|4|(4:7|(3:94|9|(9:96|13|(4:15|(1:17)|18|100)(1:19)|20|(4:22|(1:24)|18|100)(1:25)|26|(2:44|(2:49|(2:54|(1:58))(1:53))(1:48))(2:30|(2:36|(2:41|(1:43))(1:40)))|18|100)(1:99))(1:98)|97|5)|93|59|(1:61)|(1:65)|66|(1:68)|69|(1:73)|74|(1:78))|87|83|84|(1:(0))) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(java.io.File r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.f.a(java.io.File, boolean):org.json.JSONObject");
    }
}
