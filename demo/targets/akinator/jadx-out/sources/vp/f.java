package vp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdRequest;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageData;
import io.bidmachine.NetworkAdapter;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends BidMachineAd implements u, n {
    public f(Context context) {
        super(context, AdsType.Native);
    }

    public final boolean b() {
        if (getLoadedAdObject() != null) {
            return true;
        }
        log("not loaded, please load ads first");
        return false;
    }

    @Override // io.bidmachine.BidMachineAd
    public final up.a createAdObject(ContextProvider contextProvider, AdRequest adRequest, NetworkAdapter networkAdapter, up.b bVar, AdProcessCallback adProcessCallback) {
        x xVar = (x) adRequest;
        hr.l lVarCreateNativeAd = networkAdapter.createNativeAd();
        if (lVarCreateNativeAd == null) {
            return null;
        }
        return new l(contextProvider, adProcessCallback, xVar, bVar, lVarCreateNativeAd);
    }

    public u getAdData() {
        return (u) getLoadedAdObject();
    }

    @Override // vp.u
    public String getCallToAction() {
        if (b()) {
            return ((l) getLoadedAdObject()).getCallToAction();
        }
        return null;
    }

    @Override // vp.u
    public String getDescription() {
        if (b()) {
            return ((l) getLoadedAdObject()).getDescription();
        }
        return null;
    }

    @Override // vp.u
    public ImageData getIcon() {
        if (b()) {
            return ((l) getLoadedAdObject()).getIcon();
        }
        return null;
    }

    @Override // vp.u
    public ImageData getMainImage() {
        if (b()) {
            return ((l) getLoadedAdObject()).getMainImage();
        }
        return null;
    }

    @Override // vp.n
    public View getProviderView(Context context) {
        if (b()) {
            return ((l) getLoadedAdObject()).getProviderView(context);
        }
        return null;
    }

    @Override // vp.u
    public float getRating() {
        if (b()) {
            return ((l) getLoadedAdObject()).getRating();
        }
        return -1.0f;
    }

    @Override // vp.u
    public String getTitle() {
        if (b()) {
            return ((l) getLoadedAdObject()).getTitle();
        }
        return null;
    }

    @Override // vp.u
    public boolean hasVideo() {
        return b() && ((l) getLoadedAdObject()).hasVideo();
    }

    @Override // io.bidmachine.BidMachineAd
    public boolean isDuplicateShowDisabled() {
        return false;
    }

    @Override // vp.n
    public boolean isViewRegistered() {
        return b() && ((l) getLoadedAdObject()).isViewRegistered();
    }

    @Override // vp.n
    public void registerView(ViewGroup viewGroup, View view, yp.n nVar, Set<View> set) {
        l lVar = (l) prepareShow();
        if (lVar == null) {
            return;
        }
        lVar.g(viewGroup, view, nVar, set, this.rendererConfiguration);
    }

    @Override // vp.n
    public void unregisterView() {
        if (b()) {
            ((l) getLoadedAdObject()).unregisterView();
        }
    }
}
