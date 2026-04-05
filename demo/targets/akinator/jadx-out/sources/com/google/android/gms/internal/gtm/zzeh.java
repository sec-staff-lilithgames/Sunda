package com.google.android.gms.internal.gtm;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Segment;
import com.sfbx.appconsent.core.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeh {
    public static final zzeg zzA;
    public static final zzeg zzB;
    public static final zzeg zzC;
    public static final zzeg zzD;
    public static final zzeg zzE;
    public static final zzeg zzF;
    public static final zzeg zza;
    public static final zzeg zzb;
    public static final zzeg zzc;
    public static final zzeg zzd;
    public static final zzeg zze;
    public static final zzeg zzf;
    public static final zzeg zzg;
    public static final zzeg zzh;
    public static final zzeg zzi;
    public static final zzeg zzj;
    public static final zzeg zzk;
    public static final zzeg zzl;
    public static final zzeg zzm;
    public static final zzeg zzn;
    public static final zzeg zzo;
    public static final zzeg zzp;
    public static final zzeg zzq;
    public static final zzeg zzr;
    public static final zzeg zzs;
    public static final zzeg zzt;
    public static final zzeg zzu;
    public static final zzeg zzv;
    public static final zzeg zzw;
    public static final zzeg zzx;
    public static final zzeg zzy;
    public static final zzeg zzz;

    static {
        Collections.synchronizedSet(new HashSet());
        Boolean bool = Boolean.TRUE;
        zza = zzeg.zza(bool, bool, new zzef() { // from class: com.google.android.gms.internal.gtm.zzda
        });
        zzb = zzeg.zza("GAv4", "GAv4-SVC", new zzef() { // from class: com.google.android.gms.internal.gtm.zzdj
        });
        zzc = zzeg.zza(2000, 20000, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdu
        });
        zzd = zzeg.zza(100, 100, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdw
        });
        zze = zzeg.zza(1800000L, Long.valueOf(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS), new zzef() { // from class: com.google.android.gms.internal.gtm.zzdx
        });
        zzf = zzeg.zza(5000L, 5000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdy
        });
        zzg = zzeg.zza(7200000L, 7200000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdv
        });
        zzh = zzeg.zza(32400000L, 32400000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdz
        });
        zzi = zzeg.zza(20, 20, new zzef() { // from class: com.google.android.gms.internal.gtm.zzea
        });
        zzj = zzeg.zza(20, 20, new zzef() { // from class: com.google.android.gms.internal.gtm.zzeb
        });
        zzef zzefVar = new zzef() { // from class: com.google.android.gms.internal.gtm.zzec
        };
        String str = QCmNMSGd.ggjAxVMWbm;
        zzk = zzeg.zza(str, str, zzefVar);
        zzl = zzeg.zza("https://ssl.google-analytics.com", "https://ssl.google-analytics.com", new zzef() { // from class: com.google.android.gms.internal.gtm.zzed
        });
        zzm = zzeg.zza("/collect", "/collect", new zzef() { // from class: com.google.android.gms.internal.gtm.zzee
        });
        zzn = zzeg.zza("/batch", "/batch", new zzef() { // from class: com.google.android.gms.internal.gtm.zzcz
        });
        zzo = zzeg.zza(2036, 2036, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdb
        });
        zzp = zzeg.zza("BATCH_BY_COUNT", "BATCH_BY_COUNT", new zzef() { // from class: com.google.android.gms.internal.gtm.zzdc
        });
        zzq = zzeg.zza("GZIP", "GZIP", new zzef() { // from class: com.google.android.gms.internal.gtm.zzdd
        });
        Integer numValueOf = Integer.valueOf(Segment.SIZE);
        zzr = zzeg.zza(numValueOf, numValueOf, new zzef() { // from class: com.google.android.gms.internal.gtm.zzde
        });
        zzs = zzeg.zza(numValueOf, numValueOf, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdf
        });
        zzt = zzeg.zza(numValueOf, numValueOf, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdg
        });
        zzu = zzeg.zza("404,502", "404,502", new zzef() { // from class: com.google.android.gms.internal.gtm.zzdh
        });
        Integer numValueOf2 = Integer.valueOf(BuildConfig.VERSION_CODE);
        zzv = zzeg.zza(numValueOf2, numValueOf2, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdi
        });
        Integer numValueOf3 = Integer.valueOf(DtbConstants.NETWORK_READ_TIMEOUT);
        zzw = zzeg.zza(numValueOf3, numValueOf3, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdk
        });
        zzx = zzeg.zza(61000, 61000, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdl
        });
        zzy = zzeg.zza(86400000L, 86400000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdm
        });
        Boolean bool2 = Boolean.FALSE;
        zzz = zzeg.zza(bool2, bool2, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdn
        });
        zzA = zzeg.zza(10000L, 10000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdo
        });
        zzB = zzeg.zza(5000L, 5000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdp
        });
        zzC = zzeg.zza(1800000L, 1800000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdq
        });
        zzD = zzeg.zza(86400000L, 86400000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdr
        });
        zzE = zzeg.zza(5000L, 5000L, new zzef() { // from class: com.google.android.gms.internal.gtm.zzds
        });
        zzF = zzeg.zza(bool2, bool2, new zzef() { // from class: com.google.android.gms.internal.gtm.zzdt
        });
    }
}
