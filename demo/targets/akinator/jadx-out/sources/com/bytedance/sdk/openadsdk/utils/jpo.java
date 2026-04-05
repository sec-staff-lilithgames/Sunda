package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements Application.ActivityLifecycleCallbacks {

    /* renamed from: jd, reason: collision with root package name */
    public static long f21572jd = 0;
    public static boolean jpo = false;
    public static long wqx;
    private volatile WeakReference<Activity> oya;
    private final cm xyk;
    private final cm zz;

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f21574cm = new AtomicBoolean(false);
    private final RunnableC0156jpo my = new RunnableC0156jpo();

    /* renamed from: jj, reason: collision with root package name */
    private final jj f21575jj = new jj();

    /* renamed from: qk, reason: collision with root package name */
    private final my f21577qk = new my();

    /* renamed from: yd, reason: collision with root package name */
    private int f21578yd = 0;

    /* renamed from: ju, reason: collision with root package name */
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.jpo>> f21576ju = new CopyOnWriteArrayList<>();

    /* renamed from: if, reason: not valid java name */
    private HandlerThread f165if = null;

    /* renamed from: au, reason: collision with root package name */
    private Handler f21573au = null;
    private final LinkedList<Activity> prr = new LinkedList<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class cm implements Runnable {
        private cm() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.cm.jpo.oya oyaVarVk = com.bytedance.sdk.openadsdk.core.settings.au.jrx().vk();
            if (oyaVarVk == null || oyaVarVk.jpo() || !com.bytedance.sdk.component.utils.opi.xyk(com.bytedance.sdk.openadsdk.core.sq.jpo())) {
                return;
            }
            com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(Cif.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd extends cm {
        private jd() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.jpo.cm, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jd();
            com.bytedance.sdk.openadsdk.utils.my.jd();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jj implements Runnable {
        public jj() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.oya.jd().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.jpo$jpo, reason: collision with other inner class name */
    public static class RunnableC0156jpo implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            duq.wqx(new com.bytedance.sdk.component.xyk.xyk("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.jpo.jpo.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class my implements Runnable {
        public my() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerJd = com.bytedance.sdk.openadsdk.core.oya.jd();
                Message messageObtain = Message.obtain(handlerJd, jpo.this.my);
                messageObtain.what = 1001;
                handlerJd.sendMessageDelayed(messageObtain, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class qk implements Runnable {

        /* renamed from: cm, reason: collision with root package name */
        private boolean f21580cm;

        /* renamed from: jd, reason: collision with root package name */
        private long f21581jd;
        private long wqx;

        public qk(long j10, long j11, boolean z10) {
            this.f21581jd = j10;
            this.wqx = j11;
            this.f21580cm = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21580cm) {
                com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(this.f21581jd / 1000, this.wqx / 1000);
            }
            jpo.this.cm();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx extends cm {
        private wqx() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.jpo.cm, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.my.jpo();
        }
    }

    public jpo() {
        this.xyk = new jd();
        this.zz = new wqx();
        wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        com.bytedance.sdk.openadsdk.cm.jpo.jpo.jpo();
    }

    private void wqx() {
        this.f165if = com.bytedance.sdk.component.utils.xyk.jpo("lifecycle", 10);
        this.f21573au = new Handler(this.f165if.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.prr.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f21576ju != null && this.f21576ju.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.jpo>> it = this.f21576ju.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.jpo> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().jpo(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.oya != null && this.oya.get() == activity) {
            this.oya = null;
        }
        this.prr.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.f21578yd - 1;
        this.f21578yd = i10;
        if (i10 < 0) {
            this.f21578yd = 0;
        }
        if (ApmHelper.isIsInit()) {
            jpo(this.f21577qk);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        jpo(this.f21575jj);
        if (!jpo) {
            f21572jd = System.currentTimeMillis();
            jpo = true;
        }
        this.oya = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (va.jd() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.jpo.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        if (va.cm(activity)) {
                            va.jpo(true);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ActivityLifecycle", th2);
        }
        this.f21578yd++;
        if (this.f21574cm.get()) {
            this.f21573au.removeCallbacks(this.zz);
            this.f21573au.removeCallbacks(this.xyk);
            jpo(this.zz);
        }
        this.f21574cm.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.f21578yd <= 0) {
            this.f21574cm.set(true);
        }
        if (jpo()) {
            jpo = false;
            com.bytedance.sdk.openadsdk.core.oya.f20821jd.set(false);
            wqx = System.currentTimeMillis();
            this.f21573au.removeCallbacks(this.zz);
            this.f21573au.removeCallbacks(this.xyk);
            jpo(this.xyk);
        }
        jpo(new qk(f21572jd, wqx, jpo()));
    }

    private void jpo(Runnable runnable) {
        if (!this.f165if.isAlive()) {
            wqx();
        }
        this.f21573au.postDelayed(runnable, 1000L);
    }

    public boolean jd(com.bytedance.sdk.component.adexpress.jpo jpoVar) {
        return this.f21576ju.remove(new WeakReference(jpoVar));
    }

    public Activity jd() {
        if (this.prr.isEmpty()) {
            return null;
        }
        return this.prr.getFirst();
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jpo jpoVar) {
        this.f21576ju.add(new WeakReference<>(jpoVar));
    }

    public boolean jpo() {
        return this.f21574cm.get();
    }

    public boolean jpo(boolean z10) {
        Activity activity;
        Window window;
        return (this.oya == null || (activity = this.oya.get()) == null || (window = activity.getWindow()) == null) ? z10 : window.getDecorView().hasWindowFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
