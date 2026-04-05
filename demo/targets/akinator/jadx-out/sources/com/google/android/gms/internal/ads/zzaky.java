package com.google.android.gms.internal.ads;

import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaky implements zzaki {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzakx zzc;
    private final zzeg zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzaky() {
        this(null);
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        String str2 = zzep.zza;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j10, List list, List list2) {
        int i10;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    @Override // com.google.android.gms.internal.ads.zzaki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzakh r26, com.google.android.gms.internal.ads.zzdg r27) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaky.zza(byte[], int, int, com.google.android.gms.internal.ads.zzakh, com.google.android.gms.internal.ads.zzdg):void");
    }

    public zzaky(List list) throws NumberFormatException {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzeg();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzi = zzep.zzi((byte[]) list.get(0));
        zzgmd.zza(strZzi.startsWith("Format:"));
        zzakx zzakxVarZza = zzakx.zza(strZzi);
        zzakxVarZza.getClass();
        this.zzc = zzakxVarZza;
        zzb(new zzeg((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private final void zzb(zzeg zzegVar, Charset charset) throws NumberFormatException {
        while (true) {
            String strZzN = zzegVar.zzN(charset);
            if (strZzN != null) {
                if ("[Script Info]".equalsIgnoreCase(strZzN)) {
                    while (true) {
                        String strZzN2 = zzegVar.zzN(charset);
                        if (strZzN2 == null || (zzegVar.zzd() != 0 && zzegVar.zzp(charset) == 91)) {
                            break;
                        }
                        String[] strArrSplit = strZzN2.split(":");
                        if (strArrSplit.length == 2) {
                            String strZza = zzglm.zza(strArrSplit[0].trim());
                            switch (strZza.hashCode()) {
                                case 1879649548:
                                    if (!strZza.equals("playresx")) {
                                        break;
                                    } else {
                                        this.zzf = Float.parseFloat(strArrSplit[1].trim());
                                        break;
                                    }
                                case 1879649549:
                                    if (!strZza.equals("playresy")) {
                                        break;
                                    } else {
                                        try {
                                            this.zzg = Float.parseFloat(strArrSplit[1].trim());
                                            break;
                                        } catch (NumberFormatException unused) {
                                            break;
                                        }
                                    }
                            }
                        }
                    }
                } else if ("[V4+ Styles]".equalsIgnoreCase(strZzN)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zzakz zzakzVarZza = null;
                    while (true) {
                        String strZzN3 = zzegVar.zzN(charset);
                        if (strZzN3 != null && (zzegVar.zzd() == 0 || zzegVar.zzp(charset) != 91)) {
                            if (strZzN3.startsWith("Format:")) {
                                zzakzVarZza = zzakz.zza(strZzN3);
                            } else if (strZzN3.startsWith(QFzuMMDfrzagDN.saBas)) {
                                if (zzakzVarZza == null) {
                                    zzdt.zzc("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzN3));
                                } else {
                                    zzalb zzalbVarZza = zzalb.zza(strZzN3, zzakzVarZza);
                                    if (zzalbVarZza != null) {
                                        linkedHashMap.put(zzalbVarZza.zza, zzalbVarZza);
                                    }
                                }
                            }
                        }
                    }
                    this.zze = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strZzN)) {
                    zzdt.zzb("SsaParser", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strZzN)) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
