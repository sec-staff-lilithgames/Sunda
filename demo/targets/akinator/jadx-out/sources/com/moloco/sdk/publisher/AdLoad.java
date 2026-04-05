package com.moloco.sdk.publisher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdLoad {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Listener {
        void onAdLoadFailed(MolocoAdError molocoAdError);

        void onAdLoadSuccess(MolocoAd molocoAd);
    }

    boolean isLoaded();

    void load(String str, Listener listener);
}
