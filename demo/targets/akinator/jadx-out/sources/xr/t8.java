package xr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xr.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t8 extends o {

    /* renamed from: a, reason: collision with root package name */
    public final wr.a3 f93012a;

    /* renamed from: b, reason: collision with root package name */
    public final wr.n2 f93013b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f93014c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f93015d;

    /* renamed from: e, reason: collision with root package name */
    public List f93016e;

    /* renamed from: f, reason: collision with root package name */
    public i6 f93017f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93018g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93019h;

    /* renamed from: i, reason: collision with root package name */
    public wr.t6 f93020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u8 f93021j;

    public t8(u8 u8Var, wr.a3 a3Var) {
        this.f93021j = u8Var;
        mh.p1.checkNotNull(a3Var, "args");
        this.f93016e = a3Var.getAddresses();
        String str = u8Var.f93101c;
        cf cfVar = u8Var.f93124q;
        if (str != null) {
            a3Var = a3Var.toBuilder().setAddresses(a(a3Var.getAddresses())).build();
        }
        this.f93012a = a3Var;
        wr.n2 n2VarAllocate = wr.n2.allocate("Subchannel", u8Var.authority());
        this.f93013b = n2VarAllocate;
        y0 y0Var = new y0(n2VarAllocate, u8Var.f93125r, ((bf) cfVar).currentTimeNanos(), "Subchannel for " + a3Var.getAddresses());
        this.f93015d = y0Var;
        this.f93014c = new w0(y0Var, cfVar);
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wr.f1 f1Var = (wr.f1) it.next();
            arrayList.add(new wr.f1(f1Var.getAddresses(), f1Var.getAttributes().toBuilder().discard(wr.f1.f90918d).build()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // wr.b3.e
    public wr.j asChannel() {
        mh.p1.checkState(this.f93018g, "not started");
        i6 i6Var = this.f93017f;
        u8 u8Var = this.f93021j;
        return new af(i6Var, u8Var.f93122o.a(), u8Var.f93113i.getScheduledExecutorService(), u8Var.S.create(), new AtomicReference(null));
    }

    @Override // wr.b3.e
    public List<wr.f1> getAllAddresses() {
        this.f93021j.f93126s.throwIfNotInThisSynchronizationContext();
        mh.p1.checkState(this.f93018g, "not started");
        return this.f93016e;
    }

    @Override // wr.b3.e
    public wr.c getAttributes() {
        return this.f93012a.getAttributes();
    }

    @Override // wr.b3.e
    public wr.m getChannelLogger() {
        return this.f93014c;
    }

    @Override // wr.b3.e
    public Object getInternalSubchannel() {
        mh.p1.checkState(this.f93018g, "Subchannel is not started");
        return this.f93017f;
    }

    @Override // wr.b3.e
    public void requestConnection() {
        this.f93021j.f93126s.throwIfNotInThisSynchronizationContext();
        mh.p1.checkState(this.f93018g, "not started");
        this.f93017f.obtainActiveTransport();
    }

    @Override // wr.b3.e
    public void shutdown() {
        wr.t6 t6Var;
        u8 u8Var = this.f93021j;
        u8Var.f93126s.throwIfNotInThisSynchronizationContext();
        if (this.f93017f == null) {
            this.f93019h = true;
            return;
        }
        if (!this.f93019h) {
            this.f93019h = true;
        } else {
            if (!u8Var.P || (t6Var = this.f93020i) == null) {
                return;
            }
            t6Var.cancel();
            this.f93020i = null;
        }
        if (u8Var.P) {
            this.f93017f.shutdown(u8.f93092o0);
        } else {
            this.f93020i = u8Var.f93126s.schedule(new x6(new s8(this)), 5L, TimeUnit.SECONDS, u8Var.f93113i.getScheduledExecutorService());
        }
    }

    @Override // wr.b3.e
    public void start(wr.f3 f3Var) {
        u8 u8Var = this.f93021j;
        u8Var.f93126s.throwIfNotInThisSynchronizationContext();
        mh.p1.checkState(!this.f93018g, "already started");
        mh.p1.checkState(!this.f93019h, "already shutdown");
        mh.p1.checkState(!u8Var.P, "Channel is being terminated");
        this.f93018g = true;
        List<wr.f1> addresses = this.f93012a.getAddresses();
        String strAuthority = u8Var.authority();
        String str = u8Var.B;
        f4.a aVar = u8Var.f93132y;
        s0 s0Var = u8Var.f93113i;
        i6 i6Var = new i6(addresses, strAuthority, str, aVar, s0Var, s0Var.getScheduledExecutorService(), u8Var.f93129v, u8Var.f93126s, new y7(1, this, f3Var), u8Var.W, u8Var.S.create(), this.f93015d, this.f93013b, this.f93014c, u8Var.A);
        u8Var.U.b(new wr.a2().setDescription("Child Subchannel started").setSeverity(wr.b2.f90824b).setTimestampNanos(((bf) u8Var.f93124q).currentTimeNanos()).setSubchannelRef(i6Var).build());
        this.f93017f = i6Var;
        u8Var.W.addSubchannel(i6Var);
        u8Var.H.add(i6Var);
    }

    public String toString() {
        return this.f93013b.toString();
    }

    @Override // wr.b3.e
    public void updateAddresses(List<wr.f1> list) {
        u8 u8Var = this.f93021j;
        u8Var.f93126s.throwIfNotInThisSynchronizationContext();
        this.f93016e = list;
        if (u8Var.f93101c != null) {
            list = a(list);
        }
        this.f93017f.updateAddresses(list);
    }
}
