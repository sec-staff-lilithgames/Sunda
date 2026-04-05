package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f26187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f26188b;

    public d(p pVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f26188b = pVar;
        this.f26187a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f26188b.f26209i;
        if (nVar != null) {
            ((q) nVar).a(this.f26187a);
        }
    }
}
