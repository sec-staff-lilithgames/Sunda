package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public abstract class KB {
    public static byte[] A00;
    public static String[] A01 = {"6VJGxYRVGzkOFylAWqo", "TQDRStRjVTcp84EAqriMHD1W", "Y0YMWliml1c9R0RakThzWHnpZrTCSrBu", "hjS3TiOTsIfHHkhXtOFrFHFAaycKEbQY", "GvjOo5wC83Psjizly91M8Dr7lGNbFkes", "VFbjP0ZwmY6IK0pKGb7V8NSJj5u1SgyV", "T0F9FjreghpLds1JHOV1Zh8xCqpA0ysb", "F9ZBXP7xE9Rr53rKOaE"};
    public static final Pattern A02;
    public static final Map<String, Integer> A03;
    public static final Map<String, Integer> A04;
    public static final Pattern A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A06(List<C1324Jz> list, String str, K7 k72) {
        List<K8> listA0E = A0E(list, str, k72);
        for (int i10 = 0; i10 < listA0E.size(); i10++) {
            C1324Jz c1324Jz = listA0E.get(i10).A01;
            if (c1324Jz.A07() != -1) {
                return c1324Jz.A07();
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString A07(java.lang.String r11, java.lang.String r12, java.util.List<com.facebook.ads.redexgen.core.C1324Jz> r13) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A07(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static K3 A0A(C4J c4j, List<C1324Jz> list) {
        String strA0T = c4j.A0T();
        if (strA0T == null) {
            return null;
        }
        Matcher matcher = A02.matcher(strA0T);
        if (matcher.matches()) {
            return A0B(null, matcher, c4j, list);
        }
        String strA0T2 = c4j.A0T();
        if (strA0T2 == null) {
            return null;
        }
        Matcher matcher2 = A02.matcher(strA0T2);
        if (matcher2.matches()) {
            return A0B(strA0T.trim(), matcher2, c4j, list);
        }
        return null;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A00 = new byte[]{81, 0, 85, 68, 48, Utf8.REPLACEMENT_BYTE, 71, 83, 69, 86, 68, 48, Utf8.REPLACEMENT_BYTE, 71, 69, 0, 106, 118, 51, 20, 12, 27, 22, 19, 30, 90, 93, 12, 31, 8, 14, 19, 25, 27, 22, 93, 90, 12, 27, 22, 15, 31, 64, 90, Utf8.REPLACEMENT_BYTE, 24, 0, 23, 26, 31, 18, 86, 23, 26, 31, 17, 24, 27, 19, 24, 2, 86, 0, 23, 26, 3, 19, 76, 86, 82, 117, 109, 122, 119, 114, AbstractJsonLexerKt.TC_INVALID, 59, 122, 117, 120, 115, 116, 105, 59, 109, 122, 119, 110, 126, 33, 59, 46, 22, 20, 13, 13, 20, 19, 26, 93, 31, 28, 25, 93, 30, 8, 24, 93, 14, 24, 9, 9, 20, 19, 26, 71, 93, Utf8.REPLACEMENT_BYTE, 7, 5, 28, 28, 5, 2, 11, 76, 15, 25, 9, 76, 27, 5, 24, 4, 76, 14, 13, 8, 76, 4, 9, 13, 8, 9, 30, 86, 76, 53, 14, 11, 14, 15, 23, 14, 64, 3, 21, 5, 64, 19, 5, 20, 20, 9, 14, 7, 64, 10, 56, Utf8.REPLACEMENT_BYTE, 43, 41, 41, 30, 40, 56, 13, 60, 47, 46, 56, 47, 40, 83, 47, 93, 46, 123, 13, 121, 118, 14, 12, 121, 86, 14, 8, 8, 27, 121, 86, 14, 13, 121, 118, 14, 12, 13, 11, 15, 12, 26, 1, 81, 92, 89, 87, 94, 10, 6, 27, 45, 93, 88, 96, 93, 83, 94, 92, 84, 4, 1, 57, 4, 10, 19, 3, 119, 114, 74, 118, 108, 116, 123, 118, 115, 75, 120, 125, 121, 113, 7, 2, 58, 8, 4, 2, 0, 11, 17, 4, 39, 34, 26, 55, 32, 33, 64, 69, 125, 85, 74, 75, 86, 71, 91, 94, 102, 64, 92, 85, 85, 86, 78, 6, 8, 5, 7, 15, 15, 1, 24, 8, 7, 101, 99, 104, 114, 99, 116, 7, 29, 5, 10, 117, 126, 116, 65, 82, 0, 3, 13, 4, 5, 24, 3, 4, 13, 74, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 74, 15, 4, 30, 3, 30, 19, 80, 74, 77, 76, 90, 87, 88, 81, 69, 76, 79, 93, 107, 110, 106, 98, 65, 68, 67, 72, 35, 38, 33, 42, 98, 35, 42, 41, 59, 113, 116, 115, 120, 48, 111, 116, 122, 117, 105, 106, 116, 113, 105, 79, 67, 69, 71, 76, 86, 67, 5, 1, 12, 12, 4, 13, 53, 57, 40, 43, 29, 2, 30, 4, 25, 4, 2, 3, 73, 94, 95, 84, 79, 65, 78, 82, 37, 59, 69, 67, 7, 0, 23, 12, 86, 76, 95, 64, 0, 7, 18, 1, 7, 110, 124, 44, Utf8.REPLACEMENT_BYTE, 40, 46, 51, 57, 59, 54, 68, 91, 90, 71, 86, 52, 40, 33, 33, 34, 58};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0H(SpannableStringBuilder spannableStringBuilder, String str, K7 k72, List<K6> list, List<C1324Jz> list2) {
        int iA06 = A06(list2, str, k72);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, K6.A03());
        int length = 0;
        int i10 = k72.A00;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (A0C(TTAdConstant.VIDEO_COVER_URL_CODE, 2, 49).equals(((K6) arrayList.get(i11)).A01.A01)) {
                K6 k62 = (K6) arrayList.get(i11);
                int iA00 = A00(A06(list2, str, k62.A01), iA06, 1);
                int i12 = k62.A01.A00 - length;
                int i13 = k62.A00 - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i12, i13);
                spannableStringBuilder.delete(i12, i13);
                spannableStringBuilder.setSpan(new C2558nv(charSequenceSubSequence.toString(), iA00), i10, i12, 33);
                length += charSequenceSubSequence.length();
                i10 = i12;
            }
        }
    }

    static {
        A0F();
        A02 = Pattern.compile(A0C(187, 26, 35));
        A05 = Pattern.compile(A0C(3, 12, 106));
        HashMap map = new HashMap();
        map.put(A0C(440, 5, 53), Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put(A0C(349, 4, 1), Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put(A0C(300, 4, 98), Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put(A0C(405, 3, 61), Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put(A0C(445, 6, 75), Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put(A0C(380, 7, 36), Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put(A0C(289, 4, 107), Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put(A0C(284, 5, 98), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultColors = Collections.unmodifiableMap(map);
        A04 = defaultColors;
        HashMap map2 = new HashMap();
        map2.put(A0C(267, 8, 36), Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put(A0C(244, 7, 18), Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put(A0C(237, 7, 19), Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put(A0C(261, 6, 67), Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put(A0C(275, 9, 63), Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put(A0C(251, 10, 99), Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put(A0C(230, 7, 96), Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put(A0C(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 8, 57), Integer.valueOf(Color.rgb(0, 0, 0)));
        Map<String, Integer> defaultBackgroundColors = Collections.unmodifiableMap(map2);
        A03 = defaultBackgroundColors;
    }

    public static int A00(int i10, int i11, int i12) {
        if (i10 != -1) {
            return i10;
        }
        if (i11 != -1) {
            return i11;
        }
        if (i12 != -1) {
            return i12;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 2
            r6 = 1
            r5 = 0
            switch(r0) {
                case -1364013995: goto L80;
                case -1074341483: goto L5b;
                case 100571: goto L4a;
                case 109757538: goto L39;
                default: goto La;
            }
        La:
            r0 = -1
        Lb:
            switch(r0) {
                case 0: goto L93;
                case 1: goto L92;
                case 2: goto L92;
                case 3: goto L91;
                default: goto Le;
            }
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 69
            r1 = 22
            r0 = 29
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r3 = r0.toString()
            r2 = 167(0xa7, float:2.34E-43)
            r1 = 15
            r0 = 91
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L39:
            r2 = 425(0x1a9, float:5.96E-43)
            r1 = 5
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto Lb
        L4a:
            r2 = 304(0x130, float:4.26E-43)
            r1 = 3
            r0 = 22
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto La
            r0 = 3
            goto Lb
        L5b:
            r4 = 387(0x183, float:5.42E-43)
            r3 = 6
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.KB.A01
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L94
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.KB.A01
            java.lang.String r1 = "zDr3pXiReOD9C2voGl4pNyTssnTsthj2"
            r0 = 4
            r2[r0] = r1
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = A0C(r4, r3, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto La
            r0 = 2
            goto Lb
        L80:
            r2 = 294(0x126, float:4.12E-43)
            r1 = 6
            r0 = 0
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        L91:
            return r7
        L92:
            return r6
        L93:
            return r5
        L94:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A01(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A02(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r5 = 2
            r4 = 1
            r3 = 0
            switch(r0) {
                case -1842484672: goto L8f;
                case -1364013995: goto L7e;
                case -1276788989: goto L6c;
                case -1074341483: goto L5b;
                case 100571: goto L4a;
                case 109757538: goto L39;
                default: goto La;
            }
        La:
            r0 = -1
        Lb:
            switch(r0) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La3;
                case 3: goto La3;
                case 4: goto La2;
                case 5: goto La2;
                default: goto Le;
            }
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 69
            r1 = 22
            r0 = 29
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r3 = r0.toString()
            r2 = 167(0xa7, float:2.34E-43)
            r1 = 15
            r0 = 91
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L39:
            r2 = 425(0x1a9, float:5.96E-43)
            r1 = 5
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        L4a:
            r2 = 304(0x130, float:4.26E-43)
            r1 = 3
            r0 = 22
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 5
            goto Lb
        L5b:
            r2 = 387(0x183, float:5.42E-43)
            r1 = 6
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 3
            goto Lb
        L6c:
            r2 = 366(0x16e, float:5.13E-43)
            r1 = 10
            r0 = 27
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 4
            goto Lb
        L7e:
            r2 = 294(0x126, float:4.12E-43)
            r1 = 6
            r0 = 0
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 2
            goto Lb
        L8f:
            r2 = 357(0x165, float:5.0E-43)
            r1 = 9
            r0 = 73
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La
            r0 = 0
            goto Lb
        La2:
            return r5
        La3:
            return r4
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A02(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 5
            r6 = 3
            r5 = 4
            r3 = 1
            r4 = 2
            switch(r0) {
                case -1364013995: goto L8e;
                case -1074341483: goto L7d;
                case 100571: goto L6c;
                case 3317767: goto L5b;
                case 108511772: goto L4a;
                case 109757538: goto L39;
                default: goto Lc;
            }
        Lc:
            r0 = -1
        Ld:
            switch(r0) {
                case 0: goto La3;
                case 1: goto La2;
                case 2: goto La1;
                case 3: goto La1;
                case 4: goto La0;
                case 5: goto L9f;
                default: goto L10;
            }
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 44
            r1 = 25
            r0 = 112(0x70, float:1.57E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r3 = r0.toString()
            r2 = 167(0xa7, float:2.34E-43)
            r1 = 15
            r0 = 91
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            return r4
        L39:
            r2 = 425(0x1a9, float:5.96E-43)
            r1 = 5
            r0 = 117(0x75, float:1.64E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            goto Ld
        L4a:
            r2 = 408(0x198, float:5.72E-43)
            r1 = 5
            r0 = 32
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 5
            goto Ld
        L5b:
            r2 = 345(0x159, float:4.83E-43)
            r1 = 4
            r0 = 47
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        L6c:
            r2 = 304(0x130, float:4.26E-43)
            r1 = 3
            r0 = 22
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 4
            goto Ld
        L7d:
            r2 = 387(0x183, float:5.42E-43)
            r1 = 6
            r0 = 110(0x6e, float:1.54E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 3
            goto Ld
        L8e:
            r2 = 294(0x126, float:4.12E-43)
            r1 = 6
            r0 = 0
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lc
            r0 = 2
            goto Ld
        L9f:
            return r7
        La0:
            return r6
        La1:
            return r4
        La2:
            return r5
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A03(java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r3 = 1
            switch(r0) {
                case 3462: goto L48;
                case 3642: goto L37;
                default: goto L8;
            }
        L8:
            r0 = -1
        L9:
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L58;
                default: goto Lc;
            }
        Lc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 18
            r1 = 26
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2 = 167(0xa7, float:2.34E-43)
            r1 = 15
            r0 = 91
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L37:
            r2 = 413(0x19d, float:5.79E-43)
            r1 = 2
            r0 = 81
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L48:
            r2 = 376(0x178, float:5.27E-43)
            r1 = 2
            r0 = 0
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L58:
            r0 = 2
            return r0
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A04(java.lang.String):int");
    }

    public static int A05(String str, int i10) {
        int iIndexOf = str.indexOf(62, i10);
        if (iIndexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = iIndexOf + 1;
        return index2;
    }

    public static C3C A08(String str) {
        KA builder = new KA();
        A0L(str, builder);
        return builder.A07();
    }

    public static C2565o2 A09(CharSequence charSequence) {
        KA infoBuilder = new KA();
        infoBuilder.A0A = charSequence;
        return infoBuilder.A07().A0H();
    }

    public static K3 A0B(String str, Matcher matcher, C4J c4j, List<C1324Jz> list) {
        KA ka2 = new KA();
        try {
            ka2.A09 = KC.A01((String) C3M.A01(matcher.group(1)));
            ka2.A08 = KC.A01((String) C3M.A01(matcher.group(2)));
            A0L((String) C3M.A01(matcher.group(3)), ka2);
            StringBuilder sb2 = new StringBuilder();
            String strA0T = c4j.A0T();
            while (true) {
                boolean zIsEmpty = TextUtils.isEmpty(strA0T);
                if (A01[5].charAt(2) == 'h') {
                    throw new RuntimeException();
                }
                A01[1] = "2AwiW2AhFaTR";
                if (!zIsEmpty) {
                    if (sb2.length() > 0) {
                        sb2.append(A0C(0, 1, 93));
                    }
                    sb2.append(strA0T.trim());
                    strA0T = c4j.A0T();
                } else {
                    ka2.A0A = A07(str, sb2.toString(), list);
                    return ka2.A08();
                }
            }
        } catch (NumberFormatException unused) {
            AnonymousClass44.A07(A0C(167, 15, 91), A0C(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 30, 106) + matcher.group());
            return null;
        }
    }

    public static String A0D(String str) {
        String strTrim = str.trim();
        C3M.A07(!strTrim.isEmpty());
        return AbstractC09264a.A1P(strTrim, A0C(182, 5, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE))[0];
    }

    public static List<K8> A0E(List<C1324Jz> list, String str, K7 k72) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1324Jz c1324Jz = list.get(i10);
            int i11 = c1324Jz.A09(str, k72.A01, k72.A03, k72.A02);
            if (i11 > 0) {
                arrayList.add(new K8(i11, c1324Jz));
            }
        }
        Collections.sort(arrayList);
        if (A01[3].charAt(21) == 'Z') {
            throw new RuntimeException();
        }
        A01[3] = "10DtqaDx3Mjis7pngfRsmCfeCaw0vB2Q";
        return arrayList;
    }

    public static void A0G(SpannableStringBuilder spannableStringBuilder, C1324Jz c1324Jz, int i10, int i11) {
        if (c1324Jz == null) {
            return;
        }
        if (c1324Jz.A08() != -1) {
            C3H.A00(spannableStringBuilder, new StyleSpan(c1324Jz.A08()), i10, i11, 33);
        }
        if (c1324Jz.A0S()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        boolean zA0T = c1324Jz.A0T();
        if (A01[3].charAt(21) != 'Z') {
            A01[3] = "1YLI45HvZzSZe2yut9V0MUcCwjpGC5gE";
            if (zA0T) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (c1324Jz.A0R()) {
                C3H.A00(spannableStringBuilder, new ForegroundColorSpan(c1324Jz.A05()), i10, i11, 33);
            }
            if (c1324Jz.A0Q()) {
                C3H.A00(spannableStringBuilder, new BackgroundColorSpan(c1324Jz.A04()), i10, i11, 33);
            }
            if (c1324Jz.A0K() != null) {
                C3H.A00(spannableStringBuilder, new TypefaceSpan(c1324Jz.A0K()), i10, i11, 33);
            }
            switch (c1324Jz.A06()) {
                case 1:
                    C3H.A00(spannableStringBuilder, new AbsoluteSizeSpan((int) c1324Jz.A03(), true), i10, i11, 33);
                    break;
                case 2:
                    C3H.A00(spannableStringBuilder, new RelativeSizeSpan(c1324Jz.A03()), i10, i11, 33);
                    break;
                case 3:
                    C3H.A00(spannableStringBuilder, new RelativeSizeSpan(c1324Jz.A03() / 100.0f), i10, i11, 33);
                    break;
            }
            if (c1324Jz.A0P()) {
                spannableStringBuilder.setSpan(new C2559nw(), i10, i11, 33);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    public static void A0I(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i10, int i11) {
        for (String str : set) {
            boolean zContainsKey = A04.containsKey(str);
            if (A01[1].length() == 9) {
                throw new RuntimeException();
            }
            A01[5] = "YNIn8hUAyZDjSH3JhERqEXsouXgj93JS";
            if (zContainsKey) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(A04.get(str).intValue()), i10, i11, 33);
            } else {
                Map<String, Integer> map = A03;
                String className = A01[3];
                if (className.charAt(21) != 'Z') {
                    A01[3] = "z1JdxX10iLj514Di1TKQv9nGlpU0X7eV";
                    if (map.containsKey(str)) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i10, i11, 33);
                    }
                } else if (map.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(A03.get(str).intValue()), i10, i11, 33);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0J(java.lang.String r4, android.text.SpannableStringBuilder r5) {
        /*
            int r0 = r4.hashCode()
            switch(r0) {
                case 3309: goto L96;
                case 3464: goto Lc7;
                case 96708: goto L6a;
                case 3374865: goto L59;
                default: goto L7;
            }
        L7:
            r0 = -1
        L8:
            switch(r0) {
                case 0: goto L53;
                case 1: goto L4d;
                case 2: goto L47;
                case 3: goto L41;
                default: goto Lb;
            }
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 310(0x136, float:4.34E-43)
            r1 = 31
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r3 = r0.append(r4)
            r2 = 16
            r1 = 2
            r0 = 87
            java.lang.String r0 = A0C(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = r0.toString()
            r2 = 167(0xa7, float:2.34E-43)
            r1 = 15
            r0 = 91
            java.lang.String r0 = A0C(r2, r1, r0)
            com.facebook.ads.redexgen.core.AnonymousClass44.A07(r0, r3)
        L40:
            return
        L41:
            r0 = 38
            r5.append(r0)
            goto L40
        L47:
            r0 = 32
            r5.append(r0)
            goto L40
        L4d:
            r0 = 62
            r5.append(r0)
            goto L40
        L53:
            r0 = 60
            r5.append(r0)
            goto L40
        L59:
            r2 = 393(0x189, float:5.51E-43)
            r1 = 4
            r0 = 93
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L8
        L6a:
            r2 = 218(0xda, float:3.05E-43)
            r1 = 3
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r3 = r4.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.KB.A01
            r0 = 5
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.KB.A01
            java.lang.String r1 = "0e7ADHSVMy4QvuNOaRsoWPMCToECBQOy"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "0jhJvpoe9graGazv1ZIcpM6WWqxYTLD3"
            r0 = 6
            r2[r0] = r1
            if (r3 == 0) goto L7
            r0 = 3
            goto L8
        L96:
            r2 = 307(0x133, float:4.3E-43)
            r1 = 2
            r0 = 32
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r3 = r4.equals(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.KB.A01
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lbb
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lbb:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.KB.A01
            java.lang.String r1 = "Z6Yq6aysKH1bmBhKZFPJxCKyS02If"
            r0 = 1
            r2[r0] = r1
            if (r3 == 0) goto L7
            r0 = 1
            goto L8
        Lc7:
            r2 = 378(0x17a, float:5.3E-43)
            r1 = 2
            r0 = 27
            java.lang.String r0 = A0C(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A0J(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Incorrect condition in loop: B:43:0x00ee */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0 A[LOOP:0: B:42:0x00ea->B:44:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0K(java.lang.String r8, com.facebook.ads.redexgen.core.K7 r9, java.util.List<com.facebook.ads.redexgen.core.K6> r10, android.text.SpannableStringBuilder r11, java.util.List<com.facebook.ads.redexgen.core.C1324Jz> r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A0K(java.lang.String, com.facebook.ads.redexgen.X.K7, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static void A0L(String str, KA ka2) {
        String value = A0C(167, 15, 91);
        Matcher matcher = A05.matcher(str);
        while (matcher.find()) {
            Object objA01 = C3M.A01(matcher.group(1));
            String[] strArr = A01;
            if (strArr[2].charAt(10) == strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            A01[3] = "IuLRiWa83LmFflMS6GnqXQo4BkpBDAaM";
            String str2 = (String) objA01;
            String str3 = (String) C3M.A01(matcher.group(2));
            try {
                if (A0C(353, 4, 43).equals(str2)) {
                    A0M(str3, ka2);
                } else if (A0C(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 5, 54).equals(str2)) {
                    ka2.A06 = A03(str3);
                } else if (A0C(397, 8, 107).equals(str2)) {
                    A0N(str3, ka2);
                } else if (A0C(StatusLine.HTTP_MISDIRECTED_REQUEST, 4, 35).equals(str2)) {
                    ka2.A02 = KC.A00(str3);
                } else if (A0C(432, 8, 92).equals(str2)) {
                    ka2.A07 = A04(str3);
                } else {
                    AnonymousClass44.A07(value, A0C(147, 20, 102) + str2 + A0C(15, 1, 60) + str3);
                }
            } catch (NumberFormatException unused) {
                AnonymousClass44.A07(value, A0C(91, 26, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) + matcher.group());
            }
        }
    }

    public static void A0M(String str, KA ka2) throws NumberFormatException {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            ka2.A03 = A01(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith(A0C(2, 1, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE))) {
            ka2.A00 = KC.A00(str);
            ka2.A04 = 0;
        } else {
            int commaIndex2 = Integer.parseInt(str);
            ka2.A00 = commaIndex2;
            ka2.A04 = 1;
        }
    }

    public static void A0N(String str, KA ka2) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            int commaIndex = iIndexOf + 1;
            ka2.A05 = A02(str.substring(commaIndex));
            str = str.substring(0, iIndexOf);
        }
        ka2.A01 = KC.A00(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0O(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.KB.A0O(java.lang.String):boolean");
    }
}
