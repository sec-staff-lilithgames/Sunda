package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jd {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static jd f2925;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private jj f2926;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2927;

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean f2929;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private HashMap<in, iu> f2930 = new HashMap<>();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Handler f2928 = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jd$1, reason: invalid class name */
    public class AnonymousClass1 extends iu {
        public AnonymousClass1() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            if (jd.this.f2926 == null) {
                jd.this.f2926 = new jj() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
                    /* renamed from: ｋ */
                    public final void mo767(Activity activity) {
                        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.3.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                final jd jdVar = jd.this;
                                p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.4
                                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                                    /* renamed from: ﻐ */
                                    public final void mo590() {
                                        jd.m2950(jd.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.jj, com.ironsource.adqualitysdk.sdk.i.jg
                    /* renamed from: ﾒ */
                    public final void mo768(Activity activity) {
                        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.3.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                jd.m2960(jd.this);
                            }
                        });
                    }
                };
                jd.this.f2928.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.iu
                    /* renamed from: ﻐ */
                    public final void mo590() {
                        jf.m2969().m2970(jd.this.f2926);
                        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.1.5.5
                            @Override // com.ironsource.adqualitysdk.sdk.i.iu
                            /* renamed from: ﻐ */
                            public final void mo590() {
                                jd.m2960(jd.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jd$2, reason: invalid class name */
    public class AnonymousClass2 extends iu {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ in f2937;

        public AnonymousClass2(in inVar) {
            this.f2937 = inVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            jd.this.f2930.remove(this.f2937);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jd$3, reason: invalid class name */
    public class AnonymousClass3 extends iu {

        /* renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ in f2939;

        public AnonymousClass3(in inVar) {
            this.f2939 = inVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iu
        /* renamed from: ﻐ */
        public final void mo590() {
            jd.this.f2930.put(this.f2939, new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.3.5
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    AnonymousClass3.this.f2939.mo2156();
                }
            });
            jd.m2960(jd.this);
        }
    }

    private jd() {
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2950(jd jdVar) {
        jdVar.f2929 = false;
        return false;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m2951(jd jdVar) {
        return new HashMap(jdVar.f2930);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2963() {
        p.m3248(new AnonymousClass1());
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m2961(in inVar) {
        p.m3248(new AnonymousClass2(inVar));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static synchronized jd m2957() {
        try {
            if (f2925 == null) {
                f2925 = new jd();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2925;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2960(jd jdVar) {
        if (jdVar.f2929 || new HashMap(jdVar.f2930).isEmpty()) {
            return;
        }
        jdVar.f2929 = true;
        p.m3248(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                if (!jd.this.f2929) {
                    jd.this.f2927 = null;
                    return;
                }
                HashMap mapM2951 = jd.m2951(jd.this);
                Iterator it = mapM2951.keySet().iterator();
                while (it.hasNext()) {
                    jd.this.f2928.post((Runnable) mapM2951.get((in) it.next()));
                }
                if (jd.this.f2927 == null) {
                    jd.this.f2927 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jd.5.2

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static long f2944 = -3209217963723198588L;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int f2945 = 0;

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2946 = 1;

                        /* renamed from: ﻐ, reason: contains not printable characters */
                        private static String m2964(String str, int i10) {
                            String str2;
                            char[] charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = charArray;
                            synchronized (i.f2622) {
                                try {
                                    char[] cArrM2781 = i.m2781(f2944, cArr, i10);
                                    i.f2623 = 4;
                                    while (true) {
                                        int i11 = i.f2623;
                                        if (i11 < cArrM2781.length) {
                                            i.f2624 = i11 - 4;
                                            cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2944));
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

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j10) {
                            f2945 = (f2946 + 101) % 128;
                            try {
                                p.m3247(this);
                                int i10 = f2946 + 93;
                                f2945 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    int i11 = 99 / 0;
                                }
                            } catch (Throwable th2) {
                                k.m3157(m2964("ᗓ抲ᖒ㌲⅟赒\uec6b\uefa6ꮢ콊깃궷榊ॅ桞殸", ExpandableListView.getPackedPositionChild(0L) + 1).intern(), m2964("灇ꄐ瀡볱攈仵掐ꯨ츲ೠ⇉\ue9f0ఈ쫲\ue7ab⿅䨙裁", Color.alpha(0)).intern(), th2, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jd.this.f2927);
            }
        });
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m2962(in inVar) {
        p.m3248(new AnonymousClass3(inVar));
    }
}
