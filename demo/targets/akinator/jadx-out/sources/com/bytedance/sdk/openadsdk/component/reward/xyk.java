package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class xyk extends PAGRewardedAd {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.my.jpo f20068cm;

    /* renamed from: jd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.jpo f20069jd;
    private final Context jpo;
    private boolean my;
    private final AdSlot wqx;
    private boolean xyk;
    private boolean zz;

    /* renamed from: jj, reason: collision with root package name */
    private final AtomicBoolean f20070jj = new AtomicBoolean(false);

    /* renamed from: qk, reason: collision with root package name */
    private final String f20071qk = nq.jpo();

    public xyk(Context context, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, AdSlot adSlot) {
        this.jpo = context;
        this.f20069jd = jpoVar;
        this.wqx = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f20069jd;
        if (jpoVar == null || jpoVar.jj() == null || this.f20069jd.jj().gy() == null) {
            return null;
        }
        try {
            return this.f20069jd.jj().gy().get(str);
        } catch (Throwable th2) {
            nmd.wqx("TTRewardVideoAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f20069jd;
        if (jpoVar == null || jpoVar.jj() == null) {
            return null;
        }
        return this.f20069jd.jj().gy();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.zz) {
            return;
        }
        uu.jpo(this.f20069jd.jj(), d10, str, str2);
        this.zz = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.f20068cm = new zz(pAGRewardedAdInteractionCallback);
        jpo(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.f20068cm = new zz(pAGRewardedAdInteractionListener);
        jpo(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVar = this.f20069jd;
        if (jpoVar != null && jpoVar.my()) {
            final dt dtVarJj = this.f20069jd.jj();
            if (!com.bykv.vk.openvk.jpo.jpo.jd.jd.jpo.jpo()) {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
                throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
            }
            List<dt> listCm = this.f20069jd.cm();
            if (listCm != null) {
                Iterator<dt> it = listCm.iterator();
                while (it.hasNext()) {
                    IPMiBroadcastReceiver.jpo(this.jpo, it.next());
                }
            }
            if (this.f20070jj.compareAndSet(false, true)) {
                if (dtVarJj == null || dtVarJj.ww() == null) {
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "materialMeta error ");
                    return;
                }
                Context contextJpo = activity == null ? this.jpo : activity;
                if (contextJpo == null) {
                    contextJpo = sq.jpo();
                }
                Intent intent = jpo(this.f20069jd) ? new Intent(contextJpo, (Class<?>) TTAdActivity.class) : jpo(dtVarJj) ? new Intent(contextJpo, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(contextJpo, (Class<?>) TTRewardVideoActivity.class);
                com.bytedance.sdk.openadsdk.component.reward.jpo.jd.jpo(intent, activity, this.my, this.f20069jd, this.f20071qk);
                intent.putExtra("media_extra", this.wqx.getMediaExtra());
                intent.putExtra("user_id", this.wqx.getUserID());
                intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    pdm.jpo().jpo(this.f20068cm);
                    this.f20068cm = null;
                }
                final boolean z10 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("start_activity_async", 0) == 1;
                if (z10) {
                    com.bytedance.sdk.openadsdk.sq.wqx.jpo(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.1
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                            jpoVar2.jd("start_activity");
                            jpoVar2.cm("rewarded_video");
                            return jpoVar2;
                        }
                    });
                }
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.component.utils.jd.jpo(contextJpo, intent, new jd.InterfaceC0092jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.2
                    @Override // com.bytedance.sdk.component.utils.jd.InterfaceC0092jd
                    public void jpo() {
                        if (z10) {
                            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.2.1
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                                    jpoVar2.jd("start_activity");
                                    jpoVar2.cm("rewarded_video");
                                    return jpoVar2;
                                }
                            });
                            final long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            com.bytedance.sdk.openadsdk.prr.wqx.jpo("start_activity_action", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.2.2
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
                        com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVarJj, "fullscreen_interstitial_ad", "activity start  fail ");
                        if (z10) {
                            com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.2.3
                                @Override // com.bytedance.sdk.openadsdk.sq.cm
                                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                                    jpoVar2.jd("start_activity");
                                    jpoVar2.cm("rewarded_video");
                                    return jpoVar2;
                                }
                            });
                        }
                    }
                }, true);
                jpo.jpo(this.f20069jd.jj(), this.my, true);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.xyk) {
            return;
        }
        uu.jpo(this.f20069jd.jj(), d10);
        this.xyk = true;
    }

    public void jpo() {
        if (this.f20070jj.get()) {
            return;
        }
        this.my = true;
    }

    private static boolean jpo(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        return dtVar.jj();
    }

    private void jpo(final int i10) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            duq.wqx(new com.bytedance.sdk.component.xyk.xyk("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.xyk.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo jpoVarJpo = com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo();
                    if (i10 != 0 || xyk.this.f20068cm == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm cmVar = new com.bytedance.sdk.openadsdk.multipro.aidl.jd.cm(xyk.this.f20068cm);
                    IListenerManager iListenerManagerAsInterface = IListenerManager.Stub.asInterface(jpoVarJpo.jpo(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(xyk.this.f20071qk, cmVar);
                        } catch (RemoteException e10) {
                            nmd.wqx("TTRewardVideoAdImpl", e10.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static boolean jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        dt dtVarJj;
        String strJpo;
        if (jpoVar == null || (dtVarJj = jpoVar.jj()) == null || com.bytedance.sdk.openadsdk.core.model.nmd.wqx(dtVarJj)) {
            return false;
        }
        if (dtVarJj.va()) {
            return true;
        }
        try {
            strJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("rviv_new_arch", (String) null);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(strJpo)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(strJpo);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = jSONArray.getInt(i10);
            if (dt.jkt(dtVarJj.jkt())) {
                if (dtVarJj.va() && dtVarJj.jkt() == i11) {
                    return true;
                }
            } else if (dtVarJj.jkt() == i11) {
                return true;
            }
        }
        return false;
    }
}
