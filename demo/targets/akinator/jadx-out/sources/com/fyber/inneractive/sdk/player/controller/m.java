package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f24427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f24428b;

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f24428b = qVar;
        this.f24427a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        com.fyber.inneractive.sdk.player.enums.b bVar;
        try {
            try {
                Iterator it = this.f24428b.f24431b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f24427a);
                }
                bVar = this.f24427a;
            } catch (Exception e10) {
                if (IAlog.f26748a <= 3) {
                    q qVar2 = this.f24428b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e10, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f24427a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f24428b.f24439j);
                qVar = this.f24428b;
                qVar.f24439j = null;
            }
            if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f24428b.f24439j);
                qVar = this.f24428b;
                qVar.f24439j = null;
                qVar.f24440k = null;
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f24427a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f24428b.f24439j);
                q qVar3 = this.f24428b;
                qVar3.f24439j = null;
                qVar3.f24440k = null;
            }
            throw th2;
        }
    }
}
