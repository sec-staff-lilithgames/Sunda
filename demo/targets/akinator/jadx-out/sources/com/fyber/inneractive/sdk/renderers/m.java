package com.fyber.inneractive.sdk.renderers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements com.fyber.inneractive.sdk.player.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f26590a;

    public m(p pVar) {
        this.f26590a = pVar;
    }

    @Override // com.fyber.inneractive.sdk.player.e
    public final void a() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f26590a.f26570k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
            ((com.fyber.inneractive.sdk.player.controller.s) this.f26590a.f26570k).y();
        }
    }
}
