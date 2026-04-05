package com.bytedance.sdk.component.adexpress.jpo.jd;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.jpo.wqx.jpo;
import com.bytedance.sdk.component.utils.rq;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C3191e4;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends wqx {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile my f18515jd;
    private static File jpo;
    private AtomicBoolean wqx = new AtomicBoolean(true);

    /* renamed from: cm, reason: collision with root package name */
    private AtomicBoolean f18516cm = new AtomicBoolean(false);
    private boolean my = false;

    /* renamed from: jj, reason: collision with root package name */
    private AtomicBoolean f18517jj = new AtomicBoolean(false);

    /* renamed from: qk, reason: collision with root package name */
    private AtomicInteger f18518qk = new AtomicInteger(0);
    private AtomicLong xyk = new AtomicLong();

    private my() {
        yd();
    }

    public static my jd() {
        if (f18515jd == null) {
            synchronized (my.class) {
                try {
                    if (f18515jd == null) {
                        f18515jd = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18515jd;
    }

    private void ju() {
        if (this.f18518qk.getAndSet(0) <= 0 || System.currentTimeMillis() - this.xyk.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        qk();
    }

    public static File xyk() {
        if (jpo == null) {
            try {
                File file = new File(new File(cm.jpo(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                jpo = file;
            } catch (Throwable unused) {
            }
        }
        return jpo;
    }

    private void yd() {
        com.bytedance.sdk.component.adexpress.cm.cm.jd(new com.bytedance.sdk.component.xyk.xyk(C3191e4.a.f36368f) { // from class: com.bytedance.sdk.component.adexpress.jpo.jd.my.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                xyk.jpo();
                my.this.wqx.set(false);
                my.this.cm();
                my.this.qk();
                if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() == null || !rq.jpo(com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().jd()) || com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().cm();
            }
        }, 10);
    }

    public void cm() {
        com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJd = xyk.jd();
        if (jpoVarJd == null || !jpoVarJd.xyk()) {
            return;
        }
        boolean zJpo = jpo(jpoVarJd);
        if (!zJpo) {
            xyk.cm();
        }
        this.my = zJpo;
    }

    public com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jj() {
        return xyk.jd();
    }

    public boolean my() {
        return this.my;
    }

    public void qk() {
        jpo(false);
    }

    public void wqx() {
        yd();
    }

    public void zz() {
        this.f18517jj.set(true);
        this.my = false;
        this.f18516cm.set(false);
    }

    public boolean jpo(com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVar) {
        if (jpoVar == null) {
            return false;
        }
        return jpo(jpoVar.jpo()) || jpo(jpoVar.my()) || jpo(jpoVar.jj());
    }

    @Override // com.bytedance.sdk.component.adexpress.jpo.jd.wqx
    public File jpo() {
        return xyk();
    }

    public void jpo(boolean z10) {
        List<jpo.C0080jpo> listJpo;
        boolean z11;
        if (this.wqx.get()) {
            return;
        }
        try {
            if (this.f18516cm.get()) {
                if (z10) {
                    this.f18518qk.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z12 = true;
            this.f18516cm.set(true);
            com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarMy = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().my();
            com.bytedance.sdk.component.adexpress.jpo.wqx.jpo jpoVarJd = xyk.jd();
            if (jpoVarMy != null && jpoVarMy.xyk()) {
                if (!xyk.jd(jpoVarMy)) {
                    this.f18516cm.set(false);
                    this.xyk.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx() != null) {
                    com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx().wqx().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jpo.jd.my.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.my.my.jpo().jd();
                        }
                    });
                }
                xyk.jpo(jpoVarMy);
                boolean zJpo = (jpoVarMy.my() == null || TextUtils.isEmpty(jpoVarMy.my().jpo())) ? false : jpo(jpoVarMy.my().jpo());
                if (jpoVarMy.jpo().size() != 0) {
                    listJpo = jpo(jpoVarMy, jpoVarJd);
                    z11 = listJpo != null;
                } else {
                    listJpo = null;
                    z11 = zJpo;
                }
                if (!zJpo) {
                    List<jpo.C0080jpo> listJd = jd(jpoVarMy, jpoVarJd);
                    if (listJpo == null || listJd == null) {
                        listJpo = listJd;
                    } else {
                        listJpo.addAll(listJd);
                    }
                    if (listJd == null) {
                        z12 = false;
                    }
                    if (listJd == null) {
                        this.f18516cm.set(false);
                    }
                    z11 = z12;
                }
                if (z11 && jpo(jpoVarMy)) {
                    xyk.jpo(jpoVarMy);
                    xyk.wqx();
                    jd(listJpo);
                }
                cm();
                this.f18516cm.set(false);
                this.xyk.set(System.currentTimeMillis());
                ju();
                return;
            }
            this.f18516cm.set(false);
            jpo(109);
        } catch (Throwable unused) {
        }
    }

    public void jd(boolean z10) {
        this.f18517jj.set(z10);
    }
}
