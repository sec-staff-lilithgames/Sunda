package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.di.ServiceProvider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaba {
    private final zzaaz zza;
    private final zzabf zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzdc zzk = zzdc.zza;

    public zzaba(Context context, zzaaz zzaazVar, long j10) {
        this.zza = zzaazVar;
        this.zzb = new zzabf(context);
    }

    private final void zzo(int i10) {
        this.zzd = Math.min(this.zzd, i10);
    }

    public final void zza(int i10) {
        if (i10 == 0) {
            this.zzd = 1;
        } else if (i10 != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzb() {
        this.zzc = true;
        this.zzf = zzep.zzq(this.zzk.zzb());
        this.zzb.zzb();
    }

    public final void zzc() {
        this.zzc = false;
        this.zzh = C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzd(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzc(surface);
        zzo(1);
    }

    public final void zze(float f10) {
        this.zzb.zzf(f10);
    }

    public final boolean zzf() {
        int i10 = this.zzd;
        this.zzd = 3;
        this.zzf = zzep.zzq(this.zzk.zzb());
        return i10 != 3;
    }

    public final void zzg(zzdc zzdcVar) {
        this.zzk = zzdcVar;
    }

    public final void zzh() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final boolean zzi(boolean z10) {
        if (z10 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = C.TIME_UNSET;
            return true;
        }
        if (this.zzh == C.TIME_UNSET) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = C.TIME_UNSET;
        return false;
    }

    public final void zzj(boolean z10) {
        this.zzi = z10;
        this.zzh = C.TIME_UNSET;
    }

    public final int zzk(long j10, long j11, long j12, long j13, boolean z10, boolean z11, zzaay zzaayVar) throws zzib {
        boolean z12;
        zzaayVar.zzc();
        if (this.zzc && this.zze == C.TIME_UNSET) {
            this.zze = j11;
        }
        if (this.zzg != j10) {
            this.zzb.zzg(j10);
            this.zzg = j10;
        }
        long jZzq = (long) ((j10 - j11) / this.zzj);
        if (this.zzc) {
            jZzq -= zzep.zzq(this.zzk.zzb()) - j12;
        }
        zzaayVar.zze(jZzq);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzao(zzaayVar.zzd(), j11, j12, z11, true)) {
                return 4;
            }
            return (!this.zzc || zzaayVar.zzd() >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) ? 5 : 3;
        }
        long jZzd = zzaayVar.zzd();
        if (this.zzh == C.TIME_UNSET || this.zzi) {
            int i10 = this.zzd;
            if (i10 == 0) {
                z12 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i10 == 1) {
                    return 0;
                }
                if (i10 == 2) {
                    z12 = false;
                    if (j11 >= j13) {
                        return 0;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    z12 = false;
                    long jZzq2 = zzep.zzq(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j14 = this.zze;
                        if (j14 != C.TIME_UNSET && j14 != j11 && jZzd < -30000 && jZzq2 > 100000) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z12 = false;
        }
        if (!this.zzc || j11 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzaayVar.zzg(this.zzb.zzi((zzaayVar.zzd() * 1000) + jZzc));
        zzaayVar.zze((zzaayVar.zzf() - jZzc) / 1000);
        boolean z13 = (this.zzh == C.TIME_UNSET || this.zzi) ? z12 : true;
        if (this.zza.zzao(zzaayVar.zzd(), j11, j12, z11, z13)) {
            return 4;
        }
        return (zzaayVar.zzd() >= -30000 || z11) ? zzaayVar.zzd() > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT ? 5 : 1 : z13 ? 3 : 2;
    }

    public final void zzl() {
        this.zzb.zzd();
        this.zzg = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        zzo(1);
        this.zzh = C.TIME_UNSET;
    }

    public final void zzm(int i10) {
        this.zzb.zza(i10);
    }

    public final void zzn(float f10) {
        zzgmd.zza(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }
}
