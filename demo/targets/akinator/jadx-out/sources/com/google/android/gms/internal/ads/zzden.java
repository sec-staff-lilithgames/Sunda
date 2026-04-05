package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzden {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzfdj zzo;

    public final /* synthetic */ Set zzA() {
        return this.zzm;
    }

    public final /* synthetic */ Set zzB() {
        return this.zzn;
    }

    public final /* synthetic */ zzfdj zzC() {
        return this.zzo;
    }

    public final zzden zza(zzcyo zzcyoVar, Executor executor) {
        this.zze.add(new zzdgn(zzcyoVar, executor));
        return this;
    }

    public final zzden zzb(zzdac zzdacVar, Executor executor) {
        this.zzh.add(new zzdgn(zzdacVar, executor));
        return this;
    }

    public final zzden zzc(zzcyr zzcyrVar, Executor executor) {
        this.zzi.add(new zzdgn(zzcyrVar, executor));
        return this;
    }

    public final zzden zzd(zzcze zzczeVar, Executor executor) {
        this.zzl.add(new zzdgn(zzczeVar, executor));
        return this;
    }

    public final zzden zze(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzdgn(appEventListener, executor));
        return this;
    }

    public final zzden zzf(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdgn(zzaVar, executor));
        return this;
    }

    public final zzden zzg(zzdgv zzdgvVar, Executor executor) {
        this.zzd.add(new zzdgn(zzdgvVar, executor));
        return this;
    }

    public final zzden zzh(zzczi zzcziVar, Executor executor) {
        this.zzf.add(new zzdgn(zzcziVar, executor));
        return this;
    }

    public final zzden zzi(zzdan zzdanVar, Executor executor) {
        this.zzg.add(new zzdgn(zzdanVar, executor));
        return this;
    }

    public final zzden zzj(com.google.android.gms.ads.internal.overlay.zzr zzrVar, Executor executor) {
        this.zzn.add(new zzdgn(zzrVar, executor));
        return this;
    }

    public final zzden zzk(zzdbf zzdbfVar, Executor executor) {
        this.zzm.add(new zzdgn(zzdbfVar, executor));
        return this;
    }

    public final zzden zzl(zzfdj zzfdjVar) {
        this.zzo = zzfdjVar;
        return this;
    }

    public final zzden zzm(zzdbu zzdbuVar, Executor executor) {
        this.zzb.add(new zzdgn(zzdbuVar, executor));
        return this;
    }

    public final zzdeo zzn() {
        return new zzdeo(this, null);
    }

    public final /* synthetic */ Set zzo() {
        return this.zza;
    }

    public final /* synthetic */ Set zzp() {
        return this.zzb;
    }

    public final /* synthetic */ Set zzq() {
        return this.zzc;
    }

    public final /* synthetic */ Set zzr() {
        return this.zzd;
    }

    public final /* synthetic */ Set zzs() {
        return this.zze;
    }

    public final /* synthetic */ Set zzt() {
        return this.zzf;
    }

    public final /* synthetic */ Set zzu() {
        return this.zzg;
    }

    public final /* synthetic */ Set zzv() {
        return this.zzh;
    }

    public final /* synthetic */ Set zzw() {
        return this.zzi;
    }

    public final /* synthetic */ Set zzx() {
        return this.zzj;
    }

    public final /* synthetic */ Set zzy() {
        return this.zzk;
    }

    public final /* synthetic */ Set zzz() {
        return this.zzl;
    }
}
