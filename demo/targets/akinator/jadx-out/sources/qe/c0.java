package qe;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.BKC.JzVV;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import nh.b5;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f82796a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f82797b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f82798c = -1;

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (n1.f28506a < 26 && n1.f28507b.equals("R9") && arrayList.size() == 1 && ((r) arrayList.get(0)).f82850a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(r.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            Collections.sort(arrayList, new bg.d(new pe.a(16), 3));
        }
        int i10 = n1.f28506a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((r) arrayList.get(0)).f82850a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new bg.d(new pe.a(17), 3));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((r) arrayList.get(0)).f82850a)) {
            return;
        }
        arrayList.add((r) arrayList.remove(0));
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(qe.w r22, qe.y r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c0.c(qe.w, qe.y):java.util.ArrayList");
    }

    public static synchronized void clearDecoderInfoCache() {
        f82797b.clear();
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (n1.f28506a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (l0.isAudio(str)) {
            return true;
        }
        String lowerCase = mh.c.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    public static String getAlternativeCodecMimeType(z0 z0Var) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(z0Var.f28802n)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!"video/dolby-vision".equals(z0Var.f28802n) || (codecProfileAndLevel = getCodecProfileAndLevel(z0Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List<r> getAlternativeDecoderInfos(v vVar, z0 z0Var, boolean z10, boolean z11) throws x {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(z0Var);
        if (alternativeCodecMimeType == null) {
            return b5.of();
        }
        ((u) vVar).getClass();
        return getDecoderInfos(alternativeCodecMimeType, z10, z11);
    }

    public static r getDecoderInfo(String str, boolean z10, boolean z11) throws x {
        List<r> decoderInfos = getDecoderInfos(str, z10, z11);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<r> getDecoderInfos(String str, boolean z10, boolean z11) throws x {
        try {
            w wVar = new w(str, z10, z11);
            HashMap map = f82797b;
            List<r> list = (List) map.get(wVar);
            if (list != null) {
                return list;
            }
            int i10 = n1.f28506a;
            ArrayList arrayListC = c(wVar, i10 >= 21 ? new a0(z10, z11) : new z());
            if (z10 && arrayListC.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListC = c(wVar, new z());
                if (!arrayListC.isEmpty()) {
                    f0.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((r) arrayListC.get(0)).f82850a);
                }
            }
            a(str, arrayListC);
            b5 b5VarCopyOf = b5.copyOf((Collection) arrayListC);
            map.put(wVar, b5VarCopyOf);
            return b5VarCopyOf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<r> getDecoderInfosSoftMatch(v vVar, z0 z0Var, boolean z10, boolean z11) throws x {
        String str = z0Var.f28802n;
        ((u) vVar).getClass();
        List<r> decoderInfos = getDecoderInfos(str, z10, z11);
        return b5.builder().addAll((Iterable<Object>) decoderInfos).addAll((Iterable<Object>) getAlternativeDecoderInfos(vVar, z0Var, z10, z11)).build();
    }

    public static List<r> getDecoderInfosSortedByFormatSupport(List<r> list, z0 z0Var) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new bg.d(new bf.m(z0Var), 3));
        return arrayList;
    }

    public static r getDecryptOnlyDecoderInfo() throws x {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    public static int maxH264DecodableFrameSize() throws x {
        int i10;
        if (f82798c == -1) {
            int iMax = 0;
            r decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = profileLevels[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case Segment.SIZE /* 8192 */:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, n1.f28506a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f82798c = iMax;
        }
        return f82798c;
    }

    public static void warmDecoderInfoCache(String str, boolean z10, boolean z11) {
        try {
            getDecoderInfos(str, z10, z11);
        } catch (x e10) {
            f0.e("MediaCodecUtil", "Codec warming failed", e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0379 A[PHI: r2
      0x0379: PHI (r2v55 int) = (r2v54 int), (r2v57 int), (r2v58 int), (r2v59 int), (r2v60 int) binds: [B:258:0x0352, B:261:0x0358, B:263:0x035c, B:265:0x0360, B:267:0x0364] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x037d A[Catch: NumberFormatException -> 0x038b, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x038b, blocks: (B:255:0x0334, B:257:0x0348, B:268:0x0366, B:279:0x037d), top: B:576:0x0334 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(com.google.android.exoplayer2.z0 r34) {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c0.getCodecProfileAndLevel(com.google.android.exoplayer2.z0):android.util.Pair");
    }

    public static boolean d(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z10 || !str.endsWith(".secure")) {
                int i10 = n1.f28506a;
                if (i10 >= 21 || (!LJjmO.NYNHllLQKIZBOcI.equals(str) && !"CIPMP3Decoder".equals(str) && !"CIPVorbisDecoder".equals(str) && !"CIPAMRNBDecoder".equals(str) && !"AACDecoder".equals(str) && !"MP3Decoder".equals(str))) {
                    if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                        String str3 = n1.f28507b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(n1.f28508c) && str3.startsWith("HM")) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                        String str4 = n1.f28507b;
                        if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                            return false;
                        }
                    }
                    if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                        String str5 = n1.f28507b;
                        if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || JzVV.vHpRefSzv.equals(str5)) {
                            return false;
                        }
                    }
                    if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(n1.f28508c))) {
                        String str6 = n1.f28507b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            return false;
                        }
                    }
                    if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(n1.f28508c)) {
                        String str7 = n1.f28507b;
                        if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                            return false;
                        }
                    }
                    if (i10 > 19 || !n1.f28507b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
                        if (i10 > 23 || !MimeTypes.AUDIO_E_AC3_JOC.equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
