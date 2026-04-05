package com.bytedance.sdk.openadsdk.hmu.jpo;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private final dt f21167jd;
    private int jpo = wqx.f21173jd;
    private final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicBoolean f21166cm = new AtomicBoolean(true);
    private final AtomicInteger my = new AtomicInteger(0);

    /* renamed from: jj, reason: collision with root package name */
    private long f21168jj = 0;

    /* renamed from: qk, reason: collision with root package name */
    private long f21169qk = 0;
    private final Runnable xyk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hmu.jpo.jd.3
        @Override // java.lang.Runnable
        public void run() {
            jd.this.cm();
        }
    };

    public jd(dt dtVar) {
        this.f21167jd = dtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jj() {
        if (this.my.get() != 1 || this.f21168jj == 0) {
            return;
        }
        Handler handlerJpo = jpo.jpo();
        if (handlerJpo != null) {
            handlerJpo.removeCallbacks(this.xyk);
        }
        this.f21169qk = (SystemClock.elapsedRealtime() - this.f21168jj) + this.f21169qk;
        this.f21168jj = 0L;
        this.my.set(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        if (this.wqx.compareAndSet(false, true)) {
            jd();
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.f21168jj) + this.f21169qk;
            this.f21169qk = jElapsedRealtime;
            duq.wqx(new xyk("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.hmu.jpo.jd.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    String strJpo = tic.jpo(jd.this.f21167jd);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", jd.this.f21167jd.eto() * 1000);
                        jSONObject.put("ev_wait_time_client", jElapsedRealtime);
                    } catch (JSONException e10) {
                        nmd.wqx("EvTracker", e10.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.cm.wqx.jd(jd.this.f21167jd, strJpo, jd.this.f21167jd.wq(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void my() {
        if (this.my.get() == 2) {
            this.f21168jj = SystemClock.elapsedRealtime();
            Handler handlerJpo = jpo.jpo();
            if (handlerJpo != null) {
                handlerJpo.postDelayed(this.xyk, this.jpo - this.f21169qk);
            }
            this.my.set(1);
        }
    }

    public void jd() {
        this.my.set(3);
        Handler handlerJpo = jpo.jpo();
        if (handlerJpo != null) {
            handlerJpo.removeCallbacks(this.xyk);
        }
    }

    public void jpo() {
        if (this.my.get() != 0) {
            return;
        }
        this.jpo = this.f21167jd.eto() * 1000;
        this.my.set(1);
        this.f21168jj = SystemClock.elapsedRealtime();
        Handler handlerJpo = jpo.jpo();
        if (handlerJpo != null) {
            handlerJpo.postDelayed(this.xyk, this.jpo);
        }
    }

    public boolean wqx() {
        return this.my.get() == 3;
    }

    public void jpo(final int i10) {
        Handler handlerJpo;
        if (this.my.get() == 3 || (handlerJpo = jpo.jpo()) == null) {
            return;
        }
        handlerJpo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hmu.jpo.jd.2
            @Override // java.lang.Runnable
            public void run() {
                if (i10 == 4 && jd.this.f21166cm.get()) {
                    jd.this.my();
                    return;
                }
                int i11 = i10;
                if (i11 == 8) {
                    jd.this.jj();
                } else if (i11 == 5) {
                    jd.this.cm();
                }
            }
        });
    }

    public void jpo(boolean z10) {
        this.f21166cm.set(z10);
    }
}
