package com.bytedance.sdk.openadsdk.cm.jpo;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.inmobi.commons.core.configs.CrashConfig;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju implements com.bytedance.sdk.component.jj.jpo.my {
    private final String jpo = "[7605]";

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public void au() {
        jpo.jpo(jpo.f19554jj);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public Executor cm() {
        return duq.cm();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean hna() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("batch_log_config", a.f37604j, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    /* renamed from: if */
    public com.bytedance.sdk.component.jj.jpo.qk mo416if() {
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean jd() {
        return false;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public int jj() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public com.bytedance.sdk.component.jj.jpo.cm.jpo jpo(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public com.bytedance.sdk.component.jj.jpo.jj ju() {
        com.bytedance.sdk.component.jj.jpo.jj jjVarJpo;
        synchronized (this) {
            jjVarJpo = com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo());
        }
        return jjVarJpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public Executor my() {
        return duq.xyk();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public int opi() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("batch_log_config", "once_max", 10);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean oya() {
        return BinderPoolService.jpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public long prr() {
        long jJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("log_queue_timeout", 40000);
        if (jJpo < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL || jJpo > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return jJpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean qk() {
        return false;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean sq() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean wqx() {
        return true;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean xyk() {
        return true;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public com.bytedance.sdk.component.jj.jpo.my.wqx yd() {
        return new qk();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public String zz() {
        return tic.cm();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public String jd(String str) {
        return com.bytedance.sdk.component.cm.jpo.jpo(str, com.bytedance.sdk.openadsdk.core.jpo.jpo());
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean jpo() {
        return false;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public int wqx(String str) {
        oya oyaVarVk = com.bytedance.sdk.openadsdk.core.settings.au.jrx().vk();
        if (oyaVarVk == null) {
            return 3;
        }
        return oyaVarVk.jpo(str);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public boolean jpo(Context context) {
        return opi.jpo(context);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public String jpo(String str) {
        return com.bytedance.sdk.component.cm.jpo.jd(str, com.bytedance.sdk.openadsdk.core.jpo.jpo());
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public void jpo(boolean z10, int i10, long j10, com.bytedance.sdk.component.jj.jpo.jj.cm cmVar) {
        Runnable runnableJpo;
        if (cmVar == null) {
            return;
        }
        jpo.jpo(jpo.wqx, z10, i10, j10);
        if (z10) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("track_link_result", false, (com.bytedance.sdk.openadsdk.prr.jd) new au(true, cmVar));
            return;
        }
        oya oyaVarVk = com.bytedance.sdk.openadsdk.core.settings.au.jrx().vk();
        if (oyaVarVk == null || cmVar.cm() >= oyaVarVk.jpo(cmVar.jj())) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo("track_link_result", false, (com.bytedance.sdk.openadsdk.prr.jd) new au(false, cmVar));
        } else {
            if (!oyaVarVk.jpo() || (runnableJpo = cmVar.jpo(Cif.jpo(sq.jpo()), null)) == null) {
                return;
            }
            duq.jpo().schedule(runnableJpo, oyaVarVk.jd(cmVar.jj()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public void jpo(boolean z10) {
        jpo.jpo(jpo.f19554jj, z10);
    }

    @Override // com.bytedance.sdk.component.jj.jpo.my
    public HandlerThread jpo(String str, int i10) {
        return com.bytedance.sdk.component.utils.xyk.jpo(str, i10);
    }
}
