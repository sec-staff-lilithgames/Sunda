package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzabf {
    private final zzaad zza = new zzaad();
    private final zzabd zzb;
    private final zzabe zzc;
    private boolean zzd;
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzabf(Context context) {
        DisplayManager displayManager;
        zzabd zzabdVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzabd(this, displayManager);
        this.zzb = zzabdVar;
        this.zzc = zzabdVar != null ? zzabe.zza() : null;
        this.zzk = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    private final void zzk() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzl() {
        if (Build.VERSION.SDK_INT < 30 || this.zze == null) {
            return;
        }
        zzaad zzaadVar = this.zza;
        float fZzg = zzaadVar.zzc() ? zzaadVar.zzg() : this.zzf;
        float f10 = this.zzg;
        if (fZzg != f10) {
            if (fZzg != -1.0f && f10 != -1.0f) {
                float f11 = 1.0f;
                if (zzaadVar.zzc() && zzaadVar.zze() >= 5000000000L) {
                    f11 = 0.1f;
                }
                if (Math.abs(fZzg - this.zzg) < f11) {
                    return;
                }
            } else if (fZzg == -1.0f && zzaadVar.zzd() < 30) {
                return;
            }
            this.zzg = fZzg;
            zzm(false);
        }
    }

    private final void zzm(boolean z10) {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.zzd) {
            float f11 = this.zzg;
            if (f11 != -1.0f) {
                f10 = this.zzi * f11;
            }
        }
        if (z10 || this.zzh != f10) {
            this.zzh = f10;
            zzabc.zza(surface, f10);
        }
    }

    private final void zzn() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzabc.zza(surface, 0.0f);
    }

    public final void zza(int i10) {
        if (this.zzj == i10) {
            return;
        }
        this.zzj = i10;
        zzm(true);
    }

    public final void zzb() {
        this.zzd = true;
        zzk();
        zzabd zzabdVar = this.zzb;
        if (zzabdVar != null) {
            zzabe zzabeVar = this.zzc;
            zzabeVar.getClass();
            zzabeVar.zzb();
            zzabdVar.zza();
        }
        zzm(false);
    }

    public final void zzc(Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzn();
        this.zze = surface;
        zzm(true);
    }

    public final void zzd() {
        zzk();
    }

    public final void zze(float f10) {
        this.zzi = f10;
        zzk();
        zzm(false);
    }

    public final void zzf(float f10) {
        this.zzf = f10;
        this.zza.zza();
        zzl();
    }

    public final void zzg(long j10) {
        long j11 = this.zzn;
        if (j11 != -1) {
            this.zzp = j11;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zzb(j10 * 1000);
        zzl();
    }

    public final void zzh() {
        this.zzd = false;
        zzabd zzabdVar = this.zzb;
        if (zzabdVar != null) {
            zzabdVar.zzb();
            zzabe zzabeVar = this.zzc;
            zzabeVar.getClass();
            zzabeVar.zzc();
        }
        zzn();
    }

    public final long zzi(long j10) {
        long j11;
        if (this.zzp != -1) {
            zzaad zzaadVar = this.zza;
            if (zzaadVar.zzc()) {
                long jZzf = zzaadVar.zzf();
                long j12 = this.zzq + ((long) (((this.zzm - this.zzp) * jZzf) / this.zzi));
                if (Math.abs(j10 - j12) > 20000000) {
                    zzk();
                } else {
                    j10 = j12;
                }
            }
        }
        this.zzn = this.zzm;
        this.zzo = j10;
        zzabe zzabeVar = this.zzc;
        if (zzabeVar != null && this.zzk != C.TIME_UNSET) {
            long j13 = zzabeVar.zza;
            if (j13 != C.TIME_UNSET) {
                long j14 = this.zzk;
                long j15 = (((j10 - j13) / j14) * j14) + j13;
                if (j10 <= j15) {
                    j11 = j15 - j14;
                } else {
                    j11 = j15;
                    j15 = j14 + j15;
                }
                long j16 = this.zzl;
                if (j15 - j10 >= j10 - j11) {
                    j15 = j11;
                }
                return j15 - j16;
            }
        }
        return j10;
    }

    public final /* synthetic */ void zzj(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.zzk = refreshRate;
            this.zzl = (refreshRate * 80) / 100;
        } else {
            zzdt.zzc("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.zzk = C.TIME_UNSET;
            this.zzl = C.TIME_UNSET;
        }
    }
}
