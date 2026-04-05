package com.ironsource;

import com.ironsource.mediationsdk.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class ah implements O2, r.b, C {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36008b;

    public /* synthetic */ ah(Object obj, int i10) {
        this.f36007a = i10;
        this.f36008b = obj;
    }

    @Override // com.ironsource.O2
    public M2 a(boolean z10) {
        switch (this.f36007a) {
            case 0:
                return Aa.a((Aa) this.f36008b, z10);
            default:
                return C3505w2.a((C3505w2) this.f36008b, z10);
        }
    }

    @Override // com.ironsource.C
    public AbstractC3553z a(A a10, G g8) {
        switch (this.f36007a) {
            case 2:
                return M2.a((M2) this.f36008b, a10, g8);
            case 3:
                return C3217fc.a((C3217fc) this.f36008b, a10, g8);
            default:
                return C3458t6.a((C3458t6) this.f36008b, a10, g8);
        }
    }

    @Override // com.ironsource.mediationsdk.r.b
    public void a(String str) {
        Ke.a((kotlin.jvm.internal.b1) this.f36008b, str);
    }
}
