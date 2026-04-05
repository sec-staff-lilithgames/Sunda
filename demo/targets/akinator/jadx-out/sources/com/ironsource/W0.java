package com.ironsource;

import com.ironsource.Q6;
import com.ironsource.mediationsdk.IronSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f35657a = new W0();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35658a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35658a = iArr;
        }
    }

    private W0() {
    }

    public static final Q6.a a(IronSource.a adUnit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnit, "adUnit");
        int i10 = a.f35658a[adUnit.ordinal()];
        if (i10 == 1) {
            return Q6.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return Q6.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return Q6.a.BANNER;
        }
        if (i10 == 4) {
            return Q6.a.NATIVE_AD;
        }
        throw new tu.t();
    }
}
