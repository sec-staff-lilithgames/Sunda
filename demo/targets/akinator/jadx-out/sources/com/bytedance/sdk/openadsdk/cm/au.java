package com.bytedance.sdk.openadsdk.cm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au {
    private static volatile au jpo;

    /* renamed from: jd, reason: collision with root package name */
    private HandlerThread f19485jd;

    /* renamed from: jj, reason: collision with root package name */
    private Map<String, Object> f19486jj;
    private final Handler wqx;

    /* renamed from: cm, reason: collision with root package name */
    private final Executor f19484cm = Executors.newCachedThreadPool();
    private jd my = jd.jpo();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd {
        public int jpo = 300;

        /* renamed from: jd, reason: collision with root package name */
        public int f19487jd = 6000;

        private jd() {
        }

        public static jd jpo() {
            return new jd();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements Serializable, Runnable {

        /* renamed from: cm, reason: collision with root package name */
        public String f19488cm;
        public Map<String, Object> my;
        public dt wqx;
        public final AtomicInteger jpo = new AtomicInteger(0);

        /* renamed from: jd, reason: collision with root package name */
        public final AtomicBoolean f19489jd = new AtomicBoolean(false);

        /* renamed from: jj, reason: collision with root package name */
        private final long f19490jj = SystemClock.elapsedRealtime();

        public jpo(dt dtVar, String str, Map<String, Object> map) {
            this.wqx = dtVar;
            this.f19488cm = str;
            this.my = map;
        }

        public static jpo jpo(dt dtVar, String str, Map<String, Object> map) {
            return new jpo(dtVar, str, map);
        }

        public void jd() {
            this.jpo.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wqx == null || TextUtils.isEmpty(this.f19488cm)) {
                return;
            }
            String str = this.f19489jd.get() ? "dpl_success" : "dpl_failed";
            if (this.my == null) {
                this.my = new HashMap();
            }
            dt dtVar = this.wqx;
            if (dtVar != null && dtVar.tda() == 0) {
                Map<String, Object> map = this.my;
                dt dtVar2 = this.wqx;
                map.put("auto_click", Boolean.valueOf((dtVar2 == null || dtVar2.prr()) ? false : true));
            }
            this.my.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.prr.jpo().wqx()));
            this.my.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.f19490jj));
            wqx.jpo(this.wqx, this.f19488cm, str, this.my);
        }

        public jpo jpo(boolean z10) {
            this.f19489jd.set(z10);
            return this;
        }

        public int jpo() {
            return this.jpo.get();
        }
    }

    private au() {
        if (this.f19485jd == null) {
            this.f19485jd = com.bytedance.sdk.component.utils.xyk.jpo("OpenAppSuccEvent_HandlerThread", 10);
        }
        this.wqx = new Handler(this.f19485jd.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.cm.au.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                Object obj = message.obj;
                jpo jpoVar = (obj == null || !(obj instanceof jpo)) ? null : (jpo) obj;
                if (jpoVar == null) {
                    return true;
                }
                au.this.jd(jpoVar);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        boolean zCm = com.bytedance.sdk.openadsdk.core.prr.jpo().cm();
        boolean zJpo = com.bytedance.sdk.openadsdk.core.prr.jpo().jpo(true);
        if (!zCm && zJpo) {
            jpo(jpoVar);
            return;
        }
        if (jpoVar.my == null) {
            jpoVar.my = new HashMap();
        }
        jpoVar.my.put("is_background", Boolean.valueOf(zCm));
        jpoVar.my.put("has_focus", Boolean.valueOf(zJpo));
        wqx(jpoVar.jpo(true));
    }

    private void wqx(jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        this.f19484cm.execute(jpoVar);
    }

    public static au jpo() {
        if (jpo == null) {
            synchronized (au.class) {
                try {
                    if (jpo == null) {
                        jpo = new au();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public au jpo(Map<String, Object> map) {
        this.f19486jj = map;
        return jpo();
    }

    public void jpo(dt dtVar, String str) {
        Message messageObtainMessage = this.wqx.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = jpo.jpo(dtVar, str, this.f19486jj);
        messageObtainMessage.sendToTarget();
    }

    private void jpo(jpo jpoVar) {
        if (jpoVar == null) {
            return;
        }
        jpoVar.jd();
        int iJpo = jpoVar.jpo();
        jd jdVar = this.my;
        if (iJpo * jdVar.jpo > jdVar.f19487jd) {
            wqx(jpoVar.jpo(false));
            return;
        }
        Message messageObtainMessage = this.wqx.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = jpoVar;
        this.wqx.sendMessageDelayed(messageObtainMessage, this.my.jpo);
    }
}
