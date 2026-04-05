package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends u {

    /* renamed from: j, reason: collision with root package name */
    public final String f23615j;

    /* renamed from: k, reason: collision with root package name */
    public String f23616k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23617l;

    public p(o oVar) {
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.f23557c.f23954e.f24075f;
        this.f23615j = oVar2 != null ? oVar2.f24126a : null;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.f23627e) || TextUtils.isEmpty(this.f23616k)) {
            return;
        }
        if (this.f23628f || !this.f23630h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.f23553a, Boolean.valueOf(this.f23628f), Boolean.valueOf(this.f23630h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.f23554b;
        return new q(bVar.f23557c.f23954e, (o) bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }
}
