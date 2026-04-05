package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f25204h = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f25205i = {44100, 48000, 32000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f25206j = {32, 64, 96, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, TTAdConstant.PACKAGE_NAME_CODE, 448};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f25207k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f25208l = {32, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f25209m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f25210n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a, reason: collision with root package name */
    public int f25211a;

    /* renamed from: b, reason: collision with root package name */
    public String f25212b;

    /* renamed from: c, reason: collision with root package name */
    public int f25213c;

    /* renamed from: d, reason: collision with root package name */
    public int f25214d;

    /* renamed from: e, reason: collision with root package name */
    public int f25215e;

    /* renamed from: f, reason: collision with root package name */
    public int f25216f;

    /* renamed from: g, reason: collision with root package name */
    public int f25217g;

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = f25205i[i14];
        if (i11 == 2) {
            i15 /= 2;
        } else if (i11 == 0) {
            i15 /= 4;
        }
        int i16 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f25206j[i13 - 1] : f25207k[i13 - 1]) * 12000) / i15) + i16) * 4;
        }
        int i17 = i11 == 3 ? i12 == 2 ? f25208l[i13 - 1] : f25209m[i13 - 1] : f25210n[i13 - 1];
        if (i11 == 3) {
            return a.b.a(i17, 144000, i15, i16);
        }
        return a.b.a(i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i17, i15, i16);
    }

    public static boolean a(int i10, n nVar) {
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
        int i17 = f25205i[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            i15 = i11 == 3 ? f25206j[i13 - 1] : f25207k[i13 - 1];
            iA = (((i15 * 12000) / i17) + i18) * 4;
            i16 = 384;
        } else {
            if (i11 == 3) {
                i15 = i12 == 2 ? f25208l[i13 - 1] : f25209m[i13 - 1];
                iA = a.b.a(i15, 144000, i17, i18);
            } else {
                i15 = f25210n[i13 - 1];
                i = i12 == 1 ? 576 : 1152;
                iA = a.b.a(i12 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000, i15, i17, i18);
            }
            i16 = i;
        }
        String str = f25204h[3 - i12];
        int i19 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        nVar.f25211a = i11;
        nVar.f25212b = str;
        nVar.f25213c = iA;
        nVar.f25214d = i17;
        nVar.f25215e = i19;
        nVar.f25216f = i15 * 1000;
        nVar.f25217g = i16;
        return true;
    }
}
