package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.d1;
import com.fyber.inneractive.sdk.protobuf.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum r0 implements d1 {
    NOCLICK(0),
    CTABUTTON(1),
    COMPANION(2),
    VIDEOVIEW(3),
    APPINFO(4),
    STOREPROMO(5),
    UNRECOGNIZED(-1);

    public static final int APPINFO_VALUE = 4;
    public static final int COMPANION_VALUE = 2;
    public static final int CTABUTTON_VALUE = 1;
    public static final int NOCLICK_VALUE = 0;
    public static final int STOREPROMO_VALUE = 5;
    public static final int VIDEOVIEW_VALUE = 3;
    private static final e1 internalValueMap = new e1() { // from class: com.fyber.inneractive.sdk.bidder.q0
        @Override // com.fyber.inneractive.sdk.protobuf.e1
        public final d1 a(int i10) {
            if (i10 == 0) {
                return r0.NOCLICK;
            }
            if (i10 == 1) {
                return r0.CTABUTTON;
            }
            if (i10 == 2) {
                return r0.COMPANION;
            }
            if (i10 == 3) {
                return r0.VIDEOVIEW;
            }
            if (i10 == 4) {
                return r0.APPINFO;
            }
            if (i10 != 5) {
                return null;
            }
            return r0.STOREPROMO;
        }
    };
    private final int value;

    r0(int i10) {
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
