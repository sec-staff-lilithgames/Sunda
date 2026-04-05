package com.facebook.ads.redexgen.core;

import com.facebook.ads.VideoStartReason;

/* loaded from: assets/audience_network.dex */
public /* synthetic */ class XK {
    public static final /* synthetic */ int[] A00 = new int[VideoStartReason.values().length];

    static {
        try {
            A00[VideoStartReason.AUTO_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            A00[VideoStartReason.NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            A00[VideoStartReason.USER_STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
