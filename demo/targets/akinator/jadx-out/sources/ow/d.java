package ow;

import androidx.lifecycle.x0;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.C3271ic;
import cw.q;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import pw.k;
import pw.l;
import qv.m;
import sv.k0;
import xv.b0;
import xv.e1;
import xv.f1;
import xv.l0;
import xv.n0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d implements e1, h {
    public static final List A;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f79877a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f79878b;

    /* renamed from: c, reason: collision with root package name */
    public final Random f79879c;

    /* renamed from: d, reason: collision with root package name */
    public final long f79880d;

    /* renamed from: e, reason: collision with root package name */
    public f f79881e;

    /* renamed from: f, reason: collision with root package name */
    public final long f79882f;

    /* renamed from: g, reason: collision with root package name */
    public final long f79883g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79884h;

    /* renamed from: i, reason: collision with root package name */
    public xv.j f79885i;

    /* renamed from: j, reason: collision with root package name */
    public e f79886j;

    /* renamed from: k, reason: collision with root package name */
    public i f79887k;

    /* renamed from: l, reason: collision with root package name */
    public j f79888l;

    /* renamed from: m, reason: collision with root package name */
    public final bw.c f79889m;

    /* renamed from: n, reason: collision with root package name */
    public String f79890n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0758d f79891o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayDeque f79892p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayDeque f79893q;

    /* renamed from: r, reason: collision with root package name */
    public long f79894r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f79895s;

    /* renamed from: t, reason: collision with root package name */
    public int f79896t;

    /* renamed from: u, reason: collision with root package name */
    public String f79897u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f79898v;

    /* renamed from: w, reason: collision with root package name */
    public int f79899w;

    /* renamed from: x, reason: collision with root package name */
    public int f79900x;

    /* renamed from: y, reason: collision with root package name */
    public int f79901y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f79902z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f79903a;

        /* renamed from: b, reason: collision with root package name */
        public final l f79904b;

        /* renamed from: c, reason: collision with root package name */
        public final long f79905c;

        public a(int i10, l lVar, long j10) {
            this.f79903a = i10;
            this.f79904b = lVar;
            this.f79905c = j10;
        }

        public final long getCancelAfterCloseMillis() {
            return this.f79905c;
        }

        public final int getCode() {
            return this.f79903a;
        }

        public final l getReason() {
            return this.f79904b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f79906a;

        /* renamed from: b, reason: collision with root package name */
        public final l f79907b;

        public c(int i10, l data) {
            e0.checkNotNullParameter(data, "data");
            this.f79906a = i10;
            this.f79907b = data;
        }

        public final l getData() {
            return this.f79907b;
        }

        public final int getFormatOpcode() {
            return this.f79906a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ow.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0758d implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f79908b;

        /* renamed from: c, reason: collision with root package name */
        public final k f79909c;

        /* renamed from: e, reason: collision with root package name */
        public final pw.j f79910e;

        public AbstractC0758d(boolean z10, k source, pw.j sink) {
            e0.checkNotNullParameter(source, "source");
            e0.checkNotNullParameter(sink, "sink");
            this.f79908b = z10;
            this.f79909c = source;
            this.f79910e = sink;
        }

        public abstract void cancel();

        public final boolean getClient() {
            return this.f79908b;
        }

        public final pw.j getSink() {
            return this.f79910e;
        }

        public final k getSource() {
            return this.f79909c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class e extends bw.a {
        public e() {
            super(d.this.f79890n + " writer", false, 2, null);
        }

        @Override // bw.a
        public long runOnce() throws IOException {
            try {
                return d.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e10) {
                d.failWebSocket$default(d.this, e10, null, true, 2, null);
                return -1L;
            }
        }
    }

    static {
        new b(null);
        A = uu.o0.listOf(n0.f93760f);
    }

    public d(bw.g taskRunner, o0 originalRequest, f1 listener, Random random, long j10, f fVar, long j11, long j12) {
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        e0.checkNotNullParameter(originalRequest, "originalRequest");
        e0.checkNotNullParameter(listener, "listener");
        e0.checkNotNullParameter(random, "random");
        this.f79877a = originalRequest;
        this.f79878b = listener;
        this.f79879c = random;
        this.f79880d = j10;
        this.f79881e = fVar;
        this.f79882f = j11;
        this.f79883g = j12;
        this.f79889m = taskRunner.newQueue();
        this.f79892p = new ArrayDeque();
        this.f79893q = new ArrayDeque();
        this.f79896t = -1;
        if (!e0.areEqual(C3271ic.f36943a, originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        l.a aVar = l.f81911f;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f79884h = l.a.of$default(aVar, bArr, 0, 0, 3, null).base64();
    }

    public static final boolean access$isValid(d dVar, f fVar) {
        dVar.getClass();
        boolean z10 = fVar.f79920f;
        Integer num = fVar.f79918d;
        if (!z10 && fVar.f79916b == null) {
            return num == null || new m(8, 15).contains(num.intValue());
        }
        return false;
    }

    public static /* synthetic */ void failWebSocket$default(d dVar, Exception exc, v0 v0Var, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            v0Var = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        dVar.failWebSocket(exc, v0Var, z10);
    }

    public final void a() {
        TimeZone timeZone = yv.i.f96667a;
        e eVar = this.f79886j;
        if (eVar != null) {
            bw.c.schedule$default(this.f79889m, eVar, 0L, 2, null);
        }
    }

    public final synchronized boolean b(int i10, l lVar) {
        if (!this.f79898v && !this.f79895s) {
            if (this.f79894r + lVar.size() > 16777216) {
                close(1001, null);
                return false;
            }
            this.f79894r += lVar.size();
            this.f79893q.add(new c(i10, lVar));
            a();
            return true;
        }
        return false;
    }

    @Override // xv.e1
    public void cancel() {
        xv.j jVar = this.f79885i;
        e0.checkNotNull(jVar);
        jVar.cancel();
    }

    @Override // xv.e1
    public boolean close(int i10, String str) {
        return close(i10, str, this.f79883g);
    }

    public final void connect(l0 client) {
        e0.checkNotNullParameter(client, "client");
        o0 o0Var = this.f79877a;
        if (o0Var.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket$default(this, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, false, 6, null);
            return;
        }
        l0 l0VarBuild = client.newBuilder().eventListener(b0.f93576a).protocols(A).build();
        o0 o0VarBuild = o0Var.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f79884h).header("Sec-WebSocket-Version", DtbConstants.NETWORK_TYPE_LTE).header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        q qVar = new q(l0VarBuild, o0VarBuild, true);
        this.f79885i = qVar;
        e0.checkNotNull(qVar);
        qVar.enqueue(new ow.e(this, o0VarBuild));
    }

    public final void failWebSocket(Exception e10, v0 v0Var, boolean z10) throws IOException {
        e0.checkNotNullParameter(e10, "e");
        b1 b1Var = new b1();
        b1 b1Var2 = new b1();
        synchronized (this) {
            try {
                if (this.f79898v) {
                    return;
                }
                this.f79898v = true;
                AbstractC0758d abstractC0758d = this.f79891o;
                j jVar = this.f79888l;
                b1Var2.f71816b = jVar;
                AbstractC0758d abstractC0758d2 = null;
                this.f79888l = null;
                if (jVar != null && this.f79887k == null) {
                    abstractC0758d2 = abstractC0758d;
                }
                b1Var.f71816b = abstractC0758d2;
                if (!z10 && b1Var2.f71816b != null) {
                    bw.c.execute$default(this.f79889m, this.f79890n + " writer close", 0L, false, new x0(17, b1Var2, b1Var), 2, null);
                }
                this.f79889m.shutdown();
                try {
                    this.f79878b.onFailure(this, e10, v0Var);
                    if (abstractC0758d != null) {
                        abstractC0758d.cancel();
                    }
                    if (z10) {
                        j jVar2 = (j) b1Var2.f71816b;
                        if (jVar2 != null) {
                            yv.h.closeQuietly(jVar2);
                        }
                        AbstractC0758d abstractC0758d3 = (AbstractC0758d) b1Var.f71816b;
                        if (abstractC0758d3 != null) {
                            yv.h.closeQuietly(abstractC0758d3);
                        }
                    }
                } finally {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finishReader() throws IOException {
        boolean z10;
        int i10;
        String str;
        i iVar;
        AbstractC0758d abstractC0758d;
        synchronized (this) {
            try {
                z10 = this.f79898v;
                i10 = this.f79896t;
                str = this.f79897u;
                iVar = this.f79887k;
                this.f79887k = null;
                if (this.f79895s && this.f79893q.isEmpty()) {
                    j jVar = this.f79888l;
                    if (jVar != null) {
                        this.f79888l = null;
                        bw.c.execute$default(this.f79889m, this.f79890n + " writer close", 0L, false, new o6.v0(jVar, 2), 2, null);
                    }
                    this.f79889m.shutdown();
                }
                abstractC0758d = this.f79888l == null ? this.f79891o : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 && abstractC0758d != null && this.f79896t != -1) {
            f1 f1Var = this.f79878b;
            e0.checkNotNull(str);
            f1Var.onClosed(this, i10, str);
        }
        if (iVar != null) {
            yv.h.closeQuietly(iVar);
        }
        if (abstractC0758d != null) {
            yv.h.closeQuietly(abstractC0758d);
        }
    }

    public final xv.j getCall$okhttp() {
        return this.f79885i;
    }

    public final f1 getListener$okhttp() {
        return this.f79878b;
    }

    public final void loopReader(v0 response) throws IOException {
        e0.checkNotNullParameter(response, "response");
        try {
            try {
                this.f79878b.onOpen(this, response);
                while (this.f79896t == -1) {
                    i iVar = this.f79887k;
                    e0.checkNotNull(iVar);
                    iVar.processNextFrame();
                }
            } catch (Exception e10) {
                failWebSocket$default(this, e10, null, false, 6, null);
                finishReader();
            }
        } finally {
            finishReader();
        }
    }

    @Override // ow.h
    public void onReadClose(int i10, String reason) {
        e0.checkNotNullParameter(reason, "reason");
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            if (this.f79896t != -1) {
                throw new IllegalStateException("already closed");
            }
            this.f79896t = i10;
            this.f79897u = reason;
        }
        this.f79878b.onClosing(this, i10, reason);
    }

    @Override // ow.h
    public void onReadMessage(String text) throws IOException {
        e0.checkNotNullParameter(text, "text");
        this.f79878b.onMessage(this, text);
    }

    @Override // ow.h
    public synchronized void onReadPing(l payload) {
        try {
            e0.checkNotNullParameter(payload, "payload");
            if (!this.f79898v && (!this.f79895s || !this.f79893q.isEmpty())) {
                this.f79892p.add(payload);
                a();
                this.f79900x++;
            }
        } finally {
        }
    }

    @Override // ow.h
    public synchronized void onReadPong(l payload) {
        e0.checkNotNullParameter(payload, "payload");
        this.f79901y++;
        this.f79902z = false;
    }

    public final synchronized boolean pong(l payload) {
        try {
            e0.checkNotNullParameter(payload, "payload");
            if (!this.f79898v && (!this.f79895s || !this.f79893q.isEmpty())) {
                this.f79892p.add(payload);
                a();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            i iVar = this.f79887k;
            e0.checkNotNull(iVar);
            iVar.processNextFrame();
            return this.f79896t == -1;
        } catch (Exception e10) {
            failWebSocket$default(this, e10, null, false, 6, null);
            return false;
        }
    }

    @Override // xv.e1
    public synchronized long queueSize() {
        return this.f79894r;
    }

    public final synchronized int receivedPingCount() {
        return this.f79900x;
    }

    public final synchronized int receivedPongCount() {
        return this.f79901y;
    }

    @Override // xv.e1
    public o0 request() {
        return this.f79877a;
    }

    @Override // xv.e1
    public boolean send(String text) {
        e0.checkNotNullParameter(text, "text");
        return b(1, l.f81911f.encodeUtf8(text));
    }

    public final synchronized int sentPingCount() {
        return this.f79899w;
    }

    public final void setCall$okhttp(xv.j jVar) {
        this.f79885i = jVar;
    }

    public final void tearDown() throws InterruptedException {
        bw.c cVar = this.f79889m;
        cVar.shutdown();
        cVar.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:33:0x0087, B:36:0x0092, B:38:0x0096, B:39:0x00a6, B:41:0x00b5, B:44:0x00b8, B:45:0x00b9, B:46:0x00ba, B:48:0x00be, B:50:0x00d0, B:57:0x00e4, B:58:0x00e9, B:40:0x00a7), top: B:66:0x0085, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:33:0x0087, B:36:0x0092, B:38:0x0096, B:39:0x00a6, B:41:0x00b5, B:44:0x00b8, B:45:0x00b9, B:46:0x00ba, B:48:0x00be, B:50:0x00d0, B:57:0x00e4, B:58:0x00e9, B:40:0x00a7), top: B:66:0x0085, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ow.d.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            try {
                if (this.f79898v) {
                    return;
                }
                j jVar = this.f79888l;
                if (jVar == null) {
                    return;
                }
                int i10 = this.f79902z ? this.f79899w : -1;
                this.f79899w++;
                this.f79902z = true;
                if (i10 != -1) {
                    StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                    sb2.append(this.f79880d);
                    sb2.append("ms (after ");
                    failWebSocket$default(this, new SocketTimeoutException(a.b.f(i10 - 1, " successful ping/pongs)", sb2)), null, true, 2, null);
                    return;
                }
                try {
                    jVar.writePing(l.f81912g);
                } catch (IOException e10) {
                    failWebSocket$default(this, e10, null, true, 2, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void checkUpgradeSuccess$okhttp(v0 response, cw.i iVar) throws IOException {
        e0.checkNotNullParameter(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = v0.header$default(response, "Connection", null, 2, null);
        if (!k0.equals("Upgrade", strHeader$default, true)) {
            throw new ProtocolException(o2.f('\'', "Expected 'Connection' header value 'Upgrade' but was '", strHeader$default));
        }
        String strHeader$default2 = v0.header$default(response, "Upgrade", null, 2, null);
        if (!k0.equals("websocket", strHeader$default2, true)) {
            throw new ProtocolException(o2.f('\'', "Expected 'Upgrade' header value 'websocket' but was '", strHeader$default2));
        }
        String strHeader$default3 = v0.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strBase64 = l.f81911f.encodeUtf8(this.f79884h + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (e0.areEqual(strBase64, strHeader$default3)) {
            if (iVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strBase64 + zAQQWzBxnS.zMcSnvPdaiVb + strHeader$default3 + '\'');
    }

    public final synchronized boolean close(int i10, String str, long j10) {
        l lVarEncodeUtf8;
        try {
            g.f79921a.validateCloseCode(i10);
            if (str != null) {
                lVarEncodeUtf8 = l.f81911f.encodeUtf8(str);
                if (lVarEncodeUtf8.size() > 123) {
                    throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                }
            } else {
                lVarEncodeUtf8 = null;
            }
            if (!this.f79898v && !this.f79895s) {
                this.f79895s = true;
                this.f79893q.add(new a(i10, lVarEncodeUtf8, j10));
                a();
                return true;
            }
            return false;
        } finally {
        }
    }

    public final void initReaderAndWriter(String name, AbstractC0758d abstractC0758d) throws Throwable {
        Throwable th2;
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(abstractC0758d, QGjYBESwAiCc.LAFdAnwpAUm);
        f fVar = this.f79881e;
        e0.checkNotNull(fVar);
        synchronized (this) {
            try {
                this.f79890n = name;
                this.f79891o = abstractC0758d;
                this.f79888l = new j(abstractC0758d.getClient(), abstractC0758d.getSink(), this.f79879c, fVar.f79915a, fVar.noContextTakeover(abstractC0758d.getClient()), this.f79882f);
                this.f79886j = new e();
                long j10 = this.f79880d;
                if (j10 != 0) {
                    try {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j10);
                        this.f79889m.schedule(name + " ping", nanos, new fw.l(this, nanos, 1));
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (!this.f79893q.isEmpty()) {
                    a();
                }
                this.f79887k = new i(abstractC0758d.getClient(), abstractC0758d.getSource(), this, fVar.f79915a, fVar.noContextTakeover(!abstractC0758d.getClient()));
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    @Override // ow.h
    public void onReadMessage(l bytes) throws IOException {
        e0.checkNotNullParameter(bytes, "bytes");
        this.f79878b.onMessage(this, bytes);
    }

    @Override // xv.e1
    public boolean send(l bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        return b(2, bytes);
    }
}
