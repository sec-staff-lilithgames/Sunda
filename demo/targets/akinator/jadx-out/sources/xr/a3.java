package xr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a3 implements h9 {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f92232c;

    /* renamed from: d, reason: collision with root package name */
    public final wr.u6 f92233d;

    /* renamed from: e, reason: collision with root package name */
    public v2 f92234e;

    /* renamed from: f, reason: collision with root package name */
    public w2 f92235f;

    /* renamed from: g, reason: collision with root package name */
    public x2 f92236g;

    /* renamed from: h, reason: collision with root package name */
    public g9 f92237h;

    /* renamed from: j, reason: collision with root package name */
    public wr.m6 f92239j;

    /* renamed from: k, reason: collision with root package name */
    public b3.f f92240k;

    /* renamed from: l, reason: collision with root package name */
    public long f92241l;

    /* renamed from: a, reason: collision with root package name */
    public final wr.n2 f92230a = wr.n2.allocate((Class<?>) a3.class, (String) null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f92231b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Collection f92238i = new LinkedHashSet();

    public a3(Executor executor, wr.u6 u6Var) {
        this.f92232c = executor;
        this.f92233d = u6Var;
    }

    public final z2 a(va vaVar, wr.u[] uVarArr) {
        int size;
        z2 z2Var = new z2(this, vaVar, uVarArr);
        this.f92238i.add(z2Var);
        synchronized (this.f92231b) {
            size = this.f92238i.size();
        }
        if (size == 1) {
            this.f92233d.executeLater(this.f92234e);
        }
        for (wr.u uVar : uVarArr) {
            uVar.createPendingStream();
        }
        return z2Var;
    }

    public final void b(b3.f fVar) {
        x2 x2Var;
        synchronized (this.f92231b) {
            this.f92240k = fVar;
            this.f92241l++;
            if (fVar != null && hasPendingStreams()) {
                ArrayList arrayList = new ArrayList(this.f92238i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z2 z2Var = (z2) it.next();
                    wr.c3 c3VarPickSubchannel = fVar.pickSubchannel(z2Var.f93287j);
                    wr.i callOptions = z2Var.f93287j.getCallOptions();
                    o1 o1VarA = c5.a(c3VarPickSubchannel, callOptions.isWaitForReady());
                    if (o1VarA != null) {
                        Executor executor = this.f92232c;
                        if (callOptions.getExecutor() != null) {
                            executor = callOptions.getExecutor();
                        }
                        va vaVar = z2Var.f93287j;
                        wr.u0 u0Var = z2Var.f93288k;
                        wr.u0 u0VarAttach = u0Var.attach();
                        try {
                            k1 k1VarNewStream = o1VarA.newStream(vaVar.getMethodDescriptor(), vaVar.getHeaders(), vaVar.getCallOptions(), z2Var.f93289l);
                            u0Var.detach(u0VarAttach);
                            k3 k3VarD = z2Var.d(k1VarNewStream);
                            if (k3VarD != null) {
                                executor.execute(k3VarD);
                            }
                            arrayList2.add(z2Var);
                        } catch (Throwable th2) {
                            u0Var.detach(u0VarAttach);
                            throw th2;
                        }
                    }
                }
                synchronized (this.f92231b) {
                    try {
                        if (hasPendingStreams()) {
                            this.f92238i.removeAll(arrayList2);
                            if (this.f92238i.isEmpty()) {
                                this.f92238i = new LinkedHashSet();
                            }
                            if (!hasPendingStreams()) {
                                this.f92233d.executeLater(this.f92235f);
                                if (this.f92239j != null && (x2Var = this.f92236g) != null) {
                                    this.f92233d.executeLater(x2Var);
                                    this.f92236g = null;
                                }
                            }
                            this.f92233d.drain();
                        }
                    } finally {
                    }
                }
            }
        }
    }

    @Override // xr.h9, xr.o1, wr.m2, wr.v2
    public wr.n2 getLogId() {
        return this.f92230a;
    }

    @Override // xr.h9, xr.o1, wr.m2
    public sh.n1 getStats() {
        sh.a2 a2VarCreate = sh.a2.create();
        a2VarCreate.set(null);
        return a2VarCreate;
    }

    public final boolean hasPendingStreams() {
        boolean z10;
        synchronized (this.f92231b) {
            z10 = !this.f92238i.isEmpty();
        }
        return z10;
    }

    @Override // xr.h9, xr.o1
    public final k1 newStream(wr.k4 k4Var, wr.e4 e4Var, wr.i iVar, wr.u[] uVarArr) {
        k1 g4Var;
        try {
            va vaVar = new va(k4Var, e4Var, iVar);
            b3.f fVar = null;
            long j10 = -1;
            while (true) {
                synchronized (this.f92231b) {
                    if (this.f92239j == null) {
                        b3.f fVar2 = this.f92240k;
                        if (fVar2 != null) {
                            if (fVar != null && j10 == this.f92241l) {
                                g4Var = a(vaVar, uVarArr);
                                break;
                            }
                            j10 = this.f92241l;
                            o1 o1VarA = c5.a(fVar2.pickSubchannel(vaVar), iVar.isWaitForReady());
                            if (o1VarA != null) {
                                g4Var = o1VarA.newStream(vaVar.getMethodDescriptor(), vaVar.getHeaders(), vaVar.getCallOptions(), uVarArr);
                                break;
                            }
                            fVar = fVar2;
                        } else {
                            g4Var = a(vaVar, uVarArr);
                            break;
                        }
                    } else {
                        g4Var = new g4(this.f92239j, uVarArr);
                        break;
                    }
                }
            }
            return g4Var;
        } finally {
            this.f92233d.drain();
        }
    }

    @Override // xr.h9, xr.o1
    public final void ping(n1 n1Var, Executor executor) {
        throw new UnsupportedOperationException("This method is not expected to be called");
    }

    @Override // xr.h9
    public final void shutdown(wr.m6 m6Var) {
        x2 x2Var;
        synchronized (this.f92231b) {
            try {
                if (this.f92239j != null) {
                    return;
                }
                this.f92239j = m6Var;
                this.f92233d.executeLater(new y2(this, m6Var));
                if (!hasPendingStreams() && (x2Var = this.f92236g) != null) {
                    this.f92233d.executeLater(x2Var);
                    this.f92236g = null;
                }
                this.f92233d.drain();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.h9
    public final void shutdownNow(wr.m6 m6Var) {
        Collection<z2> collection;
        x2 x2Var;
        shutdown(m6Var);
        synchronized (this.f92231b) {
            try {
                collection = this.f92238i;
                x2Var = this.f92236g;
                this.f92236g = null;
                if (!collection.isEmpty()) {
                    this.f92238i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (x2Var != null) {
            for (z2 z2Var : collection) {
                k3 k3VarD = z2Var.d(new g4(m6Var, l1.f92749c, z2Var.f93289l));
                if (k3VarD != null) {
                    k3VarD.run();
                }
            }
            this.f92233d.execute(x2Var);
        }
    }

    @Override // xr.h9
    public final Runnable start(g9 g9Var) {
        this.f92237h = g9Var;
        this.f92234e = new v2(g9Var);
        this.f92235f = new w2(g9Var);
        this.f92236g = new x2(g9Var);
        return null;
    }
}
