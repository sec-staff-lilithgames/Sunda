package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.applovin.shadow.okio.Segment;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f25654a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25655b;

    /* renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f25656c;

    /* renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f25657d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f25658e;

    /* renamed from: f, reason: collision with root package name */
    public static int f25659f;

    static {
        new a("OMX.google.raw.decoder", null, null, false);
        f25654a = Pattern.compile("^\\D?(\\d+)$");
        f25655b = new HashMap();
        f25659f = -1;
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25656c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f25657d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, NotificationCompat.FLAG_LOCAL_ONLY);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, Segment.SIZE);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        HashMap map = new HashMap();
        f25658e = map;
        e2.v(1, map, "L30", 4, "L60");
        e2.v(16, map, "L63", 64, "L90");
        e2.v(NotificationCompat.FLAG_LOCAL_ONLY, map, "L93", 1024, "L120");
        e2.v(4096, map, "L123", 16384, "L150");
        e2.v(C.DEFAULT_BUFFER_SEGMENT_SIZE, map, "L153", 262144, "L156");
        e2.v(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, map, "L180", 4194304, "L183");
        e2.v(16777216, map, "L186", 2, "H30");
        e2.v(8, map, "H60", 32, "H63");
        e2.v(128, map, "H90", 512, "H93");
        e2.v(2048, map, "H120", Segment.SIZE, "H123");
        e2.v(32768, map, "H150", 131072, "H153");
        e2.v(524288, map, "H156", 2097152, "H180");
        e2.v(8388608, map, "H183", 33554432, "H186");
    }

    public static a a(boolean z10, String str) {
        List listUnmodifiableList;
        synchronized (j.class) {
            try {
                e eVar = new e(z10, str);
                listUnmodifiableList = (List) f25655b.get(eVar);
                if (listUnmodifiableList == null) {
                    int i10 = z.f26070a;
                    ArrayList arrayListA = a(eVar, i10 >= 21 ? new i(z10) : new h());
                    if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                        arrayListA = a(eVar, new h());
                        if (!arrayListA.isEmpty()) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((a) arrayListA.get(0)).f25625a);
                        }
                    }
                    if (i10 < 26) {
                        int i11 = 1;
                        if (arrayListA.size() > 1 && "OMX.MTK.AUDIO.DECODER.RAW".equals(((a) arrayListA.get(0)).f25625a)) {
                            while (true) {
                                if (i11 >= arrayListA.size()) {
                                    break;
                                }
                                a aVar = (a) arrayListA.get(i11);
                                if ("OMX.google.raw.decoder".equals(aVar.f25625a)) {
                                    arrayListA.remove(i11);
                                    arrayListA.add(0, aVar);
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayListA);
                    f25655b.put(eVar, listUnmodifiableList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return null;
        }
        return (a) listUnmodifiableList.get(0);
    }

    public static int a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f25659f == -1) {
            int iMax = 0;
            a aVarA = a(false, "video/avc");
            if (aVarA != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = aVarA.f25629e;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case Segment.SIZE /* 8192 */:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                                i10 = 9437184;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, z.f26070a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f25659f = iMax;
        }
        return f25659f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e r16, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.e, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g):java.util.ArrayList");
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = z.f26070a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(z.f26071b)) {
            return false;
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str2 = z.f26071b;
            if ("dlxu".equals(str2) || "protou".equals(str2) || "ville".equals(str2) || "villeplus".equals(str2) || "villec2".equals(str2) || str2.startsWith("gee") || "C6602".equals(str2) || "C6603".equals(str2) || "C6606".equals(str2) || "C6616".equals(str2) || "L36h".equals(str2) || "SO-02E".equals(str2)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str3 = z.f26071b;
            if ("C1504".equals(str3) || "C1505".equals(str3) || "C1604".equals(str3) || "C1605".equals(str3)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(z.f26072c)) {
            String str4 = z.f26071b;
            if (str4.startsWith("d2") || str4.startsWith("serrano") || str4.startsWith("jflte") || str4.startsWith("santos") || str4.startsWith("t0")) {
                return false;
            }
        }
        return (i10 <= 19 && z.f26071b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }
}
