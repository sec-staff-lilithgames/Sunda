package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzafy {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static boolean zzb(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = zza;
        for (int i10 = 0; i10 < 4; i10++) {
            if (str.contains(String.valueOf(strArr[i10]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static zzgpe zzc(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i10 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeq.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzeq.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzeq.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzeq.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzeq.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzgpe.zzi();
                }
                zzgpbVar.zzf(new zzafw(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzeq.zza(xmlPullParser, str.concat(":Directory")));
        return zzgpbVar.zzi();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzafx zza(java.lang.String r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafy.zza(java.lang.String):com.google.android.gms.internal.ads.zzafx");
    }
}
