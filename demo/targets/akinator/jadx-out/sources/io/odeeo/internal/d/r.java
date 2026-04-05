package io.odeeo.internal.d;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f63474a = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f63475b = {44100, 48000, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f63476c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f63477d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f63478e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f63479f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f63480g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f63481a;

        /* renamed from: b, reason: collision with root package name */
        public String f63482b;

        /* renamed from: c, reason: collision with root package name */
        public int f63483c;

        /* renamed from: d, reason: collision with root package name */
        public int f63484d;

        /* renamed from: e, reason: collision with root package name */
        public int f63485e;

        /* renamed from: f, reason: collision with root package name */
        public int f63486f;

        /* renamed from: g, reason: collision with root package name */
        public int f63487g;

        public boolean setForHeaderData(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!r.b(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f63481a = i11;
            this.f63482b = r.f63474a[3 - i12];
            int i15 = r.f63475b[i14];
            this.f63484d = i15;
            if (i11 == 2) {
                this.f63484d = i15 / 2;
            } else if (i11 == 0) {
                this.f63484d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f63487g = r.b(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? r.f63476c[i13 - 1] : r.f63477d[i13 - 1];
                this.f63486f = i17;
                this.f63483c = (((i17 * 12) / this.f63484d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? r.f63478e[i13 - 1] : r.f63479f[i13 - 1];
                    this.f63486f = i18;
                    this.f63483c = ((i18 * 144) / this.f63484d) + i16;
                } else {
                    int i19 = r.f63480g[i13 - 1];
                    this.f63486f = i19;
                    this.f63483c = (((i12 == 1 ? 72 : 144) * i19) / this.f63484d) + i16;
                }
            }
            this.f63485e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static boolean b(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int getFrameSize(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!b(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f63475b[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f63476c[i13 - 1] : f63477d[i13 - 1]) * 12) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f63478e[i13 - 1] : f63479f[i13 - 1] : f63480g[i13 - 1];
        if (i11 == 3) {
            return a.b.a(i17, 144, i15, i16);
        }
        return a.b.a(i12 == 1 ? 72 : 144, i17, i15, i16);
    }

    public static int parseMpegAudioFrameSampleCount(int i10) {
        int i11;
        int i12;
        if (!b(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }

    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
