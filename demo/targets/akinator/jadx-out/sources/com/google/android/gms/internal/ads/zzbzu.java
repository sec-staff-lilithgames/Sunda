package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.Y1;
import com.sfbx.appconsent.core.IABConstants;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbzu implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = Y1.f35726f;
    private int zze = -1;

    public zzbzu(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb(String str, int i10) {
        Context context;
        boolean z10 = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaQ)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i10 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals(Y1.f35726f)))) {
            z10 = false;
        }
        this.zzc.zzw(z10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue() && z10 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    private final void zzc() throws IOException {
        this.zzc.zzw(true);
        com.google.android.gms.ads.internal.util.zzac.zza(this.zza);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaS)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzc;
                    if (i10 != zzgVar.zzD()) {
                        zzc();
                    }
                    zzgVar.zzC(i10);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, Y1.f35726f);
                    com.google.android.gms.ads.internal.util.zzg zzgVar2 = this.zzc;
                    if (!Objects.equals(string, zzgVar2.zzB())) {
                        zzc();
                    }
                    zzgVar2.zzA(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString(IABConstants.PURPOSE_CONSENTS, Y1.f35726f);
            int i11 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals(IABConstants.PURPOSE_CONSENTS) || string2.equals(Y1.f35726f) || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzb(string2, i11);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaQ)).booleanValue() || i11 == -1 || this.zze == i11) {
                    return;
                }
                this.zze = i11;
                zzb(string2, i11);
            }
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }

    public final void zza() {
        SharedPreferences sharedPreferences = this.zzb;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaS)).booleanValue()) {
            onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(sharedPreferences, IABConstants.PURPOSE_CONSENTS);
        }
    }
}
