package nq;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements lq.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f77188b;

    public h(i iVar) {
        this.f77188b = iVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        Surface surface = new Surface(surfaceTexture);
        i iVar = this.f77188b;
        iVar.f77192f = surface;
        iVar.setMediaPlayerSurface(surface);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        j jVar = this.f77188b.f77190c;
        if (jVar == null) {
            return false;
        }
        ((a) jVar).a();
        return false;
    }

    @Override // lq.e, android.view.TextureView.SurfaceTextureListener
    public /* bridge */ /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
    }

    @Override // lq.e, android.view.TextureView.SurfaceTextureListener
    public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureUpdated(surfaceTexture);
    }
}
