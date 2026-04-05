package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3271ic;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements h {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f25969o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReference f25970p = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25971a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25972b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25973c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25974d;

    /* renamed from: e, reason: collision with root package name */
    public final w f25975e;

    /* renamed from: f, reason: collision with root package name */
    public final w f25976f;

    /* renamed from: g, reason: collision with root package name */
    public final m f25977g;

    /* renamed from: h, reason: collision with root package name */
    public HttpURLConnection f25978h;

    /* renamed from: i, reason: collision with root package name */
    public InputStream f25979i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25980j;

    /* renamed from: k, reason: collision with root package name */
    public long f25981k;

    /* renamed from: l, reason: collision with root package name */
    public long f25982l;

    /* renamed from: m, reason: collision with root package name */
    public long f25983m;

    /* renamed from: n, reason: collision with root package name */
    public long f25984n;

    public p(String str, m mVar, int i10, int i11, boolean z10, w wVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f25974d = str;
        this.f25977g = mVar;
        this.f25976f = new w();
        this.f25972b = i10;
        this.f25973c = i11;
        this.f25971a = z10;
        this.f25975e = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        HttpURLConnection httpURLConnection = this.f25978h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f25944a.toString());
        long j10 = kVar.f25946c;
        long j11 = kVar.f25947d;
        int i10 = 0;
        boolean z10 = (kVar.f25949f & 1) == 1;
        if (!this.f25971a) {
            return a(url, null, j10, j11, z10, true);
        }
        while (true) {
            int i11 = i10 + 1;
            if (i10 > 20) {
                throw new NoRouteToHostException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Too many redirects: ", i11));
            }
            boolean z11 = z10;
            long j12 = j11;
            long j13 = j10;
            HttpURLConnection httpURLConnectionA = a(url, null, j13, j12, z11, false);
            j10 = j13;
            j11 = j12;
            z10 = z11;
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            httpURLConnectionA.disconnect();
            if (headerField == null) {
                throw new ProtocolException("Null location redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException(a.b.k("Unsupported protocol redirect: ", protocol));
            }
            i10 = i11;
            url = url2;
        }
    }

    public final void c() throws IOException {
        if (this.f25983m == this.f25981k) {
            return;
        }
        byte[] bArr = (byte[]) f25970p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j10 = this.f25983m;
            long j11 = this.f25981k;
            if (j10 == j11) {
                f25970p.set(bArr);
                return;
            }
            int i10 = this.f25979i.read(bArr, 0, (int) Math.min(j11 - j10, bArr.length));
            if (Thread.interrupted()) {
                throw new InterruptedIOException();
            }
            if (i10 == -1) {
                throw new EOFException();
            }
            long j12 = i10;
            this.f25983m += j12;
            m mVar = this.f25977g;
            if (mVar != null) {
                synchronized (mVar) {
                    mVar.f25958d += j12;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        try {
            if (this.f25979i != null) {
                HttpURLConnection httpURLConnection = this.f25978h;
                long j10 = this.f25982l;
                if (j10 != -1) {
                    j10 -= this.f25984n;
                }
                a(httpURLConnection, j10);
                try {
                    this.f25979i.close();
                } catch (IOException e10) {
                    throw new u(e10);
                }
            }
        } finally {
            this.f25979i = null;
            b();
            if (this.f25980j) {
                this.f25980j = false;
                m mVar = this.f25977g;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws u {
        try {
            c();
            return a(bArr, i10, i11);
        } catch (IOException e10) {
            throw new u(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r15) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.p.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f25978h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f25978h = null;
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f25972b);
        httpURLConnection.setReadTimeout(this.f25973c);
        w wVar = this.f25975e;
        if (wVar != null) {
            synchronized (wVar) {
                try {
                    if (wVar.f25998b == null) {
                        wVar.f25998b = Collections.unmodifiableMap(new HashMap(wVar.f25997a));
                    }
                    map = wVar.f25998b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f25976f.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String strN = o2.n(j10, "bytes=", "-");
            if (j11 != -1) {
                StringBuilder sbU = o2.u(strN);
                sbU.append((j10 + j11) - 1);
                strN = sbU.toString();
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strN);
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.f25974d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(C3271ic.f36944b);
            if (bArr.length == 0) {
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
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f25982l;
        if (j10 != -1) {
            long j11 = j10 - this.f25984n;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = this.f25979i.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f25982l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = i12;
        this.f25984n += j12;
        m mVar = this.f25977g;
        if (mVar == null) {
            return i12;
        }
        synchronized (mVar) {
            mVar.f25958d += j12;
        }
        return i12;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
        if (i10 == 19 || i10 == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
