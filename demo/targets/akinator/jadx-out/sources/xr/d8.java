package xr;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import wr.b3;
import xr.f4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d8 extends b3.c {

    /* renamed from: a, reason: collision with root package name */
    public g0 f92425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u8 f92426b;

    public d8(u8 u8Var) {
        this.f92426b = u8Var;
    }

    @Override // wr.b3.c
    public wr.k3 createOobChannel(wr.f1 f1Var, String str) {
        return createOobChannel(Collections.singletonList(f1Var), str);
    }

    @Override // wr.b3.c
    @Deprecated
    public wr.l3 createResolvingOobChannelBuilder(String str) {
        return createResolvingOobChannelBuilder(str, new c8()).overrideAuthority(getAuthority());
    }

    @Override // wr.b3.c
    public String getAuthority() {
        return this.f92426b.authority();
    }

    @Override // wr.b3.c
    public wr.m getChannelLogger() {
        return this.f92426b.V;
    }

    @Override // wr.b3.c
    public wr.n4 getNameResolverArgs() {
        return this.f92426b.f93105e;
    }

    @Override // wr.b3.c
    public wr.w4 getNameResolverRegistry() {
        return this.f92426b.f93103d;
    }

    @Override // wr.b3.c
    public ScheduledExecutorService getScheduledExecutorService() {
        return this.f92426b.f93117k;
    }

    @Override // wr.b3.c
    public wr.u6 getSynchronizationContext() {
        return this.f92426b.f93126s;
    }

    @Override // wr.b3.c
    public wr.k getUnsafeChannelCredentials() {
        wr.k kVar = this.f92426b.f93111h;
        return kVar == null ? new c8() : kVar;
    }

    @Override // wr.b3.c
    public void refreshNameResolution() {
        wr.u6 u6Var = this.f92426b.f93126s;
        u6Var.throwIfNotInThisSynchronizationContext();
        u6Var.execute(new x7(this));
    }

    @Override // wr.b3.c
    public void updateBalancingState(wr.f0 f0Var, b3.f fVar) {
        wr.u6 u6Var = this.f92426b.f93126s;
        u6Var.throwIfNotInThisSynchronizationContext();
        mh.p1.checkNotNull(f0Var, "newState");
        mh.p1.checkNotNull(fVar, "newPicker");
        u6Var.execute(new b8(this, fVar, f0Var));
    }

    @Override // wr.b3.c
    public void updateOobChannelAddresses(wr.k3 k3Var, wr.f1 f1Var) {
        updateOobChannelAddresses(k3Var, Collections.singletonList(f1Var));
    }

    @Override // wr.b3.c
    public wr.k3 createOobChannel(List<wr.f1> list, String str) {
        mh.p1.checkState(!this.f92426b.Q, "Channel is terminated");
        long jCurrentTimeNanos = ((bf) this.f92426b.f93124q).currentTimeNanos();
        wr.n2 n2VarAllocate = wr.n2.allocate("OobChannel", (String) null);
        wr.n2 n2VarAllocate2 = wr.n2.allocate("Subchannel-OOB", str);
        y0 y0Var = new y0(n2VarAllocate, this.f92426b.f93125r, jCurrentTimeNanos, "OobChannel for " + list);
        u8 u8Var = this.f92426b;
        y9 y9Var = u8Var.f93121n;
        ScheduledExecutorService scheduledExecutorService = u8Var.f93115j.getScheduledExecutorService();
        u8 u8Var2 = this.f92426b;
        wr.u6 u6Var = u8Var2.f93126s;
        v0 v0VarCreate = u8Var2.S.create();
        u8 u8Var3 = this.f92426b;
        ea eaVar = new ea(str, y9Var, scheduledExecutorService, u6Var, v0VarCreate, y0Var, u8Var3.W, u8Var3.f93124q);
        y0 y0Var2 = this.f92426b.U;
        wr.a2 description = new wr.a2().setDescription("Child OobChannel created");
        wr.b2 b2Var = wr.b2.f90824b;
        y0Var2.b(description.setSeverity(b2Var).setTimestampNanos(jCurrentTimeNanos).setChannelRef(eaVar).build());
        y0 y0Var3 = new y0(n2VarAllocate2, this.f92426b.f93125r, jCurrentTimeNanos, "Subchannel for " + list);
        w0 w0Var = new w0(y0Var3, this.f92426b.f93124q);
        u8 u8Var4 = this.f92426b;
        String str2 = u8Var4.B;
        f4.a aVar = u8Var4.f93132y;
        s0 s0Var = u8Var4.f93115j;
        ScheduledExecutorService scheduledExecutorService2 = s0Var.getScheduledExecutorService();
        u8 u8Var5 = this.f92426b;
        i6 i6Var = new i6(list, str, str2, aVar, s0Var, scheduledExecutorService2, u8Var5.f93129v, u8Var5.f93126s, new y7(0, this, eaVar), u8Var5.W, u8Var5.S.create(), y0Var3, n2VarAllocate2, w0Var, this.f92426b.A);
        y0Var.b(new wr.a2().setDescription("Child Subchannel created").setSeverity(b2Var).setTimestampNanos(jCurrentTimeNanos).setSubchannelRef(i6Var).build());
        this.f92426b.W.addSubchannel(eaVar);
        this.f92426b.W.addSubchannel(i6Var);
        ea.f92470q.log(Level.FINE, "[{0}] Created with [{1}]", new Object[]{eaVar, i6Var});
        eaVar.f92471a = i6Var;
        eaVar.f92472b = new da(i6Var);
        ba baVar = new ba(eaVar);
        eaVar.f92473c = baVar;
        eaVar.f92476f.b(baVar);
        this.f92426b.f93126s.execute(new w7(this, eaVar));
        return eaVar;
    }

    @Override // wr.b3.c
    public o createSubchannel(wr.a3 a3Var) {
        u8 u8Var = this.f92426b;
        u8Var.f93126s.throwIfNotInThisSynchronizationContext();
        mh.p1.checkState(!u8Var.P, "Channel is being terminated");
        return new t8(u8Var, a3Var);
    }

    @Override // wr.b3.c
    public void updateOobChannelAddresses(wr.k3 k3Var, List<wr.f1> list) {
        mh.p1.checkArgument(k3Var instanceof ea, "channel must have been returned from createOobChannel");
        ((ea) k3Var).f92471a.updateAddresses(list);
    }

    @Override // wr.b3.c
    public wr.l3 createResolvingOobChannelBuilder(String str, wr.k kVar) {
        mh.p1.checkNotNull(kVar, "channelCreds");
        mh.p1.checkState(!this.f92426b.Q, OcvDtWCQ.XqYFDZfdn);
        return ((a8) ((a8) ((a8) ((a8) new a8(this, kVar, str).executor(this.f92426b.f93119l)).offloadExecutor(this.f92426b.f93123p.a())).maxTraceEvents(this.f92426b.f93125r)).proxyDetector(this.f92426b.f93105e.getProxyDetector())).userAgent(this.f92426b.B);
    }
}
