package cw;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o9.b3;
import pw.d1;
import xv.l0;
import xv.o0;
import xv.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements xv.j, Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f51185b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f51186c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f51187e;

    /* renamed from: f, reason: collision with root package name */
    public final w f51188f;

    /* renamed from: g, reason: collision with root package name */
    public final xv.b0 f51189g;

    /* renamed from: h, reason: collision with root package name */
    public final r f51190h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f51191i;

    /* renamed from: j, reason: collision with root package name */
    public Object f51192j;

    /* renamed from: k, reason: collision with root package name */
    public j f51193k;

    /* renamed from: l, reason: collision with root package name */
    public u f51194l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51195m;

    /* renamed from: n, reason: collision with root package name */
    public i f51196n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51197o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51198p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f51199q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f51200r;

    /* renamed from: s, reason: collision with root package name */
    public volatile i f51201s;

    /* renamed from: t, reason: collision with root package name */
    public final CopyOnWriteArrayList f51202t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final xv.k f51203b;

        /* renamed from: c, reason: collision with root package name */
        public volatile AtomicInteger f51204c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q f51205e;

        public a(q qVar, xv.k responseCallback) {
            kotlin.jvm.internal.e0.checkNotNullParameter(responseCallback, "responseCallback");
            this.f51205e = qVar;
            this.f51203b = responseCallback;
            this.f51204c = new AtomicInteger(0);
        }

        public static /* synthetic */ void failRejected$okhttp$default(a aVar, RejectedExecutionException rejectedExecutionException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rejectedExecutionException = null;
            }
            aVar.failRejected$okhttp(rejectedExecutionException);
        }

        public final void executeOn(ExecutorService executorService) {
            kotlin.jvm.internal.e0.checkNotNullParameter(executorService, "executorService");
            q qVar = this.f51205e;
            yv.i.assertLockNotHeld(qVar.getClient().dispatcher());
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    failRejected$okhttp(e10);
                    qVar.getClient().dispatcher().finished$okhttp(this);
                }
            } catch (Throwable th2) {
                qVar.getClient().dispatcher().finished$okhttp(this);
                throw th2;
            }
        }

        public final void failRejected$okhttp(RejectedExecutionException rejectedExecutionException) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
            interruptedIOException.initCause(rejectedExecutionException);
            q qVar = this.f51205e;
            qVar.noMoreExchanges$okhttp(interruptedIOException);
            this.f51203b.onFailure(qVar, interruptedIOException);
        }

        public final q getCall() {
            return this.f51205e;
        }

        public final AtomicInteger getCallsPerHost() {
            return this.f51204c;
        }

        public final String getHost() {
            return this.f51205e.getOriginalRequest().url().host();
        }

        public final o0 getRequest() {
            return this.f51205e.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(a other) {
            kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
            this.f51204c = other.f51204c;
        }

        @Override // java.lang.Runnable
        public void run() {
            l0 client;
            xv.k kVar = this.f51203b;
            StringBuilder sb2 = new StringBuilder("OkHttp ");
            q qVar = this.f51205e;
            sb2.append(qVar.redactedUrl$okhttp());
            String string = sb2.toString();
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(string);
            try {
                qVar.f51190h.enter();
                boolean z10 = false;
                try {
                    try {
                    } catch (Throwable th2) {
                        qVar.getClient().dispatcher().finished$okhttp(this);
                        throw th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    kVar.onResponse(qVar, qVar.getResponseWithInterceptorChain$okhttp());
                    client = qVar.getClient();
                } catch (IOException e11) {
                    e = e11;
                    z10 = true;
                    if (z10) {
                        okhttp3.internal.platform.c.f79515a.get().log("Callback failure for " + q.access$toLoggableString(qVar), 4, e);
                    } else {
                        kVar.onFailure(qVar, e);
                    }
                    client = qVar.getClient();
                    client.dispatcher().finished$okhttp(this);
                } catch (Throwable th4) {
                    th = th4;
                    z10 = true;
                    qVar.cancel();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        tu.h.addSuppressed(iOException, th);
                        kVar.onFailure(qVar, iOException);
                    }
                    throw th;
                }
                client.dispatcher().finished$okhttp(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        public final Object f51206a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.e0.checkNotNullParameter(referent, "referent");
            this.f51206a = obj;
        }

        public final Object getCallStackTrace() {
            return this.f51206a;
        }
    }

    public q(l0 client, o0 originalRequest, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(client, "client");
        kotlin.jvm.internal.e0.checkNotNullParameter(originalRequest, "originalRequest");
        this.f51185b = client;
        this.f51186c = originalRequest;
        this.f51187e = z10;
        this.f51188f = client.connectionPool().getDelegate$okhttp();
        xv.b0 b0Var = (xv.b0) ((b3) client.eventListenerFactory()).f78046c;
        kotlin.jvm.internal.e0.checkNotNullParameter(this, "it");
        this.f51189g = b0Var;
        r rVar = new r(this);
        rVar.timeout(client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f51190h = rVar;
        this.f51191i = new AtomicBoolean();
        this.f51199q = true;
        this.f51202t = new CopyOnWriteArrayList();
    }

    public static final String access$toLoggableString(q qVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(qVar.isCanceled() ? "canceled " : "");
        sb2.append(qVar.f51187e ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(qVar.redactedUrl$okhttp());
        return sb2.toString();
    }

    public static /* synthetic */ IOException messageDone$okhttp$default(q qVar, i iVar, boolean z10, boolean z11, IOException iOException, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return qVar.messageDone$okhttp(iVar, z10, z11, iOException);
    }

    public final IOException a(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketReleaseConnectionNoEvents$okhttp;
        TimeZone timeZone = yv.i.f96667a;
        u uVar = this.f51194l;
        if (uVar != null) {
            synchronized (uVar) {
                socketReleaseConnectionNoEvents$okhttp = releaseConnectionNoEvents$okhttp();
            }
            if (this.f51194l == null) {
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    yv.i.closeQuietly(socketReleaseConnectionNoEvents$okhttp);
                }
                this.f51189g.connectionReleased(this, uVar);
                uVar.getConnectionListener$okhttp().connectionReleased(uVar, this);
                if (socketReleaseConnectionNoEvents$okhttp != null) {
                    uVar.getConnectionListener$okhttp().connectionClosed(uVar);
                }
            } else if (socketReleaseConnectionNoEvents$okhttp != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f51195m && this.f51190h.exit()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f51189g.callEnd(this);
            return interruptedIOException;
        }
        xv.b0 b0Var = this.f51189g;
        kotlin.jvm.internal.e0.checkNotNull(interruptedIOException);
        b0Var.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void acquireConnectionNoEvents(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = yv.i.f96667a;
        if (this.f51194l != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f51194l = connection;
        connection.getCalls().add(new b(this, this.f51192j));
    }

    @Override // xv.j
    public void cancel() {
        if (this.f51200r) {
            return;
        }
        this.f51200r = true;
        i iVar = this.f51201s;
        if (iVar != null) {
            iVar.cancel();
        }
        Iterator it = this.f51202t.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((e0) it.next()).mo3673cancel();
        }
        this.f51189g.canceled(this);
    }

    @Override // xv.j
    public void enqueue(xv.k responseCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f51191i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f51192j = okhttp3.internal.platform.c.f79515a.get().getStackTraceForCloseable("response.body().close()");
        this.f51189g.callStart(this);
        this.f51185b.dispatcher().enqueue$okhttp(new a(this, responseCallback));
    }

    public final void enterNetworkInterceptorExchange(o0 request, boolean z10, dw.k chain) {
        kotlin.jvm.internal.e0.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        if (this.f51196n != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            try {
                if (this.f51198p) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (this.f51197o) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            z zVar = new z(this.f51185b.getTaskRunner$okhttp(), this.f51188f, this.f51185b.readTimeoutMillis(), this.f51185b.writeTimeoutMillis(), chain.getConnectTimeoutMillis$okhttp(), chain.getReadTimeoutMillis$okhttp(), this.f51185b.pingIntervalMillis(), this.f51185b.retryOnConnectionFailure(), this.f51185b.fastFallback(), this.f51185b.address(request.url()), this.f51185b.getRouteDatabase$okhttp(), new cw.b(this, this.f51188f.getConnectionListener$okhttp(), chain));
            this.f51193k = this.f51185b.fastFallback() ? new m(zVar, this.f51185b.getTaskRunner$okhttp()) : new h0(zVar);
        }
    }

    @Override // xv.j
    public v0 execute() {
        l0 l0Var = this.f51185b;
        if (!this.f51191i.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f51190h.enter();
        this.f51192j = okhttp3.internal.platform.c.f79515a.get().getStackTraceForCloseable("response.body().close()");
        this.f51189g.callStart(this);
        try {
            l0Var.dispatcher().executed$okhttp(this);
            return getResponseWithInterceptorChain$okhttp();
        } finally {
            l0Var.dispatcher().finished$okhttp(this);
        }
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z10) {
        i iVar;
        synchronized (this) {
            if (!this.f51199q) {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (iVar = this.f51201s) != null) {
            iVar.detachWithViolence();
        }
        this.f51196n = null;
    }

    public final l0 getClient() {
        return this.f51185b;
    }

    public final u getConnection() {
        return this.f51194l;
    }

    public final xv.b0 getEventListener$okhttp() {
        return this.f51189g;
    }

    public final boolean getForWebSocket() {
        return this.f51187e;
    }

    public final i getInterceptorScopedExchange$okhttp() {
        return this.f51196n;
    }

    public final o0 getOriginalRequest() {
        return this.f51186c;
    }

    public final CopyOnWriteArrayList<e0> getPlansToCancel$okhttp() {
        return this.f51202t;
    }

    public final v0 getResponseWithInterceptorChain$okhttp() throws IOException {
        ArrayList arrayList = new ArrayList();
        l0 l0Var = this.f51185b;
        uu.v0.addAll(arrayList, l0Var.interceptors());
        arrayList.add(new dw.n(l0Var));
        arrayList.add(new dw.a(l0Var.cookieJar()));
        arrayList.add(new aw.a(l0Var.cache()));
        arrayList.add(c.f51113a);
        boolean z10 = this.f51187e;
        if (!z10) {
            uu.v0.addAll(arrayList, l0Var.networkInterceptors());
        }
        arrayList.add(new dw.c(z10));
        boolean z11 = false;
        try {
            try {
                v0 v0VarProceed = new dw.k(this, arrayList, 0, null, this.f51186c, l0Var.connectTimeoutMillis(), l0Var.readTimeoutMillis(), l0Var.writeTimeoutMillis()).proceed(this.f51186c);
                if (isCanceled()) {
                    yv.h.closeQuietly(v0VarProceed);
                    throw new IOException("Canceled");
                }
                noMoreExchanges$okhttp(null);
                return v0VarProceed;
            } catch (IOException e10) {
                z11 = true;
                IOException iOExceptionNoMoreExchanges$okhttp = noMoreExchanges$okhttp(e10);
                kotlin.jvm.internal.e0.checkNotNull(iOExceptionNoMoreExchanges$okhttp, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionNoMoreExchanges$okhttp;
            }
        } catch (Throwable th2) {
            if (!z11) {
                noMoreExchanges$okhttp(null);
            }
            throw th2;
        }
    }

    public final i initExchange$okhttp(dw.k chain) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            try {
                if (!this.f51199q) {
                    throw new IllegalStateException("released");
                }
                if (this.f51198p) {
                    throw new IllegalStateException("Check failed.");
                }
                if (this.f51197o) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j jVar = this.f51193k;
        kotlin.jvm.internal.e0.checkNotNull(jVar);
        i iVar = new i(this, this.f51189g, jVar, jVar.find().newCodec$okhttp(this.f51185b, chain));
        this.f51196n = iVar;
        this.f51201s = iVar;
        synchronized (this) {
            this.f51197o = true;
            this.f51198p = true;
        }
        if (this.f51200r) {
            throw new IOException("Canceled");
        }
        return iVar;
    }

    @Override // xv.j
    public boolean isCanceled() {
        return this.f51200r;
    }

    @Override // xv.j
    public boolean isExecuted() {
        return this.f51191i.get();
    }

    public final <E extends IOException> E messageDone$okhttp(i exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.e0.checkNotNullParameter(exchange, "exchange");
        if (kotlin.jvm.internal.e0.areEqual(exchange, this.f51201s)) {
            synchronized (this) {
                z12 = false;
                if (z10) {
                    try {
                        if (!this.f51197o) {
                            if (z11 || !this.f51198p) {
                                z13 = false;
                            }
                        }
                        if (z10) {
                            this.f51197o = false;
                        }
                        if (z11) {
                            this.f51198p = false;
                        }
                        boolean z14 = this.f51197o;
                        boolean z15 = (z14 || this.f51198p) ? false : true;
                        if (!z14 && !this.f51198p) {
                            if (!this.f51199q) {
                                z12 = true;
                            }
                        }
                        z13 = z12;
                        z12 = z15;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    if (z11) {
                    }
                    z13 = false;
                }
            }
            if (z12) {
                this.f51201s = null;
                u uVar = this.f51194l;
                if (uVar != null) {
                    uVar.incrementSuccessCount$okhttp();
                }
            }
            if (z13) {
                return (E) a(e10);
            }
        }
        return e10;
    }

    public final IOException noMoreExchanges$okhttp(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.f51199q) {
                this.f51199q = false;
                if (!this.f51197o) {
                    if (!this.f51198p) {
                        z10 = true;
                    }
                }
            }
        }
        return z10 ? a(iOException) : iOException;
    }

    public final String redactedUrl$okhttp() {
        return this.f51186c.url().redact();
    }

    public final Socket releaseConnectionNoEvents$okhttp() {
        u uVar = this.f51194l;
        kotlin.jvm.internal.e0.checkNotNull(uVar);
        TimeZone timeZone = yv.i.f96667a;
        List<Reference<q>> calls = uVar.getCalls();
        Iterator<Reference<q>> it = calls.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (kotlin.jvm.internal.e0.areEqual(it.next().get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        calls.remove(i10);
        this.f51194l = null;
        if (calls.isEmpty()) {
            uVar.setIdleAtNs(System.nanoTime());
            if (this.f51188f.connectionBecameIdle(uVar)) {
                return uVar.socket();
            }
        }
        return null;
    }

    @Override // xv.j
    public o0 request() {
        return this.f51186c;
    }

    public final boolean retryAfterFailure() {
        i iVar = this.f51201s;
        if (iVar == null || !iVar.getHasFailure$okhttp()) {
            return false;
        }
        j jVar = this.f51193k;
        kotlin.jvm.internal.e0.checkNotNull(jVar);
        f0 routePlanner = jVar.getRoutePlanner();
        i iVar2 = this.f51201s;
        return routePlanner.hasNext(iVar2 != null ? iVar2.getConnection$okhttp() : null);
    }

    @Override // xv.j
    public d1 timeout() {
        return this.f51190h;
    }

    public final void timeoutEarlyExit() {
        if (this.f51195m) {
            throw new IllegalStateException("Check failed.");
        }
        this.f51195m = true;
        this.f51190h.exit();
    }

    @Override // xv.j
    public xv.j clone() {
        return new q(this.f51185b, this.f51186c, this.f51187e);
    }
}
