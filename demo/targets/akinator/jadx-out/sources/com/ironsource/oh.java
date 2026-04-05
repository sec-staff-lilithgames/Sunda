package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class oh implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ub f38048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38049c;

    public /* synthetic */ oh(Ub ub2, Object obj, int i10) {
        this.f38047a = i10;
        this.f38048b = ub2;
        this.f38049c = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(f.a aVar) {
        switch (this.f38047a) {
            case 0:
                Ub.a(this.f38048b, (Activity) this.f38049c, aVar);
                break;
            default:
                Ub.a(this.f38048b, (G8) this.f38049c, aVar);
                break;
        }
    }
}
