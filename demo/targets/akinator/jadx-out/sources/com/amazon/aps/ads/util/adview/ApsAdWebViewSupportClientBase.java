package com.amazon.aps.ads.util.adview;

import android.webkit.WebViewClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ApsAdWebViewSupportClientBase extends WebViewClient {
    private boolean isCrashed;

    public final boolean isCrashed() {
        return this.isCrashed;
    }

    public final void setCrashed(boolean z10) {
        this.isCrashed = z10;
    }
}
