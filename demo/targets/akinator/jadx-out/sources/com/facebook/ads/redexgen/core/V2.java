package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* loaded from: assets/audience_network.dex */
public final class V2 extends Exception {
    public final AdErrorType A00;
    public final String A01;

    public V2(AdErrorType adErrorType, String str) {
        this(adErrorType, str, null);
    }

    public V2(AdErrorType adErrorType, String str, Throwable th2) {
        super(str, th2);
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public final AdErrorType A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }
}
