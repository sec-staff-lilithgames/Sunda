package com.google.android.gms.internal.ads;

import android.text.Layout;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzali implements zzaki {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalg zzh = new zzalg(30.0f, 1, 1);

    public zzali() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzep.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e A[Catch: zzake -> 0x0187, TryCatch #2 {zzake -> 0x0187, blocks: (B:35:0x00a7, B:37:0x00c3, B:40:0x00d9, B:42:0x00df, B:44:0x00e5, B:53:0x00fd, B:62:0x0118, B:64:0x011e, B:65:0x0127, B:66:0x0128, B:67:0x0145, B:57:0x0109, B:61:0x0115, B:68:0x0146, B:69:0x0147, B:70:0x0164, B:39:0x00cc, B:71:0x0165, B:72:0x0186), top: B:175:0x00a7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzall zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzall r18) throws com.google.android.gms.internal.ads.zzake {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzall):com.google.android.gms.internal.ads.zzall");
    }

    private static zzall zze(zzall zzallVar) {
        return zzallVar == null ? new zzall() : zzallVar;
    }

    private static Layout.Alignment zzf(String str) {
        String strZza = zzglm.zza(str);
        switch (strZza.hashCode()) {
            case -1364013995:
                if (strZza.equals(TtmlNode.CENTER)) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strZza.equals(TtmlNode.END)) {
                    return null;
                }
                break;
            case 3317767:
                if (!strZza.equals(TtmlNode.LEFT)) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strZza.equals(TtmlNode.RIGHT)) {
                    return null;
                }
                break;
            case 109757538:
                if (!strZza.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    private static long zzg(String str, zzalg zzalgVar) throws NumberFormatException, zzake {
        double d10;
        double d11;
        Matcher matcher = zzc.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j10 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j11 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j10 + j11;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d15 = d12 + d13;
            return (long) ((d15 + d14 + (matcher.group(5) != null ? Long.parseLong(r12) / zzalgVar.zza : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / zzalgVar.zzb) / zzalgVar.zza : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzake("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d16 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals(ApsMetricsDataMap.APSMETRICS_FIELD_SDK);
                        } else if (iHashCode == 116 && strGroup6.equals(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP)) {
                            d10 = zzalgVar.zzc;
                            d16 /= d10;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d10 = 1000.0d;
                        d16 /= d10;
                    }
                } else if (strGroup6.equals("m")) {
                    d11 = 60.0d;
                    d16 *= d11;
                }
            } else if (strGroup6.equals(ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME)) {
                d11 = 3600.0d;
                d16 *= d11;
            }
        } else if (strGroup6.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
            d10 = zzalgVar.zza;
            d16 /= d10;
        }
        return (long) (d16 * 1000000.0d);
    }

    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        zzakc.zza(zzb(bArr, i10, i11), zzakhVar, zzdgVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:52|(1:(5:55|398|59|67|(0)(0))(1:56))(1:58)|57|398|59|67|(0)(0)) */
    /* JADX WARN: Failed to find 'out' block for switch in B:276:0x0580. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030c A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #0, #2, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ba A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #0, #2, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045d A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #0, #2, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04a2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #0, #2, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0543 A[LOOP:1: B:121:0x0271->B:271:0x0543, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0683 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, zzake -> 0x0687, TRY_LEAVE, TryCatch #3 {zzake -> 0x0687, blocks: (B:345:0x067e, B:347:0x0683), top: B:395:0x067e }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x053d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #14 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x0167, B:85:0x01c2, B:88:0x01d6, B:90:0x01dc, B:92:0x01e4, B:94:0x01ec, B:96:0x01f4, B:98:0x01fc, B:100:0x0204, B:102:0x020a, B:104:0x0212, B:106:0x021a, B:108:0x0220, B:110:0x0226, B:112:0x022c, B:114:0x0234, B:117:0x023d, B:379:0x0703, B:119:0x026b, B:121:0x0271, B:123:0x027a, B:125:0x0289, B:127:0x0296, B:129:0x02ac, B:131:0x02b2, B:268:0x0537, B:134:0x02bd, B:137:0x02c9, B:252:0x04e7, B:140:0x02e7, B:142:0x02ef, B:144:0x02f7, B:146:0x02ff, B:151:0x030c, B:154:0x0325, B:156:0x032b, B:158:0x0338, B:179:0x03a0, B:181:0x03a6, B:183:0x03ac, B:185:0x03b4, B:187:0x03ba, B:190:0x03cd, B:192:0x03d3, B:194:0x03e0, B:214:0x0455, B:216:0x045d, B:230:0x0498, B:232:0x04a2, B:250:0x04da, B:195:0x03eb, B:196:0x03ec, B:197:0x03ed, B:198:0x03fa, B:201:0x0402, B:204:0x0410, B:206:0x0416, B:208:0x0421, B:209:0x0435, B:210:0x0436, B:211:0x0437, B:212:0x0444, B:159:0x0341, B:160:0x0342, B:161:0x0343, B:163:0x034e, B:166:0x0358, B:169:0x0361, B:171:0x0367, B:173:0x0372, B:174:0x0384, B:175:0x0385, B:176:0x0386, B:177:0x038e, B:255:0x04fa, B:257:0x0507, B:259:0x0512, B:261:0x0518, B:263:0x0524, B:273:0x0551, B:275:0x0574, B:317:0x0626, B:280:0x059b, B:283:0x05a4, B:354:0x0695, B:294:0x05c6, B:300:0x05e0, B:306:0x05f6, B:310:0x060a, B:314:0x061e, B:320:0x0637, B:324:0x0643, B:328:0x064c, B:336:0x065e, B:339:0x0667, B:343:0x0672, B:345:0x067e, B:347:0x0683, B:70:0x0174, B:72:0x0180, B:75:0x0189, B:77:0x018f, B:79:0x019a, B:80:0x01a6, B:81:0x01a7, B:82:0x01a8, B:41:0x010b, B:43:0x0117, B:46:0x0121, B:48:0x0127, B:50:0x012e, B:52:0x0134, B:59:0x0149, B:66:0x015f, B:62:0x0156, B:65:0x015e, B:358:0x06b6, B:360:0x06c3, B:363:0x06c7, B:365:0x06d1, B:367:0x06db, B:371:0x06e3, B:369:0x06e0, B:374:0x06f8, B:378:0x0700, B:384:0x071f), top: B:409:0x0008, inners: #0, #2, #4, #10, #13 }] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.google.android.gms.internal.ads.zzall, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzakd zzb(byte[] r45, int r46, int r47) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException, com.google.android.gms.internal.ads.zzake {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzali.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakd");
    }
}
