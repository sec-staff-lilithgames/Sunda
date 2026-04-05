package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzakz {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;

    private zzakz(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = i16;
        this.zzh = i17;
        this.zzi = i18;
        this.zzj = i19;
        this.zzk = i20;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzakz zza(String str) {
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i11 != -1) {
                    return new zzakz(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, length);
                }
                return null;
            }
            String strZza = zzglm.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case -1178781136:
                    if (!strZza.equals(TtmlNode.ITALIC)) {
                        break;
                    } else {
                        i17 = i10;
                        break;
                    }
                case -1026963764:
                    if (!strZza.equals(TtmlNode.UNDERLINE)) {
                        break;
                    } else {
                        i18 = i10;
                        break;
                    }
                case -192095652:
                    if (!strZza.equals("strikeout")) {
                        break;
                    } else {
                        i19 = i10;
                        break;
                    }
                case -70925746:
                    if (!strZza.equals("primarycolour")) {
                        break;
                    } else {
                        i13 = i10;
                        break;
                    }
                case 3029637:
                    if (!strZza.equals(TtmlNode.BOLD)) {
                        break;
                    } else {
                        i16 = i10;
                        break;
                    }
                case 3373707:
                    if (!strZza.equals("name")) {
                        break;
                    } else {
                        i11 = i10;
                        break;
                    }
                case 366554320:
                    if (!strZza.equals("fontsize")) {
                        break;
                    } else {
                        i15 = i10;
                        break;
                    }
                case 767321349:
                    if (!strZza.equals("borderstyle")) {
                        break;
                    } else {
                        i20 = i10;
                        break;
                    }
                case 1767875043:
                    if (!strZza.equals("alignment")) {
                        break;
                    } else {
                        i12 = i10;
                        break;
                    }
                case 1988365454:
                    if (!strZza.equals("outlinecolour")) {
                        break;
                    } else {
                        i14 = i10;
                        break;
                    }
            }
            i10++;
        }
    }
}
