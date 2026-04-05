package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.i.hp;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class hm extends hp {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private List<Class> f2522 = new ArrayList();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private int f2523;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private boolean f2524;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Class f2525;

    public hm() {
        super.mo2596();
        this.f2525 = null;
        this.f2523 = 0;
        this.f2524 = true;
        this.f2522.clear();
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final List<Class> m2592() {
        return this.f2522;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final Class m2593() {
        return this.f2525;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final int m2594() {
        return this.f2523;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m2595() {
        return this.f2524;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m2597(Class cls) {
        this.f2525 = cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hp
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void mo2596() {
        super.mo2596();
        this.f2525 = null;
        this.f2523 = 0;
        this.f2524 = true;
        this.f2522.clear();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends hp.c implements ci {

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f2526 = 1;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2527 = 0;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static char f2528 = 37805;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2529 = 20034;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static char f2530 = 41563;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static char f2531 = 24575;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private hm f2532 = new hm();

        /* renamed from: ﻐ, reason: contains not printable characters */
        private e m2599(boolean z10) {
            int i10 = f2527 + 81;
            f2526 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2532.f2524 = z10;
                throw null;
            }
            this.f2532.f2524 = z10;
            f2526 = (f2527 + 23) % 128;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private e m2601(int i10) {
            int i11 = f2526 + 47;
            f2527 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f2532.f2523 = i10;
                throw null;
            }
            this.f2532.f2523 = i10;
            f2527 = (f2526 + 107) % 128;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final e m2605(int i10) {
            hm hmVar;
            int i11;
            int i12 = f2527;
            int i13 = i12 + 47;
            f2526 = i13 % 128;
            if (i13 % 2 == 0) {
                hmVar = this.f2532;
                i11 = i10 ^ hmVar.f2556;
            } else {
                hmVar = this.f2532;
                i11 = i10 | hmVar.f2556;
            }
            hmVar.f2556 = i11;
            int i14 = i12 + 3;
            f2526 = i14 % 128;
            if (i14 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final e m2607(Class cls) {
            int i10 = f2527 + 11;
            f2526 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2532.f2525 = cls;
                throw null;
            }
            this.f2532.f2525 = cls;
            int i11 = f2526 + 69;
            f2527 = i11 % 128;
            if (i11 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
        @Override // com.ironsource.adqualitysdk.sdk.i.ci
        /* renamed from: ﾒ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object mo1170(java.lang.String r10, java.util.List<java.lang.Object> r11, com.ironsource.adqualitysdk.sdk.i.ch r12) {
            /*
                Method dump skipped, instructions count: 478
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hm.e.mo1170(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private e m2600(boolean z10, int i10) {
            int i11 = f2526 + 111;
            int i12 = i11 % 128;
            f2527 = i12;
            if (i11 % 2 != 0) {
                hm hmVar = this.f2532;
                hmVar.f2553 = z10;
                hmVar.f2554 = i10;
                int i13 = 12 / 0;
            } else {
                hm hmVar2 = this.f2532;
                hmVar2.f2553 = z10;
                hmVar2.f2554 = i10;
            }
            f2526 = (i12 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private e m2598(Class cls) {
            int i10 = f2526 + 77;
            f2527 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f2532.f2522.add(cls);
                f2526 = (f2527 + 69) % 128;
                return this;
            }
            this.f2532.f2522.add(cls);
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final e m2606(int i10) {
            int i11 = (f2527 + 77) % 128;
            f2526 = i11;
            hm hmVar = this.f2532;
            hmVar.f2555 = i10 | hmVar.f2555;
            int i12 = i11 + 9;
            f2527 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 43 / 0;
            }
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private e m2602() {
            f2526 = (f2527 + 35) % 128;
            this.f2532.mo2596();
            int i10 = f2526 + 1;
            f2527 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 25 / 0;
            }
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final hm m2604() {
            int i10 = f2527 + 101;
            f2526 = i10 % 128;
            if (i10 % 2 != 0) {
                return this.f2532;
            }
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m2603(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (o.f3166) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    o.f3167 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i11 = o.f3167;
                        if (i11 < cArr.length) {
                            cArr3[0] = cArr[i11];
                            cArr3[1] = cArr[i11 + 1];
                            int i12 = 58224;
                            for (int i13 = 0; i13 < 16; i13++) {
                                char c10 = cArr3[1];
                                char c11 = cArr3[0];
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2529)) ^ ((c11 >>> 5) + f2531)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2530) ^ ((c12 + i12) ^ ((c12 << 4) + f2528))));
                                i12 -= 40503;
                            }
                            int i14 = o.f3167;
                            cArr2[i14] = cArr3[0];
                            cArr2[i14 + 1] = cArr3[1];
                            o.f3167 = i14 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }
}
