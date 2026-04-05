package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3271ic;
import com.ironsource.Q6;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class am {

    /* renamed from: a, reason: collision with root package name */
    public static String f50394a;

    /* renamed from: c, reason: collision with root package name */
    private Context f50396c;

    /* renamed from: d, reason: collision with root package name */
    private int f50397d;

    /* renamed from: e, reason: collision with root package name */
    private int f50398e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f50399f;

    /* renamed from: b, reason: collision with root package name */
    private HttpURLConnection f50395b = null;

    /* renamed from: g, reason: collision with root package name */
    private int f50400g = -1;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f50401h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f50402i = 10000;

    /* renamed from: j, reason: collision with root package name */
    private int f50403j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f50404k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f50405l = true;

    /* renamed from: m, reason: collision with root package name */
    private Runnable f50406m = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.c() || am.this.f50403j >= am.this.f50404k) {
                return;
            }
            am.c(am.this);
            ar.a(this);
        }
    }

    public am(Context context) {
        this.f50396c = context;
    }

    public static /* synthetic */ int c(am amVar) {
        int i10 = amVar.f50403j;
        amVar.f50403j = i10 + 1;
        return i10;
    }

    public abstract String a();

    public abstract void a(int i10, byte[] bArr);

    public static synchronized void a(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(f50394a)) {
            f50394a = str;
        }
    }

    private void b() throws JSONException {
        Object obj;
        if (this.f50395b == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f50394a)) {
                jSONObject.put("ipv6", f50394a);
            }
            if (!TextUtils.isEmpty(com.pgl.ssdk.ces.b.f())) {
                jSONObject.put(Q6.U0, com.pgl.ssdk.ces.b.f());
            }
            jSONObject.put(TtmlNode.TAG_REGION, an.a());
            Pair<Integer, String> pairA = aq.a(jSONObject.toString());
            if (pairA == null || (obj = pairA.first) == null || pairA.second == null) {
                return;
            }
            this.f50395b.addRequestProperty("cypher", String.valueOf(obj));
            this.f50395b.addRequestProperty("transfer-param", (String) pairA.second);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ca, PHI: r0
      0x00b6: PHI (r0v14 java.io.InputStream) = (r0v13 java.io.InputStream), (r0v20 java.io.InputStream) binds: [B:30:0x00b3, B:27:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ca, blocks: (B:3:0x0004, B:5:0x0010, B:10:0x001f, B:12:0x0038, B:14:0x0040, B:15:0x0044, B:17:0x004d, B:19:0x0060, B:21:0x007d, B:23:0x0080, B:24:0x0096, B:33:0x00b9, B:32:0x00b6, B:18:0x0058), top: B:48:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            r5 = this;
            java.lang.String r0 = "https://"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r5.f50396c     // Catch: java.lang.Throwable -> Lca
            java.lang.String r3 = com.pgl.ssdk.an.a(r3)     // Catch: java.lang.Throwable -> Lca
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L1f
            android.content.Context r0 = r5.f50396c     // Catch: java.lang.Throwable -> Lca
            com.pgl.ssdk.an.b(r0)     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = r5.f50395b
            if (r0 == 0) goto L1e
            r0.disconnect()
            r5.f50395b = r2
        L1e:
            return r1
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r4.<init>()     // Catch: java.lang.Throwable -> Lca
            r4.append(r3)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r3 = r5.a()     // Catch: java.lang.Throwable -> Lca
            r4.append(r3)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Lca
            if (r4 != 0) goto L44
            java.lang.String r4 = "http://"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> Lca
            if (r4 != 0) goto L44
            java.lang.String r3 = r0.concat(r3)     // Catch: java.lang.Throwable -> Lca
        L44:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lca
            boolean r3 = r5.f50405l     // Catch: java.lang.Throwable -> Lca
            if (r3 == 0) goto L58
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> Lca
            java.net.URLConnection r0 = r0.openConnection(r3)     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lca
            r5.f50395b = r0     // Catch: java.lang.Throwable -> Lca
            goto L60
        L58:
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lca
            r5.f50395b = r0     // Catch: java.lang.Throwable -> Lca
        L60:
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lca
            int r3 = r5.f50402i     // Catch: java.lang.Throwable -> Lca
            r0.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lca
            int r3 = r5.f50402i     // Catch: java.lang.Throwable -> Lca
            r0.setReadTimeout(r3)     // Catch: java.lang.Throwable -> Lca
            int r0 = r5.f50397d     // Catch: java.lang.Throwable -> Lca
            r5.a(r0)     // Catch: java.lang.Throwable -> Lca
            int r0 = r5.f50398e     // Catch: java.lang.Throwable -> Lca
            r5.b(r0)     // Catch: java.lang.Throwable -> Lca
            byte[] r0 = r5.f50399f     // Catch: java.lang.Throwable -> Lca
            r3 = 1
            if (r0 == 0) goto L96
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lca
            if (r0 <= 0) goto L96
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lca
            r0.setDoOutput(r3)     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lca
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch: java.lang.Throwable -> Lca
            byte[] r4 = r5.f50399f     // Catch: java.lang.Throwable -> Lca
            r0.write(r4)     // Catch: java.lang.Throwable -> Lca
            r0.flush()     // Catch: java.lang.Throwable -> Lca
            r0.close()     // Catch: java.lang.Throwable -> Lca
        L96:
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lca
            r0.connect()     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> Lb2
            r5.f50400g = r0     // Catch: java.lang.Throwable -> Lb2
            java.net.HttpURLConnection r0 = r5.f50395b     // Catch: java.lang.Throwable -> Lb2
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> Lb2
            byte[] r4 = r5.a(r0)     // Catch: java.lang.Throwable -> Lb3
            r5.f50401h = r4     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto Lb9
            goto Lb6
        Lb2:
            r0 = r2
        Lb3:
            if (r0 != 0) goto Lb6
            goto Lb9
        Lb6:
            r0.close()     // Catch: java.lang.Throwable -> Lca
        Lb9:
            int r0 = r5.f50400g     // Catch: java.lang.Throwable -> Lca
            byte[] r4 = r5.f50401h     // Catch: java.lang.Throwable -> Lca
            r5.a(r0, r4)     // Catch: java.lang.Throwable -> Lca
            java.net.HttpURLConnection r0 = r5.f50395b
            if (r0 == 0) goto Lc9
            r0.disconnect()
            r5.f50395b = r2
        Lc9:
            return r3
        Lca:
            java.net.HttpURLConnection r0 = r5.f50395b
            if (r0 == 0) goto Ld3
            r0.disconnect()
            r5.f50395b = r2
        Ld3:
            android.content.Context r0 = r5.f50396c
            com.pgl.ssdk.an.b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.am.c():boolean");
    }

    private void a(int i10) throws ProtocolException {
        this.f50395b.setRequestMethod(i10 != 1 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? C3271ic.f36943a : "TRACE" : "HEAD" : "DELETE" : "PUT" : C3271ic.f36944b);
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 > 0) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public void a(int i10, int i11, byte[] bArr) {
        b(i10, i11, bArr);
        ar.a(this.f50406m);
    }

    private void b(int i10) throws JSONException {
        String str = i10 != 1 ? i10 != 2 ? "" : "application/octet-stream" : "application/json; charset=utf-8";
        if (!str.isEmpty()) {
            this.f50395b.addRequestProperty("Content-Type", str);
        }
        String strB = an.b();
        if (strB != null) {
            this.f50395b.addRequestProperty("x-pangle-target-idc", strB);
        }
        b();
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                this.f50395b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            this.f50395b.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    private void b(int i10, int i11, byte[] bArr) {
        this.f50397d = i10;
        this.f50398e = i11;
        this.f50399f = bArr;
    }
}
