package o6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import n6.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y0 extends n6.y0 {

    /* renamed from: m, reason: collision with root package name */
    public static final String f77983m = n6.c0.tagWithPrefix("WorkManagerImpl");

    /* renamed from: n, reason: collision with root package name */
    public static y0 f77984n = null;

    /* renamed from: o, reason: collision with root package name */
    public static y0 f77985o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f77986p = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Context f77987b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.a f77988c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f77989d;

    /* renamed from: e, reason: collision with root package name */
    public final x6.b f77990e;

    /* renamed from: f, reason: collision with root package name */
    public final List f77991f;

    /* renamed from: g, reason: collision with root package name */
    public final p f77992g;

    /* renamed from: h, reason: collision with root package name */
    public final w6.u f77993h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77994i = false;

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f77995j;

    /* renamed from: k, reason: collision with root package name */
    public final t6.m f77996k;

    /* renamed from: l, reason: collision with root package name */
    public final CoroutineScope f77997l;

    public y0(Context context, androidx.work.a aVar, x6.b bVar, WorkDatabase workDatabase, List<r> list, p pVar, t6.m mVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        n6.c0.setLogger(new c0.a(aVar.getMinimumLoggingLevel()));
        this.f77987b = applicationContext;
        this.f77990e = bVar;
        this.f77989d = workDatabase;
        this.f77992g = pVar;
        this.f77996k = mVar;
        this.f77988c = aVar;
        this.f77991f = list;
        CoroutineScope coroutineScopeCreateWorkManagerScope = androidx.work.impl.a.createWorkManagerScope(bVar);
        this.f77997l = coroutineScopeCreateWorkManagerScope;
        this.f77993h = new w6.u(workDatabase);
        t.registerRescheduling(list, pVar, bVar.getSerialTaskExecutor(), workDatabase, aVar);
        bVar.executeOnTaskThread(new ForceStopRunnable(applicationContext, this));
        c0.maybeLaunchUnfinishedWorkListener(coroutineScopeCreateWorkManagerScope, applicationContext, aVar, workDatabase);
    }

    @Deprecated
    public static y0 getInstance() {
        synchronized (f77986p) {
            try {
                y0 y0Var = f77984n;
                if (y0Var != null) {
                    return y0Var;
                }
                return f77985o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void initialize(Context context, androidx.work.a aVar) {
        synchronized (f77986p) {
            try {
                y0 y0Var = f77984n;
                if (y0Var != null && f77985o != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (y0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f77985o == null) {
                        f77985o = androidx.work.impl.a.createWorkManager(applicationContext, aVar);
                    }
                    f77984n = f77985o;
                }
            } finally {
            }
        }
    }

    public static boolean isInitialized() {
        return getInstance() != null;
    }

    public static void setDelegate(y0 y0Var) {
        synchronized (f77986p) {
            f77984n = y0Var;
        }
    }

    @Override // n6.y0
    public n6.v0 beginUniqueWork(String str, n6.n nVar, List<n6.f0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new d0(this, str, nVar, list);
    }

    @Override // n6.y0
    public n6.v0 beginWith(List<n6.f0> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new d0(this, list);
    }

    @Override // n6.y0
    public n6.j0 cancelAllWork() {
        return w6.d.forAll(this);
    }

    @Override // n6.y0
    public n6.j0 cancelAllWorkByTag(String str) {
        return w6.d.forTag(str, this);
    }

    @Override // n6.y0
    public n6.j0 cancelUniqueWork(String str) {
        return w6.d.forName(str, this);
    }

    @Override // n6.y0
    public n6.j0 cancelWorkById(UUID uuid) {
        return w6.d.forId(uuid, this);
    }

    public void closeDatabase() {
        androidx.work.impl.a.close(this);
    }

    @Override // n6.y0
    public PendingIntent createCancelPendingIntent(UUID uuid) {
        String string = uuid.toString();
        Context context = this.f77987b;
        return PendingIntent.getService(context, 0, u6.d.createCancelWorkIntent(context, string), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public d0 createWorkContinuationForUniquePeriodicWork(String str, n6.m mVar, n6.p0 p0Var) {
        return new d0(this, str, mVar == n6.m.f75761b ? n6.n.f75768c : n6.n.f75767b, Collections.singletonList(p0Var));
    }

    @Override // n6.y0
    public n6.j0 enqueue(List<? extends n6.b1> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new d0(this, list).enqueue();
    }

    @Override // n6.y0
    public n6.j0 enqueueUniquePeriodicWork(String str, n6.m mVar, n6.p0 p0Var) {
        return mVar == n6.m.f75762c ? e1.enqueueUniquelyNamedPeriodic(this, str, p0Var) : createWorkContinuationForUniquePeriodicWork(str, mVar, p0Var).enqueue();
    }

    @Override // n6.y0
    public n6.j0 enqueueUniqueWork(String str, n6.n nVar, List<n6.f0> list) {
        return new d0(this, str, nVar, list).enqueue();
    }

    public Context getApplicationContext() {
        return this.f77987b;
    }

    @Override // n6.y0
    public androidx.work.a getConfiguration() {
        return this.f77988c;
    }

    @Override // n6.y0
    public sh.n1 getLastCancelAllTimeMillis() {
        x6.a serialTaskExecutor = this.f77990e.getSerialTaskExecutor();
        w6.u uVar = this.f77993h;
        Objects.requireNonNull(uVar);
        return n6.w.executeAsync(serialTaskExecutor, "getLastCancelAllTimeMillis", new v0(uVar, 0));
    }

    @Override // n6.y0
    public androidx.lifecycle.l1 getLastCancelAllTimeMillisLiveData() {
        return this.f77993h.getLastCancelAllTimeMillisLiveData();
    }

    public w6.u getPreferenceUtils() {
        return this.f77993h;
    }

    public p getProcessor() {
        return this.f77992g;
    }

    public z6.a getRemoteWorkManager() {
        synchronized (f77986p) {
            try {
                try {
                } catch (Throwable th2) {
                    n6.c0.get().debug(f77983m, "Unable to initialize multi-process support", th2);
                }
                if (Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, y0.class).newInstance(this.f77987b, this) != null) {
                    throw new ClassCastException();
                }
                if (!TextUtils.isEmpty(this.f77988c.getDefaultProcessName())) {
                    throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return null;
    }

    public List<r> getSchedulers() {
        return this.f77991f;
    }

    public t6.m getTrackers() {
        return this.f77996k;
    }

    public WorkDatabase getWorkDatabase() {
        return this.f77989d;
    }

    @Override // n6.y0
    public sh.n1 getWorkInfoById(UUID uuid) {
        return w6.a0.forUUID(this.f77989d, this.f77990e, uuid);
    }

    @Override // n6.y0
    public Flow<n6.w0> getWorkInfoByIdFlow(UUID uuid) {
        return v6.d0.getWorkStatusPojoFlowDataForIds(getWorkDatabase().workSpecDao(), uuid);
    }

    @Override // n6.y0
    public androidx.lifecycle.l1 getWorkInfoByIdLiveData(UUID uuid) {
        return w6.m.dedupedMappedLiveDataFor(this.f77989d.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(uuid.toString())), new x0(), this.f77990e);
    }

    @Override // n6.y0
    public sh.n1 getWorkInfos(n6.a1 a1Var) {
        return w6.a0.forWorkQuerySpec(this.f77989d, this.f77990e, a1Var);
    }

    @Override // n6.y0
    public sh.n1 getWorkInfosByTag(String str) {
        return w6.a0.forTag(this.f77989d, this.f77990e, str);
    }

    @Override // n6.y0
    public Flow<List<n6.w0>> getWorkInfosByTagFlow(String str) {
        return v6.d0.getWorkStatusPojoFlowForTag(this.f77989d.workSpecDao(), this.f77990e.getTaskCoroutineDispatcher(), str);
    }

    @Override // n6.y0
    public androidx.lifecycle.l1 getWorkInfosByTagLiveData(String str) {
        return w6.m.dedupedMappedLiveDataFor(this.f77989d.workSpecDao().getWorkStatusPojoLiveDataForTag(str), v6.b0.B, this.f77990e);
    }

    @Override // n6.y0
    public Flow<List<n6.w0>> getWorkInfosFlow(n6.a1 a1Var) {
        return v6.j.getWorkInfoPojosFlow(this.f77989d.rawWorkInfoDao(), this.f77990e.getTaskCoroutineDispatcher(), w6.x.toRawQuery(a1Var));
    }

    @Override // n6.y0
    public sh.n1 getWorkInfosForUniqueWork(String str) {
        return w6.a0.forUniqueWork(this.f77989d, this.f77990e, str);
    }

    @Override // n6.y0
    public Flow<List<n6.w0>> getWorkInfosForUniqueWorkFlow(String str) {
        return v6.d0.getWorkStatusPojoFlowForName(this.f77989d.workSpecDao(), this.f77990e.getTaskCoroutineDispatcher(), str);
    }

    @Override // n6.y0
    public androidx.lifecycle.l1 getWorkInfosForUniqueWorkLiveData(String str) {
        return w6.m.dedupedMappedLiveDataFor(this.f77989d.workSpecDao().getWorkStatusPojoLiveDataForName(str), v6.b0.B, this.f77990e);
    }

    @Override // n6.y0
    public androidx.lifecycle.l1 getWorkInfosLiveData(n6.a1 a1Var) {
        return w6.m.dedupedMappedLiveDataFor(this.f77989d.rawWorkInfoDao().getWorkInfoPojosLiveData(w6.x.toRawQuery(a1Var)), v6.b0.B, this.f77990e);
    }

    public x6.b getWorkTaskExecutor() {
        return this.f77990e;
    }

    public void onForceStopRunnableCompleted() {
        synchronized (f77986p) {
            try {
                this.f77994i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f77995j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f77995j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n6.y0
    public n6.j0 pruneWork() {
        return w6.w.pruneWork(this.f77989d, this.f77988c, this.f77990e);
    }

    public void rescheduleEligibleWork() {
        n6.u0.traced(getConfiguration().getTracer(), "ReschedulingWork", new w0(this, 0));
    }

    public void setReschedulePendingResult(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f77986p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.f77995j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.f77995j = pendingResult;
                if (this.f77994i) {
                    pendingResult.finish();
                    this.f77995j = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void stopForegroundWork(v6.s sVar, int i10) {
        this.f77990e.executeOnTaskThread(new w6.b0(this.f77992g, new u(sVar), true, i10));
    }

    @Override // n6.y0
    public sh.n1 updateWork(n6.b1 b1Var) {
        return e1.updateWorkImpl(this, b1Var);
    }

    public static y0 getInstance(Context context) {
        y0 y0Var;
        synchronized (f77986p) {
            try {
                y0Var = getInstance();
                if (y0Var == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }
}
