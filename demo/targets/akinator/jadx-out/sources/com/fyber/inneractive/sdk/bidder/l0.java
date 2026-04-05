package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum l0 implements d1 {
    UNITDISPLAYTYPEUNKNOWN(0),
    BANNER(1),
    INTERSTITIAL(2),
    REWARDED(3),
    MRECT(4),
    TYPENATIVE(5),
    UNRECOGNIZED(-1);

    public static final int BANNER_VALUE = 1;
    public static final int INTERSTITIAL_VALUE = 2;
    public static final int MRECT_VALUE = 4;
    public static final int REWARDED_VALUE = 3;
    public static final int TYPENATIVE_VALUE = 5;
    public static final int UNITDISPLAYTYPEUNKNOWN_VALUE = 0;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.k0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i10) {
            return l0.a(i10);
        }
    };
    private final int value;

    l0(int i10) {
        this.value = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static l0 a(int i10) {
        if (i10 == 0) {
            return UNITDISPLAYTYPEUNKNOWN;
        }
        if (i10 == 1) {
            return BANNER;
        }
        if (i10 == 2) {
            return INTERSTITIAL;
        }
        if (i10 == 3) {
            return REWARDED;
        }
        if (i10 == 4) {
            return MRECT;
        }
        if (i10 != 5) {
            return null;
        }
        return TYPENATIVE;
    }
}
