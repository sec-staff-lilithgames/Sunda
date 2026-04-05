package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2466mQ implements InterfaceC1135Cr {
    public static String[] A03 = {"SXf2ikyU7x67I20o8i24dVpGUFSBqQTw", "mkUiuiIj8yhWc2", "ZVpzrzkkS3TCIC8ssuB1q665Cly", "AyVvw5Y1t2x", "iglXNLTRJoy", "iTKB7JlXxZgW", "zcduVvETVwMCfQslxyZfhoZ", "8SZ4gfyzqyWZuyWUMuDO3PJ5JnvEF7yK"};
    public boolean A00;
    public final InterfaceC1135Cr A01;
    public final /* synthetic */ C9F A02;

    public C2466mQ(C9F c9f, InterfaceC1135Cr interfaceC1135Cr) {
        this.A02 = c9f;
        this.A01 = interfaceC1135Cr;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final boolean AAV() {
        if (!this.A02.A03()) {
            boolean zAAV = this.A01.AAV();
            String[] strArr = A03;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "tfusTrbeCFgw";
            strArr2[6] = "N1qkw3c8e5Hqf14VA9IMw1Y";
            if (zAAV) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final void ABs() throws IOException {
        this.A01.ABs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (r3 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AGf(com.facebook.ads.redexgen.core.C6N r13, com.facebook.ads.redexgen.core.C2536nY r14, int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2466mQ.AGf(com.facebook.ads.redexgen.X.6N, com.facebook.ads.redexgen.X.nY, int):int");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1135Cr
    public final int AJI(long j10) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AJI(j10);
    }
}
