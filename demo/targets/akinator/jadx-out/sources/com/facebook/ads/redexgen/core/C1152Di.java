package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Di, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1152Di extends AbstractC1560Tf<C09033d> {
    public static String[] A01 = {"Xm4oO1fgaoMOjj45N8r00LATVp4gHrYG", "MO5WiyOQHdAIBAUWSCIdsXDipyRYP8jB", "8ZD7midsUGLLHTawsvmUwyHXKE63ocNK", "eXsxAyUW", "", "KTVY2IhXiCn688zdyYvQYy9fTV", "AuZpLEz4ubgydEKdqdaVeIvdhtRZUWrW", "O3ESmZOEeO27LGblO6LyKeoijHa02l1o"};
    public final /* synthetic */ C09083i A00;

    public C1152Di(C09083i c09083i) {
        this.A00 = c09083i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C09033d c09033d) {
        int iA00 = c09033d.A00();
        int duration = c09033d.A01();
        int currentPosition = this.A00.A00;
        if (currentPosition > 0 && iA00 == duration) {
            int currentPosition2 = this.A00.A00;
            if (duration > currentPosition2) {
                return;
            }
        }
        int currentPosition3 = iA00 + 500;
        if (duration < currentPosition3) {
            if (duration == 0) {
                C09083i c09083i = this.A00;
                int currentPosition4 = this.A00.A00;
                c09083i.A0j(currentPosition4);
                return;
            }
            this.A00.A0j(duration);
            return;
        }
        C09083i c09083i2 = this.A00;
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[0];
        int duration2 = str.charAt(6);
        int currentPosition5 = str2.charAt(6);
        if (duration2 == currentPosition5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "eYEuq0G9XeIp1YNIhTPdTiyuyz";
        strArr2[3] = "ZD2QUH1g";
        c09083i2.A0j(iA00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    public final Class<C09033d> A01() {
        return C09033d.class;
    }
}
