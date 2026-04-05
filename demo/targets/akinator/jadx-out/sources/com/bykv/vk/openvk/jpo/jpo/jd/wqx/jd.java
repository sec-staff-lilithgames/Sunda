package com.bykv.vk.openvk.jpo.jpo.jd.wqx;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ironsource.C3191e4;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd extends com.bykv.vk.openvk.jpo.jpo.jd.wqx.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo f16729cm;

    /* renamed from: jd, reason: collision with root package name */
    private final MediaPlayer f16730jd;

    /* renamed from: jj, reason: collision with root package name */
    private final Object f16731jj;
    private Surface my;

    /* renamed from: qk, reason: collision with root package name */
    private volatile boolean f16732qk;
    private final jpo wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<jd> jpo;

        public jpo(jd jdVar) {
            this.jpo = new WeakReference<>(jdVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    jdVar.jpo(i10);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    jdVar.wqx();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    return jdVar.jpo(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    return jdVar.jd(i10, i11);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    jdVar.jd();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    jdVar.cm();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
            try {
                jd jdVar = this.jpo.get();
                if (jdVar != null) {
                    jdVar.jpo(i10, i11, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public jd() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.f16731jj = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.f16730jd = mediaPlayer;
        }
        jpo(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.wqx = new jpo(this);
        sq();
    }

    private void hna() {
        com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo jpoVar = this.f16729cm;
        if (jpoVar != null) {
            try {
                jpoVar.close();
            } catch (Throwable unused) {
            }
            this.f16729cm = null;
        }
    }

    private void jpo(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object objNewInstance = cls2.getConstructor(Context.class, cls, Class.forName(RnJusJ.JXmqjTLkmKO)).newInstance(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(objNewInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, objNewInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    private void opi() {
        try {
            Surface surface = this.my;
            if (surface != null) {
                surface.release();
                this.my = null;
            }
        } catch (Throwable unused) {
        }
    }

    private void sq() {
        this.f16730jd.setOnPreparedListener(this.wqx);
        this.f16730jd.setOnBufferingUpdateListener(this.wqx);
        this.f16730jd.setOnCompletionListener(this.wqx);
        this.f16730jd.setOnSeekCompleteListener(this.wqx);
        this.f16730jd.setOnVideoSizeChangedListener(this.wqx);
        this.f16730jd.setOnErrorListener(this.wqx);
        this.f16730jd.setOnInfoListener(this.wqx);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void au() throws Throwable {
        try {
            this.f16730jd.reset();
        } catch (Throwable unused) {
        }
        hna();
        jpo();
        sq();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void cm(boolean z10) throws Throwable {
        MediaPlayer mediaPlayer = this.f16730jd;
        if (mediaPlayer == null) {
            return;
        }
        if (z10) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        opi();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    /* renamed from: if, reason: not valid java name */
    public void mo373if() throws Throwable {
        synchronized (this.f16731jj) {
            try {
                if (!this.f16732qk) {
                    this.f16730jd.release();
                    this.f16732qk = true;
                    opi();
                    hna();
                    jpo();
                    sq();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jd(boolean z10) throws Throwable {
        this.f16730jd.setScreenOnWhilePlaying(z10);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jj() throws Throwable {
        this.f16730jd.start();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public long ju() {
        try {
            return this.f16730jd.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public PlaybackParams my() throws IllegalStateException {
        return this.f16730jd.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public int oya() {
        MediaPlayer mediaPlayer = this.f16730jd;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public int prr() {
        MediaPlayer mediaPlayer = this.f16730jd;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void qk() throws Throwable {
        this.f16730jd.stop();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void wqx(boolean z10) throws Throwable {
        this.f16730jd.setLooping(z10);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void xyk() throws Throwable {
        this.f16730jd.pause();
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public long yd() {
        try {
            return this.f16730jd.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void zz() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f16730jd;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.f16731jj) {
            try {
                if (!this.f16732qk && surfaceHolder != null && surfaceHolder.getSurface() != null && this.jpo) {
                    this.f16730jd.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(Surface surface) {
        opi();
        this.my = surface;
        this.f16730jd.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.jd jdVar) throws Throwable {
        this.f16730jd.setPlaybackParams(this.f16730jd.getPlaybackParams().setSpeed(jdVar.jpo()));
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(String str) throws Throwable {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase(C3191e4.h.f36473b)) {
            this.f16730jd.setDataSource(uri.getPath());
        } else {
            this.f16730jd.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(FileDescriptor fileDescriptor) throws Throwable {
        this.f16730jd.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public synchronized void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar) {
        this.f16729cm = com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo.jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(), wqxVar);
        com.bykv.vk.openvk.jpo.jpo.jd.jpo.jd.wqx.jpo(wqxVar);
        this.f16730jd.setDataSource(this.f16729cm);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jd.wqx.wqx
    public void jpo(long j10, int i10) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.f16730jd.seekTo((int) j10);
            return;
        }
        if (i10 == 0) {
            this.f16730jd.seekTo((int) j10, 0);
            return;
        }
        if (i10 == 1) {
            this.f16730jd.seekTo((int) j10, 1);
            return;
        }
        if (i10 == 2) {
            this.f16730jd.seekTo((int) j10, 2);
        } else if (i10 != 3) {
            this.f16730jd.seekTo((int) j10);
        } else {
            this.f16730jd.seekTo((int) j10, 3);
        }
    }
}
