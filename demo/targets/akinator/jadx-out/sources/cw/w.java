package cw;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import cw.q;
import j1.o2;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import uu.p0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f51229j;

    /* renamed from: a, reason: collision with root package name */
    public final bw.g f51230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51231b;

    /* renamed from: c, reason: collision with root package name */
    public final g f51232c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.q f51233d;

    /* renamed from: e, reason: collision with root package name */
    public final long f51234e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f51235f;

    /* renamed from: g, reason: collision with root package name */
    public final bw.c f51236g;

    /* renamed from: h, reason: collision with root package name */
    public final x f51237h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue f51238i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final xv.a f51239a;

        /* renamed from: b, reason: collision with root package name */
        public final bw.c f51240b;

        /* renamed from: c, reason: collision with root package name */
        public cw.a f51241c;

        /* renamed from: d, reason: collision with root package name */
        public int f51242d;

        public a(xv.a address, bw.c queue, cw.a policy) {
            kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
            kotlin.jvm.internal.e0.checkNotNullParameter(queue, "queue");
            kotlin.jvm.internal.e0.checkNotNullParameter(policy, "policy");
            this.f51239a = address;
            this.f51240b = queue;
            this.f51241c = policy;
        }

        public final xv.a getAddress() {
            return this.f51239a;
        }

        public final int getConcurrentCallCapacity() {
            return this.f51242d;
        }

        public final cw.a getPolicy() {
            return this.f51241c;
        }

        public final bw.c getQueue() {
            return this.f51240b;
        }

        public final void setConcurrentCallCapacity(int i10) {
            this.f51242d = i10;
        }

        public final void setPolicy(cw.a aVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<set-?>");
            this.f51241c = aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final w get(xv.r connectionPool) {
            kotlin.jvm.internal.e0.checkNotNullParameter(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }

    static {
        new b(null);
        f51229j = AtomicReferenceFieldUpdater.newUpdater(w.class, Map.class, InneractiveMediationDefs.GENDER_FEMALE);
    }

    public w(bw.g taskRunner, int i10, long j10, TimeUnit timeUnit, g connectionListener, kv.q exchangeFinderFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(taskRunner, "taskRunner");
        kotlin.jvm.internal.e0.checkNotNullParameter(timeUnit, "timeUnit");
        kotlin.jvm.internal.e0.checkNotNullParameter(connectionListener, "connectionListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(exchangeFinderFactory, "exchangeFinderFactory");
        this.f51230a = taskRunner;
        this.f51231b = i10;
        this.f51232c = connectionListener;
        this.f51233d = exchangeFinderFactory;
        this.f51234e = timeUnit.toNanos(j10);
        this.f51235f = p1.emptyMap();
        this.f51236g = taskRunner.newQueue();
        this.f51237h = new x(this, o2.o(new StringBuilder(), yv.i.f96668b, " ConnectionPool connection closer"));
        this.f51238i = new ConcurrentLinkedQueue();
        if (j10 <= 0) {
            throw new IllegalArgumentException(p0.o2.m(j10, "keepAliveDuration <= 0: ").toString());
        }
    }

    public static final long access$openConnections(w wVar, a aVar) {
        wVar.getClass();
        if (aVar.getPolicy().f51106a == 0) {
            return -1L;
        }
        Iterator it = wVar.f51238i.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        int allocationLimit$okhttp = 0;
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (kotlin.jvm.internal.e0.areEqual(aVar.getAddress(), uVar.getRoute().address())) {
                kotlin.jvm.internal.e0.checkNotNull(uVar);
                synchronized (uVar) {
                    allocationLimit$okhttp += uVar.getAllocationLimit$okhttp();
                }
                if (allocationLimit$okhttp >= aVar.getPolicy().f51106a) {
                    return -1L;
                }
            }
        }
        try {
            u uVarFind = ((j) wVar.f51233d.invoke(wVar, aVar.getAddress(), p.f51184a)).find();
            if (wVar.f51238i.contains(uVarFind)) {
                return 0L;
            }
            synchronized (uVarFind) {
                wVar.put(uVarFind);
            }
            return 0L;
        } catch (IOException unused) {
            long j10 = aVar.getPolicy().f51107b;
            int i10 = aVar.getPolicy().f51108c;
            return (j10 + ThreadLocalRandom.current().nextInt(i10 * (-1), i10)) * 1000000;
        }
    }

    public final int a(u uVar, long j10) {
        TimeZone timeZone = yv.i.f96667a;
        List<Reference<q>> calls = uVar.getCalls();
        int i10 = 0;
        while (i10 < calls.size()) {
            Reference<q> reference = calls.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                kotlin.jvm.internal.e0.checkNotNull(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.c.f79515a.get().logCloseableLeak("A connection to " + uVar.route().address().url() + " was leaked. Did you forget to close a response body?", ((q.b) reference).getCallStackTrace());
                calls.remove(i10);
                if (calls.isEmpty()) {
                    uVar.setIdleAtNs(j10 - this.f51234e);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    public final void b(a aVar) {
        bw.c.schedule$default(aVar.getQueue(), new y(this, aVar, o2.o(new StringBuilder(), yv.i.f96668b, " ConnectionPool connection opener")), 0L, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cw.u callAcquirePooledConnection(boolean r6, xv.a r7, cw.h r8, java.util.List<xv.y0> r9, boolean r10) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "connectionUser"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f51238i
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            cw.u r1 = (cw.u) r1
            kotlin.jvm.internal.e0.checkNotNull(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.isMultiplexed$okhttp()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.isEligible$okhttp(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.acquireConnectionNoEvents(r1)     // Catch: java.lang.Throwable -> L30
            r3 = r2
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.isHealthy(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.getNoNewExchanges()     // Catch: java.lang.Throwable -> L67
            r1.setNoNewExchanges(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.releaseConnectionNoEvents()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            yv.i.closeQuietly(r2)
            cw.g r2 = r5.f51232c
            r2.connectionClosed(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            cw.g r2 = r5.f51232c
            r2.noNewExchanges(r1)
            goto L15
        L67:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L6a:
            monitor-exit(r1)
            throw r6
        L6c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cw.w.callAcquirePooledConnection(boolean, xv.a, cw.h, java.util.List, boolean):cw.u");
    }

    public final long closeConnections(long j10) throws IOException {
        int i10;
        u uVar;
        long j11 = j10;
        Map map = this.f51235f;
        Iterator it = map.values().iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            ((a) it.next()).setConcurrentCallCapacity(0);
        }
        Iterator it2 = this.f51238i.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            u uVar2 = (u) it2.next();
            a aVar = (a) map.get(uVar2.getRoute().address());
            if (aVar != null) {
                kotlin.jvm.internal.e0.checkNotNull(uVar2);
                synchronized (uVar2) {
                    aVar.setConcurrentCallCapacity(aVar.getConcurrentCallCapacity() + uVar2.getAllocationLimit$okhttp());
                }
            }
        }
        long j12 = (j11 - this.f51234e) + 1;
        Iterator it3 = this.f51238i.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it3, "iterator(...)");
        long j13 = Long.MAX_VALUE;
        u uVar3 = null;
        u uVar4 = null;
        int i11 = 0;
        while (it3.hasNext()) {
            u uVar5 = (u) it3.next();
            kotlin.jvm.internal.e0.checkNotNull(uVar5);
            synchronized (uVar5) {
                if (a(uVar5, j11) > 0) {
                    i11++;
                } else {
                    long idleAtNs = uVar5.getIdleAtNs();
                    if (idleAtNs < j12) {
                        uVar3 = uVar5;
                        j12 = idleAtNs;
                    }
                    a aVar2 = (a) map.get(uVar5.getRoute().address());
                    if (aVar2 == null || aVar2.getConcurrentCallCapacity() - uVar5.getAllocationLimit$okhttp() >= aVar2.getPolicy().f51106a) {
                        i10++;
                        if (idleAtNs < j13) {
                            uVar4 = uVar5;
                            j13 = idleAtNs;
                        }
                    }
                }
            }
            j11 = j10;
        }
        if (uVar3 != null) {
            uVar = uVar3;
        } else if (i10 > this.f51231b) {
            j12 = j13;
            uVar = uVar4;
        } else {
            j12 = -1;
            uVar = null;
        }
        if (uVar == null) {
            if (uVar4 != null) {
                return (j13 + this.f51234e) - j10;
            }
            if (i11 > 0) {
                return this.f51234e;
            }
            return -1L;
        }
        synchronized (uVar) {
            if (!uVar.getCalls().isEmpty()) {
                return 0L;
            }
            if (uVar.getIdleAtNs() != j12) {
                return 0L;
            }
            uVar.setNoNewExchanges(true);
            this.f51238i.remove(uVar);
            a aVar3 = (a) map.get(uVar.getRoute().address());
            if (aVar3 != null) {
                b(aVar3);
            }
            yv.i.closeQuietly(uVar.socket());
            this.f51232c.connectionClosed(uVar);
            if (this.f51238i.isEmpty()) {
                this.f51236g.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = yv.i.f96667a;
        if (!connection.getNoNewExchanges() && this.f51231b != 0) {
            scheduleCloser();
            return false;
        }
        connection.setNoNewExchanges(true);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f51238i;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            this.f51236g.cancelAll();
        }
        scheduleOpener(connection.getRoute().address());
        return true;
    }

    public final int connectionCount() {
        return this.f51238i.size();
    }

    public final void evictAll() throws IOException {
        Socket socket;
        Iterator it = this.f51238i.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            u uVar = (u) it.next();
            kotlin.jvm.internal.e0.checkNotNull(uVar);
            synchronized (uVar) {
                if (uVar.getCalls().isEmpty()) {
                    it.remove();
                    uVar.setNoNewExchanges(true);
                    socket = uVar.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                yv.i.closeQuietly(socket);
                this.f51232c.connectionClosed(uVar);
            }
        }
        if (this.f51238i.isEmpty()) {
            this.f51236g.cancelAll();
        }
        Iterator it2 = this.f51235f.values().iterator();
        while (it2.hasNext()) {
            b((a) it2.next());
        }
    }

    public final g getConnectionListener$okhttp() {
        return this.f51232c;
    }

    public final long getKeepAliveDurationNs$okhttp() {
        return this.f51234e;
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<u> concurrentLinkedQueue = this.f51238i;
        int i10 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (u uVar : concurrentLinkedQueue) {
            kotlin.jvm.internal.e0.checkNotNull(uVar);
            synchronized (uVar) {
                zIsEmpty = uVar.getCalls().isEmpty();
            }
            if (zIsEmpty && (i10 = i10 + 1) < 0) {
                p0.throwCountOverflow();
            }
        }
        return i10;
    }

    public final void put(u connection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = yv.i.f96667a;
        this.f51238i.add(connection);
        scheduleCloser();
    }

    public final void scheduleCloser() {
        bw.c.schedule$default(this.f51236g, this.f51237h, 0L, 2, null);
    }

    public final void scheduleOpener(xv.a address) {
        kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
        a aVar = (a) this.f51235f.get(address);
        if (aVar != null) {
            b(aVar);
        }
    }

    public final void setPolicy(xv.a address, cw.a policy) {
        Map map;
        cw.a policy2;
        kotlin.jvm.internal.e0.checkNotNullParameter(address, "address");
        kotlin.jvm.internal.e0.checkNotNullParameter(policy, "policy");
        a aVar = new a(address, this.f51230a.newQueue(), policy);
        loop0: while (true) {
            map = this.f51235f;
            Map mapPlus = p1.plus(map, tu.e0.to(address, aVar));
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f51229j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, mapPlus)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
        }
        a aVar2 = (a) map.get(address);
        int i10 = policy.f51106a - ((aVar2 == null || (policy2 = aVar2.getPolicy()) == null) ? 0 : policy2.f51106a);
        if (i10 > 0) {
            b(aVar);
        } else if (i10 < 0) {
            scheduleCloser();
        }
    }
}
