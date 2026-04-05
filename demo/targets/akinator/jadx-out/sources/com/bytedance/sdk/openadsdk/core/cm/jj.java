package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.core.nzb;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.adsdk.ugeno.jj.jpo<View> implements hx.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final Handler f20249cm;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f20250jj;

    /* renamed from: ju, reason: collision with root package name */
    private final ViewTreeObserver.OnScrollChangedListener f20251ju;
    private long my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20252qk;
    private jd xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final Runnable f20253yd;
    private jpo zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jd {
        void jpo(boolean z10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo(boolean z10);
    }

    public jj(Context context) {
        super(context);
        this.f20249cm = new hx(oya.jd().getLooper(), this);
        this.f20250jj = true;
        this.f20252qk = true;
        this.f20253yd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cm.jj.1
            @Override // java.lang.Runnable
            public void run() {
                if (jj.this.zz != null) {
                    jj.this.zz.jpo(jj.this.f20252qk);
                }
            }
        };
        this.f20251ju = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.jj.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - jj.this.my > 500) {
                    jj.this.my = jElapsedRealtime;
                    jj.this.f20249cm.sendEmptyMessageDelayed(1, 500L);
                }
            }
        };
    }

    private void qk() {
        boolean zJpo = nzb.jpo(this, 50, -1, false);
        this.f20252qk = zJpo;
        if (zJpo == this.f20250jj) {
            return;
        }
        this.f20250jj = zJpo;
        duq.jpo(this.f20253yd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f20251ju);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f20251ju);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        jd jdVar = this.xyk;
        if (jdVar != null) {
            jdVar.jpo(z10);
        }
    }

    public void setSwiperVisibleChangeListener(jpo jpoVar) {
        this.zz = jpoVar;
    }

    public void setSwiperWindowFocusChangedListener(jd jdVar) {
        this.xyk = jdVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jj.jpo
    public View yd(int i10) {
        return (View) this.jpo.get(i10);
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what == 1) {
            qk();
        }
    }
}
