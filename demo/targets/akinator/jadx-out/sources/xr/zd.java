package xr;

import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import wr.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class zd extends wr.i5 implements wr.m2 {

    /* renamed from: b, reason: collision with root package name */
    public final wr.n2 f93337b;

    /* renamed from: c, reason: collision with root package name */
    public final y9 f93338c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f93339d;

    /* renamed from: e, reason: collision with root package name */
    public final wr.r1 f93340e;

    /* renamed from: f, reason: collision with root package name */
    public final wr.r1 f93341f;

    /* renamed from: g, reason: collision with root package name */
    public final List f93342g;

    /* renamed from: h, reason: collision with root package name */
    public final wr.o5[] f93343h;

    /* renamed from: i, reason: collision with root package name */
    public final long f93344i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93345j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f93346k;

    /* renamed from: l, reason: collision with root package name */
    public wr.m6 f93347l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93348m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f93349n;

    /* renamed from: o, reason: collision with root package name */
    public final n5 f93350o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93352q;

    /* renamed from: s, reason: collision with root package name */
    public final wr.u0 f93354s;

    /* renamed from: t, reason: collision with root package name */
    public final wr.c1 f93355t;

    /* renamed from: u, reason: collision with root package name */
    public final wr.e0 f93356u;

    /* renamed from: v, reason: collision with root package name */
    public final wr.d f93357v;

    /* renamed from: w, reason: collision with root package name */
    public final wr.e2 f93358w;

    /* renamed from: x, reason: collision with root package name */
    public final v0 f93359x;

    /* renamed from: y, reason: collision with root package name */
    public final wr.y0 f93360y;

    /* renamed from: z, reason: collision with root package name */
    public static final Logger f93336z = Logger.getLogger(zd.class.getName());
    public static final qd A = new qd();

    /* renamed from: p, reason: collision with root package name */
    public final Object f93351p = new Object();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f93353r = new HashSet();

    public final void a() {
        synchronized (this.f93351p) {
            try {
                if (this.f93346k && this.f93353r.isEmpty() && this.f93352q) {
                    if (this.f93349n) {
                        throw new AssertionError("Server already terminated");
                    }
                    this.f93349n = true;
                    this.f93358w.removeServer(this);
                    Executor executor = this.f93339d;
                    if (executor != null) {
                        this.f93339d = (Executor) this.f93338c.returnObject(executor);
                    }
                    this.f93351p.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.i5
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        boolean z10;
        synchronized (this.f93351p) {
            try {
                long jNanoTime = System.nanoTime() + timeUnit.toNanos(j10);
                while (!this.f93349n) {
                    long jNanoTime2 = jNanoTime - System.nanoTime();
                    if (jNanoTime2 <= 0) {
                        break;
                    }
                    TimeUnit.NANOSECONDS.timedWait(this.f93351p, jNanoTime2);
                }
                z10 = this.f93349n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // wr.i5
    public List<wr.a6> getImmutableServices() {
        return this.f93340e.getServices();
    }

    @Override // wr.i5
    public List<SocketAddress> getListenSockets() {
        List<SocketAddress> listUnmodifiableList;
        synchronized (this.f93351p) {
            mh.p1.checkState(this.f93345j, "Not started");
            mh.p1.checkState(!this.f93349n, "Already terminated");
            synchronized (this.f93351p) {
                listUnmodifiableList = Collections.unmodifiableList(this.f93350o.getListenSocketAddresses());
            }
        }
        return listUnmodifiableList;
    }

    @Override // wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f93337b;
    }

    @Override // wr.i5
    public List<wr.a6> getMutableServices() {
        return Collections.unmodifiableList(this.f93341f.getServices());
    }

    @Override // wr.i5
    public int getPort() {
        synchronized (this.f93351p) {
            try {
                mh.p1.checkState(this.f93345j, "Not started");
                mh.p1.checkState(!this.f93349n, "Already terminated");
                for (SocketAddress socketAddress : this.f93350o.getListenSocketAddresses()) {
                    if (socketAddress instanceof InetSocketAddress) {
                        return ((InetSocketAddress) socketAddress).getPort();
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.i5
    public List<wr.a6> getServices() {
        List<wr.a6> services = this.f93341f.getServices();
        boolean zIsEmpty = services.isEmpty();
        wr.r1 r1Var = this.f93340e;
        if (zIsEmpty) {
            return r1Var.getServices();
        }
        List<wr.a6> services2 = r1Var.getServices();
        ArrayList arrayList = new ArrayList(services.size() + services2.size());
        arrayList.addAll(services2);
        arrayList.addAll(services);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // wr.m2
    public sh.n1 getStats() {
        e2.f.a aVar = new e2.f.a();
        List<wr.m2> listenSocketStatsList = this.f93350o.getListenSocketStatsList();
        if (listenSocketStatsList != null) {
            aVar.addListenSockets(listenSocketStatsList);
        }
        v0 v0Var = this.f93359x;
        aVar.setCallsStarted(v0Var.f93155b.value()).setCallsSucceeded(v0Var.f93156c.value()).setCallsFailed(v0Var.f93157d.value()).setLastCallStartedNanos(v0Var.f93158e);
        sh.a2 a2VarCreate = sh.a2.create();
        a2VarCreate.set(aVar.build());
        return a2VarCreate;
    }

    @Override // wr.i5
    public boolean isShutdown() {
        boolean z10;
        synchronized (this.f93351p) {
            z10 = this.f93346k;
        }
        return z10;
    }

    @Override // wr.i5
    public boolean isTerminated() {
        boolean z10;
        synchronized (this.f93351p) {
            z10 = this.f93349n;
        }
        return z10;
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("logId", this.f93337b.getId()).add("transportServer", this.f93350o).toString();
    }

    @Override // wr.i5
    public zd shutdown() {
        synchronized (this.f93351p) {
            try {
                if (this.f93346k) {
                    return this;
                }
                this.f93346k = true;
                boolean z10 = this.f93345j;
                if (!z10) {
                    this.f93352q = true;
                    a();
                }
                if (z10) {
                    this.f93350o.shutdown();
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.i5
    public zd shutdownNow() {
        shutdown();
        wr.m6 m6VarWithDescription = wr.m6.f91047o.withDescription("Server shutdownNow invoked");
        synchronized (this.f93351p) {
            try {
                if (this.f93347l != null) {
                    return this;
                }
                this.f93347l = m6VarWithDescription;
                ArrayList arrayList = new ArrayList(this.f93353r);
                boolean z10 = this.f93348m;
                if (z10) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ge) it.next()).shutdownNow(m6VarWithDescription);
                    }
                }
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.i5
    public zd start() throws IOException {
        synchronized (this.f93351p) {
            mh.p1.checkState(!this.f93345j, "Already started");
            mh.p1.checkState(!this.f93346k, "Shutting down");
            this.f93350o.start(new rd(this));
            this.f93339d = (Executor) mh.p1.checkNotNull((Executor) this.f93338c.getObject(), "executor");
            this.f93345j = true;
        }
        return this;
    }

    public zd(ce ceVar, yr.k0 k0Var, wr.u0 u0Var) {
        List listUnmodifiableList;
        this.f93338c = (y9) mh.p1.checkNotNull(ceVar.f92349g, "executorPool");
        androidx.recyclerview.widget.l1 l1Var = ceVar.f92343a;
        l1Var.getClass();
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = (LinkedHashMap) l1Var.f7184a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            for (wr.t5 t5Var : ((wr.a6) it.next()).getMethods()) {
                map.put(t5Var.getMethodDescriptor().getFullMethodName(), t5Var);
            }
        }
        this.f93340e = (wr.r1) mh.p1.checkNotNull(new m5(Collections.unmodifiableList(new ArrayList(linkedHashMap.values())), Collections.unmodifiableMap(map)), "registryBuilder");
        this.f93341f = (wr.r1) mh.p1.checkNotNull(ceVar.f92348f, SUvoXnn.TEo);
        n5 n5Var = (n5) mh.p1.checkNotNull(k0Var, "transportServer");
        this.f93350o = n5Var;
        synchronized (this.f93351p) {
            listUnmodifiableList = Collections.unmodifiableList(n5Var.getListenSocketAddresses());
        }
        this.f93337b = wr.n2.allocate("Server", String.valueOf(listUnmodifiableList));
        this.f93354s = ((wr.u0) mh.p1.checkNotNull(u0Var, "rootContext")).fork();
        this.f93355t = ceVar.f92350h;
        this.f93356u = ceVar.f92351i;
        this.f93342g = Collections.unmodifiableList(new ArrayList(ceVar.f92344b));
        ArrayList arrayList = ceVar.f92345c;
        this.f93343h = (wr.o5[]) arrayList.toArray(new wr.o5[arrayList.size()]);
        this.f93344i = ceVar.f92352j;
        this.f93357v = ceVar.f92359q;
        wr.e2 e2Var = ceVar.f92360r;
        this.f93358w = e2Var;
        this.f93359x = ceVar.f92361s.create();
        this.f93360y = (wr.y0) mh.p1.checkNotNull(ceVar.f92353k, "ticker");
        e2Var.addServer(this);
    }

    @Override // wr.i5
    public void awaitTermination() throws InterruptedException {
        synchronized (this.f93351p) {
            while (!this.f93349n) {
                try {
                    this.f93351p.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
