package mm;

import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import java.util.List;
import up.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends AdRequest.AdRequestBuilderImpl implements up.f {

    /* renamed from: a, reason: collision with root package name */
    public g f74813a;

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ AdRequest build() {
        return super.build();
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
    public final AdRequestParameters createAdRequestParameters() {
        g gVar = this.f74813a;
        if (gVar != null) {
            return new b(gVar);
        }
        throw new IllegalArgumentException("BannerSize can't be null");
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setBidPayload(String str) {
        return super.setBidPayload(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setCustomParams(CustomParams customParams) {
        return super.setCustomParams(customParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setListener(AdRequest.AdRequestListener adRequestListener) {
        return super.setListener(adRequestListener);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setLoadingTimeOut(Integer num) {
        return super.setLoadingTimeOut(num);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setNetworks(String str) {
        return super.setNetworks(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setPlacementId(String str) {
        return super.setPlacementId(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setPriceFloorParams(PriceFloorParams priceFloorParams) {
        return super.setPriceFloorParams(priceFloorParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    @Deprecated
    public /* bridge */ /* synthetic */ n setSessionAdParams(SessionAdParams sessionAdParams) {
        return super.setSessionAdParams(sessionAdParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setTargetingParams(TargetingParams targetingParams) {
        return super.setTargetingParams(targetingParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
    public final AdRequest build(AdRequestParameters adRequestParameters) {
        return new f((b) adRequestParameters);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ n setNetworks(List list) {
        return super.setNetworks((List<NetworkConfig>) list);
    }

    @Override // up.f
    public e setSize(g gVar) {
        this.f74813a = gVar;
        return this;
    }
}
