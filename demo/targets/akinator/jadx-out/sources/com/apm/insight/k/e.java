package com.apm.insight.k;

import android.text.TextUtils;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.apm.insight.b.h;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.ironsource.C3271ic;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13117a = false;

    /* renamed from: b, reason: collision with root package name */
    private static h.a f13118b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private int f13122d;

        /* renamed from: c, reason: collision with root package name */
        private static a f13121c = new a("NONE", 0, 0);

        /* renamed from: a, reason: collision with root package name */
        public static final a f13119a = new a("GZIP", 1, 1);

        /* renamed from: b, reason: collision with root package name */
        public static final a f13120b = new a("DEFLATER", 2, 2);

        private a(String str, int i10, int i11) {
            this.f13122d = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* renamed from: l, reason: collision with root package name */
        private int f13135l;

        b(int i10) {
            this.f13135l = i10;
        }
    }

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return false;
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str.concat("?");
                }
            } else if (!str.endsWith(C3191e4.i.f36527c)) {
                str = str.concat(C3191e4.i.f36527c);
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static String d() {
        return com.apm.insight.e.i().getAlogUploadUrl();
    }

    public static String e() {
        return com.apm.insight.e.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.e.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.e.i().getNativeCrashUploadUrl();
    }

    private static com.apm.insight.l.f a(String str, byte[] bArr, a aVar, String str2) throws IOException {
        String str3;
        if (Npth.isStopUpload()) {
            return new com.apm.insight.l.f(201);
        }
        if (str == null) {
            return new com.apm.insight.l.f(201);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        int length = bArr.length;
        if (a.f13119a == aVar && length > 128) {
            bArr = a(bArr);
            str3 = "gzip";
        } else if (a.f13120b != aVar || length <= 128) {
            str3 = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Segment.SIZE);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr2 = new byte[Segment.SIZE];
            while (!deflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
            }
            deflater.end();
            bArr = byteArrayOutputStream.toByteArray();
            str3 = "deflate";
        }
        return bArr == null ? new com.apm.insight.l.f(202) : a(str, bArr, str2, str3, C3271ic.f36944b);
    }

    public static com.apm.insight.l.f b(String str, String str2) {
        return d(str, str2);
    }

    private static com.apm.insight.l.f d(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(str, str2.getBytes(), a.f13119a, "application/json; charset=utf-8");
            }
            return new com.apm.insight.l.f(201);
        } catch (Throwable th2) {
            com.apm.insight.a.b(th2);
            return new com.apm.insight.l.f(207, th2);
        }
    }

    private static com.apm.insight.l.f b(String str, String str2, File... fileArr) throws Throwable {
        if (Npth.isStopUpload()) {
            return new com.apm.insight.l.f(201);
        }
        try {
            i iVar = new i(c(str, "have_dump=true"), C.UTF8_NAME, true);
            iVar.b("json", str2);
            iVar.a(C3191e4.h.f36473b, fileArr);
            try {
                return new com.apm.insight.l.f(new JSONObject(iVar.a()));
            } catch (JSONException e10) {
                return new com.apm.insight.l.f(0, e10);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return new com.apm.insight.l.f(207);
        }
    }

    public static String c() {
        return com.apm.insight.e.i().getJavaCrashUploadUrl();
    }

    private static byte[] a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Segment.SIZE);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            try {
                com.apm.insight.a.b(th2);
                gZIPOutputStream.close();
                return null;
            } catch (Throwable th3) {
                gZIPOutputStream.close();
                throw th3;
            }
        }
    }

    public static void a(h.a aVar) {
        f13118b = aVar;
    }

    private static com.apm.insight.l.f a(String str, byte[] bArr, String str2, String str3, String str4) {
        InputStream inputStream;
        byte[] bArrA;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            h.a aVar = f13118b;
            if (aVar != null) {
                try {
                    str = aVar.c();
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
                if (customRequestHeader != null) {
                    customRequestHeader.addRequestHeader(httpURLConnection2);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.a.a((Closeable) dataOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            com.apm.insight.a.a((Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    try {
                        if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                                try {
                                    bArrA = a(gZIPInputStream2);
                                    com.apm.insight.a.a((Closeable) gZIPInputStream2);
                                } catch (Throwable th4) {
                                    th = th4;
                                    gZIPInputStream = gZIPInputStream2;
                                    com.apm.insight.a.a((Closeable) gZIPInputStream);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            bArrA = a(inputStream2);
                        }
                        com.apm.insight.l.f fVar = new com.apm.insight.l.f(bArrA);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                        com.apm.insight.a.a((Closeable) inputStream2);
                        return fVar;
                    } catch (Throwable th6) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = inputStream2;
                        th = th6;
                        try {
                            com.apm.insight.a.a(th);
                            return new com.apm.insight.l.f(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused3) {
                                }
                            }
                            com.apm.insight.a.a((Closeable) inputStream);
                        }
                    }
                }
                com.apm.insight.l.f fVar2 = new com.apm.insight.l.f("http response code ".concat(String.valueOf(responseCode)));
                try {
                    httpURLConnection2.disconnect();
                } catch (Exception unused4) {
                }
                com.apm.insight.a.a((Closeable) null);
                return fVar2;
            } catch (Throwable th7) {
                th = th7;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    public static com.apm.insight.l.f a(String str, String str2) {
        return d(str, str2);
    }

    public static com.apm.insight.l.f a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            i iVar = new i(str, C.UTF8_NAME, false);
            iVar.a("aid", str2);
            iVar.a("device_id", str3);
            iVar.a("os", "Android");
            iVar.a("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map = new HashMap();
                    map.put("logtype", "alog");
                    map.put("scene", "Crash");
                    iVar.a(file.getName(), file, map);
                }
            }
            return new JSONObject(iVar.a()).optInt("errno", -1) == 200;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 != i10) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.a.a((Closeable) byteArrayOutputStream);
                }
            }
        }
    }

    public static byte[] a(String str, byte[] bArr) {
        try {
            TextUtils.isDigitsOnly(str);
            return a(str, bArr, a.f13119a, "application/json; charset=utf-8").b();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
