package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzbk {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzgpe zzi;
    private zzgpe zzj;
    private zzgpe zzk;
    private zzgpe zzl;
    private zzgpe zzm;
    private int zzn;
    private int zzo;
    private zzgpe zzp;
    private zzbj zzq;
    private zzgpe zzr;
    private boolean zzs;
    private zzgpe zzt;
    private HashMap zzu;
    private HashSet zzv;

    public zzbk() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzgpe.zzi();
        this.zzj = zzgpe.zzi();
        this.zzk = zzgpe.zzi();
        this.zzl = zzgpe.zzi();
        this.zzm = zzgpe.zzi();
        this.zzn = Integer.MAX_VALUE;
        this.zzo = Integer.MAX_VALUE;
        this.zzp = zzgpe.zzi();
        this.zzq = zzbj.zza;
        this.zzr = zzgpe.zzi();
        this.zzs = true;
        this.zzt = zzgpe.zzi();
        this.zzu = new HashMap();
        this.zzv = new HashSet();
    }

    @EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes", "preferredVideoLabels", "preferredAudioLabels", "preferredTextLabels"})
    private final void zzx(zzbl zzblVar) {
        this.zza = zzblVar.zza;
        this.zzb = zzblVar.zzb;
        this.zzc = zzblVar.zzc;
        this.zzd = zzblVar.zzd;
        this.zze = zzblVar.zzi;
        this.zzf = zzblVar.zzj;
        this.zzg = zzblVar.zzk;
        this.zzh = zzblVar.zzl;
        this.zzj = zzblVar.zzn;
        this.zzi = zzblVar.zzm;
        this.zzk = zzblVar.zzo;
        this.zzl = zzblVar.zzq;
        this.zzm = zzblVar.zzr;
        this.zzn = zzblVar.zzt;
        this.zzo = zzblVar.zzu;
        this.zzp = zzblVar.zzv;
        this.zzq = zzblVar.zzw;
        this.zzr = zzblVar.zzy;
        this.zzs = zzblVar.zzB;
        this.zzt = zzblVar.zzz;
        this.zzv = new HashSet(zzblVar.zzI);
        this.zzu = new HashMap(zzblVar.zzH);
    }

    public final zzbk zza(zzbl zzblVar) {
        zzx(zzblVar);
        return this;
    }

    public final /* synthetic */ int zzb() {
        return this.zza;
    }

    public final /* synthetic */ int zzc() {
        return this.zzb;
    }

    public final /* synthetic */ int zzd() {
        return this.zzc;
    }

    public final /* synthetic */ int zze() {
        return this.zzd;
    }

    public final /* synthetic */ int zzf() {
        return this.zze;
    }

    public final /* synthetic */ int zzg() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzg;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzh;
    }

    public final /* synthetic */ zzgpe zzj() {
        return this.zzi;
    }

    public final /* synthetic */ zzgpe zzk() {
        return this.zzj;
    }

    public final /* synthetic */ zzgpe zzl() {
        return this.zzk;
    }

    public final /* synthetic */ zzgpe zzm() {
        return this.zzl;
    }

    public final /* synthetic */ zzgpe zzn() {
        return this.zzm;
    }

    public final /* synthetic */ int zzo() {
        return this.zzn;
    }

    public final /* synthetic */ int zzp() {
        return this.zzo;
    }

    public final /* synthetic */ zzgpe zzq() {
        return this.zzp;
    }

    public final /* synthetic */ zzbj zzr() {
        return this.zzq;
    }

    public final /* synthetic */ zzgpe zzs() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzt() {
        return this.zzs;
    }

    public final /* synthetic */ zzgpe zzu() {
        return this.zzt;
    }

    public final /* synthetic */ HashMap zzv() {
        return this.zzu;
    }

    public final /* synthetic */ HashSet zzw() {
        return this.zzv;
    }

    public zzbk(zzbl zzblVar) {
        zzx(zzblVar);
    }
}
