package qe;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f82850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82851b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82852c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f82853d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82854e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82855f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82856g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f82857h;

    public r(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f82850a = (String) com.google.android.exoplayer2.util.a.checkNotNull(str);
        this.f82851b = str2;
        this.f82852c = str3;
        this.f82853d = codecCapabilities;
        this.f82856g = z10;
        this.f82854e = z11;
        this.f82855f = z12;
        this.f82857h = l0.isVideo(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(n1.ceilDivide(i10, widthAlignment) * widthAlignment, n1.ceilDivide(i11, heightAlignment) * heightAlignment);
        int i12 = point.x;
        int i13 = point.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qe.r newInstance(java.lang.String r3, java.lang.String r4, java.lang.String r5, android.media.MediaCodecInfo.CodecCapabilities r6, boolean r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            qe.r r3 = new qe.r
            r9 = 0
            r0 = 1
            if (r10 != 0) goto L45
            if (r7 == 0) goto L45
            int r10 = com.google.android.exoplayer2.util.n1.f28506a
            r1 = 19
            if (r10 < r1) goto L45
            java.lang.String r1 = "adaptive-playback"
            boolean r1 = r7.isFeatureSupported(r1)
            if (r1 == 0) goto L45
            r1 = 22
            if (r10 > r1) goto L42
            java.lang.String r10 = com.google.android.exoplayer2.util.n1.f28509d
            java.lang.String r1 = "ODROID-XU3"
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L31
            java.lang.String r1 = "Nexus 10"
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L42
        L31:
            java.lang.String r10 = "OMX.Exynos.AVC.Decoder"
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L45
            java.lang.String r10 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L42
            goto L45
        L42:
            r10 = r9
            r9 = r0
            goto L46
        L45:
            r10 = r9
        L46:
            r1 = 21
            if (r7 == 0) goto L54
            int r2 = com.google.android.exoplayer2.util.n1.f28506a
            if (r2 < r1) goto L54
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r7.isFeatureSupported(r2)
        L54:
            if (r11 != 0) goto L64
            if (r7 == 0) goto L65
            int r11 = com.google.android.exoplayer2.util.n1.f28506a
            if (r11 < r1) goto L65
            java.lang.String r11 = "secure-playback"
            boolean r11 = r7.isFeatureSupported(r11)
            if (r11 == 0) goto L65
        L64:
            r10 = r0
        L65:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.r.newInstance(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):qe.r");
    }

    public Point alignVideoSizeV21(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(n1.ceilDivide(i10, widthAlignment) * widthAlignment, n1.ceilDivide(i11, heightAlignment) * heightAlignment);
    }

    public final boolean b(z0 z0Var, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> codecProfileAndLevel = c0.getCodecProfileAndLevel(z0Var);
        if (codecProfileAndLevel != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
            boolean zEquals = "video/dolby-vision".equals(z0Var.f28802n);
            int i10 = 8;
            String str = this.f82851b;
            if (zEquals) {
                if ("video/avc".equals(str)) {
                    iIntValue = 8;
                } else if ("video/hevc".equals(str)) {
                    iIntValue = 2;
                }
                iIntValue2 = 0;
            }
            if (this.f82857h || iIntValue == 42) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
                if (n1.f28506a <= 23 && MimeTypes.VIDEO_VP9.equals(str) && profileLevels.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
                    int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i10 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i10 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i10 = NotificationCompat.FLAG_LOCAL_ONLY;
                    } else if (iIntValue3 >= 30000000) {
                        i10 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i10 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i10 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i10 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i10;
                    profileLevels = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : profileLevels) {
                    if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                        if ("video/hevc".equals(str) && 2 == iIntValue) {
                            String str2 = n1.f28507b;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                c("codec.profileLevel, " + z0Var.f28799k + ", " + this.f82852c);
                return false;
            }
        }
        return true;
    }

    public final void c(String str) {
        StringBuilder sbO = e3.g.o("NoSupport [", str, "] [");
        sbO.append(this.f82850a);
        sbO.append(", ");
        sbO.append(this.f82851b);
        sbO.append("] [");
        sbO.append(n1.f28510e);
        sbO.append(C3191e4.i.f36531e);
        f0.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbO.toString());
    }

    public ce.k canReuseCodec(z0 z0Var, z0 z0Var2) {
        z0 z0Var3;
        z0 z0Var4;
        int i10 = !n1.areEqual(z0Var.f28802n, z0Var2.f28802n) ? 8 : 0;
        if (this.f82857h) {
            if (z0Var.f28810v != z0Var2.f28810v) {
                i10 |= 1024;
            }
            if (!this.f82854e && (z0Var.f28807s != z0Var2.f28807s || z0Var.f28808t != z0Var2.f28808t)) {
                i10 |= 512;
            }
            if (!n1.areEqual(z0Var.f28814z, z0Var2.f28814z)) {
                i10 |= 2048;
            }
            if (n1.f28509d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f82850a) && !z0Var.initializationDataEquals(z0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ce.k(this.f82850a, z0Var, z0Var2, z0Var.initializationDataEquals(z0Var2) ? 3 : 2, 0);
            }
            z0Var3 = z0Var;
            z0Var4 = z0Var2;
        } else {
            z0Var3 = z0Var;
            z0Var4 = z0Var2;
            if (z0Var3.A != z0Var4.A) {
                i10 |= 4096;
            }
            if (z0Var3.B != z0Var4.B) {
                i10 |= Segment.SIZE;
            }
            if (z0Var3.C != z0Var4.C) {
                i10 |= 16384;
            }
            String str = this.f82851b;
            if (i10 == 0 && MimeTypes.AUDIO_AAC.equals(str)) {
                Pair<Integer, Integer> codecProfileAndLevel = c0.getCodecProfileAndLevel(z0Var3);
                Pair<Integer, Integer> codecProfileAndLevel2 = c0.getCodecProfileAndLevel(z0Var4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new ce.k(this.f82850a, z0Var3, z0Var4, 3, 0);
                    }
                }
            }
            if (!z0Var3.initializationDataEquals(z0Var4)) {
                i10 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new ce.k(this.f82850a, z0Var3, z0Var4, 1, 0);
            }
        }
        return new ce.k(this.f82850a, z0Var3, z0Var4, 0, i10);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (n1.f28506a < 23 || (codecCapabilities = this.f82853d) == null) {
            return -1;
        }
        return codecCapabilities.getMaxSupportedInstances();
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
        if (codecCapabilities == null) {
            c("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("channelCount.aCaps");
            return false;
        }
        int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && (n1.f28506a < 26 || maxInputChannelCount <= 0)) {
            String str = this.f82851b;
            if (!MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_AMR_NB.equals(str) && !MimeTypes.AUDIO_AMR_WB.equals(str) && !MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_VORBIS.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str) && !MimeTypes.AUDIO_RAW.equals(str) && !MimeTypes.AUDIO_FLAC.equals(str) && !MimeTypes.AUDIO_ALAW.equals(str) && !MimeTypes.AUDIO_MLAW.equals(str) && !MimeTypes.AUDIO_MSGSM.equals(str)) {
                int i11 = MimeTypes.AUDIO_AC3.equals(str) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str) ? 16 : 30;
                StringBuilder sbR = a.b.r(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f82850a, ", [", " to ");
                sbR.append(i11);
                sbR.append(C3191e4.i.f36531e);
                f0.w(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbR.toString());
                maxInputChannelCount = i11;
            }
        }
        if (maxInputChannelCount >= i10) {
            return true;
        }
        c("channelCount.support, " + i10);
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
        if (codecCapabilities == null) {
            c("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            c("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        c("sampleRate.support, " + i10);
        return false;
    }

    public boolean isFormatFunctionallySupported(z0 z0Var) {
        String str = z0Var.f28802n;
        String str2 = this.f82851b;
        return (str2.equals(str) || str2.equals(c0.getAlternativeCodecMimeType(z0Var))) && b(z0Var, false);
    }

    public boolean isFormatSupported(z0 z0Var) throws x {
        int i10;
        int i11;
        String str = z0Var.f28802n;
        String str2 = this.f82851b;
        boolean z10 = str2.equals(str) || str2.equals(c0.getAlternativeCodecMimeType(z0Var));
        int i12 = z0Var.f28808t;
        int i13 = z0Var.f28807s;
        if (z10 && b(z0Var, true)) {
            if (this.f82857h) {
                if (i13 > 0 && i12 > 0) {
                    if (n1.f28506a >= 21) {
                        return isVideoSizeAndRateSupportedV21(i13, i12, z0Var.f28809u);
                    }
                    boolean z11 = i13 * i12 <= c0.maxH264DecodableFrameSize();
                    if (!z11) {
                        c("legacyFrameSize, " + i13 + "x" + i12);
                    }
                    return z11;
                }
            } else if (n1.f28506a < 21 || (((i10 = z0Var.B) == -1 || isAudioSampleRateSupportedV21(i10)) && ((i11 = z0Var.A) == -1 || isAudioChannelCountSupportedV21(i11)))) {
            }
            return true;
        }
        return false;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (n1.f28506a >= 29 && MimeTypes.VIDEO_VP9.equals(this.f82851b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(z0 z0Var) {
        if (this.f82857h) {
            return this.f82854e;
        }
        Pair<Integer, Integer> codecProfileAndLevel = c0.getCodecProfileAndLevel(z0Var);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f82853d;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        if (n1.f28506a >= 29) {
            int iAreResolutionAndFrameRateCovered = q.areResolutionAndFrameRateCovered(videoCapabilities, i10, i11, d10);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                StringBuilder sbF = w0.i.f(i10, i11, "sizeAndRate.cover, ", "x", "@");
                sbF.append(d10);
                c(sbF.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f82850a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(n1.f28507b)) && a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbF2 = w0.i.f(i10, i11, "sizeAndRate.rotated, ", "x", "@");
                    sbF2.append(d10);
                    StringBuilder sbB = b3.h.b("AssumedSupport [", sbF2.toString(), "] [", str, ", ");
                    sbB.append(this.f82851b);
                    sbB.append("] [");
                    sbB.append(n1.f28510e);
                    sbB.append(C3191e4.i.f36531e);
                    f0.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, sbB.toString());
                }
            }
            StringBuilder sbF3 = w0.i.f(i10, i11, "sizeAndRate.support, ", "x", "@");
            sbF3.append(d10);
            c(sbF3.toString());
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f82850a;
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(z0 z0Var, z0 z0Var2, boolean z10) {
        if (!z10 && z0Var.f28814z != null && z0Var2.f28814z == null) {
            z0Var2 = z0Var2.buildUpon().setColorInfo(z0Var.f28814z).build();
        }
        int i10 = canReuseCodec(z0Var, z0Var2).f12247d;
        return i10 == 2 || i10 == 3;
    }
}
