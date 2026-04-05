package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.amazon.device.ads.DtbConstants;
import com.google.android.ump.ConsentInformation;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaq {
    static final zzdf zza = zzdf.zzj("IABTCF_TCString", DtbConstants.IABGPP_HDR_GppString, DtbConstants.IABGPP_GppSID, "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    public zzaq(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.EMPTY_SET));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final ConsentInformation.PrivacyOptionsRequirementStatus zzb() {
        return ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(this.zzc.getString("privacy_options_requirement_status", ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    public final Map zzc() {
        String string;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzdf.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap map = new HashMap();
        for (String str : stringSet) {
            Application application = this.zzb;
            zzcn zzcnVarZza = zzcp.zza(application, str);
            if (zzcnVarZza == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: ".concat(String.valueOf(str)));
            } else {
                Object obj = application.getSharedPreferences(zzcnVarZza.zza, 0).getAll().get(zzcnVarZza.zzb);
                if (obj == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: ".concat(String.valueOf(str)));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        Log.d("UserMessagingPlatform", "Failed to fetch stored info: ".concat(String.valueOf(str)));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).commit();
    }

    public final void zzg(int i10) {
        this.zzc.edit().putInt("consent_status", i10).commit();
    }

    public final void zzh(boolean z10) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z10).commit();
    }

    public final void zzi(ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus) {
        this.zzc.edit().putString("privacy_options_requirement_status", privacyOptionsRequirementStatus.name()).commit();
    }

    public final void zzj(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }

    public final void zze() {
        Application application = this.zzb;
        Set set = this.zzd;
        zzcp.zzb(application, set);
        set.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove(QCmNMSGd.ToztvqLfrPKYP).commit();
    }
}
