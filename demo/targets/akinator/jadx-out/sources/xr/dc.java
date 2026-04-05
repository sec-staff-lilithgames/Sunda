package xr;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class dc extends wr.u {

    /* renamed from: b, reason: collision with root package name */
    public final rc f92439b;

    /* renamed from: c, reason: collision with root package name */
    public long f92440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f92441d;

    public dc(tc tcVar, rc rcVar) {
        this.f92441d = tcVar;
        this.f92439b = rcVar;
    }

    @Override // wr.p6
    public void outboundWireSize(long j10) {
        if (this.f92441d.f93053o.f92645f != null) {
            return;
        }
        synchronized (this.f92441d.f93047i) {
            try {
                if (this.f92441d.f93053o.f92645f == null) {
                    rc rcVar = this.f92439b;
                    if (!rcVar.f92967b) {
                        long j11 = this.f92440c + j10;
                        this.f92440c = j11;
                        tc tcVar = this.f92441d;
                        long j12 = tcVar.f93058t;
                        if (j11 <= j12) {
                            return;
                        }
                        if (j11 > tcVar.f93049k) {
                            rcVar.f92968c = true;
                        } else {
                            long jAddAndGet = ((AtomicLong) tcVar.f93048j.f7184a).addAndGet(j11 - j12);
                            tc tcVar2 = this.f92441d;
                            tcVar2.f93058t = this.f92440c;
                            if (jAddAndGet > tcVar2.f93050l) {
                                this.f92439b.f92968c = true;
                            }
                        }
                        rc rcVar2 = this.f92439b;
                        mb mbVarB = rcVar2.f92968c ? this.f92441d.b(rcVar2) : null;
                        if (mbVarB != null) {
                            mbVarB.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
