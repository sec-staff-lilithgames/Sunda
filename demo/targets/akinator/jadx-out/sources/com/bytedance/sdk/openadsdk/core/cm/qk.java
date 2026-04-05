package com.bytedance.sdk.openadsdk.core.cm;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.utils.uu;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends PAGBannerAd {

    /* renamed from: cm, reason: collision with root package name */
    private boolean f20275cm;

    /* renamed from: jd, reason: collision with root package name */
    protected dt f20276jd;

    /* renamed from: jj, reason: collision with root package name */
    private my f20277jj;
    protected Context jpo;

    /* renamed from: ju, reason: collision with root package name */
    private List<com.bytedance.sdk.openadsdk.core.cm.jpo> f20278ju;
    private boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20279qk;
    protected AdSlot wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final AtomicBoolean f20280yd = new AtomicBoolean(false);
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();
    }

    public qk(Context context, dt dtVar, AdSlot adSlot) {
        this.xyk = 0;
        this.zz = 0;
        this.jpo = context;
        this.f20276jd = dtVar;
        this.wqx = adSlot;
        this.xyk = (int) adSlot.getExpressViewAcceptedWidth();
        this.zz = (int) this.wqx.getExpressViewAcceptedHeight();
        jpo(this.f20276jd);
        jd(dtVar);
    }

    private void jd(dt dtVar) {
        com.bytedance.sdk.openadsdk.core.model.jpo jpoVarCm;
        if (dtVar == null || (jpoVarCm = dtVar.cm()) == null) {
            return;
        }
        this.f20278ju = new ArrayList();
        int size = jpoVarCm.cm().size();
        if (!this.f20279qk) {
            this.f20278ju.add(new com.bytedance.sdk.openadsdk.core.cm.jpo(this.jpo, dtVar, this.wqx, this, false));
            return;
        }
        this.f20277jj = new my(jpoVarCm.qk(), this.jpo, this.xyk, this.zz);
        for (int i10 = 0; i10 < size; i10++) {
            this.wqx.setExpressViewAccepted(((this.xyk - va.wqx(this.jpo, jpoVarCm.qk().my())) - va.wqx(this.jpo, jpoVarCm.qk().jj())) - (va.wqx(this.jpo, jpoVarCm.qk().qk()) * 2), this.zz);
            dt dtVar2 = jpoVarCm.cm().get(i10);
            if (i10 != 0) {
                jpo(i10, dtVar2);
            }
            com.bytedance.sdk.openadsdk.core.cm.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.cm.jpo(this.jpo, dtVar2, this.wqx, this, true);
            jpoVar.jpo(i10);
            this.f20278ju.add(jpoVar);
        }
        this.f20277jj.jpo(this.f20278ju);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.cm.jpo> list = this.f20278ju;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.f20279qk) {
                this.f20277jj.jpo();
            } else {
                this.f20278ju.get(0).qk();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.wqx != null ? new PAGBannerSize(this.xyk, this.zz) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.cm.jpo> list = this.f20278ju;
            if (list != null && !list.isEmpty()) {
                return this.f20279qk ? this.f20277jj.jd() : this.f20278ju.get(0).jpo();
            }
        } catch (Throwable unused) {
        }
        return new View(this.jpo);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        dt dtVar = this.f20276jd;
        if (dtVar == null || dtVar.gy() == null) {
            return null;
        }
        try {
            return this.f20276jd.gy().get(str);
        } catch (Throwable th2) {
            nmd.wqx("PAGBannerAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        dt dtVar = this.f20276jd;
        if (dtVar != null) {
            return dtVar.gy();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.my) {
            return;
        }
        uu.jpo(this.f20276jd, d10, str, str2);
        this.my = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.cm.jpo> list = this.f20278ju;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.f20278ju.size(); i10++) {
            this.f20278ju.get(i10).jpo(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.cm.qk.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!qk.this.f20280yd.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.cm.jpo> list = this.f20278ju;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.f20278ju.size(); i10++) {
            this.f20278ju.get(i10).jpo(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.cm.qk.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!qk.this.f20280yd.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.f20275cm) {
            return;
        }
        uu.jpo(this.f20276jd, d10);
        this.f20275cm = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(com.bytedance.sdk.openadsdk.core.model.dt r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L1d
            com.bytedance.sdk.openadsdk.core.model.jpo r2 = r2.cm()
            if (r2 == 0) goto L1d
            boolean r0 = r2.yd()
            if (r0 == 0) goto L1a
            java.util.List r2 = r2.cm()
            int r2 = r2.size()
            r0 = 1
            if (r2 <= r0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            r1.f20279qk = r0
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cm.qk.jpo(com.bytedance.sdk.openadsdk.core.model.dt):void");
    }

    public boolean jpo() {
        return this.f20279qk;
    }

    private void jpo(int i10, dt dtVar) {
        if (i10 != 0) {
            if (!TextUtils.isEmpty(dtVar.vk())) {
                dtVar.oya("0");
            }
            Map<String, Object> mapGy = dtVar.gy();
            if (mapGy == null || !mapGy.containsKey("price")) {
                return;
            }
            mapGy.put("price", "0");
        }
    }
}
