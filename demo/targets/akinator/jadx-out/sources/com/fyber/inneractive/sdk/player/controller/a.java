package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.view.Surface;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.mediaplayer.p f24388p;

    /* renamed from: q, reason: collision with root package name */
    public int f24389q;

    /* renamed from: r, reason: collision with root package name */
    public final int f24390r;

    /* renamed from: s, reason: collision with root package name */
    public int f24391s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24392t;

    public a(Context context) {
        super(context);
        this.f24389q = 0;
        this.f24390r = 2;
        this.f24391s = 0;
        this.f24392t = false;
        IAlog.a("Creating IAAndroidMediaPlayerController", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            pVar.reset();
            this.f24388p.release();
            this.f24388p = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void b(boolean z10) {
        if (g() && this.f24443n) {
            return;
        }
        this.f24443n = z10;
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            pVar.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int c() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            return pVar.f26218r;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void d(boolean z10) {
        if (g() || !this.f24443n) {
            this.f24443n = z10;
            com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
            if (pVar != null) {
                IAlog.a("%s unmute", pVar.b());
                pVar.f26204d = false;
                if (pVar.a()) {
                    pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.m(pVar));
                } else {
                    IAlog.a("%s unmute called when player is not ready!", pVar.b());
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int e() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            return pVar.f26220t;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int f() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            return pVar.f26219s;
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final boolean g() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            return pVar.f26204d;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void i() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            pVar.pause();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void j() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            pVar.start();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final int b() {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            return pVar.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            IAlog.a("%s seek to called with = %d mPlayAfterSeek = %s", pVar.b(), Integer.valueOf(i10), Boolean.valueOf(z10));
            if (!pVar.a()) {
                IAlog.a("%s seek called when player is not ready!", pVar.b());
                return;
            }
            com.fyber.inneractive.sdk.player.enums.b bVar = pVar.f26202b;
            com.fyber.inneractive.sdk.player.enums.b bVar2 = com.fyber.inneractive.sdk.player.enums.b.Seeking;
            if (bVar == bVar2) {
                IAlog.a("%s seek called when player is already seeking!", pVar.b());
                return;
            }
            pVar.a(bVar2);
            pVar.f26203c = z10;
            pVar.a(new com.fyber.inneractive.sdk.player.mediaplayer.j(pVar, i10));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final String d() {
        return "media";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(Surface surface) {
        com.fyber.inneractive.sdk.player.mediaplayer.p pVar = this.f24388p;
        if (pVar != null) {
            pVar.setSurface(surface);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(boolean z10) {
        if (this.f24388p == null) {
            IAlog.a("MediaPlayerController: creating media player", new Object[0]);
            this.f24388p = new com.fyber.inneractive.sdk.player.mediaplayer.p(this.f24430a, this, this.f24438i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(String str, int i10) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        this.f24388p.a(str);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.q
    public final void a(int i10) {
        this.f24438i.post(new l(this, i10));
        if (i10 >= c()) {
            a(com.fyber.inneractive.sdk.player.enums.b.Completed);
        } else if (i10 == this.f24389q) {
            IAlog.a("%sVideo is stuck! Progress doesn't change", IAlog.a(this));
            int i11 = this.f24391s + 1;
            this.f24391s = i11;
            if (i11 == this.f24390r) {
                a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                this.f24392t = true;
            }
        } else if (this.f24392t) {
            IAlog.a("%sVideo progress was stuck! but now it goes forward. Remove buffering state", IAlog.a(this));
            a(com.fyber.inneractive.sdk.player.enums.b.Playing);
            this.f24391s = 0;
            this.f24392t = false;
        }
        this.f24389q = i10;
    }
}
