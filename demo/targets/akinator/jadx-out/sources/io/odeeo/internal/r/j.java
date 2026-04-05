package io.odeeo.internal.r;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.t;
import io.odeeo.internal.r.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f66056a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66057b;

    /* renamed from: c, reason: collision with root package name */
    public final String f66058c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f66059d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f66060e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66061f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f66062g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f66063h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f66064i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f66065j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f66066k;

    public j(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f66056a = (String) io.odeeo.internal.q0.a.checkNotNull(str);
        this.f66057b = str2;
        this.f66058c = str3;
        this.f66059d = codecCapabilities;
        this.f66063h = z10;
        this.f66064i = z11;
        this.f66065j = z12;
        this.f66060e = z13;
        this.f66061f = z14;
        this.f66062g = z15;
        this.f66066k = t.isVideo(str2);
    }

    public static boolean c(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return g0.f65861a >= 19 && d(codecCapabilities);
    }

    public static boolean d(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return g0.f65861a >= 21 && f(codecCapabilities);
    }

    public static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return g0.f65861a >= 21 && h(codecCapabilities);
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static j newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z16;
        boolean z17;
        boolean z18;
        String str6;
        boolean z19 = (z13 || codecCapabilities == null || !c(codecCapabilities) || e(str)) ? false : true;
        boolean z20 = codecCapabilities != null && g(codecCapabilities);
        if (z14 || (codecCapabilities != null && e(codecCapabilities))) {
            z15 = true;
            str4 = str;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z16 = z10;
            z17 = z11;
            z18 = z12;
            str6 = str2;
        } else {
            z15 = false;
            str6 = str2;
            str5 = str3;
            codecCapabilities2 = codecCapabilities;
            z16 = z10;
            z17 = z11;
            z18 = z12;
            str4 = str;
        }
        return new j(str4, str6, str5, codecCapabilities2, z16, z17, z18, z19, z20, z15);
    }

    public final void a(String str) {
        StringBuilder sbO = e3.g.o("AssumedSupport [", str, "] [");
        sbO.append(this.f66056a);
        sbO.append(", ");
        sbO.append(this.f66057b);
        sbO.append("] [");
        sbO.append(g0.f65865e);
        sbO.append(C3191e4.i.f36531e);
        p.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
    }

    public Point alignVideoSizeV21(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66059d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return a(videoCapabilities, i10, i11);
    }

    public final void b(String str) {
        StringBuilder sbO = e3.g.o("NoSupport [", str, "] [");
        sbO.append(this.f66056a);
        sbO.append(", ");
        sbO.append(this.f66057b);
        sbO.append("] [");
        sbO.append(g0.f65865e);
        sbO.append(C3191e4.i.f36531e);
        p.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
    }

    public io.odeeo.internal.e.i canReuseCodec(io.odeeo.internal.b.t tVar, io.odeeo.internal.b.t tVar2) {
        io.odeeo.internal.b.t tVar3;
        io.odeeo.internal.b.t tVar4;
        int i10 = !g0.areEqual(tVar.f62971l, tVar2.f62971l) ? 8 : 0;
        if (this.f66066k) {
            if (tVar.f62979t != tVar2.f62979t) {
                i10 |= 1024;
            }
            if (!this.f66060e && (tVar.f62976q != tVar2.f62976q || tVar.f62977r != tVar2.f62977r)) {
                i10 |= 512;
            }
            if (!g0.areEqual(tVar.f62983x, tVar2.f62983x)) {
                i10 |= 2048;
            }
            if (d(this.f66056a) && !tVar.initializationDataEquals(tVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new io.odeeo.internal.e.i(this.f66056a, tVar, tVar2, tVar.initializationDataEquals(tVar2) ? 3 : 2, 0);
            }
            tVar3 = tVar;
            tVar4 = tVar2;
        } else {
            tVar3 = tVar;
            tVar4 = tVar2;
            if (tVar3.f62984y != tVar4.f62984y) {
                i10 |= 4096;
            }
            if (tVar3.f62985z != tVar4.f62985z) {
                i10 |= Segment.SIZE;
            }
            if (tVar3.A != tVar4.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(this.f66057b)) {
                Pair<Integer, Integer> codecProfileAndLevel = m.getCodecProfileAndLevel(tVar3);
                Pair<Integer, Integer> codecProfileAndLevel2 = m.getCodecProfileAndLevel(tVar4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new io.odeeo.internal.e.i(this.f66056a, tVar3, tVar4, 3, 0);
                    }
                }
            }
            if (!tVar3.initializationDataEquals(tVar4)) {
                i10 |= 32;
            }
            if (c(this.f66057b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new io.odeeo.internal.e.i(this.f66056a, tVar3, tVar4, 1, 0);
            }
        }
        return new io.odeeo.internal.e.i(this.f66056a, tVar3, tVar4, 0, i10);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (g0.f65861a < 23 || (codecCapabilities = this.f66059d) == null) {
            return -1;
        }
        return b(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66059d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66059d;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        if (a(this.f66056a, this.f66057b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        b("channelCount.support, " + i10);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66059d;
        if (codecCapabilities == null) {
            b("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        b("sampleRate.support, " + i10);
        return false;
    }

    public boolean isCodecSupported(io.odeeo.internal.b.t tVar) {
        String mediaMimeType;
        String str = tVar.f62968i;
        if (str == null || this.f66057b == null || (mediaMimeType = t.getMediaMimeType(str)) == null) {
            return true;
        }
        if (!this.f66057b.equals(mediaMimeType)) {
            b("codec.mime " + tVar.f62968i + ", " + mediaMimeType);
            return false;
        }
        Pair<Integer, Integer> codecProfileAndLevel = m.getCodecProfileAndLevel(tVar);
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if (!this.f66066k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (g0.f65861a <= 23 && MimeTypes.VIDEO_VP9.equals(this.f66057b) && profileLevels.length == 0) {
            profileLevels = a(this.f66059d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        b("codec.profileLevel, " + tVar.f62968i + ", " + mediaMimeType);
        return false;
    }

    public boolean isFormatSupported(io.odeeo.internal.b.t tVar) throws m.c {
        int i10;
        int i11;
        int i12;
        if (!isCodecSupported(tVar)) {
            return false;
        }
        if (!this.f66066k) {
            return g0.f65861a < 21 || (((i10 = tVar.f62985z) == -1 || isAudioSampleRateSupportedV21(i10)) && ((i11 = tVar.f62984y) == -1 || isAudioChannelCountSupportedV21(i11)));
        }
        int i13 = tVar.f62976q;
        if (i13 <= 0 || (i12 = tVar.f62977r) <= 0) {
            return true;
        }
        if (g0.f65861a >= 21) {
            return isVideoSizeAndRateSupportedV21(i13, i12, tVar.f62978s);
        }
        boolean z10 = i13 * i12 <= m.maxH264DecodableFrameSize();
        if (!z10) {
            b("legacyFrameSize, " + tVar.f62976q + "x" + tVar.f62977r);
        }
        return z10;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (g0.f65861a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f66057b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(io.odeeo.internal.b.t tVar) {
        if (this.f66066k) {
            return this.f66060e;
        }
        Pair<Integer, Integer> codecProfileAndLevel = m.getCodecProfileAndLevel(tVar);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f66059d;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (a(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && f(this.f66056a) && a(videoCapabilities, i11, i10, d10)) {
            StringBuilder sbF = w0.i.f(i10, i11, "sizeAndRate.rotated, ", "x", "x");
            sbF.append(d10);
            a(sbF.toString());
            return true;
        }
        StringBuilder sbF2 = w0.i.f(i10, i11, "sizeAndRate.support, ", "x", "x");
        sbF2.append(d10);
        b(sbF2.toString());
        return false;
    }

    public String toString() {
        return this.f66056a;
    }

    public static boolean c(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    public static boolean d(String str) {
        return g0.f65864d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean e(String str) {
        if (g0.f65861a > 22) {
            return false;
        }
        String str2 = g0.f65864d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    public static final boolean f(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(g0.f65862b)) ? false : true;
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(io.odeeo.internal.b.t tVar, io.odeeo.internal.b.t tVar2, boolean z10) {
        if (!z10 && tVar.f62983x != null && tVar2.f62983x == null) {
            tVar2 = tVar2.buildUpon().setColorInfo(tVar.f62983x).build();
        }
        int i10 = canReuseCodec(tVar, tVar2).f63718d;
        return i10 == 2 || i10 == 3;
    }

    public static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((g0.f65861a >= 26 && i10 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i10;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i11 = 6;
        } else {
            i11 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        StringBuilder sbR = a.b.r(i10, "AssumedMaxChannelAdjustment: ", str, ", [", " to ");
        sbR.append(i11);
        sbR.append(C3191e4.i.f36531e);
        p.w(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbR.toString());
        return i11;
    }

    public static int b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointA = a(videoCapabilities, i10, i11);
        int i12 = pointA.x;
        int i13 = pointA.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(g0.ceilDivide(i10, widthAlignment) * widthAlignment, g0.ceilDivide(i11, heightAlignment) * heightAlignment);
    }

    public static MediaCodecInfo.CodecProfileLevel[] a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i10 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? NotificationCompat.FLAG_LOCAL_ONLY : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }
}
