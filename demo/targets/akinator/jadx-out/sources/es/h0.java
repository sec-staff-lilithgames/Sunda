package es;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import wr.a3;
import wr.b3;
import wr.f1;
import wr.f3;
import wr.m6;
import wr.z2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h0 extends e {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f55035a;

    /* renamed from: b, reason: collision with root package name */
    public r f55036b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f55037c;

    /* renamed from: d, reason: collision with root package name */
    public wr.g0 f55038d;

    /* renamed from: e, reason: collision with root package name */
    public f3 f55039e;

    /* renamed from: f, reason: collision with root package name */
    public final wr.m f55040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k0 f55041g;

    public h0(k0 k0Var, a3 a3Var, l lVar) {
        this.f55041g = k0Var;
        z2 z2Var = b3.f90829c;
        f3 f3Var = (f3) a3Var.getOption(z2Var);
        if (f3Var != null) {
            this.f55039e = f3Var;
            this.f55035a = lVar.createSubchannel(a3Var.toBuilder().addOption(z2Var, new g0(this, f3Var)).build());
        } else {
            this.f55035a = lVar.createSubchannel(a3Var);
        }
        this.f55040f = this.f55035a.getChannelLogger();
    }

    public final void a() {
        this.f55037c = true;
        this.f55039e.onSubchannelState(wr.g0.forTransientFailure(m6.f91047o));
        this.f55040f.log(wr.l.f91018c, "Subchannel ejected: {0}", this);
    }

    @Override // es.e
    public final b3.e delegate() {
        return this.f55035a;
    }

    @Override // es.e, wr.b3.e
    public wr.c getAttributes() {
        r rVar = this.f55036b;
        b3.e eVar = this.f55035a;
        return rVar != null ? eVar.getAttributes().toBuilder().set(k0.f55058n, this.f55036b).build() : eVar.getAttributes();
    }

    @Override // es.e, wr.b3.e
    public void shutdown() {
        r rVar = this.f55036b;
        if (rVar != null) {
            this.f55036b = null;
            rVar.f55099f.remove(this);
        }
        super.shutdown();
    }

    @Override // es.e, wr.b3.e
    public void start(f3 f3Var) {
        if (this.f55039e != null) {
            super.start(f3Var);
        } else {
            this.f55039e = f3Var;
            super.start(new g0(this, f3Var));
        }
    }

    @Override // es.e
    public String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f55035a.getAllAddresses() + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // es.e, wr.b3.e
    public void updateAddresses(List<f1> list) {
        k0 k0Var = this.f55041g;
        if (k0.a(getAllAddresses()) && k0.a(list)) {
            if (k0Var.f55059f.containsValue(this.f55036b)) {
                r rVar = this.f55036b;
                rVar.getClass();
                this.f55036b = null;
                rVar.f55099f.remove(this);
            }
            SocketAddress socketAddress = list.get(0).getAddresses().get(0);
            if (k0Var.f55059f.containsKey(socketAddress)) {
                ((r) k0Var.f55059f.get(socketAddress)).a(this);
            }
        } else if (!k0.a(getAllAddresses()) || k0.a(list)) {
            if (!k0.a(getAllAddresses()) && k0.a(list)) {
                SocketAddress socketAddress2 = list.get(0).getAddresses().get(0);
                if (k0Var.f55059f.containsKey(socketAddress2)) {
                    ((r) k0Var.f55059f.get(socketAddress2)).a(this);
                }
            }
        } else if (k0Var.f55059f.containsKey(getAddresses().getAddresses().get(0))) {
            r rVar2 = (r) k0Var.f55059f.get(getAddresses().getAddresses().get(0));
            rVar2.getClass();
            this.f55036b = null;
            rVar2.f55099f.remove(this);
            androidx.localbroadcastmanager.content.b bVar = rVar2.f55095b;
            ((AtomicLong) bVar.f6756a).set(0L);
            ((AtomicLong) bVar.f6757b).set(0L);
            androidx.localbroadcastmanager.content.b bVar2 = rVar2.f55096c;
            ((AtomicLong) bVar2.f6756a).set(0L);
            ((AtomicLong) bVar2.f6757b).set(0L);
        }
        this.f55035a.updateAddresses(list);
    }
}
