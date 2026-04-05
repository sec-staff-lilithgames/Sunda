package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public class A9 implements InterfaceC2656pp {
    public final /* synthetic */ A8 A00;

    public A9(A8 a82) {
        this.A00 = a82;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2656pp
    public final void AF8() {
        ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new ArrayList(this.A00.A06.size());
            for (Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A01 != null) {
            this.A00.A01.AF8();
        }
    }
}
