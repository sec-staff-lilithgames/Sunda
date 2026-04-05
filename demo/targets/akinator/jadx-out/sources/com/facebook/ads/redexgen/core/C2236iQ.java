package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2236iQ extends MS {
    public static String[] A03 = {"bMkIe4HHzeEAIK", "wvvk6JXeoGYrQUt6QbLdYhjQYYfi53dR", "vUaO3wypQXV6NlpG4vA9ecCDTWnzdNvx", "btTnQ58GcbMs0xrA6ag", "uPcaf", "63yRelZMLNO9Px2VKweOh9y3", "uSQS7xV", "6B8EZAVNEh4nIf7eFA6RS1UfCbAYEEi0"};
    public final /* synthetic */ MX A00;
    public final /* synthetic */ C7K A01;
    public final /* synthetic */ C6M A02;

    public C2236iQ(C7K c7k, C6M c6m, MX mx) {
        this.A01 = c7k;
        this.A02 = c6m;
        this.A00 = mx;
    }

    @Override // com.facebook.ads.redexgen.core.MS
    public final void A00() {
        this.A02.A0F().A4J(this.A00 != null);
        if (this.A00 != null) {
            MX mx = this.A00;
            String[] strArr = A03;
            if (strArr[7].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "cKnhjiPIAYzu4sHLc7xY44MJ7ERYjZpV";
            strArr2[2] = "VDOCXXkozOxHXBfHSThQ3rlqz7gvm39S";
            mx.ACd(this.A01);
        }
    }
}
