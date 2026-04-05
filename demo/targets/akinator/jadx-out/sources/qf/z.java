package qf;

import android.net.Uri;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import mh.q1;
import nh.ec;
import nh.g4;
import nh.ha;
import nh.m5;
import nh.og;
import nh.z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends h implements j0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f83075e;

    /* renamed from: f, reason: collision with root package name */
    public final int f83076f;

    /* renamed from: g, reason: collision with root package name */
    public final int f83077g;

    /* renamed from: h, reason: collision with root package name */
    public final String f83078h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f83079i;

    /* renamed from: j, reason: collision with root package name */
    public final i0 f83080j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f83081k;

    /* renamed from: l, reason: collision with root package name */
    public q1 f83082l;

    /* renamed from: m, reason: collision with root package name */
    public t f83083m;

    /* renamed from: n, reason: collision with root package name */
    public HttpURLConnection f83084n;

    /* renamed from: o, reason: collision with root package name */
    public InputStream f83085o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83086p;

    /* renamed from: q, reason: collision with root package name */
    public int f83087q;

    /* renamed from: r, reason: collision with root package name */
    public long f83088r;

    /* renamed from: s, reason: collision with root package name */
    public long f83089s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements e0 {

        /* renamed from: b, reason: collision with root package name */
        public c1 f83091b;

        /* renamed from: c, reason: collision with root package name */
        public q1 f83092c;

        /* renamed from: d, reason: collision with root package name */
        public String f83093d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f83096g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f83097h;

        /* renamed from: a, reason: collision with root package name */
        public final i0 f83090a = new i0();

        /* renamed from: e, reason: collision with root package name */
        public int f83094e = 8000;

        /* renamed from: f, reason: collision with root package name */
        public int f83095f = 8000;

        public a setAllowCrossProtocolRedirects(boolean z10) {
            this.f83096g = z10;
            return this;
        }

        public a setConnectTimeoutMs(int i10) {
            this.f83094e = i10;
            return this;
        }

        public a setContentTypePredicate(q1 q1Var) {
            this.f83092c = q1Var;
            return this;
        }

        @Override // qf.e0
        public /* bridge */ /* synthetic */ e0 setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        public a setKeepPostFor302Redirects(boolean z10) {
            this.f83097h = z10;
            return this;
        }

        public a setReadTimeoutMs(int i10) {
            this.f83095f = i10;
            return this;
        }

        public a setTransferListener(c1 c1Var) {
            this.f83091b = c1Var;
            return this;
        }

        public a setUserAgent(String str) {
            this.f83093d = str;
            return this;
        }

        @Override // qf.e0
        public final a setDefaultRequestProperties(Map<String, String> map) {
            this.f83090a.clearAndSet(map);
            return this;
        }

        @Override // qf.e0, qf.o
        public z createDataSource() {
            z zVar = new z(this.f83093d, this.f83094e, this.f83095f, this.f83096g, this.f83090a, this.f83092c, this.f83097h);
            c1 c1Var = this.f83091b;
            if (c1Var != null) {
                zVar.addTransferListener(c1Var);
            }
            return zVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends g4 {

        /* renamed from: b, reason: collision with root package name */
        public final Map f83098b;

        public b(Map<String, List<String>> map) {
            this.f83098b = map;
        }

        @Override // nh.g4
        public final Map c() {
            return this.f83098b;
        }

        @Override // nh.g4, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // nh.g4, java.util.Map
        public boolean containsValue(Object obj) {
            return z7.contains(new ha(1, entrySet().iterator()), obj);
        }

        @Override // nh.l4
        public final Object delegate() {
            return this.f83098b;
        }

        @Override // nh.g4, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return og.filter(super.entrySet(), new ln.p(3));
        }

        @Override // nh.g4, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && ec.e(this, obj);
        }

        @Override // nh.g4, java.util.Map
        public int hashCode() {
            return og.b(entrySet());
        }

        @Override // nh.g4, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // nh.g4, java.util.Map
        public Set<String> keySet() {
            return og.filter(super.keySet(), new ln.p(2));
        }

        @Override // nh.g4, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // nh.g4, java.util.Map
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    @Deprecated
    public z() {
        this(null, 8000, 8000);
    }

    public static void i(HttpURLConnection httpURLConnection, long j10) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        if (httpURLConnection == null || (i10 = n1.f28506a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) com.google.android.exoplayer2.util.a.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // qf.j0
    public void clearAllRequestProperties() {
        this.f83080j.clear();
    }

    @Override // qf.j0
    public void clearRequestProperty(String str) {
        com.google.android.exoplayer2.util.a.checkNotNull(str);
        this.f83080j.remove(str);
    }

    @Override // qf.h, qf.p
    public void close() throws f0 {
        try {
            InputStream inputStream = this.f83085o;
            if (inputStream != null) {
                long j10 = this.f83088r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f83089s;
                }
                i(this.f83084n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new f0(e10, (t) n1.castNonNull(this.f83083m), 2000, 3);
                }
            }
        } finally {
            this.f83085o = null;
            e();
            if (this.f83086p) {
                this.f83086p = false;
                b();
            }
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.f83084n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                com.google.android.exoplayer2.util.f0.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f83084n = null;
        }
    }

    public final URL f(URL url, String str, t tVar) throws f0 {
        if (str == null) {
            throw new f0("Null location redirect", tVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new f0(a.b.k("Unsupported protocol redirect: ", protocol), tVar, 2001, 1);
            }
            if (this.f83075e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new f0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", tVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new f0(e10, tVar, 2001, 1);
        }
    }

    public final HttpURLConnection g(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f83076f);
        httpURLConnection.setReadTimeout(this.f83077g);
        HashMap map2 = new HashMap();
        i0 i0Var = this.f83079i;
        if (i0Var != null) {
            map2.putAll(i0Var.getSnapshot());
        }
        map2.putAll(this.f83080j.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = k0.buildRangeRequestHeader(j10, j11);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strBuildRangeRequestHeader);
        }
        String str = this.f83078h;
        if (str != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(t.getStringForHttpMethod(i10));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // qf.j0
    public int getResponseCode() {
        int i10;
        if (this.f83084n == null || (i10 = this.f83087q) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // qf.h, qf.p
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f83084n;
        return httpURLConnection == null ? m5.of() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // qf.h, qf.p
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f83084n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(t tVar) throws IOException {
        HttpURLConnection httpURLConnectionG;
        URL url = new URL(tVar.f82992a.toString());
        int i10 = tVar.f82994c;
        byte[] bArr = tVar.f82995d;
        long j10 = tVar.f82997f;
        long j11 = tVar.f82998g;
        boolean zIsFlagSet = tVar.isFlagSet(1);
        boolean z10 = this.f83075e;
        boolean z11 = this.f83081k;
        if (!z10 && !z11) {
            return g(url, i10, bArr, j10, j11, zIsFlagSet, true, tVar.f82996e);
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new f0(new NoRouteToHostException(a.b.e(i12, "Too many redirects: ")), tVar, 2001, 1);
            }
            httpURLConnectionG = g(url, i10, bArr, j10, j11, zIsFlagSet, false, tVar.f82996e);
            int responseCode = httpURLConnectionG.getResponseCode();
            String headerField = httpURLConnectionG.getHeaderField("Location");
            if ((i10 == 1 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionG.disconnect();
                url = f(url, headerField, tVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionG.disconnect();
                if (!z11 || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = f(url, headerField, tVar);
            }
            i11 = i12;
        }
        return httpURLConnectionG;
    }

    public final void j(long j10, t tVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) n1.castNonNull(this.f83085o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new f0(new InterruptedIOException(), tVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new f0(tVar, 2008, 1);
            }
            j10 -= i10;
            a(i10);
        }
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws IOException, NumberFormatException {
        byte[] byteArray;
        this.f83083m = tVar;
        this.f83089s = 0L;
        this.f83088r = 0L;
        c(tVar);
        try {
            HttpURLConnection httpURLConnectionH = h(tVar);
            long j10 = tVar.f82997f;
            long j11 = tVar.f82998g;
            this.f83084n = httpURLConnectionH;
            this.f83087q = httpURLConnectionH.getResponseCode();
            String responseMessage = httpURLConnectionH.getResponseMessage();
            int i10 = this.f83087q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionH.getHeaderFields();
                if (this.f83087q == 416 && j10 == k0.getDocumentSize(httpURLConnectionH.getHeaderField("Content-Range"))) {
                    this.f83086p = true;
                    d(tVar);
                    if (j11 != -1) {
                        return j11;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionH.getErrorStream();
                try {
                    byteArray = errorStream != null ? n1.toByteArray(errorStream) : n1.f28511f;
                } catch (IOException unused) {
                    byteArray = n1.f28511f;
                }
                byte[] bArr = byteArray;
                e();
                throw new h0(this.f83087q, responseMessage, this.f83087q == 416 ? new q(2008) : null, headerFields, tVar, bArr);
            }
            String contentType = httpURLConnectionH.getContentType();
            q1 q1Var = this.f83082l;
            if (q1Var != null && !q1Var.apply(contentType)) {
                e();
                throw new g0(contentType, tVar);
            }
            long j12 = (this.f83087q != 200 || j10 == 0) ? 0L : j10;
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionH.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j11 != -1) {
                this.f83088r = j11;
            } else {
                long contentLength = k0.getContentLength(httpURLConnectionH.getHeaderField("Content-Length"), httpURLConnectionH.getHeaderField("Content-Range"));
                this.f83088r = contentLength != -1 ? contentLength - j12 : -1L;
            }
            try {
                this.f83085o = httpURLConnectionH.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f83085o = new GZIPInputStream(this.f83085o);
                }
                this.f83086p = true;
                d(tVar);
                try {
                    j(j12, tVar);
                    return this.f83088r;
                } catch (IOException e10) {
                    e();
                    if (e10 instanceof f0) {
                        throw ((f0) e10);
                    }
                    throw new f0(e10, tVar, 2000, 1);
                }
            } catch (IOException e11) {
                e();
                throw new f0(e11, tVar, 2000, 1);
            }
        } catch (IOException e12) {
            e();
            throw f0.createForIOException(e12, tVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x002c), top: B:19:0x0004 }] */
    @Override // qf.h, qf.p, qf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            long r0 = r6.f83088r     // Catch: java.io.IOException -> L36
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f83089s     // Catch: java.io.IOException -> L36
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2b
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L36
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L36
            int r9 = (int) r0     // Catch: java.io.IOException -> L36
        L1d:
            java.io.InputStream r0 = r6.f83085o     // Catch: java.io.IOException -> L36
            java.lang.Object r0 = com.google.android.exoplayer2.util.n1.castNonNull(r0)     // Catch: java.io.IOException -> L36
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L36
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L36
            if (r7 != r3) goto L2c
        L2b:
            return r3
        L2c:
            long r8 = r6.f83089s     // Catch: java.io.IOException -> L36
            long r0 = (long) r7     // Catch: java.io.IOException -> L36
            long r8 = r8 + r0
            r6.f83089s = r8     // Catch: java.io.IOException -> L36
            r6.a(r7)     // Catch: java.io.IOException -> L36
            return r7
        L36:
            r7 = move-exception
            qf.t r8 = r6.f83083m
            java.lang.Object r8 = com.google.android.exoplayer2.util.n1.castNonNull(r8)
            qf.t r8 = (qf.t) r8
            r9 = 2
            qf.f0 r7 = qf.f0.createForIOException(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qf.z.read(byte[], int, int):int");
    }

    @Deprecated
    public void setContentTypePredicate(q1 q1Var) {
        this.f83082l = q1Var;
    }

    @Override // qf.j0
    public void setRequestProperty(String str, String str2) {
        com.google.android.exoplayer2.util.a.checkNotNull(str);
        com.google.android.exoplayer2.util.a.checkNotNull(str2);
        this.f83080j.set(str, str2);
    }

    @Deprecated
    public z(String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public z(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public z(String str, int i10, int i11, boolean z10, i0 i0Var) {
        this(str, i10, i11, z10, i0Var, null, false);
    }

    public z(String str, int i10, int i11, boolean z10, i0 i0Var, q1 q1Var, boolean z11) {
        super(true);
        this.f83078h = str;
        this.f83076f = i10;
        this.f83077g = i11;
        this.f83075e = z10;
        this.f83079i = i0Var;
        this.f83082l = q1Var;
        this.f83080j = new i0();
        this.f83081k = z11;
    }
}
