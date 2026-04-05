package io.odeeo.internal.q0;

import android.text.TextUtils;
import bp.oM.DwaEpyvxz;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cv.BLca.YsiBvdpw;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f65919a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f65920b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f65921a;

        /* renamed from: b, reason: collision with root package name */
        public final String f65922b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65923c;

        public a(String str, String str2, int i10) {
            this.f65921a = str;
            this.f65922b = str2;
            this.f65923c = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f65924a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65925b;

        public b(int i10, int i11) {
            this.f65924a = i10;
            this.f65925b = i11;
        }

        public int getEncoding() {
            int i10 = this.f65925b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static String a(String str) {
        int size = f65919a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f65919a.get(i10);
            if (str.startsWith(aVar.f65922b)) {
                return aVar.f65921a;
            }
        }
        return null;
    }

    public static boolean allSamplesAreSyncSamples(String str, String str2) {
        b bVarB;
        int encoding;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(YsiBvdpw.LGZkEBKKyjSxFmB)) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(MimeTypes.AUDIO_RAW)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 3:
                if (str2 != null && (bVarB = b(str2)) != null && (encoding = bVarB.getEncoding()) != 0 && encoding != 16) {
                }
                break;
        }
        return false;
    }

    public static b b(String str) {
        Matcher matcher = f65920b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) io.odeeo.internal.q0.a.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String c(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean containsCodecsCorrespondingToMimeType(String str, String str2) {
        return getCodecsCorrespondingToMimeType(str, str2) != null;
    }

    public static int d(String str) {
        int size = f65919a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f65919a.get(i10);
            if (str.equals(aVar.f65921a)) {
                return aVar.f65923c;
            }
        }
        return -1;
    }

    public static String getAudioMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static String getCodecsCorrespondingToMimeType(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrSplitCodecs = g0.splitCodecs(str);
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
        b bVarB;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarB = b(str2)) == null) {
                    return 0;
                }
                return bVarB.getEncoding();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String getMediaMimeType(String str) {
        b bVarB;
        String mimeTypeFromMp4ObjectType = null;
        if (str == null) {
            return null;
        }
        String lowerCase = io.odeeo.internal.t0.c.toLowerCase(str.trim());
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
            return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (!lowerCase.startsWith("mp4a")) {
            return lowerCase.startsWith("mha1") ? "audio/mha1" : lowerCase.startsWith("mhm1") ? "audio/mhm1" : (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) ? MimeTypes.AUDIO_AC3 : (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) ? MimeTypes.AUDIO_E_AC3 : lowerCase.startsWith("ec+3") ? MimeTypes.AUDIO_E_AC3_JOC : (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) ? "audio/ac4" : lowerCase.startsWith("dtsc") ? MimeTypes.AUDIO_DTS : lowerCase.startsWith("dtse") ? MimeTypes.AUDIO_DTS_EXPRESS : (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) ? MimeTypes.AUDIO_DTS_HD : lowerCase.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : lowerCase.startsWith("opus") ? MimeTypes.AUDIO_OPUS : lowerCase.startsWith("vorbis") ? MimeTypes.AUDIO_VORBIS : lowerCase.startsWith(DwaEpyvxz.fjFJDKJV) ? MimeTypes.AUDIO_FLAC : lowerCase.startsWith("stpp") ? MimeTypes.APPLICATION_TTML : lowerCase.startsWith("wvtt") ? MimeTypes.TEXT_VTT : lowerCase.contains("cea708") ? MimeTypes.APPLICATION_CEA708 : (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? MimeTypes.APPLICATION_CEA608 : a(lowerCase);
        }
        if (lowerCase.startsWith("mp4a.") && (bVarB = b(lowerCase)) != null) {
            mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(bVarB.f65924a);
        }
        return mimeTypeFromMp4ObjectType == null ? MimeTypes.AUDIO_AAC : mimeTypeFromMp4ObjectType;
    }

    public static String getMimeTypeFromMp4ObjectType(int i10) {
        if (i10 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i10 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i10 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i10 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i10 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String getTextMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.splitCodecs(str)) {
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
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        return d(str);
    }

    public static int getTrackTypeOfCodec(String str) {
        return getTrackType(getMediaMimeType(str));
    }

    public static String getVideoMediaMimeType(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : g0.splitCodecs(str)) {
            String mediaMimeType = getMediaMimeType(str2);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isAudio(String str) {
        return "audio".equals(c(str));
    }

    public static boolean isImage(String str) {
        return "image".equals(c(str));
    }

    public static boolean isMatroska(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean isText(String str) {
        return "text".equals(c(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean isVideo(String str) {
        return "video".equals(c(str));
    }

    public static String normalizeMimeType(String str) {
        str.getClass();
        switch (str) {
            case "audio/x-flac":
                return MimeTypes.AUDIO_FLAC;
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return MimeTypes.AUDIO_MPEG;
            default:
                return str;
        }
    }

    public static void registerCustomMimeType(String str, String str2, int i10) {
        a aVar = new a(str, str2, i10);
        int size = f65919a.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ArrayList<a> arrayList = f65919a;
            if (str.equals(arrayList.get(i11).f65921a)) {
                arrayList.remove(i11);
                break;
            }
            i11++;
        }
        f65919a.add(aVar);
    }
}
