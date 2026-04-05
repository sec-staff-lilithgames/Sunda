package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum n0 implements d1 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNRECOGNIZED(-1);

    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int OTHER_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.m0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i10) {
            if (i10 == 0) {
                return n0.UNKNOWN;
            }
            if (i10 == 1) {
                return n0.MALE;
            }
            if (i10 == 2) {
                return n0.FEMALE;
            }
            if (i10 != 3) {
                return null;
            }
            return n0.OTHER;
        }
    };
    private final int value;

    n0(int i10) {
        this.value = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d1
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
