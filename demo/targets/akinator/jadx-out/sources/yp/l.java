package yp;

import io.bidmachine.PositionData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PositionData.values().length];
        try {
            iArr[PositionData.TopLeft.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PositionData.TopRight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PositionData.BottomLeft.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PositionData.BottomRight.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
