package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzakx {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;

    private zzakx(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static zzakx zza(String str) {
        zzgmd.zza(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i10 >= length) {
                if (i12 == -1 || i13 == -1 || i15 == -1) {
                    return null;
                }
                return new zzakx(i11, i12, i13, i14, i15, length);
            }
            String strZza = zzglm.zza(strArrSplit[i10].trim());
            switch (strZza.hashCode()) {
                case 100571:
                    if (!strZza.equals(TtmlNode.END)) {
                        break;
                    } else {
                        i13 = i10;
                        break;
                    }
                case 3556653:
                    if (!strZza.equals("text")) {
                        break;
                    } else {
                        i15 = i10;
                        break;
                    }
                case 102749521:
                    if (!strZza.equals("layer")) {
                        break;
                    } else {
                        i11 = i10;
                        break;
                    }
                case 109757538:
                    if (!strZza.equals("start")) {
                        break;
                    } else {
                        i12 = i10;
                        break;
                    }
                case 109780401:
                    if (!strZza.equals(TtmlNode.TAG_STYLE)) {
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
