package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: assets/audience_network.dex */
public final class JD {
    public static byte[] A0M;
    public static String[] A0N = {"Kv7ovND2cx6KZ8R5Ezu4hDmX6dp2iMsF", "cMayWHospKRMpxKq", "mql622251rYxqhMKViyNV", "P8t7Cej7Eu84XMsYCsqfV8", "67bBuM9FR4N3pZNg9PG0C391ASiInkRu", "7F7KFi1R4GAbzTVO1b4Hjpai2dbfx6Jn", "z0mbdaejDP4Gp0uM4K5gZ", "ITsACGDJX7h4DVdWQgnQRCMTb7k"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0N[4].charAt(27) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "mD7XUZguBvkCVVbcE7WnAk49VpUUHB7Z";
            strArr[5] = "aw72WUKXBCYvXfs7FlFT1zjutV7r8SLl";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 88);
            i13++;
        }
    }

    public static void A04() {
        A0M = new byte[]{76, 119, 124, 97, 105, 124, 122, 109, 124, 125, 57, 115, 108, 106, 109, 112, AbstractJsonLexerKt.TC_INVALID, 112, 122, 120, 109, 112, 118, 119, 57, 111, 120, 117, 108, 124, 35, 57};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.JC A05() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.JD.A05():com.facebook.ads.redexgen.X.JC");
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        A0U = new int[]{A0O, A0Q, A0O, A0O, A0Q, A0O, A0O};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{A0O, A0O, A0O, A0O, A0O, A0Q, A0Q};
    }

    public JD() {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        return A01(i10, i11, i12, 0);
    }

    public static int A01(int i10, int i11, int i12, int i13) {
        int i14;
        C3M.A00(i10, 0, 4);
        C3M.A00(i11, 0, 4);
        C3M.A00(i12, 0, 4);
        C3M.A00(i13, 0, 4);
        switch (i13) {
            case 0:
            case 1:
                i14 = 255;
                break;
            case 2:
                i14 = 127;
                break;
            case 3:
                i14 = 0;
                break;
            default:
                i14 = 255;
                break;
        }
        int alpha = i10 > 1 ? 255 : 0;
        return Color.argb(i14, alpha, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.A06 != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.A06, length, 33);
            }
            if (this.A0C != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.A0C, length, 33);
            }
            if (this.A04 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A03), this.A04, length, 33);
            }
            if (this.A02 != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.A01), this.A02, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            SpannableStringBuilder spannableStringBuilder = this.A0K;
            int i10 = length - 1;
            if (A0N[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "mr7H3cYDyzqjeYfUxSkedoxDGLReqWZH";
            strArr[5] = "WB7R3soSd1e4KWjeo1umNLF0CWboeFMb";
            spannableStringBuilder.delete(i10, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        this.A0E = A0O;
        this.A03 = A0P;
        this.A01 = A0O;
    }

    public final void A09(char c10) {
        if (c10 == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            int i10 = this.A0C;
            if (A0N[7].length() == 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Up7OwHpaobzLA4EM9I6S8ympi8egU1xp";
            strArr[5] = "Jc7mAyZPvPSNSMBgW0QbkIOpFbTkWds1";
            if (i10 != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                if ((this.A0I && this.A0L.size() >= this.A0B) || this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c10);
        }
    }

    public final void A0A(int i10, int i11) {
        if (this.A0A != i10) {
            if (A0N[4].charAt(27) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[1] = "EQrEdXyc1aYcjFG7";
            strArr[3] = "uymaty7PipZZJPSz7splP0";
            A09('\n');
        }
        this.A0A = i10;
    }

    public final void A0B(int i10, int i11, int i12) {
        if (this.A04 != -1 && this.A03 != i10) {
            this.A0K.setSpan(new ForegroundColorSpan(this.A03), this.A04, this.A0K.length(), 33);
        }
        if (i10 != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i10;
        }
        int i13 = this.A02;
        String[] strArr = A0N;
        if (strArr[1].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0N;
        strArr2[6] = "zeXFeOtKIORA1zWkRmXlR";
        strArr2[2] = "fnzPNusOGbFXzxR4hah6k";
        if (i13 != -1 && this.A01 != i11) {
            this.A0K.setSpan(new BackgroundColorSpan(this.A01), this.A02, this.A0K.length(), 33);
        }
        if (i11 != A0O) {
            this.A02 = this.A0K.length();
            this.A01 = i11;
        }
    }

    public final void A0C(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
        if (this.A06 != -1) {
            if (!z10) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z10) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C != -1) {
            if (!z11) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
                return;
            }
            return;
        }
        if (!z11) {
            return;
        }
        this.A0C = this.A0K.length();
    }

    public final void A0D(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.A0E = i10;
        this.A07 = i15;
    }

    public final void A0E(boolean z10) {
        this.A0J = z10;
    }

    public final void A0F(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.A0G = true;
        this.A0J = z10;
        this.A0I = z11;
        this.A09 = i10;
        this.A0H = z13;
        this.A0D = i11;
        this.A05 = i12;
        this.A00 = i15;
        if (this.A0B != i13 + 1) {
            this.A0B = i13 + 1;
            while (true) {
                if ((!z11 || this.A0L.size() < this.A0B) && this.A0L.size() < 15) {
                    break;
                } else {
                    this.A0L.remove(0);
                }
            }
        }
        if (i16 != 0 && this.A0F != i16) {
            this.A0F = i16;
            int i18 = i16 - 1;
            A0D(A0U[i18], A0Q, A0Y[i18], 0, A0W[i18], A0X[i18], A0V[i18]);
        }
        if (i17 != 0 && this.A08 != i17) {
            this.A08 = i17;
            int i19 = i17 - 1;
            A0C(0, 1, 1, false, false, A0S[i19], A0T[i19]);
            A0B(A0P, A0R[i19], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        if (A0G()) {
            List<SpannableString> list = this.A0L;
            String[] strArr = A0N;
            if (strArr[0].charAt(2) != strArr[5].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "bd5mzLDHwmkoJbeiVaa7u";
            strArr2[2] = "zXPgjXTtuY4PD8las8bey";
            if (!list.isEmpty() || this.A0K.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
