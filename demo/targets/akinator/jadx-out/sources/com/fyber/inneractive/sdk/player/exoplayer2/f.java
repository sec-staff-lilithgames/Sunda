package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f25550a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Looper looper) {
        super(looper);
        this.f25550a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        g gVar = this.f25550a;
        gVar.getClass();
        switch (message.what) {
            case 0:
                gVar.f25562l--;
                return;
            case 1:
                gVar.f25560j = message.arg1;
                Iterator it = gVar.f25555e.iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(gVar.f25560j, gVar.f25559i);
                }
                return;
            case 2:
                Iterator it2 = gVar.f25555e.iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).getClass();
                }
                return;
            case 3:
                if (gVar.f25562l == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j) message.obj;
                    gVar.f25558h = true;
                    z zVar = jVar.f25845a;
                    gVar.f25565o = jVar.f25846b;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar = gVar.f25551a;
                    Object obj = jVar.f25847c;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) iVar).getClass();
                    Iterator it3 = gVar.f25555e.iterator();
                    while (it3.hasNext()) {
                        ((b0) it3.next()).getClass();
                    }
                    return;
                }
                return;
            case 4:
                int i10 = gVar.f25561k - 1;
                gVar.f25561k = i10;
                if (i10 == 0) {
                    gVar.f25567q = (i) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = gVar.f25555e.iterator();
                        while (it4.hasNext()) {
                            ((b0) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f25561k == 0) {
                    gVar.f25567q = (i) message.obj;
                    Iterator it5 = gVar.f25555e.iterator();
                    while (it5.hasNext()) {
                        ((b0) it5.next()).getClass();
                    }
                    return;
                }
                return;
            case 6:
                k kVar = (k) message.obj;
                gVar.f25561k -= kVar.f25598d;
                if (gVar.f25562l == 0) {
                    gVar.f25563m = kVar.f25595a;
                    gVar.f25564n = kVar.f25596b;
                    gVar.f25567q = kVar.f25597c;
                    Iterator it6 = gVar.f25555e.iterator();
                    while (it6.hasNext()) {
                        ((b0) it6.next()).getClass();
                    }
                    return;
                }
                return;
            case 7:
                s sVar = (s) message.obj;
                if (gVar.f25566p.equals(sVar)) {
                    return;
                }
                gVar.f25566p = sVar;
                Iterator it7 = gVar.f25555e.iterator();
                while (it7.hasNext()) {
                    ((b0) it7.next()).getClass();
                }
                return;
            case 8:
                d dVar = (d) message.obj;
                Iterator it8 = gVar.f25555e.iterator();
                while (it8.hasNext()) {
                    b0 b0Var = (b0) it8.next();
                    com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) b0Var.f24393a.get();
                    if (fVar != null && (dVar.getCause() instanceof com.fyber.inneractive.sdk.player.exoplayer2.audio.n) && (b0Var.f24394b || (fVar.D && fVar.A))) {
                        fVar.f24411v = true;
                        g gVar2 = fVar.f24408s;
                        if (gVar2 != null) {
                            gVar2.f25554d.d();
                            gVar2.f25553c.removeCallbacksAndMessages(null);
                            fVar.f24408s = null;
                        }
                        fVar.a(false);
                        fVar.a(fVar.C);
                        fVar.f24438i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, false));
                    } else if (fVar == null || !fVar.A || b0Var.f24394b || !com.fyber.inneractive.sdk.player.cache.n.f24382f.f24385c || !com.fyber.inneractive.sdk.util.s.a() || fVar.E >= fVar.f24405p) {
                        com.fyber.inneractive.sdk.player.mediaplayer.o oVar = new com.fyber.inneractive.sdk.player.mediaplayer.o(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
                        IAlog.a("%sonPlayerError called with %s for sendErrorState", b0Var.a(), oVar);
                        com.fyber.inneractive.sdk.player.controller.f fVar2 = (com.fyber.inneractive.sdk.player.controller.f) com.fyber.inneractive.sdk.util.v.a(b0Var.f24393a);
                        if (fVar2 != null) {
                            fVar2.a(com.fyber.inneractive.sdk.player.enums.b.Error);
                            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(fVar2), oVar);
                            fVar2.f24438i.post(new com.fyber.inneractive.sdk.player.controller.j(fVar2, oVar));
                            fVar2.k();
                        }
                    } else {
                        g gVar3 = fVar.f24408s;
                        if (gVar3 != null) {
                            gVar3.f25554d.d();
                            gVar3.f25553c.removeCallbacksAndMessages(null);
                            fVar.f24408s = null;
                        }
                        fVar.a(true);
                        fVar.a(fVar.C);
                        fVar.E++;
                        fVar.f24438i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, true));
                    }
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
