package ln;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f73487a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f73488b;

    /* renamed from: c, reason: collision with root package name */
    public final i f73489c;

    /* renamed from: d, reason: collision with root package name */
    public s f73490d;

    /* renamed from: e, reason: collision with root package name */
    public ln.a f73491e;

    /* renamed from: f, reason: collision with root package name */
    public d f73492f;

    /* renamed from: g, reason: collision with root package name */
    public i f73493g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f73494h;

    /* renamed from: i, reason: collision with root package name */
    public e f73495i;

    /* renamed from: j, reason: collision with root package name */
    public d0 f73496j;

    /* renamed from: k, reason: collision with root package name */
    public i f73497k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final Context f73498a;

        /* renamed from: b, reason: collision with root package name */
        public final h f73499b;

        /* renamed from: c, reason: collision with root package name */
        public g0 f73500c;

        public a(Context context) {
            this(context, new o());
        }

        public a setTransferListener(g0 g0Var) {
            this.f73500c = g0Var;
            return this;
        }

        public a(Context context, h hVar) {
            this.f73498a = context.getApplicationContext();
            this.f73499b = (h) io.bidmachine.media3.common.util.a.checkNotNull(hVar);
        }

        @Override // ln.h
        public n createDataSource() {
            n nVar = new n(this.f73498a, this.f73499b.createDataSource());
            g0 g0Var = this.f73500c;
            if (g0Var != null) {
                nVar.addTransferListener(g0Var);
            }
            return nVar;
        }
    }

    public n(Context context, boolean z10) {
        this(context, null, 8000, 8000, z10);
    }

    public static void b(i iVar, g0 g0Var) {
        if (iVar != null) {
            iVar.addTransferListener(g0Var);
        }
    }

    public final void a(i iVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f73488b;
            if (i10 >= arrayList.size()) {
                return;
            }
            iVar.addTransferListener((g0) arrayList.get(i10));
            i10++;
        }
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f73489c.addTransferListener(g0Var);
        this.f73488b.add(g0Var);
        b(this.f73490d, g0Var);
        b(this.f73491e, g0Var);
        b(this.f73492f, g0Var);
        b(this.f73493g, g0Var);
        b(this.f73494h, g0Var);
        b(this.f73495i, g0Var);
        b(this.f73496j, g0Var);
    }

    @Override // ln.i
    public void close() throws IOException {
        i iVar = this.f73497k;
        if (iVar != null) {
            try {
                iVar.close();
            } finally {
                this.f73497k = null;
            }
        }
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        i iVar = this.f73497k;
        return iVar == null ? Collections.EMPTY_MAP : iVar.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        i iVar = this.f73497k;
        if (iVar == null) {
            return null;
        }
        return iVar.getUri();
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        io.bidmachine.media3.common.util.a.checkState(this.f73497k == null);
        Uri uri = mVar.f73467a;
        String scheme = uri.getScheme();
        boolean zIsLocalFileUri = a1.isLocalFileUri(uri);
        Context context = this.f73487a;
        if (zIsLocalFileUri) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f73490d == null) {
                    s sVar = new s();
                    this.f73490d = sVar;
                    a(sVar);
                }
                this.f73497k = this.f73490d;
            } else {
                if (this.f73491e == null) {
                    ln.a aVar = new ln.a(context);
                    this.f73491e = aVar;
                    a(aVar);
                }
                this.f73497k = this.f73491e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f73491e == null) {
                ln.a aVar2 = new ln.a(context);
                this.f73491e = aVar2;
                a(aVar2);
            }
            this.f73497k = this.f73491e;
        } else if ("content".equals(scheme)) {
            if (this.f73492f == null) {
                d dVar = new d(context);
                this.f73492f = dVar;
                a(dVar);
            }
            this.f73497k = this.f73492f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            i iVar = this.f73489c;
            if (zEquals) {
                if (this.f73493g == null) {
                    try {
                        i iVar2 = (i) Class.forName("io.bidmachine.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f73493g = iVar2;
                        a(iVar2);
                    } catch (ClassNotFoundException unused) {
                        io.bidmachine.media3.common.util.b0.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f73493g == null) {
                        this.f73493g = iVar;
                    }
                }
                this.f73497k = this.f73493g;
            } else if ("udp".equals(scheme)) {
                if (this.f73494h == null) {
                    h0 h0Var = new h0();
                    this.f73494h = h0Var;
                    a(h0Var);
                }
                this.f73497k = this.f73494h;
            } else if ("data".equals(scheme)) {
                if (this.f73495i == null) {
                    e eVar = new e();
                    this.f73495i = eVar;
                    a(eVar);
                }
                this.f73497k = this.f73495i;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f73496j == null) {
                    d0 d0Var = new d0(context);
                    this.f73496j = d0Var;
                    a(d0Var);
                }
                this.f73497k = this.f73496j;
            } else {
                this.f73497k = iVar;
            }
        }
        return this.f73497k.open(mVar);
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((i) io.bidmachine.media3.common.util.a.checkNotNull(this.f73497k)).read(bArr, i10, i11);
    }

    public n(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    public n(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new o().setUserAgent(str).setConnectTimeoutMs(i10).setReadTimeoutMs(i11).setAllowCrossProtocolRedirects(z10).createDataSource());
    }

    public n(Context context, i iVar) {
        this.f73487a = context.getApplicationContext();
        this.f73489c = (i) io.bidmachine.media3.common.util.a.checkNotNull(iVar);
        this.f73488b = new ArrayList();
    }
}
