package vm;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import io.bidmachine.iab.vast.activity.VastView;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89310b;

    public f(VastView vastView) {
        this.f89310b = vastView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        VastView vastView = this.f89310b;
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "onSurfaceTextureAvailable", new Object[0]);
        vastView.f60431f = new Surface(surfaceTexture);
        vastView.I = true;
        if (vastView.J) {
            vastView.J = false;
            vastView.startPlayback("onSurfaceTextureAvailable");
        } else if (vastView.isPlaybackStarted()) {
            vastView.f60446p.setSurface(vastView.f60431f);
            vastView.B();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws IllegalStateException {
        VastView vastView = this.f89310b;
        io.bidmachine.iab.vast.e.d(vastView.f60424b, "onSurfaceTextureDestroyed", new Object[0]);
        vastView.f60431f = null;
        vastView.I = false;
        if (vastView.isPlaybackStarted()) {
            vastView.f60446p.setSurface(null);
            vastView.A();
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        io.bidmachine.iab.vast.e.d(this.f89310b.f60424b, "onSurfaceTextureSizeChanged: %d/%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
