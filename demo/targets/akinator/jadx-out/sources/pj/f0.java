package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f0 {
    public nj.q0 providesProtoStorageClientForCampaign(Application application) {
        return new nj.q0(application, "fiam_eligible_campaigns_cache_file");
    }

    public nj.q0 providesProtoStorageClientForImpressionStore(Application application) {
        return new nj.q0(application, "fiam_impressions_store_file");
    }

    public nj.q0 providesProtoStorageClientForLimiterStore(Application application) {
        return new nj.q0(application, "rate_limit_store_file");
    }
}
