package u9;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import kotlin.jvm.internal.e0;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final SplashscreenActivity f88174a;

    public l(SplashscreenActivity activity) {
        e0.checkNotNullParameter(activity, "activity");
        this.f88174a = activity;
    }

    public final void onRGPDManaged() {
        SplashscreenActivity splashscreenActivity = this.f88174a;
        AppLovinSdk.getInstance(splashscreenActivity).initialize(AppLovinSdkInitializationConfiguration.builder("A7LysGN4f1ZgA2GlQcspmlFOn5IJqWz_dJxUZJZEK8wUBBEbp4OTqeyalEvTmtTOBTtmoQ-7Zvcl4rKtwkQkNN", splashscreenActivity).setMediationProvider("max").build(), new t(3));
    }
}
