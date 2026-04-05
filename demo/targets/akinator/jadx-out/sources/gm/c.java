package gm;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.AudioManager;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import em.u0;
import em.x;
import hi.r0;
import hi.u;
import hi.z;
import io.odeeo.internal.g.v;
import java.util.Map;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57708c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f57709e;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f57707b = i10;
        this.f57708c = obj;
        this.f57709e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar;
        int i10 = this.f57707b;
        Object obj = this.f57709e;
        Object obj2 = this.f57708c;
        switch (i10) {
            case 0:
                d dVar = (d) obj2;
                LoadAdError loadAdError = (LoadAdError) obj;
                ((u0) dVar.f57711c).onAdLoadFailed(dVar.f57710b, new pr.a(pr.a.f81798p, loadAdError.getCode(), loadAdError.getMessage()));
                break;
            case 1:
                ((e) obj2).f57712a.onPaidEvent(o.b((AdValue) obj));
                break;
            case 2:
                h hVar = (h) obj2;
                AdManagerInterstitialAd adManagerInterstitialAd = (AdManagerInterstitialAd) obj;
                j jVar = hVar.f57716b;
                xVar = adManagerInterstitialAd != null ? new x(o.c(adManagerInterstitialAd, new String[]{"zzc", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), adManagerInterstitialAd.getResponseInfo().toString()) : null;
                jVar.onAdLoaded(xVar);
                ((u0) hVar.f57717c).onAdLoaded(jVar, xVar);
                break;
            case 3:
                h hVar2 = (h) obj2;
                LoadAdError loadAdError2 = (LoadAdError) obj;
                ((u0) hVar2.f57717c).onAdLoadFailed(hVar2.f57716b, new pr.a(pr.a.f81798p, loadAdError2.getCode(), loadAdError2.getMessage()));
                break;
            case 4:
                ((i) obj2).f57718a.onPaidEvent(o.b((AdValue) obj));
                break;
            case 5:
                k kVar = (k) obj2;
                LoadAdError loadAdError3 = (LoadAdError) obj;
                ((u0) kVar.f57721c).onAdLoadFailed(kVar.f57720b, new pr.a(pr.a.f81798p, loadAdError3.getCode(), loadAdError3.getMessage()));
                break;
            case 6:
                k kVar2 = (k) obj2;
                RewardedAd rewardedAd = (RewardedAd) obj;
                n nVar = kVar2.f57720b;
                xVar = rewardedAd != null ? new x(o.c(rewardedAd, new String[]{"zzb", "zza", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), rewardedAd.getResponseInfo().toString()) : null;
                nVar.onAdLoaded(xVar);
                ((u0) kVar2.f57721c).onAdLoaded(nVar, xVar);
                break;
            case 7:
                ((l) obj2).f57722a.onPaidEvent(o.b((AdValue) obj));
                break;
            case 8:
                ha.c cVar = (ha.c) obj2;
                ha.d dVar2 = (ha.d) obj;
                dVar2.setShimmering(true);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(dVar2, "gradientX", 0.0f, dVar2.getWidth());
                cVar.f58715b = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setRepeatCount(-1);
                cVar.f58715b.setDuration(cVar.f58714a);
                cVar.f58715b.setStartDelay(0L);
                cVar.f58715b.addListener(new ha.b(cVar, dVar2));
                cVar.f58715b.start();
                break;
            case 9:
                ((u) obj2).c((String) obj, Boolean.FALSE);
                break;
            case 10:
                z zVar = (z) obj2;
                Throwable th2 = (Throwable) obj;
                u uVar = zVar.f58920h;
                r0 r0Var = zVar.f58915c;
                uVar.j("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(r0Var.getRecordedOnDemandExceptions()));
                zVar.f58920h.j("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(r0Var.getDroppedOnDemandExceptions()));
                u uVar2 = zVar.f58920h;
                Thread threadCurrentThread = Thread.currentThread();
                pi.j jVar2 = uVar2.f58895o;
                if (jVar2 != null) {
                    uVar2.h(jVar2, threadCurrentThread, th2, true);
                    break;
                } else {
                    ei.f.getLogger().w("settingsProvider not set");
                    break;
                }
            case 11:
                ((z) obj2).f58920h.f58884d.setUserId((String) obj);
                break;
            case 12:
                ((z) obj2).f58920h.f58884d.setCustomKeys((Map) obj);
                break;
            case 13:
                hm.c cVar2 = (hm.c) obj2;
                LoadAdError loadAdError4 = (LoadAdError) obj;
                ((u0) cVar2.f59004c).onAdLoadFailed(cVar2.f59003b, new pr.a(pr.a.f81798p, loadAdError4.getCode(), loadAdError4.getMessage()));
                break;
            case 14:
                ((hm.d) obj2).f59005a.onPaidEvent(hm.n.b((AdValue) obj));
                break;
            case 15:
                hm.g gVar = (hm.g) obj2;
                LoadAdError loadAdError5 = (LoadAdError) obj;
                ((u0) gVar.f59010c).onAdLoadFailed(gVar.f59009b, new pr.a(pr.a.f81798p, loadAdError5.getCode(), loadAdError5.getMessage()));
                break;
            case 16:
                hm.g gVar2 = (hm.g) obj2;
                AdManagerInterstitialAd adManagerInterstitialAd2 = (AdManagerInterstitialAd) obj;
                hm.i iVar = gVar2.f59009b;
                xVar = adManagerInterstitialAd2 != null ? new x(hm.n.c(adManagerInterstitialAd2, new String[]{VPCjETNfjxu.QJSEcxRlOqdMV, "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), adManagerInterstitialAd2.getResponseInfo().toString()) : null;
                iVar.onAdLoaded(xVar);
                ((u0) gVar2.f59010c).onAdLoaded(iVar, xVar);
                break;
            case 17:
                ((hm.h) obj2).f59011a.onPaidEvent(hm.n.b((AdValue) obj));
                break;
            case 18:
                hm.j jVar3 = (hm.j) obj2;
                RewardedAd rewardedAd2 = (RewardedAd) obj;
                hm.m mVar = jVar3.f59013b;
                xVar = rewardedAd2 != null ? new x(hm.n.c(rewardedAd2, new String[]{"zzb", "zza", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), rewardedAd2.getResponseInfo().toString()) : null;
                mVar.onAdLoaded(xVar);
                ((u0) jVar3.f59014c).onAdLoaded(mVar, xVar);
                break;
            case 19:
                hm.j jVar4 = (hm.j) obj2;
                LoadAdError loadAdError6 = (LoadAdError) obj;
                ((u0) jVar4.f59014c).onAdLoadFailed(jVar4.f59013b, new pr.a(pr.a.f81798p, loadAdError6.getCode(), loadAdError6.getMessage()));
                break;
            case 20:
                ((hm.k) obj2).f59015a.onPaidEvent(hm.n.b((AdValue) obj));
                break;
            case 21:
                hn.d.f59030a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((io.bidmachine.media3.common.util.j) obj).open();
                break;
            case 22:
                ((io.odeeo.internal.a0.z) obj2).a((v) obj);
                break;
            case 23:
                im.c cVar3 = (im.c) obj2;
                LoadAdError loadAdError7 = (LoadAdError) obj;
                ((u0) cVar3.f59736c).onAdLoadFailed(cVar3.f59735b, new pr.a(pr.a.f81798p, loadAdError7.getCode(), loadAdError7.getMessage()));
                break;
            case 24:
                ((im.d) obj2).f59737a.onPaidEvent(im.o.b((AdValue) obj));
                break;
            case 25:
                im.g gVar3 = (im.g) obj2;
                AdManagerInterstitialAd adManagerInterstitialAd3 = (AdManagerInterstitialAd) obj;
                im.i iVar2 = gVar3.f59741b;
                xVar = adManagerInterstitialAd3 != null ? new x(im.o.c(adManagerInterstitialAd3, new String[]{"zzc", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), adManagerInterstitialAd3.getResponseInfo().toString()) : null;
                iVar2.onAdLoaded(xVar);
                ((u0) gVar3.f59742c).onAdLoaded(iVar2, xVar);
                break;
            case 26:
                im.g gVar4 = (im.g) obj2;
                LoadAdError loadAdError8 = (LoadAdError) obj;
                ((u0) gVar4.f59742c).onAdLoadFailed(gVar4.f59741b, new pr.a(pr.a.f81798p, loadAdError8.getCode(), loadAdError8.getMessage()));
                break;
            case 27:
                ((im.h) obj2).f59743a.onPaidEvent(im.o.b((AdValue) obj));
                break;
            case 28:
                im.j jVar5 = (im.j) obj2;
                LoadAdError loadAdError9 = (LoadAdError) obj;
                ((u0) jVar5.f59746c).onAdLoadFailed(jVar5.f59745b, new pr.a(pr.a.f81798p, loadAdError9.getCode(), loadAdError9.getMessage()));
                break;
            default:
                im.j jVar6 = (im.j) obj2;
                RewardedAd rewardedAd3 = (RewardedAd) obj;
                im.n nVar2 = jVar6.f59745b;
                xVar = rewardedAd3 != null ? new x(im.o.c(rewardedAd3, new String[]{"zzb", "zza", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT}), rewardedAd3.getResponseInfo().toString()) : null;
                nVar2.onAdLoaded(xVar);
                ((u0) jVar6.f59746c).onAdLoaded(nVar2, xVar);
                break;
        }
    }
}
