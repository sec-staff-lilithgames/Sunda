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
public class b extends l implements g {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f79548b;

    public b(boolean z10) {
        super(AdContentType.Static);
        this.f79548b = z10;
    }

    @Override // om.l
    public up.b createAdObjectParams(Ad ad2) {
        if (!ad2.hasDisplay()) {
            return null;
        }
        c cVarA = a(ad2);
        if (cVarA != null) {
            return cVarA;
        }
        Ad.Display display = ad2.getDisplay();
        if (TextUtils.isEmpty(display.getAdm())) {
            return null;
        }
        a aVar = new a(ad2);
        String adm = display.getAdm();
        if (!TextUtils.isEmpty(adm)) {
            aVar.getData().put("creativeAdm", adm);
        }
        aVar.getData().put("width", Integer.valueOf(display.getW()));
        aVar.getData().put("height", Integer.valueOf(display.getH()));
        return aVar;
    }

    @Override // om.l
    public Message.Builder createPlacement(ContextProvider contextProvider, hr.d dVar, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, AdPlacementConfig adPlacementConfig, int i10) throws Exception {
        Point size = getSize(contextProvider, dVar);
        Placement.DisplayPlacement.Builder h10 = Placement.DisplayPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_MRAID_2_0).addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).setW(size.x).setH(size.y);
        if (this.f79548b) {
            h10.setInstl(true);
            h10.setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN);
        }
        HeaderBiddingPlacement.Builder builderB = b(contextProvider, dVar, adsType, collection, list, i10);
        if (adPlacementConfig == null && builderB != null) {
            h10.addExtProto(Any.pack(builderB.build()));
            return h10;
        }
        if (adPlacementConfig != null) {
            h10.addExtProto(Any.pack(l.c(adPlacementConfig, builderB)));
        }
        return h10;
    }

    public Point getSize(ContextProvider contextProvider, hr.d dVar) {
        return nm.j.getScreenSize(contextProvider.getContext());
    }
}
