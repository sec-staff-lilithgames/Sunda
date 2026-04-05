package xr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ta extends wr.b3 {

    /* renamed from: f, reason: collision with root package name */
    public final b3.c f93035f;

    /* renamed from: g, reason: collision with root package name */
    public b3.e f93036g;

    /* renamed from: h, reason: collision with root package name */
    public wr.f0 f93037h = wr.f0.f90915f;

    public ta(b3.c cVar) {
        this.f93035f = (b3.c) mh.p1.checkNotNull(cVar, "helper");
    }

    @Override // wr.b3
    public wr.m6 acceptResolvedAddresses(wr.e3 e3Var) {
        Boolean bool;
        List<wr.f1> addresses = e3Var.getAddresses();
        if (addresses.isEmpty()) {
            wr.m6 m6VarWithDescription = wr.m6.f91047o.withDescription("NameResolver returned no usable address. addrs=" + e3Var.getAddresses() + ", attrs=" + e3Var.getAttributes());
            handleNameResolutionError(m6VarWithDescription);
            return m6VarWithDescription;
        }
        if ((e3Var.getLoadBalancingPolicyConfig() instanceof pa) && (bool = ((pa) e3Var.getLoadBalancingPolicyConfig()).f92900a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(addresses);
            Collections.shuffle(arrayList, new Random());
            addresses = arrayList;
        }
        b3.e eVar = this.f93036g;
        if (eVar == null) {
            wr.a3 a3VarBuild = wr.a3.newBuilder().setAddresses(addresses).build();
            b3.c cVar = this.f93035f;
            b3.e eVarCreateSubchannel = cVar.createSubchannel(a3VarBuild);
            eVarCreateSubchannel.start(new oa(this, eVarCreateSubchannel));
            this.f93036g = eVarCreateSubchannel;
            qa qaVar = new qa(wr.c3.withSubchannel(eVarCreateSubchannel));
            wr.f0 f0Var = wr.f0.f90912b;
            this.f93037h = f0Var;
            cVar.updateBalancingState(f0Var, qaVar);
            eVarCreateSubchannel.requestConnection();
        } else {
            eVar.updateAddresses(addresses);
        }
        return wr.m6.f91037e;
    }

    @Override // wr.b3
    public void handleNameResolutionError(wr.m6 m6Var) {
        b3.e eVar = this.f93036g;
        if (eVar != null) {
            eVar.shutdown();
            this.f93036g = null;
        }
        qa qaVar = new qa(wr.c3.withError(m6Var));
        wr.f0 f0Var = wr.f0.f90914e;
        this.f93037h = f0Var;
        this.f93035f.updateBalancingState(f0Var, qaVar);
    }

    @Override // wr.b3
    public void requestConnection() {
        b3.e eVar = this.f93036g;
        if (eVar != null) {
            eVar.requestConnection();
        }
    }

    @Override // wr.b3
    public void shutdown() {
        b3.e eVar = this.f93036g;
        if (eVar != null) {
            eVar.shutdown();
        }
    }
}
