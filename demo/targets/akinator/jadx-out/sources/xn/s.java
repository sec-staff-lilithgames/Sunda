package xn;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f92111a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92112b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92113c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f92114d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92115e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f92116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f92117g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f92118h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f92119i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f92120j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f92121k;

    public s(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f92111a = (String) io.bidmachine.media3.common.util.a.checkNotNull(str);
        this.f92112b = str2;
        this.f92113c = str3;
        this.f92114d = codecCapabilities;
        this.f92117g = z10;
        this.f92118h = z11;
        this.f92119i = z12;
        this.f92115e = z13;
        this.f92116f = z14;
        this.f92120j = z15;
        this.f92121k = x0.isVideo(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(a1.ceilDivide(i10, widthAlignment) * widthAlignment, a1.ceilDivide(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static xn.s newInstance(java.lang.String r11, java.lang.String r12, java.lang.String r13, android.media.MediaCodecInfo.CodecCapabilities r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            xn.s r0 = new xn.s
            r1 = 0
            r2 = 1
            if (r18 != 0) goto L3b
            if (r14 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = io.bidmachine.media3.common.util.a1.f60679a
            r4 = 22
            if (r3 > r4) goto L39
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L28
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = r2
            goto L3c
        L3b:
            r8 = r1
        L3c:
            if (r14 == 0) goto L44
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r14.isFeatureSupported(r3)
        L44:
            if (r19 != 0) goto L53
            if (r14 == 0) goto L51
            java.lang.String r3 = "secure-playback"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L51
            goto L53
        L51:
            r9 = r1
            goto L54
        L53:
            r9 = r2
        L54:
            int r3 = io.bidmachine.media3.common.util.a1.f60679a
            r4 = 35
            if (r3 < r4) goto L82
            if (r14 == 0) goto L82
            java.lang.String r3 = "detached-surface"
            boolean r3 = r14.isFeatureSupported(r3)
            if (r3 == 0) goto L82
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r4 = "Xiaomi"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L82
            java.lang.String r4 = "OPPO"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L77
            goto L82
        L77:
            r10 = r2
            r1 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L8c
        L82:
            r10 = r1
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r1 = r11
        L8c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.s.newInstance(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):xn.s");
    }

    public Point alignVideoSizeV21(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f92114d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(a1.ceilDivide(i10, widthAlignment) * widthAlignment, a1.ceilDivide(i11, heightAlignment) * heightAlignment);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(io.bidmachine.media3.common.b r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.s.b(io.bidmachine.media3.common.b, boolean):boolean");
    }

    public final boolean c(io.bidmachine.media3.common.b bVar) {
        return (Objects.equals(bVar.f60665o, MimeTypes.AUDIO_FLAC) && bVar.G == 22 && a1.f60679a < 34 && this.f92111a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public io.bidmachine.media3.exoplayer.k canReuseCodec(io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2) {
        io.bidmachine.media3.common.b bVar3;
        io.bidmachine.media3.common.b bVar4;
        String str = bVar.f60665o;
        gn.n nVar = bVar.C;
        String str2 = bVar2.f60665o;
        gn.n nVar2 = bVar2.C;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f92121k) {
            if (bVar.f60675y != bVar2.f60675y) {
                i10 |= 1024;
            }
            if (!this.f92115e && (bVar.f60672v != bVar2.f60672v || bVar.f60673w != bVar2.f60673w)) {
                i10 |= 512;
            }
            if ((!gn.n.isEquivalentToAssumedSdrDefault(nVar) || !gn.n.isEquivalentToAssumedSdrDefault(nVar2)) && !Objects.equals(nVar, nVar2)) {
                i10 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f92111a) && !bVar.initializationDataEquals(bVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new io.bidmachine.media3.exoplayer.k(this.f92111a, bVar, bVar2, bVar.initializationDataEquals(bVar2) ? 3 : 2, 0);
            }
            bVar3 = bVar;
            bVar4 = bVar2;
        } else {
            bVar3 = bVar;
            bVar4 = bVar2;
            if (bVar3.E != bVar4.E) {
                i10 |= 4096;
            }
            if (bVar3.F != bVar4.F) {
                i10 |= Segment.SIZE;
            }
            if (bVar3.G != bVar4.G) {
                i10 |= 16384;
            }
            String str3 = this.f92112b;
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(str3)) {
                Pair<Integer, Integer> codecProfileAndLevel = h0.getCodecProfileAndLevel(bVar3);
                Pair<Integer, Integer> codecProfileAndLevel2 = h0.getCodecProfileAndLevel(bVar4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new io.bidmachine.media3.exoplayer.k(this.f92111a, bVar3, bVar4, 3, 0);
                    }
                }
            }
            if (!bVar3.initializationDataEquals(bVar4)) {
                i10 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new io.bidmachine.media3.exoplayer.k(this.f92111a, bVar3, bVar4, 1, 0);
            }
        }
        return new io.bidmachine.media3.exoplayer.k(this.f92111a, bVar3, bVar4, 0, i10);
    }

    public final void d(String str) {
        StringBuilder sbO = e3.g.o("NoSupport [", str, "] [");
        sbO.append(this.f92111a);
        sbO.append(", ");
        sbO.append(this.f92112b);
        sbO.append("] [");
        sbO.append(a1.f60680b);
        sbO.append(C3191e4.i.f36531e);
        io.bidmachine.media3.common.util.b0.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (a1.f60679a < 23 || (codecCapabilities = this.f92114d) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f92114d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f92114d;
        if (codecCapabilities == null) {
            d("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d("channelCount.aCaps");
            return false;
        }
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && (a1.f60679a < 26 || maxInputChannelCount <= 0)) {
            String str = this.f92112b;
            if (!MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_AMR_NB.equals(str) && !MimeTypes.AUDIO_AMR_WB.equals(str) && !MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_VORBIS.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str) && !MimeTypes.AUDIO_RAW.equals(str) && !MimeTypes.AUDIO_FLAC.equals(str) && !MimeTypes.AUDIO_ALAW.equals(str) && !MimeTypes.AUDIO_MLAW.equals(str) && !MimeTypes.AUDIO_MSGSM.equals(str)) {
                int i11 = MimeTypes.AUDIO_AC3.equals(str) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str) ? 16 : 30;
                StringBuilder sbR = a.b.r(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f92111a, ", [", " to ");
                sbR.append(i11);
                sbR.append(C3191e4.i.f36531e);
                io.bidmachine.media3.common.util.b0.w(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbR.toString());
                maxInputChannelCount = i11;
            }
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        d("channelCount.support, " + i10);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f92114d;
        if (codecCapabilities == null) {
            d("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            d("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        d("sampleRate.support, " + i10);
        return false;
    }

    public boolean isFormatFunctionallySupported(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        String str2 = this.f92112b;
        return (str2.equals(str) || str2.equals(h0.getAlternativeCodecMimeType(bVar))) && b(bVar, false) && c(bVar);
    }

    public boolean isFormatSupported(io.bidmachine.media3.common.b bVar) throws c0 {
        int i10;
        int i11;
        String str = bVar.f60665o;
        String str2 = this.f92112b;
        if ((str2.equals(str) || str2.equals(h0.getAlternativeCodecMimeType(bVar))) && b(bVar, true) && c(bVar)) {
            if (this.f92121k) {
                int i12 = bVar.f60672v;
                if (i12 > 0 && (i11 = bVar.f60673w) > 0) {
                    return isVideoSizeAndRateSupportedV21(i12, i11, bVar.f60674x);
                }
            } else {
                int i13 = bVar.F;
                if ((i13 == -1 || isAudioSampleRateSupportedV21(i13)) && ((i10 = bVar.E) == -1 || isAudioChannelCountSupportedV21(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (a1.f60679a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f92112b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(io.bidmachine.media3.common.b bVar) {
        if (this.f92121k) {
            return this.f92115e;
        }
        Pair<Integer, Integer> codecProfileAndLevel = h0.getCodecProfileAndLevel(bVar);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f92114d;
        if (codecCapabilities == null) {
            d("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            d("sizeAndRate.vCaps");
            return false;
        }
        if (a1.f60679a >= 29) {
            int iAreResolutionAndFrameRateCovered = u.areResolutionAndFrameRateCovered(videoCapabilities, i10, i11, d10);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                StringBuilder sbF = w0.i.f(i10, i11, "sizeAndRate.cover, ", "x", "@");
                sbF.append(d10);
                d(sbF.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f92111a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbF2 = w0.i.f(i10, i11, "sizeAndRate.rotated, ", "x", "@");
                    sbF2.append(d10);
                    StringBuilder sbB = b3.h.b("AssumedSupport [", sbF2.toString(), "] [", str, ", ");
                    sbB.append(this.f92112b);
                    sbB.append("] [");
                    sbB.append(a1.f60680b);
                    sbB.append(C3191e4.i.f36531e);
                    io.bidmachine.media3.common.util.b0.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbB.toString());
                }
            }
            StringBuilder sbF3 = w0.i.f(i10, i11, "sizeAndRate.support, ", "x", "@");
            sbF3.append(d10);
            d(sbF3.toString());
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f92111a;
    }
}
