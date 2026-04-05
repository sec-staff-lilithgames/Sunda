package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.gQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2125gQ implements PZ {
    public final /* synthetic */ C09886k A00;
    public final /* synthetic */ PU A01;

    public C2125gQ(C09886k c09886k, PU pu2) {
        this.A00 = c09886k;
        this.A01 = pu2;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A58(int i10) {
        PS compatInfo = this.A01.A00(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final List<Object> A6Q(String str, int i10) {
        List<PS> listA03 = this.A01.A03(str, i10);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i11 = 0; i11 < infoCount; i11++) {
            arrayList.add(listA03.get(i11).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final Object A6R(int i10) {
        PS compatInfo = this.A01.A01(i10);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.facebook.ads.redexgen.core.PZ
    public final boolean AGB(int i10, int i11, Bundle bundle) {
        return this.A01.A04(i10, i11, bundle);
    }
}
