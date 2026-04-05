package wj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.C3271ic;
import com.ironsource.G5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.ktor.client.utils.CacheControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import wj.f;
import wj.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f90663d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f90664e = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Context f90665a;

    /* renamed from: b, reason: collision with root package name */
    public final sj.c f90666b;

    /* renamed from: c, reason: collision with root package name */
    public final h f90667c = new h();

    public e(Context context, sj.c cVar) {
        this.f90665a = context;
        this.f90666b = cVar;
    }

    public static URL a(String str) throws tj.h {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e10) {
            throw new tj.h(e10.getMessage(), tj.g.f86943c);
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f90664e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", e3.g.l("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : a.b.k(", ", str)));
    }

    public static long d(String str) {
        Preconditions.checkArgument(f90663d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static f e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f90664e));
        i.a aVarBuilder = i.builder();
        f.a aVarBuilder2 = f.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarBuilder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarBuilder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarBuilder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarBuilder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarBuilder.setTokenExpirationTimestamp(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarBuilder2.setAuthToken(aVarBuilder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarBuilder2.setResponseCode(g.f90668b).build();
    }

    public static i f(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f90664e));
        i.a aVarBuilder = i.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarBuilder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarBuilder.setTokenExpirationTimestamp(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarBuilder.setResponseCode(j.f90676b).build();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes(C.UTF8_NAME));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes(C.UTF8_NAME));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final HttpURLConnection c(URL url, String str) throws tj.h {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", G5.L);
            httpURLConnection.addRequestProperty("Accept", G5.L);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", CacheControl.NO_CACHE);
            Context context = this.f90665a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            zi.f fVar = (zi.f) this.f90666b.get();
            if (fVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((zi.c) fVar).getHeartBeatsHeader()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            String strBytesToStringUppercase = null;
            try {
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
                if (packageCertificateHashBytes == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
            } catch (PackageManager.NameNotFoundException e12) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e12);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strBytesToStringUppercase);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new tj.h("Firebase Installations Service is unavailable. Please try again later.", tj.g.f86943c);
        }
    }

    public f createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws tj.h {
        HttpURLConnection httpURLConnectionC;
        int responseCode;
        f fVarE;
        h hVar = this.f90667c;
        boolean zIsRequestAllowed = hVar.isRequestAllowed();
        tj.g gVar = tj.g.f86943c;
        if (!zIsRequestAllowed) {
            throw new tj.h("Firebase Installations Service is unavailable. Please try again later.", gVar);
        }
        URL urlA = a("projects/" + str3 + "/installations");
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 > 1) {
                throw new tj.h("Firebase Installations Service is unavailable. Please try again later.", gVar);
            }
            TrafficStats.setThreadStatsTag(32769);
            httpURLConnectionC = c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod(C3271ic.f36944b);
                    httpURLConnectionC.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    g(httpURLConnectionC, str2, str4);
                    responseCode = httpURLConnectionC.getResponseCode();
                    hVar.setNextRequestTime(responseCode);
                    if (responseCode < 200 || responseCode >= 300) {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (z10) {
                fVarE = e(httpURLConnectionC);
                break;
            }
            b(httpURLConnectionC, str4, str, str3);
            if (responseCode == 429) {
                throw new tj.h("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", tj.g.f86944e);
            }
            if (responseCode < 500 || responseCode >= 600) {
                break;
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            i10++;
        }
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
        fVarE = f.builder().setResponseCode(g.f90669c).build();
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        return fVarE;
    }

    public void deleteFirebaseInstallation(String str, String str2, String str3, String str4) throws tj.h {
        int responseCode;
        URL urlA = a("projects/" + str3 + "/installations/" + str2);
        int i10 = 0;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection httpURLConnectionC = c(urlA, str);
            try {
                httpURLConnectionC.setRequestMethod("DELETE");
                httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                responseCode = httpURLConnectionC.getResponseCode();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                b(httpURLConnectionC, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    throw new tj.h("Bad config while trying to delete FID", tj.g.f86942b);
                }
                i10++;
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new tj.h("Firebase Installations Service is unavailable. Please try again later.", tj.g.f86943c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        r11 = wj.i.builder().setResponseCode(wj.j.f90678e).build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wj.i generateAuthToken(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) throws tj.h {
        /*
            r10 = this;
            wj.h r0 = r10.f90667c
            boolean r1 = r0.isRequestAllowed()
            tj.g r2 = tj.g.f86943c
            java.lang.String r3 = "Firebase Installations Service is unavailable. Please try again later."
            if (r1 == 0) goto Ldb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "projects/"
            r1.<init>(r4)
            r1.append(r13)
            java.lang.String r4 = "/installations/"
            r1.append(r4)
            r1.append(r12)
            java.lang.String r12 = "/authTokens:generate"
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            java.net.URL r12 = a(r12)
            r1 = 0
            r4 = r1
        L2d:
            r5 = 1
            if (r4 > r5) goto Ld5
            r6 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r6)
            java.net.HttpURLConnection r6 = r10.c(r12, r11)
            java.lang.String r7 = "POST"
            r6.setRequestMethod(r7)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            java.lang.String r7 = "Authorization"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            java.lang.String r9 = "FIS_v2 "
            r8.append(r9)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r8.append(r14)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r6.addRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r6.setDoOutput(r5)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            h(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r0.setNextRequestTime(r7)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 < r8) goto L6b
            r8 = 300(0x12c, float:4.2E-43)
            if (r7 >= r8) goto L6b
            goto L6c
        L6b:
            r5 = r1
        L6c:
            if (r5 == 0) goto L7b
            wj.i r11 = f(r6)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94
        L72:
            r6.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r11
        L79:
            r11 = move-exception
            goto Lca
        L7b:
            r5 = 0
            b(r6, r5, r11, r13)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r5 = 401(0x191, float:5.62E-43)
            if (r7 == r5) goto Lbb
            r5 = 404(0x194, float:5.66E-43)
            if (r7 != r5) goto L88
            goto Lbb
        L88:
            r5 = 429(0x1ad, float:6.01E-43)
            if (r7 == r5) goto Lb1
            r5 = 500(0x1f4, float:7.0E-43)
            if (r7 < r5) goto L9b
            r5 = 600(0x258, float:8.41E-43)
            if (r7 >= r5) goto L9b
        L94:
            r6.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto Ld1
        L9b:
            java.lang.String r5 = "Firebase-Installations"
            java.lang.String r7 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r5, r7)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.i$a r5 = wj.i.builder()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.j r7 = wj.j.f90677c     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.i$a r5 = r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.i r11 = r5.build()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            goto L72
        Lb1:
            tj.h r5 = new tj.h     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            java.lang.String r7 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            tj.g r8 = tj.g.f86944e     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            r5.<init>(r7, r8)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            throw r5     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
        Lbb:
            wj.i$a r5 = wj.i.builder()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.j r7 = wj.j.f90678e     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.i$a r5 = r5.setResponseCode(r7)     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            wj.i r11 = r5.build()     // Catch: java.lang.Throwable -> L79 java.lang.Throwable -> L94 java.lang.Throwable -> L94
            goto L72
        Lca:
            r6.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r11
        Ld1:
            int r4 = r4 + 1
            goto L2d
        Ld5:
            tj.h r11 = new tj.h
            r11.<init>(r3, r2)
            throw r11
        Ldb:
            tj.h r11 = new tj.h
            r11.<init>(r3, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.e.generateAuthToken(java.lang.String, java.lang.String, java.lang.String, java.lang.String):wj.i");
    }
}
