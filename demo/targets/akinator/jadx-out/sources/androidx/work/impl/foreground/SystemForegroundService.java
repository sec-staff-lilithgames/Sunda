package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleService;
import com.google.firebase.messaging.b0;
import java.util.UUID;
import n6.c0;
import u6.b;
import u6.c;
import u6.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements c {

    /* renamed from: g, reason: collision with root package name */
    public static final String f7510g = c0.tagWithPrefix("SystemFgService");

    /* renamed from: h, reason: collision with root package name */
    public static SystemForegroundService f7511h = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7512c;

    /* renamed from: e, reason: collision with root package name */
    public d f7513e;

    /* renamed from: f, reason: collision with root package name */
    public NotificationManager f7514f;

    public static SystemForegroundService getInstance() {
        return f7511h;
    }

    public final void a() {
        this.f7514f = (NotificationManager) getApplicationContext().getSystemService("notification");
        d dVar = new d(getApplicationContext());
        this.f7513e = dVar;
        if (dVar.f87974l != null) {
            c0.get().error(d.f87964m, "A callback already exists.");
        } else {
            dVar.f87974l = this;
        }
    }

    @Override // u6.c
    public void cancelNotification(int i10) {
        this.f7514f.cancel(i10);
    }

    @Override // u6.c
    public void notify(int i10, Notification notification) {
        this.f7514f.notify(i10, notification);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f7511h = this;
        a();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f7513e.b();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f7512c) {
            c0.get().info(f7510g, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f7513e.b();
            a();
            this.f7512c = false;
        }
        if (intent == null) {
            return 3;
        }
        d dVar = this.f7513e;
        dVar.getClass();
        String str = d.f87964m;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            c0.get().info(str, "Started foreground service " + intent);
            dVar.f87967e.executeOnTaskThread(new b(dVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            dVar.a(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            dVar.a(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            c0.get().info(str, "Stopping foreground service");
            SystemForegroundService systemForegroundService = dVar.f87974l;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.stop(i11);
            return 3;
        }
        c0.get().info(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        dVar.f87966c.cancelWorkById(UUID.fromString(stringExtra));
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f7513e.c(i10, 2048);
    }

    @Override // u6.c
    public void startForeground(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b0.B(this, i10, notification, i11);
        } else if (i12 >= 29) {
            b0.A(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // u6.c
    public void stop(int i10) {
        this.f7512c = true;
        c0.get().debug(f7510g, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f7511h = null;
        stopSelf(i10);
    }

    public void onTimeout(int i10, int i11) {
        this.f7513e.c(i10, i11);
    }
}
