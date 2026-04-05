package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.d9;
import com.applovin.impl.ga;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class FirebaseMessaging {

    /* renamed from: l, reason: collision with root package name */
    public static j0 f29723l;

    /* renamed from: n, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f29725n;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.g f29726a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f29727b;

    /* renamed from: c, reason: collision with root package name */
    public final v f29728c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f29729d;

    /* renamed from: e, reason: collision with root package name */
    public final t f29730e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f29731f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f29732g;

    /* renamed from: h, reason: collision with root package name */
    public final Task f29733h;

    /* renamed from: i, reason: collision with root package name */
    public final y f29734i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f29735j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f29722k = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m, reason: collision with root package name */
    public static sj.c f29724m = new bi.k(6);

    public FirebaseMessaging(com.google.firebase.g gVar, sj.c cVar, sj.c cVar2, tj.f fVar, sj.c cVar3, yi.d dVar) {
        final y yVar = new y(gVar.getApplicationContext());
        final v vVar = new v(gVar, yVar, cVar, cVar2, fVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i11 = 0;
        this.f29735j = false;
        f29724m = cVar3;
        this.f29726a = gVar;
        this.f29730e = new t(this, dVar);
        final Context applicationContext = gVar.getApplicationContext();
        this.f29727b = applicationContext;
        o oVar = new o();
        this.f29734i = yVar;
        this.f29728c = vVar;
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b();
        bVar.f6757b = new z.f();
        bVar.f6756a = executorServiceNewSingleThreadExecutor;
        this.f29729d = bVar;
        this.f29731f = scheduledThreadPoolExecutor;
        this.f29732g = threadPoolExecutor;
        Context applicationContext2 = gVar.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f29873c;

            {
                this.f29873c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                FirebaseMessaging firebaseMessaging = this.f29873c;
                switch (i12) {
                    case 0:
                        j0 j0Var = FirebaseMessaging.f29723l;
                        if (firebaseMessaging.isAutoInitEnabled()) {
                            firebaseMessaging.g();
                            break;
                        }
                        break;
                    default:
                        Context context = firebaseMessaging.f29727b;
                        b0.n(context);
                        v vVar2 = firebaseMessaging.f29728c;
                        jh.i.N(context, vVar2, firebaseMessaging.f());
                        if (firebaseMessaging.f()) {
                            vVar2.f29894c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f29731f, new p(firebaseMessaging, 0));
                            break;
                        }
                        break;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i12 = n0.f29846j;
        Task taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.m0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context = applicationContext;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                return new n0(this, yVar, l0.getInstance(context, scheduledThreadPoolExecutor3), vVar, context, scheduledThreadPoolExecutor3);
            }
        });
        this.f29733h = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new p(this, 2));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f29873c;

            {
                this.f29873c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i10;
                FirebaseMessaging firebaseMessaging = this.f29873c;
                switch (i122) {
                    case 0:
                        j0 j0Var = FirebaseMessaging.f29723l;
                        if (firebaseMessaging.isAutoInitEnabled()) {
                            firebaseMessaging.g();
                            break;
                        }
                        break;
                    default:
                        Context context = firebaseMessaging.f29727b;
                        b0.n(context);
                        v vVar2 = firebaseMessaging.f29728c;
                        jh.i.N(context, vVar2, firebaseMessaging.f());
                        if (firebaseMessaging.f()) {
                            vVar2.f29894c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f29731f, new p(firebaseMessaging, 0));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f29725n == null) {
                    f29725n = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f29725n.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized j0 c(Context context) {
        try {
            if (f29723l == null) {
                f29723l = new j0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f29723l;
    }

    public static synchronized FirebaseMessaging getInstance() {
        return getInstance(com.google.firebase.g.getInstance());
    }

    public static jd.l getTransportFactory() {
        return (jd.l) f29724m.get();
    }

    public final String a() throws IOException {
        Task taskContinueWithTask;
        i0 i0VarE = e();
        if (!i(i0VarE)) {
            return i0VarE.f29817a;
        }
        String strB = y.b(this.f29726a);
        androidx.localbroadcastmanager.content.b bVar = this.f29729d;
        synchronized (bVar) {
            taskContinueWithTask = (Task) ((z.f) bVar.f6757b).get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                v vVar = this.f29728c;
                taskContinueWithTask = vVar.a(vVar.c(y.b(vVar.f29892a), "*", new Bundle())).onSuccessTask(this.f29732g, new ao.q0(this, 6, strB, i0VarE)).continueWithTask((Executor) bVar.f6756a, new ao.n(11, bVar, strB));
                ((z.f) bVar.f6757b).put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final String d() {
        com.google.firebase.g gVar = this.f29726a;
        return "[DEFAULT]".equals(gVar.getName()) ? "" : gVar.getPersistenceKey();
    }

    public Task<Void> deleteToken() {
        if (e() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new q(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return x.a();
    }

    public final i0 e() {
        return c(this.f29727b).getToken(d(), y.b(this.f29726a));
    }

    public final boolean f() {
        Context context = this.f29727b;
        b0.n(context);
        if (!b0.q(context)) {
            return false;
        }
        if (this.f29726a.get(yh.d.class) != null) {
            return true;
        }
        return x.a() && f29724m != null;
    }

    public final void g() {
        if (i(e())) {
            synchronized (this) {
                if (!this.f29735j) {
                    h(0L);
                }
            }
        }
    }

    public Task<String> getToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f29731f.execute(new q(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    public final synchronized void h(long j10) {
        b(new SyncTask(this, Math.min(Math.max(30L, 2 * j10), f29722k)), j10);
        this.f29735j = true;
    }

    public final boolean i(i0 i0Var) {
        if (i0Var != null) {
            return System.currentTimeMillis() > i0Var.f29819c + i0.f29816d || !this.f29734i.a().equals(i0Var.f29818b);
        }
        return true;
    }

    public boolean isAutoInitEnabled() {
        return this.f29730e.e();
    }

    public boolean isNotificationDelegationEnabled() {
        return b0.q(this.f29727b);
    }

    @Deprecated
    public void send(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        Context context = this.f29727b;
        intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, PendingIntent.getBroadcast(context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        intent.putExtras(remoteMessage.f29738b);
        context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z10) {
        t tVar = this.f29730e;
        synchronized (tVar) {
            try {
                tVar.d();
                s sVar = (s) tVar.f29881c;
                if (sVar != null) {
                    ((bi.t) ((yi.d) tVar.f29880b)).unsubscribe(com.google.firebase.b.class, sVar);
                    tVar.f29881c = null;
                }
                SharedPreferences.Editor editorEdit = ((FirebaseMessaging) tVar.f29883e).f29726a.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    ((FirebaseMessaging) tVar.f29883e).g();
                }
                tVar.f29882d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        com.google.firebase.g.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
        jh.i.N(this.f29727b, this.f29728c, f());
    }

    public Task<Void> setNotificationDelegationEnabled(boolean z10) {
        Task task;
        if (PlatformVersion.isAtLeastQ()) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f29731f.execute(new d9(this.f29727b, z10, taskCompletionSource, 3));
            task = taskCompletionSource.getTask();
        } else {
            task = Tasks.forResult(null);
        }
        return task.addOnSuccessListener(new ga(2), new p(this, 1));
    }

    public Task<Void> subscribeToTopic(String str) {
        return this.f29733h.onSuccessTask(new c3.c(str, 1));
    }

    public Task<Void> unsubscribeFromTopic(String str) {
        return this.f29733h.onSuccessTask(new c3.c(str, 2));
    }

    public static synchronized FirebaseMessaging getInstance(com.google.firebase.g gVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) gVar.get(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }
}
