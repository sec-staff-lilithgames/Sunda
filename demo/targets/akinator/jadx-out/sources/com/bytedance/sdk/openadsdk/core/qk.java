package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.hx;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends View implements hx.jpo {

    /* renamed from: au, reason: collision with root package name */
    private boolean f20829au;

    /* renamed from: cm, reason: collision with root package name */
    private View f20830cm;

    /* renamed from: if, reason: not valid java name */
    private boolean f138if;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f20831jd;

    /* renamed from: jj, reason: collision with root package name */
    private List<View> f20832jj;
    private boolean jpo;

    /* renamed from: ju, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f20833ju;
    private List<View> my;
    private final Runnable oya;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20834qk;
    private jpo wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final AtomicBoolean f20835yd;
    private final Handler zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jd();

        void jpo();

        void jpo(View view);

        void jpo(boolean z10);
    }

    public qk(Context context, View view, boolean z10) {
        super(sq.jpo());
        this.zz = new com.bytedance.sdk.component.utils.hx(oya.jd().getLooper(), this);
        this.f20835yd = new AtomicBoolean(true);
        this.f20829au = false;
        this.oya = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qk.3
            @Override // java.lang.Runnable
            public void run() {
                if (qk.this.wqx != null) {
                    qk.this.wqx.jpo(qk.this.f20830cm);
                }
            }
        };
        this.f138if = z10;
        this.f20830cm = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f20833ju = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.qk.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (qk.this.f20829au) {
                    return;
                }
                qk.this.my();
                qk.this.cm();
            }
        };
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20834qk = false;
        jd();
        if (this.f20833ju != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f20833ju);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        my();
        this.f20834qk = true;
        wqx();
        jpo(false);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        jd();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        wqx();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        jpo jpoVar = this.wqx;
        if (jpoVar != null) {
            jpoVar.jpo(z10);
        }
    }

    public void setAdType(int i10) {
        this.xyk = i10;
    }

    public void setCallback(jpo jpoVar) {
        this.wqx = jpoVar;
    }

    public void setNeedCheckingShow(boolean z10) {
        this.f20831jd = z10;
        if (!z10 && this.jpo) {
            my();
        } else {
            if (!z10 || this.jpo) {
                return;
            }
            cm();
        }
    }

    public void setRefClickViews(List<View> list) {
        this.my = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f20832jj = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        if (!this.f20831jd || this.jpo) {
            return;
        }
        this.jpo = true;
        this.zz.sendEmptyMessage(1);
    }

    private void jd() {
        jpo jpoVar;
        if (!this.f20835yd.getAndSet(false) || (jpoVar = this.wqx) == null) {
            return;
        }
        jpoVar.jpo();
    }

    private boolean jj() {
        View view = this.f20830cm;
        if (view instanceof com.bytedance.sdk.openadsdk.core.zz.nmd) {
            return ((com.bytedance.sdk.openadsdk.core.zz.nmd) view).dt();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        if (this.jpo) {
            this.zz.removeCallbacksAndMessages(null);
            this.jpo = false;
        }
    }

    private void wqx() {
        jpo jpoVar;
        if (this.f20835yd.getAndSet(true) || (jpoVar = this.wqx) == null) {
            return;
        }
        jpoVar.jd();
    }

    public void jpo() {
        jpo(this.my, (com.bytedance.sdk.openadsdk.core.wqx.wqx) null);
        jpo(this.f20832jj, (com.bytedance.sdk.openadsdk.core.wqx.wqx) null);
    }

    public void jpo(List<View> list, com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar) {
        if (com.bytedance.sdk.component.utils.au.jd(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(wqxVar);
                    view.setOnTouchListener(wqxVar);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what == 1 && this.jpo) {
            if (jj() && nzb.jpo(this.f20830cm, 20, this.xyk, this.f138if)) {
                my();
                this.f20829au = true;
                oya.wqx().post(this.oya);
                jpo(true);
                return;
            }
            this.zz.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private void jpo(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.qk.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (qk.this.f20833ju != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(qk.this.f20833ju);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    qk.this.f20833ju = null;
                }
            }
        });
    }
}
