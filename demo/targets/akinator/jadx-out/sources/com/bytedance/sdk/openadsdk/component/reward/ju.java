package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.tic;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju {

    /* renamed from: cm, reason: collision with root package name */
    private long f19988cm;

    /* renamed from: jd, reason: collision with root package name */
    private long f19989jd;

    /* renamed from: jj, reason: collision with root package name */
    private boolean f19990jj;
    private final jpo jpo;
    private boolean my;
    private long wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    public ju(jpo jpoVar) {
        this.my = true;
        this.jpo = jpoVar;
        int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("reward_callback_fallback", 0);
        if (iJpo != 0) {
            this.my = false;
            if (iJpo == 2) {
                this.f19990jj = true;
            }
        }
    }

    public static void jpo(dt dtVar, boolean z10, final int i10) {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, tic.jpo(dtVar), z10 ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.ju.1
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject jpo() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i10);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void cm() {
        if (this.jpo != null) {
            long jElapsedRealtime = (this.f19988cm + (this.wqx > 0 ? SystemClock.elapsedRealtime() - this.wqx : 0L)) / 1000;
            if (this.my) {
                return;
            }
            if (this.f19990jj || jElapsedRealtime >= this.f19989jd) {
                this.jpo.jpo();
            }
        }
    }

    public void jd() {
        if (this.my) {
            return;
        }
        this.wqx = SystemClock.elapsedRealtime();
    }

    public void wqx() {
        this.my = true;
    }

    public void jpo(long j10) {
        if (j10 <= this.f19989jd) {
            return;
        }
        this.f19989jd = j10;
    }

    public void jpo() {
        if (!this.my && this.wqx > 0) {
            this.f19988cm = (SystemClock.elapsedRealtime() - this.wqx) + this.f19988cm;
            this.wqx = 0L;
        }
    }
}
