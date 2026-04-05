package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25625a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25626b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25627c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25628d;

    /* renamed from: e, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f25629e;

    public a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10) {
        str.getClass();
        this.f25625a = str;
        this.f25628d = str2;
        this.f25629e = codecCapabilities;
        boolean z11 = false;
        this.f25626b = !z10 && codecCapabilities != null && z.f26070a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && z.f26070a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z11 = true;
        }
        this.f25627c = z11;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean a(String str) {
        String strA;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Integer numValueOf;
        Integer numValueOf2;
        if (str == null || this.f25628d == null || (strA = com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str)) == null) {
            return true;
        }
        if (!this.f25628d.equals(strA)) {
            b("codec.mime " + str + ", " + strA);
            return false;
        }
        Pattern pattern = j.f25654a;
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit[0];
        str2.getClass();
        int i10 = 2;
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 3006243:
                if (str2.equals("avc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        Pair pair = null;
        switch (c10) {
            case 0:
            case 1:
                if (strArrSplit.length < 2) {
                    Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                    break;
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(0, 2), 16));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[1].substring(4), 16));
                        } else if (strArrSplit.length < 3) {
                            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                            break;
                        } else {
                            numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                            numValueOf2 = Integer.valueOf(Integer.parseInt(strArrSplit[2]));
                        }
                        pair = new Pair(Integer.valueOf(j.f25656c.get(numValueOf.intValue())), Integer.valueOf(j.f25657d.get(numValueOf2.intValue())));
                        break;
                    } catch (NumberFormatException unused) {
                        Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: ".concat(str));
                        break;
                    }
                }
            case 2:
            case 3:
                if (strArrSplit.length < 4) {
                    Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                    break;
                } else {
                    Matcher matcher = j.f25654a.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if ("1".equals(strGroup)) {
                            i10 = 1;
                        } else if (!"2".equals(strGroup)) {
                            Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                            break;
                        }
                        Integer num = (Integer) j.f25658e.get(strArrSplit[3]);
                        if (num == null) {
                            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
                            break;
                        } else {
                            pair = new Pair(Integer.valueOf(i10), num);
                            break;
                        }
                    } else {
                        Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: ".concat(str));
                        break;
                    }
                }
        }
        if (pair == null) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25629e;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == ((Integer) pair.first).intValue() && codecProfileLevel.level >= ((Integer) pair.second).intValue()) {
                return true;
            }
        }
        b("codec.profileLevel, " + str + ", " + strA);
        return false;
    }

    public final void b(String str) {
        StringBuilder sbO = e3.g.o("NoSupport [", str, "] [");
        sbO.append(this.f25625a);
        sbO.append(", ");
        sbO.append(this.f25628d);
        sbO.append("] [");
        sbO.append(z.f26074e);
        sbO.append(C3191e4.i.f36531e);
        Log.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
    }

    public final boolean b(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25629e;
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

    public final boolean a(int i10, int i11, double d10) {
        boolean zIsSizeSupported;
        boolean zIsSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25629e;
        if (codecCapabilities == null) {
            b("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("sizeAndRate.vCaps");
            return false;
        }
        if (d10 != -1.0d && d10 > 0.0d) {
            zIsSizeSupported = videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        } else {
            zIsSizeSupported = videoCapabilities.isSizeSupported(i10, i11);
        }
        if (zIsSizeSupported) {
            return true;
        }
        if (i10 < i11) {
            if (d10 != -1.0d && d10 > 0.0d) {
                zIsSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i11, i10, d10);
            } else {
                zIsSizeSupported2 = videoCapabilities.isSizeSupported(i11, i10);
            }
            if (zIsSizeSupported2) {
                StringBuilder sbF = w0.i.f(i10, i11, "sizeAndRate.rotated, ", "x", "x");
                sbF.append(d10);
                StringBuilder sbO = e3.g.o("AssumedSupport [", sbF.toString(), "] [");
                sbO.append(this.f25625a);
                sbO.append(", ");
                sbO.append(this.f25628d);
                sbO.append("] [");
                sbO.append(z.f26074e);
                sbO.append(C3191e4.i.f36531e);
                Log.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
                return true;
            }
        }
        StringBuilder sbF2 = w0.i.f(i10, i11, "sizeAndRate.support, ", "x", "x");
        sbF2.append(d10);
        b(sbF2.toString());
        return false;
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25629e;
        if (codecCapabilities == null) {
            b("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            b("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = z.f26070a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean a(int i10) {
        int i11;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f25629e;
        if (codecCapabilities == null) {
            b("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            b("channelCount.aCaps");
            return false;
        }
        String str = this.f25625a;
        String str2 = this.f25628d;
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((z.f26070a < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                i11 = 6;
            } else {
                i11 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
            }
            StringBuilder sbR = a.b.r(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", str, ", [", " to ");
            sbR.append(i11);
            sbR.append(C3191e4.i.f36531e);
            Log.w(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbR.toString());
            maxInputChannelCount = i11;
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        b("channelCount.support, " + i10);
        return false;
    }
}
