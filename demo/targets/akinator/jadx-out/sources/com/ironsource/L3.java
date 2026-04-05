package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L3 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34799a;

        static {
            int[] iArr = new int[Q3.values().length];
            try {
                iArr[Q3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Q3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Q3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34799a = iArr;
        }
    }

    public final int a(Q3 cappingType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(cappingType, "cappingType");
        int i10 = a.f34799a[cappingType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        }
        if (i10 == 3) {
            return 3001;
        }
        throw new tu.t();
    }
}
