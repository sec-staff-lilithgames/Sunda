package com.bytedance.sdk.component.xyk.jpo;

import android.os.Handler;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private Handler f19034jd;
    private final cm<jd> jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.xyk.jpo.jpo$jpo, reason: collision with other inner class name */
    public static class C0095jpo {
        private static final jpo jpo = new jpo();
    }

    public Handler jd() {
        if (this.f19034jd == null) {
            synchronized (jpo.class) {
                try {
                    if (this.f19034jd == null) {
                        this.f19034jd = jpo("csj_io_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19034jd;
    }

    private jpo() {
        this.jpo = cm.jpo(2);
    }

    public static jpo jpo() {
        return C0095jpo.jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final Handler handler, final Handler handler2) {
        if (handler.getLooper().getQueue().isIdle()) {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        } else {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.xyk.jpo.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.this.jpo(handler, handler2);
                }
            }, 1000L);
        }
    }

    private jd jd(hx.jpo jpoVar, String str) {
        return new jd(xyk.jpo(str), jpoVar);
    }

    public hx jpo(hx.jpo jpoVar, final String str) {
        jd jdVar = (jd) this.jpo.jpo();
        if (jdVar != null) {
            jdVar.jpo(jpoVar);
            jdVar.post(new Runnable() { // from class: com.bytedance.sdk.component.xyk.jpo.jpo.2
                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setName(str);
                }
            });
            return jdVar;
        }
        return jd(jpoVar, str);
    }

    public hx jpo(String str) {
        return jpo((hx.jpo) null, str);
    }

    public boolean jpo(hx hxVar) {
        if (!(hxVar instanceof jd)) {
            return false;
        }
        jd jdVar = (jd) hxVar;
        if (this.jpo.jpo((cm<jd>) jdVar)) {
            return true;
        }
        jdVar.jd();
        return true;
    }
}
