package ln;

import android.net.Uri;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import mh.q1;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends b implements z {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f73512e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f73513f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73514g;

    /* renamed from: h, reason: collision with root package name */
    public final int f73515h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73516i;

    /* renamed from: j, reason: collision with root package name */
    public final y f73517j;

    /* renamed from: k, reason: collision with root package name */
    public final y f73518k;

    /* renamed from: l, reason: collision with root package name */
    public final q1 f73519l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f73520m;

    /* renamed from: n, reason: collision with root package name */
    public m f73521n;

    /* renamed from: o, reason: collision with root package name */
    public HttpURLConnection f73522o;

    /* renamed from: p, reason: collision with root package name */
    public InputStream f73523p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f73524q;

    /* renamed from: r, reason: collision with root package name */
    public int f73525r;

    /* renamed from: s, reason: collision with root package name */
    public long f73526s;

    /* renamed from: t, reason: collision with root package name */
    public long f73527t;

    public r(String str, int i10, int i11, boolean z10, boolean z11, y yVar, q1 q1Var, boolean z12) {
        super(true);
        this.f73516i = str;
        this.f73514g = i10;
        this.f73515h = i11;
        this.f73512e = z10;
        this.f73513f = z11;
        if (z10 && z11) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f73517j = yVar;
        this.f73519l = q1Var;
        this.f73518k = new y();
        this.f73520m = z12;
    }

    @Override // ln.z
    public void clearAllRequestProperties() {
        this.f73518k.clear();
    }

    @Override // ln.z
    public void clearRequestProperty(String str) {
        io.bidmachine.media3.common.util.a.checkNotNull(str);
        this.f73518k.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ln.b, ln.i
    public void close() throws v {
        try {
            InputStream inputStream = this.f73523p;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new v(e10, (m) a1.castNonNull(this.f73521n), 2000, 3);
                }
            }
        } finally {
            this.f73523p = null;
            e();
            if (this.f73524q) {
                this.f73524q = false;
                b();
            }
            this.f73522o = null;
            this.f73521n = null;
        }
    }

    public final void e() {
        HttpURLConnection httpURLConnection = this.f73522o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                io.bidmachine.media3.common.util.b0.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL f(URL url, String str, m mVar) throws v {
        if (str == null) {
            throw new v("Null location redirect", mVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new v(a.b.k(PtLatqAYjEFT.dzsCAcrOvMHUe, protocol), mVar, 2001, 1);
            }
            if (this.f73512e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f73513f) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e10) {
                    throw new v(e10, mVar, 2001, 1);
                }
            }
            throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", mVar, 2001, 1);
        } catch (MalformedURLException e11) {
            throw new v(e11, mVar, 2001, 1);
        }
    }

    public final HttpURLConnection g(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f73514g);
        httpURLConnection.setReadTimeout(this.f73515h);
        HashMap map2 = new HashMap();
        y yVar = this.f73517j;
        if (yVar != null) {
            map2.putAll(yVar.getSnapshot());
        }
        map2.putAll(this.f73518k.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = a0.buildRangeRequestHeader(j10, j11);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strBuildRangeRequestHeader);
        }
        String str = this.f73516i;
        if (str != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(m.getStringForHttpMethod(i10));
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

    @Override // ln.z
    public int getResponseCode() {
        int i10;
        if (this.f73522o == null || (i10 = this.f73525r) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // ln.b, ln.i
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f73522o;
        return httpURLConnection == null ? m5.of() : new q(httpURLConnection.getHeaderFields());
    }

    @Override // ln.b, ln.i
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f73522o;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.f73521n;
        if (mVar != null) {
            return mVar.f73467a;
        }
        return null;
    }

    public final HttpURLConnection h(m mVar) throws IOException {
        HttpURLConnection httpURLConnectionG;
        URL url = new URL(mVar.f73467a.toString());
        int i10 = mVar.f73469c;
        byte[] bArr = mVar.f73470d;
        long j10 = mVar.f73472f;
        long j11 = mVar.f73473g;
        boolean zIsFlagSet = mVar.isFlagSet(1);
        boolean z10 = this.f73512e;
        boolean z11 = this.f73520m;
        if (!z10 && !this.f73513f && !z11) {
            return g(url, i10, bArr, j10, j11, zIsFlagSet, true, mVar.f73471e);
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new v(new NoRouteToHostException(a.b.e(i12, "Too many redirects: ")), mVar, 2001, 1);
            }
            httpURLConnectionG = g(url, i10, bArr, j10, j11, zIsFlagSet, false, mVar.f73471e);
            int responseCode = httpURLConnectionG.getResponseCode();
            String headerField = httpURLConnectionG.getHeaderField("Location");
            if ((i10 == 1 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionG.disconnect();
                url = f(url, headerField, mVar);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionG.disconnect();
                if (!z11 || responseCode != 302) {
                    bArr = null;
                    i10 = 1;
                }
                url = f(url, headerField, mVar);
            }
            i11 = i12;
        }
        return httpURLConnectionG;
    }

    public final void i(long j10, m mVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) a1.castNonNull(this.f73523p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new v(new InterruptedIOException(), mVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new v(mVar, 2008, 1);
            }
            j10 -= i10;
            a(i10);
        }
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException, NumberFormatException {
        byte[] byteArray;
        this.f73521n = mVar;
        this.f73527t = 0L;
        this.f73526s = 0L;
        c(mVar);
        try {
            HttpURLConnection httpURLConnectionH = h(mVar);
            long j10 = mVar.f73472f;
            long j11 = mVar.f73473g;
            this.f73522o = httpURLConnectionH;
            this.f73525r = httpURLConnectionH.getResponseCode();
            String responseMessage = httpURLConnectionH.getResponseMessage();
            int i10 = this.f73525r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionH.getHeaderFields();
                if (this.f73525r == 416 && j10 == a0.getDocumentSize(httpURLConnectionH.getHeaderField("Content-Range"))) {
                    this.f73524q = true;
                    d(mVar);
                    if (j11 != -1) {
                        return j11;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionH.getErrorStream();
                try {
                    byteArray = errorStream != null ? ph.e0.toByteArray(errorStream) : a1.f60681c;
                } catch (IOException unused) {
                    byteArray = a1.f60681c;
                }
                byte[] bArr = byteArray;
                e();
                throw new x(this.f73525r, responseMessage, this.f73525r == 416 ? new j(2008) : null, headerFields, mVar, bArr);
            }
            String contentType = httpURLConnectionH.getContentType();
            q1 q1Var = this.f73519l;
            if (q1Var != null && !q1Var.apply(contentType)) {
                e();
                throw new w(contentType, mVar);
            }
            long j12 = (this.f73525r != 200 || j10 == 0) ? 0L : j10;
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionH.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j11 != -1) {
                this.f73526s = j11;
            } else {
                long contentLength = a0.getContentLength(httpURLConnectionH.getHeaderField("Content-Length"), httpURLConnectionH.getHeaderField("Content-Range"));
                this.f73526s = contentLength != -1 ? contentLength - j12 : -1L;
            }
            try {
                this.f73523p = httpURLConnectionH.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f73523p = new GZIPInputStream(this.f73523p);
                }
                this.f73524q = true;
                d(mVar);
                try {
                    i(j12, mVar);
                    return this.f73526s;
                } catch (IOException e10) {
                    e();
                    if (e10 instanceof v) {
                        throw ((v) e10);
                    }
                    throw new v(e10, mVar, 2000, 1);
                }
            } catch (IOException e11) {
                e();
                throw new v(e11, mVar, 2000, 1);
            }
        } catch (IOException e12) {
            e();
            throw v.createForIOException(e12, mVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c A[Catch: IOException -> 0x0036, TRY_LEAVE, TryCatch #0 {IOException -> 0x0036, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x002c), top: B:19:0x0004 }] */
    @Override // ln.b, ln.i, gn.o
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
            long r0 = r6.f73526s     // Catch: java.io.IOException -> L36
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.f73527t     // Catch: java.io.IOException -> L36
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
            java.io.InputStream r0 = r6.f73523p     // Catch: java.io.IOException -> L36
            java.lang.Object r0 = io.bidmachine.media3.common.util.a1.castNonNull(r0)     // Catch: java.io.IOException -> L36
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.io.IOException -> L36
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L36
            if (r7 != r3) goto L2c
        L2b:
            return r3
        L2c:
            long r8 = r6.f73527t     // Catch: java.io.IOException -> L36
            long r0 = (long) r7     // Catch: java.io.IOException -> L36
            long r8 = r8 + r0
            r6.f73527t = r8     // Catch: java.io.IOException -> L36
            r6.a(r7)     // Catch: java.io.IOException -> L36
            return r7
        L36:
            r7 = move-exception
            ln.m r8 = r6.f73521n
            java.lang.Object r8 = io.bidmachine.media3.common.util.a1.castNonNull(r8)
            ln.m r8 = (ln.m) r8
            r9 = 2
            ln.v r7 = ln.v.createForIOException(r7, r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.r.read(byte[], int, int):int");
    }

    @Override // ln.z
    public void setRequestProperty(String str, String str2) {
        io.bidmachine.media3.common.util.a.checkNotNull(str);
        io.bidmachine.media3.common.util.a.checkNotNull(str2);
        this.f73518k.set(str, str2);
    }
}
