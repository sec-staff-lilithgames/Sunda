package com.vungle.ads.internal.omsdk;

import android.webkit.WebView;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.vungle.ads.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OMTracker implements WebViewObserver {
    public static final Companion Companion = new Companion(null);
    private static final long DESTROY_DELAY_MS = TimeUnit.SECONDS.toMillis(1);
    private AdSession adSession;
    private final boolean enabled;
    private boolean started;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final long getDESTROY_DELAY_MS() {
            return OMTracker.DESTROY_DELAY_MS;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDESTROY_DELAY_MS$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Factory {
        public final OMTracker make(boolean z10) {
            return new OMTracker(z10, null);
        }
    }

    public /* synthetic */ OMTracker(boolean z10, u uVar) {
        this(z10);
    }

    @Override // com.vungle.ads.internal.omsdk.WebViewObserver
    public void onPageFinished(WebView webView) {
        e0.checkNotNullParameter(webView, "webView");
        if (this.started && this.adSession == null) {
            CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
            ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
            Owner owner = Owner.JAVASCRIPT;
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME), webView, null, null));
            this.adSession = adSessionCreateAdSession;
            if (adSessionCreateAdSession != null) {
                adSessionCreateAdSession.registerAdView(webView);
            }
            AdSession adSession = this.adSession;
            if (adSession != null) {
                adSession.start();
            }
        }
    }

    public final void start() {
        if (this.enabled && Omid.isActive()) {
            this.started = true;
        }
    }

    public final long stop() {
        long j10;
        AdSession adSession;
        if (!this.started || (adSession = this.adSession) == null) {
            j10 = 0;
        } else {
            if (adSession != null) {
                adSession.finish();
            }
            j10 = DESTROY_DELAY_MS;
        }
        this.started = false;
        this.adSession = null;
        return j10;
    }

    private OMTracker(boolean z10) {
        this.enabled = z10;
    }
}
