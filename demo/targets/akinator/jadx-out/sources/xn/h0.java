package xn;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import nh.b5;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f92095a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static int f92096b = -1;

    public static void a(String str, ArrayList arrayList) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (a1.f60679a < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((s) arrayList.get(0)).f92111a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(s.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            Collections.sort(arrayList, new bg.d(new xl.g(9), 4));
        }
        if (a1.f60679a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((s) arrayList.get(0)).f92111a)) {
            return;
        }
        arrayList.add((s) arrayList.remove(0));
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
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
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
    public static java.util.ArrayList c(xn.b0 r22, xn.d0 r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.h0.c(xn.b0, xn.d0):java.util.ArrayList");
    }

    public static synchronized void clearDecoderInfoCache() {
        f92095a.clear();
    }

    public static boolean d(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = a1.f60679a;
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i10 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (a1.f60679a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (x0.isAudio(str)) {
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

    public static String getAlternativeCodecMimeType(io.bidmachine.media3.common.b bVar) {
        Pair<Integer, Integer> codecProfileAndLevel;
        String str = bVar.f60665o;
        String str2 = bVar.f60665o;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(str2) && (codecProfileAndLevel = getCodecProfileAndLevel(bVar)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    public static List<s> getAlternativeDecoderInfos(z zVar, io.bidmachine.media3.common.b bVar, boolean z10, boolean z11) throws c0 {
        String alternativeCodecMimeType = getAlternativeCodecMimeType(bVar);
        return alternativeCodecMimeType == null ? b5.of() : zVar.getDecoderInfos(alternativeCodecMimeType, z10, z11);
    }

    @Deprecated
    public static Pair<Integer, Integer> getCodecProfileAndLevel(io.bidmachine.media3.common.b bVar) {
        return io.bidmachine.media3.common.util.h.getCodecProfileAndLevel(bVar);
    }

    public static s getDecoderInfo(String str, boolean z10, boolean z11) throws c0 {
        List<s> decoderInfos = getDecoderInfos(str, z10, z11);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<s> getDecoderInfos(String str, boolean z10, boolean z11) throws c0 {
        try {
            b0 b0Var = new b0(str, z10, z11);
            HashMap map = f92095a;
            List<s> list = (List) map.get(b0Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListC = c(b0Var, new f0(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListC.isEmpty() && a1.f60679a <= 23) {
                arrayListC = c(b0Var, new e0());
                if (!arrayListC.isEmpty()) {
                    io.bidmachine.media3.common.util.b0.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((s) arrayListC.get(0)).f92111a);
                }
            }
            a(str, arrayListC);
            b5 b5VarCopyOf = b5.copyOf((Collection) arrayListC);
            map.put(b0Var, b5VarCopyOf);
            return b5VarCopyOf;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List<s> getDecoderInfosSoftMatch(z zVar, io.bidmachine.media3.common.b bVar, boolean z10, boolean z11) throws c0 {
        List<s> decoderInfos = zVar.getDecoderInfos(bVar.f60665o, z10, z11);
        return b5.builder().addAll((Iterable<Object>) decoderInfos).addAll((Iterable<Object>) getAlternativeDecoderInfos(zVar, bVar, z10, z11)).build();
    }

    public static List<s> getDecoderInfosSortedByFormatSupport(List<s> list, io.bidmachine.media3.common.b bVar) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new bg.d(new a0(bVar, 1), 4));
        return arrayList;
    }

    public static List<s> getDecoderInfosSortedByFullFormatSupport(List<s> list, io.bidmachine.media3.common.b bVar) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new bg.d(new a0(bVar, 0), 4));
        return arrayList;
    }

    public static List<s> getDecoderInfosSortedBySoftwareOnly(List<s> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new bg.d(new xl.g(10), 4));
        return b5.copyOf((Collection) arrayList);
    }

    public static s getDecryptOnlyDecoderInfo() throws c0 {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    public static Pair<Integer, Integer> getHevcBaseLayerCodecProfileAndLevel(io.bidmachine.media3.common.b bVar) {
        String h265BaseLayerCodecsString = jn.u.getH265BaseLayerCodecsString(bVar.f60668r);
        if (h265BaseLayerCodecsString == null) {
            return null;
        }
        return io.bidmachine.media3.common.util.h.getHevcProfileAndLevel(h265BaseLayerCodecsString, a1.split(h265BaseLayerCodecsString.trim(), "\\."), bVar.C);
    }

    public static int maxH264DecodableFrameSize() throws c0 {
        int i10;
        if (f92096b == -1) {
            int iMax = 0;
            s decoderInfo = getDecoderInfo("video/avc", false, false);
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
                iMax = Math.max(iMax2, 345600);
            }
            f92096b = iMax;
        }
        return f92096b;
    }

    public static void warmDecoderInfoCache(String str, boolean z10, boolean z11) {
        try {
            getDecoderInfos(str, z10, z11);
        } catch (c0 e10) {
            io.bidmachine.media3.common.util.b0.e("MediaCodecUtil", "Codec warming failed", e10);
        }
    }
}
