package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.protobuf.RequestTokenPayload;
import io.bidmachine.protobuf.TokenConfiguration;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final BidMachineTrackingObject f62026a = new BidMachineTrackingObject();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f62027b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f62028c = new ConcurrentHashMap();

    public static void a(HeaderBiddingPlacement.Builder builder, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                builder.addAllAdUnits(((HeaderBiddingPlacement) ((Any) it.next()).unpack(HeaderBiddingPlacement.class)).getAdUnitsList());
            } catch (Throwable unused) {
            }
        }
    }

    public static AdRequest b(AdsFormat adsFormat) {
        switch (s1.f62002a[adsFormat.ordinal()]) {
            case 1:
            case 2:
                return new mm.e().setSize(mm.g.Size_320x50).build();
            case 3:
                return new mm.e().setSize(mm.g.Size_300x250).build();
            case 4:
                return new mm.e().setSize(mm.g.Size_728x90).build();
            case 5:
                return new en.e().setAdContentType(AdContentType.All).build();
            case 6:
                return new en.e().setAdContentType(AdContentType.Static).build();
            case 7:
                return new en.e().setAdContentType(AdContentType.Video).build();
            case 8:
                return ((fr.e) new fr.e().setAdContentType(AdContentType.All)).build();
            case 9:
                return ((fr.e) new fr.e().setAdContentType(AdContentType.Static)).build();
            case 10:
                return ((fr.e) new fr.e().setAdContentType(AdContentType.Video)).build();
            case 11:
                return new vp.v().setMediaAssetTypes(MediaAssetType.All).build();
            default:
                return null;
        }
    }

    public static void c(Context context, RequestTokenPayload.Builder builder, AdsFormat adsFormat) {
        try {
            AdRequest adRequestB = b(adsFormat);
            if (adRequestB == null) {
                return;
            }
            NetworkRegistry.registerAndInitializeCoreNetworks(context);
            ConcurrentHashMap concurrentHashMap = f62027b;
            TokenConfiguration tokenConfigurationBuild = (TokenConfiguration) concurrentHashMap.get(adsFormat);
            if (tokenConfigurationBuild == null) {
                AdsFormat parent = adsFormat.getParent();
                tokenConfigurationBuild = parent == null ? null : (TokenConfiguration) concurrentHashMap.get(parent);
            }
            if (tokenConfigurationBuild == null) {
                tokenConfigurationBuild = TokenConfiguration.newBuilder().setExpirationTime(300).build();
            }
            HeaderBiddingPlacement.Builder builderNewBuilder = HeaderBiddingPlacement.newBuilder();
            for (Message.Builder builder2 : adRequestB.collectPlacementFormats(context, tokenConfigurationBuild.getAdNetworksList(), null)) {
                if (builder2 instanceof Placement.DisplayPlacement.Builder) {
                    a(builderNewBuilder, ((Placement.DisplayPlacement.Builder) builder2).getExtProtoList());
                } else if (builder2 instanceof Placement.VideoPlacement.Builder) {
                    a(builderNewBuilder, ((Placement.VideoPlacement.Builder) builder2).getExtProtoList());
                }
            }
            if (builderNewBuilder.getAdUnitsList().isEmpty()) {
                return;
            }
            BidToken bidToken = new BidToken(adRequestB, tokenConfigurationBuild.getExpirationTime(), new t1());
            f62028c.put(bidToken.getId(), bidToken);
            bidToken.startExpiration();
            builder.getPlacementBuilder().setHbPlacement(builderNewBuilder);
            builder.setTokenHashValue(bidToken.getId());
            nm.a.d("BidTokenManager", new r1(bidToken, 0));
        } catch (Throwable unused) {
            d(builder.getTokenHashValue());
        }
    }

    public static BidToken d(String str) {
        BidToken bidToken = (BidToken) f62028c.remove(str);
        if (bidToken != null) {
            bidToken.stopExpiration();
        }
        return bidToken;
    }

    public static void e(AdsFormat adsFormat, pr.a aVar) {
        f62026a.eventFinish(TrackEventType.GetBidToken, adsFormat != null ? adsFormat.getAdsType() : null, (gr.a) null, aVar);
    }
}
