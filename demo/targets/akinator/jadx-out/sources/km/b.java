package km;

import android.text.TextUtils;
import hr.k;
import hr.l;
import hr.m;
import hr.n;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import vp.t;
import vp.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends l {
    @Override // hr.b
    public void load(ContextProvider contextProvider, m mVar, n nVar, k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        c cVar = new c(kVar);
        if (cVar.isValid(mVar)) {
            vp.m adRequestParameters = ((w) nVar).getAdRequestParameters();
            boolean zIsValidateAssets = adRequestParameters.isValidateAssets();
            String str = cVar.f71591f;
            if (zIsValidateAssets && adRequestParameters.containsAssetType(MediaAssetType.Icon) && TextUtils.isEmpty(str)) {
                mVar.onAdLoadFailed(pr.a.notFound("iconUrl"));
                return;
            }
            boolean zIsValidateAssets2 = adRequestParameters.isValidateAssets();
            String str2 = cVar.f71592g;
            if (zIsValidateAssets2 && adRequestParameters.containsAssetType(MediaAssetType.Image) && TextUtils.isEmpty(str2)) {
                mVar.onAdLoadFailed(pr.a.notFound("imageUrl"));
                return;
            }
            boolean zIsValidateAssets3 = adRequestParameters.isValidateAssets();
            String str3 = cVar.f71593h;
            String str4 = cVar.f71594i;
            if (zIsValidateAssets3 && adRequestParameters.containsAssetType(MediaAssetType.Video) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3)) {
                mVar.onAdLoadFailed(pr.a.notFound("videoAdm or videoUrl"));
                return;
            }
            mVar.setVisibilitySource(nm.m.f77061b);
            t privacySheetData = new a().setTitle(cVar.f71587b).setDescription(cVar.f71588c).setCallToAction(cVar.f71589d).setIcon(new ImageDataImpl(str)).setMainImage(new ImageDataImpl(str2)).setVideoUrl(str3).setVideoAdm(str4).setClickUrl(cVar.f71595j).setNetworkControlLoadingAssets(false).setAdLabelData(cVar.f71596k).setPrivacySheetData(cVar.f71597l);
            Float f10 = cVar.f71590e;
            if (f10 != null) {
                privacySheetData.setRating(f10.floatValue());
            }
            ((vp.k) mVar).onAdLoaded(privacySheetData);
        }
    }
}
