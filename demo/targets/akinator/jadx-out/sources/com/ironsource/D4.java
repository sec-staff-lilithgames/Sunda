package com.ironsource;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class D4 implements A7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33964a;

        static {
            int[] iArr = new int[EnumC3558z4.values().length];
            try {
                iArr[EnumC3558z4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3558z4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3558z4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3558z4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33964a = iArr;
        }
    }

    @Override // com.ironsource.A7
    public F4 a(Context context, EnumC3558z4 source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        int i10 = a.f33964a[source.ordinal()];
        if (i10 == 1) {
            return new C4(context, "supersonic_shared_preferen");
        }
        if (i10 == 2) {
            return new C4(context, "unityads-installinfo");
        }
        if (i10 == 3) {
            return new C4(context, E4.f34248c);
        }
        if (i10 == 4) {
            return null;
        }
        throw new tu.t();
    }
}
