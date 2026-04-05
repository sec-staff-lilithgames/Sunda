package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class iy {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2823 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f2824 = -4250919849605584923L;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2825 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2826 = false;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final iv f2827;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface d {
        /* renamed from: ﻐ */
        ir mo2898();
    }

    public iy(Context context) {
        this.f2827 = new iv(context.getApplicationContext());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2891(iy iyVar, iz izVar, d dVar) {
        int i10 = f2825 + 27;
        f2823 = i10 % 128;
        int i11 = i10 % 2;
        iyVar.m2892(izVar, dVar);
        if (i11 != 0) {
            int i12 = 13 / 0;
        }
        f2825 = (f2823 + 111) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m2892(final iz izVar, final d dVar) {
        int i10 = f2823 + 1;
        f2825 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (!this.f2826) {
            jv.m3091(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5

                /* renamed from: ﮐ, reason: contains not printable characters */
                private static int f2830 = 1;

                /* renamed from: ﱟ, reason: contains not printable characters */
                private static char f2831 = 15585;

                /* renamed from: ﱡ, reason: contains not printable characters */
                private static char f2832 = 20229;

                /* renamed from: ﻏ, reason: contains not printable characters */
                private static int f2833 = 0;

                /* renamed from: ﻐ, reason: contains not printable characters */
                private static char f2834 = 27721;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private static char f2835 = 11593;

                /* renamed from: ﻛ, reason: contains not printable characters */
                private void m2899(final iz izVar2, final d dVar2) {
                    iy.m2893(iy.this).m2854(new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.iq
                        /* renamed from: ﻛ */
                        public final void mo765() {
                            iy.m2893(iy.this).m2857(this);
                            iy.m2891(iy.this, izVar2, dVar2);
                        }
                    });
                    int i11 = f2830 + 81;
                    f2833 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 72 / 0;
                    }
                }

                /* renamed from: ｋ, reason: contains not printable characters */
                private static String m2900(String str, int i11) {
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
                                int i12 = o.f3167;
                                if (i12 < cArr.length) {
                                    cArr3[0] = cArr[i12];
                                    cArr3[1] = cArr[i12 + 1];
                                    int i13 = 58224;
                                    for (int i14 = 0; i14 < 16; i14++) {
                                        char c10 = cArr3[1];
                                        char c11 = cArr3[0];
                                        char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + f2831)) ^ ((c11 >>> 5) + f2832)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2834) ^ ((c12 + i13) ^ ((c12 << 4) + f2835))));
                                        i13 -= 40503;
                                    }
                                    int i15 = o.f3167;
                                    cArr2[i15] = cArr3[0];
                                    cArr2[i15 + 1] = cArr3[1];
                                    o.f3167 = i15 + 2;
                                } else {
                                    str2 = new String(cArr2, 0, i11);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str2;
                }

                /* renamed from: ﾇ, reason: contains not printable characters */
                private void m2901(final iz izVar2, d dVar2) {
                    int i11 = f2830 + 101;
                    f2833 = i11 % 128;
                    if (i11 % 2 != 0) {
                        iy.m2893(iy.this).m2855();
                        throw null;
                    }
                    if (!iy.m2893(iy.this).m2855()) {
                        m2899(izVar2, dVar2);
                        int i12 = f2833 + 115;
                        f2830 = i12 % 128;
                        if (i12 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    try {
                        final ir irVarMo2898 = dVar2.mo2898();
                        if (irVarMo2898 == null) {
                            p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.2

                                /* renamed from: ﱡ, reason: contains not printable characters */
                                private static int f2842 = 1;

                                /* renamed from: ﻛ, reason: contains not printable characters */
                                private static char[] f2843 = {61471, 7704, 11378, 15093, 18565, 22163, 25905, 29556, 33106, 44937, 48619, 52271, 55884, 59486, 63160, 1259, 4807, 8501, 20278, 23882, 27526, 31139, 34849, 38421, 42065, 45755, 49387, 61150, 64860, 2920, 6581, 10125, 13789, 17527, 20994, 24668, 36514, 40181, 43719, 47363, 51045, 54705, 58266, 61853, '8', 11891, 15435, 19095, 22696, 26261, 30022, 33589, 37364, 49036, 52672, 56417, 60030, 63552, 1758, 5375, 9017, 12568, 24394, 28070, 31734, 35268, 38947, 42543, 46084};

                                /* renamed from: ｋ, reason: contains not printable characters */
                                private static long f2844 = -5850150711423013329L;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static int f2845;

                                /* renamed from: ﾒ, reason: contains not printable characters */
                                private static String m2902(char c10, int i13, int i14) {
                                    String str;
                                    synchronized (c.f1373) {
                                        try {
                                            char[] cArr = new char[i13];
                                            c.f1374 = 0;
                                            while (true) {
                                                int i15 = c.f1374;
                                                if (i15 < i13) {
                                                    cArr[i15] = (char) ((f2843[i14 + i15] ^ (i15 * f2844)) ^ c10);
                                                    c.f1374 = i15 + 1;
                                                } else {
                                                    str = new String(cArr);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                /* renamed from: ﻐ */
                                public final void mo590() throws Exception {
                                    int iM2842;
                                    int i13 = f2845 + 13;
                                    f2842 = i13 % 128;
                                    if (i13 % 2 == 0) {
                                        throw null;
                                    }
                                    ir irVar = irVarMo2898;
                                    if (irVar != null) {
                                        iM2842 = irVar.m2841().m2842();
                                        f2842 = (f2845 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
                                    } else {
                                        iM2842 = -1;
                                    }
                                    iz izVar3 = izVar2;
                                    ir irVar2 = irVarMo2898;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m2902((char) (61528 - (Process.myPid() >> 22)), 69 - Color.alpha(0), ExpandableListView.getPackedPositionChild(0L) + 1).intern());
                                    sb2.append(iM2842);
                                    izVar3.mo749(irVar2, sb2.toString());
                                }
                            });
                            return;
                        }
                        String strM2877 = ix.m2877(irVarMo2898);
                        String strIntern = m2900("췌냫粕蝽ᗇ\uf36e쫄勼ߑ\ue8f6섇욚囫濿", TextUtils.getTrimmedLength("") + 14).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2900("㼦☶㡿璠鍸萺\ue24a멘\uf3d1钾犠Ʒ\uab6f쯲颋㠕嶧챝✅㷰ࡄ䮠骤彩╼ബꪇ⩫ࡄ䮠᥏㏉囫濿\uf0be㕽梾恊⍬㘳끥䧇⋺Ť锐淚", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45).intern());
                        sb2.append(strM2877);
                        k.m3136(strIntern, sb2.toString());
                        p.m3251(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.iy.5.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() throws Exception {
                                izVar2.mo751(irVarMo2898);
                            }
                        });
                    } catch (Exception e10) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m2900("銹㏤詃暤魨癶ꇫ\uf80dꤋԕࡄ䮠七劫⤠\ufadf撢웨\uf4a5犐ꪇ⩫颋㠕\udc07蝽犠Ʒ㡿璠", TextUtils.lastIndexOf("", '0') + 31).intern());
                        sb3.append(e10.getLocalizedMessage());
                        izVar2.mo749(null, sb3.toString());
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    int i11 = f2830 + 47;
                    f2833 = i11 % 128;
                    if (i11 % 2 != 0) {
                        m2901(izVar, dVar);
                        int i12 = 59 / 0;
                    } else {
                        m2901(izVar, dVar);
                    }
                    f2830 = (f2833 + 81) % 128;
                }
            });
        } else {
            k.m3147(m2894("⋭⊣⧃ใ༽䂃푚ꎂ봖\ueec8꾶썔ᶤ亠츐拪ﰴ⼐", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m2894("⣚⢉᷅㩏ળ䔔盈Ă뜡\udad2ꨯ憫ឆ窺쮏쁺\uf602᭄毦\u20cc嚪뮙譠荁㕑塧⣟\ue309闇\uf8e9䠣䎊疥饀\ue9e2ꈄ퐒㤥ऐʧ뒠\ud9b9꺞敜\u137d縚컭엲\uf3e7Ừ湓▤剏뽢辎萠㈿忟⽺\ue488銪ﱍ䲂䝫焙鰣\uec0c", 1 - TextUtils.getOffsetBefore("", 0)).intern());
            f2825 = (f2823 + 91) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ iv m2893(iy iyVar) {
        int i10 = f2823 + 41;
        f2825 = i10 % 128;
        int i11 = i10 % 2;
        iv ivVar = iyVar.f2827;
        if (i11 != 0) {
            return ivVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m2896() {
        f2825 = (f2823 + 95) % 128;
        this.f2827.m2859();
        this.f2826 = true;
        f2823 = (f2825 + 13) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2894(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2824, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2824));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final iv m2895() {
        int i10 = f2825;
        int i11 = i10 + 65;
        f2823 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        iv ivVar = this.f2827;
        f2823 = (i10 + 57) % 128;
        return ivVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        m2892(r5, new com.ironsource.adqualitysdk.sdk.i.iy.AnonymousClass2());
        r3 = com.ironsource.adqualitysdk.sdk.i.iy.f2823 + 89;
        com.ironsource.adqualitysdk.sdk.i.iy.f2825 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r3 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.m3135(m2894("⋭⊣⧃ใ༽䂃푚ꎂ봖\ueec8꾶썔ᶤ亠츐拪ﰴ⼐", -android.view.MotionEvent.axisFromString("")).intern(), m2894("줁쥔睼僷◴機椤ứ囹끠蔡縓\uf646ၑ\ue4dd\udf9c៎熩䓹㼬뜤턺ꐱ鲴품㊕ރﳒ琈鉔杸屰鑹\uf3ad웬뷶㗕厑♐ᴙ唕댰至窋\uf2e9ᒾ\ue1bf\uda73ሯ瑘䄊㩟뎞헇ꂖ鯞폍㕴\u007fﭳ獵雤描壃郚\uf688썛렚ち嘷⌺ᦿ凵략芳秈\uf11f\u1758\ue209\ud956ẙ", -android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0')).intern());
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2897(final java.lang.String r3, final org.json.JSONObject r4, com.ironsource.adqualitysdk.sdk.i.iz r5) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.iy.f2823
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.iy.f2825 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 69
            int r1 = r1 / 0
            if (r0 == 0) goto L43
            goto L1d
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L43
        L1d:
            java.lang.String r3 = ""
            int r4 = android.view.MotionEvent.axisFromString(r3)
            int r4 = -r4
            java.lang.String r5 = "⋭⊣⧃ใ༽䂃푚ꎂ봖\ueec8꾶썔ᶤ亠츐拪ﰴ⼐"
            java.lang.String r4 = m2894(r5, r4)
            java.lang.String r4 = r4.intern()
            r5 = 48
            int r3 = android.text.TextUtils.indexOf(r3, r5)
            int r3 = -r3
            java.lang.String r5 = "줁쥔睼僷◴機椤ứ囹끠蔡縓\uf646ၑ\ue4dd\udf9c៎熩䓹㼬뜤턺ꐱ鲴품㊕ރﳒ琈鉔杸屰鑹\uf3ad웬뷶㗕厑♐ᴙ唕댰至窋\uf2e9ᒾ\ue1bf\uda73ሯ瑘䄊㩟뎞헇ꂖ鯞폍㕴\u007fﭳ獵雤描壃郚\uf688썛렚ち嘷⌺ᦿ凵략芳秈\uf11f\u1758\ue209\ud956ẙ"
            java.lang.String r3 = m2894(r5, r3)
            java.lang.String r3 = r3.intern()
            com.ironsource.adqualitysdk.sdk.i.k.m3135(r4, r3)
            return
        L43:
            com.ironsource.adqualitysdk.sdk.i.iy$2 r0 = new com.ironsource.adqualitysdk.sdk.i.iy$2
            r0.<init>()
            r2.m2892(r5, r0)
            int r3 = com.ironsource.adqualitysdk.sdk.i.iy.f2823
            int r3 = r3 + 89
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.iy.f2825 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L5b
            r3 = 37
            int r3 = r3 / 0
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.iy.m2897(java.lang.String, org.json.JSONObject, com.ironsource.adqualitysdk.sdk.i.iz):void");
    }
}
