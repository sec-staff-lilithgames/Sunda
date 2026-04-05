package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhx implements zzkl {
    public static final zzgpe zza = zzgpe.zzn(C3191e4.h.f36473b, "content", "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzzb zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgph zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzhx() {
        zzzb zzzbVar = new zzzb(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzgph zzgphVarZza = zzgph.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzzbVar;
        this.zze = zzep.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzf = zzep.zzq(1000L);
        this.zzg = zzep.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzh = zzep.zzq(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzi = zzep.zzq(1000L);
        this.zzj = zzep.zzq(1000L);
        this.zzk = zzep.zzq(2000L);
        this.zzl = zzep.zzq(1000L);
        this.zzm = zzep.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgph.zzc(zzgphVarZza);
        this.zzp = -1L;
    }

    private final int zzm(zzpc zzpcVar) {
        Integer num = (Integer) this.zzn.get(zzpcVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpc zzpcVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzhw zzhwVar = (zzhw) concurrentHashMap.get(zzpcVar);
        if (zzhwVar != null) {
            int i10 = zzhwVar.zza - 1;
            zzhwVar.zza = i10;
            if (i10 == 0) {
                concurrentHashMap.remove(zzpcVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzzb zzzbVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((zzhw) it.next()).zzc;
        }
        zzzbVar.zzf(i10);
    }

    private final boolean zzp(zzkk zzkkVar) {
        zzbf zzbfVar = zzkkVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzkkVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i10, int i11, String str, String str2) {
        if (i10 < i11) {
            throw new IllegalArgumentException(zzgmu.zzd("%s cannot be less than %s", str, str2));
        }
    }

    private final int zzr(zzpc zzpcVar) {
        zzhw zzhwVar = (zzhw) this.zzo.get(zzpcVar);
        zzhwVar.getClass();
        return zzhwVar.zzc() * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    private final int zzs(zzpc zzpcVar) {
        zzhw zzhwVar = (zzhw) this.zzo.get(zzpcVar);
        zzhwVar.getClass();
        return zzhwVar.zzc;
    }

    private static final boolean zzt(boolean z10) {
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zza(zzpc zzpcVar) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.zzp;
        zzgmd.zzi(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id2;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzhw zzhwVar = (zzhw) concurrentHashMap.get(zzpcVar);
        if (zzhwVar == null) {
            concurrentHashMap.put(zzpcVar, new zzhw());
        } else {
            zzhwVar.zza++;
        }
        zzhw zzhwVar2 = (zzhw) concurrentHashMap.get(zzpcVar);
        zzhwVar2.getClass();
        int iZzm = zzm(zzpcVar);
        if (iZzm == -1) {
            iZzm = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        zzhwVar2.zzc = iZzm;
        zzhwVar2.zzb = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzb(zzkk zzkkVar, zzwv zzwvVar, zzyk[] zzykVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpc zzpcVar = zzkkVar.zza;
        int iZzm = zzm(zzpcVar);
        zzhw zzhwVar = (zzhw) concurrentHashMap.get(zzpcVar);
        zzhwVar.getClass();
        if (iZzm == -1) {
            boolean zZzp = zzp(zzkkVar);
            int length = zzykVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    zzyk zzykVar = zzykVarArr[i10];
                    if (zzykVar != null) {
                        switch (zzykVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i12 = 144310272;
                                break;
                            case 2:
                                if (!zZzp) {
                                    i12 = 131072000;
                                    break;
                                } else {
                                    i12 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i12 = 131072;
                                break;
                            case 4:
                                i12 = 26214400;
                                break;
                        }
                        i11 += i12;
                    }
                    i10++;
                } else {
                    iZzm = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i11);
                }
            }
        }
        zzhwVar.zzc = iZzm;
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzc(zzpc zzpcVar) {
        zzn(zzpcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzd(zzpc zzpcVar) {
        zzn(zzpcVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final zzyv zze(zzpc zzpcVar) {
        return new zzhv(this, zzpcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final long zzf(zzpc zzpcVar) {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzg(zzpc zzpcVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzh(zzkk zzkkVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpc zzpcVar = zzkkVar.zza;
        zzhw zzhwVar = (zzhw) concurrentHashMap.get(zzpcVar);
        zzhwVar.getClass();
        int iZzr = zzr(zzpcVar);
        int iZzs = zzs(zzpcVar);
        if (zzpcVar.equals(zzpc.zza)) {
            return iZzr < iZzs;
        }
        boolean zZzp = zzp(zzkkVar);
        long jMin = zZzp ? this.zzf : this.zze;
        long j10 = zZzp ? this.zzh : this.zzg;
        float f10 = zzkkVar.zzf;
        if (f10 > 1.0f) {
            jMin = Math.min(zzep.zzv(jMin, f10), j10);
        }
        long j11 = zzkkVar.zze;
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z10 = zzt(zZzp) || iZzr < iZzs;
            zzhwVar.zzb = z10;
            if (!z10 && j11 < 500000) {
                zzdt.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j10 || iZzr >= iZzs) {
            zzhwVar.zzb = false;
        }
        return zzhwVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzi(zzkk zzkkVar) {
        long jMin;
        boolean z10;
        boolean z11 = zzkkVar.zzg;
        long j10 = zzkkVar.zze;
        float f10 = zzkkVar.zzf;
        boolean zZzp = zzp(zzkkVar);
        long jZzw = zzep.zzw(j10, f10);
        if (z11) {
            if (zZzp) {
                jMin = this.zzl;
                z10 = true;
            } else {
                jMin = this.zzk;
                z10 = false;
            }
        } else if (zZzp) {
            jMin = this.zzj;
            z10 = true;
        } else {
            jMin = this.zzi;
            z10 = false;
        }
        long j11 = zzkkVar.zzh;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jZzw >= jMin) {
            return true;
        }
        if (!zzt(z10)) {
            zzpc zzpcVar = zzkkVar.zza;
            if (zzr(zzpcVar) >= zzs(zzpcVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final boolean zzj(zzpc zzpcVar, zzbf zzbfVar, zzuu zzuuVar, long j10) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzhw) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzzb zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
