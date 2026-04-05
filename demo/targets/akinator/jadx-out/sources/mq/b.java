package mq;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.ui.c0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b extends lq.a {

    /* renamed from: n, reason: collision with root package name */
    public final ExoPlayer f74905n;

    /* renamed from: o, reason: collision with root package name */
    public final c0 f74906o;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        ExoPlayer exoPlayerBuild = new ExoPlayer.a(context).build();
        this.f74905n = exoPlayerBuild;
        exoPlayerBuild.addListener(new a(this));
        c0 c0Var = new c0(context);
        this.f74906o = c0Var;
        c0Var.setPlayer(exoPlayerBuild);
        c0Var.setUseController(false);
    }

    @Override // lq.a, lq.b
    public void a() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        super.a();
        this.f74905n.release();
        this.f74906o.setPlayer(null);
    }

    @Override // lq.a
    public float d() {
        return this.f74905n.getVolume();
    }

    @Override // lq.a
    public final void e(long j10) {
        this.f74905n.seekTo(j10);
    }

    @Override // lq.a
    public final long h() {
        return this.f74905n.getCurrentPosition();
    }

    @Override // lq.a
    public final void j(Uri uri) {
        this.f74905n.setMediaItem(new gn.c0().setUri(uri).build());
    }

    @Override // lq.a
    public final long m() {
        return this.f74905n.getDuration();
    }

    @Override // lq.a, lq.b
    public View n() {
        return this.f74906o;
    }

    @Override // lq.a
    public final boolean o() {
        return this.f74905n.isPlaying();
    }

    @Override // lq.a
    public final void q() {
        this.f74905n.pause();
    }

    @Override // lq.a
    public final void r() {
        this.f74905n.play();
    }

    @Override // lq.a
    public final void s() {
        this.f74905n.prepare();
    }

    @Override // lq.a
    public final void t() {
        this.f74905n.stop();
    }

    @Override // lq.a
    public final void d(float f10) {
        this.f74905n.setVolume(f10);
    }
}
