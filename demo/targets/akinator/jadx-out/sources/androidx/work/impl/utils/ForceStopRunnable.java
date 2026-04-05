package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n6.c0;
import n6.x0;
import o6.g0;
import o6.t;
import o6.y0;
import q6.f;
import v6.b0;
import v6.y;
import w3.b;
import w6.u;
import w6.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f7515g = c0.tagWithPrefix("ForceStopRunnable");

    /* renamed from: h, reason: collision with root package name */
    public static final long f7516h = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b, reason: collision with root package name */
    public final Context f7517b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f7518c;

    /* renamed from: e, reason: collision with root package name */
    public final u f7519e;

    /* renamed from: f, reason: collision with root package name */
    public int f7520f = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f7521a = c0.tagWithPrefix("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            c0.get().verbose(f7521a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.a(context);
        }
    }

    public ForceStopRunnable(Context context, y0 y0Var) {
        this.f7517b = context.getApplicationContext();
        this.f7518c = y0Var;
        this.f7519e = y0Var.getPreferenceUtils();
    }

    public static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f7516h;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    public boolean cleanUp() {
        y0 y0Var = this.f7518c;
        boolean zReconcileJobs = f.reconcileJobs(this.f7517b, y0Var.getWorkDatabase());
        WorkDatabase workDatabase = y0Var.getWorkDatabase();
        v6.c0 c0VarWorkSpecDao = workDatabase.workSpecDao();
        y yVarWorkProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<b0> runningWork = c0VarWorkSpecDao.getRunningWork();
            boolean z10 = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z10) {
                for (b0 b0Var : runningWork) {
                    x0 x0Var = x0.f75806b;
                    String str = b0Var.f89053a;
                    String str2 = b0Var.f89053a;
                    c0VarWorkSpecDao.setState(x0Var, str);
                    c0VarWorkSpecDao.setStopReason(str2, -512);
                    c0VarWorkSpecDao.markWorkSpecScheduled(str2, -1L);
                }
            }
            yVarWorkProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            return z10 || zReconcileJobs;
        } catch (Throwable th2) {
            workDatabase.endTransaction();
            throw th2;
        }
    }

    public void forceStopRunnable() {
        boolean zCleanUp = cleanUp();
        boolean zShouldRescheduleWorkers = shouldRescheduleWorkers();
        String str = f7515g;
        y0 y0Var = this.f7518c;
        if (zShouldRescheduleWorkers) {
            c0.get().debug(str, "Rescheduling Workers.");
            y0Var.rescheduleEligibleWork();
            y0Var.getPreferenceUtils().setNeedsReschedule(false);
        } else {
            if (isForceStopped()) {
                c0.get().debug(str, "Application was force-stopped, rescheduling.");
                y0Var.rescheduleEligibleWork();
                this.f7519e.setLastForceStopEventMillis(y0Var.getConfiguration().getClock().currentTimeMillis());
                return;
            }
            if (zCleanUp) {
                c0.get().debug(str, "Found unfinished work, scheduling it.");
                t.schedule(y0Var.getConfiguration(), y0Var.getWorkDatabase(), y0Var.getSchedulers());
            }
        }
    }

    public boolean isForceStopped() {
        Context context = this.f7517b;
        try {
            int i10 = Build.VERSION.SDK_INT;
            int i11 = i10 >= 31 ? 570425344 : 536870912;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
            intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
            if (i10 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long lastForceStopEventMillis = this.f7519e.getLastForceStopEventMillis();
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        ApplicationExitInfo applicationExitInfoB = sn.t.b(historicalProcessExitReasons.get(i12));
                        if (applicationExitInfoB.getReason() == 10 && applicationExitInfoB.getTimestamp() >= lastForceStopEventMillis) {
                            return true;
                        }
                    }
                }
            } else if (broadcast == null) {
                a(context);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e = e10;
            c0.get().warning(f7515g, "Ignoring exception", e);
            return true;
        } catch (SecurityException e11) {
            e = e11;
            c0.get().warning(f7515g, "Ignoring exception", e);
            return true;
        }
    }

    public boolean multiProcessChecks() {
        a configuration = this.f7518c.getConfiguration();
        boolean zIsEmpty = TextUtils.isEmpty(configuration.getDefaultProcessName());
        String str = f7515g;
        if (zIsEmpty) {
            c0.get().debug(str, "The default process name was not specified.");
            return true;
        }
        boolean zIsDefaultProcess = v.isDefaultProcess(this.f7517b, configuration);
        c0.get().debug(str, "Is default app process = " + zIsDefaultProcess);
        return zIsDefaultProcess;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        Context context = this.f7517b;
        String str = f7515g;
        y0 y0Var = this.f7518c;
        try {
            if (multiProcessChecks()) {
                while (true) {
                    try {
                        g0.migrateDatabase(context);
                        c0.get().debug(str, "Performing cleanup operations.");
                        try {
                            forceStopRunnable();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            i10 = this.f7520f + 1;
                            this.f7520f = i10;
                            if (i10 >= 3) {
                                String str2 = t3.v.isUserUnlocked(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                c0.get().error(str, str2, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                                b initializationExceptionHandler = y0Var.getConfiguration().getInitializationExceptionHandler();
                                if (initializationExceptionHandler == null) {
                                    throw illegalStateException;
                                }
                                c0.get().debug(str, "Routing exception to the specified exception handler", illegalStateException);
                                initializationExceptionHandler.accept(illegalStateException);
                            } else {
                                c0.get().debug(str, "Retrying after " + (i10 * 300), e10);
                                sleep(((long) this.f7520f) * 300);
                            }
                        }
                        c0.get().debug(str, "Retrying after " + (i10 * 300), e10);
                        sleep(((long) this.f7520f) * 300);
                    } catch (SQLiteException e11) {
                        c0.get().error(str, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        b initializationExceptionHandler2 = y0Var.getConfiguration().getInitializationExceptionHandler();
                        if (initializationExceptionHandler2 == null) {
                            throw illegalStateException2;
                        }
                        initializationExceptionHandler2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            y0Var.onForceStopRunnableCompleted();
        }
    }

    public boolean shouldRescheduleWorkers() {
        return this.f7518c.getPreferenceUtils().getNeedsReschedule();
    }

    public void sleep(long j10) throws InterruptedException {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }
}
