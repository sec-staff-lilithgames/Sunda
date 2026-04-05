package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzegz implements zzeha {
    public static /* synthetic */ zzehf zzl(String str, String str2, String str3, zzehb zzehbVar, String str4, WebView webView, String str5, String str6, zzehc zzehcVar) {
        zzfpi zzfpiVarZza = zzfpi.zza("Google", str2);
        zzfph zzfphVarZzn = zzn("javascript");
        zzfoz zzfozVarZzp = zzp(zzehbVar.toString());
        zzfph zzfphVar = zzfph.NONE;
        if (zzfphVarZzn == zzfphVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfozVarZzp == null) {
            String strValueOf = String.valueOf(zzehbVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfph zzfphVarZzn2 = zzn(str4);
        if (zzfozVarZzp != zzfoz.VIDEO || zzfphVarZzn2 != zzfphVar) {
            zzfow zzfowVarZza = zzfow.zza(zzfpiVarZza, webView, str5, "");
            return new zzehf(zzfou.zze(zzfov.zza(zzfozVarZzp, zzo(zzehcVar.toString()), zzfphVarZzn, zzfphVarZzn2, true), zzfowVarZza), zzfowVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzehf zzm(String str, String str2, String str3, String str4, zzehb zzehbVar, WebView webView, String str5, String str6, zzehc zzehcVar) {
        zzfpi zzfpiVarZza = zzfpi.zza(str, str2);
        zzfph zzfphVarZzn = zzn("javascript");
        zzfph zzfphVarZzn2 = zzn(str4);
        zzfoz zzfozVarZzp = zzp(zzehbVar.toString());
        zzfph zzfphVar = zzfph.NONE;
        if (zzfphVarZzn == zzfphVar) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfozVarZzp == null) {
            String strValueOf = String.valueOf(zzehbVar);
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfozVarZzp != zzfoz.VIDEO || zzfphVarZzn2 != zzfphVar) {
            zzfow zzfowVarZzb = zzfow.zzb(zzfpiVarZza, webView, str5, "");
            return new zzehf(zzfou.zze(zzfov.zza(zzfozVarZzp, zzo(zzehcVar.toString()), zzfphVarZzn, zzfphVarZzn2, true), zzfowVarZzb), zzfowVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfph zzn(String str) {
        return "native".equals(str) ? zzfph.NATIVE : "javascript".equals(str) ? zzfph.JAVASCRIPT : zzfph.NONE;
    }

    private static zzfpc zzo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfpc.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfpc.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfpc.BEGIN_TO_RENDER;
        }
        return zzfpc.UNSPECIFIED;
    }

    private static zzfoz zzp(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfoz.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzfoz.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfoz.NATIVE_DISPLAY;
        }
        return null;
    }

    private static final Object zzq(zzegy zzegyVar) {
        try {
            return zzegyVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzegy() { // from class: com.google.android.gms.internal.ads.zzegx
                @Override // com.google.android.gms.internal.ads.zzegy
                public final /* synthetic */ Object zza() {
                    if (zzfos.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfos.zza(context);
                    return Boolean.valueOf(zzfos.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue()) {
            return (String) zzq(zzego.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final zzehf zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzehc zzehcVar, final zzehb zzehbVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() || !zzfos.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzehf) zzq(new zzegy(str7, str, str6, zzehbVar, str4, webView, str5, str8, zzehcVar) { // from class: com.google.android.gms.internal.ads.zzegp
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzehb zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzehc zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzehbVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzehcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzegy
            public final /* synthetic */ Object zza() {
                return zzegz.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final zzehf zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzehc zzehcVar, final zzehb zzehbVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() || !zzfos.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzehf) zzq(new zzegy(str5, str, str8, str4, zzehbVar, webView, str6, str7, zzehcVar) { // from class: com.google.android.gms.internal.ads.zzegq
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzehb zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzehc zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzehbVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzehcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzegy
            public final /* synthetic */ Object zza() {
                return zzegz.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zze(final zzfou zzfouVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() && zzfos.zzb()) {
            Objects.requireNonNull(zzfouVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfouVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zzf(final zzfou zzfouVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() && zzfos.zzb()) {
                    zzfouVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zzg(final zzfou zzfouVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() && zzfos.zzb()) {
                    zzfouVar.zzd(view, zzfpb.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zzh(final zzfou zzfouVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfP)).booleanValue() && zzfos.zzb()) {
                    zzfouVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final zzfpg zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z10) {
        final boolean z11 = true;
        return (zzfpg) zzq(new zzegy(webView, z11) { // from class: com.google.android.gms.internal.ads.zzegu
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzegy
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i10 = versionInfoParcel2.buddyApkVersion;
                int i11 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 1 + String.valueOf(i11).length());
                sb2.append(i10);
                sb2.append(".");
                sb2.append(i11);
                return zzfpg.zza(zzfpi.zza("Google", sb2.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zzj(final zzfpg zzfpgVar, final zzfpf zzfpfVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfpgVar.zzb(zzfpfVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final void zzk(final zzfpg zzfpgVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfpgVar.zzd(view, zzfpb.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
