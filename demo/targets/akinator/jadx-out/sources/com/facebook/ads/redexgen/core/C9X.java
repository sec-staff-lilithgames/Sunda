package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.9X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9X extends AbstractC2619ox implements InterfaceC2528nQ {
    public static byte[] A0n;
    public static String[] A0o = {"elvUyEpYiUQqaqvwUQo90L33x5mfGGF5", "x3rc7jsIv6nSbJc9JPlcAze5yGxzQZsd", "UU9CG9klJf", "SZBoHO9Iw1qJ", "kHgqOkYqcJ", "2J3DKpzV", "imAdJlgwdHrtl5IWv7XQyaTS97", "KGY40HmMWVqKFUFEVN2bB10ght87eGPu"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C2620oy A09;
    public C2603og A0A;
    public C2603og A0B;
    public C2603og A0C;
    public C2598ob A0D;
    public C2596oZ A0E;
    public C2567o4 A0F;
    public C2563o0 A0G;
    public C4N A0H;
    public C9Y A0I;
    public C10016x A0J;
    public C7I A0K;
    public CL A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C2596oZ A0T;
    public final long A0U;
    public final long A0V;
    public final long A0W;
    public final Handler A0X;
    public final Handler A0Y;
    public final Looper A0Z;
    public final InterfaceC08992z A0a;
    public final C2585oN A0b;
    public final C3T A0c;
    public final C3W A0d;
    public final C2526nO A0e;
    public final C9W A0f;
    public final InterfaceC2517nF A0g;
    public final EK A0h;
    public final EL A0i;
    public final CopyOnWriteArraySet<InterfaceC09725u> A0j;
    public final CopyOnWriteArraySet<InterfaceC08922s> A0k;
    public final boolean A0l;
    public final InterfaceC2524nM[] A0m;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0n, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0n = new byte[]{102, 29, 74, 119, 96, 95, 99, 110, 118, 106, 125, 70, 98, AbstractJsonLexerKt.TC_INVALID, 99, 0, 61, 42, 21, 41, 36, 60, 32, 55, 9, 44, 39, 106, 119, 107, 125, 107, 116, 70, 97, 102, 123, 47, 71, 123, 118, 110, 114, 101, 55, 126, 100, 55, 118, 116, 116, 114, 100, 100, 114, 115, 55, 120, 121, 55, 99, AbstractJsonLexerKt.TC_INVALID, 114, 55, 96, 101, 120, 121, 112, 55, 99, AbstractJsonLexerKt.TC_INVALID, 101, 114, 118, 115, 57, 29, 84, 98, 101, 101, 114, 121, 99, 55, 99, AbstractJsonLexerKt.TC_INVALID, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 82, 111, 103, 114, 116, 99, 114, 115, 55, 99, AbstractJsonLexerKt.TC_INVALID, 101, 114, 118, 115, 45, 55, 48, 50, 100, 48, 29, 68, 114, 114, 55, AbstractJsonLexerKt.TC_INVALID, 99, 99, 103, 100, 45, 56, 56, 114, 111, 120, 103, 123, 118, 110, 114, 101, 57, 115, 114, 97, 56, 126, 100, 100, 98, 114, 100, 56, 103, 123, 118, 110, 114, 101, 58, 118, 116, 116, 114, 100, 100, 114, 115, 58, 120, 121, 58, 96, 101, 120, 121, 112, 58, 99, AbstractJsonLexerKt.TC_INVALID, 101, 114, 118, 115, 20, 35, 42, 35, 39, 53, 35, 102, 122, 86, 43, 80, 99, 98, 92, 96, 109, 117, 105, 126, 95, 120, 109, 120, 105, 79, 100, 109, 98, 107, 105, 104, 93, 75, 75, 69, 122, 65, 14, 71, 73, 64, 65, 92, 75, 74, 14, 76, 75, 77, 79, 91, 93, 75, 14, 79, 64, 14, 79, 74, 14, 71, 93, 14, 94, 66, 79, 87, 71, 64, 73};
    }

    static {
        A06();
    }

    public C9X(InterfaceC2524nM[] interfaceC2524nMArr, EK ek2, C6S c6s, EU eu2, C3T c3t) {
        this(interfaceC2524nMArr, ek2, c6s, eu2, c3t, false, false, false, false, false, false, 0L, false, 0, false, false, false, false, false, false, false, null);
    }

    public C9X(@MetaExoPlayerCustomization("qe_android_video_exoplayer2.update_loading_priority_exo2 is consistently false. We do not need to port this in the upgrade") InterfaceC2524nM[] interfaceC2524nMArr, @MetaExoPlayerCustomization("Introduced in D13513334 and also used in loop playing for IG: D38285740") EK ek2, @MetaExoPlayerCustomization("Currently used to load chunks while seeking on pause D13827150") C6S c6s, @MetaExoPlayerCustomization("D40987428 Brought in for clippingmediasource") EU eu2, @MetaExoPlayerCustomization("D45597293 for Oculus - allowing the start renderer offset to not be 0; Eventually changed in Exo: https://github.com/google/ExoPlayer/commit/9f352434c72da527d1fa7963447c3cf680db884f") C3T c3t, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, long j10, boolean z16, int i10, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, InterfaceC08992z interfaceC08992z) {
        InterfaceC08992z interfaceC08992z2 = interfaceC08992z;
        Log.i(A04(2, 13, 30), A04(33, 5, 30) + Integer.toHexString(System.identityHashCode(this)) + A04(0, 2, 87) + A04(15, 18, 84) + A04(194, 3, 26) + AbstractC09264a.A04 + A04(193, 1, 54));
        this.A0d = new C3W();
        try {
            this.A0M = z22;
            C3M.A08(interfaceC2524nMArr.length > 0);
            this.A0m = (InterfaceC2524nM[]) C3M.A01(interfaceC2524nMArr);
            this.A0h = (EK) C3M.A01(ek2);
            this.A0Q = false;
            this.A00 = 1.0f;
            this.A05 = 0;
            this.A0A = C2603og.A0Z;
            this.A0B = C2603og.A0Z;
            this.A0C = C2603og.A0Z;
            this.A0S = false;
            this.A0V = 0L;
            this.A09 = C2620oy.A07;
            this.A0W = 0L;
            this.A0k = new CopyOnWriteArraySet<>();
            this.A0U = 0L;
            InterfaceC2517nF analyticsCollector = InterfaceC2517nF.A00;
            this.A0g = analyticsCollector;
            this.A0K = C7I.A03;
            this.A06 = 1;
            this.A0e = new C2526nO();
            this.A0i = new EL(new C7G[interfaceC2524nMArr.length], new InterfaceC2424lj[interfaceC2524nMArr.length], C2569o6.A03, null);
            this.A0b = new C2585oN();
            this.A0T = new C08872n().A03(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).A01(29, ek2.A0Y()).A04();
            this.A0E = new C08872n().A02(this.A0T).A00(4).A00(10).A04();
            this.A0G = C2563o0.A03;
            this.A0D = C2598ob.A06;
            this.A0Z = Looper.myLooper();
            final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
            this.A0X = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.60
                @Override // android.os.Handler
                public final void handleMessage(Message msg) throws Throwable {
                    if (AbstractC1616Vl.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.A0N(msg);
                    } catch (Throwable th2) {
                        AbstractC1616Vl.A00(th2, this);
                    }
                }
            };
            this.A0c = c3t;
            this.A0a = interfaceC08992z2 == null ? this : interfaceC08992z2;
            this.A0J = new C10016x(Timeline.A02, 0L, C2451mA.A06, this.A0i);
            this.A0f = new C9W(interfaceC2524nMArr, ek2, this.A0i, c6s, eu2, this.A0Q, this.A05, this.A0S, this.A0X, c3t, z10, z11, z12, z13, z14, z15, j10, z16, i10, z17, z18, z19, z20, z21, z23, C10167m.A03);
            this.A0F = C2567o4.A06;
            this.A0H = C4N.A03;
            this.A0Y = new Handler(this.A0f.A1B());
            this.A0j = new CopyOnWriteArraySet<>();
        } finally {
            this.A0d.A04();
        }
    }

    private long A00(long j10) {
        long jA01 = AbstractC08721w.A01(j10);
        if (!this.A0J.A05.A00()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            long positionMs = this.A0b.A0B();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private long A01(Timeline timeline, C2461mL c2461mL, long j10) {
        timeline.A0J(c2461mL.A04, this.A0b);
        return j10 + this.A0b.A0C();
    }

    private C10016x A02(boolean z10, boolean z11, int i10) {
        EL el2;
        if (z10) {
            this.A02 = 0;
            this.A01 = 0;
            this.A08 = 0L;
            this.A07 = 0L;
        } else {
            this.A02 = A7Z();
            this.A01 = A7U();
            this.A08 = A7W();
            this.A07 = A0J();
        }
        Timeline timeline = z11 ? Timeline.A02 : this.A0J.A03;
        C2461mL c2461mL = this.A0J.A05;
        long j10 = this.A0J.A02;
        long j11 = this.A0J.A01;
        C2451mA c2451mA = z11 ? C2451mA.A06 : this.A0J.A06;
        if (z11) {
            el2 = this.A0i;
        } else {
            C10016x c10016x = this.A0J;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "Omd19LzmWdt3";
            strArr2[5] = "slTdP4Xe";
            el2 = c10016x.A07;
        }
        return new C10016x(timeline, c2461mL, j10, j11, i10, false, c2451mA, el2, this.A0J.A05, this.A0J.A02, 0L, this.A0J.A02);
    }

    private AnonymousClass71 A03(AnonymousClass70 anonymousClass70) {
        int iA7Z = A7Z();
        C9W c9w = this.A0f;
        Timeline timeline = this.A0J.A03;
        if (iA7Z == -1) {
            iA7Z = 0;
        }
        return new AnonymousClass71(c9w, anonymousClass70, timeline, iA7Z, this.A0c, this.A0f.A1B());
    }

    private void A05() {
        if (!this.A0M) {
            return;
        }
        this.A0d.A01();
        if (Thread.currentThread() != A0K().getThread()) {
            String strA0n = AbstractC09264a.A0n(A04(38, 147, 6), Thread.currentThread().getName(), A0K().getThread().getName());
            if (!this.A0l) {
                Log.w(A04(2, 13, 30), strA0n, this.A0N ? null : new IllegalStateException());
                if (A0o[6].length() == 12) {
                    throw new RuntimeException();
                }
                A0o[6] = "OHv4LuNWT";
                this.A0N = true;
                return;
            }
            throw new IllegalStateException(strA0n);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A07(com.facebook.ads.redexgen.core.C10016x r15, int r16, boolean r17, int r18) {
        /*
            r14 = this;
            r6 = r15
            r3 = r14
            int r0 = r3.A03
            int r0 = r0 - r16
            r3.A03 = r0
            int r0 = r3.A03
            if (r0 != 0) goto L72
            long r4 = r6.A02
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            com.facebook.ads.redexgen.X.mL r7 = r6.A05
            long r10 = r6.A01
            long r0 = r6.A0D
            r8 = 0
            r6 = r6
            r12 = r0
            com.facebook.ads.redexgen.X.6x r6 = r6.A06(r7, r8, r10, r12)
        L25:
            com.facebook.ads.redexgen.X.6x r0 = r3.A0J
            com.facebook.ads.androidx.media3.common.Timeline r0 = r0.A03
            boolean r0 = r0.A0N()
            r4 = 0
            if (r0 == 0) goto L4d
            boolean r5 = r3.A0O
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C9X.A0o
            r0 = 3
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L75
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C9X.A0o
            java.lang.String r1 = "E7I7Mej0S3DTzUCwep"
            r0 = 6
            r2[r0] = r1
            if (r5 == 0) goto L5f
        L4d:
            com.facebook.ads.androidx.media3.common.Timeline r0 = r6.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L5f
            r3.A01 = r4
            r3.A02 = r4
            r0 = 0
            r3.A08 = r0
            r3.A07 = r0
        L5f:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L73
            r9 = 0
        L64:
            boolean r10 = r3.A0P
            r3.A0O = r4
            r3.A0P = r4
            r5 = r14
            r8 = r18
            r7 = r17
            r5.A08(r6, r7, r8, r9, r10)
        L72:
            return
        L73:
            r9 = 2
            goto L64
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9X.A07(com.facebook.ads.redexgen.X.6x, int, boolean, int):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0058 */
    /* JADX WARN: Incorrect condition in loop: B:34:0x009b */
    /* JADX WARN: Incorrect condition in loop: B:39:0x00b8 */
    /* JADX WARN: Incorrect condition in loop: B:55:0x0121 */
    /* JADX WARN: Incorrect condition in loop: B:61:0x0144 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(com.facebook.ads.redexgen.core.C10016x r10, boolean r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9X.A08(com.facebook.ads.redexgen.X.6x, boolean, int, int, boolean):void");
    }

    @MetaExoPlayerCustomization("D31846300; Custom MediaSessionEventListener")
    private final void A09(boolean z10, boolean z11) {
        if (this.A0Q != z10) {
            this.A0Q = z10;
            this.A04++;
            this.A0f.A1G(z10);
            C10016x c10016x = this.A0J;
            if (!z10) {
                this.A0R = z10;
                Iterator<InterfaceC08922s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    InterfaceC08922s next = it.next();
                    if (0 != 0) {
                        throw new NullPointerException(A04(197, 20, 29));
                    }
                    next.AEf(z10, c10016x.A00);
                }
            }
        }
    }

    private boolean A0A() {
        return this.A0J.A03.A0N() || this.A03 > 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2619ox
    public final void A0H(int i10, long j10) {
        long jA00;
        Timeline timeline = this.A0J.A03;
        if (i10 >= 0) {
            boolean zA0N = timeline.A0N();
            if (A0o[6].length() == 12) {
                throw new RuntimeException();
            }
            String[] strArr = A0o;
            strArr[3] = "u5DgO7GwYyET";
            strArr[5] = "hfn3fs8A";
            if (zA0N || i10 < timeline.A07()) {
                this.A0P = true;
                this.A03++;
                if (AAU()) {
                    Log.w(A04(2, 13, 30), A04(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 39, 63));
                    this.A0X.obtainMessage(0, 1, -1, this.A0J).sendToTarget();
                    return;
                }
                this.A02 = i10;
                if (timeline.A0N()) {
                    this.A08 = j10 == C.TIME_UNSET ? 0L : j10;
                    this.A01 = 0;
                } else {
                    if (j10 == C.TIME_UNSET) {
                        jA00 = timeline.A0K(i10, super.A00).A05();
                    } else {
                        jA00 = AbstractC08721w.A00(j10);
                    }
                    Pair<Object, Long> pairA0D = timeline.A0D(super.A00, this.A0b, i10, jA00);
                    this.A08 = AbstractC08721w.A01(jA00);
                    this.A01 = timeline.A0A(pairA0D.first);
                }
                this.A0f.A1D(timeline, i10, AbstractC08721w.A00(j10));
                Iterator<InterfaceC08922s> it = this.A0k.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
        }
        throw new C2E(timeline, i10, j10);
    }

    public final long A0I() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A04.A03 != this.A0J.A05.A03) {
            return this.A0J.A03.A0K(A7Z(), super.A00).A06();
        }
        long jA0D = this.A0J.A0B;
        if (this.A0J.A04.A00()) {
            C2585oN c2585oNA0J = this.A0J.A03.A0J(this.A0J.A04.A04, this.A0b);
            jA0D = c2585oNA0J.A0D(this.A0J.A04.A00);
            if (jA0D == Long.MIN_VALUE) {
                jA0D = c2585oNA0J.A01;
            }
        }
        long contentBufferedPositionUs = A01(this.A0J.A03, this.A0J.A04, jA0D);
        return AbstractC09264a.A0P(contentBufferedPositionUs);
    }

    public final long A0J() {
        if (A0A()) {
            long j10 = this.A07;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A0o[1] = "SWSNQbytnn5JxmoGO3rxXNMtbmar9O4q";
            return j10;
        }
        C10016x c10016x = this.A0J;
        if (A0o[1].charAt(28) == 'y') {
            throw new RuntimeException();
        }
        A0o[1] = "VYQpOR71WpATH6H66c6IUhHHWo1qZbHI";
        return AbstractC08721w.A01(c10016x.A0C);
    }

    public final Looper A0K() {
        return this.A0Z;
    }

    public final AnonymousClass71 A0L(AnonymousClass70 anonymousClass70) {
        A05();
        return A03(anonymousClass70);
    }

    public final void A0M() {
        StringBuilder sbAppend = new StringBuilder().append(A04(185, 8, 87)).append(Integer.toHexString(System.identityHashCode(this))).append(A04(0, 2, 87)).append(A04(15, 18, 84));
        String strA04 = A04(194, 3, 26);
        Log.i(A04(2, 13, 30), sbAppend.append(strA04).append(AbstractC09264a.A04).append(strA04).append(C2T.A00()).append(A04(193, 1, 54)).toString());
        this.A0L = null;
        this.A0f.A1C();
        this.A0X.removeCallbacksAndMessages(null);
        this.A0J = A02(false, false, 1);
        this.A0G = C2563o0.A03;
    }

    public final void A0N(Message message) {
        switch (message.what) {
            case 0:
                A07((C10016x) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C2598ob c2598ob = (C2598ob) message.obj;
                C2598ob c2598ob2 = this.A0D;
                String[] strArr = A0o;
                if (strArr[2].length() == strArr[4].length()) {
                    String[] strArr2 = A0o;
                    strArr2[2] = "M5Fz4bo4aU";
                    strArr2[4] = "jAP48pK2xI";
                    if (!c2598ob2.equals(c2598ob)) {
                        this.A0D = c2598ob;
                        Iterator<InterfaceC08922s> it = this.A0k.iterator();
                        while (it.hasNext()) {
                            it.next().AEb(c2598ob);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 2:
                C9Y c9y = (C9Y) message.obj;
                this.A0I = c9y;
                CopyOnWriteArraySet<InterfaceC08922s> copyOnWriteArraySet = this.A0k;
                String[] strArr3 = A0o;
                if (strArr3[7].charAt(29) != strArr3[0].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0o;
                strArr4[3] = "qauhWK691fBn";
                strArr4[5] = "FsOQ1ovS";
                Iterator<InterfaceC08922s> it2 = copyOnWriteArraySet.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    String[] strArr5 = A0o;
                    if (strArr5[3].length() != strArr5[5].length()) {
                        A0o[6] = "DbAY1NxOkLRBmNTAZlCZyxXxDbYRxJk";
                        if (!zHasNext) {
                            return;
                        }
                    } else if (!zHasNext) {
                        return;
                    }
                    it2.next().AEd(c9y);
                }
            case 3:
                this.A04--;
                if (this.A04 == 0) {
                    this.A0R = ((Boolean) message.obj).booleanValue();
                    CopyOnWriteArraySet<InterfaceC08922s> copyOnWriteArraySet2 = this.A0k;
                    if (A0o[1].charAt(28) == 'y') {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0o;
                    strArr6[3] = "yizDUJeCRugc";
                    strArr6[5] = "UffiDbl9";
                    Iterator<InterfaceC08922s> it3 = copyOnWriteArraySet2.iterator();
                    while (it3.hasNext()) {
                        InterfaceC08922s next = it3.next();
                        if (this.A0R) {
                            next.AEf(this.A0R, this.A0J.A00);
                        }
                    }
                    return;
                }
                return;
            case 4:
                Iterator<InterfaceC08922s> it4 = this.A0k.iterator();
                while (it4.hasNext()) {
                    it4.next();
                }
                return;
            case 5:
                CopyOnWriteArraySet<InterfaceC08922s> copyOnWriteArraySet3 = this.A0k;
                String[] strArr7 = A0o;
                if (strArr7[7].charAt(29) == strArr7[0].charAt(29)) {
                    String[] strArr8 = A0o;
                    strArr8[3] = "QQxFLYRHq8rv";
                    strArr8[5] = "zDzShVZM";
                    Iterator<InterfaceC08922s> it5 = copyOnWriteArraySet3.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                    }
                    return;
                }
                break;
            default:
                throw new IllegalStateException();
        }
        throw new RuntimeException();
    }

    public final void A0O(InterfaceC08922s interfaceC08922s) {
        this.A0k.add(interfaceC08922s);
    }

    public final void A0P(CL cl, boolean z10, boolean z11) {
        this.A0I = null;
        this.A0L = cl;
        C10016x c10016xA02 = A02(z10, z11, 2);
        this.A0O = true;
        this.A03++;
        this.A0f.A1F(cl, z10, z11);
        A08(c10016xA02, false, 4, 1, false);
    }

    public final void A0Q(boolean z10) {
        A09(z10, false);
    }

    public final boolean A0R() {
        return this.A0Q;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A6z() {
        if (AAU()) {
            if (this.A0J.A04.equals(this.A0J.A05)) {
                return AbstractC08721w.A01(this.A0J.A0B);
            }
            return A7k();
        }
        return A0I();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7L() {
        if (AAU()) {
            this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b);
            return this.A0b.A0B() + AbstractC08721w.A01(this.A0J.A01);
        }
        return A7W();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7Q() {
        if (AAU()) {
            return this.A0J.A05.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7R() {
        if (AAU()) {
            return this.A0J.A05.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    @MetaExoPlayerCustomization("getCurrentWindowIndex needs to be upgraded to getCurrentWindowIndexInternal")
    public final int A7T() {
        A05();
        int iA7Z = A7Z();
        if (iA7Z == -1) {
            return 0;
        }
        return iA7Z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7U() {
        if (A0A()) {
            return this.A01;
        }
        Timeline timeline = this.A0J.A03;
        C2461mL c2461mL = this.A0J.A05;
        String[] strArr = A0o;
        if (strArr[3].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A0o[1] = "6o1scJ9TwXJl7WSt7vZ9WMBcl2tfzHGN";
        return timeline.A0A(c2461mL.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7W() {
        if (A0A()) {
            return this.A08;
        }
        if (this.A0J.A05.A00()) {
            return AbstractC08721w.A01(this.A0J.A0C);
        }
        return A00(this.A0J.A0C);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final Timeline A7Y() {
        return this.A0J.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7Z() {
        if (A0A()) {
            int i10 = this.A02;
            String[] strArr = A0o;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0o;
            strArr2[3] = "0i1iYNlUg7j9";
            strArr2[5] = "Koyujpdg";
            return i10;
        }
        return this.A0J.A03.A0J(this.A0J.A05.A04, this.A0b).A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7k() {
        Timeline timeline = this.A0J.A03;
        if (timeline.A0N()) {
            return C.TIME_UNSET;
        }
        if (AAU()) {
            C2461mL c2461mL = this.A0J.A05;
            timeline.A0J(c2461mL.A04, this.A0b);
            return AbstractC08721w.A01(this.A0b.A0E(c2461mL.A00, c2461mL.A01));
        }
        return timeline.A0K(A7Z(), super.A00).A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A9B() {
        return Math.max(0L, AbstractC08721w.A01(this.A0J.A0D));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final boolean AAU() {
        return !A0A() && this.A0J.A05.A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final void AJV(boolean z10) {
        if (z10) {
            this.A0I = null;
            this.A0L = null;
        }
        C10016x c10016xA02 = A02(z10, z10, 1);
        this.A03++;
        this.A0f.A1H(z10);
        A08(c10016xA02, false, 4, 1, false);
        this.A0G = new C2563o0(MetaExoPlayerCustomizedCollections.A01(), c10016xA02.A0C);
    }
}
