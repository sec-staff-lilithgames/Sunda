package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.thrid.okhttp.internal.http2.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements Closeable {
    static final /* synthetic */ boolean A = true;

    /* renamed from: z, reason: collision with root package name */
    private static final ExecutorService f43482z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Http2Connection", true));

    /* renamed from: a, reason: collision with root package name */
    final boolean f43483a;

    /* renamed from: b, reason: collision with root package name */
    final j f43484b;

    /* renamed from: d, reason: collision with root package name */
    final String f43486d;

    /* renamed from: e, reason: collision with root package name */
    int f43487e;

    /* renamed from: f, reason: collision with root package name */
    int f43488f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43489g;

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledExecutorService f43490h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f43491i;

    /* renamed from: j, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.l f43492j;

    /* renamed from: s, reason: collision with root package name */
    long f43501s;

    /* renamed from: u, reason: collision with root package name */
    final m f43503u;

    /* renamed from: v, reason: collision with root package name */
    final Socket f43504v;

    /* renamed from: w, reason: collision with root package name */
    final com.mbridge.msdk.thrid.okhttp.internal.http2.j f43505w;

    /* renamed from: x, reason: collision with root package name */
    final l f43506x;

    /* renamed from: y, reason: collision with root package name */
    final Set<Integer> f43507y;

    /* renamed from: c, reason: collision with root package name */
    final Map<Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> f43485c = new LinkedHashMap();

    /* renamed from: k, reason: collision with root package name */
    private long f43493k = 0;

    /* renamed from: l, reason: collision with root package name */
    private long f43494l = 0;

    /* renamed from: m, reason: collision with root package name */
    private long f43495m = 0;

    /* renamed from: n, reason: collision with root package name */
    private long f43496n = 0;

    /* renamed from: o, reason: collision with root package name */
    private long f43497o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f43498p = 0;

    /* renamed from: q, reason: collision with root package name */
    private long f43499q = 0;

    /* renamed from: r, reason: collision with root package name */
    long f43500r = 0;

    /* renamed from: t, reason: collision with root package name */
    m f43502t = new m();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f43509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f43508b = i10;
            this.f43509c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.b(this.f43508b, this.f43509c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f43512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i10, long j10) {
            super(str, objArr);
            this.f43511b = i10;
            this.f43512c = j10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                g.this.f43505w.a(this.f43511b, this.f43512c);
            } catch (IOException unused) {
                g.this.h();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(false, 2, 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43515b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f43516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i10, List list) {
            super(str, objArr);
            this.f43515b = i10;
            this.f43516c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            if (g.this.f43492j.a(this.f43515b, this.f43516c)) {
                try {
                    g.this.f43505w.a(this.f43515b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f43507y.remove(Integer.valueOf(this.f43515b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43518b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f43519c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f43520d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i10, List list, boolean z10) {
            super(str, objArr);
            this.f43518b = i10;
            this.f43519c = list;
            this.f43520d = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean zA = g.this.f43492j.a(this.f43518b, this.f43519c, this.f43520d);
            if (zA) {
                try {
                    g.this.f43505w.a(this.f43518b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zA || this.f43520d) {
                synchronized (g.this) {
                    g.this.f43507y.remove(Integer.valueOf(this.f43518b));
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43522b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okio.c f43523c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43524d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f43525e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11, boolean z10) {
            super(str, objArr);
            this.f43522b = i10;
            this.f43523c = cVar;
            this.f43524d = i11;
            this.f43525e = z10;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            try {
                boolean zA = g.this.f43492j.a(this.f43522b, this.f43523c, this.f43524d, this.f43525e);
                if (zA) {
                    g.this.f43505w.a(this.f43522b, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                }
                if (zA || this.f43525e) {
                    synchronized (g.this) {
                        g.this.f43507y.remove(Integer.valueOf(this.f43522b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g, reason: collision with other inner class name */
    public class C0333g extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f43527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.b f43528c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0333g(String str, Object[] objArr, int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            super(str, objArr);
            this.f43527b = i10;
            this.f43528c = bVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.f43492j.a(this.f43527b, this.f43528c);
            synchronized (g.this) {
                g.this.f43507y.remove(Integer.valueOf(this.f43527b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class i extends com.mbridge.msdk.thrid.okhttp.internal.b {
        public i() {
            super("OkHttp %s ping", g.this.f43486d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            boolean z10;
            synchronized (g.this) {
                if (g.this.f43494l < g.this.f43493k) {
                    z10 = true;
                } else {
                    g.e(g.this);
                    z10 = false;
                }
            }
            if (z10) {
                g.this.h();
            } else {
                g.this.a(false, 1, 0);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        public static final j f43539a = new a();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a extends j {
            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
            public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
                iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
            }
        }

        public void a(g gVar) {
        }

        public abstract void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class k extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* renamed from: b, reason: collision with root package name */
        final boolean f43540b;

        /* renamed from: c, reason: collision with root package name */
        final int f43541c;

        /* renamed from: d, reason: collision with root package name */
        final int f43542d;

        public k(boolean z10, int i10, int i11) {
            super("OkHttp %s ping %08x%08x", g.this.f43486d, Integer.valueOf(i10), Integer.valueOf(i11));
            this.f43540b = z10;
            this.f43541c = i10;
            this.f43542d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            g.this.a(this.f43540b, this.f43541c, this.f43542d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l extends com.mbridge.msdk.thrid.okhttp.internal.b implements h.b {

        /* renamed from: b, reason: collision with root package name */
        final com.mbridge.msdk.thrid.okhttp.internal.http2.h f43544b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.mbridge.msdk.thrid.okhttp.internal.http2.i f43546b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) {
                super(str, objArr);
                this.f43546b = iVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                try {
                    g.this.f43484b.a(this.f43546b);
                } catch (IOException e10) {
                    com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Http2Connection.Listener failure for " + g.this.f43486d, e10);
                    try {
                        this.f43546b.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f43548b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m f43549c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, boolean z10, m mVar) {
                super(str, objArr);
                this.f43548b = z10;
                this.f43549c = mVar;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                l.this.b(this.f43548b, this.f43549c);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class c extends com.mbridge.msdk.thrid.okhttp.internal.b {
            public c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.b
            public void b() {
                g gVar = g.this;
                gVar.f43484b.a(gVar);
            }
        }

        public l(com.mbridge.msdk.thrid.okhttp.internal.http2.h hVar) {
            super("OkHttp %s", g.this.f43486d);
            this.f43544b = hVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() throws Throwable {
            Throwable th2;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar;
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.INTERNAL_ERROR;
            try {
                try {
                    this.f43544b.a(this);
                    while (this.f43544b.a(false, (h.b) this)) {
                    }
                    bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR;
                    try {
                        try {
                            g.this.a(bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
                        } catch (IOException unused) {
                            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar3 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
                            g.this.a(bVar3, bVar3);
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43544b);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            g.this.a(bVar, bVar2);
                        } catch (IOException unused2) {
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43544b);
                        throw th2;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                bVar = bVar2;
            } catch (Throwable th4) {
                th2 = th4;
                bVar = bVar2;
                g.this.a(bVar, bVar2);
                com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43544b);
                throw th2;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f43544b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, int i12, boolean z10) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11) throws IOException {
            if (g.this.b(i10)) {
                g.this.a(i10, eVar, i11, z10);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA == null) {
                g.this.c(i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR);
                long j10 = i11;
                g.this.g(j10);
                eVar.skip(j10);
                return;
            }
            iVarA.a(eVar, i11);
            if (z10) {
                iVarA.i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
            if (g.this.b(i10)) {
                g.this.b(i10, list, z10);
                return;
            }
            synchronized (g.this) {
                try {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
                    if (iVarA == null) {
                        if (g.this.f43489g) {
                            return;
                        }
                        g gVar = g.this;
                        if (i10 <= gVar.f43487e) {
                            return;
                        }
                        if (i10 % 2 == gVar.f43488f % 2) {
                            return;
                        }
                        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i10, g.this, false, z10, com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
                        g gVar2 = g.this;
                        gVar2.f43487e = i10;
                        gVar2.f43485c.put(Integer.valueOf(i10), iVar);
                        g.f43482z.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f43486d, Integer.valueOf(i10)}, iVar));
                        return;
                    }
                    iVarA.a(list);
                    if (z10) {
                        iVarA.i();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(boolean z10, m mVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            long j10;
            synchronized (g.this.f43505w) {
                synchronized (g.this) {
                    try {
                        int iC = g.this.f43503u.c();
                        if (z10) {
                            g.this.f43503u.a();
                        }
                        g.this.f43503u.a(mVar);
                        int iC2 = g.this.f43503u.c();
                        iVarArr = null;
                        if (iC2 == -1 || iC2 == iC) {
                            j10 = 0;
                        } else {
                            j10 = iC2 - iC;
                            if (!g.this.f43485c.isEmpty()) {
                                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f43485c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f43485c.size()]);
                            }
                        }
                    } finally {
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f43505w.a(gVar.f43503u);
                } catch (IOException unused) {
                    g.this.h();
                }
            }
            if (iVarArr != null) {
                for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(j10);
                    }
                }
            }
            g.f43482z.execute(new c("OkHttp %s settings", g.this.f43486d));
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
            if (g.this.b(i10)) {
                g.this.a(i10, bVar);
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarC = g.this.c(i10);
            if (iVarC != null) {
                iVarC.d(bVar);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, m mVar) {
            try {
                g.this.f43490h.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f43486d}, z10, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(boolean z10, int i10, int i11) {
            if (!z10) {
                try {
                    g.this.f43490h.execute(g.this.new k(true, i10, i11));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i10 == 1) {
                        g.c(g.this);
                    } else if (i10 == 2) {
                        g.h(g.this);
                    } else if (i10 == 3) {
                        g.i(g.this);
                        g.this.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okio.f fVar) {
            com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr;
            fVar.e();
            synchronized (g.this) {
                iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) g.this.f43485c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[g.this.f43485c.size()]);
                g.this.f43489g = true;
            }
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                if (iVar.c() > i10 && iVar.f()) {
                    iVar.d(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                    g.this.c(iVar.c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, long j10) {
            if (i10 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f43501s += j10;
                    gVar.notifyAll();
                }
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarA = g.this.a(i10);
            if (iVarA != null) {
                synchronized (iVarA) {
                    iVarA.a(j10);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.h.b
        public void a(int i10, int i11, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) throws Throwable {
            g.this.a(i11, list);
        }
    }

    public g(h hVar) {
        m mVar = new m();
        this.f43503u = mVar;
        this.f43507y = new LinkedHashSet();
        this.f43492j = hVar.f43535f;
        boolean z10 = hVar.f43536g;
        this.f43483a = z10;
        this.f43484b = hVar.f43534e;
        int i10 = z10 ? 1 : 2;
        this.f43488f = i10;
        if (z10) {
            this.f43488f = i10 + 2;
        }
        if (z10) {
            this.f43502t.a(7, 16777216);
        }
        String str = hVar.f43531b;
        this.f43486d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Writer", str), false));
        this.f43490h = scheduledThreadPoolExecutor;
        if (hVar.f43537h != 0) {
            i iVar = new i();
            long j10 = hVar.f43537h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j10, j10, TimeUnit.MILLISECONDS);
        }
        this.f43491i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a(com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp %s Push Observer", str), true));
        mVar.a(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        mVar.a(5, 16384);
        this.f43501s = mVar.c();
        this.f43504v = hVar.f43530a;
        this.f43505w = new com.mbridge.msdk.thrid.okhttp.internal.http2.j(hVar.f43533d, z10);
        this.f43506x = new l(new com.mbridge.msdk.thrid.okhttp.internal.http2.h(hVar.f43532c, z10));
    }

    public static /* synthetic */ long c(g gVar) {
        long j10 = gVar.f43494l;
        gVar.f43494l = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long e(g gVar) {
        long j10 = gVar.f43493k;
        gVar.f43493k = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long h(g gVar) {
        long j10 = gVar.f43496n;
        gVar.f43496n = 1 + j10;
        return j10;
    }

    public static /* synthetic */ long i(g gVar) {
        long j10 = gVar.f43498p;
        gVar.f43498p = 1 + j10;
        return j10;
    }

    public boolean b(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.NO_ERROR, com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f43505w.flush();
    }

    public synchronized int k() {
        return this.f43503u.b(Integer.MAX_VALUE);
    }

    public void l() {
        synchronized (this) {
            try {
                long j10 = this.f43496n;
                long j11 = this.f43495m;
                if (j10 < j11) {
                    return;
                }
                this.f43495m = j11 + 1;
                this.f43499q = System.nanoTime() + C.NANOS_PER_SECOND;
                try {
                    this.f43490h.execute(new c("OkHttp %s ping", this.f43486d));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m() throws IOException {
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR;
            a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i c(int i10) {
        com.mbridge.msdk.thrid.okhttp.internal.http2.i iVarRemove;
        iVarRemove = this.f43485c.remove(Integer.valueOf(i10));
        notifyAll();
        return iVarRemove;
    }

    public synchronized boolean f(long j10) {
        if (this.f43489g) {
            return false;
        }
        if (this.f43496n < this.f43495m) {
            if (j10 >= this.f43499q) {
                return false;
            }
        }
        return true;
    }

    public synchronized void g(long j10) {
        long j11 = this.f43500r + j10;
        this.f43500r = j11;
        if (j11 >= this.f43502t.c() / 2) {
            a(0, this.f43500r);
            this.f43500r = 0L;
        }
    }

    public synchronized com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10) {
        return this.f43485c.get(Integer.valueOf(i10));
    }

    public void b(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        this.f43505w.a(i10, bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        Socket f43530a;

        /* renamed from: b, reason: collision with root package name */
        String f43531b;

        /* renamed from: c, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.e f43532c;

        /* renamed from: d, reason: collision with root package name */
        com.mbridge.msdk.thrid.okio.d f43533d;

        /* renamed from: e, reason: collision with root package name */
        j f43534e = j.f43539a;

        /* renamed from: f, reason: collision with root package name */
        com.mbridge.msdk.thrid.okhttp.internal.http2.l f43535f = com.mbridge.msdk.thrid.okhttp.internal.http2.l.f43602a;

        /* renamed from: g, reason: collision with root package name */
        boolean f43536g;

        /* renamed from: h, reason: collision with root package name */
        int f43537h;

        public h(boolean z10) {
            this.f43536g = z10;
        }

        public h a(Socket socket, String str, com.mbridge.msdk.thrid.okio.e eVar, com.mbridge.msdk.thrid.okio.d dVar) {
            this.f43530a = socket;
            this.f43531b = str;
            this.f43532c = eVar;
            this.f43533d = dVar;
            return this;
        }

        public h a(j jVar) {
            this.f43534e = jVar;
            return this;
        }

        public h a(int i10) {
            this.f43537h = i10;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http2.i a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws IOException {
        return a(0, list, z10);
    }

    public void b(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) {
        try {
            try {
                a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f43486d, Integer.valueOf(i10)}, i10, list, z10));
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    public void c(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        try {
            this.f43490h.execute(new a("OkHttp %s stream %d", new Object[]{this.f43486d, Integer.valueOf(i10)}, i10, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    private com.mbridge.msdk.thrid.okhttp.internal.http2.i a(int i10, List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.f43505w) {
            try {
                try {
                    try {
                        synchronized (this) {
                            try {
                                if (this.f43488f > 1073741823) {
                                    try {
                                        a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        throw th2;
                                    }
                                }
                                if (!this.f43489g) {
                                    int i11 = this.f43488f;
                                    this.f43488f = i11 + 2;
                                    com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar = new com.mbridge.msdk.thrid.okhttp.internal.http2.i(i11, this, z11, false, null);
                                    boolean z12 = !z10 || this.f43501s == 0 || iVar.f43565b == 0;
                                    if (iVar.g()) {
                                        this.f43485c.put(Integer.valueOf(i11), iVar);
                                    }
                                    if (i10 == 0) {
                                        this.f43505w.a(z11, i11, i10, list);
                                    } else if (!this.f43483a) {
                                        this.f43505w.a(i10, i11, list);
                                    } else {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    if (z12) {
                                        this.f43505w.flush();
                                    }
                                    return iVar;
                                }
                                throw new com.mbridge.msdk.thrid.okhttp.internal.http2.a();
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f43505w.h());
        r6 = r2;
        r8.f43501s -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, boolean r10, com.mbridge.msdk.thrid.okio.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r12 = r8.f43505w
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r4 = r8.f43501s     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.Map<java.lang.Integer, com.mbridge.msdk.thrid.okhttp.internal.http2.i> r2 = r8.f43485c     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            goto L12
        L28:
            r9 = move-exception
            goto L65
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L58
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f43505w     // Catch: java.lang.Throwable -> L28
            int r4 = r4.h()     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.f43501s     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.f43501s = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            com.mbridge.msdk.thrid.okhttp.internal.http2.j r4 = r8.f43505w
            if (r10 == 0) goto L53
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = r3
        L54:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, boolean, com.mbridge.msdk.thrid.okio.c, long):void");
    }

    public void a(int i10, long j10) {
        try {
            this.f43490h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f43486d, Integer.valueOf(i10)}, i10, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public void a(boolean z10, int i10, int i11) {
        try {
            this.f43505w.a(z10, i10, i11);
        } catch (IOException unused) {
            h();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        synchronized (this.f43505w) {
            synchronized (this) {
                if (this.f43489g) {
                    return;
                }
                this.f43489g = true;
                this.f43505w.a(this.f43487e, bVar, com.mbridge.msdk.thrid.okhttp.internal.c.f43287a);
            }
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar2) throws IOException {
        if (!A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.i[] iVarArr = null;
        try {
            a(bVar);
            e = null;
        } catch (IOException e10) {
            e = e10;
        }
        synchronized (this) {
            try {
                if (!this.f43485c.isEmpty()) {
                    iVarArr = (com.mbridge.msdk.thrid.okhttp.internal.http2.i[]) this.f43485c.values().toArray(new com.mbridge.msdk.thrid.okhttp.internal.http2.i[this.f43485c.size()]);
                    this.f43485c.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iVarArr != null) {
            for (com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar : iVarArr) {
                try {
                    iVar.a(bVar2);
                } catch (IOException e11) {
                    if (e != null) {
                        e = e11;
                    }
                }
            }
        }
        try {
            this.f43505w.close();
        } catch (IOException e12) {
            if (e == null) {
                e = e12;
            }
        }
        try {
            this.f43504v.close();
        } catch (IOException e13) {
            e = e13;
        }
        this.f43490h.shutdown();
        this.f43491i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void a(boolean z10) throws IOException {
        if (z10) {
            this.f43505w.d();
            this.f43505w.b(this.f43502t);
            if (this.f43502t.c() != 65535) {
                this.f43505w.a(0, r5 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        new Thread(this.f43506x).start();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0041
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f43507y     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L3f
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f43507y     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L3c
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f43486d     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1}     // Catch: java.util.concurrent.RejectedExecutionException -> L3a
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            r8.a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L3b
            return
        L3a:
            r3 = r8
        L3b:
            return
        L3c:
            r0 = move-exception
            r3 = r8
        L3e:
            r9 = r0
        L3f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
            throw r9
        L41:
            r0 = move-exception
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.g.a(int, java.util.List):void");
    }

    public void a(int i10, com.mbridge.msdk.thrid.okio.e eVar, int i11, boolean z10) throws IOException {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        long j10 = i11;
        eVar.e(j10);
        eVar.b(cVar, j10);
        if (cVar.size() == j10) {
            a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f43486d, Integer.valueOf(i10)}, i10, cVar, i11, z10));
            return;
        }
        throw new IOException(cVar.size() + " != " + i11);
    }

    public void a(int i10, com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        a(new C0333g("OkHttp %s Push Reset[%s]", new Object[]{this.f43486d, Integer.valueOf(i10)}, i10, bVar));
    }

    private synchronized void a(com.mbridge.msdk.thrid.okhttp.internal.b bVar) {
        if (!this.f43489g) {
            this.f43491i.execute(bVar);
        }
    }
}
