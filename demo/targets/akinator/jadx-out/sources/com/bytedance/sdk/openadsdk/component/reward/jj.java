package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;
import com.bytedance.sdk.openadsdk.utils.uu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jj extends PAGInterstitialAd {

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.jpo f19849jd;
    private final Context jpo;
    private com.bytedance.sdk.openadsdk.jpo.wqx.jd wqx;
    private boolean xyk;
    private boolean zz;
    private final AtomicBoolean my = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    private boolean f19850jj = false;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f19848cm = false;

    /* renamed from: qk, reason: collision with root package name */
    private final String f19851qk = nq.jpo();

    public jj(Context context, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        this.jpo = context;
        this.f19849jd = jpoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f19849jd;
        if (jpoVar == null || jpoVar.jj() == null || this.f19849jd.jj().gy() == null) {
            return null;
        }
        try {
            return this.f19849jd.jj().gy().get(str);
        } catch (Throwable th2) {
            nmd.wqx("TTFullScreenVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f19849jd;
        if (jpoVar == null || jpoVar.jj() == null) {
            return null;
        }
        return this.f19849jd.jj().gy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        uu.jpo(this.f19849jd.jj(), d10, str, str2);
        this.zz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.wqx = new com.bytedance.sdk.openadsdk.component.wqx.jpo(pAGInterstitialAdInteractionCallback);
        jpo(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.wqx = new com.bytedance.sdk.openadsdk.component.wqx.jpo(pAGInterstitialAdInteractionListener);
        jpo(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f19849jd;
        if (jpoVar != null && jpoVar.my()) {
            final dt dtVarJj = this.f19849jd.jj();
            if (!com.bykv.vk.openvk.jpo.jpo.jd.jd.jpo.jpo()) {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
                throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
            }
            List<dt> listCm = this.f19849jd.cm();
            if (listCm != null) {
                Iterator<dt> it = listCm.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.jpo(this.jpo, it.next());
                }
            }
            if (!this.my.get()) {
                this.my.set(true);
                if (dtVarJj == null || (dtVarJj.ww() == null && dtVarJj.fri() == null)) {
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextJpo = activity == null ? this.jpo : activity;
                if (contextJpo == null) {
                    contextJpo = sq.jpo();
                }
                Intent intent = xyk.jpo(this.f19849jd) ? new Intent(contextJpo, (Class<?>) TTAdActivity.class) : jpo(dtVarJj) ? com.bytedance.sdk.openadsdk.component.reward.jd.xyk.jpo(dtVarJj) ? new Intent(contextJpo, (Class<?>) TTInterstitialExpressActivity.class) : new Intent(contextJpo, (Class<?>) TTFullScreenExpressVideoActivity.class) : com.bytedance.sdk.openadsdk.component.reward.jd.xyk.jpo(dtVarJj) ? new Intent(contextJpo, (Class<?>) TTInterstitialActivity.class) : new Intent(contextJpo, (Class<?>) TTFullScreenVideoActivity.class);
                intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(intent, activity, this.f19848cm, this.f19849jd, this.f19851qk);
                intent.putExtra("is_verity_playable", this.f19850jj);
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    pdm.jpo().jpo(this.wqx);
                    this.wqx = null;
                }
                final boolean z10 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("start_activity_async", 0) == 1;
                if (z10) {
                    com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.1
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                            jpoVar2.jd("start_activity");
                            jpoVar2.cm("fullscreen_interstitial_ad");
                            return jpoVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.jd.jpo(contextJpo, intent, new jd.InterfaceC0092jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.2
                    @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
                    public void jpo() {
                        if (jj.this.f19850jj) {
                            try {
                                com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(dtVarJj.ww().m375if());
                            } catch (Throwable unused) {
                            }
                        }
                        if (z10) {
                            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.2.1
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                                    jpoVar2.jd("start_activity");
                                    jpoVar2.cm("fullscreen_interstitial_ad");
                                    return jpoVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.prr.wqx.jpo("start_activity_action", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.2.2
                                @Override // com.bytedance.sdk.openadsdk.prr.jd
                                public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime2);
                                    return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("start_activity_action").jd(jSONObject.toString());
                                }
                            });
                        }
                    }

                    @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
                    public void jpo(Throwable th2) {
                        if (jj.this.f19850jj) {
                            try {
                                com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(dtVarJj.ww().m375if(), -1, th2 != null ? th2.getMessage() : "playable tool error open");
                            } catch (Throwable unused) {
                            }
                        }
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z10) {
                            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.2.3
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                                    jpoVar2.jd("start_activity");
                                    jpoVar2.cm("fullscreen_interstitial_ad");
                                    return jpoVar2;
                                }
                            });
                        }
                    }
                }, true);
                jpo.jpo(this.f19849jd.jj(), this.f19848cm, false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.xyk) {
            return;
        }
        uu.jpo(this.f19849jd.jj(), d10);
        this.xyk = true;
    }

    public void jpo(boolean z10) {
        this.f19850jj = z10;
    }

    public void jpo() {
        if (this.my.get()) {
            return;
        }
        this.f19848cm = true;
    }

    private static boolean jpo(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        return dtVar.jj();
    }

    private void jpo(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            duq.wqx(new com.bytedance.sdk.component.xyk.xyk("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.jj.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo();
                    if (i10 != 1 || jj.this.wqx == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.jd.wqx wqxVar = new com.bytedance.sdk.openadsdk.multipro.aidl.jd.wqx(jj.this.wqx);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(jpoVarJpo.jpo(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(jj.this.f19851qk, wqxVar);
                        } catch (RemoteException e10) {
                            nmd.wqx("TTFullScreenVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }
}
