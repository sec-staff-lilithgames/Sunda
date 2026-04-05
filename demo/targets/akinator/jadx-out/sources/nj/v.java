package nj;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.developers.mobile.targeting.proto.ClientSignalsProto$ClientSignals;
import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.ClientAppInfo;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import nh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class v implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77017c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f77018e;

    public /* synthetic */ v(int i10, Object obj, Object obj2) {
        this.f77016b = i10;
        this.f77017c = obj;
        this.f77018e = obj2;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        String str;
        switch (this.f77016b) {
            case 0:
                final z zVar = (z) this.f77017c;
                final CampaignImpressionList campaignImpressionList = (CampaignImpressionList) CampaignImpressionList.newBuilder((CampaignImpressionList) obj).addAlreadySeenCampaigns((CampaignImpression) this.f77018e).build();
                final int i10 = 1;
                return zVar.f77027a.write(campaignImpressionList).doOnComplete(new st.a() { // from class: nj.y
                    @Override // st.a
                    public final void run() {
                        switch (i10) {
                            case 0:
                                zVar.f77028b = mt.s.just(campaignImpressionList);
                                break;
                            default:
                                zVar.f77028b = mt.s.just(campaignImpressionList);
                                break;
                        }
                    }
                });
            case 1:
                final z zVar2 = (z) this.f77017c;
                HashSet hashSet = (HashSet) this.f77018e;
                CampaignImpressionList campaignImpressionList2 = (CampaignImpressionList) obj;
                j0.logd("Existing impressions: " + campaignImpressionList2.toString());
                rk.d dVarNewBuilder = CampaignImpressionList.newBuilder();
                for (CampaignImpression campaignImpression : campaignImpressionList2.getAlreadySeenCampaignsList()) {
                    if (!hashSet.contains(campaignImpression.getCampaignId())) {
                        dVarNewBuilder.addAlreadySeenCampaigns(campaignImpression);
                    }
                }
                final CampaignImpressionList campaignImpressionList3 = (CampaignImpressionList) dVarNewBuilder.build();
                j0.logd("New cleared impression list: " + campaignImpressionList3.toString());
                final int i11 = 0;
                return zVar2.f77027a.write(campaignImpressionList3).doOnComplete(new st.a() { // from class: nj.y
                    @Override // st.a
                    public final void run() {
                        switch (i11) {
                            case 0:
                                zVar2.f77028b = mt.s.just(campaignImpressionList3);
                                break;
                            default:
                                zVar2.f77028b = mt.s.just(campaignImpressionList3);
                                break;
                        }
                    }
                });
            case 2:
                g0 g0Var = (g0) this.f77017c;
                mt.s sVar = (mt.s) this.f77018e;
                CampaignImpressionList campaignImpressionList4 = (CampaignImpressionList) obj;
                if (!g0Var.f76913n.isAutomaticDataCollectionEnabled()) {
                    j0.logi("Automatic data collection is disabled, not attempting campaign fetch from service.");
                    return mt.s.just((FetchEligibleCampaignsResponse) FetchEligibleCampaignsResponse.newBuilder().setExpirationEpochTimestampMillis(1L).build());
                }
                mt.s sVarDoOnSuccess = sVar.filter(new n1(5)).map(new v(3, g0Var, campaignImpressionList4)).switchIfEmpty(mt.s.just((FetchEligibleCampaignsResponse) FetchEligibleCampaignsResponse.newBuilder().setExpirationEpochTimestampMillis(1L).build())).doOnSuccess(new ca.b(5)).doOnSuccess(new b0(g0Var, 0));
                c cVar = g0Var.f76909j;
                Objects.requireNonNull(cVar);
                mt.s sVarDoOnSuccess2 = sVarDoOnSuccess.doOnSuccess(new bj.v0(cVar, 2));
                j1 j1Var = g0Var.f76910k;
                Objects.requireNonNull(j1Var);
                return sVarDoOnSuccess2.doOnSuccess(new bj.v0(j1Var, 3)).doOnError(new ca.b(6)).onErrorResumeNext(mt.s.empty());
            case 3:
                g0 g0Var2 = (g0) this.f77017c;
                CampaignImpressionList campaignImpressionList5 = (CampaignImpressionList) this.f77018e;
                i0 i0Var = (i0) obj;
                d dVar = g0Var2.f76904e;
                dVar.getClass();
                j0.logi("Fetching campaigns from service.");
                dVar.f76875e.install();
                t tVar = (t) dVar.f76871a.get();
                rk.k kVarNewBuilder = FetchEligibleCampaignsRequest.newBuilder();
                com.google.firebase.g gVar = dVar.f76872b;
                rk.k kVarAddAllAlreadySeenCampaigns = kVarNewBuilder.setProjectNumber(gVar.getOptions().getGcmSenderId()).addAllAlreadySeenCampaigns(campaignImpressionList5.getAlreadySeenCampaignsList());
                uh.d timeZone = ClientSignalsProto$ClientSignals.newBuilder().setPlatformVersion(String.valueOf(Build.VERSION.SDK_INT)).setLanguageCode(Locale.getDefault().toString()).setTimeZone(TimeZone.getDefault().getID());
                Application application = dVar.f76873c;
                try {
                    str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e10) {
                    j0.loge("Error finding versionName : " + e10.getMessage());
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    timeZone.setAppVersion(str);
                }
                FetchEligibleCampaignsResponse fetchEligibleCampaignsResponseFetchEligibleCampaigns = tVar.fetchEligibleCampaigns((FetchEligibleCampaignsRequest) kVarAddAllAlreadySeenCampaigns.setClientSignals((ClientSignalsProto$ClientSignals) timeZone.build()).setRequestingClientApp((ClientAppInfo) ClientAppInfo.newBuilder().setGmpAppId(gVar.getOptions().getApplicationId()).setAppInstanceId(i0Var.a()).setAppInstanceIdToken(i0Var.b().getToken()).build()).build());
                long expirationEpochTimestampMillis = fetchEligibleCampaignsResponseFetchEligibleCampaigns.getExpirationEpochTimestampMillis();
                qj.a aVar = dVar.f76874d;
                if (expirationEpochTimestampMillis >= TimeUnit.MINUTES.toMillis(1L) + aVar.now()) {
                    if (fetchEligibleCampaignsResponseFetchEligibleCampaigns.getExpirationEpochTimestampMillis() <= TimeUnit.DAYS.toMillis(3L) + aVar.now()) {
                        return fetchEligibleCampaignsResponseFetchEligibleCampaigns;
                    }
                }
                return (FetchEligibleCampaignsResponse) fetchEligibleCampaignsResponseFetchEligibleCampaigns.toBuilder().setExpirationEpochTimestampMillis(TimeUnit.DAYS.toMillis(1L) + aVar.now()).build();
            default:
                RateLimitProto$Counter rateLimitProto$Counter = (RateLimitProto$Counter) obj;
                return (RateLimitProto$RateLimit) RateLimitProto$RateLimit.newBuilder((RateLimitProto$RateLimit) this.f77017c).putLimits(((rj.v) this.f77018e).limiterKey(), (RateLimitProto$Counter) RateLimitProto$Counter.newBuilder(rateLimitProto$Counter).clearValue().setValue(rateLimitProto$Counter.getValue() + 1).build()).build();
        }
    }
}
