package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1153Dj extends AbstractC1560Tf<C3Q> {
    public static String[] A01 = {"Etf6rxr38TN0vQCp7eNtUvsDOmNclbJq", "tsAjjvZCMDWdS", "8hGTWRVePtIxVw2NOXuq9knVHvw3DPvW", "EWxkCjZIostDvyF", "5rZAWcCWfjjM2", "LrhlSMt3F2A2PPkpDiBfjHpLA", "jQk7ZNmPb7V9ueUuvUfiKmSE", "mvg7pIDRu6IgLugvRarlC3XDTGoYv5EO"};
    public final /* synthetic */ C09083i A00;

    public C1153Dj(C09083i c09083i) {
        this.A00 = c09083i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C3Q c3q) {
        int iA00 = c3q.A00();
        int currentPositionMS = this.A00.A00;
        if (currentPositionMS > 0) {
            int currentPositionMS2 = this.A00.A0C.getDuration();
            if (iA00 == currentPositionMS2) {
                int duration = this.A00.A0C.getDuration();
                int currentPositionMS3 = this.A00.A00;
                if (duration > currentPositionMS3) {
                    return;
                }
            }
        }
        C09083i c09083i = this.A00;
        if (A01[5].length() == 7) {
            throw new RuntimeException();
        }
        A01[5] = "7AA42mFgyTVlZSuOszNfTs49";
        c09083i.A0k(iA00);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
    public final Class<C3Q> A01() {
        return C3Q.class;
    }
}
