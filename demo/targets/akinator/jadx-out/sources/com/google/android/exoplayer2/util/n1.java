package com.google.android.exoplayer2.util;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.m2;
import com.google.android.exoplayer2.n2;
import com.google.android.exoplayer2.r2;
import com.google.android.exoplayer2.t1;
import com.google.android.exoplayer2.u1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import nh.b5;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p0.o2;
import sh.a2;
import sh.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f28506a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f28507b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f28508c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f28509d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f28510e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f28511f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f28512g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f28513h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f28514i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f28515j;

    /* renamed from: k, reason: collision with root package name */
    public static HashMap f28516k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f28517l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f28518m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f28519n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f28520o;

    public static String a(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            f0.e("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static long addWithOverflowDefault(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean b(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) a.checkNotNull(uri.getHost()));
    }

    public static int binarySearchCeil(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = ~iBinarySearch;
        } else {
            while (true) {
                i11 = iBinarySearch + 1;
                if (i11 >= iArr.length || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.min(iArr.length - 1, i12) : i12;
    }

    public static int binarySearchFloor(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iBinarySearch = Arrays.binarySearch(iArr, i10);
        if (iBinarySearch < 0) {
            i12 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i11 = iBinarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                iBinarySearch = i11;
            }
            i12 = z10 ? iBinarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.app.Activity r3, android.net.Uri r4) {
        /*
            int r0 = com.google.android.exoplayer2.util.n1.f28506a
            r1 = 23
            r2 = 0
            if (r0 < r1) goto L58
            boolean r0 = isLocalFileUri(r4)
            if (r0 != 0) goto L47
            java.lang.String r0 = "content"
            java.lang.String r1 = r4.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L58
            java.lang.String r0 = "media"
            java.lang.String r1 = r4.getAuthority()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L58
        L26:
            java.util.List r4 = r4.getPathSegments()
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L31
            goto L58
        L31:
            java.lang.Object r4 = r4.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "external"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L47
            java.lang.String r0 = "external_primary"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L58
        L47:
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = r3.checkSelfPermission(r4)
            if (r0 == 0) goto L58
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r3.requestPermissions(r4, r2)
            r3 = 1
            return r3
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.n1.c(android.app.Activity, android.net.Uri):boolean");
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(T t10) {
        return t10;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int ceilDivide(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static boolean checkCleartextTrafficPermitted(u1... u1VarArr) {
        if (f28506a < 24) {
            return true;
        }
        for (u1 u1Var : u1VarArr) {
            com.google.android.exoplayer2.o1 o1Var = u1Var.f28113c;
            com.google.android.exoplayer2.o1 o1Var2 = u1Var.f28113c;
            if (o1Var != null) {
                if (b(o1Var.f27860b)) {
                    return false;
                }
                for (int i10 = 0; i10 < o1Var2.f27866i.size(); i10++) {
                    if (b(((t1) o1Var2.f27866i.get(i10)).f28047b)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static int constrainValue(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int crc32(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f28519n[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int crc8(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f28520o[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static File createTempDirectory(Context context, String str) throws IOException {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, (File) a.checkNotNull(context.getCacheDir()));
    }

    public static boolean d(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static long durationUsToSampleCount(long j10, int i10) {
        return ceilDivide(j10 * i10, 1000000L);
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (d(str.charAt(i12))) {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((i11 * 2) + length);
        while (i11 > 0) {
            int i13 = i10 + 1;
            char cCharAt = str.charAt(i10);
            if (d(cCharAt)) {
                sb2.append('%');
                sb2.append(Integer.toHexString(cCharAt));
                i11--;
            } else {
                sb2.append(cCharAt);
            }
            i10 = i13;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        return sb2.toString();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f28515j.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, mh.h0.f74628c);
    }

    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String getAdaptiveMimeTypeForContentType(int i10) {
        if (i10 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i10 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i10 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    public static int getAudioContentTypeForStreamType(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) ? 4 : 2;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getAudioTrackChannelConfig(int r2) {
        /*
            r0 = 6396(0x18fc, float:8.963E-42)
            switch(r2) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                case 8: goto L15;
                case 9: goto L5;
                case 10: goto Lb;
                case 11: goto L5;
                case 12: goto L7;
                default: goto L5;
            }
        L5:
            r2 = 0
            return r2
        L7:
            r2 = 743676(0xb58fc, float:1.042112E-39)
            return r2
        Lb:
            int r2 = com.google.android.exoplayer2.util.n1.f28506a
            r1 = 32
            if (r2 < r1) goto L15
            r2 = 737532(0xb40fc, float:1.033502E-39)
            return r2
        L15:
            return r0
        L16:
            r2 = 1276(0x4fc, float:1.788E-42)
            return r2
        L19:
            r2 = 252(0xfc, float:3.53E-43)
            return r2
        L1c:
            r2 = 220(0xdc, float:3.08E-43)
            return r2
        L1f:
            r2 = 204(0xcc, float:2.86E-43)
            return r2
        L22:
            r2 = 28
            return r2
        L25:
            r2 = 12
            return r2
        L28:
            r2 = 4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(int):int");
    }

    public static int getAudioUsageForStreamType(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                return i10 != 8 ? 1 : 3;
            }
        }
        return i11;
    }

    public static n2 getAvailableCommands(r2 r2Var, n2 n2Var) {
        boolean zIsPlayingAd = r2Var.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = r2Var.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = r2Var.hasPreviousMediaItem();
        boolean zHasNextMediaItem = r2Var.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = r2Var.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = r2Var.isCurrentMediaItemDynamic();
        boolean zIsEmpty = r2Var.getCurrentTimeline().isEmpty();
        boolean z10 = false;
        m2 m2VarAddIf = new m2().addAll(n2Var).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z10 = true;
        }
        return m2VarAddIf.addIf(12, z10).build();
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (Character.digit(str.charAt(i11 + 1), 16) + (Character.digit(str.charAt(i11), 16) << 4));
        }
        return bArr;
    }

    public static int getCodecCountOfType(String str, int i10) {
        int i11 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i10 == l0.getTrackTypeOfCodec(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static String getCodecsOfType(String str, int i10) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i10 == l0.getTrackTypeOfCodec(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                sb2.append(", ");
            }
        }
        return sb2.toString();
    }

    public static String getCountryCode(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return mh.c.toUpperCase(networkCountryIso);
            }
        }
        return mh.c.toUpperCase(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager;
        Display display = (f28506a < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) a.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Uri getDataUriForString(String str, String str2) {
        StringBuilder sbO = e3.g.o("data:", str, ";base64,");
        sbO.append(Base64.encodeToString(str2.getBytes(), 2));
        return Uri.parse(sbO.toString());
    }

    public static Locale getDefaultDisplayLocale() {
        return f28506a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static Drawable getDrawable(Context context, Resources resources, int i10) {
        return f28506a >= 21 ? m1.getDrawable(context, resources, i10) : resources.getDrawable(i10);
    }

    public static UUID getDrmUuid(String str) {
        String lowerCase = mh.c.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "playready":
                return com.google.android.exoplayer2.j.f27538e;
            case "widevine":
                return com.google.android.exoplayer2.j.f27537d;
            case "clearkey":
                return com.google.android.exoplayer2.j.f27536c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(String str) throws NumberFormatException {
        String[] strArrSplit;
        int length;
        int i10 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z10 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            i10 = Integer.parseInt((String) a.checkNotNull(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static String getFormatSupportString(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        a.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iCharAt = (iCharAt << 8) | str.charAt(i10);
        }
        return iCharAt;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return f28506a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context, String str, boolean z10) {
        return (f28506a < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) ? 1 : 5;
    }

    public static long getMediaDurationForPlayoutDuration(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static long getNowUnixTimeMs(long j10) {
        return j10 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static int getPcmEncoding(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static com.google.android.exoplayer2.z0 getPcmFormat(int i10, int i11, int i12) {
        return new com.google.android.exoplayer2.y0().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i11).setSampleRate(i12).setPcmEncoding(i10).build();
    }

    public static int getPcmFrameSize(int i10, int i11) {
        if (i10 != 2) {
            if (i10 == 3) {
                return i11;
            }
            if (i10 != 4) {
                if (i10 != 268435456) {
                    if (i10 == 536870912) {
                        return i11 * 3;
                    }
                    if (i10 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i11 * 4;
        }
        return i11 * 2;
    }

    public static long getPlayoutDurationForMediaDuration(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static int getStreamTypeForAudioUsage(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String getStringForTime(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long jAbs = (Math.abs(j10) + 500) / 1000;
        long j11 = jAbs % 60;
        long j12 = (jAbs / 60) % 60;
        long j13 = jAbs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static String[] getSystemLanguageCodes() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = f28506a >= 24 ? split(configuration.getLocales().toLanguageTags(), ",") : new String[]{getLocaleLanguageTag(configuration.locale)};
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            strArrSplit[i10] = normalizeLanguageCode(strArrSplit[i10]);
        }
        return strArrSplit;
    }

    public static String getTrackTypeString(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                return i10 >= 10000 ? o2.k(i10, "custom (", ")") : "?";
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        return j1.o2.o(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.19.1");
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(mh.h0.f74628c);
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static boolean handlePauseButtonAction(r2 r2Var) {
        if (r2Var == null || !r2Var.isCommandAvailable(1)) {
            return false;
        }
        r2Var.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean handlePlayButtonAction(com.google.android.exoplayer2.r2 r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.getPlaybackState()
            r2 = 1
            if (r1 != r2) goto L17
            r3 = 2
            boolean r3 = r4.isCommandAvailable(r3)
            if (r3 == 0) goto L17
            r4.prepare()
        L15:
            r0 = r2
            goto L24
        L17:
            r3 = 4
            if (r1 != r3) goto L24
            boolean r1 = r4.isCommandAvailable(r3)
            if (r1 == 0) goto L24
            r4.seekToDefaultPosition()
            goto L15
        L24:
            boolean r1 = r4.isCommandAvailable(r2)
            if (r1 == 0) goto L2e
            r4.play()
            return r2
        L2e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.n1.handlePlayButtonAction(com.google.android.exoplayer2.r2):boolean");
    }

    public static boolean handlePlayPauseButtonAction(r2 r2Var) {
        return shouldShowPlayButton(r2Var) ? handlePlayButtonAction(r2Var) : handlePauseButtonAction(r2Var);
    }

    @Deprecated
    public static int inferContentType(Uri uri, String str) {
        return TextUtils.isEmpty(str) ? inferContentType(uri) : inferContentTypeForExtension(str);
    }

    public static int inferContentTypeForExtension(String str) {
        String lowerCase = mh.c.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean inflate(v0 v0Var, v0 v0Var2, Inflater inflater) {
        if (v0Var.bytesLeft() <= 0) {
            return false;
        }
        if (v0Var2.capacity() < v0Var.bytesLeft()) {
            v0Var2.ensureCapacity(v0Var.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(v0Var.getData(), v0Var.getPosition(), v0Var.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(v0Var2.getData(), iInflate, v0Var2.capacity() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == v0Var2.capacity()) {
                        v0Var2.ensureCapacity(v0Var2.capacity() * 2);
                    }
                } else {
                    v0Var2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static String intToStringMaxRadix(int i10) {
        return Integer.toString(i10, 36);
    }

    public static boolean isAutomotive(Context context) {
        return f28506a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isEncodingHighResolutionPcm(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean isEncodingLinearPcm(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean isLinebreak(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || C3191e4.h.f36473b.equals(scheme);
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int linearSearch(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static long maxValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMax = Math.max(jMax, sparseLongArray.valueAt(i10));
        }
        return jMax;
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        if (f28506a < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (c(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i10));
        }
        return jMin;
    }

    public static <T> void moveItems(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static long msToUs(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return Executors.newSingleThreadExecutor(new j1(str, 1));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new j1(str, 0));
    }

    public static String normalizeLanguageCode(String str) throws MissingResourceException {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String lowerCase = mh.c.toLowerCase(str);
        int i10 = 0;
        String str2 = splitAtFirst(lowerCase, "-")[0];
        if (f28516k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f28517l;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                map.put(strArr[i11], strArr[i11 + 1]);
            }
            f28516k = map;
        }
        String str4 = (String) f28516k.get(str2);
        if (str4 != null) {
            StringBuilder sbU = o2.u(str4);
            sbU.append(lowerCase.substring(str2.length()));
            lowerCase = sbU.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return lowerCase;
        }
        while (true) {
            String[] strArr2 = f28518m;
            if (i10 >= strArr2.length) {
                return lowerCase;
            }
            if (lowerCase.startsWith(strArr2[i10])) {
                return strArr2[i10 + 1] + lowerCase.substring(strArr2[i10].length());
            }
            i10 += 2;
        }
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t10) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t10;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i10) {
        a.checkArgument(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i10, int i11) {
        a.checkArgument(i10 >= 0);
        a.checkArgument(i11 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        a.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static long parseXsDateTime(String str) throws h2 {
        Matcher matcher = f28512g.matcher(str);
        if (!matcher.matches()) {
            throw h2.createForMalformedContainer("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) : timeInMillis;
    }

    public static long parseXsDuration(String str) {
        Matcher matcher = f28513h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d10 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d11 = d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d12 = d11 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d13 = d12 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d14 = d13 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d14 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> sh.n1 postOrRunWithCompletion(Handler handler, Runnable runnable, T t10) {
        a2 a2VarCreate = a2.create();
        postOrRun(handler, new l1(a2VarCreate, runnable, t10, 0));
        return a2VarCreate;
    }

    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static Intent registerReceiverNotExported(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return f28506a < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static <T> void removeRange(List<T> list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static long sampleCountToDurationUs(long j10, int i10) {
        return (j10 * 1000000) / i10;
    }

    public static long scaleLargeTimestamp(long j10, long j11, long j12) {
        if (j12 >= j11 && j12 % j11 == 0) {
            return j10 / (j12 / j11);
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return (j11 / j12) * j10;
        }
        return (long) (j10 * (j11 / j12));
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j10, long j11) {
        int size = list.size();
        long[] jArr = new long[size];
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() / j12;
                i10++;
            }
        } else if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = (long) (list.get(i10).longValue() * d10);
                i10++;
            }
        } else {
            long j13 = j10 / j11;
            while (i10 < size) {
                jArr[i10] = list.get(i10).longValue() * j13;
                i10++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j10, long j11) {
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] / j12;
                i10++;
            }
            return;
        }
        if (j11 >= j10 || j10 % j11 != 0) {
            double d10 = j10 / j11;
            while (i10 < jArr.length) {
                jArr[i10] = (long) (jArr[i10] * d10);
                i10++;
            }
            return;
        }
        long j13 = j10 / j11;
        while (i10 < jArr.length) {
            jArr[i10] = jArr[i10] * j13;
            i10++;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(r2 r2Var) {
        return r2Var == null || !r2Var.getPlayWhenReady() || r2Var.getPlaybackState() == 1 || r2Var.getPlaybackState() == 4;
    }

    public static void sneakyThrow(Throwable th2) throws Throwable {
        throw th2;
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] splitCodecs(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
        return f28506a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long subtractWithOverflowDefault(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static long sum(long... jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        return j10;
    }

    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static float toFloat(byte[] bArr) {
        a.checkArgument(bArr.length == 4);
        return Float.intBitsToFloat((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | (bArr[0] << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static int toInteger(byte[] bArr) {
        a.checkArgument(bArr.length == 4);
        return bArr[3] | (bArr[0] << 24) | (bArr[1] << 16) | (bArr[2] << 8);
    }

    public static long toLong(int i10, int i11) {
        return toUnsignedLong(i11) | (toUnsignedLong(i10) << 32);
    }

    public static long toUnsignedLong(int i10) {
        return i10 & 4294967295L;
    }

    public static <T, U> sh.n1 transformFutureAsync(sh.n1 n1Var, sh.e0 e0Var) {
        a2 a2VarCreate = a2.create();
        a2VarCreate.addListener(new k1(a2VarCreate, n1Var), w1.directExecutor());
        n1Var.addListener(new k1(n1Var, a2VarCreate), w1.directExecutor());
        return a2VarCreate;
    }

    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '%') {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int i12 = length - (i10 * 2);
        StringBuilder sb2 = new StringBuilder(i12);
        Matcher matcher = f28514i.matcher(str);
        while (i10 > 0 && matcher.find()) {
            char c10 = (char) Integer.parseInt((String) a.checkNotNull(matcher.group(1)), 16);
            sb2.append((CharSequence) str, iEnd, matcher.start());
            sb2.append(c10);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        if (sb2.length() != i12) {
            return null;
        }
        return sb2.toString();
    }

    public static long usToMs(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static void writeBoolean(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f28506a = i10;
        String str = Build.DEVICE;
        f28507b = str;
        String str2 = Build.MANUFACTURER;
        f28508c = str2;
        String str3 = Build.MODEL;
        f28509d = str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f28510e = o2.l(i10, ", ", sb2);
        f28511f = new byte[0];
        f28512g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f28513h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f28514i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f28515j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f28517l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", QGjYBESwAiCc.rtNYN, "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", LJjmO.OmRVImk, "hsn", "zh-hsn"};
        f28518m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f28519n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f28520o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 126, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 114, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static long ceilDivide(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static long constrainValue(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static Handler createHandlerForCurrentLooper(Handler.Callback callback) {
        return createHandler((Looper) a.checkStateNotNull(Looper.myLooper()), callback);
    }

    public static Handler createHandlerForCurrentOrMainLooper(Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static String fromUtf8Bytes(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, mh.h0.f74628c);
    }

    public static float constrainValue(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int linearSearch(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    public static int binarySearchCeil(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    public static int binarySearchFloor(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int inferContentType(Uri uri) {
        int iInferContentTypeForExtension;
        String scheme = uri.getScheme();
        if (scheme != null && mh.c.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iInferContentTypeForExtension = inferContentTypeForExtension(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iInferContentTypeForExtension;
        }
        Matcher matcher = f28515j.matcher((CharSequence) a.checkNotNull(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, u1... u1VarArr) {
        if (f28506a < 23) {
            return false;
        }
        for (u1 u1Var : u1VarArr) {
            com.google.android.exoplayer2.o1 o1Var = u1Var.f28113c;
            if (o1Var != null) {
                if (c(activity, o1Var.f27860b)) {
                    return true;
                }
                b5 b5Var = u1Var.f28113c.f27866i;
                for (int i10 = 0; i10 < b5Var.size(); i10++) {
                    if (c(activity, ((t1) b5Var.get(i10)).f28047b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static byte[] toByteArray(int i10) {
        return new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10};
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i11 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i10 = iBinarySearch + 1;
                if (i10 >= size || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.min(list.size() - 1, i11) : i11;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            i11 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i10 = iBinarySearch - 1;
                if (i10 < 0 || list.get(i10).compareTo(t10) != 0) {
                    break;
                }
                iBinarySearch = i10;
            }
            i11 = z10 ? iBinarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i10 = 0;
        for (int i11 : iArr) {
            byte[] byteArray = toByteArray(i11);
            bArr[i10] = byteArray[0];
            bArr[i10 + 1] = byteArray[1];
            int i12 = i10 + 3;
            bArr[i10 + 2] = byteArray[2];
            i10 += 4;
            bArr[i12] = byteArray[3];
        }
        return bArr;
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) throws ClassNotFoundException, NumberFormatException {
        String strA;
        int displayId = display.getDisplayId();
        int i10 = f28506a;
        if (displayId == 0 && isTv(context)) {
            if (i10 < 28) {
                strA = a("sys.display-size");
            } else {
                strA = a("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strA)) {
                try {
                    String[] strArrSplit = split(strA.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i12 > 0) {
                            return new Point(i11, i12);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                f0.e("Util", "Invalid display size: " + strA);
            }
            if ("Sony".equals(f28508c) && f28509d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i10 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        return point;
    }

    public static int binarySearchFloor(g0 g0Var, long j10, boolean z10, boolean z11) {
        int i10;
        int size = g0Var.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            if (g0Var.get(i12) < j10) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        if (z10 && (i10 = size + 1) < g0Var.size() && g0Var.get(i10) == j10) {
            return i10;
        }
        if (z11 && size == -1) {
            return 0;
        }
        return size;
    }

    @Deprecated
    public static int inferContentType(String str) {
        return inferContentType(Uri.parse("file:///" + str));
    }

    public static byte[] toByteArray(float f10) {
        return toByteArray(Float.floatToIntBits(f10));
    }
}
