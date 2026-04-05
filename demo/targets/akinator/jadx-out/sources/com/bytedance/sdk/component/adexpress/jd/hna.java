package com.bytedance.sdk.component.adexpress.jd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.jd.yd;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements yd {

    /* renamed from: cm, reason: collision with root package name */
    private au f18391cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.my.jpo f18392jd;

    /* renamed from: jj, reason: collision with root package name */
    private AtomicBoolean f18393jj = new AtomicBoolean(false);
    private Context jpo;
    private ScheduledFuture<?> my;
    private xyk wqx;

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
                hna.this.f18392jd.jpo(true);
                hna.this.jpo(this.jpo, 107, null);
            }
        }
    }

    public hna(Context context, au auVar, com.bytedance.sdk.component.adexpress.my.jpo jpoVar, xyk xykVar) {
        this.jpo = context;
        this.f18391cm = auVar;
        this.wqx = xykVar;
        this.f18392jd = jpoVar;
        jpoVar.jpo(this.wqx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        try {
            ScheduledFuture<?> scheduledFuture = this.my;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.my.cancel(false);
            this.my = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.my.jpo jd() {
        return this.f18392jd;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public boolean jpo(final yd.jpo jpoVar) {
        int iJj = this.f18391cm.jj();
        if (iJj < 0) {
            jpo(jpoVar, 107, "time is ".concat(String.valueOf(iJj)));
        } else {
            this.my = com.bytedance.sdk.component.adexpress.cm.cm.jpo(new jpo(1, jpoVar), iJj, TimeUnit.MILLISECONDS);
            this.f18392jd.jpo(new qk() { // from class: com.bytedance.sdk.component.adexpress.jd.hna.1
                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(View view, oya oyaVar) {
                    prr prrVarJd;
                    hna.this.wqx();
                    if (jpoVar.wqx() || (prrVarJd = jpoVar.jd()) == null) {
                        return;
                    }
                    prrVarJd.jpo(hna.this.f18392jd, oyaVar);
                    jpoVar.jpo(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.jd.qk
                public void jpo(int i10, String str) {
                    hna.this.jpo(jpoVar, i10, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd
    public void jpo() {
        this.f18392jd.cm();
        wqx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(yd.jpo jpoVar, int i10, String str) {
        prr prrVarJd;
        if (jpoVar.wqx() || this.f18393jj.get()) {
            return;
        }
        wqx();
        this.f18391cm.my().jpo(i10, str);
        if (jpoVar.jd(this)) {
            jpoVar.jpo(this);
        } else {
            if (jpoVar.wqx() || (prrVarJd = jpoVar.jd()) == null) {
                return;
            }
            jpoVar.jpo(true);
            prrVarJd.a_(i10);
        }
        this.f18393jj.getAndSet(true);
    }
}
