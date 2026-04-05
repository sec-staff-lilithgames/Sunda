package com.google.android.gms.ads.internal.client;

import a.b;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzgmu;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.ads.beta.xyn.RnJusJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zze;
    private zzep zzb;
    private zzfb zzc;
    private zzeo zzd;
    private zzdb zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();
    private OnAdInspectorClosedListener zzm = null;
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbnw zzbnwVar = (zzbnw) it.next();
            map.put(zzbnwVar.zza, new zzboe(zzbnwVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbnwVar.zzd, zzbnwVar.zzc));
        }
        return new zzbof(map);
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzl.zzr(new zzfv(requestConfiguration));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
        }
    }

    private final void zzC(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zzb(), context).zzd(context, false);
        }
    }

    private final void zzD(String str) {
        try {
            this.zzl.zze();
            this.zzl.zzj(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public static zzex zzb() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (zze == null) {
                    zze = new zzex();
                }
                zzexVar = zze;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzexVar;
    }

    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.zzb;
        }
        if (iOrdinal == 2) {
            return this.zzc;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:50:0x00e8, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:58:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzex.zzc(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    public final Status zzd(Context context, List list, PreloadCallback preloadCallback) {
        Status status;
        boolean z10 = false;
        zzbeu.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strValueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            String strO = b.o(new StringBuilder(strValueOf.length() + 1 + String.valueOf(adUnitId).length()), strValueOf, "#", adUnitId);
            map.put(strO, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map, strO, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z10 = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z10 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put((EnumMap) AdFormat.APP_OPEN_AD, (AdFormat) zzbd.zzc().zzd(zzbeu.zzfd));
        enumMap.put((EnumMap) AdFormat.INTERSTITIAL, (AdFormat) zzbd.zzc().zzd(zzbeu.zzfb));
        enumMap.put((EnumMap) AdFormat.REWARDED, (AdFormat) zzbd.zzc().zzd(zzbeu.zzfc));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            Integer num = (Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0);
            if (iIntValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb2.append((String) it4.next());
                if (it4.hasNext()) {
                    sb2.append(", ");
                }
            }
            String string = sb2.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
            status = new Status(13, string);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzt(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzeq(this, preloadCallback));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e10);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final void zze(float f10) {
        boolean z10 = true;
        Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzl.zzf(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e10);
            }
        }
    }

    public final float zzf() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            float fZzk = 1.0f;
            if (zzdbVar == null) {
                return 1.0f;
            }
            try {
                fZzk = zzdbVar.zzk();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e10);
            }
            return fZzk;
        }
    }

    public final void zzg(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzl.zzh(z10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e10);
            }
        }
    }

    public final boolean zzh() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            boolean zZzl = false;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zZzl = zzdbVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e10);
            }
            return zZzl;
        }
    }

    public final void zzi(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzl.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzj(Class cls) {
        synchronized (this.zzk) {
            try {
                this.zzl.zzn(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus zzk() {
        InitializationStatus initializationStatusZzA;
        synchronized (this.zzk) {
            try {
                Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    initializationStatusZzA = zzA(this.zzl.zzq());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final /* synthetic */ Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new zzer(this.zza));
                            return map;
                        }
                    };
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return initializationStatusZzA;
    }

    public final void zzl(Context context) {
        synchronized (this.zzk) {
            zzC(context);
            try {
                this.zzl.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzm(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            zzC(context);
            this.zzm = onAdInspectorClosedListener;
            try {
                this.zzl.zzt(new zzev(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final RequestConfiguration zzo() {
        return this.zzn;
    }

    public final void zzp(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzn;
                this.zzn = requestConfiguration;
                if (this.zzl == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzB(requestConfiguration);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzq(boolean z10) {
        synchronized (this.zzk) {
            try {
                Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.zzl.zzu(z10);
                } catch (RemoteException e10) {
                    String str = z10 ? a.f37604j : "disable";
                    StringBuilder sb2 = new StringBuilder(str.length() + 40);
                    sb2.append("Unable to ");
                    sb2.append(str);
                    sb2.append(" the publisher first-party ID.");
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2.toString(), e10);
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    public final void zzr(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzl.zzv(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e10);
            }
        }
    }

    public final /* synthetic */ void zzs(String str) {
        synchronized (this.zzk) {
            zzD(null);
        }
    }

    public final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzD(null);
        }
    }

    public final /* synthetic */ Object zzv() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzw() {
        return this.zzh;
    }

    public final /* synthetic */ void zzx(boolean z10) {
        this.zzi = false;
    }

    public final /* synthetic */ void zzy(boolean z10) {
        this.zzj = true;
    }

    public final /* synthetic */ OnAdInspectorClosedListener zzz() {
        return this.zzm;
    }

    public final String zzn() {
        String strZza;
        synchronized (this.zzk) {
            try {
                Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    strZza = zzgmu.zza(this.zzl.zzm());
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e10);
                    return RnJusJ.NVOmNgbX;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strZza;
    }
}
