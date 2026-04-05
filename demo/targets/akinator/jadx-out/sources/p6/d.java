package p6;

import android.content.Context;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import n6.c0;
import n6.f;
import n6.r0;
import n6.x0;
import o6.p;
import o6.r;
import o6.t0;
import o6.u;
import o6.w;
import r6.c;
import r6.j;
import r6.l;
import r6.o;
import t6.m;
import v6.b0;
import v6.n0;
import v6.s;
import w6.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d implements r, j, o6.e {

    /* renamed from: q, reason: collision with root package name */
    public static final String f80695q = c0.tagWithPrefix("GreedyScheduler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f80696b;

    /* renamed from: e, reason: collision with root package name */
    public b f80698e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f80699f;

    /* renamed from: i, reason: collision with root package name */
    public final p f80702i;

    /* renamed from: j, reason: collision with root package name */
    public final t0 f80703j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.work.a f80704k;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f80706m;

    /* renamed from: n, reason: collision with root package name */
    public final l f80707n;

    /* renamed from: o, reason: collision with root package name */
    public final x6.b f80708o;

    /* renamed from: p, reason: collision with root package name */
    public final e f80709p;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f80697c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Object f80700g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final w f80701h = w.create();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f80705l = new HashMap();

    public d(Context context, androidx.work.a aVar, m mVar, p pVar, t0 t0Var, x6.b bVar) {
        this.f80696b = context;
        r0 runnableScheduler = aVar.getRunnableScheduler();
        this.f80698e = new b(this, runnableScheduler, aVar.getClock());
        this.f80709p = new e(runnableScheduler, t0Var);
        this.f80708o = bVar;
        this.f80707n = new l(mVar);
        this.f80704k = aVar;
        this.f80702i = pVar;
        this.f80703j = t0Var;
    }

    @Override // o6.r
    public void cancel(String str) {
        if (this.f80706m == null) {
            this.f80706m = Boolean.valueOf(v.isDefaultProcess(this.f80696b, this.f80704k));
        }
        boolean zBooleanValue = this.f80706m.booleanValue();
        String str2 = f80695q;
        if (!zBooleanValue) {
            c0.get().info(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f80699f) {
            this.f80702i.addExecutionListener(this);
            this.f80699f = true;
        }
        c0.get().debug(str2, "Cancelling work ID " + str);
        b bVar = this.f80698e;
        if (bVar != null) {
            bVar.unschedule(str);
        }
        for (u uVar : this.f80701h.remove(str)) {
            this.f80709p.cancel(uVar);
            this.f80703j.stopWork(uVar);
        }
    }

    @Override // o6.r
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // r6.j
    public void onConstraintsStateChanged(b0 b0Var, r6.c cVar) {
        s sVarGenerationalId = n0.generationalId(b0Var);
        boolean z10 = cVar instanceof r6.b;
        t0 t0Var = this.f80703j;
        e eVar = this.f80709p;
        String str = f80695q;
        w wVar = this.f80701h;
        if (z10) {
            if (wVar.contains(sVarGenerationalId)) {
                return;
            }
            c0.get().debug(str, "Constraints met: Scheduling work ID " + sVarGenerationalId);
            u uVar = wVar.tokenFor(sVarGenerationalId);
            eVar.track(uVar);
            t0Var.startWork(uVar);
            return;
        }
        c0.get().debug(str, "Constraints not met: Cancelling work ID " + sVarGenerationalId);
        u uVarRemove = wVar.remove(sVarGenerationalId);
        if (uVarRemove != null) {
            eVar.cancel(uVarRemove);
            t0Var.stopWorkWithReason(uVarRemove, ((c.a) cVar).getReason());
        }
    }

    @Override // o6.e
    public void onExecuted(s sVar, boolean z10) {
        Job job;
        u uVarRemove = this.f80701h.remove(sVar);
        if (uVarRemove != null) {
            this.f80709p.cancel(uVarRemove);
        }
        synchronized (this.f80700g) {
            job = (Job) this.f80697c.remove(sVar);
        }
        if (job != null) {
            c0.get().debug(f80695q, "Stopping tracking for " + sVar);
            job.cancel((CancellationException) null);
        }
        if (z10) {
            return;
        }
        synchronized (this.f80700g) {
            this.f80705l.remove(sVar);
        }
    }

    @Override // o6.r
    public void schedule(b0... b0VarArr) {
        long jMax;
        if (this.f80706m == null) {
            this.f80706m = Boolean.valueOf(v.isDefaultProcess(this.f80696b, this.f80704k));
        }
        if (!this.f80706m.booleanValue()) {
            c0.get().info(f80695q, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f80699f) {
            this.f80702i.addExecutionListener(this);
            this.f80699f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (b0 b0Var : b0VarArr) {
            if (!this.f80701h.contains(n0.generationalId(b0Var))) {
                synchronized (this.f80700g) {
                    try {
                        s sVarGenerationalId = n0.generationalId(b0Var);
                        c cVar = (c) this.f80705l.get(sVarGenerationalId);
                        if (cVar == null) {
                            cVar = new c(b0Var.f89063k, this.f80704k.getClock().currentTimeMillis());
                            this.f80705l.put(sVarGenerationalId, cVar);
                        }
                        jMax = (Math.max((b0Var.f89063k - cVar.f80693a) - 5, 0) * CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) + cVar.f80694b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(b0Var.calculateNextRunTime(), jMax);
                long jCurrentTimeMillis = this.f80704k.getClock().currentTimeMillis();
                if (b0Var.f89054b == x0.f75806b) {
                    if (jCurrentTimeMillis < jMax2) {
                        b bVar = this.f80698e;
                        if (bVar != null) {
                            bVar.schedule(b0Var, jMax2);
                        }
                    } else if (b0Var.hasConstraints()) {
                        f fVar = b0Var.f89062j;
                        if (fVar.requiresDeviceIdle()) {
                            c0.get().debug(f80695q, "Ignoring " + b0Var + ". Requires device idle.");
                        } else if (fVar.hasContentUriTriggers()) {
                            c0.get().debug(f80695q, "Ignoring " + b0Var + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(b0Var);
                            hashSet2.add(b0Var.f89053a);
                        }
                    } else if (!this.f80701h.contains(n0.generationalId(b0Var))) {
                        c0.get().debug(f80695q, "Starting work for " + b0Var.f89053a);
                        u uVar = this.f80701h.tokenFor(b0Var);
                        this.f80709p.track(uVar);
                        this.f80703j.startWork(uVar);
                    }
                }
            }
        }
        synchronized (this.f80700g) {
            try {
                if (!hashSet.isEmpty()) {
                    c0.get().debug(f80695q, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        b0 b0Var2 = (b0) it.next();
                        s sVarGenerationalId2 = n0.generationalId(b0Var2);
                        if (!this.f80697c.containsKey(sVarGenerationalId2)) {
                            this.f80697c.put(sVarGenerationalId2, o.listen(this.f80707n, b0Var2, this.f80708o.getTaskCoroutineDispatcher(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void setDelayedWorkTracker(b bVar) {
        this.f80698e = bVar;
    }
}
