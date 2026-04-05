package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: assets/audience_network.dex */
public final class A8 implements SharedViewpointManager {
    public static boolean A07;
    public static byte[] A08;
    public static String[] A09 = {"BoSaZzMMCoBoab6kFzr2tWGVTni5", "Vk9jbaVPkS6rtGXBWv67wEIKcLe3GnXQ", "GJsVZyBqNYZRU43kGmqANe", "Uv9MZIJr", "GbPwVrzkFOEMxWNTB1P9oG5CUgrItJXy", "gWutc4DO", "1FOrRj10jdO8", "rnakDij4LZYpzXru71B"};
    public InterfaceC2667q2 A00;
    public InterfaceC2656pp A01;
    public C2643pb A02;
    public final InterfaceC2657pq A04;
    public final ViewpointQeConfig A05;
    public final LinkedHashMap<Integer, Runnable> A06 = new LinkedHashMap<>();
    public final InterfaceC2656pp A03 = new A9(this);

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A08 = new byte[]{-28};
    }

    static {
        A04();
        A07 = false;
    }

    public A8(ViewpointQeConfig viewpointQeConfig, InterfaceC2667q2 interfaceC2667q2, InterfaceC2657pq interfaceC2657pq) {
        this.A05 = viewpointQeConfig;
        this.A00 = interfaceC2667q2;
        this.A04 = interfaceC2657pq;
    }

    public static A8 A01() {
        return new A8(new ViewpointQeConfig(), new AC(), null);
    }

    private void A05(AbstractC2659ps abstractC2659ps, InterfaceC2664px interfaceC2664px, A6 a62) {
        this.A02 = C2643pb.A00(this.A05, abstractC2659ps, interfaceC2664px, a62);
        if (0 != 0) {
            this.A02.A01(null);
        }
        this.A02.A02(this.A03);
        String[] strArr = A09;
        if (strArr[4].charAt(11) == strArr[1].charAt(11)) {
            throw new RuntimeException();
        }
        A09[7] = "2MhPhimmgHBptxasGUILH2";
    }

    private void A06(DspViewableNode dspViewableNode, C2665q0 c2665q0) {
        C2643pb c2643pb = this.A02;
        if (c2643pb != null && dspViewableNode != null) {
            if (this.A05.A00 && c2665q0 != null) {
                c2643pb.A04(dspViewableNode, c2665q0);
            } else {
                c2643pb.A03(dspViewableNode);
            }
        }
    }

    private void A07(DspViewableNode dspViewableNode, C2665q0 c2665q0, C2661pu c2661pu) {
        C2643pb c2643pb = this.A02;
        if (c2643pb != null && dspViewableNode != null && c2661pu != null) {
            if (this.A05.A00 && c2665q0 != null) {
                c2661pu.A02 = dspViewableNode.hashCode() + A02(0, 1, 27) + c2661pu.A08 + c2665q0;
                c2643pb.A05(dspViewableNode, c2665q0, c2661pu);
            } else {
                c2643pb.A06(dspViewableNode, c2661pu);
            }
        }
    }

    public final void A08(View view) {
        A06(view != null ? ViewpointViewNode.A00(view) : null, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public final void A09(View view, C2661pu<?, ?> c2661pu) {
        A07(view != null ? ViewpointViewNode.A00(view) : null, null, c2661pu);
    }

    public final void A0A(AbstractC2659ps abstractC2659ps, View view) {
        if (abstractC2659ps != null && view != null) {
            A05(abstractC2659ps, new AA(view, this.A00), new C1H(null));
        }
    }
}
