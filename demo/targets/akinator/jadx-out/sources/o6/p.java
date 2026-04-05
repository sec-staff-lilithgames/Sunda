package o6;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import o6.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p implements u6.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f77951l = n6.c0.tagWithPrefix("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f77953b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.a f77954c;

    /* renamed from: d, reason: collision with root package name */
    public final x6.b f77955d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f77956e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f77958g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f77957f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f77960i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f77961j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f77952a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f77962k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f77959h = new HashMap();

    public p(Context context, androidx.work.a aVar, x6.b bVar, WorkDatabase workDatabase) {
        this.f77953b = context;
        this.f77954c = aVar;
        this.f77955d = bVar;
        this.f77956e = workDatabase;
    }

    public static boolean c(String str, h1 h1Var, int i10) {
        String str2 = f77951l;
        if (h1Var == null) {
            n6.c0.get().debug(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        h1Var.interrupt(i10);
        n6.c0.get().debug(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final h1 a(String str) {
        h1 h1Var = (h1) this.f77957f.remove(str);
        boolean z10 = h1Var != null;
        if (!z10) {
            h1Var = (h1) this.f77958g.remove(str);
        }
        this.f77959h.remove(str);
        if (z10) {
            synchronized (this.f77962k) {
                try {
                    if (this.f77957f.isEmpty()) {
                        try {
                            this.f77953b.startService(u6.d.createStopForegroundIntent(this.f77953b));
                        } catch (Throwable th2) {
                            n6.c0.get().error(f77951l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f77952a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f77952a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return h1Var;
    }

    public void addExecutionListener(e eVar) {
        synchronized (this.f77962k) {
            this.f77961j.add(eVar);
        }
    }

    public final h1 b(String str) {
        h1 h1Var = (h1) this.f77957f.get(str);
        return h1Var == null ? (h1) this.f77958g.get(str) : h1Var;
    }

    public v6.b0 getRunningWorkSpec(String str) {
        synchronized (this.f77962k) {
            try {
                h1 h1VarB = b(str);
                if (h1VarB == null) {
                    return null;
                }
                return h1VarB.getWorkSpec();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hasWork() {
        boolean z10;
        synchronized (this.f77962k) {
            try {
                z10 = (this.f77958g.isEmpty() && this.f77957f.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z10;
    }

    public boolean isCancelled(String str) {
        boolean zContains;
        synchronized (this.f77962k) {
            zContains = this.f77960i.contains(str);
        }
        return zContains;
    }

    public boolean isEnqueued(String str) {
        boolean z10;
        synchronized (this.f77962k) {
            z10 = b(str) != null;
        }
        return z10;
    }

    public void removeExecutionListener(e eVar) {
        synchronized (this.f77962k) {
            this.f77961j.remove(eVar);
        }
    }

    @Override // u6.a
    public void startForeground(String str, n6.o oVar) {
        synchronized (this.f77962k) {
            try {
                n6.c0.get().info(f77951l, "Moving WorkSpec (" + str + ") to the foreground");
                h1 h1Var = (h1) this.f77958g.remove(str);
                if (h1Var != null) {
                    if (this.f77952a == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = w6.c0.newWakeLock(this.f77953b, "ProcessorForegroundLck");
                        this.f77952a = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.f77957f.put(str, h1Var);
                    m3.a.startForegroundService(this.f77953b, u6.d.createStartForegroundIntent(this.f77953b, h1Var.getWorkGenerationalId(), oVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean startWork(u uVar) {
        return startWork(uVar, null);
    }

    public boolean stopAndCancelWork(String str, int i10) {
        h1 h1VarA;
        synchronized (this.f77962k) {
            n6.c0.get().debug(f77951l, "Processor cancelling " + str);
            this.f77960i.add(str);
            h1VarA = a(str);
        }
        return c(str, h1VarA, i10);
    }

    public boolean stopForegroundWork(u uVar, int i10) {
        h1 h1VarA;
        String workSpecId = uVar.getId().getWorkSpecId();
        synchronized (this.f77962k) {
            h1VarA = a(workSpecId);
        }
        return c(workSpecId, h1VarA, i10);
    }

    public boolean stopWork(u uVar, int i10) {
        String workSpecId = uVar.getId().getWorkSpecId();
        synchronized (this.f77962k) {
            try {
                if (this.f77957f.get(workSpecId) == null) {
                    Set set = (Set) this.f77959h.get(workSpecId);
                    if (set != null && set.contains(uVar)) {
                        return c(workSpecId, a(workSpecId), i10);
                    }
                    return false;
                }
                n6.c0.get().debug(f77951l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } finally {
            }
        }
    }

    public boolean startWork(u uVar, WorkerParameters.a aVar) {
        Throwable th2;
        v6.s id2 = uVar.getId();
        String workSpecId = id2.getWorkSpecId();
        ArrayList arrayList = new ArrayList();
        v6.b0 b0Var = (v6.b0) this.f77956e.runInTransaction(new ci.f(this, 1, arrayList, workSpecId));
        if (b0Var == null) {
            n6.c0.get().warning(f77951l, "Didn't find WorkSpec for id " + id2);
            this.f77955d.getMainThreadExecutor().execute(new im.k(28, this, id2));
            return false;
        }
        synchronized (this.f77962k) {
            try {
                try {
                    try {
                        if (isEnqueued(workSpecId)) {
                            Set set = (Set) this.f77959h.get(workSpecId);
                            if (((u) set.iterator().next()).getId().getGeneration() == id2.getGeneration()) {
                                set.add(uVar);
                                n6.c0.get().debug(f77951l, "Work " + id2 + " is already enqueued for processing");
                            } else {
                                this.f77955d.getMainThreadExecutor().execute(new im.k(28, this, id2));
                            }
                            return false;
                        }
                        if (b0Var.getGeneration() != id2.getGeneration()) {
                            this.f77955d.getMainThreadExecutor().execute(new im.k(28, this, id2));
                            return false;
                        }
                        h1 h1VarBuild = new h1.a(this.f77953b, this.f77954c, this.f77955d, this, this.f77956e, b0Var, arrayList).withRuntimeExtras(aVar).build();
                        sh.n1 n1VarLaunch = h1VarBuild.launch();
                        n1VarLaunch.addListener(new io.bidmachine.media3.exoplayer.b1(this, 10, n1VarLaunch, h1VarBuild), this.f77955d.getMainThreadExecutor());
                        this.f77958g.put(workSpecId, h1VarBuild);
                        HashSet hashSet = new HashSet();
                        hashSet.add(uVar);
                        this.f77959h.put(workSpecId, hashSet);
                        n6.c0.get().debug(f77951l, getClass().getSimpleName() + ": processing " + id2);
                        return true;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }
}
