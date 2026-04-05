package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDebugProperties;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzem;
import com.google.android.gms.internal.gtm.zzfe;
import com.google.android.gms.internal.gtm.zzff;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class Tracker extends zzbr {
    private boolean zza;
    private final Map zzb;
    private final Map zzc;
    private final zzem zzd;
    private final zzv zze;
    private ExceptionReporter zzf;
    private zzfe zzg;

    public Tracker(zzbu zzbuVar, String str, zzem zzemVar) {
        super(zzbuVar);
        HashMap map = new HashMap();
        this.zzb = map;
        this.zzc = new HashMap();
        if (str != null) {
            map.put("&tid", str);
        }
        map.put(DtbDebugProperties.USE_SECURE, "1");
        map.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.zzd = new zzem(60, 2000L, "tracking", zzC());
        this.zze = new zzv(this, zzbuVar);
    }

    private static void zzY(Map map, Map map2) {
        Preconditions.checkNotNull(map2);
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String strZzn = zzn(entry);
            if (strZzn != null) {
                map2.put(strZzn, (String) entry.getValue());
            }
        }
    }

    private static String zzn(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (!str.startsWith(C3191e4.i.f36527c) || str.length() < 2) {
            return null;
        }
        return ((String) entry.getKey()).substring(1);
    }

    public void enableAdvertisingIdCollection(boolean z10) {
        this.zza = z10;
    }

    public void enableAutoActivityTracking(boolean z10) {
        this.zze.zzc(z10);
    }

    public void enableExceptionReporting(boolean z10) {
        synchronized (this) {
            try {
                ExceptionReporter exceptionReporter = this.zzf;
                if ((exceptionReporter != null) == z10) {
                    return;
                }
                if (z10) {
                    ExceptionReporter exceptionReporter2 = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), zzo());
                    this.zzf = exceptionReporter2;
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter2);
                    zzN("Uncaught exceptions will be reported to Google Analytics");
                } else {
                    Thread.setDefaultUncaughtExceptionHandler(exceptionReporter.zza());
                    zzN("Uncaught exceptions will not be reported to Google Analytics");
                }
            } finally {
            }
        }
    }

    public String get(String str) {
        zzV();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.zzb.containsKey(str)) {
            return (String) this.zzb.get(str);
        }
        if (str.equals("&ul")) {
            return zzff.zzd(Locale.getDefault());
        }
        if (str.equals("&cid")) {
            return zzv().zzb();
        }
        if (str.equals("&sr")) {
            return zzx().zzb();
        }
        if (str.equals("&aid")) {
            return zzu().zza().zzd();
        }
        if (str.equals("&an")) {
            return zzu().zza().zzf();
        }
        if (str.equals("&av")) {
            return zzu().zza().zzg();
        }
        if (str.equals("&aiid")) {
            return zzu().zza().zze();
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:62:0x0128
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[Catch: all -> 0x0123, TRY_ENTER, TryCatch #0 {all -> 0x0123, blocks: (B:38:0x00cd, B:54:0x0114, B:49:0x00f0, B:53:0x0109), top: B:66:0x00cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void send(java.util.Map<java.lang.String, java.lang.String> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.Tracker.send(java.util.Map):void");
    }

    public void set(String str, String str2) {
        Preconditions.checkNotNull(str, "Key should be non-null");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.put(str, str2);
    }

    public void setAnonymizeIp(boolean z10) {
        set("&aip", zzff.zzc(z10));
    }

    public void setAppId(String str) {
        set("&aid", str);
    }

    public void setAppInstallerId(String str) {
        set("&aiid", str);
    }

    public void setAppName(String str) {
        set("&an", str);
    }

    public void setAppVersion(String str) {
        set("&av", str);
    }

    public void setCampaignParamsOnNextHit(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            return;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        Uri uri2 = Uri.parse("http://hostname/?".concat(String.valueOf(queryParameter)));
        String queryParameter2 = uri2.getQueryParameter("utm_id");
        if (queryParameter2 != null) {
            this.zzc.put("&ci", queryParameter2);
        }
        String queryParameter3 = uri2.getQueryParameter("anid");
        if (queryParameter3 != null) {
            this.zzc.put("&anid", queryParameter3);
        }
        String queryParameter4 = uri2.getQueryParameter("utm_campaign");
        if (queryParameter4 != null) {
            this.zzc.put("&cn", queryParameter4);
        }
        String queryParameter5 = uri2.getQueryParameter("utm_content");
        if (queryParameter5 != null) {
            this.zzc.put("&cc", queryParameter5);
        }
        String queryParameter6 = uri2.getQueryParameter("utm_medium");
        if (queryParameter6 != null) {
            this.zzc.put("&cm", queryParameter6);
        }
        String queryParameter7 = uri2.getQueryParameter("utm_source");
        if (queryParameter7 != null) {
            this.zzc.put("&cs", queryParameter7);
        }
        String queryParameter8 = uri2.getQueryParameter("utm_term");
        if (queryParameter8 != null) {
            this.zzc.put("&ck", queryParameter8);
        }
        String queryParameter9 = uri2.getQueryParameter("dclid");
        if (queryParameter9 != null) {
            this.zzc.put("&dclid", queryParameter9);
        }
        String queryParameter10 = uri2.getQueryParameter("gclid");
        if (queryParameter10 != null) {
            this.zzc.put("&gclid", queryParameter10);
        }
        String queryParameter11 = uri2.getQueryParameter("aclid");
        if (queryParameter11 != null) {
            this.zzc.put("&aclid", queryParameter11);
        }
    }

    public void setClientId(String str) {
        set("&cid", str);
    }

    public void setEncoding(String str) {
        set("&de", str);
    }

    public void setHostname(String str) {
        set("&dh", str);
    }

    public void setLanguage(String str) {
        set("&ul", str);
    }

    public void setLocation(String str) {
        set("&dl", str);
    }

    public void setPage(String str) {
        set("&dp", str);
    }

    public void setReferrer(String str) {
        set("&dr", str);
    }

    public void setSampleRate(double d10) {
        set("&sf", Double.toString(d10));
    }

    public void setScreenColors(String str) {
        set("&sd", str);
    }

    public void setScreenName(String str) {
        set("&cd", str);
    }

    public void setScreenResolution(int i10, int i11) {
        if (i10 < 0 && i11 < 0) {
            zzQ("Invalid width or height. The values should be non-negative.");
            return;
        }
        set("&sr", i10 + "x" + i11);
    }

    public void setSessionTimeout(long j10) {
        this.zze.zze(j10 * 1000);
    }

    public void setTitle(String str) {
        set("&dt", str);
    }

    public void setUseSecure(boolean z10) {
        set(DtbDebugProperties.USE_SECURE, zzff.zzc(z10));
    }

    public void setViewportSize(String str) {
        set("&vp", str);
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zze.zzW();
        String strZza = zzB().zza();
        if (strZza != null) {
            set("&an", strZza);
        }
        String strZzb = zzB().zzb();
        if (strZzb != null) {
            set("&av", strZzb);
        }
    }

    public final void zzm(zzfe zzfeVar) {
        zzN("Loading Tracker config values");
        this.zzg = zzfeVar;
        String str = zzfeVar.zza;
        if (str != null) {
            set("&tid", str);
            zzO("trackingId loaded", str);
        }
        double d10 = zzfeVar.zzb;
        if (d10 >= 0.0d) {
            String string = Double.toString(d10);
            set("&sf", string);
            zzO("Sample frequency loaded", string);
        }
        int i10 = zzfeVar.zzc;
        if (i10 >= 0) {
            setSessionTimeout(i10);
            zzO("Session timeout loaded", Integer.valueOf(i10));
        }
        int i11 = zzfeVar.zzd;
        if (i11 != -1) {
            boolean z10 = 1 == i11;
            enableAutoActivityTracking(z10);
            zzO("Auto activity tracking loaded", Boolean.valueOf(z10));
        }
        int i12 = zzfeVar.zze;
        if (i12 != -1) {
            if (i12 != 0) {
                set("&aip", "1");
            }
            zzO("Anonymize ip loaded", Boolean.valueOf(1 == i12));
        }
        enableExceptionReporting(zzfeVar.zzf == 1);
    }
}
