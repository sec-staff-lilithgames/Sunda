package vp;

import em.n0;
import io.bidmachine.AdRequest;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.CustomParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class v extends AdRequest.AdRequestBuilderImpl implements up.i {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f89559a;

    public v() {
        n0 n0Var = new n0(MediaAssetType.values().length);
        n0Var.add(MediaAssetType.Icon);
        n0Var.add(MediaAssetType.Image);
        this.f89559a = n0Var;
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ AdRequest build() {
        return super.build();
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
    public final AdRequestParameters createAdRequestParameters() {
        return new m(this.f89559a);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setBidPayload(String str) {
        return super.setBidPayload(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setCustomParams(CustomParams customParams) {
        return super.setCustomParams(customParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setListener(AdRequest.AdRequestListener adRequestListener) {
        return super.setListener(adRequestListener);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setLoadingTimeOut(Integer num) {
        return super.setLoadingTimeOut(num);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setNetworks(String str) {
        return super.setNetworks(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setPlacementId(String str) {
        return super.setPlacementId(str);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setPriceFloorParams(PriceFloorParams priceFloorParams) {
        return super.setPriceFloorParams(priceFloorParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    @Deprecated
    public /* bridge */ /* synthetic */ up.n setSessionAdParams(SessionAdParams sessionAdParams) {
        return super.setSessionAdParams(sessionAdParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setTargetingParams(TargetingParams targetingParams) {
        return super.setTargetingParams(targetingParams);
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl
    public final AdRequest build(AdRequestParameters adRequestParameters) {
        return new x((m) adRequestParameters);
    }

    @Override // up.i
    public v setMediaAssetTypes(MediaAssetType... mediaAssetTypeArr) {
        if (mediaAssetTypeArr.length > 0) {
            n0 n0Var = this.f89559a;
            n0Var.clear();
            n0Var.addAll(Arrays.asList(mediaAssetTypeArr));
        }
        return this;
    }

    @Override // io.bidmachine.AdRequest.AdRequestBuilderImpl, up.n
    public /* bridge */ /* synthetic */ up.n setNetworks(List list) {
        return super.setNetworks((List<NetworkConfig>) list);
    }
}
