package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z2 extends C3431rd {

    /* renamed from: b, reason: collision with root package name */
    private final C3350n0 f35839b;

    /* renamed from: c, reason: collision with root package name */
    private final ISBannerSize f35840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z2(C3350n0 adTools, ISBannerSize size, String placement) {
        super(placement);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        this.f35839b = adTools;
        this.f35840c = size;
    }

    @Override // com.ironsource.C3431rd, com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mutableMap = uu.p1.toMutableMap(super.a(a02));
        this.f35839b.a(mutableMap, this.f35840c);
        return mutableMap;
    }
}
