package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import nh.b5;
import nh.l6;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzof {
    static final b5 zza = b5.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        l6 l6Var2;
        String str4;
        zzoe zzoeVar;
        char c10;
        int iZze = zze(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iZze > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iZze] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (zzi(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                l6Var2 = l6Var;
                str4 = str;
                if (i17 == 1) {
                    if (l6Var2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                l6Var2 = l6Var;
                str4 = str;
            }
            if (m5Var.containsKey(zzkpVar) && (zzoeVar = (zzoe) m5Var.get(zzkpVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : zzg(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzkpVar, m5Var, m5Var2, l6Var2, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : zzh(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (zzi(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (zzi(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c10;
        return false;
    }

    public static final Map zzd(m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return m5.of();
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) m5Var2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) m5Var2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) m5Var2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) m5Var2.get(zzkpVar4);
        return m5.builder().put("Version", "2").put("VendorConsent", true != z10 ? "0" : "1").put("VendorLegitimateInterest", true != z11 ? "0" : "1").put("gdprApplies", i12 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").put("PolicyVersion", String.valueOf(i13)).put("CmpSdkID", String.valueOf(i10)).put("PurposeOneTreatment", i14 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(m5.of("Purpose1", zzf(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", zzf(zzkpVar2, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", zzf(zzkpVar3, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", zzf(zzkpVar4, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).putAll(m5.of("AuthorizePurpose1", (String) (true != zzc(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1"), "AuthorizePurpose3", (String) (true != zzc(zzkpVar2, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1"), "AuthorizePurpose4", (String) (true != zzc(zzkpVar3, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1"), "AuthorizePurpose7", true != zzc(zzkpVar4, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).buildOrThrow();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iZze = zze(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c10;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iZze = zze(zzkpVar, m5Var, m5Var2, l6Var, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c10;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, m5 m5Var, m5 m5Var2, l6 l6Var, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (com.google.android.gms.internal.measurement.zzkq) m5Var2.getOrDefault(zzkpVar, com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
