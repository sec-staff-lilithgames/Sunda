package om;

import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ks.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements Runnable, HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback {

    /* renamed from: m, reason: collision with root package name */
    public static final ExecutorService f79551m = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    /* renamed from: b, reason: collision with root package name */
    public final ContextProvider f79552b;

    /* renamed from: c, reason: collision with root package name */
    public final HeaderBiddingAdapter f79553c;

    /* renamed from: e, reason: collision with root package name */
    public final AdsType f79554e;

    /* renamed from: f, reason: collision with root package name */
    public final AdContentType f79555f;

    /* renamed from: g, reason: collision with root package name */
    public final hr.d f79556g;

    /* renamed from: h, reason: collision with root package name */
    public final NetworkAdUnit f79557h;

    /* renamed from: j, reason: collision with root package name */
    public CountDownLatch f79559j;

    /* renamed from: k, reason: collision with root package name */
    public HeaderBiddingPlacement.AdUnit f79560k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f79561l = false;

    /* renamed from: i, reason: collision with root package name */
    public final BidMachineTrackingObject f79558i = new BidMachineTrackingObject();

    public e(ContextProvider contextProvider, HeaderBiddingAdapter headerBiddingAdapter, AdsType adsType, AdContentType adContentType, hr.d dVar, NetworkAdUnit networkAdUnit) {
        this.f79552b = contextProvider;
        this.f79553c = headerBiddingAdapter;
        this.f79554e = adsType;
        this.f79555f = adContentType;
        this.f79556g = dVar;
        this.f79557h = networkAdUnit;
    }

    public final void a(CountDownLatch countDownLatch) {
        this.f79558i.eventStart(TrackEventType.HeaderBiddingNetworkPrepare, new gr.i().withParameter("HB_NETWORK", this.f79553c.getKey()).withParameter("BM_AD_TYPE", this.f79554e.getName()));
        this.f79559j = countDownLatch;
        f79551m.execute(this);
    }

    @Override // io.bidmachine.HeaderBiddingAdRequestParams
    public AdContentType getAdContentType() {
        return this.f79555f;
    }

    @Override // io.bidmachine.HeaderBiddingAdRequestParams
    public AdsType getAdsType() {
        return this.f79554e;
    }

    @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
    public void onCollectFail(pr.a aVar) {
        if (this.f79561l) {
            return;
        }
        HeaderBiddingAdapter headerBiddingAdapter = this.f79553c;
        nm.a.d(headerBiddingAdapter.getKey(), new s(4, this, aVar));
        this.f79561l = true;
        this.f79559j.countDown();
        this.f79558i.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f79554e, new gr.a().setNetworkName(headerBiddingAdapter.getKey()), aVar);
    }

    @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
    public void onCollectFinished(Map<String, String> map) {
        if (this.f79561l) {
            return;
        }
        HeaderBiddingPlacement.AdUnit.Builder builderNewBuilder = HeaderBiddingPlacement.AdUnit.newBuilder();
        HeaderBiddingAdapter headerBiddingAdapter = this.f79553c;
        HeaderBiddingPlacement.AdUnit.Builder bidderSdkver = builderNewBuilder.setBidder(headerBiddingAdapter.getKey()).setBidderSdkver(headerBiddingAdapter.obtainNetworkSdkVersion());
        NetworkAdUnit networkAdUnit = this.f79557h;
        this.f79560k = bidderSdkver.putClientParams(ProtoExtConstants.AD_UNIT_ID, networkAdUnit.getId()).putAllClientParams(networkAdUnit.getMediationConfig()).putAllClientParams(map).build();
        nm.a.d(headerBiddingAdapter.getKey(), new d(this, 1));
        this.f79561l = true;
        this.f79559j.countDown();
        this.f79558i.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.f79554e, new gr.a().setNetworkName(headerBiddingAdapter.getKey()), (pr.a) null);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f79553c.collectHeaderBiddingParams(this.f79552b, this.f79556g, this.f79557h, this, this);
        } catch (Throwable th3) {
            th = th3;
            nm.a.w(th);
            onCollectFail(pr.a.throwable("Exception collecting header bidding parameters", th));
        }
    }
}
