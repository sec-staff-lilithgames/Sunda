package xr;

import com.ironsource.C3191e4;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import xr.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i6 implements wr.m2, ef {

    /* renamed from: a, reason: collision with root package name */
    public final wr.n2 f92608a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92609b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92610c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f92611d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.internal.d0 f92612e;

    /* renamed from: f, reason: collision with root package name */
    public final r1 f92613f;

    /* renamed from: g, reason: collision with root package name */
    public final ScheduledExecutorService f92614g;

    /* renamed from: h, reason: collision with root package name */
    public final wr.e2 f92615h;

    /* renamed from: i, reason: collision with root package name */
    public final v0 f92616i;

    /* renamed from: j, reason: collision with root package name */
    public final y0 f92617j;

    /* renamed from: k, reason: collision with root package name */
    public final wr.m f92618k;

    /* renamed from: l, reason: collision with root package name */
    public final List f92619l;

    /* renamed from: m, reason: collision with root package name */
    public final wr.u6 f92620m;

    /* renamed from: n, reason: collision with root package name */
    public final c6 f92621n;

    /* renamed from: o, reason: collision with root package name */
    public volatile List f92622o;

    /* renamed from: p, reason: collision with root package name */
    public n0 f92623p;

    /* renamed from: q, reason: collision with root package name */
    public final mh.t2 f92624q;

    /* renamed from: r, reason: collision with root package name */
    public wr.t6 f92625r;

    /* renamed from: s, reason: collision with root package name */
    public wr.t6 f92626s;

    /* renamed from: t, reason: collision with root package name */
    public h9 f92627t;

    /* renamed from: w, reason: collision with root package name */
    public b6 f92630w;

    /* renamed from: x, reason: collision with root package name */
    public volatile b6 f92631x;

    /* renamed from: z, reason: collision with root package name */
    public wr.m6 f92633z;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f92628u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final o5 f92629v = new o5(this, 0);

    /* renamed from: y, reason: collision with root package name */
    public volatile wr.g0 f92632y = wr.g0.forNonError(wr.f0.f90915f);

    public i6(List list, String str, String str2, f4.a aVar, s0 s0Var, ScheduledExecutorService scheduledExecutorService, mh.v2 v2Var, wr.u6 u6Var, kotlin.jvm.internal.d0 d0Var, wr.e2 e2Var, v0 v0Var, y0 y0Var, wr.n2 n2Var, wr.m mVar, ArrayList arrayList) {
        mh.p1.checkNotNull(list, "addressGroups");
        mh.p1.checkArgument(!list.isEmpty(), "addressGroups is empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mh.p1.checkNotNull(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f92622o = listUnmodifiableList;
        this.f92621n = new c6(listUnmodifiableList);
        this.f92609b = str;
        this.f92610c = str2;
        this.f92611d = aVar;
        this.f92613f = s0Var;
        this.f92614g = scheduledExecutorService;
        this.f92624q = (mh.t2) v2Var.get();
        this.f92620m = u6Var;
        this.f92612e = d0Var;
        this.f92615h = e2Var;
        this.f92616i = v0Var;
        this.f92617j = (y0) mh.p1.checkNotNull(y0Var, "channelTracer");
        this.f92608a = (wr.n2) mh.p1.checkNotNull(n2Var, "logId");
        this.f92618k = (wr.m) mh.p1.checkNotNull(mVar, "channelLogger");
        this.f92619l = arrayList;
    }

    public static void a(i6 i6Var, wr.f0 f0Var) {
        i6Var.f92620m.throwIfNotInThisSynchronizationContext();
        i6Var.c(wr.g0.forNonError(f0Var));
    }

    public static void b(i6 i6Var) {
        SocketAddress targetAddress;
        wr.u1 u1Var;
        c6 c6Var = i6Var.f92621n;
        wr.u6 u6Var = i6Var.f92620m;
        u6Var.throwIfNotInThisSynchronizationContext();
        mh.p1.checkState(i6Var.f92625r == null, "Should have no reconnectTask scheduled");
        if (c6Var.isAtBeginning()) {
            i6Var.f92624q.reset().start();
        }
        SocketAddress currentAddress = c6Var.getCurrentAddress();
        if (currentAddress instanceof wr.u1) {
            u1Var = (wr.u1) currentAddress;
            targetAddress = u1Var.getTargetAddress();
        } else {
            targetAddress = currentAddress;
            u1Var = null;
        }
        wr.c currentEagAttributes = c6Var.getCurrentEagAttributes();
        String str = (String) currentEagAttributes.get(wr.f1.f90918d);
        p1 p1Var = new p1();
        if (str == null) {
            str = i6Var.f92609b;
        }
        p1 httpConnectProxiedSocketAddress = p1Var.setAuthority(str).setEagAttributes(currentEagAttributes).setUserAgent(i6Var.f92610c).setHttpConnectProxiedSocketAddress(u1Var);
        h6 h6Var = new h6();
        h6Var.f92585a = i6Var.getLogId();
        b6 b6Var = new b6(i6Var.f92613f.newClientTransport(targetAddress, httpConnectProxiedSocketAddress, h6Var), i6Var.f92616i);
        h6Var.f92585a = b6Var.getLogId();
        i6Var.f92615h.addClientSocket(b6Var);
        i6Var.f92630w = b6Var;
        i6Var.f92628u.add(b6Var);
        Runnable runnableStart = b6Var.start(new g6(i6Var, b6Var));
        if (runnableStart != null) {
            u6Var.executeLater(runnableStart);
        }
        i6Var.f92618k.log(wr.l.f91018c, "Started transport {0}", h6Var.f92585a);
    }

    public static String d(wr.m6 m6Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6Var.getCode());
        if (m6Var.getDescription() != null) {
            sb2.append("(");
            sb2.append(m6Var.getDescription());
            sb2.append(")");
        }
        if (m6Var.getCause() != null) {
            sb2.append(C3191e4.i.f36529d);
            sb2.append(m6Var.getCause());
            sb2.append(C3191e4.i.f36531e);
        }
        return sb2.toString();
    }

    public final void c(wr.g0 g0Var) {
        this.f92620m.throwIfNotInThisSynchronizationContext();
        if (this.f92632y.getState() != g0Var.getState()) {
            mh.p1.checkState(this.f92632y.getState() != wr.f0.f90916g, "Cannot transition out of SHUTDOWN to " + g0Var);
            this.f92632y = g0Var;
            this.f92612e.y(g0Var);
        }
    }

    @Override // wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f92608a;
    }

    @Override // wr.m2
    public sh.n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        this.f92620m.execute(new y5(this, a2VarCreate));
        return a2VarCreate;
    }

    @Override // xr.ef
    public o1 obtainActiveTransport() {
        b6 b6Var = this.f92631x;
        if (b6Var != null) {
            return b6Var;
        }
        this.f92620m.execute(new q5(this));
        return null;
    }

    public void shutdown(wr.m6 m6Var) {
        this.f92620m.execute(new u5(this, m6Var));
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("logId", this.f92608a.getId()).add("addressGroups", this.f92622o).toString();
    }

    public void updateAddresses(List<wr.f1> list) {
        mh.p1.checkNotNull(list, "newAddressGroups");
        Iterator<wr.f1> it = list.iterator();
        while (it.hasNext()) {
            mh.p1.checkNotNull(it.next(), "newAddressGroups contains null entry");
        }
        mh.p1.checkArgument(!list.isEmpty(), "newAddressGroups is empty");
        this.f92620m.execute(new t5(this, Collections.unmodifiableList(new ArrayList(list))));
    }
}
