package ca;

import android.app.Activity;
import com.digidust.elokence.akinator.factories.AkApplication;
import io.odeeo.sdk.AdPosition;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.common.LogLevel;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static y f12041e;

    /* renamed from: a, reason: collision with root package name */
    public AdUnit f12042a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f12043b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12044c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12045d;

    public static y getInstance(Activity activity) {
        if (f12041e == null) {
            y yVar = new y();
            yVar.f12045d = false;
            f12041e = yVar;
        }
        y yVar2 = f12041e;
        yVar2.f12043b = activity;
        return yVar2;
    }

    public void createAdUnit() {
        if (!OdeeoSDK.isInitialized()) {
            Timber.tag("ODEEO").d("createAdUnit : not initialized", new Object[0]);
            return;
        }
        if (this.f12043b == null || this.f12042a != null) {
            return;
        }
        Timber.tag("ODEEO").d("showAdUnit", new Object[0]);
        this.f12045d = false;
        Timber.tag("ODEEO").d("showAdUnit : creating adUnit", new Object[0]);
        Timber.tag("ODEEO").d("showAdUnit : creating adUnit", new Object[0]);
        AdUnit adUnit = new AdUnit(this.f12043b, AdUnit.PlacementType.AudioIconAd, new x(this), "379285049");
        this.f12042a = adUnit;
        adUnit.setProgressBarColor(String.format("#%06X", 16777215));
        this.f12042a.setIconPosition(AdPosition.IconPosition.TopLeft, 20, 20);
        this.f12042a.setIconSize(150);
        this.f12042a.setCustomTag("customTag");
    }

    public void destroy() {
        Timber.tag("ODEEO").d("DESTROY", new Object[0]);
        AdUnit adUnit = this.f12042a;
        if (adUnit != null) {
            try {
                adUnit.removeAd();
                this.f12042a.release();
            } catch (Exception e10) {
                Timber.tag("ODEEO").e("Exception on destroy : %s", e10);
            }
        }
        this.f12042a = null;
    }

    public void initializeIfNecessary() {
        if (OdeeoSDK.isInitialized()) {
            return;
        }
        OdeeoSDK.setLogLevel(LogLevel.Info);
        OdeeoSDK.setOnInitializationListener(new w());
        try {
            OdeeoSDK.setIsChildDirected(m.sharedInstance().isChildProtectEnabled());
            OdeeoSDK.initialize(AkApplication.getAppContext(), "4078d961-0841-4c10-9a14-8c65b41a441f");
        } catch (Exception e10) {
            Timber.tag("ODEEO").e("Exception on init : %s", e10);
        }
    }

    public void pause() {
        Timber.tag("ODEEO").d("PAUSE", new Object[0]);
        this.f12044c = true;
        OdeeoSDK.onPause();
    }

    public void resume() {
        Timber.tag("ODEEO").d("RESUME", new Object[0]);
        this.f12044c = false;
        OdeeoSDK.onResume();
    }
}
