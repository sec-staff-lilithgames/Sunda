package com.facebook.ads.redexgen.core;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Deprecated
/* renamed from: com.facebook.ads.redexgen.X.Ay, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1093Ay {
    public static int A00;
    public static byte[] A01;
    public static String[] A02 = {"eqdzSiIdqnT3hCSsTENYLmZ4", "qLAEi2WvCJu9wjJ", "toce", "QmOxXIzlvE53d2X", "WAyVnYX8HOamSHc7hCznsAV7J1o4yjh4", "2Jg1vBhmBkCi6YoALSajSHGhL27exhse", "FyqWibsIBjeEGSoGFPMxHwupdmiGrYAl", "dJbg5x7m2zG"};
    public static final HashMap<C1089Au, List<AR>> A03;
    public static final Pattern A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00() throws C1090Av {
        int i10 = A00;
        String[] strArr = A02;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[7] = "ayn8";
        if (i10 == -1) {
            int iMax = 0;
            AR arA0J = A0J(A0N(1756, 9, 19), false, false);
            if (arA0J != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : arA0J.A0V()) {
                    iMax = Math.max(A03(codecProfileLevel.level), iMax);
                }
                iMax = Math.max(iMax, AbstractC09264a.A02 >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            A00 = iMax;
        }
        return A00;
    }

    public static String A0N(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.facebook.ads.redexgen.X.Av.<init>(java.lang.Throwable, com.facebook.ads.redexgen.X.At):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[Catch: Exception -> 0x01b2, PHI: r0
      0x013c: PHI (r0v18 java.lang.String) = (r0v16 java.lang.String), (r0v22 java.lang.String) binds: [B:66:0x013a, B:63:0x012d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #7 {Exception -> 0x01b2, blocks: (B:3:0x0014, B:5:0x002a, B:8:0x0035, B:11:0x0040, B:59:0x0101, B:71:0x0170, B:72:0x01aa, B:67:0x013c, B:69:0x0142), top: B:93:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.facebook.ads.redexgen.core.AR> A0Q(com.facebook.ads.redexgen.core.C1089Au r23, com.facebook.ads.redexgen.core.InterfaceC1091Aw r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0Q(com.facebook.ads.redexgen.X.Au, com.facebook.ads.redexgen.X.Aw):java.util.ArrayList");
    }

    public static void A0S() {
        A01 = new byte[]{-121, -113, 94, 102, -92, -97, -89, -86, -93, -94, 94, -78, -83, 94, -81, -77, -93, -80, -73, 94, -95, -97, -82, -97, -96, -89, -86, -89, -78, -89, -93, -79, 103, 56, -111, -125, -92, -42, -42, -40, -48, -52, -47, -54, -99, -125, 65, -122, 120, 118, -120, -123, 120, -72, -3, 1, -72, 66, 66, -90, -89, 85, 87, -84, -81, 111, 115, 65, 70, -115, -109, -98, -91, -95, -87, 99, 108, -73, -89, -90, 87, 87, 65, 66, 68, 70, 103, -116, -120, -116, -85, -101, -127, -127, -125, -124, -91, -93, -81, -92, -91, -78, 92, 74, 78, 73, 77, 119, 101, 105, 100, 105, 121, 103, 108, 102, 106, -113, 125, -126, 124, -127, -97, -110, -110, -116, -114, -70, -83, -83, -89, -86, -59, -72, -72, -78, -72, 90, 77, 77, 72, 77, -72, -66, -59, -74, -74, -72, -71, -38, -40, -28, -39, -38, -25, -60, -54, -47, -62, -50, -45, -49, -61, -59, -26, -28, -16, -27, -26, -13, -73, -67, -60, -63, -60, -89, -72, -39, -41, -29, -40, -39, -26, -51, -45, -38, -32, -7, -4, -20, -13, -3, -50, -17, -19, -7, -18, -17, -4, -81, -54, -46, -43, -50, -51, -119, -35, -40, -119, -38, -34, -50, -37, -30, -119, -52, -40, -51, -50, -52, -119, -63, -86, -85, -87, 103, 80, 81, 82, -68, -91, -87, -92, -119, 114, 118, 116, -58, -81, -77, -76, -78, -101, -94, -102, 88, 65, 72, 67, -128, 105, 112, 110, -95, -116, -119, -79, -97, -103, -117, 121, 118, 114, 99, 90, -93, -108, -114, -84, -79, -107, -77, -70, -69, -66, -75, -70, -77, 108, -71, -83, -72, -78, -69, -66, -71, -79, -80, 108, -115, -94, 125, 108, -81, -69, -80, -79, -81, 108, -65, -64, -66, -75, -70, -77, -122, 108, 120, -106, -99, -98, -95, -104, -99, -106, 79, -100, -112, -101, -107, -98, -95, -100, -108, -109, 79, 112, -123, 114, 79, -110, -98, -109, -108, -110, 79, -94, -93, -95, -104, -99, -106, 105, 79, -85, -55, -48, -47, -44, -53, -48, -55, -126, -49, -61, -50, -56, -47, -44, -49, -57, -58, -126, -90, -47, -50, -60, -37, -126, -72, -53, -43, -53, -47, -48, -126, -59, -47, -58, -57, -59, -126, -43, -42, -44, -53, -48, -55, -100, -126, -122, -92, -85, -84, -81, -90, -85, -92, 93, -86, -98, -87, -93, -84, -81, -86, -94, -95, 93, -123, -126, -109, -128, 93, -96, -84, -95, -94, -96, 93, -80, -79, -81, -90, -85, -92, 119, 93, -71, -41, -34, -33, -30, -39, -34, -41, -112, -35, -47, -36, -42, -33, -30, -35, -43, -44, -112, -67, -64, -92, -79, -112, -45, -33, -44, -43, -45, -112, -29, -28, -30, -39, -34, -41, -86, -112, 90, 120, AbstractJsonLexerKt.TC_INVALID, -128, -125, 122, AbstractJsonLexerKt.TC_INVALID, 120, 49, 126, 114, 125, 119, -128, -125, 126, 118, 117, 49, 103, 97, 74, 49, 116, -128, 117, 118, 116, 49, -124, -123, -125, 122, AbstractJsonLexerKt.TC_INVALID, 120, 75, 49, -112, 117, 118, 116, -53, -80, -79, -78, -65, -92, -88, -93, -63, -90, -86, -88, -124, 105, 109, 110, -92, -119, -112, -120, -64, -91, -84, -89, 108, 81, 88, 86, -66, -91, -94, -61, -86, -83, -33, -98, -120, -126, -44, -66, -69, -96, -115, -124, -119, 118, 112, 92, 95, 66, 83, 116, 114, 126, 115, 116, -127, -105, -81, -82, -77, -85, -115, -71, -82, -81, -83, -106, -77, -67, -66, 106, -117, -102, -109, 106, -82, -77, -82, -72, 113, -66, 106, -74, -77, -67, -66, 106, -67, -81, -83, -65, -68, -81, 106, -82, -81, -83, -71, -82, -81, -68, 106, -80, -71, -68, -124, 106, -86, -62, -63, -58, -66, -96, -52, -63, -62, -64, -78, -47, -58, -55, -85, -87, -76, -118, -95, -44, -43, -54, -53, -49, -118, -99, -99, -97, -118, -96, -63, -65, -53, -64, -63, -50, -40, -42, -31, -73, -42, -36, -73, -47, -50, -33, -52, -51, -33, -73, -51, -18, -20, -8, -19, -18, -5, -48, -50, -39, -81, -50, -43, -52, -81, -62, -42, -59, -54, -48, -81, -59, -58, -60, -48, -59, -58, -45, -81, -62, -62, -60, -68, -70, -59, -101, -70, -63, -72, -101, -82, -62, -79, -74, -68, -101, -79, -78, -80, -68, -79, -78, -65, -101, -79, -64, -67, -82, -80, -96, -120, -122, -111, 103, -122, -115, -124, 103, 122, -114, 125, -126, -120, 103, 125, 126, 124, -120, 125, 126, -117, 103, -117, 122, -112, -102, -104, -93, 121, -99, -97, -106, 121, -63, -76, -81, -80, -70, 121, -81, -80, -82, -70, -81, -80, -67, -127, AbstractJsonLexerKt.TC_INVALID, -118, 96, -123, 119, 117, 96, AbstractJsonLexerKt.TC_INVALID, -126, 101, 96, 118, -105, -107, -95, -106, -105, -92, -46, -48, -37, -79, -42, -56, -58, -79, -28, -28, -26, -79, -25, -24, -26, -82, -84, -73, -115, -78, -92, -94, -115, -52, -49, -110, -115, -61, -60, -62, -126, -128, -117, 97, -122, 120, 118, 97, -87, -93, 107, 97, -105, -104, -106, -119, -121, -110, 104, -100, -84, -99, -89, 104, -101, -81, -98, -93, -87, 104, -89, -86, 109, 104, -98, -97, -99, -87, -98, -97, -84, -124, -126, -115, 99, -100, -92, -92, -100, -95, -102, -86, -88, -77, -119, -62, -54, -54, -62, -57, -64, -119, -51, -68, -46, -119, -65, -64, -66, -54, -65, -64, -51, -84, -86, -75, -117, -55, -60, -62, -117, -66, -64, -112, -117, -63, -62, -64, -52, -63, -62, -49, -72, -74, -63, -105, -43, -48, -50, -105, -54, -43, -54, -52, -105, -51, -50, -52, -40, -51, -50, -37, -114, -116, -105, 109, -85, -90, -92, 109, -91, -85, -96, -94, 109, -93, -92, -94, -82, -93, -92, -79, 108, 106, 117, 75, -114, -128, -116, -118, 75, 126, -110, -127, -122, -116, 75, -127, -126, -128, -116, -127, -126, -113, 75, 126, 126, -128, 107, 105, 116, 74, -115, AbstractJsonLexerKt.TC_INVALID, -117, -119, 74, 125, -111, -128, -123, -117, 74, -128, -127, AbstractJsonLexerKt.TC_INVALID, -117, -128, -127, -114, 
        74, -119, -116, 79, -75, -77, -66, -108, -41, -55, -43, -45, -108, -36, -49, -54, -53, -43, -108, -54, -53, -55, -43, -54, -53, -40, -108, -36, -42, -98, 114, 112, 123, 81, -108, -105, -116, 81, -124, -104, -121, -116, -110, 81, -121, -120, -122, -110, -121, -120, -107, 81, -119, -113, -124, -122, -105, -107, -96, 118, -70, -83, -87, -76, -68, -83, -77, 118, -66, -79, -84, -83, -73, 118, -84, -83, -85, -73, -84, -83, -70, 118, -68, -67, -74, -74, -83, -76, -83, -84, -80, -105, -102, -118, 116, 119, 123, -114, -40, -56, -78, -75, -70, -52, -45, -61, -42, -77, -79, -121, -125, 97, 100, 102, 121, -112, -88, -90, -83, -83, -90, -85, -92, 93, -96, -84, -95, -94, -96, 93, -50, -25, -28, -25, -24, -16, -25, -103, -70, -49, -86, -103, -37, -30, -19, -103, -35, -34, -23, -19, -31, -77, -103, -78, -53, -56, -53, -52, -44, -53, 125, -98, -77, -114, 125, -55, -62, -45, -62, -55, -105, 125, -41, -16, -19, -16, -15, -7, -16, -94, -61, -40, -77, -94, -14, -12, -15, -24, -21, -18, -25, -68, -94, -124, -99, -102, -99, -98, -90, -99, 79, 112, -123, 114, 79, -101, -108, -91, -108, -101, 105, 79, -84, -59, -62, -59, -58, -50, -59, 119, -104, -83, -102, 119, -57, -55, -58, -67, -64, -61, -68, -111, 119, -111, -86, -89, -86, -85, -77, -86, 92, -128, -85, -88, -98, -75, 92, -110, -91, -81, -91, -85, -86, 92, -88, -95, -78, -95, -88, 92, -81, -80, -82, -91, -86, -93, 118, 92, 100, 125, 122, 125, 126, -122, 125, 47, 83, 126, 123, 113, -120, 47, 101, 120, -126, 120, 126, 125, 47, AbstractJsonLexerKt.TC_INVALID, -127, 126, 117, 120, 123, 116, 47, -126, -125, -127, 120, 125, 118, 73, 47, -75, -50, -53, -50, -49, -41, -50, -128, -88, -91, -74, -93, -128, -52, -59, -42, -59, -52, -128, -45, -44, -46, -55, -50, -57, -102, -128, -52, -27, -30, -27, -26, -18, -27, -105, -65, -68, -51, -70, -105, -25, -23, -26, -35, -32, -29, -36, -105, -22, -21, -23, -32, -27, -34, -79, -105, -93, -68, -71, -68, -67, -59, -68, 110, -92, -98, -121, 110, -70, -77, -60, -77, -70, -120, 110, -101, -76, -79, -76, -75, -67, -76, 102, -100, -106, AbstractJsonLexerKt.TC_INVALID, 102, -74, -72, -75, -84, -81, -78, -85, -128, 102, 112, -127, 121, -121, -123, -127, -44, -90, -37, -39, -63, -68, -91, -39, -31, -88, -90, -95, -89, 125, 118, -36, -19, -34, -87, 122, -114, 125, -126, -120, 72, 122, 124, 76, -38, -18, -35, -30, -24, -88, -38, -27, -38, -36, 116, -120, 119, 124, -126, 66, 120, 116, 118, 70, -48, -28, -45, -40, -34, -98, -44, -48, -46, -94, -100, -39, -34, -46, -96, -76, -93, -88, -82, 110, -91, -85, -96, -94, 120, -116, 123, -128, -122, 70, -125, 126, 68, 120, 122, 74, -125, -105, -122, -117, -111, 81, -113, -110, 86, -125, 79, -114, -125, -106, -113, -54, -34, -51, -46, -40, -104, -37, -54, -32, -46, -26, -43, -38, -32, -96, -23, -98, -35, -40, -98, -46, -35, -46, -44, -37, -17, -34, -29, -23, -87, -14, -89, -26, -31, -89, -32, -26, -37, -35, -118, -97, 89, 90, AbstractJsonLexerKt.TC_INVALID, -108, -127, 79, 126, -109, -128, 79, -82, 125, 121, -101, 106, 102, -103, -90, -100, -86, -89, -95, -100, -59, -108, -112, -61, -48, -58, -44, -47, -53, -58, -112, 114, 65, 61, 118, 126, 126, 118, 123, 116, 61, 120, 70, -39, -31, -19, -22, -17, -19, -19, -96, -99, -82, 105, -21, -7, -26, -76, -33, -37, -31, -23, -38, -82, -94, -77, -86, -81, -90, -83, -75, -90, -94, -75, -75, -113, -110, 86, -125, -58, -60, -49, -123, -54, -56, -45, -119, -63, -63, -56, -53, -64, -62, -119, -88, -90, -79, 103, -96, -88, -88, -96, -91, -98, 103, -66, -68, -57, 125, -64, -78, -66, -68, 125, -59, -72, -77, -76, -66, 125, -77, -76, -78, -66, -77, -76, -63, 125, -73, -76, -59, -78, -62, -58, -59, -77, -76, -78, -100, -102, -91, 91, -96, -110, -112, 91, -10, -8, -11, -6, -11, -5, -116, 122, -122, -116, -114, -121, -128, -109, -127, -114, -108, -113, -109, -8, -22, -24, -6, -9, -22, -78, -11, -15, -26, -2, -25, -26, -24, -16, -119, 123, -120, -120, 119, -124, -123, -69, 119, -82, -81, -88, -88, -97, -90, -97, -98, 103, -86, -90, -101, -77, -100, -101, -99, -91, -106, -119, -124, -123, -113, 79, -127, -106, -125, -99, -112, -117, -116, -106, 86, -117, -106, -109, -119, -96, 84, -99, -112, -102, -112, -106, -107, -77, -90, -95, -94, -84, 108, -95, -77, -100, -91, -94, -77, -96, -101, -114, -119, -118, -108, 84, -115, -118, -101, -120, -66, -79, -84, -83, -73, 119, -80, -83, -66, -85, -84, -66, -28, -41, -38, -38, -45, -107, -120, -117, -117, -124, -126, 81, -64, -77, -74, -74, -81, -70, -74, -65, -67, -78, -84, 108, 117, -64, -85, -76, -78, -70, -85, -43, -64, -51, -54, -63, -57, -49, -64, -52, -73, -60, -63, -66, -58, -73};
    }

    static {
        A0S();
        A04 = Pattern.compile(A0N(1409, 10, 112));
        A03 = new HashMap<>();
        A00 = -1;
    }

    public static int A01(int i10) {
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
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[1] = "p3tScLodvmBhgJu";
                strArr[3] = "blAckLRsjuERKNr";
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
                String[] strArr2 = A02;
                if (strArr2[6].charAt(8) == strArr2[5].charAt(8)) {
                    A02[7] = "bdr4r1uDMPeXB3s0e5pOX5Q";
                    return C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
                break;
            case 17:
                return 131072;
            case 18:
                String[] strArr3 = A02;
                if (strArr3[6].charAt(8) != strArr3[5].charAt(8)) {
                    String[] strArr4 = A02;
                    strArr4[6] = "34IRfUzRBRFF7aBglEcwMApXZqeFGI1m";
                    strArr4[5] = "iRGVlhZlB1b37DNJ3kG6hrLab0t0wQjp";
                    return 262144;
                }
                String[] strArr5 = A02;
                strArr5[0] = "eT6IL44S7u9o4A5QFAcxcvIY";
                strArr5[2] = "bWAi";
                return 262144;
            case 19:
                return 524288;
            case 20:
                return ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                String[] strArr6 = A02;
                if (strArr6[6].charAt(8) != strArr6[5].charAt(8)) {
                    A02[4] = "Kx02KfDWNZB3bbiKdLxxGACkAkNM6rJP";
                    return 2097152;
                }
                A02[4] = "WnzQHL4oKpbMUVBkEywLAA92oYxlOTj8";
                return 2097152;
            case 22:
                if (A02[4].charAt(21) == 'A') {
                    A02[4] = "cAiGKOliFB77vtIZojZGlA8hvOCkEVbR";
                    return 4194304;
                }
                break;
            case 23:
                return 8388608;
            default:
                return -1;
        }
        throw new RuntimeException();
    }

    public static int A02(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            case 20:
                return 32;
            case 21:
                return 64;
            case 22:
                return 128;
            case 30:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 31:
                return 512;
            case 32:
                return 1024;
            case 40:
                return 2048;
            case 41:
                return 4096;
            case 42:
                return Segment.SIZE;
            case 50:
                return 16384;
            case 51:
                String[] strArr = A02;
                if (strArr[1].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "Dd2HPoEYdkjLRr8";
                strArr2[3] = "8RMIphYW42mwAMu";
                return 32768;
            case 52:
                return C.DEFAULT_BUFFER_SEGMENT_SIZE;
            default:
                return -1;
        }
    }

    public static int A03(int i10) {
        switch (i10) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[1] = "3QcVs4uE13o5U89";
                strArr2[3] = "HwwNiq3rR5E2ArP";
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

    public static int A04(int i10) {
        switch (i10) {
            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                return 1;
            case 77:
                return 2;
            case 88:
                return 4;
            case 100:
                return 8;
            case 110:
                return 16;
            case INVALID_ADS_ENDPOINT_VALUE:
                return 32;
            case 244:
                return 64;
            default:
                return -1;
        }
    }

    public static int A05(int i10) {
        switch (i10) {
            case 1:
                if (A02[4].charAt(21) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "QMC9ZT5BEMY9TcRggpPTke3A";
                strArr[2] = "gCyl";
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                String[] strArr2 = A02;
                if (strArr2[6].charAt(8) != strArr2[5].charAt(8)) {
                    throw new RuntimeException();
                }
                A02[4] = "69A91wQXEtxdKe6VEWAWvAWn2bPjhSLd";
                return 5;
            case 6:
                return 6;
            case 17:
                return 17;
            case 20:
                return 20;
            case 23:
                return 23;
            case 29:
                return 29;
            case 39:
                return 39;
            case 42:
                return 42;
            default:
                return -1;
        }
    }

    public static int A06(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 2;
            case 20:
                return 4;
            case 21:
                return 8;
            case 30:
                return 16;
            case 31:
                return 32;
            case 40:
                return 64;
            case 41:
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[1] = "FYHyz6Jn9nffJKB";
                strArr[3] = "LZRAC8LId4dogw6";
                return 128;
            case 50:
                return NotificationCompat.FLAG_LOCAL_ONLY;
            case 51:
                return 512;
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

    public static int A07(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                if (A02[7].length() == 25) {
                    throw new RuntimeException();
                }
                A02[4] = "pIa0SKSMXaKd1ZRZCUAsSAHaUimoLOpx";
                return 8;
            default:
                String[] strArr = A02;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[0] = "vDav2EVX30wYgrXK4P9ZX6kx";
                strArr2[2] = "QW4Z";
                return -1;
        }
    }

    public static /* synthetic */ int A08(AR ar2) {
        String str = ar2.A03;
        String name = A0N(861, 10, 40);
        if (str.startsWith(name)) {
            return 1;
        }
        String name2 = A0N(1560, 10, 43);
        if (str.startsWith(name2)) {
            return 1;
        }
        if (AbstractC09264a.A02 >= 26) {
            return 0;
        }
        String name3 = A0N(725, 25, 44);
        if (str.equals(name3)) {
            return -1;
        }
        return 0;
    }

    public static /* synthetic */ int A09(AR ar2) {
        return ar2.A03.startsWith(A0N(861, 10, 40)) ? 1 : 0;
    }

    public static /* synthetic */ int A0A(InterfaceC1092Ax interfaceC1092Ax, Object obj, Object obj2) {
        return interfaceC1092Ax.A8o(obj2) - interfaceC1092Ax.A8o(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0B(com.facebook.ads.redexgen.core.C2614or r8) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0B(com.facebook.ads.redexgen.X.or):android.util.Pair");
    }

    public static Pair<Integer, Integer> A0C(String str, String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        String strA0N = A0N(428, 38, 99);
        String strA0N2 = A0N(615, 14, 80);
        if (length != 3) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            int objectTypeIndication = Integer.parseInt(strArr[1], 16);
            if (A0N(1491, 15, 21).equals(AbstractC08812h.A05(objectTypeIndication))) {
                int objectTypeIndication2 = Integer.parseInt(strArr[2]);
                int iA05 = A05(objectTypeIndication2);
                if (iA05 != -1) {
                    return new Pair<>(Integer.valueOf(iA05), 0);
                }
            }
        } catch (NumberFormatException unused) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
        }
        return null;
    }

    public static Pair<Integer, Integer> A0D(String str, String[] strArr) throws NumberFormatException {
        int i10;
        int i11;
        int length = strArr.length;
        String strA0N = A0N(307, 37, 34);
        String strA0N2 = A0N(615, 14, 80);
        if (length < 2) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i11 = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                i10 = Integer.parseInt(strArr[1]);
                i11 = Integer.parseInt(strArr[2]);
            } else {
                AnonymousClass44.A07(strA0N2, strA0N + str);
                return null;
            }
            int iA04 = A04(i10);
            if (iA04 == -1) {
                AnonymousClass44.A07(strA0N2, A0N(1212, 21, 74) + i10);
                return null;
            }
            int levelInteger = A02(i11);
            if (levelInteger == -1) {
                AnonymousClass44.A07(strA0N2, A0N(1193, 19, 34) + i11);
                return null;
            }
            return new Pair<>(Integer.valueOf(iA04), Integer.valueOf(levelInteger));
        } catch (NumberFormatException unused) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
    }

    public static Pair<Integer, Integer> A0E(String str, String[] strArr) {
        int length = strArr.length;
        String strA0N = A0N(344, 46, 85);
        String levelString = A0N(615, 14, 80);
        if (length < 3) {
            AnonymousClass44.A07(levelString, strA0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        if (!matcher.matches()) {
            AnonymousClass44.A07(levelString, strA0N + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer profile = A0L(strGroup);
        if (profile == null) {
            AnonymousClass44.A07(levelString, A0N(1268, 37, 2) + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numA0K = A0K(str2);
        if (numA0K == null) {
            AnonymousClass44.A07(levelString, A0N(1233, 35, 47) + str2);
            return null;
        }
        return new Pair<>(profile, numA0K);
    }

    public static Pair<Integer, Integer> A0F(String str, String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        String strA0N = A0N(466, 37, 4);
        String strA0N2 = A0N(615, 14, 80);
        if (length < 3) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int profile = A07(i10);
            if (profile == -1) {
                AnonymousClass44.A07(strA0N2, A0N(1380, 21, 57) + i10);
                return null;
            }
            int profileInteger = A06(i11);
            if (profileInteger == -1) {
                AnonymousClass44.A07(strA0N2, A0N(1361, 19, 65) + i11);
                return null;
            }
            return new Pair<>(Integer.valueOf(profile), Integer.valueOf(profileInteger));
        } catch (NumberFormatException unused) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> A0G(java.lang.String r8, java.lang.String[] r9, com.facebook.ads.androidx.media3.common.ColorInfo r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0G(java.lang.String, java.lang.String[], com.facebook.ads.androidx.media3.common.ColorInfo):android.util.Pair");
    }

    public static Pair<Integer, Integer> A0H(String str, String[] strArr, ColorInfo colorInfo) {
        int i10;
        int length = strArr.length;
        String strA0N = A0N(390, 38, 48);
        String strA0N2 = A0N(615, 14, 80);
        if (length < 4) {
            AnonymousClass44.A07(strA0N2, strA0N + str);
            return null;
        }
        Matcher matcher = A04.matcher(strArr[1]);
        boolean zMatches = matcher.matches();
        if (A02[7].length() != 25) {
            String[] strArr2 = A02;
            strArr2[6] = "KQD5T9TnBB7A1Qau37dPwA8fp0YnC9XP";
            strArr2[5] = "pnb4d0x2BWoBz7rcvfU2b1k7Wl63lPA1";
            if (!zMatches) {
                AnonymousClass44.A07(strA0N2, strA0N + str);
                return null;
            }
            String strGroup = matcher.group(1);
            if (A0N(77, 1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE).equals(strGroup)) {
                i10 = 1;
            } else if (A0N(86, 1, 40).equals(strGroup)) {
                if (colorInfo != null && colorInfo.A03 == 6) {
                    i10 = 4096;
                } else {
                    i10 = 2;
                }
            } else {
                AnonymousClass44.A07(strA0N2, A0N(1332, 29, 106) + strGroup);
                return null;
            }
            String[] strArr3 = A02;
            if (strArr3[6].charAt(8) == strArr3[5].charAt(8)) {
                A02[7] = "4AE";
                String profileString = strArr[3];
                Integer numA0M = A0M(profileString);
                if (numA0M == null) {
                    AnonymousClass44.A07(strA0N2, A0N(1305, 27, 83) + profileString);
                    return null;
                }
                return new Pair<>(Integer.valueOf(i10), numA0M);
            }
        }
        throw new RuntimeException();
    }

    public static AR A0I() throws C1090Av {
        return A0J(A0N(1506, 9, 92), false, false);
    }

    public static AR A0J(String str, boolean z10, boolean z11) throws C1090Av {
        List<AR> listA0R = A0R(str, z10, z11);
        if (listA0R.isEmpty()) {
            return null;
        }
        return listA0R.get(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A0K(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0K(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A0L(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0L(java.lang.String):java.lang.Integer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer A0M(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0M(java.lang.String):java.lang.Integer");
    }

    public static String A0O(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(A0N(1765, 18, 26))) {
            if (A0N(651, 21, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).equals(str)) {
                return A0N(1806, 12, 59);
            }
            String[] strArr = A02;
            if (strArr[1].length() == strArr[3].length()) {
                String[] strArr2 = A02;
                strArr2[0] = "SNR7DEuQkTqundc8fpfLWSSq";
                strArr2[2] = "Am34";
                if (A0N(UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS, 21, 62).equals(str) || A0N(IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 34, 59).equals(str)) {
                    return A0N(1783, 13, 48);
                }
                return null;
            }
        } else {
            if (str2.equals(A0N(1435, 10, 108)) && A0N(912, 20, 92).equals(str)) {
                return A0N(1515, 15, 100);
            }
            String[] strArr3 = A02;
            if (strArr3[1].length() == strArr3[3].length()) {
                String[] strArr4 = A02;
                strArr4[0] = "F6UQuKTk39X0DFpi3syODLNA";
                strArr4[2] = "oGjK";
                if (str2.equals(A0N(1469, 10, 50)) && A0N(932, 20, 50).equals(str)) {
                    return A0N(1530, 15, 109);
                }
                if (str2.equals(A0N(1426, 9, 12)) && A0N(893, 19, 80).equals(str)) {
                    return A0N(1479, 12, 10);
                }
                return null;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A0P(com.facebook.ads.redexgen.core.C2614or r5) {
        /*
            r2 = 1455(0x5af, float:2.039E-42)
            r1 = 14
            r0 = 98
            java.lang.String r1 = A0N(r2, r1, r0)
            java.lang.String r0 = r5.A0W
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L35
            r2 = 1445(0x5a5, float:2.025E-42)
            r1 = 10
            r0 = 6
            java.lang.String r3 = A0N(r2, r1, r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1093Ay.A02
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1093Ay.A02
            java.lang.String r1 = "ZfndW6AJBdBNuLe7GaNBaOlzT6fPhO3e"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "cwvehiRLBehKtkGil8NX01GWyhG4bC3G"
            r0 = 5
            r2[r0] = r1
            return r3
        L35:
            r2 = 1765(0x6e5, float:2.473E-42)
            r1 = 18
            r0 = 26
            java.lang.String r1 = A0N(r2, r1, r0)
            java.lang.String r0 = r5.A0W
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L90
            android.util.Pair r0 = A0B(r5)
            if (r0 == 0) goto L90
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            r0 = 16
            if (r1 == r0) goto L5d
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != r0) goto L68
        L5d:
            r2 = 1796(0x704, float:2.517E-42)
            r1 = 10
            r0 = 24
            java.lang.String r0 = A0N(r2, r1, r0)
            return r0
        L68:
            r0 = 512(0x200, float:7.17E-43)
            if (r1 != r0) goto L90
            r5 = 1756(0x6dc, float:2.46E-42)
            r4 = 9
            r3 = 19
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1093Ay.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1093Ay.A02
            java.lang.String r1 = "uUyr2eIguxRStOoGPtni7X3Qg6do19s"
            r0 = 7
            r2[r0] = r1
            java.lang.String r0 = A0N(r5, r4, r3)
            return r0
        L90:
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1093Ay.A02
            r0 = 0
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1093Ay.A02
            java.lang.String r1 = "fWQmLDMHB8f7NLxxt23iYDut8JSJcJup"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "lo0RJuE4BwIH2JQYtOHz0H7ocrHx9GAy"
            r0 = 5
            r2[r0] = r1
            return r3
        Lb0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0P(com.facebook.ads.redexgen.X.or):java.lang.String");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Am != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecInfo> */
    public static synchronized List<AR> A0R(String str, boolean z10, boolean z11) throws C1090Av {
        InterfaceC1091Aw c2486mk;
        C1089Au c1089Au = new C1089Au(str, z10, z11);
        List<AR> list = A03.get(c1089Au);
        if (list != null) {
            return list;
        }
        if (AbstractC09264a.A02 >= 21) {
            c2486mk = new C2484mi(z10, z11);
        } else {
            c2486mk = new C2486mk();
        }
        ArrayList<AR> arrayListA0Q = A0Q(c1089Au, c2486mk);
        if (z10 && arrayListA0Q.isEmpty() && 21 <= AbstractC09264a.A02 && AbstractC09264a.A02 <= 23) {
            arrayListA0Q = A0Q(c1089Au, new C2486mk());
            if (!arrayListA0Q.isEmpty()) {
                AnonymousClass44.A07(A0N(615, 14, 80), A0N(564, 51, 61) + str + A0N(34, 12, 86) + arrayListA0Q.get(0).A03);
            }
        }
        A0T(str, arrayListA0Q);
        AbstractC1081Am abstractC1081AmA05 = AbstractC1081Am.A05(arrayListA0Q);
        A03.put(c1089Au, abstractC1081AmA05);
        return abstractC1081AmA05;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0T(java.lang.String r13, java.util.List<com.facebook.ads.redexgen.core.AR> r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0T(java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ax != com.facebook.ads.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$ScoreProvider<T> */
    public static <T> void A0U(List<T> list, final InterfaceC1092Ax<T> interfaceC1092Ax) {
        Collections.sort(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.As
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C1093Ay.A0A(interfaceC1092Ax, obj, obj2);
            }
        });
    }

    public static boolean A0V(MediaCodecInfo mediaCodecInfo) {
        return AbstractC09264a.A02 >= 29 && A0W(mediaCodecInfo);
    }

    public static boolean A0W(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean A0X(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean A0Y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean A0Z(MediaCodecInfo mediaCodecInfo) {
        if (AbstractC09264a.A02 >= 29) {
            return A0a(mediaCodecInfo);
        }
        String strA01 = AbstractC2244iY.A01(mediaCodecInfo.getName());
        String codecName = A0N(1644, 11, 44);
        if (!strA01.startsWith(codecName)) {
            String codecName2 = A0N(1570, 11, 85);
            if (!strA01.startsWith(codecName2)) {
                String codecName3 = A0N(1581, 10, 2);
                if (!strA01.startsWith(codecName3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static boolean A0b(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC09264a.A02 >= 29) {
            return A0X(mediaCodecInfo);
        }
        boolean zA0c = A0c(mediaCodecInfo, str);
        if (A02[7].length() == 25) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "KoKjuGysRdwz5u0";
        strArr[3] = "VFpylWMq2S0rj93";
        return !zA0c;
    }

    public static boolean A0c(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC09264a.A02 >= 29) {
            boolean zA0Y = A0Y(mediaCodecInfo);
            if (A02[7].length() == 25) {
                throw new RuntimeException();
            }
            A02[7] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
            return zA0Y;
        }
        if (AbstractC08812h.A0C(str)) {
            return true;
        }
        String strA01 = AbstractC2244iY.A01(mediaCodecInfo.getName());
        String codecName = A0N(1422, 4, 110);
        if (strA01.startsWith(codecName)) {
            return false;
        }
        String codecName2 = A0N(1644, 11, 44);
        if (strA01.startsWith(codecName2)) {
            return true;
        }
        String codecName3 = A0N(1633, 11, 78);
        if (strA01.startsWith(codecName3)) {
            return true;
        }
        String codecName4 = A0N(1688, 8, 32);
        if (strA01.startsWith(codecName4)) {
            String strA0N = A0N(53, 4, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            String[] strArr = A02;
            if (strArr[6].charAt(8) == strArr[5].charAt(8)) {
                A02[4] = "Tb2zdMoNeySIBbx0V3f9cAwRo38zez7f";
                if (strA01.contains(strA0N)) {
                    return true;
                }
            } else if (strA01.contains(strA0N)) {
                return true;
            }
        }
        String codecName5 = A0N(1655, 33, 66);
        if (strA01.equals(codecName5)) {
            return true;
        }
        String codecName6 = A0N(1570, 11, 85);
        if (strA01.startsWith(codecName6)) {
            return true;
        }
        String codecName7 = A0N(1581, 10, 2);
        if (strA01.startsWith(codecName7)) {
            return true;
        }
        String codecName8 = A0N(1629, 4, 74);
        if (!strA01.startsWith(codecName8)) {
            String codecName9 = A0N(1557, 3, 62);
            if (!strA01.startsWith(codecName9)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0335, code lost:
    
        if (A0N(1104, 5, 115).equals(com.facebook.ads.redexgen.core.AbstractC09264a.A03) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03df, code lost:
    
        if (r3 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        if (com.facebook.ads.redexgen.core.AbstractC09264a.A03.startsWith(A0N(268, 2, 87)) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
    
        if (A0N(1109, 6, 39).equals(com.facebook.ads.redexgen.core.AbstractC09264a.A03) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0239, code lost:
    
        if (A0N(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 5, 63).equals(com.facebook.ads.redexgen.core.AbstractC09264a.A03) != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0d(android.media.MediaCodecInfo r8, java.lang.String r9, boolean r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1093Ay.A0d(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):boolean");
    }
}
