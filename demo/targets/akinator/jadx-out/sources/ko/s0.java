package ko;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f71760a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f71761b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f71762c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f71763d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f71764e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f71765f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f71766g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int getFrameSize(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f71761b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f71762c[i13 - 1] : f71763d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f71764e[i13 - 1] : f71765f[i13 - 1] : f71766g[i13 - 1];
        if (i11 == 3) {
            return a.b.a(i17, 144, i15, i16);
        }
        return a.b.a(i12 == 1 ? 72 : 144, i17, i15, i16);
    }

    public static int parseMpegAudioFrameSampleCount(int i10) {
        int i11;
        int i12;
        if ((i10 & (-2097152)) == -2097152 && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0) {
            int i13 = (i10 >>> 12) & 15;
            int i14 = (i10 >>> 10) & 3;
            if (i13 != 0 && i13 != 15 && i14 != 3) {
                if (i12 == 1) {
                    return i11 == 3 ? 1152 : 576;
                }
                if (i12 == 2) {
                    return 1152;
                }
                if (i12 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
        }
        return -1;
    }
}
