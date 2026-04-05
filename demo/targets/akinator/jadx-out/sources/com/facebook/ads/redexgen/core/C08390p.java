package com.facebook.ads.redexgen.core;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.0p, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08390p extends AbstractC10147k {
    public static byte[] A05;
    public static String[] A06 = {"W2LX5ghCjNUdHPD6UOG9gNVP2r8Jjr9N", "hy0Kd51hxMRklx2U40MO6uTjDebxbFFc", "3rXKYQ25IDS9XLMelMDoz8fDuc1jWejt", "VHZF6nyXCVj1GWlzSFxOxU8Mk9", "1hZxQPwvp7yuSjm13xBtOFGqAv7wvaBL", "2txr67moghbeiUbFZCBGyiXHK8tBuFWn", "gHf8B0vtrS2LcJp", "q573XCdkPfkFHQHQX29TvMro8DPY3qfe"};
    public static final Pattern A07;
    public float A00;
    public float A01;
    public Map<String, C1299Ja> A02;
    public final JV A03;
    public final boolean A04;

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A05 = new byte[]{85, 39, 48, 53, 39, 83, 107, 36, 38, 53, 38, 48, 39, 83, 107, 36, 38, 53, 39, 83, 107, 36, 38, 84, 53, 33, 82, 39, 83, 107, 36, 38, 75, 35, 52, 25, 17, 28, 31, 23, 5, 21, 74, 75, 98, AbstractJsonLexerKt.TC_INVALID, 96, 108, 121, 55, 101, 93, 95, 70, 70, 95, 88, 81, 22, 17, 101, 66, 79, 90, 83, 12, 17, 22, 90, 95, 88, 83, 22, 84, 83, 80, 89, 68, 83, 22, 17, 112, 89, 68, 91, 87, 66, 12, 17, 22, 90, 95, 88, 83, 12, 22, 37, 29, 31, 6, 6, 31, 24, 17, 86, 18, 31, 23, 26, 25, 17, 3, 19, 86, 26, 31, 24, 19, 86, 20, 19, 16, 25, 4, 19, 86, 21, 25, 27, 6, 26, 19, 2, 19, 86, 16, 25, 4, 27, 23, 2, 76, 86, 53, 13, 15, 22, 22, 15, 8, 1, 70, 2, 15, 7, 10, 9, 1, 19, 3, 70, 10, 15, 8, 3, 70, 17, 15, 18, 14, 70, 0, 3, 17, 3, 20, 70, 5, 9, 10, 19, 11, 8, 21, 70, 18, 14, 7, 8, 70, 0, 9, 20, 11, 7, 18, 92, 70, 66, 122, 120, 97, 97, 120, AbstractJsonLexerKt.TC_INVALID, 118, 49, 120, AbstractJsonLexerKt.TC_INVALID, 103, 112, 125, 120, 117, 49, 101, 120, 124, 120, AbstractJsonLexerKt.TC_INVALID, 118, 43, 49, 101, 69, 87, 114, 83, 85, 89, 82, 83, 68, 36, 3, 14, 27, 18, 77, 45, 22, 19, 22, 23, 15, 22, 88, 25, 20, 17, 31, 22, 21, 29, 22, 12, 66, 88, 40, 54, 5, 22, 29, 7, 0, 46, 94, 86, 102, 119, 108, 117, 113, 37, 76, 107, 99, 106, 88, 13, 0, 98, 118, 5, 34, 47, 58, 51, 37, 11, 124, 113, 19, 7, 116, 83, 94, 75, 66, 84, 122, 7, 70, 85, 66, 7, 73, 72, 83, 7, 84, 82, 87, 87, 72, 85, 83, 66, 67, 75, 70, 36, 59, 48, 67, 100, 105, 124, 117, 99, 77, 92, 78, 5, 49, 108, 94, 5, 25, 20, 12, 7, 16, 6, 13, 94, 66, 79, 87, 92, 75, 93, 87, -72, -38};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0D(String str, JV jv2, List<List<C2565o2>> list, List<Long> list2) {
        String strA07 = A07(34, 9, 116);
        C3M.A07(str.startsWith(strA07));
        String[] strArrSplit = str.substring(strA07.length()).split(A07(32, 1, 99), jv2.A01);
        int length = strArrSplit.length;
        int i10 = jv2.A01;
        String strA072 = A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50);
        if (length != i10) {
            AnonymousClass44.A07(strA072, A07(143, 55, 98) + str);
            return;
        }
        long jA04 = A04(strArrSplit[jv2.A02]);
        String strA073 = A07(198, 25, 21);
        if (jA04 == C.TIME_UNSET) {
            AnonymousClass44.A07(strA072, strA073 + str);
            return;
        }
        long jA042 = A04(strArrSplit[jv2.A00]);
        if (jA042 == C.TIME_UNSET) {
            AnonymousClass44.A07(strA072, strA073 + str);
            return;
        }
        C1299Ja c1299Ja = (this.A02 == null || jv2.A03 == -1) ? null : this.A02.get(strArrSplit[jv2.A03].trim());
        String str2 = strArrSplit[jv2.A04];
        JX jxA02 = JX.A02(str2);
        String strA04 = JX.A04(str2);
        String strA074 = A07(331, 2, 4);
        String strA075 = A07(0, 1, 91);
        C2565o2 c2565o2A06 = A06(strA04.replace(strA074, strA075).replace(A07(335, 2, 52), strA075).replace(A07(333, 2, 93), A07(353, 2, 126)), c1299Ja, jxA02, this.A01, this.A00);
        int iA03 = A03(jA042, list2, list);
        for (int iA032 = A03(jA04, list2, list); iA032 < iA03; iA032++) {
            list.get(iA032).add(c2565o2A06);
        }
    }

    static {
        A09();
        A07 = Pattern.compile(A07(1, 31, 11));
    }

    public C08390p() {
        this(null);
    }

    public C08390p(List<byte[]> list) {
        super(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50));
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.A04 = true;
            String strA0q = AbstractC09264a.A0q(list.get(0));
            String formatLine = A07(43, 7, 9);
            C3M.A07(strA0q.startsWith(formatLine));
            this.A03 = (JV) C3M.A01(JV.A00(strA0q));
            A0A(new C4J(list.get(1)));
            return;
        }
        this.A04 = false;
        this.A03 = null;
    }

    public static float A00(int i10) {
        switch (i10) {
            case 0:
                return 0.05f;
            case 1:
                return 0.5f;
            case 2:
                return 0.95f;
            default:
                return -3.4028235E38f;
        }
    }

    public static int A01(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AnonymousClass44.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                A06[6] = "Sg07jKGUv12uLKgMKKFA3fI9zPLxcTEi";
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    public static int A02(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                AnonymousClass44.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "bBVjASvxGIVEucqGKWBeREj1nHP5tR7K";
                strArr[4] = "afA0CT9VteApb4cGitBpBAxXonSmRtRK";
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    public static int A03(long j10, List<Long> list, List<List<C2565o2>> list2) {
        ArrayList arrayList;
        int i10 = 0;
        int insertionIndex = list.size();
        int i11 = insertionIndex - 1;
        while (true) {
            if (i11 < 0) {
                break;
            }
            long jLongValue = list.get(i11).longValue();
            int i12 = A06[7].charAt(28);
            if (i12 == 116) {
                throw new RuntimeException();
            }
            A06[7] = "L6yhcoI2CoUL0EEbj8PtMmDYbUY1DBiP";
            if (jLongValue == j10) {
                return i11;
            }
            if (list.get(i11).longValue() < j10) {
                i10 = i11 + 1;
                break;
            }
            i11--;
        }
        list.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList = new ArrayList();
        } else {
            int insertionIndex2 = i10 - 1;
            arrayList = new ArrayList(list2.get(insertionIndex2));
        }
        list2.add(i10, arrayList);
        return i10;
    }

    public static long A04(String str) {
        Matcher matcher = A07.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) AbstractC09264a.A0f(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) AbstractC09264a.A0f(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) AbstractC09264a.A0f(matcher.group(3))) * 1000000) + (Long.parseLong((String) AbstractC09264a.A0f(matcher.group(4))) * 10000);
    }

    public static Layout.Alignment A05(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                AnonymousClass44.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(239, 19, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE) + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public static C2565o2 A06(String str, C1299Ja c1299Ja, JX jx, float f10, float f11) {
        int i10;
        SpannableString spannableString = new SpannableString(str);
        C3C c3cA0G = new C3C().A0G(spannableString);
        if (c1299Ja != null) {
            if (c1299Ja.A04 != null) {
                spannableString.setSpan(new ForegroundColorSpan(c1299Ja.A04.intValue()), 0, spannableString.length(), 33);
            }
            if (c1299Ja.A02 == 3 && c1299Ja.A03 != null) {
                spannableString.setSpan(new BackgroundColorSpan(c1299Ja.A03.intValue()), 0, spannableString.length(), 33);
            }
            if (c1299Ja.A00 != -3.4028235E38f) {
                if (A06[3].length() != 26) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "hamZaHHK5iJw0vPowwB4Xi3W6GQULYkl";
                strArr[4] = "AtQHcqF1nJuVU9oQ1sBsNKUnqzSBt8ub";
                if (f11 != -3.4028235E38f) {
                    c3cA0G.A08(c1299Ja.A00 / f11, 1);
                }
            }
            if (c1299Ja.A06 && c1299Ja.A07) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (c1299Ja.A06) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (c1299Ja.A07) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (c1299Ja.A09) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (c1299Ja.A08) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = jx.A00;
        if (A06[6].length() == 19) {
            throw new RuntimeException();
        }
        A06[7] = "i2mc5u7bs2HiiqvdNfcyeR2hNUTbHa8c";
        if (i11 != -1) {
            i10 = jx.A00;
        } else if (c1299Ja != null) {
            i10 = c1299Ja.A01;
        } else {
            i10 = -1;
        }
        C3C cue = c3cA0G.A0F(A05(i10));
        cue.A0A(A02(i10)).A09(A01(i10));
        if (jx.A01 != null && f11 != -3.4028235E38f && f10 != -3.4028235E38f) {
            c3cA0G.A04(jx.A01.x / f10);
            c3cA0G.A07(jx.A01.y / f11, 0);
        } else {
            c3cA0G.A04(A00(c3cA0G.A01()));
            c3cA0G.A07(A00(c3cA0G.A00()), 0);
        }
        return c3cA0G.A0H();
    }

    public static Map<String, C1299Ja> A08(C4J c4j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JW jwA00 = null;
        while (true) {
            String strA0T = c4j.A0T();
            if (strA0T == null || (c4j.A07() != 0 && c4j.A0B() == 91)) {
                break;
            }
            if (strA0T.startsWith(A07(43, 7, 9))) {
                jwA00 = JW.A00(strA0T);
            } else if (strA0T.startsWith(A07(233, 6, 115))) {
                if (jwA00 == null) {
                    String currentLine = A07(50, 46, 50) + strA0T;
                    AnonymousClass44.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), currentLine);
                } else {
                    C1299Ja c1299JaA04 = C1299Ja.A04(strA0T, jwA00);
                    if (c1299JaA04 != null) {
                        linkedHashMap.put(c1299JaA04.A05, c1299JaA04);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void A0A(C4J c4j) {
        while (true) {
            String strA0T = c4j.A0T();
            if (strA0T != null) {
                if (A07(266, 13, 1).equalsIgnoreCase(strA0T)) {
                    A0B(c4j);
                } else if (A07(Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 12, 20).equalsIgnoreCase(strA0T)) {
                    this.A02 = A08(c4j);
                } else if (A07(279, 11, 82).equalsIgnoreCase(strA0T)) {
                    AnonymousClass44.A06(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(290, 29, 35));
                } else if (A07(258, 8, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE).equalsIgnoreCase(strA0T)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0B(com.facebook.ads.redexgen.core.C4J r9) {
        /*
            r8 = this;
        L0:
            java.lang.String r3 = r9.A0T()
            if (r3 == 0) goto Lcc
            int r0 = r9.A07()
            if (r0 == 0) goto L14
            int r1 = r9.A0B()
            r0 = 91
            if (r1 == r0) goto Lcc
        L14:
            r2 = 33
            r1 = 1
            r0 = 29
            java.lang.String r0 = A07(r2, r1, r0)
            java.lang.String[] r3 = r3.split(r0)
            int r1 = r3.length
            r0 = 2
            if (r1 == r0) goto L26
            goto L0
        L26:
            r6 = 0
            r0 = r3[r6]
            java.lang.String r0 = r0.trim()
            java.lang.String r5 = com.facebook.ads.redexgen.core.AbstractC2244iY.A01(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C08390p.A06
            r0 = 7
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto Lc6
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C08390p.A06
            java.lang.String r1 = "TxjPtR6Me2tOCH56RvBuXVxOpTFPkhKs"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "CGC80sv4xmOos6ad3yBESqJRjeXwJGgE"
            r0 = 4
            r2[r0] = r1
            int r0 = r5.hashCode()
            r4 = 1
            switch(r0) {
                case 1879649548: goto L99;
                case 1879649549: goto L59;
                default: goto L54;
            }
        L54:
            r6 = -1
        L55:
            switch(r6) {
                case 0: goto Lb8;
                case 1: goto Laa;
                default: goto L58;
            }
        L58:
            goto L0
        L59:
            r7 = 345(0x159, float:4.83E-43)
            r6 = 8
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C08390p.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 2
            char r1 = r1.charAt(r0)
            r0 = 76
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C08390p.A06
            java.lang.String r1 = "y7TEYh3wOWaLWgkmzZBlA5JQj6rjOZZg"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "3gq1Vhf6xja9YBkNvRBFSeYMsj86kNRf"
            r0 = 4
            r2[r0] = r1
            r0 = 31
            java.lang.String r0 = A07(r7, r6, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L54
        L83:
            r6 = 1
            goto L55
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C08390p.A06
            java.lang.String r1 = "57knmpqjR0Ls81goizN6npBH6l"
            r0 = 3
            r2[r0] = r1
            r0 = 42
            java.lang.String r0 = A07(r7, r6, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L54
            goto L83
        L99:
            r2 = 337(0x151, float:4.72E-43)
            r1 = 8
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A07(r2, r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L54
            goto L55
        Laa:
            r0 = r3[r4]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r8.A00 = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        Lb8:
            r0 = r3[r4]     // Catch: java.lang.NumberFormatException -> L0
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L0
            r8.A01 = r0     // Catch: java.lang.NumberFormatException -> L0
            goto L0
        Lc6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C08390p.A0B(com.facebook.ads.redexgen.X.4J):void");
    }

    private void A0C(C4J c4j, List<List<C2565o2>> list, List<Long> list2) {
        JV jvA00 = this.A04 ? this.A03 : null;
        while (true) {
            String strA0T = c4j.A0T();
            if (strA0T != null) {
                if (strA0T.startsWith(A07(43, 7, 9))) {
                    jvA00 = JV.A00(strA0T);
                } else if (strA0T.startsWith(A07(34, 9, 116))) {
                    if (jvA00 == null) {
                        AnonymousClass44.A07(A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 10, 50), A07(96, 47, 114) + strA0T);
                    } else {
                        A0D(strA0T, jvA00, list, list2);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC10147k
    public final J7 A0g(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4J c4j = new C4J(bArr, i10);
        if (!this.A04) {
            A0A(c4j);
        }
        A0C(c4j, arrayList, arrayList2);
        return new C2338k8(arrayList, arrayList2);
    }
}
