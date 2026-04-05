package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hp;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ht extends hp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private Class f2561;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private int f2562;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private List<Class> f2563;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private List<Class> f2564 = new ArrayList();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private boolean f2565;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private int f2566;

    public ht() {
        mo2596();
    }

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int m2651() {
        return this.f2562;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m2652() {
        return this.f2564;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final int m2653() {
        return this.f2566;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final List<Class> m2654() {
        return this.f2563;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Class m2655() {
        return this.f2561;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2656() {
        return this.f2565;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends hp.c implements ci {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static short[] f2567 = null;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2569 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2570 = 1;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2572 = -1690345766;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int f2573 = 1430619798;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2574 = 93;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ht f2575 = new ht();

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static byte[] f2571 = {-10, 5, 35, -41, 27, -17, -11, -9, 37, -26, -4, -3, 1, 15, 19, -34, 15, -14, 14, -11, -9, 37, -31, 1, 13, -15, 15, -8, 12, -17, 17, 17, -36, 15, -14, 1, 13, -15, 15, -8, 12, -17, 17, 17, -22, 23, -35, 13, 3, -11, -8, 39, -38, 15, -14, 1, -17, 9, 9, -11, 37, -38, 27, -31, 1, 13, -4, 3, -3, 5, -11, 34, -23, 0, 3, 1, -17, 9, 9, -21, 51, -42, 27, -31, 1, 13, -4, 3, -3, 5, -11, 34, -23, 0, 3, 0, 18, -11, 9, -15, 13, -11, -5, 34, -27, 37, -31, 5, -15, 17, -4, -14, 0, 0, 0, 0, 0, 0};

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static long f2568 = 774576766549373894L;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private e m2658(int i10) {
            f2569 = (f2570 + 13) % 128;
            this.f2575.f2566 = i10;
            int i11 = f2570 + 99;
            f2569 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private e m2660(int i10) {
            ht htVar;
            int i11;
            int i12 = f2569 + 55;
            f2570 = i12 % 128;
            if (i12 % 2 == 0) {
                htVar = this.f2575;
                i11 = i10 ^ htVar.f2555;
            } else {
                htVar = this.f2575;
                i11 = i10 | htVar.f2555;
            }
            htVar.f2555 = i11;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private e m2664(boolean z10) {
            int i10 = f2569 + 31;
            f2570 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f2575.f2565 = z10;
                return this;
            }
            this.f2575.f2565 = z10;
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private e m2665(int i10) {
            int i11 = f2569;
            int i12 = i11 + 81;
            f2570 = i12 % 128;
            int i13 = i12 % 2;
            ht htVar = this.f2575;
            htVar.f2556 = i10 | htVar.f2556;
            f2570 = (i11 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private e m2668(Class cls) {
            int i10 = f2570 + 57;
            f2569 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2575.f2561 = cls;
                return this;
            }
            this.f2575.f2561 = cls;
            throw null;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private e m2661(boolean z10, int i10) {
            int i11 = f2569 + 85;
            f2570 = i11 % 128;
            if (i11 % 2 != 0) {
                ht htVar = this.f2575;
                htVar.f2553 = z10;
                htVar.f2554 = i10;
                return this;
            }
            ht htVar2 = this.f2575;
            htVar2.f2553 = z10;
            htVar2.f2554 = i10;
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private e m2659(Class cls) {
            f2570 = (f2569 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
            this.f2575.f2564.add(cls);
            f2569 = (f2570 + 65) % 128;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private e m2666(List<Class> list) {
            int i10 = f2570 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2569 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2575.f2563 = list;
                f2569 = (f2570 + 113) % 128;
                return this;
            }
            this.f2575.f2563 = list;
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private e m2667(int i10) {
            f2569 = (f2570 + 57) % 128;
            this.f2575.f2562 = i10;
            f2569 = (f2570 + 97) % 128;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private e m2657() {
            f2570 = (f2569 + 41) % 128;
            this.f2575.mo2596();
            int i10 = f2569 + 41;
            f2570 = i10 % 128;
            if (i10 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0122, code lost:
        
            if ((r1 % 2) != 0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0134, code lost:
        
            return m2665(((java.lang.Integer) com.ironsource.adqualitysdk.sdk.i.da.m2180(r18, 0, java.lang.Integer.class)).intValue());
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01ed, code lost:
        
            return m2667(((java.lang.Integer) com.ironsource.adqualitysdk.sdk.i.da.m2180(r18, 0, java.lang.Integer.class)).intValue());
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* renamed from: ﾒ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo1170(java.lang.String r17, java.util.List<java.lang.Object> r18, com.ironsource.adqualitysdk.sdk.i.ch r19) {
            /*
                Method dump skipped, instructions count: 700
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ht.e.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private ht m2662() {
            int i10 = f2569 + 1;
            int i11 = i10 % 128;
            f2570 = i11;
            if (i10 % 2 == 0) {
                throw null;
            }
            ht htVar = this.f2575;
            int i12 = i11 + 35;
            f2569 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 21 / 0;
            }
            return htVar;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m2663(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (n.f3160) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2574;
                    int i14 = i10 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2571;
                        if (bArr != null) {
                            i14 = (byte) (bArr[f2572 + i11] + i13);
                        } else {
                            i14 = (short) (f2567[f2572 + i11] + i13);
                        }
                    }
                    if (i14 > 0) {
                        n.f3165 = ((i11 + i14) - 2) + f2572 + i15;
                        n.f3163 = b10;
                        char c10 = (char) (i12 + f2573);
                        n.f3162 = c10;
                        sb2.append(c10);
                        n.f3161 = n.f3162;
                        n.f3164 = 1;
                        while (n.f3164 < i14) {
                            byte[] bArr2 = f2571;
                            if (bArr2 != null) {
                                int i16 = n.f3165;
                                n.f3165 = i16 - 1;
                                n.f3162 = (char) (n.f3161 + (((byte) (bArr2[i16] + s10)) ^ n.f3163));
                            } else {
                                short[] sArr = f2567;
                                int i17 = n.f3165;
                                n.f3165 = i17 - 1;
                                n.f3162 = (char) (n.f3161 + (((short) (sArr[i17] + s10)) ^ n.f3163));
                            }
                            sb2.append(n.f3162);
                            n.f3161 = n.f3162;
                            n.f3164++;
                        }
                    }
                    string = sb2.toString();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return string;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m2669(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (j.f2852) {
                try {
                    j.f2850 = i10;
                    char[] cArr2 = new char[cArr.length];
                    j.f2851 = 0;
                    while (true) {
                        int i11 = j.f2851;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f2568);
                            j.f2851++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* renamed from: ﻐ */
    public final void mo2596() {
        super.mo2596();
        this.f2561 = null;
        this.f2566 = 0;
        this.f2565 = true;
        this.f2564.clear();
        this.f2563 = null;
        this.f2562 = -1;
    }
}
