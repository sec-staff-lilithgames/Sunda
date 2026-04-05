package k3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class p0 implements Handler.Callback, ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final Context f70235b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f70236c;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f70237e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public Set f70238f = new HashSet();

    public p0(Context context) {
        this.f70235b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f70236c = new Handler(handlerThread.getLooper(), this);
    }

    public final void b(o0 o0Var) {
        ComponentName componentName = o0Var.f70230a;
        ArrayDeque arrayDeque = o0Var.f70233d;
        Handler handler = this.f70236c;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = o0Var.f70234e;
        int i11 = i10 + 1;
        o0Var.f70234e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + o0Var.f70234e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        Context context = this.f70235b;
        HashMap map = this.f70237e;
        if (i10 == 0) {
            q0 q0Var = (q0) message.obj;
            Set<String> enabledListenerPackages = r0.getEnabledListenerPackages(context);
            if (!enabledListenerPackages.equals(this.f70238f)) {
                this.f70238f = enabledListenerPackages;
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        map.put(componentName2, new o0(componentName2));
                    }
                }
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        o0 o0Var = (o0) entry.getValue();
                        if (o0Var.f70231b) {
                            context.unbindService(this);
                            o0Var.f70231b = false;
                        }
                        o0Var.f70232c = null;
                        it2.remove();
                    }
                }
            }
            for (o0 o0Var2 : map.values()) {
                o0Var2.f70233d.add(q0Var);
                a(o0Var2);
            }
        } else if (i10 == 1) {
            n0 n0Var = (n0) message.obj;
            ComponentName componentName3 = n0Var.f70228a;
            IBinder iBinder = n0Var.f70229b;
            o0 o0Var3 = (o0) map.get(componentName3);
            if (o0Var3 != null) {
                o0Var3.f70232c = d.b.asInterface(iBinder);
                o0Var3.f70234e = 0;
                a(o0Var3);
                return true;
            }
        } else if (i10 == 2) {
            o0 o0Var4 = (o0) map.get((ComponentName) message.obj);
            if (o0Var4 != null) {
                if (o0Var4.f70231b) {
                    context.unbindService(this);
                    o0Var4.f70231b = false;
                }
                o0Var4.f70232c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            o0 o0Var5 = (o0) map.get((ComponentName) message.obj);
            if (o0Var5 != null) {
                a(o0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f70236c.obtainMessage(1, new n0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f70236c.obtainMessage(2, componentName).sendToTarget();
    }

    public void queueTask(q0 q0Var) {
        this.f70236c.obtainMessage(0, q0Var).sendToTarget();
    }

    public final void a(o0 o0Var) {
        boolean z10;
        ArrayDeque arrayDeque = o0Var.f70233d;
        ComponentName componentName = o0Var.f70230a;
        String str = VPCjETNfjxu.AsViEHoIa;
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (o0Var.f70231b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f70235b;
            boolean zBindService = context.bindService(component, this, 33);
            o0Var.f70231b = zBindService;
            if (zBindService) {
                o0Var.f70234e = 0;
            } else {
                Log.w(str, "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = o0Var.f70231b;
        }
        if (!z10 || o0Var.f70232c == null) {
            b(o0Var);
            return;
        }
        while (true) {
            q0 q0Var = (q0) arrayDeque.peek();
            if (q0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Sending task " + q0Var);
                }
                ((m0) q0Var).send(o0Var.f70232c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w(str, "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(o0Var);
    }
}
