package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfnm {
    private final Map zza;
    private final zzfon zzb;
    private final zzfnv zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final Clock zzg;
    private AtomicInteger zzh;

    public zzfnm(zzfon zzfonVar, zzfnv zzfnvVar, Context context, Clock clock) {
        HashMap map = new HashMap();
        this.zza = map;
        map.put(AdFormat.APP_OPEN_AD, new HashMap());
        map.put(AdFormat.INTERSTITIAL, new HashMap());
        map.put(AdFormat.REWARDED, new HashMap());
        this.zzb = zzfonVar;
        this.zzc = zzfnvVar;
        this.zzd = context;
        this.zzg = clock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzx)).booleanValue()) {
            zzl(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z10) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzfom zzfomVar : ((Map) it.next()).values()) {
                    if (z10) {
                        zzfomVar.zzh();
                    } else {
                        zzfomVar.zzg();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized Object zzo(Class cls, AdFormat adFormat, String str) {
        zzfnv zzfnvVar = this.zzc;
        Clock clock = this.zzg;
        zzfnvVar.zze(clock.currentTimeMillis(), "2");
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return null;
        }
        zzfom zzfomVar = (zzfom) ((Map) map.get(adFormat)).get(str);
        if (zzfomVar != null && adFormat.equals(zzfomVar.zzm())) {
            zzfob zzfobVar = new zzfob(zzfomVar.zze.zza, zzfomVar.zzm());
            zzfobVar.zza(str);
            zzfoc zzfocVar = new zzfoc(zzfobVar, null);
            zzfnvVar.zzf(clock.currentTimeMillis(), zzfocVar, zzfomVar.zze.zzd, zzfomVar.zzn(), "2");
            try {
                String strZzi = zzfomVar.zzi();
                Object objZze = zzfomVar.zze();
                Object objCast = objZze == null ? null : cls.cast(objZze);
                if (objCast != null) {
                    zzfnvVar.zzh(clock.currentTimeMillis(), zzfomVar.zze.zzd, zzfomVar.zzn(), strZzi, zzfocVar, "2");
                }
                return objCast;
            } catch (ClassCastException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PreloadAdManager.pollAd");
                com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(AdFormat adFormat) {
        int size;
        int iOrdinal;
        try {
            Map map = this.zza;
            size = map.containsKey(adFormat) ? ((Map) map.get(adFormat)).size() : 0;
            iOrdinal = adFormat.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfd)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfc)).intValue(), 1) : Math.max(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfb)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        zzfom zzfomVarZzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e10) {
                                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                            }
                        }
                    }
                }
                if (!PlatformVersion.isAtLeastO() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzF)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfnk(this));
                    } catch (RuntimeException e11) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                        this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzF)).intValue());
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfnl(this));
            }
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat) && !((Map) map.get(adFormat)).containsKey(str) && zzp(adFormat) && (zzfomVarZzb = this.zzb.zzb(str, zzftVar, zzchVar)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfomVarZzb.zzk(atomicInteger.get());
                    }
                    zzfnv zzfnvVar = this.zzc;
                    zzfomVarZzb.zzj(zzfnvVar);
                    zzfomVarZzb.zzc();
                    ((Map) map.get(adFormat)).put(str, zzfomVarZzb);
                    zzfob zzfobVar = new zzfob(zzftVar.zza, adFormat);
                    zzfobVar.zza(str);
                    zzfnvVar.zza(zzftVar.zzd, this.zzg.currentTimeMillis(), new zzfoc(zzfobVar, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzb(AdFormat adFormat, String str) {
        zzfoc zzfocVar;
        try {
            Clock clock = this.zzg;
            long jCurrentTimeMillis = clock.currentTimeMillis();
            Map map = this.zza;
            int iZzn = 0;
            if (!map.containsKey(adFormat)) {
                return false;
            }
            zzfom zzfomVar = (zzfom) ((Map) map.get(adFormat)).get(str);
            String strZzi = zzfomVar == null ? null : zzfomVar.zzi();
            boolean z10 = strZzi != null && adFormat.equals(zzfomVar.zzm());
            Long lValueOf = z10 ? Long.valueOf(clock.currentTimeMillis()) : null;
            if (zzfomVar == null) {
                zzfocVar = null;
            } else {
                zzfob zzfobVar = new zzfob(zzfomVar.zze.zza, adFormat);
                zzfobVar.zza(str);
                zzfocVar = new zzfoc(zzfobVar, null);
            }
            zzfnv zzfnvVar = this.zzc;
            int i10 = zzfomVar == null ? 0 : zzfomVar.zze.zzd;
            if (zzfomVar != null) {
                iZzn = zzfomVar.zzn();
            }
            zzfnvVar.zzd(i10, iZzn, jCurrentTimeMillis, lValueOf, strZzi, zzfocVar, "2");
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzbyo zzc(String str) {
        return (zzbyo) zzo(zzbyo.class, AdFormat.REWARDED, str);
    }

    public final synchronized zzbcn zzd(String str) {
        return (zzbcn) zzo(zzbcn.class, AdFormat.APP_OPEN_AD, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zze(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzo(com.google.android.gms.ads.internal.client.zzbx.class, AdFormat.INTERSTITIAL, str);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzft zzf(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (map.containsKey(adFormat)) {
            zzfom zzfomVar = (zzfom) ((Map) map.get(adFormat)).get(str);
            this.zzc.zzo(this.zzg.currentTimeMillis(), str, zzfomVar == null ? null : zzfomVar.zze.zza, adFormat, zzfomVar == null ? -1 : zzfomVar.zze.zzd, zzfomVar != null ? zzfomVar.zzn() : -1);
            if (zzfomVar != null) {
                return zzfomVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(AdFormat adFormat, String str) {
        Map map = this.zza;
        if (!map.containsKey(adFormat)) {
            return 0;
        }
        zzfom zzfomVar = (zzfom) ((Map) map.get(adFormat)).get(str);
        int iZzn = zzfomVar != null ? zzfomVar.zzn() : 0;
        this.zzc.zzp(iZzn, this.zzg.currentTimeMillis(), str, zzfomVar == null ? null : zzfomVar.zze.zza, adFormat, zzfomVar == null ? -1 : zzfomVar.zze.zzd);
        return iZzn;
    }

    public final synchronized Map zzh(int i10) {
        try {
            HashMap map = new HashMap();
            AdFormat adFormat = AdFormat.getAdFormat(i10);
            if (adFormat != null) {
                Map map2 = this.zza;
                if (map2.containsKey(adFormat)) {
                    for (zzfom zzfomVar : ((Map) map2.get(adFormat)).values()) {
                        map.put(zzfomVar.zzl(), zzfomVar.zze);
                    }
                    this.zzc.zzn(adFormat, this.zzg.currentTimeMillis(), map.size());
                    return map;
                }
            }
            return map;
        } finally {
        }
    }

    public final synchronized boolean zzi(AdFormat adFormat, String str) {
        zzfom zzfomVar;
        Map map = this.zza;
        if (map.containsKey(adFormat) && (zzfomVar = (zzfom) ((Map) map.get(adFormat)).get(str)) != null) {
            ((Map) map.get(adFormat)).remove(str);
            zzfomVar.zzf();
            zzfomVar.zzo();
            zzfnv zzfnvVar = this.zzc;
            long jCurrentTimeMillis = this.zzg.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzft zzftVar = zzfomVar.zze;
            zzfnvVar.zzm(jCurrentTimeMillis, str, zzftVar.zza, adFormat, zzftVar.zzd, zzfomVar.zzn());
            return true;
        }
        return false;
    }

    public final synchronized void zzj(int i10) {
        try {
            AdFormat adFormat = AdFormat.getAdFormat(i10);
            if (adFormat != null) {
                Map map = this.zza;
                if (map.containsKey(adFormat)) {
                    Map map2 = (Map) map.get(adFormat);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfom zzfomVar = (zzfom) map2.get(str);
                        if (zzfomVar != null) {
                            zzfomVar.zzf();
                            zzfomVar.zzo();
                            String strValueOf = String.valueOf(str);
                            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Destroyed ad preloader for preloadId: ".concat(strValueOf));
                        }
                    }
                    map2.clear();
                    String strConcat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
                    this.zzc.zzl(this.zzg.currentTimeMillis(), adFormat, size);
                }
            }
        } finally {
        }
    }
}
