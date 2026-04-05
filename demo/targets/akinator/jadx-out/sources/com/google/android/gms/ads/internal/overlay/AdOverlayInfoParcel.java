package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzczb;
import com.google.android.gms.internal.ads.zzdgv;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    private static final AtomicLong zzy = new AtomicLong(0);
    private static final ConcurrentHashMap zzz = new ConcurrentHashMap();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzr zzc;
    public final zzcgy zzd;
    public final zzbkp zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzad zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final VersionInfoParcel zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzl zzo;
    public final zzbkn zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final zzczb zzt;
    public final zzdgv zzu;
    public final zzbvb zzv;
    public final boolean zzw;
    public final long zzx;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbkn zzbknVar, zzbkp zzbkpVar, zzad zzadVar, zzcgy zzcgyVar, boolean z10, int i10, String str, VersionInfoParcel versionInfoParcel, zzdgv zzdgvVar, zzbvb zzbvbVar, boolean z11) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzp = zzbknVar;
        this.zze = zzbkpVar;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgvVar;
        this.zzv = zzbvbVar;
        this.zzw = z11;
        this.zzx = zzy.getAndIncrement();
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) zzbd.zzc().zzd(zzbeu.zznW)).booleanValue()) {
                return null;
            }
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder zzc(Object obj) {
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zznW)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.wrap(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i10, false);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 3, zzc(zzaVar), false);
        zzr zzrVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 4, zzc(zzrVar), false);
        zzcgy zzcgyVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, zzc(zzcgyVar), false);
        zzbkp zzbkpVar = this.zze;
        SafeParcelWriter.writeIBinder(parcel, 6, zzc(zzbkpVar), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        zzad zzadVar = this.zzi;
        SafeParcelWriter.writeIBinder(parcel, 10, zzc(zzadVar), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i10, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i10, false);
        zzbkn zzbknVar = this.zzp;
        SafeParcelWriter.writeIBinder(parcel, 18, zzc(zzbknVar), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 24, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        zzczb zzczbVar = this.zzt;
        SafeParcelWriter.writeIBinder(parcel, 26, zzc(zzczbVar), false);
        zzdgv zzdgvVar = this.zzu;
        SafeParcelWriter.writeIBinder(parcel, 27, zzc(zzdgvVar), false);
        zzbvb zzbvbVar = this.zzv;
        SafeParcelWriter.writeIBinder(parcel, 28, zzc(zzbvbVar), false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzw);
        long j10 = this.zzx;
        SafeParcelWriter.writeLong(parcel, 30, j10);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zznW)).booleanValue()) {
            zzz.put(Long.valueOf(j10), new zzp(zzaVar, zzrVar, zzcgyVar, zzbknVar, zzbkpVar, zzadVar, zzczbVar, zzdgvVar, zzbvbVar, zzcbv.zzd.schedule(new zzq(j10), ((Integer) zzbd.zzc().zzd(zzbeu.zznY)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbkn zzbknVar, zzbkp zzbkpVar, zzad zzadVar, zzcgy zzcgyVar, boolean z10, int i10, String str, String str2, VersionInfoParcel versionInfoParcel, zzdgv zzdgvVar, zzbvb zzbvbVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzp = zzbknVar;
        this.zze = zzbkpVar;
        this.zzf = str2;
        this.zzg = z10;
        this.zzh = str;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgvVar;
        this.zzv = zzbvbVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcgy zzcgyVar, int i10, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzczb zzczbVar, zzbvb zzbvbVar, String str5) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzba)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i10;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = str;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = null;
        this.zzs = str4;
        this.zzt = zzczbVar;
        this.zzu = null;
        this.zzv = zzbvbVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcgy zzcgyVar, boolean z10, int i10, VersionInfoParcel versionInfoParcel, zzdgv zzdgvVar, zzbvb zzbvbVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z10;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = i10;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgvVar;
        this.zzv = zzbvbVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, VersionInfoParcel versionInfoParcel, String str4, com.google.android.gms.ads.internal.zzl zzlVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z11, long j10) {
        this.zza = zzcVar;
        this.zzf = str;
        this.zzg = z10;
        this.zzh = str2;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = str3;
        this.zzm = versionInfoParcel;
        this.zzn = str4;
        this.zzo = zzlVar;
        this.zzq = str5;
        this.zzr = str6;
        this.zzs = str7;
        this.zzw = z11;
        this.zzx = j10;
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zznW)).booleanValue()) {
            zzp zzpVar = (zzp) zzz.remove(Long.valueOf(j10));
            if (zzpVar != null) {
                this.zzb = zzpVar.zza();
                this.zzc = zzpVar.zzb();
                this.zzd = zzpVar.zzc();
                this.zzp = zzpVar.zzd();
                this.zze = zzpVar.zze();
                this.zzt = zzpVar.zzg();
                this.zzu = zzpVar.zzh();
                this.zzv = zzpVar.zzi();
                this.zzi = zzpVar.zzf();
                zzpVar.zzj().cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcgy) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbkn) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbkp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzi = (zzad) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzt = (zzczb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzu = (zzdgv) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzv = (zzbvb) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, zzcgy zzcgyVar, zzdgv zzdgvVar, String str) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzadVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = zzdgvVar;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcgy zzcgyVar, int i10, VersionInfoParcel versionInfoParcel) {
        this.zzc = zzrVar;
        this.zzd = zzcgyVar;
        this.zzj = 1;
        this.zzm = versionInfoParcel;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = null;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcgy zzcgyVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i10, zzbvb zzbvbVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcgyVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = versionInfoParcel;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzr = str2;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = zzbvbVar;
        this.zzw = false;
        this.zzx = zzy.getAndIncrement();
    }
}
