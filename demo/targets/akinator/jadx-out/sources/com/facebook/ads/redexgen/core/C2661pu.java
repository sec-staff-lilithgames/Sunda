package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2661pu<ModelType, StateType> {
    public static byte[] A0A;
    public static final C2661pu A0B;
    public EnumC2662pv A00;
    public EnumC2653pl A01;
    public String A02;
    public boolean A03;
    public final boolean A04;
    public final C2661pu A05;
    public final ModelType A06;
    public final StateType A07;
    public final String A08;
    public final List<ViewpointAction<ModelType, StateType>> A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{78, 113, 125, 111, 104, 119, 113, 118, 108, 92, 121, 108, 121, 56, 107, 112, 119, 109, 116, 124, 56, 118, 119, 108, 56, 123, 119, 118, 108, 121, 113, 118, 56, 121, 56, 110, 113, 125, 111, 56, 121, 107, 56, 117, 119, 124, 125, 116, 83, 91, 70, 66, 79};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final void A03(InterfaceC2652pk interfaceC2652pk) {
        Iterator<ViewpointAction<ModelType, StateType>> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().A6J(this, interfaceC2652pk);
        }
        EnumC2653pl enumC2653plA9M = interfaceC2652pk.A9M(this);
        this.A01 = enumC2653plA9M;
        if (enumC2653plA9M == EnumC2653pl.A02) {
            this.A03 = true;
        }
    }

    static {
        A02();
        A0B = new C2661pu(null, null, A01(48, 5, 44), A01(48, 5, 44), Collections.emptyList(), A0B, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pw != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    public C2661pu(C2663pw<ModelType, StateType> c2663pw) {
        List listEmptyList;
        Object obj = c2663pw.A03;
        Object obj2 = c2663pw.A04;
        String str = c2663pw.A06;
        String str2 = c2663pw.A06;
        if (c2663pw.A01 == null) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = c2663pw.A01;
        }
        this(obj, obj2, str, str2, listEmptyList, c2663pw.A00, c2663pw.A02);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C2661pu(ModelType modeltype, StateType statetype, String str, String str2, List<ViewpointAction<ModelType, StateType>> list, C2661pu c2661pu, boolean z10) {
        this.A00 = EnumC2662pv.A02;
        if (!(modeltype instanceof View)) {
            this.A06 = modeltype;
            this.A07 = statetype;
            this.A08 = str;
            this.A02 = str2;
            this.A05 = c2661pu;
            this.A03 = false;
            this.A09 = list;
            this.A04 = z10;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 2));
    }

    public static <ModelType, StateType> C2663pw<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C2663pw<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.pu != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A03;
    }
}
