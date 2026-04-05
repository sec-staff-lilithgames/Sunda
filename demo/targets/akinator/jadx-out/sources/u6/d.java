package u6;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import n6.c0;
import n6.o;
import o6.e;
import o6.y0;
import r6.c;
import r6.j;
import r6.l;
import v6.b0;
import v6.n0;
import v6.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d implements j, e {

    /* renamed from: m, reason: collision with root package name */
    public static final String f87964m = c0.tagWithPrefix("SystemFgDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final Context f87965b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f87966c;

    /* renamed from: e, reason: collision with root package name */
    public final x6.b f87967e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f87968f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public s f87969g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f87970h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f87971i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f87972j;

    /* renamed from: k, reason: collision with root package name */
    public final l f87973k;

    /* renamed from: l, reason: collision with root package name */
    public SystemForegroundService f87974l;

    public d(Context context) {
        this.f87965b = context;
        y0 y0Var = y0.getInstance(context);
        this.f87966c = y0Var;
        this.f87967e = y0Var.getWorkTaskExecutor();
        this.f87969g = null;
        this.f87970h = new LinkedHashMap();
        this.f87972j = new HashMap();
        this.f87971i = new HashMap();
        this.f87973k = new l(y0Var.getTrackers());
        y0Var.getProcessor().addExecutionListener(this);
    }

    public static Intent createCancelWorkIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent createNotifyIntent(Context context, s sVar, o oVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", oVar.getNotification());
        intent.putExtra("KEY_WORKSPEC_ID", sVar.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", sVar.getGeneration());
        return intent;
    }

    public static Intent createStopForegroundIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public final void a(Intent intent) {
        if (this.f87974l == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int foregroundServiceType = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        s sVar = new s(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        c0.get().debug(f87964m, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        o oVar = new o(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f87970h;
        linkedHashMap.put(sVar, oVar);
        o oVar2 = (o) linkedHashMap.get(this.f87969g);
        if (oVar2 == null) {
            this.f87969g = sVar;
        } else {
            this.f87974l.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    foregroundServiceType |= ((o) ((Map.Entry) it.next()).getValue()).getForegroundServiceType();
                }
                oVar = new o(oVar2.getNotificationId(), oVar2.getNotification(), foregroundServiceType);
            } else {
                oVar = oVar2;
            }
        }
        this.f87974l.startForeground(oVar.getNotificationId(), oVar.getForegroundServiceType(), oVar.getNotification());
    }

    public final void b() {
        this.f87974l = null;
        synchronized (this.f87968f) {
            try {
                Iterator it = this.f87972j.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f87966c.getProcessor().removeExecutionListener(this);
    }

    public final void c(int i10, int i11) {
        c0.get().info(f87964m, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry entry : this.f87970h.entrySet()) {
            if (((o) entry.getValue()).getForegroundServiceType() == i11) {
                this.f87966c.stopForegroundWork((s) entry.getKey(), -128);
            }
        }
        SystemForegroundService systemForegroundService = this.f87974l;
        if (systemForegroundService != null) {
            systemForegroundService.stop(i10);
        }
    }

    @Override // r6.j
    public void onConstraintsStateChanged(b0 b0Var, r6.c cVar) {
        if (cVar instanceof c.a) {
            String str = b0Var.f89053a;
            c0.get().debug(f87964m, "Constraints unmet for WorkSpec " + str);
            this.f87966c.stopForegroundWork(n0.generationalId(b0Var), ((c.a) cVar).getReason());
        }
    }

    @Override // o6.e
    public void onExecuted(s sVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f87968f) {
            try {
                Job job = ((b0) this.f87971i.remove(sVar)) != null ? (Job) this.f87972j.remove(sVar) : null;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o oVar = (o) this.f87970h.remove(sVar);
        if (sVar.equals(this.f87969g)) {
            if (this.f87970h.size() > 0) {
                Iterator it = this.f87970h.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f87969g = (s) entry.getKey();
                if (this.f87974l != null) {
                    o oVar2 = (o) entry.getValue();
                    this.f87974l.startForeground(oVar2.getNotificationId(), oVar2.getForegroundServiceType(), oVar2.getNotification());
                    this.f87974l.cancelNotification(oVar2.getNotificationId());
                }
            } else {
                this.f87969g = null;
            }
        }
        SystemForegroundService systemForegroundService = this.f87974l;
        if (oVar == null || systemForegroundService == null) {
            return;
        }
        c0.get().debug(f87964m, "Removing Notification (id: " + oVar.getNotificationId() + ", workSpecId: " + sVar + ", notificationType: " + oVar.getForegroundServiceType());
        systemForegroundService.cancelNotification(oVar.getNotificationId());
    }

    public static Intent createStartForegroundIntent(Context context, s sVar, o oVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", sVar.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", sVar.getGeneration());
        intent.putExtra(KGUkpTlXZlJLy.HemrqiQuipTax, oVar.getNotificationId());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.getForegroundServiceType());
        intent.putExtra("KEY_NOTIFICATION", oVar.getNotification());
        return intent;
    }
}
