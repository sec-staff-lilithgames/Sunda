package gn;

import android.text.TextUtils;
import com.unity3d.services.core.device.MimeTypes;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f58246a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f58247b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static w0 a(String str) {
        Matcher matcher = f58247b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) io.bidmachine.media3.common.util.a.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new w0(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean allSamplesAreSyncSamples(String str, String str2) {
        w0 w0VarA;
        int encoding;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (w0VarA = a(str2)) != null && (encoding = w0VarA.getEncoding()) != 0 && encoding != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean containsCodecsCorrespondingToMimeType(String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : io.bidmachine.media3.common.util.a1.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static String getCodecsCorrespondingToMimeType(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrSplitCodecs = io.bidmachine.media3.common.util.a1.splitCodecs(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : strArrSplitCodecs) {
                if (str2.equals(getMediaMimeType(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int getEncoding(String str, String str2) {
        w0 w0VarA;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (w0VarA = a(str2)) == null) {
                    return 0;
                }
                return w0VarA.getEncoding();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String getMediaMimeType(String str) {
        w0 w0VarA;
        String mimeTypeFromMp4ObjectType = null;
        if (str == null) {
            return null;
        }
        String lowerCase = mh.c.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return "video/avc";
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (lowerCase.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8;
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (w0VarA = a(lowerCase)) != null) {
                mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(w0VarA.f58236a);
            }
            return mimeTypeFromMp4ObjectType == null ? com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC : mimeTypeFromMp4ObjectType;
        }
        if (lowerCase.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (lowerCase.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        if (lowerCase.startsWith("ec+3")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC;
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (lowerCase.startsWith("dtsc")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
        }
        if (lowerCase.startsWith("dtse")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_EXPRESS;
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
        }
        if (lowerCase.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (lowerCase.startsWith("opus")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
        }
        if (lowerCase.startsWith("vorbis")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (lowerCase.startsWith("flac")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
        }
        if (lowerCase.startsWith("stpp")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML;
        }
        if (lowerCase.startsWith("wvtt")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.TEXT_VTT;
        }
        if (lowerCase.contains("cea708")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708;
        }
        if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608;
        }
        ArrayList arrayList = f58246a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) arrayList.get(i10);
            if (lowerCase.startsWith(v0Var.f58201b)) {
                return v0Var.f58200a;
            }
        }
        return null;
    }

    public static Byte getMp4ObjectTypeFromMimeType(String str) {
        str.getClass();
        switch (str) {
            case "audio/vorbis":
                return (byte) -35;
            case "audio/mp4a-latm":
                return (byte) 64;
            case "video/mp4v-es":
                return (byte) 32;
            default:
                return null;
        }
    }

    public static String getTextMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : io.bidmachine.media3.common.util.a1.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static int getTrackType(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (isAudio(str)) {
            return 1;
        }
        if (isVideo(str)) {
            return 2;
        }
        if (isText(str)) {
            return 3;
        }
        if (isImage(str)) {
            return 4;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_ID3.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_EMSG.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = f58246a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            v0 v0Var = (v0) arrayList.get(i10);
            if (str.equals(v0Var.f58200a)) {
                return v0Var.f58202c;
            }
        }
        return -1;
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : io.bidmachine.media3.common.util.a1.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isAudio(String str) {
        return "audio".equals(b(str));
    }

    public static boolean isDolbyVisionCodec(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean isImage(String str) {
        return "image".equals(b(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean isMatroska(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_WEBM) || str.startsWith(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    @Pure
    public static boolean isText(String str) {
        return "text".equals(b(str)) || "application/x-media3-cues".equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_CEA708.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_SUBRIP.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TTML.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_TX3G.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_MP4VTT.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_RAWCC.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_VOBSUB.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_PGS.equals(str) || com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean isVideo(String str) {
        return "video".equals(b(str));
    }

    public static String normalizeMimeType(String str) {
        String lowerCase;
        if (str == null) {
            return null;
        }
        lowerCase = mh.c.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            default:
                return lowerCase;
        }
    }

    public static void registerCustomMimeType(String str, String str2, int i10) {
        v0 v0Var = new v0(str, str2, i10);
        ArrayList arrayList = f58246a;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (str.equals(((v0) arrayList.get(i11)).f58200a)) {
                arrayList.remove(i11);
                break;
            }
            i11++;
        }
        arrayList.add(v0Var);
    }

    public static String getMimeTypeFromMp4ObjectType(int i10) {
        if (i10 == 32) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9;
        }
        if (i10 == 221) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_VORBIS;
        }
        if (i10 == 165) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return YsiBvdpw.BEEZICnAU;
            case 102:
            case 103:
            case 104:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MPEG;
            case 106:
                return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }
}
