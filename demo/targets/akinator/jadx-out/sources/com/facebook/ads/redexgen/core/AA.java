package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class AA implements InterfaceC2664px {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"q4sdjOooEVufGDgMwyNc9jWxRXQ4NKpo", "yaMKZNXBbeA6fw4ll6xnZl", "LnDp8JiwGSMQDya01UkwkftwucQ290J", "uAR9lTohqzoJg24TEcnvxnVGMAtVVlcu", "gX2x55Ut", "7esZ6Tms7", "A5370bVq", "dlMe6TUFAyxvhKGLzAxCUk9grhyb1S3t"};
    public final WeakReference<View> A00;
    public final InterfaceC2667q2 A03;
    public final List<Rect> A04 = new LinkedList();
    public final List<Rect> A05 = new ArrayList();
    public final Rect A02 = new Rect();
    public final Rect A01 = new Rect();

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-21, -23, -8, -57, -16, -19, -12, -42, -23, -25, -8};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A02(List<Rect> list) {
        list.clear();
        this.A04.clear();
        View view = this.A00.get();
        if (view == null || !view.getGlobalVisibleRect(this.A02) || this.A02.isEmpty()) {
            return;
        }
        this.A04.add(this.A02);
        Iterator<InterfaceC2668q3> it = this.A03.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A00(0, 11, 107));
        }
        list.addAll(this.A04);
        String[] strArr = A08;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A08[5] = "4CMokHw9SxiYZ0wA3ytFK";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final void A03(List<Rect> list) {
        list.clear();
        this.A05.clear();
        View view = this.A00.get();
        if (view == null || !view.getGlobalVisibleRect(this.A02) || this.A02.isEmpty()) {
            return;
        }
        this.A05.add(this.A02);
        if (0 < this.A03.size()) {
            this.A03.A6a(0);
            throw new NullPointerException(A00(0, 11, 107));
        }
        list.addAll(this.A05);
    }

    static {
        A01();
    }

    public AA(View view, InterfaceC2667q2 interfaceC2667q2) {
        this.A00 = new WeakReference<>(view);
        this.A03 = interfaceC2667q2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2664px
    public final Context A7M() {
        View view = this.A00.get();
        if (view == null) {
            return null;
        }
        return view.getContext();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2664px
    public final void A9R(List<Rect> outList) {
        if (A06) {
            A03(outList);
        } else {
            A02(outList);
        }
    }
}
