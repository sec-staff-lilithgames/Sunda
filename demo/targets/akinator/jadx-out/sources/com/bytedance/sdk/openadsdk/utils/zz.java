package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz implements oya, Runnable {

    /* renamed from: cm, reason: collision with root package name */
    private long f21625cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Activity f21626jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f21627jj;
    private long my;

    /* renamed from: qk, reason: collision with root package name */
    private final jpo f21628qk;
    private boolean xyk;
    private final AtomicBoolean zz = new AtomicBoolean(false);
    private final Handler wqx = new Handler(Looper.getMainLooper());
    private View jpo = cm();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jd();

        View jpo();
    }

    private zz(Activity activity, int i10, jpo jpoVar) {
        this.f21628qk = jpoVar;
        this.f21626jd = activity;
        this.f21625cm = i10;
    }

    private View cm() {
        jpo jpoVar = this.f21628qk;
        if (jpoVar != null) {
            return jpoVar.jpo();
        }
        return null;
    }

    private void jj() {
        Activity activity;
        View childAt;
        if (this.f21627jj || (activity = this.f21626jd) == null || activity.isFinishing() || this.f21626jd.isDestroyed()) {
            return;
        }
        if (this.jpo == null) {
            this.jpo = cm();
        }
        View view = this.jpo;
        if (view != null) {
            if (jd(view)) {
                jpo(this.jpo);
                View view2 = this.jpo;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.jpo).getChildAt(0)) != null && jd(childAt)) {
                    jpo(childAt);
                }
                jpo jpoVar = this.f21628qk;
                if (jpoVar != null) {
                    jpoVar.jd();
                }
            }
            qk();
        }
        this.f21627jj = true;
    }

    public static oya jpo(Activity activity, jpo jpoVar) {
        int iYq = com.bytedance.sdk.openadsdk.core.settings.au.jrx().yq();
        return iYq < 0 ? new oya() { // from class: com.bytedance.sdk.openadsdk.utils.zz.1
            @Override // com.bytedance.sdk.openadsdk.utils.oya
            public void jpo() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.oya
            public void jpo(long j10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.oya
            public void jd() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.oya
            public void wqx() {
            }
        } : new zz(activity, Math.min(iYq, 50) * 1000, jpoVar);
    }

    private void my() {
        this.xyk = false;
        this.my = SystemClock.elapsedRealtime();
        Handler handler = this.wqx;
        if (handler != null) {
            handler.postDelayed(this, this.f21625cm);
        }
    }

    private void qk() {
        ViewParent parent = this.jpo.getParent();
        if (parent instanceof ViewGroup) {
            if (((ViewGroup) parent).indexOfChild(this.jpo) != r0.getChildCount() - 1) {
                this.jpo.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.oya
    public void jd() {
        if (this.my <= 0 || this.f21627jj) {
            return;
        }
        if (!this.xyk) {
            this.f21625cm -= SystemClock.elapsedRealtime() - this.my;
        }
        this.xyk = true;
        if (this.f21625cm <= 0) {
            jj();
            return;
        }
        Handler handler = this.wqx;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        jj();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.oya
    public void wqx() {
        if (this.f21627jj) {
            return;
        }
        this.f21627jj = true;
        Handler handler = this.wqx;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.oya
    public void jpo(long j10) {
        if (this.zz.compareAndSet(false, true)) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f21625cm += j10;
            my();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.oya
    public void jpo() {
        if (this.my == 0 || !this.xyk) {
            return;
        }
        my();
    }

    private void jpo(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean jd(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
