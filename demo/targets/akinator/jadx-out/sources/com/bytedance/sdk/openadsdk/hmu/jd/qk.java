package com.bytedance.sdk.openadsdk.hmu.jd;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.utils.nmd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: jd, reason: collision with root package name */
    private static HandlerThread f21163jd;
    private static jpo jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends Handler {
        public jpo(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            jd jdVar = (jd) message.obj;
            if (jdVar == null) {
                return;
            }
            int iJd = jdVar.jd();
            if (iJd == 1) {
                jdVar.qk();
            } else {
                if (iJd != 2) {
                    my.jd(jdVar.ju());
                    return;
                }
                jdVar.xyk();
            }
            if (jdVar.zz()) {
                my.jd(jdVar.ju());
            } else if (jdVar.mo484if()) {
                jpo(jdVar);
            }
        }

        public void jpo(jd jdVar) {
            if (jdVar == null) {
                return;
            }
            int iIntValue = jdVar.ju().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = jdVar;
            sendMessageDelayed(messageObtain, jdVar.jj());
        }
    }

    public static void jd(jd jdVar) {
        if (jdVar == null || jpo == null) {
            return;
        }
        try {
            int iIntValue = jdVar.ju().intValue();
            if (jpo.hasMessages(iIntValue)) {
                jpo.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    public static void jpo() {
    }

    public static void jpo(jd jdVar) {
        if (jdVar == null) {
            return;
        }
        jd();
        jpo jpoVar = jpo;
        if (jpoVar != null) {
            jpoVar.jpo(jdVar);
        }
    }

    public static void jd() {
        if (jpo != null) {
            return;
        }
        try {
            HandlerThread handlerThread = f21163jd;
            if (handlerThread != null && handlerThread.isAlive()) {
                return;
            }
            synchronized (qk.class) {
                try {
                    HandlerThread handlerThread2 = f21163jd;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        f21163jd = com.bytedance.sdk.component.utils.xyk.jpo("csj_MRC");
                        jpo = new jpo(f21163jd.getLooper());
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            nmd.wqx("MRC", th2.getMessage());
        }
    }
}
