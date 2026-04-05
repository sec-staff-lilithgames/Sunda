package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1466Po implements Runnable {
    public final /* synthetic */ C09876j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1466Po(C09876j c09876j, ArrayList arrayList) {
        this.A00 = c09876j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C1473Pv change = (C1473Pv) it.next();
            this.A00.A0c(change);
        }
        this.A01.clear();
        this.A00.A03.remove(this.A01);
    }
}
