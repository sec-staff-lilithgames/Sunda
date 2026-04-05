package nq;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import cr.q;
import java.io.IOException;
import lq.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f extends lq.a {

    /* renamed from: n, reason: collision with root package name */
    public final Context f77183n;

    /* renamed from: o, reason: collision with root package name */
    public final MediaPlayer f77184o;

    /* renamed from: p, reason: collision with root package name */
    public final i f77185p;

    /* renamed from: q, reason: collision with root package name */
    public float f77186q = 1.0f;

    public f(Context context) throws IllegalArgumentException {
        this.f77183n = context.getApplicationContext();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f77184o = mediaPlayer;
        mediaPlayer.setLooping(false);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build());
        mediaPlayer.setOnPreparedListener(new d(this));
        mediaPlayer.setOnErrorListener(new c(this));
        mediaPlayer.setOnSeekCompleteListener(new e(this));
        mediaPlayer.setOnCompletionListener(new b(this));
        i iVar = new i(context);
        this.f77185p = iVar;
        iVar.setListener(new a(this));
        iVar.setMediaPlayer(mediaPlayer);
    }

    @Override // lq.a, lq.b
    public void a() {
        super.a();
        this.f77185p.a();
        MediaPlayer mediaPlayer = this.f77184o;
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    @Override // lq.a
    public final void b() throws IllegalStateException {
        r();
        u();
    }

    @Override // lq.a
    public float d() {
        return this.f77186q;
    }

    @Override // lq.a
    public final void e(long j10) throws IllegalStateException {
        this.f77184o.seekTo((int) j10);
    }

    @Override // lq.a
    public final long h() {
        return this.f77184o.getCurrentPosition();
    }

    @Override // lq.a
    public final void j(Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer = this.f77184o;
        mediaPlayer.reset();
        mediaPlayer.setDataSource(this.f77183n, uri);
    }

    @Override // lq.a
    public final long m() {
        return this.f77184o.getDuration();
    }

    @Override // lq.a
    public final void n(float f10) {
        this.f77186q = f10;
        d(f10);
        i(f10);
    }

    @Override // lq.a
    public final boolean o() {
        return this.f77184o.isPlaying();
    }

    @Override // lq.a
    public final void q() throws IllegalStateException {
        this.f77184o.pause();
    }

    @Override // lq.a
    public final void r() throws IllegalStateException {
        this.f77184o.start();
    }

    @Override // lq.a
    public final void s() throws IllegalStateException {
        this.f77184o.prepareAsync();
    }

    @Override // lq.a
    public final void t() throws IllegalStateException {
        this.f77184o.stop();
    }

    @Override // lq.a
    public final void w() throws IllegalStateException {
        lq.d dVar;
        q();
        if (!this.f73602f.get() && (dVar = this.f73604h) != null) {
            dVar.c(this);
        }
        a.C0745a c0745a = this.f73599b;
        c0745a.f73610b.set(false);
        q.cancelOnUiThread(c0745a);
    }

    @Override // lq.a
    public final void d(float f10) {
        this.f77184o.setVolume(f10, f10);
    }

    @Override // lq.a, lq.b
    public View n() {
        return this.f77185p;
    }
}
