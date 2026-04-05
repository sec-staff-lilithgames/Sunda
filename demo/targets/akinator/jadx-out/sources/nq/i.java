package nq;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final yq.a f77189b;

    /* renamed from: c, reason: collision with root package name */
    public j f77190c;

    /* renamed from: e, reason: collision with root package name */
    public MediaPlayer f77191e;

    /* renamed from: f, reason: collision with root package name */
    public Surface f77192f;

    public i(Context context) {
        super(context);
        yq.a aVar = new yq.a(context);
        this.f77189b = aVar;
        aVar.setSurfaceTextureListener(new h(this));
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaPlayerSurface(Surface surface) {
        try {
            MediaPlayer mediaPlayer = this.f77191e;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
            }
        } catch (Throwable unused) {
        }
    }

    public void a() {
        setMediaPlayerSurface(null);
        Surface surface = this.f77192f;
        if (surface != null) {
            surface.release();
        }
        this.f77192f = null;
        this.f77191e = null;
        this.f77189b.setSurfaceTextureListener(null);
    }

    public void setListener(j jVar) {
        this.f77190c = jVar;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this.f77191e = mediaPlayer;
        if (mediaPlayer != null) {
            setVideoAspectRatio(mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight());
            mediaPlayer.setOnVideoSizeChangedListener(new g(this));
        }
    }

    public void setVideoAspectRatio(float f10) {
        this.f77189b.setVideoAspectRatio(f10);
    }
}
