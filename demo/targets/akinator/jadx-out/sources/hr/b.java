package hr;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b {
    public Map<String, Object> getCustomParams() {
        return null;
    }

    public abstract void load(ContextProvider contextProvider, c cVar, d dVar, k kVar, NetworkAdUnit networkAdUnit) throws Throwable;

    public void onClicked() {
    }

    public void onDestroy() {
    }

    public void onExpired() {
    }

    public void onImpression() {
    }

    public void onShowFailed() {
    }

    public void onShown() {
    }
}
