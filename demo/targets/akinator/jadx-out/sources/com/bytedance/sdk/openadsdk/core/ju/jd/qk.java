package com.bytedance.sdk.openadsdk.core.ju.jd;

import android.content.Context;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.sq;
import com.bytedance.sdk.component.adexpress.jd.au;
import com.bytedance.sdk.component.adexpress.jd.oya;
import com.bytedance.sdk.component.adexpress.jd.xyk;
import com.bytedance.sdk.component.adexpress.jd.yd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.zz.prr;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk implements yd {

    /* renamed from: cm, reason: collision with root package name */
    private ScheduledFuture<?> f20488cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ju.jj.cm f20489jd;

    /* renamed from: jj, reason: collision with root package name */
    private prr f20490jj;
    private Context jpo;
    private AtomicBoolean my = new AtomicBoolean(false);
    private au wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo implements Runnable {
        yd.jpo jpo;
        private int wqx;

        public jpo(int i10, yd.jpo jpoVar) {
            this.wqx = i10;
            this.jpo = jpoVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wqx == 1) {
                qk.this.f20489jd.jpo(true);
                qk.this.jpo(this.jpo, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "real time out" + qk.this.wqx.jj());
            }
        }
    }

    public qk(Context context, com.bytedance.sdk.openadsdk.core.ju.jj.cm cmVar, xyk xykVar, au auVar) {
        this.jpo = context;
        this.f20489jd = cmVar;
        this.wqx = auVar;
        this.f20489jd.jpo(xykVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public void jpo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f20488cm;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.f20488cm.cancel(false);
            this.f20488cm = null;
        } catch (Throwable th2) {
            nmd.wqx("RenderInterceptor", "remove ugen time out task fail", th2.getMessage());
        }
    }

    public void jpo(prr prrVar) {
        this.f20490jj = prrVar;
        this.f20489jd.jpo(prrVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public boolean jpo(final yd.jpo jpoVar) {
        int iJj = this.wqx.jj();
        if (iJj < 0) {
            jpo(jpoVar, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "time is ".concat(String.valueOf(iJj)));
        } else {
            this.f20488cm = duq.jpo().schedule(new jpo(1, jpoVar), iJj, TimeUnit.MILLISECONDS);
            this.f20489jd.jpo(new com.bytedance.sdk.component.adexpress.jd.qk() { // from class: com.bytedance.sdk.openadsdk.core.ju.jd.qk.1
                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(View view, oya oyaVar) {
                    qk.this.jd();
                    if (jpoVar.wqx()) {
                        return;
                    }
                    sq sqVar = new sq();
                    sqVar.jpo(0);
                    ((com.bytedance.sdk.openadsdk.core.ju.jj.jpo) qk.this.wqx).kln().jpo(sqVar);
                    qk.this.wqx.my().yd();
                    com.bytedance.sdk.component.adexpress.jd.prr prrVarJd = jpoVar.jd();
                    if (prrVarJd == null) {
                        return;
                    }
                    prrVarJd.jpo(qk.this.f20489jd, oyaVar);
                    jpoVar.jpo(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(int i10, String str) {
                    qk.this.jpo(jpoVar, i10, str);
                }
            });
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(yd.jpo jpoVar, int i10, String str) {
        com.bytedance.sdk.component.adexpress.jd.prr prrVarJd;
        if (jpoVar.wqx() || this.my.get()) {
            return;
        }
        jd();
        sq sqVar = new sq();
        sqVar.jpo(i10);
        sqVar.jpo(str);
        ((com.bytedance.sdk.openadsdk.core.ju.jj.jpo) this.wqx).kln().jpo(sqVar);
        if (jpoVar.jd(this)) {
            jpoVar.jpo(this);
        } else {
            if (jpoVar.wqx() || (prrVarJd = jpoVar.jd()) == null) {
                return;
            }
            jpoVar.jpo(true);
            prrVarJd.a_(i10);
        }
        this.my.getAndSet(true);
    }
}
