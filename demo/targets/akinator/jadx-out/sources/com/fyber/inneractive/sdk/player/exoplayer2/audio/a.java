package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24488a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f24489b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f24490c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f24491d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f24492e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f24493f = {69, 87, 104, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f24489b;
        if (i10 >= 3 || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f24493f;
        if (i12 >= 19) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f24492e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
