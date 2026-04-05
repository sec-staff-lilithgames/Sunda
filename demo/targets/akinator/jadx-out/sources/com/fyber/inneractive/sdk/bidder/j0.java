package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum j0 implements d1 {
    UNITCONTENTTYPEUNKNOWN(0),
    DISPLAY(1),
    VIDEO(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 1;
    public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.i0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i10) {
            if (i10 == 0) {
                return j0.UNITCONTENTTYPEUNKNOWN;
            }
            if (i10 == 1) {
                return j0.DISPLAY;
            }
            if (i10 != 2) {
                return null;
            }
            return j0.VIDEO;
        }
    };
    private final int value;

    j0(int i10) {
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
