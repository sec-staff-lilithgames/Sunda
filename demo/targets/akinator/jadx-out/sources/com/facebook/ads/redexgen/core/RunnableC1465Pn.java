package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1465Pn implements Runnable {
    public final /* synthetic */ C09876j A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC1465Pn(C09876j c09876j, ArrayList arrayList) {
        this.A00 = c09876j;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            C1474Pw c1474Pw = (C1474Pw) it.next();
            this.A00.A0e(c1474Pw.A04, c1474Pw.A00, c1474Pw.A01, c1474Pw.A02, c1474Pw.A03);
        }
        this.A01.clear();
        this.A00.A05.remove(this.A01);
    }
}
