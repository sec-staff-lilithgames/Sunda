package com.bytedance.sdk.component.adexpress.dynamic.jpo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.cm.jj;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb;
import com.bytedance.sdk.component.adexpress.dynamic.my.xyk;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.bytedance.sdk.component.adexpress.jd.cm;
import com.bytedance.sdk.component.adexpress.jd.ju;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.component.adexpress.jd.qk;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.wqx;
import com.bytedance.sdk.component.utils.zz;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements cm<DynamicRootView>, ju {

    /* renamed from: cm, reason: collision with root package name */
    private qk f18277cm;

    /* renamed from: jd, reason: collision with root package name */
    private xyk f18278jd;

    /* renamed from: jj, reason: collision with root package name */
    private au f18279jj;
    private DynamicRootView jpo;
    private com.bytedance.sdk.component.adexpress.jd.xyk my;

    /* renamed from: qk, reason: collision with root package name */
    private ScheduledFuture<?> f18280qk;
    private Context wqx;
    private AtomicBoolean xyk = new AtomicBoolean(false);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo$jpo, reason: collision with other inner class name */
    public class RunnableC0073jpo implements Runnable {

        /* renamed from: jd, reason: collision with root package name */
        private int f18282jd;

        public RunnableC0073jpo(int i10) {
            this.f18282jd = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18282jd == 2) {
                jpo.this.jpo.callBackRenderFail(jpo.this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    public jpo(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, xyk xykVar, au auVar, com.bytedance.sdk.component.adexpress.dynamic.jj.jpo jpoVar) {
        this.wqx = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, auVar, jpoVar);
        this.jpo = dynamicRootView;
        this.f18278jd = xykVar;
        this.f18279jj = auVar;
        dynamicRootView.setRenderListener(this);
        this.f18279jj = auVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj() {
        this.f18279jj.my().jd(wqx());
        JSONObject jSONObjectWqx = this.f18279jj.wqx();
        if (com.bytedance.sdk.component.adexpress.jpo.jd.jd.jpo(jSONObjectWqx)) {
            this.f18278jd.jpo(new com.bytedance.sdk.component.adexpress.dynamic.jj.jd() { // from class: com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.jj.jd
                public void jpo(final com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
                    jpo.this.xyk();
                    jpo.this.f18279jj.my().wqx(jpo.this.wqx());
                    jpo.this.jpo(xykVar);
                    jpo.this.jd(xykVar);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        jpo.this.wqx(xykVar);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jpo.this.wqx(xykVar);
                            }
                        });
                    }
                    if (jpo.this.jpo == null || xykVar == null) {
                        return;
                    }
                    jpo.this.jpo.setBgColor(xykVar.jpo());
                    jpo.this.jpo.setBgMaterialCenterCalcColor(xykVar.jd());
                }
            });
            this.f18278jd.jpo(this.f18279jj);
            return;
        }
        int i10 = this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113;
        DynamicRootView dynamicRootView = this.jpo;
        StringBuilder sb2 = new StringBuilder("data null is ");
        sb2.append(jSONObjectWqx == null);
        dynamicRootView.callBackRenderFail(i10, sb2.toString());
    }

    private boolean qk() {
        DynamicRootView dynamicRootView = this.jpo;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyk() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f18280qk;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f18280qk.cancel(false);
            this.f18280qk = null;
        } catch (Throwable unused) {
        }
    }

    public DynamicRootView cm() {
        return this.jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        float fQk;
        float fJj;
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu;
        if (xykVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu2 = xykVar.ju();
        if (listJu2 == null || listJu2.size() <= 0) {
            fQk = 0.0f;
        } else {
            fQk = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2 : listJu2) {
                if (xykVar2.qk() > xykVar.qk() - xykVar2.zz() || (listJu = xykVar2.ju()) == null || listJu.size() <= 0) {
                    fJj = 0.0f;
                } else {
                    fJj = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar3 : listJu) {
                        if (xykVar3.yd().jd().equals("logo-union")) {
                            fJj = xykVar3.yd().jj();
                            fQk = ((xykVar.qk() + (-fJj)) - xykVar2.qk()) + xykVar2.yd().my().lq();
                        }
                    }
                }
                jd(xykVar2);
                if (fJj <= -15.0f) {
                    xykVar2.jj(xykVar2.zz() - fJj);
                    xykVar2.cm(xykVar2.qk() + fJj);
                    for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar4 : xykVar2.ju()) {
                        xykVar4.cm(xykVar4.qk() - fJj);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVarM406if = xykVar.m406if();
        if (xykVarM406if == null) {
            return;
        }
        float fJj2 = xykVar.jj() - xykVarM406if.jj();
        float fQk2 = xykVar.qk() - xykVarM406if.qk();
        xykVar.wqx(fJj2);
        xykVar.cm(fQk2);
        if (fQk > 0.0f) {
            xykVar.cm(xykVar.qk() - fQk);
            xykVar.jj(xykVar.zz() + fQk);
            for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar5 : xykVar.ju()) {
                xykVar5.cm(xykVar5.qk() + fQk);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(qk qkVar) {
        this.f18277cm = qkVar;
        int iJj = this.f18279jj.jj();
        if (iJj < 0) {
            this.jpo.callBackRenderFail(this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? 127 : Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(iJj)));
            return;
        }
        this.f18280qk = com.bytedance.sdk.component.adexpress.cm.cm.jpo(new RunnableC0073jpo(2), iJj, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.f18279jj.zz() <= 0) {
            jj();
        } else {
            zz.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jj();
                }
            }, this.f18279jj.zz());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public int wqx() {
        return this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        if (xykVar == null) {
            this.jpo.callBackRenderFail(this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE : 113, "layoutUnit is null");
            return;
        }
        this.f18279jj.my().cm(wqx());
        try {
            this.jpo.render(xykVar, wqx());
        } catch (Exception e10) {
            int i10 = this.f18278jd instanceof com.bytedance.sdk.component.adexpress.dynamic.my.qk ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.jpo.callBackRenderFail(i10, "exception is " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu;
        if (xykVar == null || (listJu = xykVar.ju()) == null || listJu.size() <= 0) {
            return;
        }
        Collections.sort(listJu, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo.3
            @Override // java.util.Comparator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar3) {
                jj jjVarMy = xykVar2.yd().my();
                jj jjVarMy2 = xykVar3.yd().my();
                if (jjVarMy == null || jjVarMy2 == null) {
                    return 0;
                }
                return jjVarMy.cz() >= jjVarMy2.cz() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2 : listJu) {
            if (xykVar2 != null) {
                jpo(xykVar2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public DynamicRootView my() {
        return cm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void jpo(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                jpo(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof nzb) {
            ((nzb) view).jd();
        }
    }

    public void jpo(com.bytedance.sdk.component.adexpress.jd.xyk xykVar) {
        this.my = xykVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(oya oyaVar) {
        if (this.xyk.get()) {
            return;
        }
        this.xyk.set(true);
        if (oyaVar.jd() && qk()) {
            this.jpo.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f18277cm.jpo(my(), oyaVar);
            return;
        }
        this.f18277cm.jpo(oyaVar.yd(), oyaVar.zz());
    }

    public void jd() {
        jpo(my());
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.ju
    public void jpo(View view, int i10, wqx wqxVar) {
        com.bytedance.sdk.component.adexpress.jd.xyk xykVar = this.my;
        if (xykVar != null) {
            xykVar.jpo(view, i10, wqxVar);
        }
    }
}
