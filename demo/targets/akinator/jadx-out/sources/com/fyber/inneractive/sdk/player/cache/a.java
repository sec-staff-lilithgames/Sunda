package com.fyber.inneractive.sdk.player.cache;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f24345a;

    public a(g gVar) {
        this.f24345a = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f24345a) {
            try {
                g gVar = this.f24345a;
                if (gVar.f24366i == null) {
                    return null;
                }
                gVar.d();
                g gVar2 = this.f24345a;
                int i10 = gVar2.f24368k;
                if (i10 >= 2000 && i10 >= gVar2.f24367j.size()) {
                    this.f24345a.c();
                    this.f24345a.f24368k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
