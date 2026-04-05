package com.inmobi.media;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class R9 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32214a = 0;

    static {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("R9", "getSimpleName(...)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.media.Sc a(com.inmobi.media.Oc r10, kv.p r11) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.R9.a(com.inmobi.media.Oc, kv.p):com.inmobi.media.Sc");
    }

    public static HttpURLConnection a(Oc oc2, String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        kotlin.jvm.internal.e0.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setConnectTimeout(oc2.f32108i);
        httpURLConnection.setReadTimeout(oc2.f32109j);
        httpURLConnection.setUseCaches(false);
        HashMap map = oc2.f32102c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnection.setRequestMethod(oc2.f32101b.name());
        if (Lc.f32009a != oc2.f32101b) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    public static void a(String str, HttpURLConnection httpURLConnection, boolean z10) throws IOException {
        OutputStream bufferedOutputStream;
        OutputStream outputStream = null;
        try {
            if (z10) {
                bufferedOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream(), 4096);
            } else {
                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            }
            outputStream = bufferedOutputStream;
            byte[] bytes = str.getBytes(sv.g.f86134b);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            outputStream.flush();
            C2736da.a(outputStream);
        } catch (Throwable th2) {
            C2736da.a(outputStream);
            throw th2;
        }
    }

    public static Sc a(Oc oc2, HttpURLConnection httpURLConnection) throws IOException {
        EnumC3017u4 enumC3017u4;
        JSONObject jSONObject;
        Sc sc2 = new Sc();
        int responseCode = httpURLConnection.getResponseCode();
        sc2.f32275d = Integer.valueOf(responseCode);
        sc2.f32273b = httpURLConnection.getHeaderFields();
        sc2.f32276e = httpURLConnection.getContentLength();
        if (oc2.f32110k) {
            return sc2;
        }
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
            a(sc2, inputStream);
            return sc2;
        }
        EnumC3017u4.f33419b.getClass();
        if (400 <= responseCode && 500 > responseCode) {
            enumC3017u4 = EnumC3017u4.f33426i;
        } else if (200 < responseCode && 300 > responseCode) {
            enumC3017u4 = EnumC3017u4.f33428k;
        } else {
            enumC3017u4 = (EnumC3017u4) EnumC3017u4.f33420c.get(responseCode);
            if (enumC3017u4 == null) {
                enumC3017u4 = EnumC3017u4.f33422e;
            }
        }
        if (enumC3017u4 == EnumC3017u4.f33426i) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(errorStream, "getErrorStream(...)");
            a(sc2, errorStream);
            try {
                jSONObject = new JSONObject(T9.a(sc2.f32274c));
            } catch (JSONException unused) {
            }
            String string = jSONObject.has("errorMessage") ? jSONObject.getString("errorMessage") : null;
            sc2.f32272a = new S9(enumC3017u4, string);
            return sc2;
        }
        sc2.f32272a = new S9(enumC3017u4, a.b.e(responseCode, "HTTP:"));
        return sc2;
    }

    public static void a(Sc sc2, InputStream inputStream) throws IOException {
        byte[] bArrA = C2736da.a(inputStream);
        C2736da.a((Closeable) inputStream);
        if (bArrA != null) {
            if (!(bArrA.length == 0)) {
                kotlin.jvm.internal.e0.checkNotNullParameter(sc2, "<this>");
                Map map = sc2.f32273b;
                List list = map != null ? (List) map.get("Content-Encoding") : null;
                if (kotlin.jvm.internal.e0.areEqual(list != null ? (String) list.get(0) : null, "gzip") && (bArrA = C2736da.a(bArrA)) == null) {
                    sc2.f32272a = new S9(EnumC3017u4.f33425h, "Failed to uncompress gzip response");
                }
                if (bArrA != null) {
                    sc2.f32274c = bArrA;
                }
            }
        }
    }
}
