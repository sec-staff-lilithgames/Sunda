package up;

import io.bidmachine.AdProcessCallback;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a {
    hr.c createUnifiedCallback(AdProcessCallback adProcessCallback);

    Map<String, Object> getCustomParams();

    b getParams();

    void hide();

    void load(ContextProvider contextProvider, hr.d dVar, NetworkAdUnit networkAdUnit) throws Throwable;

    void onClicked();

    void onClosed(boolean z10);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onImpression();

    void onShowFailed();

    void onShown();
}
