package com.applovin.mediation.adapter;

import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface MaxAdapter {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum InitializationStatus {
        NOT_INITIALIZED(-4),
        DOES_NOT_APPLY(-3),
        INITIALIZING(-2),
        INITIALIZED_UNKNOWN(-1),
        INITIALIZED_FAILURE(0),
        INITIALIZED_SUCCESS(1);

        private final int code;

        InitializationStatus(int i10) {
            this.code = i10;
        }

        public int getCode() {
            return this.code;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface OnCompletionListener {
        void onCompletion(InitializationStatus initializationStatus, String str);
    }

    String getAdapterVersion();

    String getSdkVersion();

    void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, OnCompletionListener onCompletionListener);

    boolean isBeta();

    void onDestroy();

    Boolean shouldCollectSignalsOnUiThread();

    Boolean shouldDestroyOnUiThread();

    Boolean shouldInitializeOnUiThread();

    Boolean shouldLoadAdsOnUiThread(MaxAdFormat maxAdFormat);

    Boolean shouldShowAdsOnUiThread(MaxAdFormat maxAdFormat);
}
