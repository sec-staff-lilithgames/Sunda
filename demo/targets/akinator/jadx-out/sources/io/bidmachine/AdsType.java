package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.ApiRequest;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import vp.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum AdsType {
    Banner("banner", new ApiRequest.ApiAuctionDataBinder(), new om.l[]{new y(false)}),
    Interstitial("interstitial", new ApiRequest.ApiAuctionDataBinder(), new om.l[]{new om.b(true), new om.n(true)}),
    Rewarded("rewarded", new ApiRequest.ApiAuctionDataBinder(), new om.l[]{new om.b(true), new om.n(false)}),
    Native("native", new ApiRequest.ApiAuctionDataBinder(), new om.l[]{new om.l() { // from class: om.k

        /* renamed from: b, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79566b;

        /* renamed from: c, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79567c;

        /* renamed from: d, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79568d;

        /* renamed from: e, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79569e;

        /* renamed from: f, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79570f;

        /* renamed from: g, reason: collision with root package name */
        public static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder f79571g;

        static {
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79566b = builderNewBuilder;
            builderNewBuilder.setId(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
            builderNewBuilder.setReq(true);
            builderNewBuilder.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79567c = builderNewBuilder2;
            builderNewBuilder2.setId(127);
            builderNewBuilder2.setReq(true);
            builderNewBuilder2.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79568d = builderNewBuilder3;
            builderNewBuilder3.setId(8);
            builderNewBuilder3.setReq(true);
            builderNewBuilder3.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79569e = builderNewBuilder4;
            builderNewBuilder4.setId(7);
            builderNewBuilder4.setReq(false);
            builderNewBuilder4.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder5 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79570f = builderNewBuilder5;
            builderNewBuilder5.setId(101);
            builderNewBuilder5.setReq(false);
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder6 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            f79571g = builderNewBuilder6;
            builderNewBuilder6.setId(102);
            builderNewBuilder6.setReq(false);
        }

        {
            AdContentType adContentType = AdContentType.All;
        }

        @Override // om.l
        public up.b createAdObjectParams(Ad ad2) {
            c cVarA = a(ad2);
            return (cVarA == null && ad2.hasDisplay() && ad2.getDisplay().hasNative()) ? new j(ad2) : cVarA;
        }

        @Override // om.l
        public /* bridge */ /* synthetic */ Message.Builder createPlacement(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection collection, List list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
            return createPlacement(contextProvider, (hr.n) dVar, adsType, (Collection<NetworkConfig>) collection, (List<NetworkAdUnit>) list, adPlacementConfig, i10);
        }

        public Message.Builder createPlacement(ContextProvider contextProvider, hr.n nVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
            Placement.DisplayPlacement.Builder unit = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS);
            String[] strArr = Constants.IMAGE_MIME_TYPES;
            Placement.DisplayPlacement.Builder builderAddAllMime = unit.addAllMime(Arrays.asList(strArr));
            String[] strArr2 = Constants.VIDEO_MIME_TYPES;
            Placement.DisplayPlacement.Builder builderAddAllMime2 = builderAddAllMime.addAllMime(Arrays.asList(strArr2));
            Placement.DisplayPlacement.NativeFormat.Builder builderNewBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
            builderNewBuilder.addAsset(f79566b);
            builderNewBuilder.addAsset(f79567c);
            builderNewBuilder.addAsset(f79568d);
            builderNewBuilder.addAsset(f79569e);
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder2.setId(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            w wVar = (w) nVar;
            builderNewBuilder2.setReq(wVar.getAdRequestParameters().containsAssetType(MediaAssetType.Icon));
            builderNewBuilder2.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(strArr)).build());
            builderNewBuilder.addAsset(builderNewBuilder2.build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder3.setId(128);
            builderNewBuilder3.setReq(wVar.getAdRequestParameters().containsAssetType(MediaAssetType.Image));
            builderNewBuilder3.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(strArr)).build());
            builderNewBuilder.addAsset(builderNewBuilder3.build());
            Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder builderNewBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
            builderNewBuilder4.setId(4);
            builderNewBuilder4.setReq(wVar.getAdRequestParameters().containsAssetType(MediaAssetType.Video));
            builderNewBuilder4.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(strArr2)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
            builderNewBuilder.addAsset(builderNewBuilder4.build());
            builderNewBuilder.addAsset(f79570f);
            builderNewBuilder.addAsset(f79571g);
            builderAddAllMime2.setNativefmt(builderNewBuilder);
            HeaderBiddingPlacement.Builder builderB = b(contextProvider, nVar, adsType, collection, list, i10);
            if (adPlacementConfig == null && builderB != null) {
                builderAddAllMime2.addExtProto(Any.pack(builderB.build()));
                return builderAddAllMime2;
            }
            if (adPlacementConfig != null) {
                builderAddAllMime2.addExtProto(Any.pack(l.c(adPlacementConfig, builderB)));
            }
            return builderAddAllMime2;
        }
    }});

    private final ApiRequest.ApiAuctionDataBinder binder;
    private final String name;
    private final om.l[] placementBuilders;
    private final Executor placementCreateExecutor = Executors.newFixedThreadPool(Math.max(8, Runtime.getRuntime().availableProcessors() * 4));

    AdsType(String str, ApiRequest.ApiAuctionDataBinder apiAuctionDataBinder, om.l[] lVarArr) {
        this.name = str;
        this.binder = apiAuctionDataBinder;
        this.placementBuilders = lVarArr;
    }

    public void collectPlacements(ContextProvider contextProvider, AdRequest adRequest, hr.d dVar, Collection<NetworkConfig> collection, List<Message.Builder> list, List<NetworkAdUnit> list2, AdPlacementConfig adPlacementConfig, int i10) {
        AdsType adsType = this;
        CountDownLatch countDownLatch = new CountDownLatch(adsType.placementBuilders.length);
        om.l[] lVarArr = adsType.placementBuilders;
        int length = lVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            om.l lVar = lVarArr[i11];
            if (adRequest.isPlacementBuilderMatch(lVar)) {
                adsType.placementCreateExecutor.execute(new z(adsType, lVar, contextProvider, dVar, collection, list2, adPlacementConfig, i10, list, countDownLatch));
            } else {
                countDownLatch.countDown();
            }
            i11++;
            adsType = this;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            nm.a.w(e10);
        }
    }

    public up.b createAdObjectParams(Ad ad2) {
        for (om.l lVar : this.placementBuilders) {
            up.b bVarCreateAdObjectParams = lVar.createAdObjectParams(ad2);
            if (bVarCreateAdObjectParams != null) {
                return bVarCreateAdObjectParams;
            }
        }
        return null;
    }

    public NetworkAdapter findNetworkAdapter(Ad ad2) {
        HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = obtainHeaderBiddingAd(ad2);
        NetworkAdapter adapter = headerBiddingAdObtainHeaderBiddingAd != null ? NetworkRegistry.getAdapter(headerBiddingAdObtainHeaderBiddingAd.getBidder()) : null;
        if (adapter == null) {
            if (this == Native) {
                return NetworkRegistry.getAdapter("nast");
            }
            if (ad2.hasDisplay()) {
                return NetworkRegistry.getAdapter(CampaignEx.JSON_KEY_MRAID);
            }
            if (ad2.hasVideo()) {
                return NetworkRegistry.getAdapter("vast");
            }
        }
        return adapter;
    }

    public ApiRequest.ApiAuctionDataBinder getBinder() {
        return this.binder;
    }

    public String getName() {
        return this.name;
    }

    public boolean isFullscreen() {
        return this == Interstitial || this == Rewarded;
    }

    public HeaderBiddingAd obtainHeaderBiddingAd(Ad ad2) {
        for (om.l lVar : this.placementBuilders) {
            HeaderBiddingAd headerBiddingAdObtainHeaderBiddingAd = lVar.obtainHeaderBiddingAd(ad2);
            if (headerBiddingAdObtainHeaderBiddingAd != null) {
                return headerBiddingAdObtainHeaderBiddingAd;
            }
        }
        return null;
    }
}
