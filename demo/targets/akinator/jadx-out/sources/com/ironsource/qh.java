package com.ironsource;

import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class qh implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ub f38243b;

    public /* synthetic */ qh(Ub ub2, int i10) {
        this.f38242a = i10;
        this.f38243b = ub2;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        switch (this.f38242a) {
            case 0:
                Ub.a(this.f38243b, aVar);
                break;
            default:
                Ub.b(this.f38243b, aVar);
                break;
        }
    }
}
