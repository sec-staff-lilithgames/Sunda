package com.facebook.ads.redexgen.core;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3227g4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.4a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC09264a {
    public static byte[] A00;
    public static String[] A01 = {"0jhNC1Lyu0lVYVQP", "8o531PEVmArnbRMxdetuA21oKPXOiLv", "tOAQF6Pzc2RVYks8fQT2p1g882rTPCd1", "wz1og", "CbSxkJOpnDO18KCthbWuHDege0bytfRM", "NVorx5pvNTEUlNt2QwU2VxD5ww57Xut2", "eRRRkvRnvdqMQMmsSxWecKvTVYNexEDg", "GD5J9oYLAsqrZf6ewUEjnT79ojUC6XcO"};
    public static final int A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final byte[] A07;
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final String[] A0E;
    public static final String[] A0F;

    public static String A0i(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0v() {
        A00 = new byte[]{-100, -92, -56, -27, -22, -15, -12, -73, -67, -22, -32, -18, -21, -27, -32, -100, -58, -55, -4, -30, -50, -25, 2, -50, 7, -47, -50, -38, -2, 28, -45, 30, -54, 30, 53, 48, 36, 32, 82, 36, 31, 53, 95, 105, 99, 98, 53, 30, 53, 48, 37, 30, 99, 87, 100, 95, 92, 91, 105, 106, 30, 36, 32, 31, 31, 53, 31, 53, 31, 83, 91, 83, 91, 83, 91, 83, 91, 32, 83, 36, 31, 83, 91, 83, 91, 32, 83, 36, 31, 83, 91, 83, 91, 32, 82, 75, 107, 84, 31, 83, 91, 83, 91, 32, 49, 31, 83, 91, 83, 91, 32, 49, 31, 83, 91, 83, 91, 32, 31, 82, 83, 37, 35, 84, 31, 83, 91, 34, 32, 32, 54, 31, 82, 81, 113, 84, 115, 31, 31, 83, 34, 115, 83, 36, 32, 31, 83, 91, 54, 83, 91, 32, 49, 54, 31, 83, 91, 83, 91, 32, 32, 32, 54, -83, -92, -46, 23, 11, -47, -19, -34, -18, -35, -14, -27, -35, -3, 48, 39, 8, 36, 25, 49, 29, 42, 4, 33, 26, -25, -22, -26, -16, -26, -23, 27, 54, 62, 65, 58, 57, -11, 73, 68, -11, 71, 58, 54, 57, -11, 72, 78, 72, 73, 58, 66, -11, 69, 71, 68, 69, 58, 71, 73, 78, -11, 45, 82, 90, 69, 80, 77, 72, 4, 72, 77, 87, 84, 80, 69, 93, 4, 87, 77, 94, 73, 30, 4, 10, 11, 61, 62, 78, 52, 71, 50, 52, 52, 51, 66, 78, 50, 48, Utf8.REPLACEMENT_BYTE, 48, 49, 56, 59, 56, 67, 56, 52, 66, 20, 21, 37, 27, 20, 25, 27, 22, 22, 21, 24, 26, 11, 10, 37, 10, 24, 19, 61, 62, 78, 68, 61, 66, 68, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 62, 65, 67, 52, 51, 78, 67, 72, Utf8.REPLACEMENT_BYTE, 52, -47, -19, -20, -9, 62, 93, 82, 85, -6, -26, -12, 58, 4, 9, 5, 27, 44, 4, 4, 55, 12, 9, 21, 57, 6, 5, 53, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 41, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 32, 5, 27, 4, 48, 4, 4, 55, 12, 9, 21, 57, 6, 5, 36, 5, 27, 4, 4, 55, 12, 9, 21, 57, 6, 5, 41, 5, 27, 4, 4, 55, 12, 9, 21, 10, 57, 6, 5, 47, 5, 27, 5, 27, 0, 90, 100, 38, 109, 112, 98, 75, 86, 76, -4, 9, -1, 13, 10, 4, -1, -55, 3, -4, 13, -1, 18, -4, 13, 0, -55, 15, 20, 11, 0, -55, -4, 16, 15, 10, 8, 10, 15, 4, 17, 0, 5, 18, 8, 22, 19, 13, 8, -46, 19, 23, -46, -9, 29, 23, 24, 9, 17, -12, 22, 19, 20, 9, 22, 24, 13, 9, 23, 64, 79, 79, 75, 72, 66, 64, 83, 72, 78, 77, 14, 67, 64, 82, 71, 10, 87, 76, 75, 34, 49, 49, 45, 42, 36, 34, 53, 42, 48, 47, -16, 55, 47, 37, -17, 46, 52, -18, 52, 52, 53, 51, -20, 57, 46, 45, -23, -8, -8, -12, -15, -21, -23, -4, -15, -9, -10, -73, 0, -75, -11, -8, -19, -17, -35, -38, -44, 66, 81, 81, 77, 74, 68, 66, 85, 74, 80, 79, 16, 89, 14, 83, 85, 84, 81, 57, 74, 5, 57, 74, 58, 24, 41, 25, 11, 28, 23, 49, 48, 64, 54, 67, 81, 94, 98, 15, 32, -21, -2, -5, -9, -4, -3, 32, 42, 43, 39, 51, 49, -14, 55, 51, 50, 61, -14, 40, 56, 58, -14, 44, 37, 54, 40, 59, 37, 54, 41, -14, 52, 37, 50, 41, 48, -14, 53, 42, 44, 40, 51, 67, -21, 1, 22, 45, 24, 75, 76, 69, 74, 84, 81, 77, 66, 90, 72, 89, 88, 25, 32, -14, 2, -17, -22, 10, 13, 16, 9, 76, 85, 88, 83, 71, 90, 35, 83, 25, 91, 30, 19, 71, 71, 86, 82, 10, 19, 22, 17, 5, 24, -31, 17, 20, 8, -47, 24, 13, 17, 9, -47, 7, 23, 10, -30, -18, 7, 19, 6, 31, 29, 39, 26, 24, 37, 12, 10, 25, 62, 73, 60, 58, 51, 61, 76, 70, 87, 17, 70, 83, 87, -1, -7, 10, -60, -1, 9, 13, -1, -7, 10, -60, 10, 9, 7, Utf8.REPLACEMENT_BYTE, 60, 18, 15, 12, 93, 103, Utf8.REPLACEMENT_BYTE, 73, 77, 85, 96, 91, 29, 46, 76, 16, 75, 68, 78, 25, -35, 28, 37, 40, -5, -65, 0, -13, 8, -13, -4, 1, -1, -7, -5, -5, -10, 85, 90, 27, 32, 22, 65, 75, 32, 42, 36, 74, 84, 78, 77, 77, 91, 76, 75, 59, 49, 33, 23, 70, 12, 78, 17, 72, 60, 62, 11, -1, 13, 0, -12, 12, 17, 13, 36, 34, -9, -6, -18, 54, 60, 19, 25, -45, 15, 20, 10, 76, 88, 58, 45, 58, -22, -34, 87, 85, 85, 85, 65, 65, 66, -10, -9, -75, -22, -9, -13, -21, -20, -86, -21, -21, -20, Utf8.REPLACEMENT_BYTE, 64, -2, Utf8.REPLACEMENT_BYTE, 64, 51, 102, 103, 37, 102, 113, 102, 34, 35, 22, -22, -14, 91, 80, 93, 13, 10, 44, 46, 45, 42, 80, 83, 75, 14, -2, -2, 9, 1, 8, 1, 4, 102, 100, 7, 5, 0, -3, 8, -7, -13, 1, -11, 7, 8, -7, 6, 57, 56, 9, 8, 6, 62, 68, 62, -7, 47, 52, 62, 59, 55, 44, 68, -8, 62, 52, 69, 48, 54, 36, 46, 33, 48, 35, 47, 39, -30, -1, -30, 1, 9, -2, -9, 45, 48, 22, 25, 11, -13, -25, -21, -19, -30, -29, 13, -4, 5, -5, 6, 9, -59, -5, 0, 10, 7, 3, -8, 16, -60, 10, 0, 17, -4, 18, 0, 7, 85, 71, 76, 66, 77, 85, 98, 107, 91, -2, -20, 31, 13, -46, 8, 18, 19, 80, 62, 3, 61, 75, 69, 79, 75, 19, 1, -58, 1, -6, 4, 37, 19, -40, 19, 12, 22, 22, 12, 
        41, 23, -36, 23, 34, 29, -9, -27, -86, -22, -26, -21, -86, -21, -34, -21, 96, 78, 19, 84, 71, 84, 62, 44, -15, 60, 45, 37, 50, 43};
    }

    static {
        A0v();
        A02 = Build.VERSION.SDK_INT;
        A03 = Build.DEVICE;
        A05 = Build.MANUFACTURER;
        A06 = Build.MODEL;
        StringBuilder sbAppend = new StringBuilder().append(A03);
        String strA0i = A0i(166, 2, 111);
        A04 = sbAppend.append(strA0i).append(A06).append(strA0i).append(A05).append(strA0i).append(A02).toString();
        A07 = new byte[0];
        A0A = Pattern.compile(A0i(68, 95, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE));
        A0B = Pattern.compile(A0i(320, 84, 96));
        A08 = Pattern.compile(A0i(16, 17, 37));
        A09 = Pattern.compile(A0i(33, 35, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), 2);
        A0E = new String[]{A0i(410, 3, 110), A0i(877, 2, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), A0i(567, 3, 46), A0i(739, 2, 57), A0i(570, 3, 83), A0i(642, 2, 17), A0i(580, 3, 13), A0i(814, 2, 99), A0i(925, 3, 25), A0i(573, 2, 88), A0i(583, 3, 24), A0i(970, 2, 8), A0i(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 3, 55), A0i(621, 2, 84), A0i(637, 3, 104), A0i(821, 2, 109), A0i(693, 3, 55), A0i(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, 2, 107), A0i(699, 3, 91), A0i(640, 2, 56), A0i(687, 3, 37), A0i(685, 2, 0), A0i(690, 3, 60), A0i(782, 2, 84), A0i(759, 3, 26), A0i(769, 2, 92), A0i(790, 3, 95), A0i(EventTypeExtended.EVENT_TYPE_EXTENDED_BURL_VALUE, 2, 59), A0i(793, 3, 34), A0i(799, 2, 40), A0i(796, 3, 23), A0i(EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE, 2, 77), A0i(857, 3, 111), A0i(644, 2, 13), A0i(866, 3, 98), A0i(860, 2, 31), A0i(869, 3, 31), A0i(719, 7, 27), A0i(874, 3, 25), A0i(872, 2, 26), A0i(958, 3, 31), A0i(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE, 2, 12), A0i(762, 2, 22), A0i(808, 6, 42), A0i(778, 2, 104), A0i(726, 2, 91), A0i(728, 3, 46), A0i(726, 2, 91), A0i(780, 2, 102), A0i(968, 2, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), A0i(564, 3, 59), A0i(558, 6, 92), A0i(764, 2, 112), A0i(808, 6, 42), A0i(766, 3, 54), A0i(808, 6, 42), A0i(819, 2, 0), A0i(840, 6, 85), A0i(852, 3, 56), A0i(840, 6, 85), A0i(823, 2, 107), A0i(834, 6, 1), A0i(825, 3, 87), A0i(834, 6, 1), A0i(928, 2, 61), A0i(404, 6, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A0i(930, 3, 38), A0i(404, 6, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE), A0i(578, 2, 49), A0i(IronSourceError.ERROR_NT_LOAD_EXCEPTION, 7, 104), A0i(575, 3, 115), A0i(IronSourceError.ERROR_NT_LOAD_EXCEPTION, 7, 104), A0i(731, 2, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), A0i(IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 7, 27), A0i(733, 3, 91), A0i(IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION, 7, 27), A0i(892, 2, 74), A0i(719, 7, 27), A0i(894, 3, 26), A0i(719, 7, 27), A0i(586, 3, 65), A0i(972, 6, 41), A0i(702, 3, 86), A0i(986, 6, 29), A0i(816, 3, 80), A0i(C3227g4.f36758l, 6, 106), A0i(736, 3, 113), A0i(1000, 6, 51)};
        A0F = new String[]{A0i(746, 5, 52), A0i(784, 2, 57), A0i(741, 5, 103), A0i(986, 6, 29), A0i(751, 8, 22), A0i(855, 2, 0), A0i(828, 6, 12), A0i(840, 6, 85), A0i(846, 6, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), A0i(834, 6, 1), A0i(978, 8, 90), A0i(972, 6, 41), A0i(992, 8, 47), A0i(986, 6, 29), A0i(1006, 10, 1), A0i(C3227g4.f36758l, 6, 106), A0i(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 8, 72), A0i(1000, 6, 51)};
        A0C = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        A0D = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 126, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 212, 105, 110, 103, 96, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 114, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 208, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static float A00(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int A01(int i10) {
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                String[] strArr = A01;
                if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                    throw new RuntimeException();
                }
                A01[3] = "qx6Bj";
                return 204;
            case 5:
                return Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return (A02 < 23 && A02 < 21) ? 0 : 6396;
            case 9:
            case 10:
            case 11:
            default:
                return 0;
            case 12:
                if (A02 < 32) {
                    return 0;
                }
                return 743676;
        }
    }

    public static int A02(int i10) {
        switch (i10) {
            case 2:
            case 4:
            case 7:
            case 16:
            case 18:
                return 6005;
            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
            case 12:
            case 13:
            case 14:
            case 23:
            default:
                String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "jxwDVk5Xin8Qw09ydBb2VsJiyiTp54vB";
                strArr2[5] = "SYToZK6HQezNburr1bp2e1PUtswsXJGu";
                return 6006;
            case 8:
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 10:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 8:
                return 3;
            case 16:
                return 2;
            case 24:
                return 536870912;
            case 32:
                return 805306368;
            default:
                return 0;
        }
    }

    public static int A04(int i10) {
        switch (i10) {
            case 1:
            case 12:
            case 14:
                return 3;
            case 2:
                return 0;
            case 3:
                String[] strArr = A01;
                if (strArr[7].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[7] = "Xwv9tgmCDWWECZ2rTxC05riy18CzxfIS";
                strArr2[1] = "vJ1JY8dVYpQ7RvuZirsFVuB4oK25CZB";
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
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public static int A05(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int A06(int i10, int i11) {
        switch (i10) {
            case 2:
            case 268435456:
                return i11 * 2;
            case 3:
                return i11;
            case 4:
            case 805306368:
                return i11 * 4;
            case 536870912:
                return i11 * 3;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static int A07(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int A08(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static int A09(Context context, String str, boolean z10) {
        if (A02 < 29 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 29) {
            return 1;
        }
        return 5;
    }

    public static int A0A(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String scheme2 = A0i(862, 4, 62);
            if (AbstractC2244iY.A03(scheme2, scheme)) {
                return 3;
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            int i10 = iLastIndexOf + 1;
            String[] strArr = A01;
            String lastPathSegment2 = strArr[4];
            if (lastPathSegment2.charAt(18) != strArr[6].charAt(18)) {
                throw new RuntimeException();
            }
            A01[3] = "a9wHr";
            String scheme3 = lastPathSegment.substring(i10);
            int iA0E = A0E(scheme3);
            if (iA0E != 4) {
                return iA0E;
            }
        }
        Pattern pattern = A09;
        String scheme4 = uri.getPath();
        Matcher matcher = pattern.matcher((CharSequence) C3M.A01(scheme4));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            String scheme5 = A0i(TTAdConstant.STYLE_SIZE_RADIO_2_3, 19, 40);
            if (strGroup.contains(scheme5)) {
                return 0;
            }
            String scheme6 = A0i(650, 16, 106);
            if (strGroup.contains(scheme6)) {
                return 2;
            }
            return 1;
        }
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0B(android.net.Uri r6, java.lang.String r7) {
        /*
            if (r7 != 0) goto L7
            int r0 = A0A(r6)
            return r0
        L7:
            int r0 = r7.hashCode()
            r6 = 3
            r5 = 1
            r4 = 2
            r3 = 0
            switch(r0) {
                case -979127466: goto L4e;
                case -156749520: goto L3c;
                case 64194685: goto L2a;
                case 1154777587: goto L18;
                default: goto L12;
            }
        L12:
            r0 = -1
        L13:
            switch(r0) {
                case 0: goto L63;
                case 1: goto L62;
                case 2: goto L61;
                case 3: goto L60;
                default: goto L16;
            }
        L16:
            r0 = 4
            return r0
        L18:
            r2 = 540(0x21c, float:7.57E-43)
            r1 = 18
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L12
            r0 = 3
            goto L13
        L2a:
            r2 = 472(0x1d8, float:6.61E-43)
            r1 = 20
            r0 = 99
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L12
            r0 = 0
            goto L13
        L3c:
            r2 = 492(0x1ec, float:6.9E-43)
            r1 = 27
            r0 = 69
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L12
            r0 = 2
            goto L13
        L4e:
            r2 = 519(0x207, float:7.27E-43)
            r1 = 21
            r0 = 12
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L60:
            return r6
        L61:
            return r5
        L62:
            return r4
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC09264a.A0B(android.net.Uri, java.lang.String):int");
    }

    public static int A0C(AnonymousClass45 anonymousClass45, long j10, boolean z10, boolean z11) {
        int i10 = 0;
        int lowIndex = anonymousClass45.A02();
        int i11 = lowIndex - 1;
        while (i10 <= i11) {
            int lowIndex2 = i10 + i11;
            int i12 = lowIndex2 >>> 1;
            if (anonymousClass45.A03(i12) < j10) {
                i10 = i12 + 1;
            } else {
                i11 = i12 - 1;
            }
        }
        if (z10) {
            int highIndex = i11 + 1;
            int lowIndex3 = anonymousClass45.A02();
            if (highIndex < lowIndex3) {
                int lowIndex4 = i11 + 1;
                if (anonymousClass45.A03(lowIndex4) == j10) {
                    return i11 + 1;
                }
            }
        }
        if (!z11 || i11 != -1) {
            return i11;
        }
        return 0;
    }

    public static int A0D(String str) {
        int length = str.length();
        C3M.A07(length <= 4);
        int result = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int length2 = str.charAt(i10);
            result = (result << 8) | length2;
        }
        return result;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0E(java.lang.String r6) {
        /*
            java.lang.String r3 = com.facebook.ads.redexgen.core.AbstractC2244iY.A01(r6)
            int r0 = r3.hashCode()
            r6 = 1
            r5 = 2
            r4 = 0
            switch(r0) {
                case 104579: goto L47;
                case 108321: goto L36;
                case 3242057: goto L25;
                case 3299913: goto L14;
                default: goto Le;
            }
        Le:
            r0 = -1
        Lf:
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L59;
                case 2: goto L58;
                case 3: goto L58;
                default: goto L12;
            }
        L12:
            r0 = 4
            return r0
        L14:
            r2 = 786(0x312, float:1.101E-42)
            r1 = 4
            r0 = 93
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        L25:
            r2 = 774(0x306, float:1.085E-42)
            r1 = 4
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r0 = 3
            goto Lf
        L36:
            r2 = 803(0x323, float:1.125E-42)
            r1 = 3
            r0 = 14
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r0 = 0
            goto Lf
        L47:
            r2 = 771(0x303, float:1.08E-42)
            r1 = 3
            r0 = 59
            java.lang.String r0 = A0i(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Le
            r0 = 2
            goto Lf
        L58:
            return r6
        L59:
            return r5
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AbstractC09264a.A0E(java.lang.String):int");
    }

    public static int A0F(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static <T extends Comparable<? super T>> int A0G(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int index;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        } else {
            int listSize = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= listSize) {
                    break;
                }
                index = list.get(iBinarySearch).compareTo(t10);
            } while (index == 0);
            if (z10) {
                iBinarySearch--;
            }
        }
        if (!z11) {
            return iBinarySearch;
        }
        int index2 = list.size();
        int i10 = index2 - 1;
        String[] strArr = A01;
        String str = strArr[4];
        String str2 = strArr[6];
        int iCharAt = str.charAt(18);
        int index3 = str2.charAt(18);
        if (iCharAt != index3) {
            throw new RuntimeException();
        }
        A01[0] = "AVDkOIGrSYkQO6";
        return Math.min(i10, iBinarySearch);
    }

    public static <T extends Comparable<? super T>> int A0H(List<? extends Comparable<? super T>> list, T t10, boolean z10, boolean z11) {
        int index;
        int iBinarySearch = Collections.binarySearch(list, t10);
        if (iBinarySearch < 0) {
            int index2 = iBinarySearch + 2;
            iBinarySearch = -index2;
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
                Comparable<? super T> comparable = list.get(iBinarySearch);
                if (A01[0].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "7wt3cZrGAy9gNsgF7PLcTg6oSzn5VQ1a";
                strArr[1] = "U87bGfnBcGjZypJnFtFTdrSmy7sh89Q";
                index = comparable.compareTo(t10);
            } while (index == 0);
            if (z10) {
                iBinarySearch++;
            }
        }
        return z11 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static int A0I(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int[] iArr = A0C;
            int i13 = bArr[i10];
            i12 = (i12 << 8) ^ iArr[((i12 >>> 24) ^ (i13 & 255)) & 255];
            i10++;
        }
        return i12;
    }

    public static int A0J(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int[] iArr = A0D;
            int i13 = bArr[i10];
            i12 = iArr[(i13 & 255) ^ i12];
            i10++;
        }
        return i12;
    }

    public static int A0K(long[] jArr, long j10, boolean z10, boolean z11) {
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            iBinarySearch = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                int index = jArr.length;
                if (iBinarySearch >= index) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            if (z10) {
                iBinarySearch--;
            }
        }
        if (!z11) {
            return iBinarySearch;
        }
        int index2 = jArr.length;
        return Math.min(index2 - 1, iBinarySearch);
    }

    public static int A0L(long[] jArr, long j10, boolean z10, boolean z11) {
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            int index = iBinarySearch + 2;
            iBinarySearch = -index;
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            if (z10) {
                iBinarySearch++;
            }
        }
        return z11 ? Math.max(0, iBinarySearch) : iBinarySearch;
    }

    public static long A0M(int i10) {
        return i10 & 4294967295L;
    }

    public static long A0N(int i10, int i11) {
        return (A0M(i10) << 32) | A0M(i11);
    }

    public static long A0O(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long A0P(long j10) {
        return (j10 == C.TIME_UNSET || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static long A0Q(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        long jRound = Math.round(j10 * f10);
        String[] strArr = A01;
        if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "9GRIvgtOgBa9bXM6PfbvjJ8DWw6epVtI";
        strArr2[1] = "tkq8pPym2INMgxVxZaKpNGxpJRL95Qh";
        return jRound;
    }

    public static long A0R(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        return Math.round(j10 / f10);
    }

    public static long A0S(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        if (((j10 ^ j13) & (j11 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static long A0T(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static long A0U(long j10, long j11, long j12) {
        if (j12 >= j11) {
            long j13 = j12 % j11;
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "tvym1rnXFHBFa5iZecmBaZkH1F6VWGFv";
            strArr2[1] = "ooOjiywY7MfdEFCffLHAs2l8GTiel20";
            if (j13 == 0) {
                return j10 / (j12 / j11);
            }
        }
        if (j12 < j11 && j11 % j12 == 0) {
            return j10 * (j11 / j12);
        }
        return (long) (j10 * (j11 / j12));
    }

    public static long A0V(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        if (((j10 ^ j11) & (j10 ^ j13)) < 0) {
            return j12;
        }
        return j13;
    }

    public static Point A0W(Context context) {
        DisplayManager displayManager;
        Display defaultDisplay = null;
        if (A02 >= 17 && (displayManager = (DisplayManager) context.getSystemService(A0i(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, 7, 101))) != null) {
            defaultDisplay = displayManager.getDisplay(0);
        }
        if (defaultDisplay == null) {
            defaultDisplay = ((WindowManager) C3M.A01((WindowManager) context.getSystemService(A0i(961, 6, 98)))).getDefaultDisplay();
        }
        return A0X(context, defaultDisplay);
    }

    public static Point A0X(Context context, Display display) throws NoSuchMethodException, ClassNotFoundException, SecurityException, NumberFormatException {
        String strA0m;
        if (display.getDisplayId() == 0 && A18(context)) {
            if (A02 < 28) {
                strA0m = A0m(A0i(897, 16, 79));
            } else {
                String displaySize = A0i(939, 19, 27);
                strA0m = A0m(displaySize);
            }
            if (!TextUtils.isEmpty(strA0m)) {
                try {
                    String strTrim = strA0m.trim();
                    String displaySize2 = A0i(967, 1, 110);
                    String[] strArrA1O = A1O(strTrim, displaySize2);
                    if (strArrA1O.length == 2) {
                        String displaySize3 = strArrA1O[0];
                        int width = Integer.parseInt(displaySize3);
                        String displaySize4 = strArrA1O[1];
                        int i10 = Integer.parseInt(displaySize4);
                        if (width > 0 && i10 > 0) {
                            return new Point(width, i10);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                StringBuilder sb2 = new StringBuilder();
                String displaySize5 = A0i(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 22, 104);
                String string = sb2.append(displaySize5).append(strA0m).toString();
                String displaySize6 = A0i(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 4, 109);
                AnonymousClass44.A05(displaySize6, string);
            }
            String strA0i = A0i(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, 4, 2);
            String displaySize7 = A05;
            if (strA0i.equals(displaySize7)) {
                String str = A06;
                String displaySize8 = A0i(170, 6, 32);
                if (str.startsWith(displaySize8)) {
                    PackageManager packageManager = context.getPackageManager();
                    String displaySize9 = A0i(589, 32, 72);
                    if (packageManager.hasSystemFeature(displaySize9)) {
                        return new Point(3840, 2160);
                    }
                }
            }
        }
        Point point = new Point();
        if (A02 >= 23) {
            A0z(display, point);
        } else if (A02 >= 17) {
            A0y(display, point);
        } else {
            A0x(display, point);
        }
        return point;
    }

    public static Handler A0Y() {
        return A0a(null);
    }

    public static Handler A0Z() {
        return A0b(null);
    }

    public static Handler A0a(Handler.Callback callback) {
        return A0c((Looper) C3M.A02(Looper.myLooper()), callback);
    }

    public static Handler A0b(Handler.Callback callback) {
        return A0c(A0d(), callback);
    }

    public static Handler A0c(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper A0d() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static CharSequence A0e(CharSequence charSequence, int i10) {
        return charSequence.length() <= i10 ? charSequence : charSequence.subSequence(0, i10);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T A0f(T value) {
        return value;
    }

    public static String A0g(int i10) {
        switch (i10) {
            case 0:
                return A0i(247, 2, 64);
            case 1:
                return A0i(290, 19, 115);
            case 2:
                return A0i(272, 18, 74);
            case 3:
                return A0i(249, 23, 115);
            case 4:
                return A0i(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 3, 37);
            default:
                throw new IllegalStateException();
        }
    }

    public static String A0h(int i10) {
        return Integer.toString(i10, 36);
    }

    public static String A0j(Context context, String str) {
        String strA0i;
        try {
            strA0i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            strA0i = A0i(169, 1, 50);
        }
        StringBuilder sbAppend = new StringBuilder().append(str);
        String versionName = A0i(168, 1, 38);
        StringBuilder sbAppend2 = sbAppend.append(versionName).append(strA0i);
        String versionName2 = A0i(0, 16, 0);
        StringBuilder sbAppend3 = sbAppend2.append(versionName2);
        String versionName3 = Build.VERSION.RELEASE;
        StringBuilder sbAppend4 = sbAppend3.append(versionName3);
        String versionName4 = A0i(163, 2, 8);
        StringBuilder sbAppend5 = sbAppend4.append(versionName4);
        String versionName5 = A0i(176, 18, 60);
        return sbAppend5.append(versionName5).toString();
    }

    public static String A0k(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Locale(str).getISO3Language();
        } catch (MissingResourceException unused) {
            return AbstractC2244iY.A01(str);
        }
    }

    public static String A0l(String str) throws NumberFormatException {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int percentCharacterCount = str.charAt(i11);
            if (percentCharacterCount == 37) {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        int length2 = i10 * 2;
        int startOfNotEscaped = length - length2;
        StringBuilder sb2 = new StringBuilder(startOfNotEscaped);
        Matcher matcher = A08.matcher(str);
        int iEnd = 0;
        while (i10 > 0 && matcher.find()) {
            int i12 = Integer.parseInt((String) C3M.A01(matcher.group(1)), 16);
            int percentCharacterCount2 = A01[0].length();
            if (percentCharacterCount2 == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "PqPC6PEskzx9UdoEWhWT1LElayhySamU";
            strArr[6] = "px5MwBeS5rIOQRTPGFWWURcMVY777XUi";
            int length3 = matcher.start();
            sb2.append((CharSequence) str, iEnd, length3).append((char) i12);
            iEnd = matcher.end();
            i10--;
        }
        if (iEnd < length) {
            sb2.append((CharSequence) str, iEnd, length);
        }
        int length4 = sb2.length();
        if (length4 != startOfNotEscaped) {
            return null;
        }
        return sb2.toString();
    }

    public static String A0m(String str) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Class<?> cls = Class.forName(A0i(445, 27, 40));
            Method getMethod = cls.getMethod(A0i(696, 3, 41), String.class);
            return (String) getMethod.invoke(cls, str);
        } catch (Exception e10) {
            AnonymousClass44.A08(A0i(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, 4, 109), A0i(194, 31, 89) + str, e10);
            return null;
        }
    }

    public static String A0n(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String A0o(Locale locale) {
        return A02 >= 21 ? A0p(locale) : locale.toString();
    }

    public static String A0p(Locale locale) {
        return locale.toLanguageTag();
    }

    public static String A0q(byte[] bArr) {
        return new String(bArr, AbstractC2246ia.A06);
    }

    public static String A0r(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, AbstractC2246ia.A06);
    }

    public static String A0s(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            sb2.append(objArr[i10].getClass().getSimpleName());
            if (i10 < objArr.length - 1) {
                String[] strArr = A01;
                String str = strArr[7];
                String str2 = strArr[1];
                int i11 = str.length();
                if (i11 == str2.length()) {
                    throw new RuntimeException();
                }
                A01[0] = "5BfmCuqMgNYZqTYtdlZRTWg2c";
                sb2.append(A0i(166, 2, 111));
            }
        }
        return sb2.toString();
    }

    public static /* synthetic */ Thread A0t(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService A0u(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return AbstractC09264a.A0t(str, runnable);
            }
        });
    }

    public static void A0w(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void A0x(Display display, Point point) {
        display.getSize(point);
    }

    public static void A0y(Display display, Point point) {
        display.getRealSize(point);
    }

    public static void A0z(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A10(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A11(Throwable th2) throws Throwable {
        A12(th2);
        throw null;
    }

    public static <T extends Throwable> void A12(Throwable th2) throws Throwable {
        throw th2;
    }

    public static void A13(long[] jArr, long j10, long j11) {
        if (j11 >= j10 && j11 % j10 == 0) {
            long j12 = j11 / j10;
            for (int i10 = 0; i10 < jArr.length; i10++) {
                long divisionFactor = jArr[i10];
                jArr[i10] = divisionFactor / j12;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long j13 = j10 / j11;
            for (int i11 = 0; i11 < jArr.length; i11++) {
                long multiplicationFactor = jArr[i11];
                jArr[i11] = multiplicationFactor * j13;
            }
            return;
        }
        double d10 = j10 / j11;
        int i12 = 0;
        while (true) {
            int length = jArr.length;
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "BjGW37zAqxCLsW2nWmt2hw1kAHbIQbLh";
            strArr2[5] = "BHp6YnoeM2z0KYM9Il82lktneq2CMX6s";
            if (i12 < length) {
                double multiplicationFactor2 = (long) (jArr[i12] * d10);
                jArr[i12] = multiplicationFactor2;
                i12++;
            } else {
                return;
            }
        }
    }

    public static boolean A14(int i10) {
        return i10 == 536870912 || i10 == 805306368 || i10 == 4;
    }

    public static boolean A15(int i10) {
        if (i10 != 3 && i10 != 2) {
            String[] strArr = A01;
            if (strArr[2].charAt(19) != strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "sEVRoy0udJ8XOlLumIW6NYr3k1TbE2j9";
            strArr2[6] = "fWOu24VM8azkAehbfbWIlWwimjJiblYr";
            if (i10 != 268435456 && i10 != 536870912 && i10 != 805306368 && i10 != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean A16(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static boolean A17(Context context) {
        return A02 >= 23 && context.getPackageManager().hasSystemFeature(A0i(TTAdConstant.VIDEO_INFO_CODE, 32, 31));
    }

    public static boolean A18(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService(A0i(933, 6, 2));
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean A19(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, A0i(879, 13, 24), A0i(913, 12, 70), new String[]{str}) > 0;
    }

    public static boolean A1A(Uri uri) {
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String scheme2 = A0i(646, 4, 40);
            if (!scheme2.equals(scheme)) {
                return false;
            }
        }
        return true;
    }

    public static boolean A1B(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        Looper looper2 = handler.getLooper();
        Looper looper3 = Looper.myLooper();
        if (looper2 == looper3) {
            runnable.run();
            return true;
        }
        return handler.post(runnable);
    }

    public static boolean A1C(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1D(C4J c4j, C4J c4j2, Inflater inflater) {
        if (c4j.A07() <= 0) {
            return false;
        }
        if (c4j2.A08() < c4j.A07()) {
            c4j2.A0c(c4j.A07() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c4j.A0l(), c4j.A09(), c4j.A07());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(c4j2.A0l(), iInflate, c4j2.A08() - iInflate);
                if (inflater.finished()) {
                    c4j2.A0e(iInflate);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                if (iInflate == c4j2.A08()) {
                    c4j2.A0c(c4j2.A08() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean A1E(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] A1F(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byte[] buffer = byteArrayOutputStream.toByteArray();
                return buffer;
            }
        }
    }

    public static byte[] A1G(String str) {
        return str.getBytes(AbstractC2246ia.A06);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] A1H(T[] value) {
        return value;
    }

    public static <T> T[] A1I(T[] tArr, int i10) {
        C3M.A07(i10 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] A1J(T[] tArr, int i10, int i11) {
        boolean z10 = true;
        C3M.A07(i10 >= 0);
        if (i11 > tArr.length) {
            z10 = false;
        }
        C3M.A07(z10);
        return (T[]) Arrays.copyOfRange(tArr, i10, i11);
    }

    public static <T> T[] A1K(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static String[] A1L() {
        String[] strArrA1M = A1M();
        for (int i10 = 0; i10 < strArrA1M.length; i10++) {
            strArrA1M[i10] = A0k(strArrA1M[i10]);
        }
        return strArrA1M;
    }

    public static String[] A1M() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (A02 >= 24) {
            return A1N(configuration);
        }
        return new String[]{A0o(configuration.locale)};
    }

    public static String[] A1N(Configuration configuration) {
        return A1O(configuration.getLocales().toLanguageTags(), A0i(165, 1, 42));
    }

    public static String[] A1O(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] A1P(String str, String str2) {
        return str.split(str2, 2);
    }
}
