package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzfrl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzek {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final Set zzh;
    private final Bundle zzi;
    private final Set zzj;
    private final boolean zzk;
    private final String zzl;
    private final int zzm;
    private long zzn = 0;
    private long zzo;

    public zzek(zzej zzejVar, zzfrl zzfrlVar) {
        this.zzo = 0L;
        this.zza = zzejVar.zzx();
        this.zzb = zzejVar.zzy();
        this.zzc = Collections.unmodifiableSet(zzejVar.zzr());
        this.zzd = zzejVar.zzs();
        Collections.unmodifiableMap(zzejVar.zzt());
        this.zze = zzejVar.zzz();
        this.zzf = zzejVar.zzA();
        this.zzg = zzejVar.zzB();
        this.zzh = Collections.unmodifiableSet(zzejVar.zzu());
        this.zzi = zzejVar.zzv();
        this.zzj = Collections.unmodifiableSet(zzejVar.zzw());
        this.zzk = zzejVar.zzC();
        this.zzl = zzejVar.zzD();
        this.zzm = zzejVar.zzE();
        this.zzo = zzejVar.zzF();
    }

    public final String zza() {
        return this.zza;
    }

    public final List zzb() {
        return new ArrayList(this.zzb);
    }

    public final Set zzc() {
        return this.zzc;
    }

    public final Bundle zzd(Class cls) {
        return this.zzd.getBundle(cls.getName());
    }

    public final Bundle zze(Class cls) {
        Bundle bundle = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final boolean zzh(Context context) {
        RequestConfiguration requestConfigurationZzo = zzex.zzb().zzo();
        zzbb.zza();
        Set set = this.zzh;
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        return set.contains(strZzD) || requestConfigurationZzo.getTestDeviceIds().contains(strZzD);
    }

    public final Bundle zzi() {
        return this.zzd;
    }

    public final int zzj() {
        return this.zzg;
    }

    public final Bundle zzk() {
        return this.zzi;
    }

    public final Set zzl() {
        return this.zzj;
    }

    @Deprecated
    public final boolean zzm() {
        return this.zzk;
    }

    public final String zzn() {
        return this.zzl;
    }

    public final int zzo() {
        return this.zzm;
    }

    public final void zzp(long j10) {
        this.zzn = j10;
    }

    public final long zzq() {
        return this.zzn;
    }

    public final long zzr() {
        return this.zzo;
    }
}
