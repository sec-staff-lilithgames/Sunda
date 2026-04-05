package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f5625j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f5626k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public k3.v f5627b;

    /* renamed from: c, reason: collision with root package name */
    public k3.x f5628c;

    /* renamed from: e, reason: collision with root package name */
    public ja.d f5629e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5630f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5631g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5632h = false;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f5633i;

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5633i = null;
        } else {
            this.f5633i = new ArrayList();
        }
    }

    public static k3.x b(Context context, ComponentName componentName, boolean z10, int i10) {
        k3.x rVar;
        HashMap map = f5626k;
        k3.x xVar = (k3.x) map.get(componentName);
        if (xVar != null) {
            return xVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            rVar = new k3.r(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            rVar = new k3.w(context, componentName, i10);
        }
        map.put(componentName, rVar);
        return rVar;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i10, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i10, intent);
    }

    public final void a(boolean z10) {
        if (this.f5629e == null) {
            this.f5629e = new ja.d(this, 1);
            k3.x xVar = this.f5628c;
            if (xVar != null && z10) {
                xVar.serviceProcessingStarted();
            }
            this.f5629e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void c();

    public final void d() {
        ArrayList arrayList = this.f5633i;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f5629e = null;
                    ArrayList arrayList2 = this.f5633i;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f5632h) {
                        this.f5628c.serviceProcessingFinished();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean isStopped() {
        return this.f5631g;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        k3.v vVar = this.f5627b;
        if (vVar != null) {
            return vVar.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5627b = new k3.v(this);
            this.f5628c = null;
        } else {
            this.f5627b = null;
            this.f5628c = b(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f5633i;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f5632h = true;
                this.f5628c.serviceProcessingFinished();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (this.f5633i == null) {
            return 2;
        }
        this.f5628c.serviceStartReceived();
        synchronized (this.f5633i) {
            ArrayList arrayList = this.f5633i;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new k3.s(this, intent, i11));
            a(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void setInterruptIfStopped(boolean z10) {
        this.f5630f = z10;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i10, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f5625j) {
            k3.x xVarB = b(context, componentName, true, i10);
            xVarB.b(i10);
            xVarB.a(intent);
        }
    }
}
