package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3314l2 implements InterfaceC3332m2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f37151a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3567zd f37152b;

    public C3314l2(String encryptedAuctionResponse, InterfaceC3567zd providerName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(encryptedAuctionResponse, "encryptedAuctionResponse");
        kotlin.jvm.internal.e0.checkNotNullParameter(providerName, "providerName");
        this.f37151a = encryptedAuctionResponse;
        this.f37152b = providerName;
    }

    @Override // com.ironsource.InterfaceC3332m2
    public Object a() {
        Object objM7131constructorimpl;
        String strC = C3390p5.b().c();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "getInstance().mediationKey");
        C3428ra c3428ra = new C3428ra(new J4(this.f37151a, strC));
        try {
            int i10 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(c3428ra.a());
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(objM7131constructorimpl);
        if (thM7134exceptionOrNullimpl == null) {
            return C3278j2.f36968h.a((JSONObject) objM7131constructorimpl, this.f37152b.value());
        }
        C3422r4.d().a(thM7134exceptionOrNullimpl);
        return thM7134exceptionOrNullimpl instanceof IllegalArgumentException ? tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.d()))) : tu.z.m7131constructorimpl(tu.a0.createFailure(new C3213f8(C3559z5.f39348a.h())));
    }
}
