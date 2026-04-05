package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.iZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2245iZ implements InterfaceC1837bi {
    public final /* synthetic */ C7L A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AAe() {
        String strA00 = this.A00.A03.A23().A00();
        if (TextUtils.isEmpty(strA00)) {
            return;
        }
        WN.A0O(new WN(), this.A00.A04, WQ.A00(strA00), this.A00.A7G());
    }

    public C2245iZ(C7L c7l) {
        this.A00 = c7l;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AD8(C5G c5g) {
        new Handler(Looper.getMainLooper()).postDelayed(new C2247ib(this, c5g), 1L);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void ADO() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1837bi
    public final void AFS(View view, MotionEvent motionEvent) {
    }
}
