package com.bytedance.sdk.openadsdk.hmu.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jd {

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicLong f21157cm;

    /* renamed from: jd, reason: collision with root package name */
    protected dt f21158jd;

    /* renamed from: jj, reason: collision with root package name */
    private final my.jpo f21159jj;
    protected WeakReference<View> jpo;
    private final AtomicBoolean my;

    /* renamed from: qk, reason: collision with root package name */
    private final int f21160qk;
    protected final AtomicBoolean wqx;
    private final Integer xyk;
    private volatile boolean zz = false;

    public jd(Integer num, View view, dt dtVar, int i10, my.jpo jpoVar) {
        this.xyk = num;
        this.f21160qk = i10;
        this.f21158jd = dtVar;
        this.f21159jj = jpoVar;
        jpo(view);
        this.wqx = new AtomicBoolean(false);
        this.f21157cm = new AtomicLong(-1L);
        this.my = new AtomicBoolean(false);
    }

    public static jd jpo(boolean z10, Integer num, View view, dt dtVar, my.jpo jpoVar) {
        return z10 ? new xyk(num, view, dtVar, jpoVar) : new wqx(num, view, dtVar, jpoVar);
    }

    public void au() {
        this.wqx.set(false);
        xyk();
    }

    public void cm() {
        if (this.my.compareAndSet(false, true)) {
            cm.jpo(this.f21158jd, my(), this.f21159jj);
        }
    }

    /* renamed from: if, reason: not valid java name */
    public boolean mo484if() {
        return this.wqx.get();
    }

    public int jd() {
        if (zz()) {
            return 1;
        }
        WeakReference<View> weakReference = this.jpo;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.zz) {
            return 3;
        }
        if (ju().equals(view.getTag(33554433))) {
            return (ju().equals(view.getTag(33554433)) && wqx()) ? 1 : 2;
        }
        yd();
        my.jd(ju());
        return 3;
    }

    public abstract void jd(int i10);

    public abstract int jj();

    public Integer ju() {
        return this.xyk;
    }

    public jpo my() {
        WeakReference<View> weakReference = this.jpo;
        if (weakReference == null) {
            return new jpo(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new jpo(0, 0, 0.0f) : new jpo(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void qk() {
        if (zz()) {
            return;
        }
        if (!this.wqx.get()) {
            xyk();
        } else if (!this.f21157cm.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.f21157cm.get() >= this.f21160qk) {
            cm();
        }
    }

    public abstract boolean wqx();

    public void xyk() {
        this.f21157cm.set(-1L);
    }

    public void yd() {
        this.zz = true;
        qk.jd(this);
    }

    public boolean zz() {
        return this.my.get();
    }

    public void jpo() {
        if (this.wqx.compareAndSet(false, true)) {
            qk.jpo(this);
        }
    }

    public void jpo(int i10) {
        if (i10 == 4) {
            jpo();
            return;
        }
        if (i10 == 8) {
            au();
        } else if (i10 == 9) {
            cm();
        } else {
            jd(i10);
        }
    }

    public void jpo(View view) {
        if (view != null) {
            view.setTag(33554433, ju());
        }
        this.jpo = new WeakReference<>(view);
    }
}
