package xr;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class qc implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final rc f92932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc f92933b;

    public qc(tc tcVar, rc rcVar) {
        this.f92933b = tcVar;
        this.f92932a = rcVar;
    }

    @Override // xr.m1
    public void closed(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) throws NumberFormatException {
        boolean z10;
        androidx.appcompat.app.h1 h1Var;
        tc tcVar;
        com.bumptech.glide.manager.d0 d0Var;
        Integer numValueOf = -1;
        synchronized (this.f92933b.f93047i) {
            tc tcVar2 = this.f92933b;
            tcVar2.f93053o = tcVar2.f93053o.d(this.f92932a);
            this.f92933b.f93052n.append(m6Var.getCode());
        }
        if (this.f92933b.f93056r.decrementAndGet() == Integer.MIN_VALUE) {
            this.f92933b.f93041c.execute(new mc(this));
            return;
        }
        rc rcVar = this.f92932a;
        if (rcVar.f92968c) {
            tc tcVar3 = this.f92933b;
            mb mbVarB = tcVar3.b(rcVar);
            if (mbVarB != null) {
                tcVar3.f93040b.execute(mbVarB);
            }
            if (this.f92933b.f93053o.f92645f == this.f92932a) {
                this.f92933b.h(m6Var, l1Var, e4Var);
                return;
            }
            return;
        }
        l1 l1Var2 = l1.f92751f;
        if (l1Var == l1Var2 && this.f92933b.f93055q.incrementAndGet() > 1000) {
            tc tcVar4 = this.f92933b;
            mb mbVarB2 = tcVar4.b(this.f92932a);
            if (mbVarB2 != null) {
                tcVar4.f93040b.execute(mbVarB2);
            }
            if (this.f92933b.f93053o.f92645f == this.f92932a) {
                this.f92933b.h(wr.m6.f91046n.withDescription("Too many transparent retries. Might be a bug in gRPC").withCause(m6Var.asRuntimeException()), l1Var, e4Var);
                return;
            }
            return;
        }
        if (this.f92933b.f93053o.f92645f == null) {
            if (l1Var == l1Var2 || (l1Var == l1.f92749c && this.f92933b.f93054p.compareAndSet(false, true))) {
                rc rcVarC = this.f92933b.c(this.f92932a.f92969d, true);
                if (rcVarC == null) {
                    return;
                }
                tc tcVar5 = this.f92933b;
                if (tcVar5.f93046h) {
                    synchronized (tcVar5.f93047i) {
                        tc tcVar6 = this.f92933b;
                        tcVar6.f93053o = tcVar6.f93053o.c(this.f92932a, rcVarC);
                    }
                }
                this.f92933b.f93040b.execute(new nc(this, rcVarC));
                return;
            }
            if (l1Var == l1.f92750e) {
                tc tcVar7 = this.f92933b;
                if (tcVar7.f93046h) {
                    tcVar7.f();
                }
            } else {
                this.f92933b.f93054p.set(true);
                tc tcVar8 = this.f92933b;
                if (tcVar8.f93046h) {
                    String str = (String) e4Var.get(tc.B);
                    if (str != null) {
                        try {
                            numValueOf = Integer.valueOf(str);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        numValueOf = null;
                    }
                    tc tcVar9 = this.f92933b;
                    boolean zContains = tcVar9.f93045g.f92463c.contains(m6Var.getCode());
                    boolean z11 = (tcVar9.f93051m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !tcVar9.f93051m.a();
                    if (zContains && !z11 && !m6Var.isOk() && numValueOf != null && numValueOf.intValue() > 0) {
                        numValueOf = 0;
                    }
                    ec ecVar = new ec(zContains && !z11, numValueOf);
                    if (ecVar.f92488a) {
                        tc.a(this.f92933b, ecVar.f92489b);
                    }
                    synchronized (this.f92933b.f93047i) {
                        try {
                            tc tcVar10 = this.f92933b;
                            tcVar10.f93053o = tcVar10.f93053o.b(this.f92932a);
                            if (ecVar.f92488a) {
                                tc tcVar11 = this.f92933b;
                                if (!tcVar11.g(tcVar11.f93053o)) {
                                    if (!this.f92933b.f93053o.f92643d.isEmpty()) {
                                    }
                                }
                                return;
                            }
                        } finally {
                        }
                    }
                } else {
                    uc ucVar = tcVar8.f93044f;
                    long nanos = 0;
                    if (ucVar == null) {
                        h1Var = new androidx.appcompat.app.h1(false, 0L);
                    } else {
                        boolean zContains2 = ucVar.f93141f.contains(m6Var.getCode());
                        String str2 = (String) e4Var.get(tc.B);
                        if (str2 != null) {
                            try {
                                numValueOf = Integer.valueOf(str2);
                            } catch (NumberFormatException unused2) {
                            }
                        } else {
                            numValueOf = null;
                        }
                        boolean z12 = (tcVar8.f93051m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !tcVar8.f93051m.a();
                        if (tcVar8.f93044f.f93136a <= this.f92932a.f92969d + 1 || z12) {
                            z10 = false;
                            h1Var = new androidx.appcompat.app.h1(z10, nanos);
                        } else {
                            if (numValueOf == null) {
                                if (zContains2) {
                                    nanos = (long) (tc.D.nextDouble() * tcVar8.f93062x);
                                    double d10 = tcVar8.f93062x;
                                    uc ucVar2 = tcVar8.f93044f;
                                    tcVar8.f93062x = Math.min((long) (d10 * ucVar2.f93139d), ucVar2.f93138c);
                                    z10 = true;
                                }
                                z10 = false;
                            } else {
                                if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    tcVar8.f93062x = tcVar8.f93044f.f93137b;
                                    z10 = true;
                                }
                                z10 = false;
                            }
                            h1Var = new androidx.appcompat.app.h1(z10, nanos);
                        }
                    }
                    if (h1Var.f4746a) {
                        rc rcVarC2 = this.f92933b.c(this.f92932a.f92969d + 1, false);
                        if (rcVarC2 == null) {
                            return;
                        }
                        synchronized (this.f92933b.f93047i) {
                            tcVar = this.f92933b;
                            d0Var = new com.bumptech.glide.manager.d0(tcVar.f93047i);
                            tcVar.f93060v = d0Var;
                        }
                        d0Var.c(tcVar.f93042d.schedule(new lc(this, rcVarC2), h1Var.f4747b, TimeUnit.NANOSECONDS));
                        return;
                    }
                }
            }
        }
        tc tcVar12 = this.f92933b;
        mb mbVarB3 = tcVar12.b(this.f92932a);
        if (mbVarB3 != null) {
            tcVar12.f93040b.execute(mbVarB3);
        }
        if (this.f92933b.f93053o.f92645f == this.f92932a) {
            this.f92933b.h(m6Var, l1Var, e4Var);
        }
    }

    @Override // xr.m1
    public void headersRead(wr.e4 e4Var) {
        int i10;
        int i11;
        if (this.f92932a.f92969d > 0) {
            wr.z3 z3Var = tc.A;
            e4Var.discardAll(z3Var);
            e4Var.put(z3Var, String.valueOf(this.f92932a.f92969d));
        }
        tc tcVar = this.f92933b;
        rc rcVar = this.f92932a;
        wr.z3 z3Var2 = tc.A;
        mb mbVarB = tcVar.b(rcVar);
        if (mbVarB != null) {
            tcVar.f93040b.execute(mbVarB);
        }
        if (this.f92933b.f93053o.f92645f == this.f92932a) {
            sc scVar = this.f92933b.f93051m;
            if (scVar != null) {
                AtomicInteger atomicInteger = scVar.f92997d;
                do {
                    i10 = atomicInteger.get();
                    i11 = scVar.f92994a;
                    if (i10 == i11) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i10, Math.min(scVar.f92996c + i10, i11)));
            }
            this.f92933b.f93041c.execute(new jc(this, e4Var));
        }
    }

    @Override // xr.m1, xr.we
    public void messagesAvailable(ve veVar) throws IOException {
        ic icVar = this.f92933b.f93053o;
        mh.p1.checkState(icVar.f92645f != null, "Headers should be received prior to messages.");
        if (icVar.f92645f == this.f92932a) {
            this.f92933b.f93041c.execute(new oc(this, veVar));
            return;
        }
        Logger logger = c5.f92306a;
        while (true) {
            InputStream next = veVar.next();
            if (next == null) {
                return;
            } else {
                c5.closeQuietly(next);
            }
        }
    }

    @Override // xr.m1, xr.we
    public void onReady() {
        tc tcVar = this.f92933b;
        if (tcVar.isReady()) {
            tcVar.f93041c.execute(new pc(this));
        }
    }
}
