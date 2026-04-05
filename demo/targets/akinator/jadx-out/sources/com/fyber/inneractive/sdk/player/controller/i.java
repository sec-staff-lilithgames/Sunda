package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f24420a;

    public i(q qVar) {
        this.f24420a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f24420a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureAvailable", IAlog.a(qVar));
        q.a(this.f24420a, surfaceTexture);
        x xVar = this.f24420a.f24433d;
        if (xVar != null) {
            z zVar = xVar.f24452a;
            zVar.getClass();
            IAlog.a("%s onTextureViewAvailable", IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q qVar = this.f24420a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(qVar));
        this.f24420a.i();
        this.f24420a.a((Surface) null);
        q qVar2 = this.f24420a;
        qVar2.f24444o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f24434e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%sReleasing surface texture", IAlog.a(qVar2));
            this.f24420a.f24440k = null;
            return true;
        }
        IAlog.a("%s caching surface texture", IAlog.a(qVar2));
        q qVar3 = this.f24420a;
        qVar3.f24440k = surfaceTexture;
        qVar3.f24438i.post(new h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f24420a;
        if (qVar.f24434e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar = this.f24420a.f24433d;
        if (xVar != null && (fVar = xVar.f24452a.f24455a) != null && (qVar = fVar.f26160a) != null) {
            qVar.f24438i.post(new n(qVar));
        }
        q qVar2 = this.f24420a;
        if (!qVar2.f24444o || (surface = qVar2.f24441l) == null) {
            return;
        }
        qVar2.a(surface);
        this.f24420a.f24444o = false;
    }
}
