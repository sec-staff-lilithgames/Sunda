package io.bidmachine.media3.common.util;

import android.app.Activity;
import android.app.Notification;
import android.app.Service;
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
import android.media.AudioFormat;
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
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.exoplayer2.util.j1;
import com.google.android.exoplayer2.util.l1;
import com.google.android.gms.ads.AdError;
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
import gn.d1;
import gn.e1;
import gn.i1;
import h2.rl.UeklptUrP;
import i2.hQ.aTNDubNmpwAqdU;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import kotlinx.coroutines.DebugKt;
import nh.b5;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p0.o2;
import sh.a2;
import sh.n1;
import sh.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60679a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f60680b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f60681c;

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f60682d;

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f60683e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f60684f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f60685g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f60686h;

    /* renamed from: i, reason: collision with root package name */
    public static HashMap f60687i;

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f60688j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f60689k;

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f60690l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f60691m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f60692n;

    public static String a(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            b0.e("Util", "Failed to read system property ".concat(str), e10);
            return null;
        }
    }

    public static long addWithOverflowDefault(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    @Deprecated
    public static boolean areEqual(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
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

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.app.Activity r6, android.net.Uri r7) throws java.io.IOException {
        /*
            r0 = 23
            r1 = 1
            r2 = 0
            int r3 = io.bidmachine.media3.common.util.a1.f60679a
            if (r3 >= r0) goto Lb
        L8:
            r7 = r2
            goto L82
        Lb:
            boolean r0 = isLocalFileUri(r7)
            if (r0 == 0) goto L47
            java.lang.String r7 = r7.getPath()     // Catch: java.io.IOException -> L17
            if (r7 != 0) goto L19
        L17:
            r7 = r2
            goto L45
        L19:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L17
            r0.<init>(r7)     // Catch: java.io.IOException -> L17
            java.lang.String r7 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L17
            java.io.File r0 = r6.getFilesDir()     // Catch: java.io.IOException -> L17
            java.lang.String r0 = r0.getCanonicalPath()     // Catch: java.io.IOException -> L17
            r4 = 0
            java.io.File r5 = r6.getExternalFilesDir(r4)     // Catch: java.io.IOException -> L17
            if (r5 != 0) goto L32
            goto L36
        L32:
            java.lang.String r4 = r5.getCanonicalPath()     // Catch: java.io.IOException -> L17
        L36:
            boolean r0 = r7.startsWith(r0)     // Catch: java.io.IOException -> L17
            if (r0 != 0) goto L44
            if (r4 == 0) goto L17
            boolean r7 = r7.startsWith(r4)     // Catch: java.io.IOException -> L17
            if (r7 == 0) goto L17
        L44:
            r7 = r1
        L45:
            r7 = r7 ^ r1
            goto L82
        L47:
            java.lang.String r0 = "content"
            java.lang.String r4 = r7.getScheme()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L8
            java.lang.String r0 = "media"
            java.lang.String r4 = r7.getAuthority()
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L60
            goto L8
        L60:
            java.util.List r7 = r7.getPathSegments()
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L6b
            goto L8
        L6b:
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "external"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L81
            java.lang.String r0 = "external_primary"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L8
        L81:
            r7 = r1
        L82:
            if (r7 != 0) goto L85
            return r2
        L85:
            r7 = 33
            if (r3 >= r7) goto L9b
            java.lang.String r7 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = r6.checkSelfPermission(r7)
            if (r0 == 0) goto L99
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r6.requestPermissions(r7, r2)
            goto L9a
        L99:
            r1 = r2
        L9a:
            return r1
        L9b:
            java.lang.String r7 = "android.permission.READ_MEDIA_AUDIO"
            int r0 = r6.checkSelfPermission(r7)
            java.lang.String r3 = "android.permission.READ_MEDIA_IMAGES"
            java.lang.String r4 = "android.permission.READ_MEDIA_VIDEO"
            if (r0 != 0) goto Lb6
            int r0 = r6.checkSelfPermission(r4)
            if (r0 != 0) goto Lb6
            int r0 = r6.checkSelfPermission(r3)
            if (r0 == 0) goto Lb4
            goto Lb6
        Lb4:
            r1 = r2
            goto Lbd
        Lb6:
            java.lang.String[] r7 = new java.lang.String[]{r7, r3, r4}
            r6.requestPermissions(r7, r2)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.a1.c(android.app.Activity, android.net.Uri):boolean");
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

    public static boolean checkCleartextTrafficPermitted(gn.p0... p0VarArr) {
        if (f60679a < 24) {
            return true;
        }
        for (gn.p0 p0Var : p0VarArr) {
            gn.j0 j0Var = p0Var.f58053b;
            gn.j0 j0Var2 = p0Var.f58053b;
            if (j0Var != null) {
                if (b(j0Var.f57963a)) {
                    return false;
                }
                for (int i10 = 0; i10 < j0Var2.f57969g.size(); i10++) {
                    if (b(((gn.o0) j0Var2.f57969g.get(i10)).f58038a)) {
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
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean contentEquals(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f60679a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static <T> int contentHashCode(SparseArray<T> sparseArray) {
        if (f60679a >= 31) {
            return sparseArray.contentHashCode();
        }
        int iHashCode = 17;
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
        }
        return iHashCode;
    }

    public static int crc16(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int i13 = rh.e0.toInt(bArr[i10]);
            int i14 = ((i13 >> 4) ^ ((i12 >> 12) & 255)) & 255;
            int i15 = (i12 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            int[] iArr = f60691m;
            int i16 = (i15 ^ iArr[i14]) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            i12 = (((i16 << 4) & Settings.DEFAULT_INITIAL_WINDOW_SIZE) ^ iArr[((i13 & 15) ^ ((i16 >> 12) & 255)) & 255]) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            i10++;
        }
        return i12;
    }

    public static int crc32(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f60690l[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int crc8(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f60692n[i12 ^ (bArr[i10] & 255)];
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

    public static ByteBuffer createReadOnlyByteBuffer(ByteBuffer byteBuffer) {
        return byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
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

    public static long d(long j10, long j11, long j12, RoundingMode roundingMode) {
        long jSaturatedMultiply = qh.h.saturatedMultiply(j10, j11);
        if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
            return qh.h.divide(jSaturatedMultiply, j12, roundingMode);
        }
        long jGcd = qh.h.gcd(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jDivide = qh.h.divide(j11, jGcd, roundingMode2);
        long jDivide2 = qh.h.divide(j12, jGcd, roundingMode2);
        long jGcd2 = qh.h.gcd(Math.abs(j10), Math.abs(jDivide2));
        long jDivide3 = qh.h.divide(j10, jGcd2, roundingMode2);
        long jDivide4 = qh.h.divide(jDivide2, jGcd2, roundingMode2);
        long jSaturatedMultiply2 = qh.h.saturatedMultiply(jDivide3, jDivide);
        if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
            return qh.h.divide(jSaturatedMultiply2, jDivide4, roundingMode);
        }
        double d10 = jDivide3 * (jDivide / jDivide4);
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return qh.d.roundToLong(d10, roundingMode);
    }

    public static long durationUsToSampleCount(long j10, int i10) {
        return scaleLargeValue(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static boolean e(char c10) {
        return c10 == '\"' || c10 == '%' || c10 == '*' || c10 == '/' || c10 == ':' || c10 == '<' || c10 == '\\' || c10 == '|' || c10 == '>' || c10 == '?';
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (e(str.charAt(i12))) {
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
            if (e(cCharAt)) {
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
        Matcher matcher = f60686h.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int generateAudioSessionIdV21(Context context) {
        return hn.d.getAudioManager(context).generateAudioSessionId();
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

    public static int getApiLevelThatAudioFormatIntroducedAudioEncoding(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    @Deprecated
    public static int getAudioContentTypeForStreamType(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) {
                return 4;
            }
            if (i10 != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static AudioFormat getAudioFormat(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static int getAudioTrackChannelConfig(int i10) {
        int i11 = f60679a;
        if (i10 == 10) {
            return i11 >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return i11 >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
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
                if (i10 != 8) {
                    return i10 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i11;
    }

    public static String getAuxiliaryTrackTypeString(int i10) {
        if (i10 == 0) {
            return AdError.UNDEFINED_DOMAIN;
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static e1 getAvailableCommands(i1 i1Var, e1 e1Var) {
        boolean zIsPlayingAd = i1Var.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = i1Var.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = i1Var.hasPreviousMediaItem();
        boolean zHasNextMediaItem = i1Var.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = i1Var.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = i1Var.isCurrentMediaItemDynamic();
        boolean zIsEmpty = i1Var.getCurrentTimeline().isEmpty();
        boolean z10 = false;
        d1 d1VarAddIf = new d1().addAll(e1Var).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z10 = true;
        }
        return d1VarAddIf.addIf(12, z10).build();
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static int getByteDepth(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
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
            if (i10 == gn.x0.getTrackTypeOfCodec(str2)) {
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
            if (i10 == gn.x0.getTrackTypeOfCodec(str2)) {
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

    public static String getCodecsWithoutType(String str, int i10) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i10 != gn.x0.getTrackTypeOfCodec(str2)) {
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
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
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
        return f60679a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static Drawable getDrawable(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    public static UUID getDrmUuid(String str) {
        String lowerCase = mh.c.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "playready":
                return gn.l.f57988e;
            case "widevine":
                return gn.l.f57987d;
            case "clearkey":
                return gn.l.f57986c;
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
            return com.facebook.ads.AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i10) {
            case 15:
                return com.facebook.ads.AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
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
                        return com.facebook.ads.AdError.ICONVIEW_MISSING_ERROR_CODE;
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
        return locale.toLanguageTag();
    }

    public static int getMaxPendingFramesCountForMediaCodecDecoders(Context context) {
        return isFrameDropAllowedOnSurfaceInput(context) ? 1 : 5;
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
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static io.bidmachine.media3.common.b getPcmFormat(int i10, int i11, int i12) {
        return new gn.w().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i11).setSampleRate(i12).setPcmEncoding(i10).build();
    }

    public static int getPcmFrameSize(int i10, int i11) {
        return getByteDepth(i10) * i11;
    }

    public static long getPlayoutDurationForMediaDuration(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static List<String> getRoleFlagStrings(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add(C3191e4.h.Z);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & Segment.SIZE) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static List<String> getSelectionFlagStrings(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        }
        if ((i10 & 1) != 0) {
            arrayList.add(BuildConfig.FLAVOR);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    @Deprecated
    public static int getStreamTypeForAudioUsage(int i10) {
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
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
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
        String[] strArrSplit = f60679a >= 24 ? split(configuration.getLocales().toLanguageTags(), ",") : new String[]{getLocaleLanguageTag(configuration.locale)};
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
        return j1.o2.o(sb2, Build.VERSION.RELEASE, ") AndroidXMedia3/1.7.1");
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
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

    public static boolean handlePauseButtonAction(i1 i1Var) {
        if (i1Var == null || !i1Var.isCommandAvailable(1)) {
            return false;
        }
        i1Var.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean handlePlayButtonAction(gn.i1 r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.common.util.a1.handlePlayButtonAction(gn.i1):boolean");
    }

    public static boolean handlePlayPauseButtonAction(i1 i1Var) {
        return handlePlayPauseButtonAction(i1Var, true);
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

    public static boolean inflate(m0 m0Var, m0 m0Var2, Inflater inflater) {
        if (m0Var.bytesLeft() <= 0) {
            return false;
        }
        if (m0Var2.capacity() < m0Var.bytesLeft()) {
            m0Var2.ensureCapacity(m0Var.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(m0Var.getData(), m0Var.getPosition(), m0Var.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(m0Var2.getData(), iInflate, m0Var2.capacity() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == m0Var2.capacity()) {
                        m0Var2.ensureCapacity(m0Var2.capacity() * 2);
                    }
                } else {
                    m0Var2.setLimit(iInflate);
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
        return f60679a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isBitmapFactorySupportedMimeType(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c10 = 4;
                    break;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c10 = 5;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        int i10 = f60679a;
        switch (c10) {
            case 0:
                return i10 >= 34;
            case 1:
            case 2:
                return i10 >= 26;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static boolean isEncodingHighResolutionPcm(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean isEncodingLinearPcm(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static boolean isFrameDropAllowedOnSurfaceInput(Context context) {
        int i10 = f60679a;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (mh.c.equalsIgnoreCase(str, "moto g(20)") || mh.c.equalsIgnoreCase(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && mh.c.equalsIgnoreCase(Build.MODEL, "sm-x200");
    }

    public static boolean isLinebreak(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || C3191e4.h.f36473b.equals(scheme);
    }

    public static boolean isRunningOnEmulator() {
        String lowerCase = mh.c.toLowerCase(Build.DEVICE);
        return lowerCase.contains("emulator") || lowerCase.contains("emu64a") || lowerCase.contains("emu64x") || lowerCase.contains("generic");
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean isWear(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int linearSearch(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static String loadAsset(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return fromUtf8Bytes(ph.e0.toByteArray(inputStreamOpen));
        } finally {
            closeQuietly(inputStreamOpen);
        }
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

    public static boolean maybeInflate(m0 m0Var, m0 m0Var2, Inflater inflater) {
        return m0Var.bytesLeft() > 0 && m0Var.peekUnsignedByte() == 120 && inflate(m0Var, m0Var2, inflater);
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (c(activity, uri)) {
                return true;
            }
        }
        return false;
    }

    public static boolean maybeRequestReadStoragePermission(Activity activity, gn.p0... p0VarArr) {
        if (f60679a < 23) {
            return false;
        }
        for (gn.p0 p0Var : p0VarArr) {
            gn.j0 j0Var = p0Var.f58053b;
            if (j0Var != null) {
                if (c(activity, j0Var.f57963a)) {
                    return true;
                }
                b5 b5Var = p0Var.f58053b.f57969g;
                for (int i10 = 0; i10 < b5Var.size(); i10++) {
                    if (c(activity, ((gn.o0) b5Var.get(i10)).f58038a)) {
                        return true;
                    }
                }
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
        return Executors.newSingleThreadExecutor(new j1(str, 4));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new j1(str, 3));
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
        if (f60687i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f60688j;
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
            f60687i = map;
        }
        String str4 = (String) f60687i.get(str2);
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
            String[] strArr2 = f60689k;
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

    public static long parseXsDateTime(String str) throws gn.z0 {
        Matcher matcher = f60683e.matcher(str);
        if (!matcher.matches()) {
            throw gn.z0.createForMalformedContainer("Invalid date/time format: " + str, null);
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
        Matcher matcher = f60684f.matcher(str);
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
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static <T> n1 postOrRunWithCompletion(Handler handler, Runnable runnable, T t10) {
        a2 a2VarCreate = a2.create();
        postOrRun(handler, new l1(a2VarCreate, runnable, t10, 1));
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
        return f60679a < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
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
        return scaleLargeValue(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long scaleLargeTimestamp(long j10, long j11, long j12) {
        return scaleLargeValue(j10, j11, j12, RoundingMode.DOWN);
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j10, long j11) {
        return scaleLargeValues(list, j10, j11, RoundingMode.DOWN);
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j10, long j11) {
        scaleLargeValuesInPlace(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static long scaleLargeValue(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? d(j10, j11, j12, roundingMode) : qh.h.saturatedMultiply(j11, qh.h.divide(j10, j12, RoundingMode.UNNECESSARY)) : qh.h.divide(j11, qh.h.divide(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : qh.h.saturatedMultiply(j10, qh.h.divide(j11, j12, RoundingMode.UNNECESSARY)) : qh.h.divide(j10, qh.h.divide(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long[] scaleLargeValues(List<Long> list, long j10, long j11, RoundingMode roundingMode) {
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j12 != 0) {
            int i10 = 0;
            if (j13 >= j12 && j13 % j12 == 0) {
                long jDivide = qh.h.divide(j13, j12, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = qh.h.divide(list.get(i10).longValue(), jDivide, roundingMode2);
                    i10++;
                }
            } else if (j13 >= j12 || j12 % j13 != 0) {
                int i11 = 0;
                while (i11 < size) {
                    long jLongValue = list.get(i11).longValue();
                    if (jLongValue != 0) {
                        if (j13 >= jLongValue && j13 % jLongValue == 0) {
                            jArr[i11] = qh.h.divide(j12, qh.h.divide(j13, jLongValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j13 >= jLongValue || jLongValue % j13 != 0) {
                            jArr[i11] = d(jLongValue, j12, j13, roundingMode2);
                        } else {
                            jArr[i11] = qh.h.saturatedMultiply(j12, qh.h.divide(jLongValue, j13, RoundingMode.UNNECESSARY));
                        }
                    }
                    i11++;
                    j12 = j10;
                    j13 = j11;
                    roundingMode2 = roundingMode;
                }
            } else {
                long jDivide2 = qh.h.divide(j12, j13, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = qh.h.saturatedMultiply(list.get(i10).longValue(), jDivide2);
                    i10++;
                }
            }
        }
        return jArr;
    }

    public static void scaleLargeValuesInPlace(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long jDivide = qh.h.divide(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = qh.h.divide(jArr[i10], jDivide, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long jDivide2 = qh.h.divide(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = qh.h.saturatedMultiply(jArr[i10], jDivide2);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = qh.h.divide(j10, qh.h.divide(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = d(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = qh.h.saturatedMultiply(j10, qh.h.divide(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static void setForegroundServiceNotification(Service service, int i10, Notification notification, int i11, String str) {
        if (f60679a >= 29) {
            z0.startForeground(service, i10, notification, i11, str);
        } else {
            service.startForeground(i10, notification);
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public static boolean shouldEnablePlayPauseButton(i1 i1Var) {
        if (i1Var == null || !i1Var.isCommandAvailable(1)) {
            return false;
        }
        return (i1Var.isCommandAvailable(17) && i1Var.getCurrentTimeline().isEmpty()) ? false : true;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(i1 i1Var) {
        return shouldShowPlayButton(i1Var, true);
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
        return f60679a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
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

    @Deprecated
    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        return ph.e0.toByteArray(inputStream);
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static long toLong(int i10, int i11) {
        return toUnsignedLong(i11) | (toUnsignedLong(i10) << 32);
    }

    public static long toUnsignedLong(int i10) {
        return i10 & 4294967295L;
    }

    public static <T, U> n1 transformFutureAsync(n1 n1Var, sh.e0 e0Var) {
        a2 a2VarCreate = a2.create();
        a2VarCreate.addListener(new y0(a2VarCreate, n1Var), w1.directExecutor());
        n1Var.addListener(new y0(n1Var, a2VarCreate), w1.directExecutor());
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
        Matcher matcher = f60685g.matcher(str);
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
        f60679a = i10;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str2);
        f60680b = o2.l(i10, ", ", sb2);
        f60681c = new byte[0];
        f60682d = new long[0];
        f60683e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f60684f = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f60685g = Pattern.compile("%([A-Fa-f0-9]{2})");
        f60686h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f60688j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", UeklptUrP.deDCZhjOqIWSGAu, "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f60689k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f60690l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f60691m = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f60692n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 126, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 114, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
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
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean handlePlayPauseButtonAction(i1 i1Var, boolean z10) {
        return shouldShowPlayButton(i1Var, z10) ? handlePlayButtonAction(i1Var) : handlePauseButtonAction(i1Var);
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
        if (str == null) {
            return inferContentType(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals(MimeTypes.APPLICATION_M3U8)) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals(MimeTypes.APPLICATION_SS)) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals(MimeTypes.APPLICATION_MPD)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals(aTNDubNmpwAqdU.NkWuav)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean shouldShowPlayButton(i1 i1Var, boolean z10) {
        return i1Var == null || !i1Var.getPlayWhenReady() || i1Var.getPlaybackState() == 1 || i1Var.getPlaybackState() == 4 || (z10 && i1Var.getPlaybackSuppressionReason() != 0);
    }

    public static byte[] toByteArray(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i10 = 0;
        for (int i11 : iArr) {
            bArr[i10] = (byte) (i11 >> 24);
            bArr[i10 + 1] = (byte) (i11 >> 16);
            int i12 = i10 + 3;
            bArr[i10 + 2] = (byte) (i11 >> 8);
            i10 += 4;
            bArr[i12] = (byte) i11;
        }
        return bArr;
    }

    public static float constrainValue(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static <T> boolean contains(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static int linearSearch(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10] == j10) {
                return i10;
            }
        }
        return -1;
    }

    @Deprecated
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, gn.p0... p0VarArr) {
        return maybeRequestReadStoragePermission(activity, p0VarArr);
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
        if (scheme != null && (mh.c.equalsIgnoreCase("rtsp", scheme) || mh.c.equalsIgnoreCase("rtspt", scheme))) {
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
        Matcher matcher = f60686h.matcher((CharSequence) a.checkNotNull(uri.getPath()));
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

    public static io.bidmachine.media3.common.b getPcmFormat(hn.f fVar) {
        return getPcmFormat(fVar.f59040c, fVar.f59039b, fVar.f59038a);
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) throws ClassNotFoundException, NumberFormatException {
        String strA;
        int displayId = display.getDisplayId();
        int i10 = f60679a;
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
                b0.e("Util", "Invalid display size: " + strA);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static byte[] toByteArray(float f10) {
        return rh.w.toByteArray(Float.floatToIntBits(f10));
    }

    public static int binarySearchFloor(c0 c0Var, long j10, boolean z10, boolean z11) {
        int i10;
        int size = c0Var.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            if (c0Var.get(i12) < j10) {
                i11 = i12 + 1;
            } else {
                size = i12 - 1;
            }
        }
        if (z10 && (i10 = size + 1) < c0Var.size() && c0Var.get(i10) == j10) {
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
}
