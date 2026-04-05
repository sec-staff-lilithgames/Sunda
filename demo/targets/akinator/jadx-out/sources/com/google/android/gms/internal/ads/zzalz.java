package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import e3.g;
import j1.o2;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzalz {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        o2.t(255, 255, 255, map, "white");
        o2.t(0, 255, 0, map, "lime");
        o2.t(0, 255, 255, map, "cyan");
        o2.t(255, 0, 0, map, "red");
        o2.t(255, 255, 0, map, "yellow");
        o2.t(255, 0, 255, map, "magenta");
        o2.t(0, 0, 255, map, "blue");
        o2.t(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        o2.t(255, 255, 255, map2, "bg_white");
        o2.t(0, 255, 0, map2, "bg_lime");
        o2.t(0, 255, 255, map2, "bg_cyan");
        o2.t(255, 0, 0, map2, "bg_red");
        o2.t(255, 255, 0, map2, "bg_yellow");
        o2.t(255, 0, 255, map2, "bg_magenta");
        o2.t(0, 0, 255, map2, "bg_blue");
        o2.t(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    public static zzalt zza(zzeg zzegVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzN = zzegVar.zzN(charset);
        if (strZzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzegVar, list);
            }
            String strZzN2 = zzegVar.zzN(charset);
            if (strZzN2 != null) {
                Matcher matcher2 = pattern.matcher(strZzN2);
                if (matcher2.matches()) {
                    return zzd(strZzN.trim(), matcher2, zzegVar, list);
                }
            }
        }
        return null;
    }

    public static zzcl zzb(String str) {
        zzaly zzalyVar = new zzaly();
        zze(str, zzalyVar);
        return zzalyVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString zzc(java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    private static zzalt zzd(String str, Matcher matcher, zzeg zzegVar, List list) {
        zzaly zzalyVar = new zzaly();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            zzalyVar.zza = zzamb.zza(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            zzalyVar.zzb = zzamb.zza(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zze(strGroup3, zzalyVar);
            StringBuilder sb2 = new StringBuilder();
            String strZzN = zzegVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzN)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strZzN.trim());
                strZzN = zzegVar.zzN(StandardCharsets.UTF_8);
            }
            zzalyVar.zzc = zzc(str, sb2.toString(), list);
            return new zzalt(zzalyVar.zza().zzr(), zzalyVar.zza, zzalyVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzdt.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0190 A[Catch: NumberFormatException -> 0x01bd, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01bd, blocks: (B:6:0x0026, B:9:0x003c, B:11:0x0044, B:33:0x0089, B:32:0x0081, B:34:0x008c, B:36:0x0094, B:38:0x009c, B:39:0x00a4, B:41:0x00ac, B:54:0x00d8, B:53:0x00cf, B:55:0x00dc, B:56:0x0101, B:58:0x0107, B:80:0x014f, B:79:0x0146, B:81:0x0155, B:82:0x015d, B:84:0x0163, B:100:0x0199, B:99:0x0190, B:101:0x019f, B:103:0x01a7, B:104:0x01b1), top: B:108:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zze(java.lang.String r16, com.google.android.gms.internal.ads.zzaly r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalz.zze(java.lang.String, com.google.android.gms.internal.ads.zzaly):void");
    }

    private static void zzf(String str, zzalw zzalwVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = zzalwVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzalwVar.zza;
        int iHashCode = str2.hashCode();
        int i11 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iZzg = zzg(list2, str, zzalwVar);
                        ArrayList arrayList = new ArrayList(list.size());
                        arrayList.addAll(list);
                        Collections.sort(arrayList, zzalv.zza);
                        int i12 = i10;
                        int i13 = 0;
                        int length2 = 0;
                        while (i13 < arrayList.size()) {
                            if ("rt".equals(((zzalv) arrayList.get(i13)).zzc().zza)) {
                                zzalv zzalvVar = (zzalv) arrayList.get(i13);
                                int iZzg2 = zzg(list2, str, zzalvVar.zzc());
                                if (iZzg2 == i11) {
                                    iZzg2 = iZzg != i11 ? iZzg : 1;
                                }
                                int i14 = zzalvVar.zzc().zzb - length2;
                                int iZzd = zzalvVar.zzd() - length2;
                                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i14, iZzd);
                                spannableStringBuilder.delete(i14, iZzd);
                                spannableStringBuilder.setSpan(new zzcr(charSequenceSubSequence.toString(), iZzg2), i12, i14, 33);
                                length2 += charSequenceSubSequence.length();
                                i12 = i14;
                            }
                            i13++;
                            i11 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)) {
                                return;
                            }
                            for (String str3 : zzalwVar.zzd) {
                                Map map = zzc;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                                } else {
                                    Map map2 = zzd;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION)) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new zzcu(zzalwVar.zzc), i10, length, 33);
                            }
                        } else if (!str2.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL)) {
                            return;
                        } else {
                            g.u(spannableStringBuilder, i10, length, 33);
                        }
                    } else if (!str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                        return;
                    } else {
                        g.s(1, spannableStringBuilder, i10, length, 33);
                    }
                } else if (!str2.equals(Q6.f35290q)) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                g.s(2, spannableStringBuilder, i10, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        List listZzh = zzh(list2, str, zzalwVar);
        for (int i15 = 0; i15 < listZzh.size(); i15++) {
            zzals zzalsVar = ((zzalx) listZzh.get(i15)).zzb;
            if (zzalsVar != null) {
                if (zzalsVar.zzf() != -1) {
                    zzcs.zza(spannableStringBuilder, new StyleSpan(zzalsVar.zzf()), i10, length, 33);
                }
                if (zzalsVar.zzg()) {
                    g.u(spannableStringBuilder, i10, length, 33);
                }
                if (zzalsVar.zzo()) {
                    zzcs.zza(spannableStringBuilder, new ForegroundColorSpan(zzalsVar.zzm()), i10, length, 33);
                }
                if (zzalsVar.zzr()) {
                    zzcs.zza(spannableStringBuilder, new BackgroundColorSpan(zzalsVar.zzp()), i10, length, 33);
                }
                if (zzalsVar.zzk() != null) {
                    zzcs.zza(spannableStringBuilder, new TypefaceSpan(zzalsVar.zzk()), i10, length, 33);
                }
                int iZzu = zzalsVar.zzu();
                if (iZzu == 1) {
                    zzcs.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalsVar.zzv(), true), i10, length, 33);
                } else if (iZzu == 2) {
                    zzcs.zza(spannableStringBuilder, new RelativeSizeSpan(zzalsVar.zzv()), i10, length, 33);
                } else if (iZzu == 3) {
                    zzcs.zza(spannableStringBuilder, new RelativeSizeSpan(zzalsVar.zzv() / 100.0f), i10, length, 33);
                }
                if (zzalsVar.zzz()) {
                    spannableStringBuilder.setSpan(new zzcq(), i10, length, 33);
                }
            }
        }
    }

    private static int zzg(List list, String str, zzalw zzalwVar) {
        List listZzh = zzh(list, str, zzalwVar);
        for (int i10 = 0; i10 < listZzh.size(); i10++) {
            zzals zzalsVar = ((zzalx) listZzh.get(i10)).zzb;
            if (zzalsVar.zzx() != -1) {
                return zzalsVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzalw zzalwVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzals zzalsVar = (zzals) list.get(i10);
            int iZze = zzalsVar.zze(str, zzalwVar.zza, zzalwVar.zzd, zzalwVar.zzc);
            if (iZze > 0) {
                arrayList.add(new zzalx(iZze, zzalsVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
