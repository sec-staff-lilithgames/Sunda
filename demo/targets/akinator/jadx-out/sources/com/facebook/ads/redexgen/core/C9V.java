package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.9V, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9V extends AbstractC2619ox implements InterfaceC2528nQ {
    public static byte[] A0N;
    public static String[] A0O = {"ryR4HSm2zR8tip5OkgYwdb0JWy9e3v2W", "Fm5MoQAoRuRRmRXPK4I4CJ8bYaju2JW1", "syIAGKVT8Ewa7Rni6nktnCNdH4Ja85Gc", "ScHbfbbxkU", "HZJXjhizoNO31MnMnm7FxQnRU8I8lePN", "YCsl9os6nHqs6yB8LR1hlQvfR5oCt3rk", "Ml6mHBX1GsWDWNWH2EtCrt2HpilhtHKz", "59SI8zfcXXU2xe69nRlPKARsr0343GFe"};
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C2620oy A06;
    public C2614or A07;
    public C2614or A08;
    public C09585g A09;
    public C09585g A0A;
    public CL A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C9X A0E;
    public final SurfaceHolderCallbackC2520nI A0F;
    public final InterfaceC2517nF A0G;
    public final CopyOnWriteArraySet<C8D> A0H;
    public final CopyOnWriteArraySet<InterfaceC08922s> A0I;
    public final CopyOnWriteArraySet<B3> A0J;
    public final CopyOnWriteArraySet<InterfaceC1210Fo> A0K;
    public final CopyOnWriteArraySet<InterfaceC2519nH> A0L;
    public final InterfaceC2524nM[] A0M;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C9V(Context context, C7H c7h, EK ek2, C6S c6s, EU eu2, C9U c9u, InterfaceC2259ip<C3T, InterfaceC2517nF> interfaceC2259ip, C3T c3t) {
        this.A0F = new SurfaceHolderCallbackC2520nI(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = c7h.A5Q(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, c9u);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C2620oy.A07;
        this.A02 = 1;
        this.A0E = A06(this.A0M, ek2, c6s, eu2, c3t);
        this.A0G = interfaceC2259ip.A43(c3t);
        this.A0G.AIv(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{-41, -19, -15, -12, -16, -23, -55, -4, -13, -44, -16, -27, -3, -23, -10, 12, 46, 43, 31, 26, 28, 30, 13, 30, 49, 45, 46, 43, 30, 5, 34, 44, 45, 30, 39, 30, 43, -39, 26, 37, 43, 30, 26, 29, 50, -39, 46, 39, 44, 30, 45, -39, 40, 43, -39, 43, 30, 41, 37, 26, 28, 30, 29, -25};
    }

    static {
        A0E();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ip != com.google.common.base.Function<com.facebook.ads.androidx.media3.common.util.Clock, com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsCollector> */
    public C9V(Context context, C7H c7h, EK ek2, C6S c6s, EU eu2, C9U c9u, InterfaceC2259ip<C3T, InterfaceC2517nF> interfaceC2259ip) {
        this(context, c7h, ek2, c6s, eu2, c9u, interfaceC2259ip, C3T.A00);
    }

    @Deprecated
    public C9V(C7H c7h, EK ek2, C6S c6s, EU eu2, C9U c9u) {
        this(null, c7h, ek2, c6s, eu2, c9u, new InterfaceC2259ip() { // from class: com.facebook.ads.redexgen.X.nP
            @Override // com.facebook.ads.redexgen.core.InterfaceC2259ip
            public final Object A43(Object obj) {
                return new InterfaceC2517nF((C3T) obj) { // from class: com.facebook.ads.redexgen.X.9O
                    public static String[] A09 = {"4o0rkz4sfHeK33SO99B05QXsoRhyQzGZ", "K0gAeF3eD9ckm8sSKGrLnlGwgDvg6cGZ", "7dDhReETm", "uWDgAo3QhNS2SDAVWxvGGUxEzkeXCi8E", "iTLUe92lN", "exEbYNMUNVYj7aZkfWzuIWQ7Xih8easj", "xOp2qsvLijFTZdD02NXuZsLwHYitQrqs", "G4m8GVqXoTOlF678hGe6mWsbCNLG0"};
                    public InterfaceC08992z A00;
                    public InterfaceC09213v A01;
                    public AnonymousClass41<C7W> A02;
                    public boolean A03;
                    public final C3T A07;
                    public final C2585oN A05 = new C2585oN();
                    public final C2583oL A06 = new C2583oL();
                    public final C7Y A08 = new C7Y(this.A05);
                    public final SparseArray<C7U> A04 = new SparseArray<>();

                    /* JADX WARN: Failed to parse debug info
                    java.lang.ArrayIndexOutOfBoundsException
                     */
                    /* JADX WARN: Type inference failed for: r3v5, types: [com.facebook.ads.redexgen.X.7U] */
                    @RequiresNonNull({"player"})
                    private final C7U A03(Timeline timeline, int i10, C2461mL c2461mL) {
                        C2461mL c2461mL2 = c2461mL;
                        if (timeline.A0N()) {
                            c2461mL2 = null;
                        }
                        long jA6B = this.A07.A6B();
                        boolean z10 = timeline.equals(this.A00.A7Y()) && i10 == this.A00.A7T();
                        if (c2461mL2 != null && c2461mL2.A00()) {
                            if (z10 && this.A00.A7Q() == c2461mL2.A00 && this.A00.A7R() == c2461mL2.A01) {
                                jA04 = this.A00.A7W();
                            }
                        } else if (z10) {
                            jA04 = this.A00.A7L();
                            String[] strArr = A09;
                            if (strArr[3].length() != strArr[1].length()) {
                                throw new RuntimeException();
                            }
                            A09[6] = "ZwCTxmE9kC93SnFyqUzyIs0NB6ZXsqqf";
                        } else {
                            jA04 = timeline.A0N() ? 0L : timeline.A0K(i10, this.A06).A04();
                            String[] strArr2 = A09;
                            if (strArr2[3].length() == strArr2[1].length()) {
                                A09[6] = "IrjjFtfbEX9d6APA3g1gQ2wngpNkMZh7";
                            }
                        }
                        return new Object(jA6B, timeline, i10, c2461mL2, jA04, this.A00.A7Y(), this.A00.A7T(), this.A08.A06(), this.A00.A7W(), this.A00.A9B()) { // from class: com.facebook.ads.redexgen.X.7U
                            public final int A00;
                            public final int A01;
                            public final long A02;
                            public final long A03;
                            public final long A04;
                            public final long A05;
                            public final Timeline A06;
                            public final Timeline A07;
                            public final C2461mL A08;
                            public final C2461mL A09;

                            {
                                this.A04 = jA6B;
                                this.A07 = timeline;
                                this.A01 = i10;
                                this.A09 = c2461mL2;
                                this.A03 = jA04;
                                this.A06 = timeline;
                                this.A00 = i;
                                this.A08 = c2461mL;
                                this.A02 = j;
                                this.A05 = j;
                            }

                            public final boolean equals(Object obj2) {
                                if (this == obj2) {
                                    return true;
                                }
                                if (obj2 == null || getClass() != obj2.getClass()) {
                                    return false;
                                }
                                C7U c7u = (C7U) obj2;
                                if (this.A04 == c7u.A04 && this.A01 == c7u.A01 && this.A03 == c7u.A03 && this.A00 == c7u.A00 && this.A02 == c7u.A02 && this.A05 == c7u.A05 && BX.A01(this.A07, c7u.A07) && BX.A01(this.A09, c7u.A09) && BX.A01(this.A06, c7u.A06) && BX.A01(this.A08, c7u.A08)) {
                                    return true;
                                }
                                return false;
                            }

                            public final int hashCode() {
                                return BX.A00(Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), this.A09, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05));
                            }
                        };
                    }

                    {
                        this.A07 = (C3T) C3M.A01(c3t);
                        this.A02 = new AnonymousClass41<>(AbstractC09264a.A0d(), c3t, new InterfaceC09253z() { // from class: com.facebook.ads.redexgen.X.nB
                        });
                    }

                    private final C7U A00() {
                        return A04(this.A08.A06());
                    }

                    private C7U A01(int i10, C2461mL c2461mL) {
                        C3M.A01(this.A00);
                        boolean z10 = true;
                        if (c2461mL != null) {
                            if (this.A08.A05(c2461mL) == null) {
                                z10 = false;
                            }
                            if (z10) {
                                return A04(c2461mL);
                            }
                            return A03(Timeline.A02, i10, c2461mL);
                        }
                        Timeline timelineA7Y = this.A00.A7Y();
                        if (i10 >= timelineA7Y.A07()) {
                            z10 = false;
                        }
                        if (!z10) {
                            timelineA7Y = Timeline.A02;
                        }
                        return A03(timelineA7Y, i10, null);
                    }

                    private C7U A02(C2600od c2600od) {
                        if (c2600od instanceof C9Y) {
                            C9Y c9y = (C9Y) c2600od;
                            if (c9y.A05 != null) {
                                return A04(new C2461mL(c9y.A05));
                            }
                        }
                        return A00();
                    }

                    private C7U A04(C2461mL c2461mL) {
                        Timeline timelineA05;
                        C3M.A01(this.A00);
                        if (c2461mL == null) {
                            timelineA05 = null;
                        } else {
                            timelineA05 = this.A08.A05(c2461mL);
                        }
                        if (c2461mL == null || timelineA05 == null) {
                            int windowIndex = this.A00.A7T();
                            Timeline knownTimeline = this.A00.A7Y();
                            if (!(windowIndex < knownTimeline.A07())) {
                                knownTimeline = Timeline.A02;
                            }
                            return A03(knownTimeline, windowIndex, null);
                        }
                        return A03(timelineA05, timelineA05.A0J(c2461mL.A04, this.A05).A00, c2461mL);
                    }

                    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3y != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<com.facebook.ads.androidx.media3.exoplayer.analytics.AnalyticsListener> */
                    private final void A05(C7U c7u, int i10, InterfaceC09243y<C7W> interfaceC09243y) {
                        this.A04.put(i10, c7u);
                        this.A02.A0A(i10, interfaceC09243y);
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC2517nF
                    public final void AC5() {
                        if (!this.A03) {
                            final C7U c7uA00 = A00();
                            this.A03 = true;
                            A05(c7uA00, -1, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n9
                            });
                        }
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void ACv(final C2563o0 c2563o0) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 27, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n7
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void ACw(final List<C2565o2> list) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 27, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.mz
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void AD6(int i10, C2461mL c2461mL, final CG cg2) {
                        final C7U c7uA01 = A01(i10, c2461mL);
                        A05(c7uA01, 1004, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.nC
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void ADw(int i10, C2461mL c2461mL, final CE ce2, final CG cg2) {
                        final C7U c7uA01 = A01(i10, c2461mL);
                        A05(c7uA01, 1002, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n8
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void ADy(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i10, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2461mL c2461mL, final CE ce2, final CG cg2, Object obj2, Object obj3) {
                        final C7U c7uA01 = A01(i10, c2461mL);
                        A05(c7uA01, 1001, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n1
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.CX
                    public final void AE1(int i10, C2461mL c2461mL, final CE ce2, final CG cg2, final IOException iOException, final boolean z10) {
                        final C7U c7uA01 = A01(i10, c2461mL);
                        A05(c7uA01, IronSourceError.AUCTION_ERROR_DECRYPTION, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.nD
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AEb(final C2598ob c2598ob) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 12, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n6
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AEd(final C2600od c2600od) {
                        final C7U c7uA02 = A02(c2600od);
                        A05(c7uA02, 10, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.nA
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AEf(final boolean z10, final int i10) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, -1, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n5
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AFB() {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, -1, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n0
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AFQ(Timeline timeline, final int i10) {
                        this.A08.A07((InterfaceC08992z) C3M.A01(this.A00));
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 0, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n3
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC08922s
                    public final void AFU(final C2569o6 c2569o6) {
                        final C7U c7uA00 = A00();
                        A05(c7uA00, 2, new InterfaceC09243y() { // from class: com.facebook.ads.redexgen.X.n2
                        });
                    }

                    @Override // com.facebook.ads.redexgen.core.InterfaceC2517nF
                    public final void AIv(final InterfaceC08992z interfaceC08992z, Looper looper) {
                        C3M.A08(this.A00 == null || this.A08.A03.isEmpty());
                        this.A00 = (InterfaceC08992z) C3M.A01(interfaceC08992z);
                        this.A01 = this.A07.A5H(looper, null);
                        this.A02 = this.A02.A07(looper, new InterfaceC09253z() { // from class: com.facebook.ads.redexgen.X.n4
                        });
                    }
                };
            }
        });
    }

    private final C9X A06(InterfaceC2524nM[] interfaceC2524nMArr, EK ek2, C6S c6s, EU eu2, C3T c3t) {
        return new C9X(interfaceC2524nMArr, ek2, c6s, eu2, c3t);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 71), A07(15, 49, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            String[] strArr = A0O;
            if (strArr[6].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0O;
            strArr2[6] = "1mt3T64XRkFMJTK0AHNCLCnfNjMbTppi";
            strArr2[3] = "rnp4JtgfYQ";
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2524nM interfaceC2524nM : this.A0M) {
            if (interfaceC2524nM.A9F() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC2524nM).A07(1).A08(surface).A06());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass71) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2619ox
    public final void A0H(int i10, long j10) {
        this.A0G.AC5();
        this.A0E.A0H(i10, j10);
    }

    public final int A0I() {
        return this.A01;
    }

    public final C2614or A0J() {
        return this.A07;
    }

    public final C2614or A0K() {
        return this.A08;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f10) {
        float fA00 = AbstractC09264a.A00(f10, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC2524nM interfaceC2524nM : this.A0M) {
            if (interfaceC2524nM.A9F() == 1) {
                this.A0E.A0L(interfaceC2524nM).A07(2).A08(Float.valueOf(fA00)).A06();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(InterfaceC08922s interfaceC08922s) {
        this.A0E.A0O(interfaceC08922s);
        this.A0I.add(interfaceC08922s);
    }

    public final void A0P(InterfaceC2519nH interfaceC2519nH) {
        this.A0L.add(interfaceC2519nH);
    }

    public final void A0Q(CL cl) {
        A0R(cl, true, true);
    }

    public final void A0R(CL cl, boolean z10, boolean z11) {
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
        }
        this.A0B = cl;
        cl.A3r(this.A0D, this.A0G);
        this.A0E.A0P(cl, z10, z11);
    }

    public final void A0S(boolean z10) {
        this.A0E.A0Q(z10);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A6z() {
        return this.A0E.A6z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7L() {
        return this.A0E.A7L();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7Q() {
        return this.A0E.A7Q();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7R() {
        return this.A0E.A7R();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7T() {
        return this.A0E.A7T();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7U() {
        return this.A0E.A7U();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7W() {
        return this.A0E.A7W();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final Timeline A7Y() {
        return this.A0E.A7Y();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final int A7Z() {
        return this.A0E.A7Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A7k() {
        return this.A0E.A7k();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final long A9B() {
        return this.A0E.A9B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final boolean AAU() {
        return this.A0E.AAU();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC08992z
    public final void AJV(boolean z10) {
        this.A0E.AJV(z10);
        if (this.A0B != null) {
            this.A0B.AHi(this.A0G);
            this.A0B = null;
            if (z10) {
                this.A0B = null;
            }
        }
    }
}
