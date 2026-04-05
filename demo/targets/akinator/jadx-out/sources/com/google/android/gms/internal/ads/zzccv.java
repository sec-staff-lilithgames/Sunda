package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzccv extends zzccx implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcdr zzd;
    private final zzcds zze;
    private final boolean zzf;
    private final zzdvi zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcdp zzo;
    private final boolean zzp;
    private int zzq;
    private zzccw zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_BURL_VALUE), "MEDIA_INFO_NOT_SEEKABLE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_NURL_VALUE), "MEDIA_INFO_METADATA_UPDATE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(Integer.valueOf(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzccv(Context context, zzcdr zzcdrVar, boolean z10, boolean z11, zzcdq zzcdqVar, zzcds zzcdsVar, zzdvi zzdviVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzcdrVar;
        this.zze = zzcdsVar;
        this.zzp = z10;
        this.zzf = z11;
        zzcdsVar.zza(this);
        this.zzg = zzdviVar;
    }

    private final void zzD() throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        zzdvi zzdviVar;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzv();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzon)).booleanValue() && (zzdviVar = this.zzg) != null) {
                    zzdvh zzdvhVarZza = zzdviVar.zza();
                    zzdvhVarZza.zzc("action", "svp_ampv");
                    zzdvhVarZza.zzd();
                }
                zzcdp zzcdpVar = new zzcdp(getContext());
                this.zzo = zzcdpVar;
                zzcdpVar.zzb(surfaceTexture, getWidth(), getHeight());
                zzcdp zzcdpVar2 = this.zzo;
                zzcdpVar2.start();
                SurfaceTexture surfaceTextureZze = zzcdpVar2.zze();
                if (surfaceTextureZze != null) {
                    surfaceTexture = surfaceTextureZze;
                } else {
                    this.zzo.zzd();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            com.google.android.gms.ads.internal.zzt.zzw();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzH(1);
        } catch (IOException e10) {
            e = e10;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalArgumentException e11) {
            e = e11;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e12) {
            e = e12;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcdp zzcdpVar = this.zzo;
        if (zzcdpVar != null) {
            zzcdpVar.zzd();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            if (z10) {
                this.zzi = 0;
            }
        }
    }

    private final boolean zzF() {
        int i10;
        return (this.zzj == null || (i10 = this.zzh) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    private final void zzG(float f10) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f10, f10);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzH(int i10) {
        if (i10 == 3) {
            this.zze.zze();
            this.zzb.zzd();
        } else if (this.zzh == 3) {
            this.zze.zzf();
            this.zzb.zze();
        }
        this.zzh = i10;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.zzn = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzH(5);
        this.zzi = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccn(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        String strR = o2.r(new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length()), "AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strR);
        zzH(-1);
        this.zzi = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcco(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb2.append("AdMediaPlayerView MediaPlayer info: ");
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzl
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.zzm
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.zzl
            if (r2 <= 0) goto L7a
            int r2 = r5.zzm
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.zzcdp r2 = r5.zzo
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L42
            int r0 = r5.zzl
            int r1 = r0 * r7
            int r2 = r5.zzm
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
        L40:
            r0 = r6
            goto L7a
        L42:
            r0 = r2
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.zzm
            int r0 = r0 * r6
            int r2 = r5.zzl
            int r0 = r0 / r2
            if (r1 != r3) goto L52
            if (r0 <= r7) goto L52
            goto L60
        L52:
            r1 = r0
            goto L40
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.zzl
            int r1 = r1 * r7
            int r2 = r5.zzm
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.zzl
            int r4 = r5.zzm
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L40
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcdp r6 = r5.zzo
            if (r6 == 0) goto L84
            r6.zzc(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccv.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzH(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccm(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i10 = this.zzq;
        if (i10 != 0) {
            zzi(i10);
        }
        if (this.zzf && zzF() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            while (zzF() && this.zzj.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzj.pause();
            zzq();
        }
        int i11 = this.zzl;
        int i12 = this.zzm;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40 + String.valueOf(i12).length());
        sb2.append("AdMediaPlayerView stream dimensions: ");
        sb2.append(i11);
        sb2.append(" x ");
        sb2.append(i12);
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2.toString());
        if (this.zzi == 3) {
            zze();
        }
        zzq();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzD();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccp(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcdp zzcdpVar = this.zzo;
        if (zzcdpVar != null) {
            zzcdpVar.zzd();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccr(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i12 = this.zzi;
        boolean z10 = false;
        if (this.zzl == i10 && this.zzm == i11) {
            z10 = true;
        }
        if (this.zzj != null && i12 == 3 && z10) {
            int i13 = this.zzq;
            if (i13 != 0) {
                zzi(i13);
            }
            zze();
        }
        zzcdp zzcdpVar = this.zzo;
        if (zzcdpVar != null) {
            zzcdpVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccq(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35 + String.valueOf(i11).length());
        sb2.append("AdMediaPlayerView size changed: ");
        sb2.append(i10);
        sb2.append(" x ");
        sb2.append(i11);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 47);
        sb2.append("AdMediaPlayerView window visibility changed to ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzccv.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return a.b.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final String zza() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzb(zzccw zzccwVar) {
        this.zzr = zzccwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzc(String str) throws IllegalStateException, InterruptedException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        zzbdf zzbdfVarZza = zzbdf.zza(uri);
        if (zzbdfVarZza == null || zzbdfVarZza.zza != null) {
            if (zzbdfVarZza != null) {
                uri = Uri.parse(zzbdfVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzd() throws IllegalStateException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzH(0);
            this.zzi = 0;
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zze() throws IllegalStateException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzF()) {
            this.zzj.start();
            zzH(3);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccs(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzf() throws IllegalStateException {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzF() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzH(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcct(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzg() {
        if (zzF()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzh() {
        if (zzF()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzi(int i10) throws IllegalStateException {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("AdMediaPlayerView seek ");
        sb2.append(i10);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        if (!zzF()) {
            this.zzq = i10;
        } else {
            this.zzj.seekTo(i10);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final void zzj(float f10, float f11) {
        zzcdp zzcdpVar = this.zzo;
        if (zzcdpVar != null) {
            zzcdpVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzk() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzl() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzm() {
        if (this.zzt != null) {
            return (zzo() * this.zzn) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final long zzo() {
        if (this.zzt != null) {
            return zzg() * this.zzt.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzccx
    public final int zzp() {
        if (Build.VERSION.SDK_INT < 26 || !zzF()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzccx, com.google.android.gms.internal.ads.zzcdu
    public final void zzq() {
        zzG(this.zzb.zzc());
    }

    public final /* synthetic */ void zzr(int i10) {
        zzccw zzccwVar = this.zzr;
        if (zzccwVar != null) {
            zzccwVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzs(MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue() || this.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    this.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    int integer = format2.getInteger("width");
                                    int integer2 = format2.getInteger("height");
                                    StringBuilder sb2 = new StringBuilder(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.a(integer, 1) + String.valueOf(integer2).length());
                                    sb2.append(integer);
                                    sb2.append("x");
                                    sb2.append(integer2);
                                    map.put("resolution", sb2.toString());
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                this.zzd.zze("onMetadataEvent", map);
            }
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMediaPlayerView.reportMetadata");
        }
    }

    public final /* synthetic */ zzccw zzt() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzu() {
        return this.zzs;
    }

    public final /* synthetic */ void zzv(boolean z10) {
        this.zzs = true;
    }
}
