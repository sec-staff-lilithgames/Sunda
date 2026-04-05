package fw;

import androidx.lifecycle.x0;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import fw.q;
import j1.o2;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.z0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.h0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements Closeable {
    public static final b F = new b(null);
    public static final d0 G;
    public long A;
    public final Socket B;
    public final y C;
    public final d D;
    public final LinkedHashSet E;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56194b;

    /* renamed from: c, reason: collision with root package name */
    public final c f56195c;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f56196e;

    /* renamed from: f, reason: collision with root package name */
    public final String f56197f;

    /* renamed from: g, reason: collision with root package name */
    public int f56198g;

    /* renamed from: h, reason: collision with root package name */
    public int f56199h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56200i;

    /* renamed from: j, reason: collision with root package name */
    public final bw.g f56201j;

    /* renamed from: k, reason: collision with root package name */
    public final bw.c f56202k;

    /* renamed from: l, reason: collision with root package name */
    public final bw.c f56203l;

    /* renamed from: m, reason: collision with root package name */
    public final bw.c f56204m;

    /* renamed from: n, reason: collision with root package name */
    public final c0 f56205n;

    /* renamed from: o, reason: collision with root package name */
    public long f56206o;

    /* renamed from: p, reason: collision with root package name */
    public long f56207p;

    /* renamed from: q, reason: collision with root package name */
    public long f56208q;

    /* renamed from: r, reason: collision with root package name */
    public long f56209r;

    /* renamed from: s, reason: collision with root package name */
    public long f56210s;

    /* renamed from: t, reason: collision with root package name */
    public long f56211t;

    /* renamed from: u, reason: collision with root package name */
    public long f56212u;

    /* renamed from: v, reason: collision with root package name */
    public final e f56213v;

    /* renamed from: w, reason: collision with root package name */
    public final d0 f56214w;

    /* renamed from: x, reason: collision with root package name */
    public d0 f56215x;

    /* renamed from: y, reason: collision with root package name */
    public final gw.a f56216y;

    /* renamed from: z, reason: collision with root package name */
    public long f56217z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f56218a;

        /* renamed from: b, reason: collision with root package name */
        public final bw.g f56219b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f56220c;

        /* renamed from: d, reason: collision with root package name */
        public String f56221d;

        /* renamed from: e, reason: collision with root package name */
        public pw.k f56222e;

        /* renamed from: f, reason: collision with root package name */
        public pw.j f56223f;

        /* renamed from: g, reason: collision with root package name */
        public c f56224g;

        /* renamed from: h, reason: collision with root package name */
        public c0 f56225h;

        /* renamed from: i, reason: collision with root package name */
        public int f56226i;

        /* renamed from: j, reason: collision with root package name */
        public e f56227j;

        public a(boolean z10, bw.g taskRunner) {
            kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
            this.f56218a = z10;
            this.f56219b = taskRunner;
            this.f56224g = c.f56228a;
            this.f56225h = c0.f56132a;
            this.f56227j = fw.d.f56133a;
        }

        public static /* synthetic */ a socket$default(a aVar, Socket socket, String str, pw.k kVar, pw.j jVar, int i10, Object obj) throws IOException {
            if ((i10 & 2) != 0) {
                str = yv.i.peerName(socket);
            }
            if ((i10 & 4) != 0) {
                kVar = h0.buffer(h0.source(socket));
            }
            if ((i10 & 8) != 0) {
                jVar = h0.buffer(h0.sink(socket));
            }
            return aVar.socket(socket, str, kVar, jVar);
        }

        public final q build() {
            return new q(this);
        }

        public final a flowControlListener(e flowControlListener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(flowControlListener, "flowControlListener");
            this.f56227j = flowControlListener;
            return this;
        }

        public final boolean getClient$okhttp() {
            return this.f56218a;
        }

        public final String getConnectionName$okhttp() {
            String str = this.f56221d;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final e getFlowControlListener$okhttp() {
            return this.f56227j;
        }

        public final c getListener$okhttp() {
            return this.f56224g;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.f56226i;
        }

        public final c0 getPushObserver$okhttp() {
            return this.f56225h;
        }

        public final pw.j getSink$okhttp() {
            pw.j jVar = this.f56223f;
            if (jVar != null) {
                return jVar;
            }
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket = this.f56220c;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final pw.k getSource$okhttp() {
            pw.k kVar = this.f56222e;
            if (kVar != null) {
                return kVar;
            }
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final bw.g getTaskRunner$okhttp() {
            return this.f56219b;
        }

        public final a listener(c listener) {
            kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
            this.f56224g = listener;
            return this;
        }

        public final a pingIntervalMillis(int i10) {
            this.f56226i = i10;
            return this;
        }

        public final a pushObserver(c0 pushObserver) {
            kotlin.jvm.internal.e0.checkNotNullParameter(pushObserver, "pushObserver");
            this.f56225h = pushObserver;
            return this;
        }

        public final void setClient$okhttp(boolean z10) {
            this.f56218a = z10;
        }

        public final void setConnectionName$okhttp(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
            this.f56221d = str;
        }

        public final void setFlowControlListener$okhttp(e eVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<set-?>");
            this.f56227j = eVar;
        }

        public final void setListener$okhttp(c cVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(cVar, "<set-?>");
            this.f56224g = cVar;
        }

        public final void setPingIntervalMillis$okhttp(int i10) {
            this.f56226i = i10;
        }

        public final void setPushObserver$okhttp(c0 c0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<set-?>");
            this.f56225h = c0Var;
        }

        public final void setSink$okhttp(pw.j jVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(jVar, "<set-?>");
            this.f56223f = jVar;
        }

        public final void setSocket$okhttp(Socket socket) {
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "<set-?>");
            this.f56220c = socket;
        }

        public final void setSource$okhttp(pw.k kVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<set-?>");
            this.f56222e = kVar;
        }

        public final a socket(Socket socket) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
            return socket$default(this, socket, null, null, null, 14, null);
        }

        public final a socket(Socket socket, String peerName) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.e0.checkNotNullParameter(peerName, "peerName");
            return socket$default(this, socket, peerName, null, null, 12, null);
        }

        public final a socket(Socket socket, String peerName, pw.k source) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.e0.checkNotNullParameter(peerName, "peerName");
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            return socket$default(this, socket, peerName, source, null, 8, null);
        }

        public final a socket(Socket socket, String peerName, pw.k source, pw.j sink) throws IOException {
            String strK;
            kotlin.jvm.internal.e0.checkNotNullParameter(socket, "socket");
            kotlin.jvm.internal.e0.checkNotNullParameter(peerName, "peerName");
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
            setSocket$okhttp(socket);
            if (this.f56218a) {
                strK = yv.i.f96668b + ' ' + peerName;
            } else {
                strK = a.b.k("MockWebServer ", peerName);
            }
            setConnectionName$okhttp(strK);
            setSource$okhttp(source);
            setSink$okhttp(sink);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final d0 getDEFAULT_SETTINGS() {
            return q.G;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public static final r f56228a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }
        }

        static {
            new a(null);
            f56228a = new r();
        }

        public void onSettings(q connection, d0 settings) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
        }

        public abstract void onStream(x xVar) throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements w, kv.a {

        /* renamed from: b, reason: collision with root package name */
        public final v f56229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f56230c;

        public d(q qVar, v reader) {
            kotlin.jvm.internal.e0.checkNotNullParameter(reader, "reader");
            this.f56230c = qVar;
            this.f56229b = reader;
        }

        @Override // fw.w
        public void alternateService(int i10, String origin, pw.l protocol, String host, int i11, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(origin, "origin");
            kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
            kotlin.jvm.internal.e0.checkNotNullParameter(host, "host");
        }

        public final void applyAndAckSettings(boolean z10, d0 d0Var) {
            long initialWindowSize;
            int i10;
            x[] xVarArr;
            d0 settings = d0Var;
            kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
            b1 b1Var = new b1();
            y writer = this.f56230c.getWriter();
            q qVar = this.f56230c;
            synchronized (writer) {
                synchronized (qVar) {
                    try {
                        d0 peerSettings = qVar.getPeerSettings();
                        if (!z10) {
                            d0 d0Var2 = new d0();
                            d0Var2.merge(peerSettings);
                            d0Var2.merge(settings);
                            settings = d0Var2;
                        }
                        b1Var.f71816b = settings;
                        initialWindowSize = settings.getInitialWindowSize() - peerSettings.getInitialWindowSize();
                        xVarArr = (initialWindowSize == 0 || qVar.getStreams$okhttp().isEmpty()) ? null : (x[]) qVar.getStreams$okhttp().values().toArray(new x[0]);
                        qVar.setPeerSettings((d0) b1Var.f71816b);
                        bw.c.execute$default(qVar.f56204m, qVar.getConnectionName$okhttp() + " onSettings", 0L, false, new x0(10, qVar, b1Var), 6, null);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    qVar.getWriter().applyAndAckSettings((d0) b1Var.f71816b);
                } catch (IOException e10) {
                    q.access$failConnection(qVar, e10);
                }
            }
            if (xVarArr != null) {
                for (x xVar : xVarArr) {
                    synchronized (xVar) {
                        xVar.addBytesToWriteWindow(initialWindowSize);
                    }
                }
            }
        }

        @Override // fw.w
        public void data(boolean z10, int i10, pw.k source, int i11) throws IOException {
            kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
            q qVar = this.f56230c;
            if (qVar.pushedStream$okhttp(i10)) {
                qVar.pushDataLater$okhttp(i10, source, i11, z10);
                return;
            }
            x stream = qVar.getStream(i10);
            if (stream == null) {
                qVar.writeSynResetLater$okhttp(i10, fw.c.f56124f);
                long j10 = i11;
                qVar.updateConnectionFlowControl$okhttp(j10);
                source.skip(j10);
                return;
            }
            stream.receiveData(source, i11);
            if (z10) {
                stream.receiveHeaders(f0.f93622e, true);
            }
        }

        public final v getReader$okhttp() {
            return this.f56229b;
        }

        @Override // fw.w
        public void goAway(int i10, fw.c errorCode, pw.l debugData) {
            int i11;
            Object[] array;
            kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
            kotlin.jvm.internal.e0.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            q qVar = this.f56230c;
            synchronized (qVar) {
                array = qVar.getStreams$okhttp().values().toArray(new x[0]);
                qVar.f56200i = true;
            }
            for (x xVar : (x[]) array) {
                if (xVar.getId() > i10 && xVar.isLocallyInitiated()) {
                    xVar.receiveRstStream(fw.c.f56127i);
                    this.f56230c.removeStream$okhttp(xVar.getId());
                }
            }
        }

        @Override // fw.w
        public void headers(boolean z10, int i10, int i11, List<f> headerBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f56230c.pushedStream$okhttp(i10)) {
                this.f56230c.pushHeadersLater$okhttp(i10, headerBlock, z10);
                return;
            }
            q qVar = this.f56230c;
            synchronized (qVar) {
                x stream = qVar.getStream(i10);
                if (stream != null) {
                    stream.receiveHeaders(yv.i.toHeaders(headerBlock), z10);
                    return;
                }
                if (qVar.f56200i) {
                    return;
                }
                if (i10 <= qVar.getLastGoodStreamId$okhttp()) {
                    return;
                }
                if (i10 % 2 == qVar.getNextStreamId$okhttp() % 2) {
                    return;
                }
                x xVar = new x(i10, qVar, false, z10, yv.i.toHeaders(headerBlock));
                qVar.setLastGoodStreamId$okhttp(i10);
                qVar.getStreams$okhttp().put(Integer.valueOf(i10), xVar);
                bw.c.execute$default(qVar.f56201j.newQueue(), qVar.getConnectionName$okhttp() + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onStream", 0L, false, new x0(9, qVar, xVar), 6, null);
            }
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m3840invoke();
            return tu.x0.f87415a;
        }

        @Override // fw.w
        public void ping(boolean z10, final int i10, final int i11) {
            if (!z10) {
                bw.c cVar = this.f56230c.f56202k;
                String str = this.f56230c.getConnectionName$okhttp() + " ping";
                final q qVar = this.f56230c;
                bw.c.execute$default(cVar, str, 0L, false, new kv.a() { // from class: fw.s
                    @Override // kv.a
                    public final Object invoke() {
                        qVar.writePing(true, i10, i11);
                        return tu.x0.f87415a;
                    }
                }, 6, null);
                return;
            }
            q qVar2 = this.f56230c;
            synchronized (qVar2) {
                try {
                    if (i10 == 1) {
                        qVar2.f56207p++;
                    } else if (i10 == 2) {
                        qVar2.f56209r++;
                    } else if (i10 == 3) {
                        qVar2.f56211t++;
                        kotlin.jvm.internal.e0.checkNotNull(qVar2, "null cannot be cast to non-null type java.lang.Object");
                        qVar2.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // fw.w
        public void pushPromise(int i10, int i11, List<f> requestHeaders) {
            kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f56230c.pushRequestLater$okhttp(i11, requestHeaders);
        }

        @Override // fw.w
        public void rstStream(int i10, fw.c errorCode) {
            kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
            q qVar = this.f56230c;
            if (qVar.pushedStream$okhttp(i10)) {
                qVar.pushResetLater$okhttp(i10, errorCode);
                return;
            }
            x xVarRemoveStream$okhttp = qVar.removeStream$okhttp(i10);
            if (xVarRemoveStream$okhttp != null) {
                xVarRemoveStream$okhttp.receiveRstStream(errorCode);
            }
        }

        @Override // fw.w
        public void settings(final boolean z10, final d0 settings) {
            kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
            q qVar = this.f56230c;
            bw.c.execute$default(qVar.f56202k, qVar.getConnectionName$okhttp() + " applyAndAckSettings", 0L, false, new kv.a() { // from class: fw.t
                @Override // kv.a
                public final Object invoke() {
                    this.f56234b.applyAndAckSettings(z10, settings);
                    return tu.x0.f87415a;
                }
            }, 6, null);
        }

        @Override // fw.w
        public void windowUpdate(int i10, long j10) {
            if (i10 == 0) {
                q qVar = this.f56230c;
                synchronized (qVar) {
                    qVar.A = qVar.getWriteBytesMaximum() + j10;
                    kotlin.jvm.internal.e0.checkNotNull(qVar, "null cannot be cast to non-null type java.lang.Object");
                    qVar.notifyAll();
                }
                return;
            }
            x stream = this.f56230c.getStream(i10);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j10);
                }
            }
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public void m3840invoke() throws Throwable {
            fw.c cVar;
            q qVar = this.f56230c;
            v vVar = this.f56229b;
            fw.c cVar2 = fw.c.f56125g;
            IOException e10 = null;
            try {
                try {
                    vVar.readConnectionPreface(this);
                    while (vVar.nextFrame(false, this)) {
                    }
                    cVar = fw.c.f56123e;
                    try {
                        cVar2 = fw.c.f56128j;
                        qVar.close$okhttp(cVar, cVar2, null);
                    } catch (IOException e11) {
                        e10 = e11;
                        cVar2 = fw.c.f56124f;
                        qVar.close$okhttp(cVar2, cVar2, e10);
                        yv.h.closeQuietly(vVar);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    qVar.close$okhttp(cVar, cVar2, e10);
                    yv.h.closeQuietly(vVar);
                    throw th;
                }
            } catch (IOException e12) {
                e10 = e12;
                cVar = cVar2;
            } catch (Throwable th3) {
                th = th3;
                cVar = cVar2;
                qVar.close$okhttp(cVar, cVar2, e10);
                yv.h.closeQuietly(vVar);
                throw th;
            }
            yv.h.closeQuietly(vVar);
        }

        @Override // fw.w
        public void ackSettings() {
        }

        @Override // fw.w
        public void priority(int i10, int i11, int i12, boolean z10) {
        }
    }

    static {
        d0 d0Var = new d0();
        d0Var.set(4, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        d0Var.set(5, 16384);
        G = d0Var;
    }

    public q(a builder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(builder, "builder");
        boolean client$okhttp = builder.getClient$okhttp();
        this.f56194b = client$okhttp;
        this.f56195c = builder.getListener$okhttp();
        this.f56196e = new LinkedHashMap();
        String connectionName$okhttp = builder.getConnectionName$okhttp();
        this.f56197f = connectionName$okhttp;
        this.f56199h = builder.getClient$okhttp() ? 3 : 2;
        bw.g taskRunner$okhttp = builder.getTaskRunner$okhttp();
        this.f56201j = taskRunner$okhttp;
        bw.c cVarNewQueue = taskRunner$okhttp.newQueue();
        this.f56202k = cVarNewQueue;
        this.f56203l = taskRunner$okhttp.newQueue();
        this.f56204m = taskRunner$okhttp.newQueue();
        this.f56205n = builder.getPushObserver$okhttp();
        this.f56213v = builder.getFlowControlListener$okhttp();
        d0 d0Var = new d0();
        if (builder.getClient$okhttp()) {
            d0Var.set(4, 16777216);
        }
        this.f56214w = d0Var;
        this.f56215x = G;
        this.f56216y = new gw.a(0);
        this.A = this.f56215x.getInitialWindowSize();
        this.B = builder.getSocket$okhttp();
        this.C = new y(builder.getSink$okhttp(), client$okhttp);
        this.D = new d(this, new v(builder.getSource$okhttp(), client$okhttp));
        this.E = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis$okhttp());
            cVarNewQueue.schedule(o2.l(connectionName$okhttp, " ping"), nanos, new l(this, nanos, 0));
        }
    }

    public static final void access$failConnection(q qVar, IOException iOException) {
        qVar.getClass();
        fw.c cVar = fw.c.f56124f;
        qVar.close$okhttp(cVar, cVar, iOException);
    }

    public static /* synthetic */ void start$default(q qVar, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        qVar.start(z10);
    }

    public final x a(int i10, List list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.C) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f56199h > 1073741823) {
                                try {
                                    shutdown(fw.c.f56127i);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            try {
                                if (this.f56200i) {
                                    throw new fw.a();
                                }
                                int i11 = this.f56199h;
                                this.f56199h = i11 + 2;
                                x xVar = new x(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.f56217z >= this.A || xVar.getWriteBytesTotal() >= xVar.getWriteBytesMaximum();
                                if (xVar.isOpen()) {
                                    this.f56196e.put(Integer.valueOf(i11), xVar);
                                }
                                if (i10 == 0) {
                                    this.C.headers(z11, i11, list);
                                } else {
                                    if (this.f56194b) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.C.pushPromise(i10, i11, list);
                                }
                                if (z12) {
                                    this.C.flush();
                                }
                                return xVar;
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                throw th2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public final void awaitPong() throws InterruptedException {
        synchronized (this) {
            while (this.f56211t < this.f56210s) {
                kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        close$okhttp(fw.c.f56123e, fw.c.f56128j, null);
    }

    public final void close$okhttp(fw.c connectionCode, fw.c streamCode, IOException iOException) {
        int i10;
        Object[] array;
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionCode, "connectionCode");
        kotlin.jvm.internal.e0.checkNotNullParameter(streamCode, "streamCode");
        TimeZone timeZone = yv.i.f96667a;
        try {
            shutdown(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f56196e.isEmpty()) {
                array = null;
            } else {
                array = this.f56196e.values().toArray(new x[0]);
                this.f56196e.clear();
            }
        }
        x[] xVarArr = (x[]) array;
        if (xVarArr != null) {
            for (x xVar : xVarArr) {
                try {
                    xVar.close(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.C.close();
        } catch (IOException unused3) {
        }
        try {
            this.B.close();
        } catch (IOException unused4) {
        }
        this.f56202k.shutdown();
        this.f56203l.shutdown();
        this.f56204m.shutdown();
    }

    public final void flush() throws IOException {
        this.C.flush();
    }

    public final boolean getClient$okhttp() {
        return this.f56194b;
    }

    public final String getConnectionName$okhttp() {
        return this.f56197f;
    }

    public final e getFlowControlListener$okhttp() {
        return this.f56213v;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.f56198g;
    }

    public final c getListener$okhttp() {
        return this.f56195c;
    }

    public final int getNextStreamId$okhttp() {
        return this.f56199h;
    }

    public final d0 getOkHttpSettings() {
        return this.f56214w;
    }

    public final d0 getPeerSettings() {
        return this.f56215x;
    }

    public final gw.a getReadBytes() {
        return this.f56216y;
    }

    public final d getReaderRunnable() {
        return this.D;
    }

    public final Socket getSocket$okhttp() {
        return this.B;
    }

    public final x getStream(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f56196e.get(Integer.valueOf(i10));
        }
        return xVar;
    }

    public final Map<Integer, x> getStreams$okhttp() {
        return this.f56196e;
    }

    public final long getWriteBytesMaximum() {
        return this.A;
    }

    public final long getWriteBytesTotal() {
        return this.f56217z;
    }

    public final y getWriter() {
        return this.C;
    }

    public final boolean isHealthy(long j10) {
        synchronized (this) {
            if (this.f56200i) {
                return false;
            }
            if (this.f56209r < this.f56208q) {
                if (j10 >= this.f56212u) {
                    return false;
                }
            }
            return true;
        }
    }

    public final x newStream(List<f> requestHeaders, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        return a(0, requestHeaders, z10);
    }

    public final int openStreamCount() {
        int size;
        synchronized (this) {
            size = this.f56196e.size();
        }
        return size;
    }

    public final void pushDataLater$okhttp(final int i10, pw.k source, final int i11, final boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        final pw.g gVar = new pw.g();
        long j10 = i11;
        source.require(j10);
        source.read(gVar, j10);
        bw.c.execute$default(this.f56203l, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onData", 0L, false, new kv.a() { // from class: fw.k
            @Override // kv.a
            public final Object invoke() {
                q qVar = this.f56171b;
                int i12 = i10;
                pw.g gVar2 = gVar;
                int i13 = i11;
                boolean z11 = z10;
                q.b bVar = q.F;
                try {
                    boolean zOnData = qVar.f56205n.onData(i12, gVar2, i13, z11);
                    if (zOnData) {
                        qVar.C.rstStream(i12, c.f56128j);
                    }
                    if (zOnData || z11) {
                        synchronized (qVar) {
                            qVar.E.remove(Integer.valueOf(i12));
                        }
                    }
                } catch (IOException unused) {
                }
                return tu.x0.f87415a;
            }
        }, 6, null);
    }

    public final void pushHeadersLater$okhttp(final int i10, final List<f> requestHeaders, final boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        bw.c.execute$default(this.f56203l, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onHeaders", 0L, false, new kv.a() { // from class: fw.p
            @Override // kv.a
            public final Object invoke() {
                q qVar = this.f56190b;
                int i11 = i10;
                List<f> list = requestHeaders;
                boolean z11 = z10;
                boolean zOnHeaders = qVar.f56205n.onHeaders(i11, list, z11);
                if (zOnHeaders) {
                    try {
                        qVar.C.rstStream(i11, c.f56128j);
                    } catch (IOException unused) {
                    }
                }
                if (zOnHeaders || z11) {
                    synchronized (qVar) {
                        qVar.E.remove(Integer.valueOf(i11));
                    }
                }
                return tu.x0.f87415a;
            }
        }, 6, null);
    }

    public final void pushRequestLater$okhttp(int i10, List<f> requestHeaders) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.E.contains(Integer.valueOf(i10))) {
                writeSynResetLater$okhttp(i10, fw.c.f56124f);
                return;
            }
            this.E.add(Integer.valueOf(i10));
            bw.c.execute$default(this.f56203l, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onRequest", 0L, false, new o(this, i10, requestHeaders), 6, null);
        }
    }

    public final void pushResetLater$okhttp(int i10, fw.c errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        bw.c.execute$default(this.f56203l, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] onReset", 0L, false, new n(this, i10, errorCode, 1), 6, null);
    }

    public final x pushStream(int i10, List<f> requestHeaders, boolean z10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f56194b) {
            throw new IllegalStateException("Client cannot push requests.");
        }
        return a(i10, requestHeaders, z10);
    }

    public final boolean pushedStream$okhttp(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final x removeStream$okhttp(int i10) {
        x xVar;
        synchronized (this) {
            xVar = (x) this.f56196e.remove(Integer.valueOf(i10));
            kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return xVar;
    }

    public final void sendDegradedPingLater$okhttp() {
        synchronized (this) {
            long j10 = this.f56209r;
            long j11 = this.f56208q;
            if (j10 < j11) {
                return;
            }
            this.f56208q = j11 + 1;
            this.f56212u = System.nanoTime() + Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            bw.c.execute$default(this.f56202k, o2.o(new StringBuilder(), this.f56197f, " ping"), 0L, false, new a1.e(this, 23), 6, null);
        }
    }

    public final void setLastGoodStreamId$okhttp(int i10) {
        this.f56198g = i10;
    }

    public final void setNextStreamId$okhttp(int i10) {
        this.f56199h = i10;
    }

    public final void setPeerSettings(d0 d0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<set-?>");
        this.f56215x = d0Var;
    }

    public final void setSettings(d0 settings) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(settings, "settings");
        synchronized (this.C) {
            synchronized (this) {
                if (this.f56200i) {
                    throw new fw.a();
                }
                this.f56214w.merge(settings);
            }
            this.C.settings(settings);
        }
    }

    public final void shutdown(fw.c statusCode) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.C) {
            z0 z0Var = new z0();
            synchronized (this) {
                if (this.f56200i) {
                    return;
                }
                this.f56200i = true;
                int i10 = this.f56198g;
                z0Var.f71866b = i10;
                this.C.goAway(i10, statusCode, yv.h.f96665a);
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, 1, null);
    }

    public final void updateConnectionFlowControl$okhttp(long j10) {
        synchronized (this) {
            try {
                gw.a.update$default(this.f56216y, j10, 0L, 2, null);
                long unacknowledged = this.f56216y.getUnacknowledged();
                if (unacknowledged >= this.f56214w.getInitialWindowSize() / 2) {
                    writeWindowUpdateLater$okhttp(0, unacknowledged);
                    gw.a.update$default(this.f56216y, 0L, unacknowledged, 1, null);
                }
                ((fw.d) this.f56213v).receivingConnectionWindowChanged(this.f56216y);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.C.maxDataLength());
        r6 = r2;
        r8.f56217z += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeData(int r9, boolean r10, pw.g r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            fw.y r12 = r8.C
            r12.data(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L6f
            monitor-enter(r8)
        L12:
            long r4 = r8.f56217z     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            long r6 = r8.A     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.LinkedHashMap r2 = r8.f56196e     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.e0.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            goto L12
        L2f:
            r9 = move-exception
            goto L6d
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L60
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            fw.y r4 = r8.C     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.maxDataLength()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.f56217z     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.f56217z = r4     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            fw.y r4 = r8.C
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.data(r5, r9, r11, r2)
            goto Ld
        L60:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6d:
            monitor-exit(r8)
            throw r9
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw.q.writeData(int, boolean, pw.g, long):void");
    }

    public final void writeHeaders$okhttp(int i10, boolean z10, List<f> alternating) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(alternating, "alternating");
        this.C.headers(z10, i10, alternating);
    }

    public final void writePing(boolean z10, int i10, int i11) {
        try {
            this.C.ping(z10, i10, i11);
        } catch (IOException e10) {
            fw.c cVar = fw.c.f56124f;
            close$okhttp(cVar, cVar, e10);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing();
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i10, fw.c statusCode) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(statusCode, "statusCode");
        this.C.rstStream(i10, statusCode);
    }

    public final void writeSynResetLater$okhttp(int i10, fw.c errorCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorCode, "errorCode");
        bw.c.execute$default(this.f56202k, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] writeSynReset", 0L, false, new n(this, i10, errorCode, 0), 6, null);
    }

    public final void writeWindowUpdateLater$okhttp(final int i10, final long j10) {
        bw.c.execute$default(this.f56202k, this.f56197f + AbstractJsonLexerKt.BEGIN_LIST + i10 + "] windowUpdate", 0L, false, new kv.a() { // from class: fw.m
            @Override // kv.a
            public final Object invoke() {
                q qVar = this.f56179b;
                int i11 = i10;
                long j11 = j10;
                q.b bVar = q.F;
                try {
                    qVar.C.windowUpdate(i11, j11);
                } catch (IOException e10) {
                    c cVar = c.f56124f;
                    qVar.close$okhttp(cVar, cVar, e10);
                }
                return tu.x0.f87415a;
            }
        }, 6, null);
    }

    public final void start(boolean z10) throws IOException {
        if (z10) {
            y yVar = this.C;
            yVar.connectionPreface();
            d0 d0Var = this.f56214w;
            yVar.settings(d0Var);
            if (d0Var.getInitialWindowSize() != 65535) {
                yVar.windowUpdate(0, r0 - Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            }
        }
        bw.c.execute$default(this.f56201j.newQueue(), this.f56197f, 0L, false, this.D, 6, null);
    }

    public final void writePing() throws InterruptedException {
        synchronized (this) {
            this.f56210s++;
        }
        writePing(false, 3, 1330343787);
    }
}
