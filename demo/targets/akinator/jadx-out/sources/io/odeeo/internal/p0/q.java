package io.odeeo.internal.p0;

import android.net.Uri;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import io.odeeo.internal.p0.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.j1;
import io.odeeo.internal.u0.s0;
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

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q extends e implements t {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65696e;

    /* renamed from: f, reason: collision with root package name */
    public final int f65697f;

    /* renamed from: g, reason: collision with root package name */
    public final int f65698g;

    /* renamed from: h, reason: collision with root package name */
    public final String f65699h;

    /* renamed from: i, reason: collision with root package name */
    public final t.f f65700i;

    /* renamed from: j, reason: collision with root package name */
    public final t.f f65701j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f65702k;

    /* renamed from: l, reason: collision with root package name */
    public io.odeeo.internal.t0.v<String> f65703l;

    /* renamed from: m, reason: collision with root package name */
    public m f65704m;

    /* renamed from: n, reason: collision with root package name */
    public HttpURLConnection f65705n;

    /* renamed from: o, reason: collision with root package name */
    public InputStream f65706o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65707p;

    /* renamed from: q, reason: collision with root package name */
    public int f65708q;

    /* renamed from: r, reason: collision with root package name */
    public long f65709r;

    /* renamed from: s, reason: collision with root package name */
    public long f65710s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements t.b {

        /* renamed from: b, reason: collision with root package name */
        public b0 f65712b;

        /* renamed from: c, reason: collision with root package name */
        public io.odeeo.internal.t0.v<String> f65713c;

        /* renamed from: d, reason: collision with root package name */
        public String f65714d;

        /* renamed from: g, reason: collision with root package name */
        public boolean f65717g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f65718h;

        /* renamed from: a, reason: collision with root package name */
        public final t.f f65711a = new t.f();

        /* renamed from: e, reason: collision with root package name */
        public int f65715e = 8000;

        /* renamed from: f, reason: collision with root package name */
        public int f65716f = 8000;

        public b setAllowCrossProtocolRedirects(boolean z10) {
            this.f65717g = z10;
            return this;
        }

        public b setConnectTimeoutMs(int i10) {
            this.f65715e = i10;
            return this;
        }

        public b setContentTypePredicate(io.odeeo.internal.t0.v<String> vVar) {
            this.f65713c = vVar;
            return this;
        }

        @Override // io.odeeo.internal.p0.t.b
        public /* bridge */ /* synthetic */ t.b setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        public b setKeepPostFor302Redirects(boolean z10) {
            this.f65718h = z10;
            return this;
        }

        public b setReadTimeoutMs(int i10) {
            this.f65716f = i10;
            return this;
        }

        public b setTransferListener(b0 b0Var) {
            this.f65712b = b0Var;
            return this;
        }

        public b setUserAgent(String str) {
            this.f65714d = str;
            return this;
        }

        @Override // io.odeeo.internal.p0.t.b
        public final b setDefaultRequestProperties(Map<String, String> map) {
            this.f65711a.clearAndSet(map);
            return this;
        }

        @Override // io.odeeo.internal.p0.t.b, io.odeeo.internal.p0.i.a
        public q createDataSource() {
            q qVar = new q(this.f65714d, this.f65715e, this.f65716f, this.f65717g, this.f65711a, this.f65713c, this.f65718h);
            b0 b0Var = this.f65712b;
            if (b0Var != null) {
                qVar.addTransferListener(b0Var);
            }
            return qVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends s0<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f65719a;

        public c(Map<String, List<String>> map) {
            this.f65719a = map;
        }

        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public boolean containsValue(Object obj) {
            return super.a(obj);
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return e3.filter(super.entrySet(), new at.c(1));
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.b(obj);
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public int hashCode() {
            return super.b();
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public Set<String> keySet() {
            return e3.filter(super.keySet(), new at.c(0));
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // io.odeeo.internal.u0.s0, io.odeeo.internal.u0.x0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, List<String>> delegate() {
            return this.f65719a;
        }

        @Override // io.odeeo.internal.u0.s0, java.util.Map
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public final HttpURLConnection a(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f65697f);
        httpURLConnectionA.setReadTimeout(this.f65698g);
        HashMap map2 = new HashMap();
        t.f fVar = this.f65700i;
        if (fVar != null) {
            map2.putAll(fVar.getSnapshot());
        }
        map2.putAll(this.f65701j.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = u.buildRangeRequestHeader(j10, j11);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionA.setRequestProperty(Command.HTTP_HEADER_RANGE, strBuildRangeRequestHeader);
        }
        String str = this.f65699h;
        if (str != null) {
            httpURLConnectionA.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z11);
        httpURLConnectionA.setDoOutput(bArr != null);
        httpURLConnectionA.setRequestMethod(m.getStringForHttpMethod(i10));
        if (bArr == null) {
            httpURLConnectionA.connect();
            return httpURLConnectionA;
        }
        httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionA.connect();
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionA;
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f65705n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                io.odeeo.internal.q0.p.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f65705n = null;
        }
    }

    public final HttpURLConnection c(m mVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        URL url = new URL(mVar.f65626a.toString());
        int i10 = mVar.f65628c;
        byte[] bArr = mVar.f65629d;
        long j10 = mVar.f65632g;
        long j11 = mVar.f65633h;
        int i11 = 1;
        boolean zIsFlagSet = mVar.isFlagSet(1);
        if (!this.f65696e && !this.f65702k) {
            return a(url, i10, bArr, j10, j11, zIsFlagSet, true, mVar.f65630e);
        }
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new t.c(new NoRouteToHostException(a.b.e(i13, "Too many redirects: ")), mVar, 2001, 1);
            }
            httpURLConnectionA = a(url, i10, bArr, j10, j11, zIsFlagSet, false, mVar.f65630e);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                url = a(url, headerField, mVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionA.disconnect();
                if (!this.f65702k || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = a(url, headerField, mVar);
            }
            i12 = i13;
            i11 = 1;
        }
        return httpURLConnectionA;
    }

    @Override // io.odeeo.internal.p0.t
    public void clearAllRequestProperties() {
        this.f65701j.clear();
    }

    @Override // io.odeeo.internal.p0.t
    public void clearRequestProperty(String str) {
        io.odeeo.internal.q0.a.checkNotNull(str);
        this.f65701j.remove(str);
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() throws t.c {
        try {
            InputStream inputStream = this.f65706o;
            if (inputStream != null) {
                long j10 = this.f65709r;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f65710s;
                }
                a(this.f65705n, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new t.c(e10, (m) g0.castNonNull(this.f65704m), 2000, 3);
                }
            }
        } finally {
            this.f65706o = null;
            b();
            if (this.f65707p) {
                this.f65707p = false;
                a();
            }
        }
    }

    @Override // io.odeeo.internal.p0.t
    public int getResponseCode() {
        int i10;
        if (this.f65705n == null || (i10 = this.f65708q) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f65705n;
        return httpURLConnection == null ? j1.of() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f65705n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        byte[] byteArray;
        this.f65704m = mVar;
        long j10 = 0;
        this.f65710s = 0L;
        this.f65709r = 0L;
        a(mVar);
        try {
            HttpURLConnection httpURLConnectionC = c(mVar);
            this.f65705n = httpURLConnectionC;
            this.f65708q = httpURLConnectionC.getResponseCode();
            String responseMessage = httpURLConnectionC.getResponseMessage();
            int i10 = this.f65708q;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionC.getHeaderFields();
                if (this.f65708q == 416) {
                    if (mVar.f65632g == u.getDocumentSize(httpURLConnectionC.getHeaderField("Content-Range"))) {
                        this.f65707p = true;
                        b(mVar);
                        long j11 = mVar.f65633h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionC.getErrorStream();
                try {
                    byteArray = errorStream != null ? g0.toByteArray(errorStream) : g0.f65866f;
                } catch (IOException unused) {
                    byteArray = g0.f65866f;
                }
                byte[] bArr = byteArray;
                b();
                throw new t.e(this.f65708q, responseMessage, this.f65708q == 416 ? new j(2008) : null, headerFields, mVar, bArr);
            }
            String contentType = httpURLConnectionC.getContentType();
            io.odeeo.internal.t0.v<String> vVar = this.f65703l;
            if (vVar != null && !vVar.apply(contentType)) {
                b();
                throw new t.d(contentType, mVar);
            }
            if (this.f65708q == 200) {
                long j12 = mVar.f65632g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zA = a(httpURLConnectionC);
            if (zA) {
                this.f65709r = mVar.f65633h;
            } else {
                long j13 = mVar.f65633h;
                if (j13 != -1) {
                    this.f65709r = j13;
                } else {
                    long contentLength = u.getContentLength(httpURLConnectionC.getHeaderField("Content-Length"), httpURLConnectionC.getHeaderField("Content-Range"));
                    this.f65709r = contentLength != -1 ? contentLength - j10 : -1L;
                }
            }
            try {
                this.f65706o = httpURLConnectionC.getInputStream();
                if (zA) {
                    this.f65706o = new GZIPInputStream(this.f65706o);
                }
                this.f65707p = true;
                b(mVar);
                try {
                    a(j10, mVar);
                    return this.f65709r;
                } catch (IOException e10) {
                    b();
                    if (e10 instanceof t.c) {
                        throw ((t.c) e10);
                    }
                    throw new t.c(e10, mVar, 2000, 1);
                }
            } catch (IOException e11) {
                b();
                throw new t.c(e11, mVar, 2000, 1);
            }
        } catch (IOException e12) {
            b();
            throw t.c.createForIOException(e12, mVar, 1);
        }
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws t.c {
        try {
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw t.c.createForIOException(e10, (m) g0.castNonNull(this.f65704m), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(io.odeeo.internal.t0.v<String> vVar) {
        this.f65703l = vVar;
    }

    @Override // io.odeeo.internal.p0.t
    public void setRequestProperty(String str, String str2) {
        io.odeeo.internal.q0.a.checkNotNull(str);
        io.odeeo.internal.q0.a.checkNotNull(str2);
        this.f65701j.set(str, str2);
    }

    @Deprecated
    public q() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public q(String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public q(String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public q(String str, int i10, int i11, boolean z10, t.f fVar) {
        this(str, i10, i11, z10, fVar, null, false);
    }

    public q(String str, int i10, int i11, boolean z10, t.f fVar, io.odeeo.internal.t0.v<String> vVar, boolean z11) {
        super(true);
        this.f65699h = str;
        this.f65697f = i10;
        this.f65698g = i11;
        this.f65696e = z10;
        this.f65700i = fVar;
        this.f65703l = vVar;
        this.f65701j = new t.f();
        this.f65702k = z11;
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public final URL a(URL url, String str, m mVar) throws t.c {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new t.c(a.b.k("Unsupported protocol redirect: ", protocol), mVar, 2001, 1);
                }
                if (this.f65696e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                throw new t.c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", mVar, 2001, 1);
            } catch (MalformedURLException e10) {
                throw new t.c(e10, mVar, 2001, 1);
            }
        }
        throw new t.c("Null location redirect", mVar, 2001, 1);
    }

    public final void a(long j10, m mVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) g0.castNonNull(this.f65706o)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new t.c(new InterruptedIOException(), mVar, 2000, 1);
            }
            if (i10 != -1) {
                j10 -= i10;
                a(i10);
            } else {
                throw new t.c(mVar, 2008, 1);
            }
        }
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f65709r;
        if (j10 != -1) {
            long j11 = j10 - this.f65710s;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) g0.castNonNull(this.f65706o)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f65710s += i12;
        a(i12);
        return i12;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10;
        if (httpURLConnection == null || (i10 = g0.f65861a) < 19 || i10 > 20) {
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
                Method declaredMethod = ((Class) io.odeeo.internal.q0.a.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }
}
