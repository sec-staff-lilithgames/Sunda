package om;

import android.graphics.Point;
import android.text.TextUtils;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class n extends l implements g {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79573b;

    public n(boolean z10) {
        super(AdContentType.Video);
        this.f79573b = z10;
    }

    @Override // om.l
    public up.b createAdObjectParams(Ad ad2) {
        if (!ad2.hasVideo()) {
            return null;
        }
        c cVarA = a(ad2);
        if (cVarA != null) {
            return cVarA;
        }
        Ad.Video video = ad2.getVideo();
        m mVar = new m(ad2);
        String adm = video.getAdm();
        if (TextUtils.isEmpty(adm)) {
            return mVar;
        }
        mVar.getData().put("creativeAdm", adm);
        return mVar;
    }

    @Override // om.l
    public Message.Builder createPlacement(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
        Point size = getSize(contextProvider, dVar);
        Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.f79573b).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(size.x).setH(size.y).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
        HeaderBiddingPlacement.Builder builderB = b(contextProvider, dVar, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderB != null) {
            linearValue.addExtProto(Any.pack(builderB.build()));
            return linearValue;
        }
        if (adPlacementConfig != null) {
            linearValue.addExtProto(Any.pack(l.c(adPlacementConfig, builderB)));
        }
        return linearValue;
    }

    @Override // om.g
    public Point getSize(ContextProvider contextProvider, hr.d dVar) {
        return nm.j.getScreenSize(contextProvider.getContext());
    }
}
