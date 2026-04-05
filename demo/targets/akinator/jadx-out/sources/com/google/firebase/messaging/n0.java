package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f29845i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29846j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29847a;

    /* renamed from: b, reason: collision with root package name */
    public final y f29848b;

    /* renamed from: c, reason: collision with root package name */
    public final v f29849c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f29850d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f29852f;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f29854h;

    /* renamed from: e, reason: collision with root package name */
    public final z.f f29851e = new z.f();

    /* renamed from: g, reason: collision with root package name */
    public boolean f29853g = false;

    public n0(FirebaseMessaging firebaseMessaging, y yVar, l0 l0Var, v vVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f29850d = firebaseMessaging;
        this.f29848b = yVar;
        this.f29854h = l0Var;
        this.f29849c = vVar;
        this.f29847a = context;
        this.f29852f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f29850d.a();
        v vVar = this.f29849c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.a(vVar.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f29850d.a();
        v vVar = this.f29849c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.a(vVar.c(strA, "/topics/" + str, bundle)));
    }

    public final Task d(k0 k0Var) {
        ArrayDeque arrayDeque;
        l0 l0Var = this.f29854h;
        synchronized (l0Var) {
            l0Var.f29831a.add(k0Var.serialize());
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f29851e) {
            try {
                String strSerialize = k0Var.serialize();
                if (this.f29851e.containsKey(strSerialize)) {
                    arrayDeque = (ArrayDeque) this.f29851e.get(strSerialize);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f29851e.put(strSerialize, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final synchronized void e(boolean z10) {
        this.f29853g = z10;
    }

    public final void f() {
        boolean z10;
        if (this.f29854h.a() != null) {
            synchronized (this) {
                z10 = this.f29853g;
            }
            if (z10) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: IOException -> 0x006a, TryCatch #0 {IOException -> 0x006a, blocks: (B:15:0x002b, B:32:0x009b, B:34:0x00a3, B:20:0x003c, B:22:0x0044, B:24:0x0053, B:27:0x006d, B:29:0x0075, B:31:0x0084), top: B:76:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.n0.g():boolean");
    }

    public final void h(long j10) {
        this.f29852f.schedule(new o0(this, this.f29847a, this.f29848b, Math.min(Math.max(30L, 2 * j10), f29845i)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
