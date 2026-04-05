package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q implements com.fyber.inneractive.sdk.player.mediaplayer.n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24430a;

    /* renamed from: d, reason: collision with root package name */
    public x f24433d;

    /* renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.c f24435f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24436g;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f24438i;

    /* renamed from: j, reason: collision with root package name */
    public TextureView f24439j;

    /* renamed from: k, reason: collision with root package name */
    public SurfaceTexture f24440k;

    /* renamed from: l, reason: collision with root package name */
    public Surface f24441l;

    /* renamed from: m, reason: collision with root package name */
    public i f24442m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24444o;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.enums.b f24434e = com.fyber.inneractive.sdk.player.enums.b.Idle;

    /* renamed from: n, reason: collision with root package name */
    public boolean f24443n = false;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f24431b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f24432c = new CopyOnWriteArrayList();

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.h f24437h = new com.fyber.inneractive.sdk.player.h(this);

    public q(Context context) {
        this.f24430a = context.getApplicationContext();
        this.f24438i = new Handler(context.getMainLooper());
        a(true);
    }

    public void a() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        k();
        this.f24437h = null;
        com.fyber.inneractive.sdk.util.v.a(this.f24439j);
        this.f24439j = null;
        SurfaceTexture surfaceTexture = this.f24440k;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f24440k = null;
        }
        Surface surface = this.f24441l;
        if (surface != null) {
            surface.release();
            this.f24441l = null;
        }
        this.f24438i.removeCallbacksAndMessages(null);
        this.f24431b.clear();
        this.f24435f = null;
        this.f24436g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void a(int i10, boolean z10);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i10);

    public abstract void a(boolean z10);

    public abstract int b();

    public abstract void b(boolean z10);

    public abstract int c();

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        com.fyber.inneractive.sdk.player.c cVar = this.f24435f;
        if (cVar == null || (fVar = cVar.f24344a.f26164e) == null) {
            return;
        }
        if (z10) {
            if (fVar.f24015c == null || !fVar.f24016d) {
                return;
            }
            IAlog.a("%s mute", "OMVideo");
            try {
                fVar.f24015c.volumeChange(0.0f);
                return;
            } catch (Throwable th2) {
                fVar.a(th2);
                return;
            }
        }
        if (fVar.f24015c == null || !fVar.f24016d) {
            return;
        }
        IAlog.a("%s unMute", "OMVideo");
        try {
            fVar.f24015c.volumeChange(1.0f);
        } catch (Throwable th3) {
            fVar.a(th3);
        }
    }

    public abstract String d();

    public abstract void d(boolean z10);

    public abstract int e();

    public abstract int f();

    public abstract boolean g();

    public boolean h() {
        return this.f24434e == com.fyber.inneractive.sdk.player.enums.b.Playing;
    }

    public abstract void i();

    public abstract void j();

    public final void k() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.h hVar = this.f24437h;
        if (hVar == null || (scheduledThreadPoolExecutor = hVar.f26177b) == null) {
            return;
        }
        scheduledThreadPoolExecutor.shutdownNow();
        hVar.f26177b = null;
    }

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f24439j;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                textureView2.setSurfaceTextureListener(null);
            }
            this.f24439j = textureView;
            if (textureView != null) {
                i iVar = this.f24442m;
                if (iVar == null) {
                    iVar = new i(this);
                    this.f24442m = iVar;
                }
                textureView.setSurfaceTextureListener(iVar);
            }
            if (this.f24440k != null) {
                IAlog.a("%scalling setSurfaceTexture with cached texture", IAlog.a(this));
                if (this.f24439j.getSurfaceTexture() != null && this.f24439j.getSurfaceTexture().equals(this.f24440k)) {
                    IAlog.a("%scalling setSurfaceTexture with cached texture failed", IAlog.a(this));
                } else {
                    IAlog.a("%scalling setSurfaceTexture with cached texture success", IAlog.a(this));
                    this.f24439j.setSurfaceTexture(this.f24440k);
                }
            }
        }
    }

    public static void a(q qVar, SurfaceTexture surfaceTexture) {
        boolean zEquals = surfaceTexture.equals(qVar.f24440k);
        SurfaceTexture surfaceTexture2 = qVar.f24440k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        qVar.f24440k = surfaceTexture;
        Surface surface = qVar.f24441l;
        if (surface == null || !zEquals) {
            if (surface != null) {
                surface.release();
            }
            qVar.f24441l = new Surface(qVar.f24440k);
        }
        qVar.a(qVar.f24441l);
    }

    public void a(int i10) {
        this.f24438i.post(new l(this, i10));
    }

    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.f24434e) {
            return;
        }
        this.f24434e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.h hVar = this.f24437h;
            if (hVar != null && hVar.f26177b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                hVar.f26177b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(hVar.f26178c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            k();
        }
        this.f24438i.post(new m(this, bVar));
    }
}
