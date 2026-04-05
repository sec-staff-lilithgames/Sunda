package com.bytedance.sdk.component.adexpress.my;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.bytedance.sdk.component.adexpress.jd.ju;
import com.bytedance.sdk.component.adexpress.jd.qk;
import com.bytedance.sdk.component.adexpress.jd.xyk;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.oya;
import com.bytedance.sdk.component.zz.jj;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements com.bytedance.sdk.component.adexpress.jd.cm<jj>, ju, com.bytedance.sdk.component.adexpress.jpo, com.bytedance.sdk.component.adexpress.theme.jpo {

    /* renamed from: au, reason: collision with root package name */
    private boolean f18541au;

    /* renamed from: cm, reason: collision with root package name */
    protected jj f18542cm;

    /* renamed from: if, reason: not valid java name */
    private au f62if;

    /* renamed from: jd, reason: collision with root package name */
    protected boolean f18543jd;
    protected JSONObject jpo;

    /* renamed from: ju, reason: collision with root package name */
    private xyk f18545ju;
    private int oya;

    /* renamed from: qk, reason: collision with root package name */
    private Context f18546qk;
    protected boolean wqx;
    private String xyk;

    /* renamed from: yd, reason: collision with root package name */
    private volatile qk f18547yd;
    private String zz;
    protected int my = 8;

    /* renamed from: jj, reason: collision with root package name */
    protected AtomicBoolean f18544jj = new AtomicBoolean(false);

    public jpo(Context context, au auVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f18543jd = false;
        this.f18546qk = context;
        this.f62if = auVar;
        this.xyk = auVar.cm();
        themeStatusBroadcastReceiver.jpo(this);
        if (com.bytedance.sdk.component.adexpress.cm.jd()) {
            m412if();
            return;
        }
        jj jjVarAu = au();
        this.f18542cm = jjVarAu;
        if (jjVarAu != null) {
            this.f18543jd = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.cm.jpo() != null) {
                this.f18542cm = new jj(com.bytedance.sdk.component.adexpress.cm.jpo());
            }
        }
    }

    private jj au() {
        return this.f62if.dt() ? my.jpo().jpo(this.f18546qk, this.xyk) : my.jpo().jd(this.f18546qk, this.xyk);
    }

    /* renamed from: if, reason: not valid java name */
    private void m412if() {
        if (this.f18546qk == null && com.bytedance.sdk.component.adexpress.cm.jpo() != null) {
            this.f18546qk = com.bytedance.sdk.component.adexpress.cm.jpo();
        }
        if (this.f18546qk != null) {
            jj jjVarAu = au();
            this.f18542cm = jjVarAu;
            if (jjVarAu == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.f18542cm = new jj(new MutableContextWrapper(this.f18546qk.getApplicationContext()));
            } else {
                this.f18543jd = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private void oya() {
        if (this.f62if.dt()) {
            my.jpo().jd(this.f18542cm);
        } else {
            my.jpo().wqx(this.f18542cm);
        }
    }

    public void cm() {
        if (this.f18544jj.get()) {
            return;
        }
        this.f18544jj.set(true);
        qk();
        if (this.f18542cm.getParent() != null) {
            ((ViewGroup) this.f18542cm.getParent()).removeView(this.f18542cm);
        }
        if (this.wqx) {
            oya();
        } else {
            my.jpo().my(this.f18542cm);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public jj my() {
        return jpo();
    }

    public void jj() {
        if (jpo() == null) {
            return;
        }
        try {
            jpo().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public abstract void jpo(int i10);

    public au ju() {
        return this.f62if;
    }

    public abstract void qk();

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public int wqx() {
        return 0;
    }

    public void xyk() {
        zz();
        Activity activityJpo = com.bytedance.sdk.component.utils.jd.jpo(this.f18542cm);
        if (activityJpo != null) {
            this.oya = jd(activityJpo);
        }
    }

    private int jd(Activity activity) {
        return activity.hashCode();
    }

    public void jpo(String str) {
        this.zz = str;
    }

    public jj jpo() {
        return this.f18542cm;
    }

    public void jpo(xyk xykVar) {
        this.f18545ju = xykVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(qk qkVar) {
        String str;
        this.f18547yd = qkVar;
        if (jpo() != null && jpo().getWebView() != null) {
            if (TextUtils.isEmpty(this.zz)) {
                this.f18547yd.jpo(102, "url is empty");
                return;
            }
            if (!this.f62if.dt()) {
                if (!com.bytedance.sdk.component.adexpress.jpo.jd.jd.jpo(this.jpo)) {
                    qk qkVar2 = this.f18547yd;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.jpo == null);
                    qkVar2.jpo(103, sb2.toString());
                    return;
                }
            } else if (wqx() == 9 && !com.bytedance.sdk.component.adexpress.jpo.jd.jd.jd(this.jpo)) {
                qk qkVar3 = this.f18547yd;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.jpo == null);
                qkVar3.jpo(103, sb3.toString());
                return;
            }
            this.f62if.my().jpo(this.f18543jd);
            if (this.f18543jd) {
                try {
                    int iNq = this.f62if.nq();
                    if (this.f62if.dt() && iNq == 1) {
                        this.f62if.wqx();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.f62if.wqx() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.f18542cm.sq();
                    this.f62if.my();
                    oya.jpo(this.f18542cm.getWebView(), str);
                    return;
                } catch (Exception e10) {
                    my.jpo().my(this.f18542cm);
                    this.f18547yd.jpo(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            jj jjVarJpo = jpo();
            jjVarJpo.sq();
            this.f62if.my();
            jjVarJpo.a_(this.zz);
            return;
        }
        qk qkVar4 = this.f18547yd;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(jpo() == null);
        sb4.append(" or Webview is null");
        qkVar4.jpo(102, sb4.toString());
    }

    public void yd() {
    }

    public void zz() {
    }

    public void jpo(boolean z10) {
        this.f18541au = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(final com.bytedance.sdk.component.adexpress.jd.oya oyaVar) {
        if (oyaVar == null) {
            if (this.f18547yd != null) {
                this.f18547yd.jpo(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zJd = oyaVar.jd();
        final float fWqx = (float) oyaVar.wqx();
        final float fCm = (float) oyaVar.cm();
        if (wqx() == 0 && (fWqx <= 0.0f || fCm <= 0.0f)) {
            if (this.f18547yd != null) {
                this.f18547yd.jpo(105, "width is " + fWqx + "height is " + fCm);
                return;
            }
            return;
        }
        this.wqx = zJd;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jpo(oyaVar, fWqx, fCm);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.my.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jpo(oyaVar, fWqx, fCm);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.adexpress.jd.oya oyaVar, float f10, float f11) {
        oyaVar.yd();
        boolean z10 = this.wqx;
        if (z10 && !this.f18541au) {
            jpo(f10, f11);
            jpo(this.my);
            if (this.f18547yd != null) {
                this.f18547yd.jpo(jpo(), oyaVar);
                return;
            }
            return;
        }
        if (!z10) {
            my.jpo().my(this.f18542cm);
        }
        jpo(oyaVar.yd(), oyaVar.zz());
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(View view, int i10, com.bytedance.sdk.component.adexpress.wqx wqxVar) {
        xyk xykVar = this.f18545ju;
        if (xykVar != null) {
            xykVar.jpo(view, i10, wqxVar);
        }
    }

    private void jpo(float f10, float f11) {
        this.f62if.my().my();
        if (wqx() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) jpo().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            jpo().setLayoutParams(layoutParams);
            return;
        }
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18546qk, f10);
        int iJpo2 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18546qk, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) jpo().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iJpo, iJpo2);
        }
        layoutParams2.width = iJpo;
        layoutParams2.height = iJpo2;
        jpo().setLayoutParams(layoutParams2);
    }

    private void jpo(int i10, String str) {
        if (this.f18547yd != null) {
            this.f18547yd.jpo(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jpo
    public void jpo(Activity activity) {
        if (this.oya == 0 || activity == null || activity.hashCode() != this.oya) {
            return;
        }
        cm();
        yd();
    }

    public void jpo(JSONObject jSONObject) {
        this.jpo = jSONObject;
    }
}
