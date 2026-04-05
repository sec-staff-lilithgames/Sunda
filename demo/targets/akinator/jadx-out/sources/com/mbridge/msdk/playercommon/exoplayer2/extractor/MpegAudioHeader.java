package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import a.b;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = SAMPLING_RATE_V1[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? BITRATE_V1_L1[i13 - 1] : BITRATE_V2_L1[i13 - 1]) * 12000) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? BITRATE_V1_L2[i13 - 1] : BITRATE_V1_L3[i13 - 1] : BITRATE_V2[i13 - 1];
        if (i11 == 3) {
            return b.a(i17, 144000, i15, i16);
        }
        return b.a(i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i17, i15, i16);
    }

    public static boolean populateHeader(int i10, MpegAudioHeader mpegAudioHeader) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iA;
        int i16;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i17 = SAMPLING_RATE_V1[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = i17;
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? BITRATE_V1_L1[i13 - 1] : BITRATE_V2_L1[i13 - 1];
            iA = (((i15 * 12000) / i18) + i19) * 4;
            i16 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? BITRATE_V1_L2[i13 - 1] : BITRATE_V1_L3[i13 - 1];
                iA = b.a(i15, 144000, i18, i19);
            } else {
                i15 = BITRATE_V2[i13 - 1];
                i = i12 == 1 ? 576 : 1152;
                iA = b.a(i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i15, i18, i19);
            }
            i16 = i;
        }
        mpegAudioHeader.setValues(i11, MIME_TYPE_BY_LAYER[3 - i12], iA, i18, ((i10 >> 6) & 3) == 3 ? 1 : 2, i15 * 1000, i16);
        return true;
    }

    private void setValues(int i10, String str, int i11, int i12, int i13, int i14, int i15) {
        this.version = i10;
        this.mimeType = str;
        this.frameSize = i11;
        this.sampleRate = i12;
        this.channels = i13;
        this.bitrate = i14;
        this.samplesPerFrame = i15;
    }
}
