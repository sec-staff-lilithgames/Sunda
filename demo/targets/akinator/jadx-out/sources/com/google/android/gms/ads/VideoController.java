package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.client.zzfz;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.unity3d.ads.beta.xyn.RnJusJ;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzed zzb;
    private VideoLifecycleCallbacks zzc;

    public int getPlaybackState() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return 0;
            }
            try {
                return zzedVar.zzi();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call getPlaybackState on video controller.", e10);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z10;
        synchronized (this.zza) {
            z10 = this.zzb != null;
        }
        return z10;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return false;
            }
            try {
                return zzedVar.zzp();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isClickToExpandEnabled.", e10);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return false;
            }
            try {
                return zzedVar.zzn();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isUsingCustomPlayerControls.", e10);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return true;
            }
            try {
                return zzedVar.zzh();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call isMuted on video controller.", e10);
                return true;
            }
        }
    }

    public void mute(boolean z10) {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return;
            }
            try {
                zzedVar.zzg(z10);
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call mute on video controller.", e10);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return;
            }
            try {
                zzedVar.zzf();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call pause on video controller.", e10);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return;
            }
            try {
                zzedVar.zze();
            } catch (RemoteException e10) {
                zzo.zzg("Unable to call play on video controller.", e10);
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzfz zzfzVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfzVar = null;
            } else {
                try {
                    zzfzVar = new zzfz(videoLifecycleCallbacks);
                } catch (RemoteException e10) {
                    zzo.zzg("Unable to call setVideoLifecycleCallbacks on video controller.", e10);
                }
            }
            zzedVar.zzl(zzfzVar);
        }
    }

    public final void zza(zzed zzedVar) {
        synchronized (this.zza) {
            try {
                this.zzb = zzedVar;
                VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
                if (videoLifecycleCallbacks != null) {
                    setVideoLifecycleCallbacks(videoLifecycleCallbacks);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzed zzb() {
        zzed zzedVar;
        synchronized (this.zza) {
            zzedVar = this.zzb;
        }
        return zzedVar;
    }

    public void stop() {
        synchronized (this.zza) {
            zzed zzedVar = this.zzb;
            if (zzedVar == null) {
                return;
            }
            try {
                zzedVar.zzq();
            } catch (RemoteException e10) {
                zzo.zzg(RnJusJ.rweKaaGvcd, e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }

        public void onVideoMute(boolean z10) {
        }
    }
}
