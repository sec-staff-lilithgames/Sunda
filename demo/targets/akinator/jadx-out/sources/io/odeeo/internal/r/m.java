package io.odeeo.internal.r;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.BKC.KerkSviMAy;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import io.odeeo.internal.b.t;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f66112a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<b, List<j>> f66113b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public static int f66114c = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f66115a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f66116b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f66117c;

        public b(String str, boolean z10, boolean z11) {
            this.f66115a = str;
            this.f66116b = z10;
            this.f66117c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f66115a, bVar.f66115a) && this.f66116b == bVar.f66116b && this.f66117c == bVar.f66117c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((o2.e(31, 31, this.f66115a) + (this.f66116b ? 1231 : 1237)) * 31) + (this.f66117c ? 1231 : 1237);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends Exception {
        public c(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i10);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements d {
        public e() {
        }

        @Override // io.odeeo.internal.r.m.d
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // io.odeeo.internal.r.m.d
        public MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f66118a;

        /* renamed from: b, reason: collision with root package name */
        public MediaCodecInfo[] f66119b;

        public f(boolean z10, boolean z11) {
            this.f66118a = (z10 || z11) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        public final void a() {
            if (this.f66119b == null) {
                this.f66119b = new MediaCodecList(this.f66118a).getCodecInfos();
            }
        }

        @Override // io.odeeo.internal.r.m.d
        public int getCodecCount() {
            a();
            return this.f66119b.length;
        }

        @Override // io.odeeo.internal.r.m.d
        public MediaCodecInfo getCodecInfoAt(int i10) {
            a();
            return this.f66119b[i10];
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // io.odeeo.internal.r.m.d
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface g<T> {
        int getScore(T t10);
    }

    public static int a(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return Segment.SIZE;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int b(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return NotificationCompat.FLAG_LOCAL_ONLY;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return Segment.SIZE;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int c(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case Segment.SIZE /* 8192 */:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    public static synchronized void clearDecoderInfoCache() {
        f66113b.clear();
    }

    public static int d(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static int e(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static int f(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return Segment.SIZE;
            default:
                return -1;
        }
    }

    public static int g(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(io.odeeo.internal.b.t r6) {
        /*
            java.lang.String r0 = r6.f62968i
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f62971l
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.f62968i
            android.util.Pair r6 = c(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L6f;
                case 3006243: goto L64;
                case 3006244: goto L59;
                case 3199032: goto L4e;
                case 3214780: goto L43;
                case 3356560: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L78
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 6
            goto L78
        L38:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 5
            goto L78
        L43:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 4
            goto L78
        L4e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 3
            goto L78
        L59:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 2
            goto L78
        L64:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 1
            goto L78
        L6f:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L78
            goto L2b
        L78:
            switch(r2) {
                case 0: goto L98;
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L83;
                case 6: goto L7c;
                default: goto L7b;
            }
        L7b:
            return r1
        L7c:
            java.lang.String r6 = r6.f62968i
            android.util.Pair r6 = e(r6, r0)
            return r6
        L83:
            java.lang.String r6 = r6.f62968i
            android.util.Pair r6 = a(r6, r0)
            return r6
        L8a:
            java.lang.String r6 = r6.f62968i
            android.util.Pair r6 = d(r6, r0)
            return r6
        L91:
            java.lang.String r6 = r6.f62968i
            android.util.Pair r6 = b(r6, r0)
            return r6
        L98:
            java.lang.String r1 = r6.f62968i
            io.odeeo.internal.r0.b r6 = r6.f62983x
            android.util.Pair r6 = a(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r.m.getCodecProfileAndLevel(io.odeeo.internal.b.t):android.util.Pair");
    }

    public static j getDecoderInfo(String str, boolean z10, boolean z11) throws c {
        List<j> decoderInfos = getDecoderInfos(str, z10, z11);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<j> getDecoderInfos(String str, boolean z10, boolean z11) throws c {
        try {
            b bVar = new b(str, z10, z11);
            HashMap<b, List<j>> map = f66113b;
            List<j> list = map.get(bVar);
            if (list != null) {
                return list;
            }
            int i10 = g0.f65861a;
            ArrayList<j> arrayListA = a(bVar, i10 >= 21 ? new f(z10, z11) : new e());
            if (z10 && arrayListA.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListA = a(bVar, new e());
                if (!arrayListA.isEmpty()) {
                    p.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListA.get(0).f66056a);
                }
            }
            a(str, arrayListA);
            List<j> listUnmodifiableList = Collections.unmodifiableList(arrayListA);
            map.put(bVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static List<j> getDecoderInfosSortedByFormatSupport(List<j> list, t tVar) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new af.g(tVar, 22));
        return arrayList;
    }

    public static j getDecryptOnlyDecoderInfo() throws c {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static int maxH264DecodableFrameSize() throws c {
        if (f66114c == -1) {
            int iMax = 0;
            j decoderInfo = getDecoderInfo("video/avc", false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(c(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, g0.f65861a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f66114c = iMax;
        }
        return f66114c;
    }

    public static void warmDecoderInfoCache(String str, boolean z10, boolean z11) {
        try {
            getDecoderInfos(str, z10, z11);
        } catch (c e10) {
            p.e("MediaCodecUtil", "Codec warming failed", e10);
        }
    }

    public static /* synthetic */ int a(t tVar, j jVar) {
        try {
            return jVar.isFormatSupported(tVar) ? 1 : 0;
        } catch (c unused) {
            return -1;
        }
    }

    public static /* synthetic */ int b(j jVar) {
        return jVar.f66056a.startsWith("OMX.google") ? 1 : 0;
    }

    public static boolean c(MediaCodecInfo mediaCodecInfo) {
        return g0.f65861a >= 29 ? d(mediaCodecInfo) : !e(mediaCodecInfo);
    }

    public static boolean d(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo) {
        if (g0.f65861a >= 29) {
            return f(mediaCodecInfo);
        }
        String lowerCase = io.odeeo.internal.t0.c.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) {
            return true;
        }
        return (lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")) ? false : true;
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (g0.f65861a >= 29) {
            return h(mediaCodecInfo);
        }
        String lowerCase = io.odeeo.internal.t0.c.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[PHI: r16
      0x008d: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:43:0x009d, B:35:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #4 {Exception -> 0x0146, blocks: (B:3:0x0008, B:5:0x001b, B:70:0x011b, B:8:0x002b, B:11:0x0036, B:64:0x00f4, B:67:0x00fc, B:69:0x0102, B:71:0x0123, B:72:0x0144), top: B:85:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<io.odeeo.internal.r.j> a(io.odeeo.internal.r.m.b r19, io.odeeo.internal.r.m.d r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r.m.a(io.odeeo.internal.r.m$b, io.odeeo.internal.r.m$d):java.util.ArrayList");
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static Pair<Integer, Integer> d(String str, String[] strArr) {
        if (strArr.length < 4) {
            o2.A("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i10 = 1;
        Matcher matcher = f66112a.matcher(strArr[1]);
        if (!matcher.matches()) {
            o2.A("Ignoring malformed HEVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                o2.A("Unknown HEVC profile string: ", strGroup, "MediaCodecUtil");
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer numC = c(str2);
        if (numC == null) {
            o2.A("Unknown HEVC level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair<>(Integer.valueOf(i10), numC);
    }

    public static Pair<Integer, Integer> b(String str, String[] strArr) throws NumberFormatException {
        int i10;
        int i11;
        if (strArr.length < 2) {
            o2.A("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            } else {
                p.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int iD = d(i11);
            if (iD == -1) {
                e3.g.z(i11, "Unknown AVC profile: ", "MediaCodecUtil");
                return null;
            }
            int iB = b(i10);
            if (iB == -1) {
                e3.g.z(i10, "Unknown AVC level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(iD), Integer.valueOf(iB));
        } catch (NumberFormatException unused) {
            o2.A("Ignoring malformed AVC codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    public static Pair<Integer, Integer> c(String str, String[] strArr) {
        if (strArr.length < 3) {
            o2.A("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        Matcher matcher = f66112a.matcher(strArr[1]);
        if (!matcher.matches()) {
            o2.A("Ignoring malformed Dolby Vision codec string: ", str, "MediaCodecUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numB = b(strGroup);
        if (numB == null) {
            o2.A("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
            return null;
        }
        String str2 = strArr[2];
        Integer numA = a(str2);
        if (numA == null) {
            o2.A("Unknown Dolby Vision level string: ", str2, "MediaCodecUtil");
            return null;
        }
        return new Pair<>(numB, numA);
    }

    public static Pair<Integer, Integer> e(String str, String[] strArr) throws NumberFormatException {
        if (strArr.length < 3) {
            o2.A("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int iG = g(i10);
            if (iG == -1) {
                e3.g.z(i10, "Unknown VP9 profile: ", "MediaCodecUtil");
                return null;
            }
            int iF = f(i11);
            if (iF == -1) {
                e3.g.z(i11, "Unknown VP9 level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(iG), Integer.valueOf(iF));
        } catch (NumberFormatException unused) {
            o2.A("Ignoring malformed VP9 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    public static String a(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return QGjYBESwAiCc.DQAxwkwec;
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    public static Integer c(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static Integer b(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = g0.f65861a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = g0.f65862b;
            if ("a70".equals(str3) || ("Xiaomi".equals(g0.f65863c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = g0.f65862b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = g0.f65862b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(g0.f65863c))) {
            String str6 = g0.f65862b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(g0.f65863c)) {
            String str7 = g0.f65862b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && g0.f65862b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static void a(String str, List<j> list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (g0.f65861a < 26 && g0.f65862b.equals("R9") && list.size() == 1 && list.get(0).f66056a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(j.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            a(list, new com.google.android.gms.internal.ads.a(24));
        }
        int i10 = g0.f65861a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f66056a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                a(list, new com.google.android.gms.internal.ads.a(25));
            }
        }
        if (i10 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f66056a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static /* synthetic */ int a(j jVar) {
        String str = jVar.f66056a;
        if (str.startsWith(KerkSviMAy.qZfxmEODaXwfuIU) || str.startsWith("c2.android")) {
            return 1;
        }
        return (g0.f65861a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static boolean a(MediaCodecInfo mediaCodecInfo) {
        return g0.f65861a >= 29 && b(mediaCodecInfo);
    }

    public static Pair<Integer, Integer> a(String str, String[] strArr, io.odeeo.internal.r0.b bVar) throws NumberFormatException {
        int i10;
        if (strArr.length < 4) {
            o2.A("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
        int i11 = 1;
        try {
            int i12 = Integer.parseInt(strArr[1]);
            int i13 = Integer.parseInt(strArr[2].substring(0, 2));
            int i14 = Integer.parseInt(strArr[3]);
            if (i12 != 0) {
                e3.g.z(i12, "Unknown AV1 profile: ", "MediaCodecUtil");
                return null;
            }
            if (i14 != 8 && i14 != 10) {
                e3.g.z(i14, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                return null;
            }
            if (i14 != 8) {
                i11 = (bVar == null || !(bVar.f66134d != null || (i10 = bVar.f66133c) == 7 || i10 == 6)) ? 2 : 4096;
            }
            int iA = a(i13);
            if (iA == -1) {
                e3.g.z(i13, "Unknown AV1 level: ", "MediaCodecUtil");
                return null;
            }
            return new Pair<>(Integer.valueOf(i11), Integer.valueOf(iA));
        } catch (NumberFormatException unused) {
            o2.A("Ignoring malformed AV1 codec string: ", str, "MediaCodecUtil");
            return null;
        }
    }

    public static Pair<Integer, Integer> a(String str, String[] strArr) {
        int iE;
        if (strArr.length != 3) {
            o2.A("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(io.odeeo.internal.q0.t.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iE = e(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iE), 0);
            }
        } catch (NumberFormatException unused) {
            o2.A("Ignoring malformed MP4A codec string: ", str, "MediaCodecUtil");
        }
        return null;
    }

    public static /* synthetic */ int a(g gVar, Object obj, Object obj2) {
        return gVar.getScore(obj2) - gVar.getScore(obj);
    }

    public static <T> void a(List<T> list, g<T> gVar) {
        Collections.sort(list, new bg.d(gVar, 1));
    }

    public static Integer a(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
