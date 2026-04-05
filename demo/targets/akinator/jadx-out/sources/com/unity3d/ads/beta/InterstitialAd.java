package com.unity3d.ads.beta;

import android.app.Activity;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InterstitialAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final void load(LoadOptions options, LoadListener<InterstitialAd> listener) {
            e0.checkNotNullParameter(options, "options");
            e0.checkNotNullParameter(listener, "listener");
        }

        private Companion() {
        }
    }

    public InterstitialAd(AdObject adObject, LoadOptions loadOptions) {
        e0.checkNotNullParameter(adObject, "adObject");
        e0.checkNotNullParameter(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static final void load(LoadOptions loadOptions, LoadListener<InterstitialAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, ShowListener<InterstitialAd> listener) {
        e0.checkNotNullParameter(activity, "activity");
        e0.checkNotNullParameter(listener, "listener");
    }
}
