package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.core.model.hx;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {

    /* renamed from: cm, reason: collision with root package name */
    private PAGBannerAdLoadListener f21125cm;
    private AdSlot jpo;
    private final Context wqx;
    private com.bytedance.sdk.openadsdk.core.model.dt xyk;
    private final AtomicBoolean my = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private int f21127jj = 5;

    /* renamed from: qk, reason: collision with root package name */
    private final dm f21128qk = dm.wqx();

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.tu f21126jd = com.bytedance.sdk.openadsdk.core.sq.wqx();

    private qk(Context context) {
        if (context != null) {
            this.wqx = context.getApplicationContext();
        } else {
            this.wqx = com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
    }

    public static qk jpo(Context context) {
        return new qk(context);
    }

    public void jpo(AdSlot adSlot, int i10, com.bytedance.sdk.openadsdk.common.jj jjVar) {
        this.f21128qk.my();
        if (this.my.get()) {
            return;
        }
        this.f21127jj = i10;
        this.my.set(true);
        this.jpo = adSlot;
        if (jjVar instanceof PAGBannerAdLoadListener) {
            this.f21125cm = (PAGBannerAdLoadListener) jjVar;
        }
        jpo(adSlot);
    }

    private void jpo(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        hx hxVar = new hx();
        hxVar.zz = 2;
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            this.f21126jd.jpo(adSlot, hxVar, this.f21127jj, (com.bytedance.sdk.openadsdk.core.nmd) new com.bytedance.sdk.openadsdk.core.rq() { // from class: com.bytedance.sdk.openadsdk.core.zz.qk.1
                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    qk.this.jpo(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                    qk.this.jpo(jpoVar, wqxVar, adSlot);
                }
            });
        } else {
            this.f21126jd.jpo(adSlot, hxVar, this.f21127jj, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.core.zz.qk.2
                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    qk.this.jpo(i10, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
                    qk.this.jpo(jpoVar, wqxVar, adSlot);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar, AdSlot adSlot) {
        if (jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.dt dtVarJu = jpoVar.ju();
            this.xyk = dtVarJu;
            jpo(dtVarJu, adSlot);
            if (com.bytedance.sdk.component.utils.prr.cm()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.f21128qk.cm() + "run in  " + Thread.currentThread().getName());
            }
            if (this.my.getAndSet(false)) {
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.qk.3
                    @Override // java.lang.Runnable
                    public void run() {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (qk.this.xyk != null) {
                            qk qkVar = qk.this;
                            qkVar.jpo(qkVar.xyk, jElapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        jpo(-3, com.bytedance.sdk.openadsdk.core.xyk.jpo(-3));
        wqxVar.jpo(-3);
        wqxVar.wqx(8);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.dt dtVar2 : dtVar.dsh()) {
            if (com.bytedance.sdk.openadsdk.core.model.dt.my(dtVar2) && dtVar2.ww() != null && dtVar2.ww().ju() != null) {
                if (com.bytedance.sdk.openadsdk.core.sq.cm().cm(String.valueOf(dtVar2.jl())) && com.bytedance.sdk.openadsdk.core.sq.cm().fy()) {
                    com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = com.bytedance.sdk.openadsdk.core.model.dt.jpo(CacheDirFactory.getICacheDir(dtVar2.ew()).wqx(), dtVar2);
                    jdVarJpo.jpo("material_meta", dtVar2);
                    jdVarJpo.jpo("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, null);
                }
            }
        }
    }

    private PAGBannerAd jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        int width;
        int height;
        PAGBannerSize pAGBannerSizeGcf = dtVar.gcf();
        float fMin = Math.min(this.jpo.getExpressViewAcceptedHeight(), 250.0f);
        if (pAGBannerSizeGcf != null) {
            width = pAGBannerSizeGcf.getWidth();
            height = pAGBannerSizeGcf.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        float expressViewAcceptedWidth = width > 0 ? width : this.jpo.getExpressViewAcceptedWidth();
        if (height > 0) {
            fMin = height;
        }
        this.jpo.setExpressViewAccepted(expressViewAcceptedWidth, fMin);
        return new com.bytedance.sdk.openadsdk.core.cm.qk(this.wqx, dtVar, this.jpo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, long j10) {
        if (this.f21125cm != null) {
            PAGBannerAd pAGBannerAdJpo = jpo(dtVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jCm = this.f21128qk.cm();
            if (!TextUtils.isEmpty(this.jpo.getBidAdm())) {
                com.bytedance.sdk.openadsdk.prr.wqx.jpo(dtVar, jCm);
            }
            this.f21125cm.onAdLoaded(pAGBannerAdJpo);
            jpo(dtVar, jCm, j10, jElapsedRealtime);
        }
    }

    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, final long j10, final long j11, final long j12) {
        try {
            if (!com.bytedance.sdk.openadsdk.core.sq.cm().ic() || !com.bytedance.sdk.openadsdk.rq.jpo.cm() || this.f21127jj != 1 || dtVar == null || dtVar.dsh() == null || dtVar.dsh().isEmpty() || dtVar.cm().jpo() == null) {
                return;
            }
            final JSONObject jSONObjectJpo = dtVar.cm().jpo();
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, jSONObjectJpo.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.zz.qk.4
                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject jd() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, jSONObjectJpo.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                public JSONObject wqx() {
                    try {
                        long jOptLong = jSONObjectJpo.optLong("callback_start", 0L);
                        long j13 = j11;
                        long j14 = j13 - jOptLong;
                        long j15 = j12 - j13;
                        JSONObject jSONObjectOptJSONObject = jSONObjectJpo.optJSONObject("extra_data");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        jSONObjectOptJSONObject.put("thread_dispatch_duration", j14);
                        jSONObjectOptJSONObject.put("build_banner_ad_duration", j15);
                        jSONObjectOptJSONObject.put("ad_load_duration_full", j10);
                        return jSONObjectOptJSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(int i10, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.my.getAndSet(false) || (pAGBannerAdLoadListener = this.f21125cm) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i10, str);
    }
}
