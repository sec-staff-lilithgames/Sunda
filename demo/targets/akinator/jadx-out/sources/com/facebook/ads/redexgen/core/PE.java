package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.database.DataSetObserver;

/* loaded from: assets/audience_network.dex */
public class PE extends DataSetObserver {
    public final /* synthetic */ PH A00;

    public PE(PH ph2) {
        this.A00 = ph2;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() throws Resources.NotFoundException {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() throws Resources.NotFoundException {
        this.A00.A0e();
    }
}
