package com.fyber.inneractive.sdk.player.mediaplayer;

import com.fyber.inneractive.sdk.player.controller.q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f26184c;

    public a(p pVar, int i10, int i11) {
        this.f26184c = pVar;
        this.f26182a = i10;
        this.f26183b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26184c.f26209i != null) {
            Locale locale = Locale.ENGLISH;
            String strA = w0.i.a(this.f26182a, this.f26183b, "Player Error: ", ", ");
            n nVar = this.f26184c.f26209i;
            o oVar = new o(strA);
            q qVar = (q) nVar;
            qVar.a(com.fyber.inneractive.sdk.player.enums.b.Error);
            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(qVar), oVar);
            qVar.f24438i.post(new com.fyber.inneractive.sdk.player.controller.j(qVar, oVar));
            qVar.k();
        }
    }
}
