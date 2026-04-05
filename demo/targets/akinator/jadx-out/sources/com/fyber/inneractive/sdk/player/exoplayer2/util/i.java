package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            return "video/avc";
        }
        if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strTrim.startsWith("vp9")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (strTrim.startsWith("vp8")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (strTrim.startsWith("mp4a")) {
            return MimeTypes.AUDIO_AAC;
        }
        if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        }
        if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
            return MimeTypes.AUDIO_DTS;
        }
        if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (strTrim.startsWith("opus")) {
            return MimeTypes.AUDIO_OPUS;
        }
        if (strTrim.startsWith("vorbis")) {
            return MimeTypes.AUDIO_VORBIS;
        }
        return null;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if ("audio".equals(b(str))) {
            return 1;
        }
        if ("video".equals(b(str))) {
            return 2;
        }
        if ("text".equals(b(str)) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        return (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) ? 4 : -1;
    }
}
