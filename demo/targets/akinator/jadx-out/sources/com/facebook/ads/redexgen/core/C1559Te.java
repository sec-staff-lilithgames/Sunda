package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC1560Tf;
import com.facebook.ads.redexgen.core.C1558Td;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.redexgen.X.Te, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1559Te<T extends AbstractC1560Tf, E extends C1558Td> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A00(E e10) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e10.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            AbstractC1560Tf abstractC1560Tf = (AbstractC1560Tf) ((WeakReference) it.next()).get();
            if (abstractC1560Tf != null && abstractC1560Tf.A00(e10)) {
                abstractC1560Tf.A03(e10);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized void A02(E e10) {
        if (this.A01.isEmpty()) {
            this.A01.add(e10);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e10);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final synchronized boolean A05(T t10) {
        if (t10 == null) {
            return false;
        }
        Class<E> clsA01 = t10.A01();
        if (this.A00.get(clsA01) == null) {
            this.A00.put(clsA01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(clsA01);
        A01(list);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == t10) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t10));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Te != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.Tf, E extends com.facebook.ads.redexgen.X.Td> */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2d
            r3 = 0
            r2 = 0
        L4:
            int r0 = r5.size()
            if (r2 >= r0) goto L1f
            java.lang.Object r1 = r5.get(r2)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1c
            int r0 = r3 + 1
            r5.set(r3, r1)
            r3 = r0
        L1c:
            int r2 = r2 + 1
            goto L4
        L1f:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L25:
            if (r0 < r3) goto L2d
            r5.remove(r0)
            int r0 = r0 + (-1)
            goto L25
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1559Te.A01(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Te != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.Tf, E extends com.facebook.ads.redexgen.X.Td> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A05(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Te != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.Tf, E extends com.facebook.ads.redexgen.X.Td> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t10 : subscribers) {
            A06(t10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Te != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.Tf, E extends com.facebook.ads.redexgen.X.Td> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).get() == subscriber) {
                list.get(i10).clear();
                return true;
            }
        }
        return false;
    }
}
