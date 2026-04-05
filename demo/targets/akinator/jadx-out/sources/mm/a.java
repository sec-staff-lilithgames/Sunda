package mm;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdRequest;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends ViewAd {
    @Override // io.bidmachine.BidMachineAd
    public final up.a createAdObject(ContextProvider contextProvider, AdRequest adRequest, NetworkAdapter networkAdapter, up.b bVar, AdProcessCallback adProcessCallback) {
        f fVar = (f) adRequest;
        hr.e eVarCreateBanner = networkAdapter.createBanner();
        if (eVarCreateBanner == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, fVar, bVar, eVarCreateBanner);
        g size = fVar.getSize();
        viewAdObject.setWidth(size.f74818b);
        viewAdObject.setHeight(size.f74819c);
        return viewAdObject;
    }
}
