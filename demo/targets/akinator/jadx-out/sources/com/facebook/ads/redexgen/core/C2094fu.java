package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2094fu extends AbstractRunnableC1611Vg {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C2090fq A00;
    public final /* synthetic */ V1 A01;

    public C2094fu(C2090fq c2090fq, V1 v12) {
        this.A00 = c2090fq;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1611Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            AdListener adListenerA06 = this.A00.A01.A06();
            C1503Qz c1503Qz = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            adListenerA06.onError(c1503Qz.A07(), WT.A00(this.A01));
        }
    }
}
