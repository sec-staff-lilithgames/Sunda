package nj;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final rk.t f77010a;

    public t(rk.t tVar) {
        this.f77010a = tVar;
    }

    public FetchEligibleCampaignsResponse fetchEligibleCampaigns(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest) {
        return ((rk.t) this.f77010a.withDeadlineAfter(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, TimeUnit.MILLISECONDS)).fetchEligibleCampaigns(fetchEligibleCampaignsRequest);
    }
}
