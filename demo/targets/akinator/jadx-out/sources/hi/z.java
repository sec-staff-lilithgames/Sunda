package hi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.lh;
import java.lang.Thread;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58913a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f58914b;

    /* renamed from: e, reason: collision with root package name */
    public a0 f58917e;

    /* renamed from: f, reason: collision with root package name */
    public a0 f58918f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f58919g;

    /* renamed from: h, reason: collision with root package name */
    public u f58920h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f58921i;

    /* renamed from: j, reason: collision with root package name */
    public final ni.d f58922j;

    /* renamed from: k, reason: collision with root package name */
    public final gi.b f58923k;

    /* renamed from: l, reason: collision with root package name */
    public final fi.a f58924l;

    /* renamed from: m, reason: collision with root package name */
    public final m f58925m;

    /* renamed from: n, reason: collision with root package name */
    public final ei.a f58926n;

    /* renamed from: o, reason: collision with root package name */
    public final ei.i f58927o;

    /* renamed from: p, reason: collision with root package name */
    public final ii.g f58928p;

    /* renamed from: d, reason: collision with root package name */
    public final long f58916d = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    public final r0 f58915c = new r0();

    public z(com.google.firebase.g gVar, n0 n0Var, ei.a aVar, g0 g0Var, gi.b bVar, fi.a aVar2, ni.d dVar, m mVar, ei.i iVar, ii.g gVar2) {
        this.f58914b = g0Var;
        this.f58913a = gVar.getApplicationContext();
        this.f58921i = n0Var;
        this.f58926n = aVar;
        this.f58923k = bVar;
        this.f58924l = aVar2;
        this.f58922j = dVar;
        this.f58925m = mVar;
        this.f58927o = iVar;
        this.f58928p = gVar2;
    }

    public static String getVersion() {
        return "20.0.3";
    }

    public final void a(pi.j jVar) {
        ii.g.checkBackgroundThread();
        ii.g.checkBackgroundThread();
        this.f58917e.create();
        ei.f.getLogger().v("Initialization marker file was created.");
        try {
            try {
                this.f58923k.registerBreadcrumbHandler(new w(this));
                this.f58920h.i();
                pi.g gVar = (pi.g) jVar;
                if (!gVar.getSettingsSync().f81382b.f81387a) {
                    ei.f.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f58920h.e(gVar)) {
                    ei.f.getLogger().w("Previous sessions could not be finalized.");
                }
                this.f58920h.k(gVar.getSettingsAsync());
                c();
            } catch (Exception e10) {
                ei.f.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(pi.j jVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f58928p.f59614a.getExecutor().submit(new v(this, jVar, 1));
        ei.f.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            ei.f.getLogger().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            ei.f.getLogger().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            ei.f.getLogger().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        ii.g.checkBackgroundThread();
        try {
            if (this.f58917e.remove()) {
                return;
            }
            ei.f.getLogger().w("Initialization marker file was not properly removed.");
        } catch (Exception e10) {
            ei.f.getLogger().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    public Task<Boolean> checkForUnsentReports() {
        u uVar = this.f58920h;
        if (uVar.f58899s.compareAndSet(false, true)) {
            return uVar.f58896p.getTask();
        }
        ei.f.getLogger().w("checkForUnsentReports should only be called once per execution.");
        return Tasks.forResult(Boolean.FALSE);
    }

    public Task<Void> deleteUnsentReports() {
        u uVar = this.f58920h;
        uVar.f58897q.trySetResult(Boolean.FALSE);
        return uVar.f58898r.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f58919g;
    }

    public Task<Void> doBackgroundInitializationAsync(pi.j jVar) {
        return this.f58928p.f59614a.submit(new v(this, jVar, 0));
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f58914b.isAutomaticDataCollectionEnabled();
    }

    public void log(String str) {
        this.f58928p.f59614a.submit(new x(this, System.currentTimeMillis() - this.f58916d, str, 1));
    }

    public void logException(Throwable th2, Map<String, String> map) {
        this.f58928p.f59614a.submit(new lh(this, 24, th2, map));
    }

    public void logFatalException(Throwable th2) {
        ei.f logger = ei.f.getLogger();
        StringBuilder sb2 = new StringBuilder("Recorded on-demand fatal events: ");
        r0 r0Var = this.f58915c;
        sb2.append(r0Var.getRecordedOnDemandExceptions());
        logger.d(sb2.toString());
        ei.f.getLogger().d("Dropped on-demand fatal events: " + r0Var.getDroppedOnDemandExceptions());
        this.f58928p.f59614a.submit(new gm.c(10, this, th2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18, types: [com.vungle.ads.internal.session.a, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r4v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.concurrent.TimeUnit] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public boolean onPreExecute(a aVar, pi.j jVar) {
        boolean aVar2;
        ji.u uVar;
        ji.h hVar;
        qi.a aVar3;
        ii.g gVar = this.f58928p;
        ni.d dVar = this.f58922j;
        Context context = this.f58913a;
        boolean booleanResourceValue = j.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true);
        String str = aVar.f58780b;
        if (!booleanResourceValue) {
            ei.f.getLogger().v("Configured not to require a build ID.");
        } else if (TextUtils.isEmpty(str)) {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String sessionId = new h().getSessionId();
        try {
            this.f58918f = new a0("crash_marker", dVar);
            this.f58917e = new a0("initialization_marker", dVar);
            uVar = new ji.u(sessionId, dVar, gVar);
            hVar = new ji.h(dVar);
            aVar3 = new qi.a(1024, new qi.c(10));
            this.f58927o.setupListener(uVar);
            aVar2 = 0;
        } catch (Exception e10) {
            e = e10;
            aVar2 = 0;
        }
        try {
            try {
                try {
                    this.f58920h = new u(this.f58913a, this.f58921i, this.f58914b, this.f58922j, this.f58918f, aVar, uVar, hVar, s0.create(this.f58913a, this.f58921i, this.f58922j, aVar, hVar, uVar, aVar3, jVar, this.f58915c, this.f58925m, this.f58928p), this.f58926n, this.f58924l, this.f58925m, this.f58928p);
                    boolean zIsPresent = this.f58917e.isPresent();
                    ExecutorService executor = gVar.f59614a.getExecutor();
                    aVar2 = new com.vungle.ads.internal.session.a(this, 1);
                    Future futureSubmit = executor.submit((Callable) aVar2);
                    try {
                        aVar2 = TimeUnit.SECONDS;
                        this.f58919g = Boolean.TRUE.equals((Boolean) futureSubmit.get(3L, aVar2));
                        aVar2 = 0;
                    } catch (Exception unused) {
                        aVar2 = 0;
                        this.f58919g = false;
                    }
                    u uVar2 = this.f58920h;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    uVar2.f58895o = jVar;
                    uVar2.f58885e.f59614a.submit(new gm.c(9, uVar2, sessionId));
                    e0 e0Var = new e0(new n(uVar2), jVar, defaultUncaughtExceptionHandler, uVar2.f58890j);
                    uVar2.f58894n = e0Var;
                    Thread.setDefaultUncaughtExceptionHandler(e0Var);
                    if (!zIsPresent || !j.canTryConnection(context)) {
                        ei.f.getLogger().d("Successfully configured exception handler.");
                        return true;
                    }
                    ei.f.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    b(jVar);
                    return aVar2;
                } catch (Exception e11) {
                    e = e11;
                    aVar2 = 0;
                    ei.f.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
                    this.f58920h = null;
                    return aVar2;
                }
            } catch (Exception e12) {
                e = e12;
                aVar2 = 0;
            }
        } catch (Exception e13) {
            e = e13;
            ei.f.getLogger().e("Crashlytics was not started due to an exception during initialization", e);
            this.f58920h = null;
            return aVar2;
        }
    }

    public Task<Void> sendUnsentReports() {
        u uVar = this.f58920h;
        uVar.f58897q.trySetResult(Boolean.TRUE);
        return uVar.f58898r.getTask();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f58914b.setCrashlyticsDataCollectionEnabled(bool);
    }

    public void setCustomKey(String str, String str2) {
        this.f58928p.f59614a.submit(new y(this, str, str2, 0));
    }

    public void setCustomKeys(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        this.f58928p.f59614a.submit(new gm.c(12, this, map));
    }

    public void setInternalKey(String str, String str2) {
        this.f58928p.f59614a.submit(new y(this, str, str2, 1));
    }

    public void setUserId(String str) {
        this.f58928p.f59614a.submit(new gm.c(11, this, str));
    }
}
