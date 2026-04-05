package io.odeeo.internal.p0;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.p0.q;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f65682a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b0> f65683b;

    /* renamed from: c, reason: collision with root package name */
    public final i f65684c;

    /* renamed from: d, reason: collision with root package name */
    public i f65685d;

    /* renamed from: e, reason: collision with root package name */
    public i f65686e;

    /* renamed from: f, reason: collision with root package name */
    public i f65687f;

    /* renamed from: g, reason: collision with root package name */
    public i f65688g;

    /* renamed from: h, reason: collision with root package name */
    public i f65689h;

    /* renamed from: i, reason: collision with root package name */
    public i f65690i;

    /* renamed from: j, reason: collision with root package name */
    public i f65691j;

    /* renamed from: k, reason: collision with root package name */
    public i f65692k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f65693a;

        /* renamed from: b, reason: collision with root package name */
        public final i.a f65694b;

        /* renamed from: c, reason: collision with root package name */
        public b0 f65695c;

        public a(Context context) {
            this(context, new q.b());
        }

        public a setTransferListener(b0 b0Var) {
            this.f65695c = b0Var;
            return this;
        }

        public a(Context context, i.a aVar) {
            this.f65693a = context.getApplicationContext();
            this.f65694b = aVar;
        }

        @Override // io.odeeo.internal.p0.i.a
        public p createDataSource() {
            p pVar = new p(this.f65693a, this.f65694b.createDataSource());
            b0 b0Var = this.f65695c;
            if (b0Var != null) {
                pVar.addTransferListener(b0Var);
            }
            return pVar;
        }
    }

    public p(Context context, boolean z10) {
        this(context, null, 8000, 8000, z10);
    }

    public final i a() {
        if (this.f65686e == null) {
            c cVar = new c(this.f65682a);
            this.f65686e = cVar;
            a(cVar);
        }
        return this.f65686e;
    }

    @Override // io.odeeo.internal.p0.i
    public void addTransferListener(b0 b0Var) {
        io.odeeo.internal.q0.a.checkNotNull(b0Var);
        this.f65684c.addTransferListener(b0Var);
        this.f65683b.add(b0Var);
        a(this.f65685d, b0Var);
        a(this.f65686e, b0Var);
        a(this.f65687f, b0Var);
        a(this.f65688g, b0Var);
        a(this.f65689h, b0Var);
        a(this.f65690i, b0Var);
        a(this.f65691j, b0Var);
    }

    public final i b() {
        if (this.f65687f == null) {
            f fVar = new f(this.f65682a);
            this.f65687f = fVar;
            a(fVar);
        }
        return this.f65687f;
    }

    public final i c() {
        if (this.f65690i == null) {
            h hVar = new h();
            this.f65690i = hVar;
            a(hVar);
        }
        return this.f65690i;
    }

    @Override // io.odeeo.internal.p0.i
    public void close() throws IOException {
        i iVar = this.f65692k;
        if (iVar != null) {
            try {
                iVar.close();
            } finally {
                this.f65692k = null;
            }
        }
    }

    public final i d() {
        if (this.f65685d == null) {
            s sVar = new s();
            this.f65685d = sVar;
            a(sVar);
        }
        return this.f65685d;
    }

    public final i e() {
        if (this.f65691j == null) {
            y yVar = new y(this.f65682a);
            this.f65691j = yVar;
            a(yVar);
        }
        return this.f65691j;
    }

    public final i f() {
        if (this.f65688g == null) {
            try {
                i iVar = (i) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.f65688g = iVar;
                a(iVar);
            } catch (ClassNotFoundException unused) {
                io.odeeo.internal.q0.p.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f65688g == null) {
                this.f65688g = this.f65684c;
            }
        }
        return this.f65688g;
    }

    public final i g() {
        if (this.f65689h == null) {
            c0 c0Var = new c0();
            this.f65689h = c0Var;
            a(c0Var);
        }
        return this.f65689h;
    }

    @Override // io.odeeo.internal.p0.i
    public Map<String, List<String>> getResponseHeaders() {
        i iVar = this.f65692k;
        return iVar == null ? Collections.EMPTY_MAP : iVar.getResponseHeaders();
    }

    @Override // io.odeeo.internal.p0.i
    public Uri getUri() {
        i iVar = this.f65692k;
        if (iVar == null) {
            return null;
        }
        return iVar.getUri();
    }

    @Override // io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        io.odeeo.internal.q0.a.checkState(this.f65692k == null);
        String scheme = mVar.f65626a.getScheme();
        if (g0.isLocalFileUri(mVar.f65626a)) {
            String path = mVar.f65626a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f65692k = d();
            } else {
                this.f65692k = a();
            }
        } else if ("asset".equals(scheme)) {
            this.f65692k = a();
        } else if ("content".equals(scheme)) {
            this.f65692k = b();
        } else if ("rtmp".equals(scheme)) {
            this.f65692k = f();
        } else if ("udp".equals(scheme)) {
            this.f65692k = g();
        } else if ("data".equals(scheme)) {
            this.f65692k = c();
        } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
            this.f65692k = e();
        } else {
            this.f65692k = this.f65684c;
        }
        return this.f65692k.open(mVar);
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((i) io.odeeo.internal.q0.a.checkNotNull(this.f65692k)).read(bArr, i10, i11);
    }

    public p(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    public p(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new q.b().setUserAgent(str).setConnectTimeoutMs(i10).setReadTimeoutMs(i11).setAllowCrossProtocolRedirects(z10).createDataSource());
    }

    public final void a(i iVar) {
        for (int i10 = 0; i10 < this.f65683b.size(); i10++) {
            iVar.addTransferListener(this.f65683b.get(i10));
        }
    }

    public final void a(i iVar, b0 b0Var) {
        if (iVar != null) {
            iVar.addTransferListener(b0Var);
        }
    }

    public p(Context context, i iVar) {
        this.f65682a = context.getApplicationContext();
        this.f65684c = (i) io.odeeo.internal.q0.a.checkNotNull(iVar);
        this.f65683b = new ArrayList();
    }
}
