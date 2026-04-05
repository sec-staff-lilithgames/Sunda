package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgkn {
    public static final /* synthetic */ int zzb = 0;
    private static final zzglf zzc = new zzglf("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzgle zza;
    private final String zze;

    public zzgkn(Context context) {
        if (zzglh.zza(context)) {
            this.zza = new zzgle(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, zzgjy.zza);
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    private static boolean zzh(String str) {
        return zzgmu.zza(str).trim().isEmpty();
    }

    private static void zzi(String str, zzgkm zzgkmVar) {
        if (zzh(str)) {
            return;
        }
        str.getClass();
        zzgkmVar.zza(str.trim());
    }

    private static boolean zzj(zzgks zzgksVar, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!zzh((String) it.next())) {
                return true;
            }
        }
        zzc.zzc(str, new Object[0]);
        zzgkq zzgkqVarZzd = zzgkr.zzd();
        zzgkqVarZzd.zzc(0);
        zzgkqVarZzd.zza(8160);
        zzgksVar.zza(zzgkqVarZzd.zzd());
        return false;
    }

    public final void zza(final zzgkp zzgkpVar, final zzgks zzgksVar) {
        zzgle zzgleVar = this.zza;
        if (zzgleVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgksVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, zzgkpVar.zzb()))) {
            zzgleVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zze(zzgkpVar, zzgksVar);
                }
            });
        }
    }

    public final void zzb(final zzgju zzgjuVar, final zzgks zzgksVar) {
        zzgle zzgleVar = this.zza;
        if (zzgleVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgksVar, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(zzgjuVar.zza(), zzgjuVar.zzb()))) {
            zzgleVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(zzgjuVar, zzgksVar);
                }
            });
        }
    }

    public final void zzc(final zzgku zzgkuVar, final zzgks zzgksVar, final int i10) {
        zzgle zzgleVar = this.zza;
        if (zzgleVar == null) {
            zzc.zzc("error: %s", "Play Store not found.");
        } else if (zzj(zzgksVar, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(zzgkuVar.zza(), zzgkuVar.zzb()))) {
            zzgleVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgkuVar, i10, zzgksVar);
                }
            });
        }
    }

    public final void zzd() {
        zzgle zzgleVar = this.zza;
        if (zzgleVar == null) {
            return;
        }
        zzc.zza("unbind LMD display overlay service", new Object[0]);
        zzgleVar.zzb();
    }

    public final /* synthetic */ void zze(zzgkp zzgkpVar, zzgks zzgksVar) {
        try {
            zzgle zzgleVar = this.zza;
            if (zzgleVar == null) {
                throw null;
            }
            zzgji zzgjiVar = (zzgji) zzgleVar.zzc();
            if (zzgjiVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", zzgkpVar.zza());
            zzi(zzgkpVar.zzj(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkc
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", zzgkpVar.zzc());
            bundle.putFloat("layoutVerticalMargin", zzgkpVar.zzd());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", zzgkpVar.zzh());
            zzi(null, new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkd
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            zzi(null, new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgke
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgkpVar.zzb(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkf
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzi(null, new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkg
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            zzgjiVar.zze(str, bundle, new zzgkl(this, zzgksVar));
        } catch (RemoteException e10) {
            zzc.zzd(e10, "show overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzf(zzgju zzgjuVar, zzgks zzgksVar) {
        try {
            zzgle zzgleVar = this.zza;
            if (zzgleVar == null) {
                throw null;
            }
            zzgji zzgjiVar = (zzgji) zzgleVar.zzc();
            if (zzgjiVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            zzi(zzgjuVar.zza(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkh
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgjuVar.zzb(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgki
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i10 = zzgkn.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgjiVar.zzf(bundle, new zzgkl(this, zzgksVar));
        } catch (RemoteException e10) {
            zzc.zzd(e10, "dismiss overlay display from: %s", this.zze);
        }
    }

    public final /* synthetic */ void zzg(zzgku zzgkuVar, int i10, zzgks zzgksVar) {
        try {
            zzgle zzgleVar = this.zza;
            if (zzgleVar == null) {
                throw null;
            }
            zzgji zzgjiVar = (zzgji) zzgleVar.zzc();
            if (zzgjiVar == null) {
                return;
            }
            String str = this.zze;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i10);
            zzi(zzgkuVar.zza(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgkj
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i11 = zzgkn.zzb;
                    bundle.putString("sessionToken", str2);
                }
            });
            zzi(zzgkuVar.zzb(), new zzgkm() { // from class: com.google.android.gms.internal.ads.zzgka
                @Override // com.google.android.gms.internal.ads.zzgkm
                public final /* synthetic */ void zza(String str2) {
                    int i11 = zzgkn.zzb;
                    bundle.putString("appId", str2);
                }
            });
            zzgjiVar.zzg(bundle, new zzgkl(this, zzgksVar));
        } catch (RemoteException e10) {
            zzc.zzd(e10, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i10), this.zze);
        }
    }
}
