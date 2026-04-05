package mm;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsFormat;
import pr.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends AdRequestParameters {

    /* renamed from: a, reason: collision with root package name */
    public final g f74812a;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(g gVar) {
        int iOrdinal = gVar.ordinal();
        super(new AdPlacementConfig.Builder(iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? AdsFormat.Banner : AdsFormat.Banner_728x90 : AdsFormat.Banner_300x250 : AdsFormat.Banner_320x50).build());
        this.f74812a = gVar;
    }

    public g getBannerSize() {
        return this.f74812a;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof b) && this.f74812a == ((b) adRequestParameters).f74812a;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return i.isBannerPlacement(placement, this.f74812a);
    }
}
