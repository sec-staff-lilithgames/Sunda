package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum c implements d1 {
    OTHER(0),
    HTML(4),
    MRAID(6),
    VAST(8),
    NATIVE(10),
    DV360(15),
    UNRECOGNIZED(-1);

    public static final int DV360_VALUE = 15;
    public static final int HTML_VALUE = 4;
    public static final int MRAID_VALUE = 6;
    public static final int NATIVE_VALUE = 10;
    public static final int OTHER_VALUE = 0;
    public static final int VAST_VALUE = 8;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.b
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i10) {
            if (i10 == 0) {
                return c.OTHER;
            }
            if (i10 == 4) {
                return c.HTML;
            }
            if (i10 == 6) {
                return c.MRAID;
            }
            if (i10 == 8) {
                return c.VAST;
            }
            if (i10 == 10) {
                return c.NATIVE;
            }
            if (i10 != 15) {
                return null;
            }
            return c.DV360;
        }
    };
    private final int value;

    c(int i10) {
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
