package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3351n1 implements InterfaceC3369o1 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f37919a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.n1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37920a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.f37252c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37920a = iArr;
        }
    }

    public C3351n1(IronSource.a adFormat) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        this.f37919a = adFormat;
    }

    @Override // com.ironsource.InterfaceC3369o1
    public InterfaceC3386p1 a(InterfaceC3295k1 eventBaseData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i10 = a.f37920a[this.f37919a.ordinal()];
        if (i10 == 1) {
            return new E9(eventBaseData);
        }
        if (i10 == 2) {
            return new Yd(eventBaseData);
        }
        if (i10 == 3) {
            return new S2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f37919a);
    }
}
