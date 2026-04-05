package qf;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import qf.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f83058a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f83059b;

    /* renamed from: c, reason: collision with root package name */
    public final p f83060c;

    /* renamed from: d, reason: collision with root package name */
    public c0 f83061d;

    /* renamed from: e, reason: collision with root package name */
    public d f83062e;

    /* renamed from: f, reason: collision with root package name */
    public j f83063f;

    /* renamed from: g, reason: collision with root package name */
    public p f83064g;

    /* renamed from: h, reason: collision with root package name */
    public d1 f83065h;

    /* renamed from: i, reason: collision with root package name */
    public l f83066i;

    /* renamed from: j, reason: collision with root package name */
    public x0 f83067j;

    /* renamed from: k, reason: collision with root package name */
    public p f83068k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final Context f83069a;

        /* renamed from: b, reason: collision with root package name */
        public final o f83070b;

        /* renamed from: c, reason: collision with root package name */
        public c1 f83071c;

        public a(Context context) {
            this(context, new z.a());
        }

        public a setTransferListener(c1 c1Var) {
            this.f83071c = c1Var;
            return this;
        }

        public a(Context context, o oVar) {
            this.f83069a = context.getApplicationContext();
            this.f83070b = oVar;
        }

        @Override // qf.o
        public y createDataSource() {
            y yVar = new y(this.f83069a, this.f83070b.createDataSource());
            c1 c1Var = this.f83071c;
            if (c1Var != null) {
                yVar.addTransferListener(c1Var);
            }
            return yVar;
        }
    }

    public y(Context context, boolean z10) {
        this(context, null, 8000, 8000, z10);
    }

    public static void b(p pVar, c1 c1Var) {
        if (pVar != null) {
            pVar.addTransferListener(c1Var);
        }
    }

    public final void a(p pVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f83059b;
            if (i10 >= arrayList.size()) {
                return;
            }
            pVar.addTransferListener((c1) arrayList.get(i10));
            i10++;
        }
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f83060c.addTransferListener(c1Var);
        this.f83059b.add(c1Var);
        b(this.f83061d, c1Var);
        b(this.f83062e, c1Var);
        b(this.f83063f, c1Var);
        b(this.f83064g, c1Var);
        b(this.f83065h, c1Var);
        b(this.f83066i, c1Var);
        b(this.f83067j, c1Var);
    }

    @Override // qf.p
    public void close() throws IOException {
        p pVar = this.f83068k;
        if (pVar != null) {
            try {
                pVar.close();
            } finally {
                this.f83068k = null;
            }
        }
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        p pVar = this.f83068k;
        return pVar == null ? Collections.EMPTY_MAP : pVar.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        p pVar = this.f83068k;
        if (pVar == null) {
            return null;
        }
        return pVar.getUri();
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        com.google.android.exoplayer2.util.a.checkState(this.f83068k == null);
        Uri uri = tVar.f82992a;
        String scheme = uri.getScheme();
        boolean zIsLocalFileUri = n1.isLocalFileUri(uri);
        Context context = this.f83058a;
        if (zIsLocalFileUri) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f83061d == null) {
                    c0 c0Var = new c0();
                    this.f83061d = c0Var;
                    a(c0Var);
                }
                this.f83068k = this.f83061d;
            } else {
                if (this.f83062e == null) {
                    d dVar = new d(context);
                    this.f83062e = dVar;
                    a(dVar);
                }
                this.f83068k = this.f83062e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f83062e == null) {
                d dVar2 = new d(context);
                this.f83062e = dVar2;
                a(dVar2);
            }
            this.f83068k = this.f83062e;
        } else if ("content".equals(scheme)) {
            if (this.f83063f == null) {
                j jVar = new j(context);
                this.f83063f = jVar;
                a(jVar);
            }
            this.f83068k = this.f83063f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            p pVar = this.f83060c;
            if (zEquals) {
                if (this.f83064g == null) {
                    try {
                        p pVar2 = (p) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f83064g = pVar2;
                        a(pVar2);
                    } catch (ClassNotFoundException unused) {
                        com.google.android.exoplayer2.util.f0.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f83064g == null) {
                        this.f83064g = pVar;
                    }
                }
                this.f83068k = this.f83064g;
            } else if ("udp".equals(scheme)) {
                if (this.f83065h == null) {
                    d1 d1Var = new d1();
                    this.f83065h = d1Var;
                    a(d1Var);
                }
                this.f83068k = this.f83065h;
            } else if ("data".equals(scheme)) {
                if (this.f83066i == null) {
                    l lVar = new l();
                    this.f83066i = lVar;
                    a(lVar);
                }
                this.f83068k = this.f83066i;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f83067j == null) {
                    x0 x0Var = new x0(context);
                    this.f83067j = x0Var;
                    a(x0Var);
                }
                this.f83068k = this.f83067j;
            } else {
                this.f83068k = pVar;
            }
        }
        return this.f83068k.open(tVar);
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((p) com.google.android.exoplayer2.util.a.checkNotNull(this.f83068k)).read(bArr, i10, i11);
    }

    public y(Context context, String str, boolean z10) {
        this(context, str, 8000, 8000, z10);
    }

    public y(Context context, String str, int i10, int i11, boolean z10) {
        this(context, new z.a().setUserAgent(str).setConnectTimeoutMs(i10).setReadTimeoutMs(i11).setAllowCrossProtocolRedirects(z10).createDataSource());
    }

    public y(Context context, p pVar) {
        this.f83058a = context.getApplicationContext();
        this.f83060c = (p) com.google.android.exoplayer2.util.a.checkNotNull(pVar);
        this.f83059b = new ArrayList();
    }
}
