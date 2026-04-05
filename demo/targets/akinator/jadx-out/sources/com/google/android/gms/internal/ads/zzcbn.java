package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcbn implements zzbbo {
    final zzcbk zza;
    private final com.google.android.gms.ads.internal.util.zzg zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcbl zzf = new zzcbl();

    public zzcbn(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = new zzcbk(str, zzgVar);
        this.zze = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbo
    public final void zza(boolean z10) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (!z10) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zze;
            zzgVar.zzl(jCurrentTimeMillis);
            zzgVar.zzn(this.zza.zzd);
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zze;
        if (jCurrentTimeMillis - zzgVar2.zzm() > ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbm)).longValue()) {
            this.zza.zzd = -1;
        } else {
            this.zza.zzd = zzgVar2.zzo();
        }
        this.zzg = true;
    }

    public final void zzb(zzcbd zzcbdVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcbdVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, long j10) {
        synchronized (this.zzd) {
            this.zza.zze(zzmVar, j10);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int iZzd;
        synchronized (this.zzd) {
            iZzd = this.zza.zzd();
        }
        return iZzd;
    }

    public final zzcbd zzk(Clock clock, String str) {
        return new zzcbd(clock, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final String zzm() {
        return this.zzf.zzb();
    }

    public final Bundle zzn(Context context, zzfhv zzfhvVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcbd) it2.next()).zzi());
        }
        bundle.putParcelableArrayList(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, arrayList);
        zzfhvVar.zzb(hashSet);
        return bundle;
    }
}
