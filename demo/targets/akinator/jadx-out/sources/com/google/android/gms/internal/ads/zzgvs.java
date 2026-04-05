package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgvs implements zzgwf {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);
    private final InputStream zzb;

    private zzgvs(InputStream inputStream) {
        this.zzb = inputStream;
    }

    public static zzgvs zza(String str) {
        return new zzgvs(new ByteArrayInputStream(str.getBytes(zza)));
    }

    private static int zzc(zzhtg zzhtgVar) throws IOException {
        if (!(zzhtgVar instanceof zzhtk)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!zzhtgVar.zzg().zzc()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jZzc = zzhdv.zzc(zzhtgVar.zzg().zzh());
            if (jZzc > 4294967295L || jZzc < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jZzc;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01dc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, zzhtj -> 0x0039, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:13:0x003c, B:15:0x0053, B:17:0x005b, B:19:0x0065, B:21:0x006f, B:23:0x007b, B:25:0x0081, B:27:0x008f, B:29:0x0095, B:31:0x009b, B:33:0x00a1, B:35:0x00a9, B:51:0x00eb, B:56:0x0114, B:69:0x0137, B:71:0x0144, B:73:0x014a, B:75:0x0150, B:80:0x0191, B:93:0x01b4, B:84:0x019c, B:88:0x01a7, B:92:0x01b2, B:94:0x01d2, B:95:0x01db, B:96:0x01dc, B:97:0x01e3, B:60:0x011f, B:64:0x012a, B:68:0x0135, B:98:0x01e4, B:99:0x01ed, B:100:0x01ee, B:101:0x01f7, B:102:0x01f8, B:103:0x01ff, B:104:0x0200, B:105:0x0207, B:106:0x0208, B:109:0x0214, B:110:0x021b, B:111:0x021c, B:112:0x0223, B:113:0x0224, B:114:0x022b, B:115:0x022c, B:116:0x0231), top: B:119:0x0014 }] */
    @Override // com.google.android.gms.internal.ads.zzgwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzhlg zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgvs.zzb():com.google.android.gms.internal.ads.zzhlg");
    }
}
