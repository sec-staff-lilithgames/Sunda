package hi;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import ki.h2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: t, reason: collision with root package name */
    public static final k f58879t = new k(1);

    /* renamed from: u, reason: collision with root package name */
    public static final Charset f58880u = Charset.forName(C.UTF8_NAME);

    /* renamed from: a, reason: collision with root package name */
    public final Context f58881a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f58882b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f58883c;

    /* renamed from: d, reason: collision with root package name */
    public final ji.u f58884d;

    /* renamed from: e, reason: collision with root package name */
    public final ii.g f58885e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f58886f;

    /* renamed from: g, reason: collision with root package name */
    public final ni.d f58887g;

    /* renamed from: h, reason: collision with root package name */
    public final a f58888h;

    /* renamed from: i, reason: collision with root package name */
    public final ji.h f58889i;

    /* renamed from: j, reason: collision with root package name */
    public final ei.a f58890j;

    /* renamed from: k, reason: collision with root package name */
    public final fi.a f58891k;

    /* renamed from: l, reason: collision with root package name */
    public final m f58892l;

    /* renamed from: m, reason: collision with root package name */
    public final s0 f58893m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f58894n;

    /* renamed from: o, reason: collision with root package name */
    public pi.j f58895o = null;

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f58896p = new TaskCompletionSource();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f58897q = new TaskCompletionSource();

    /* renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource f58898r = new TaskCompletionSource();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f58899s = new AtomicBoolean(false);

    public u(Context context, n0 n0Var, g0 g0Var, ni.d dVar, a0 a0Var, a aVar, ji.u uVar, ji.h hVar, s0 s0Var, ei.a aVar2, fi.a aVar3, m mVar, ii.g gVar) {
        this.f58881a = context;
        this.f58886f = n0Var;
        this.f58882b = g0Var;
        this.f58887g = dVar;
        this.f58883c = a0Var;
        this.f58888h = aVar;
        this.f58884d = uVar;
        this.f58889i = hVar;
        this.f58890j = aVar2;
        this.f58891k = aVar3;
        this.f58892l = mVar;
        this.f58893m = s0Var;
        this.f58885e = gVar;
    }

    public static Task a(u uVar) throws NumberFormatException, ClassNotFoundException {
        Task taskCall;
        ArrayList arrayList = new ArrayList();
        for (File file : uVar.f58887g.getCommonFiles(f58879t)) {
            try {
                long j10 = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    ei.f.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    ei.f.getLogger().d("Logging app exception event to Firebase Analytics");
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new t(uVar, j10));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                ei.f.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public final void c(String str, Boolean bool) {
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ei.f.getLogger().d("Opening a new session with ID " + str);
        Locale locale = Locale.US;
        String strK = a.b.k("Crashlytics Android SDK/", z.getVersion());
        n0 n0Var = this.f58886f;
        String appIdentifier = n0Var.getAppIdentifier();
        a aVar = this.f58888h;
        h2.a aVarCreate = h2.a.create(appIdentifier, aVar.f58784f, aVar.f58785g, n0Var.getInstallIds().getCrashlyticsInstallId(), e3.g.a(aVar.f58782d != null ? 4 : 1), aVar.f58786h);
        h2.c cVarCreate = h2.c.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, j.isRooted());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        this.f58890j.prepareNativeSession(str, strK, jCurrentTimeMillis, h2.create(aVarCreate, cVarCreate, h2.b.create(j.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), j.calculateTotalRamInBytes(this.f58881a), statFs.getBlockCount() * statFs.getBlockSize(), j.isEmulator(), j.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT)));
        if (bool.booleanValue() && str != null) {
            this.f58884d.setNewSession(str);
        }
        this.f58889i.setCurrentSession(str);
        this.f58892l.setSessionId(str);
        this.f58893m.onBeginSession(str, jCurrentTimeMillis);
    }

    public final void d(long j10) throws IOException {
        try {
            if (this.f58887g.getCommonFile(".ae" + j10).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            ei.f.getLogger().w("Could not create app exception marker file.", e10);
        }
    }

    public final boolean e(pi.j jVar) throws Throwable {
        ii.g.checkBackgroundThread();
        e0 e0Var = this.f58894n;
        if (e0Var != null && e0Var.f58808e.get()) {
            ei.f.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        ei.f.getLogger().v("Finalizing previously open sessions.");
        try {
            b(true, jVar, true);
            ei.f.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e10) {
            ei.f.getLogger().e("Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String f() {
        SortedSet<String> sortedSetListSortedOpenSessionIds = this.f58893m.listSortedOpenSessionIds();
        if (sortedSetListSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return sortedSetListSortedOpenSessionIds.first();
    }

    public final String g() throws IOException {
        InputStream resourceAsStream;
        String versionControlInfo = j.getVersionControlInfo(this.f58881a);
        if (versionControlInfo != null) {
            ei.f.getLogger().d("Read version control info from string resource");
            return Base64.encodeToString(versionControlInfo.getBytes(f58880u), 0);
        }
        ClassLoader classLoader = u.class.getClassLoader();
        if (classLoader == null) {
            ei.f.getLogger().w("Couldn't get Class Loader");
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            ei.f.getLogger().i("No version control information found");
            return null;
        }
        try {
            ei.f.getLogger().d("Read version control info from file");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = resourceAsStream.read(bArr);
                    if (i10 == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String strEncodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return strEncodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final synchronized void h(pi.j jVar, Thread thread, Throwable th2, boolean z10) throws Throwable {
        Throwable th3;
        try {
            try {
                ei.f.getLogger().d("Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName());
                if (!z10) {
                    try {
                        fk.a.notifyCrashOccurred();
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                Task taskSubmitTask = this.f58885e.f59614a.submitTask(new p(this, System.currentTimeMillis(), th2, thread, jVar, z10));
                if (!z10) {
                    try {
                        u0.awaitEvenIfOnMainThread(taskSubmitTask);
                    } catch (TimeoutException unused) {
                        ei.f.getLogger().e("Cannot send reports. Timed out while fetching settings.");
                    } catch (Exception e10) {
                        ei.f.getLogger().e("Error handling uncaught exception", e10);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void i() {
        try {
            String strG = g();
            if (strG != null) {
                j("com.crashlytics.version-control-info", strG);
                ei.f.getLogger().i("Saved version control info");
            }
        } catch (IOException e10) {
            ei.f.getLogger().w("Unable to save version control info", e10);
        }
    }

    public final void j(String str, String str2) {
        try {
            this.f58884d.setInternalKey(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f58881a;
            if (context != null && j.isAppDebuggable(context)) {
                throw e10;
            }
            ei.f.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public final void k(Task task) {
        Task taskRace;
        boolean zHasReportsToSend = this.f58893m.hasReportsToSend();
        TaskCompletionSource taskCompletionSource = this.f58896p;
        if (!zHasReportsToSend) {
            ei.f.getLogger().v("No crash reports are available to be sent.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        ei.f.getLogger().v("Crash reports are available to be sent.");
        g0 g0Var = this.f58882b;
        if (g0Var.isAutomaticDataCollectionEnabled()) {
            ei.f.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskRace = Tasks.forResult(Boolean.TRUE);
        } else {
            ei.f.getLogger().d("Automatic data collection is disabled.");
            ei.f.getLogger().v("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            Task<TContinuationResult> taskOnSuccessTask = g0Var.waitForAutomaticDataCollectionEnabled().onSuccessTask(new q());
            ei.f.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
            taskRace = ii.a.race(taskOnSuccessTask, this.f58897q.getTask());
        }
        taskRace.onSuccessTask(this.f58885e.f59614a, new s(this, task));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0235  */
    /* JADX WARN: Type inference failed for: r11v12, types: [hi.l0] */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r18, pi.j r19, boolean r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hi.u.b(boolean, pi.j, boolean):void");
    }
}
