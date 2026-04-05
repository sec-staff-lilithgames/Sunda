package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f62075a;

    static {
        int[] iArr = new int[AdsType.values().length];
        f62075a = iArr;
        try {
            iArr[AdsType.Banner.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f62075a[AdsType.Interstitial.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f62075a[AdsType.Rewarded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f62075a[AdsType.Native.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
