package vp;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsFormat;
import io.bidmachine.MediaAssetType;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m extends AdRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final List f89544a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f89545b;

    public m(List<MediaAssetType> list) {
        super(new AdPlacementConfig.Builder(AdsFormat.Native).build());
        this.f89545b = true;
        this.f89544a = list;
    }

    public boolean containsAssetType(MediaAssetType mediaAssetType) {
        List list = this.f89544a;
        return list.isEmpty() || list.contains(mediaAssetType) || list.contains(MediaAssetType.All);
    }

    public List<MediaAssetType> getMediaAssetTypes() {
        return this.f89544a;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        if (!super.isParametersMatched(adRequestParameters) || !(adRequestParameters instanceof m)) {
            return false;
        }
        List list = ((m) adRequestParameters).f89544a;
        return MediaAssetType.isAll(list) || list.containsAll(this.f89544a);
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return pr.i.isNativePlacement(placement);
    }

    public boolean isValidateAssets() {
        return this.f89545b;
    }
}
