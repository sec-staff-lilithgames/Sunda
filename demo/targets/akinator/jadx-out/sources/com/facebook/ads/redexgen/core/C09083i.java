package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.3i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09083i extends C1146Dc {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public C1940dO A01;
    public boolean A02;
    public final AbstractC1560Tf<C09033d> A03;
    public final AbstractC1560Tf<C3Y> A04;
    public final AbstractC1560Tf<DQ> A05;
    public final AbstractC1560Tf<C3Q> A06;
    public final AbstractC1560Tf<DL> A07;
    public final AbstractC1560Tf<DJ> A08;
    public final AbstractC1560Tf<DI> A09;
    public final AbstractC1560Tf<DD> A0A;
    public final AbstractC1560Tf<DC> A0B;
    public final E1 A0C;
    public final DN A0D;
    public final DE A0E;

    public C09083i(C1937dL c1937dL, US us, E1 e12, String str) {
        this(c1937dL, us, e12, str, 0, 0, false, null, null);
    }

    public C09083i(C1937dL c1937dL, US us, E1 e12, String str, int i10, int i11, boolean z10, Bundle bundle, Map<String, String> map) {
        super(c1937dL, us, e12, str, !e12.A0p(), i10, i11, z10, bundle, map, new C1145Db(c1937dL, e12));
        this.A0E = new DE() { // from class: com.facebook.ads.redexgen.X.3j
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DF df2) {
                this.A00.A0f();
            }
        };
        this.A08 = new C1156Dm(this);
        this.A04 = new C1155Dl(this);
        this.A05 = new C1154Dk(this);
        this.A06 = new C1153Dj(this);
        this.A03 = new C1152Di(this);
        this.A07 = new C1151Dh(this);
        this.A0A = new C1150Dg(this);
        this.A0B = new C1149Df(this);
        this.A09 = new C1161Dr(this);
        this.A0D = new DN() { // from class: com.facebook.ads.redexgen.X.3k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(DO r32) {
                this.A00.A00 = this.A00.A0C.getDuration();
            }
        };
        this.A02 = false;
        this.A0C = e12;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (U7.A2m(c1937dL)) {
            this.A01 = new C1940dO(e12, str, z10, null);
        }
    }

    public C09083i(C1937dL c1937dL, US us, E1 e12, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1937dL, us, e12, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1146Dc
    public final void A0n(EnumC1944dS enumC1944dS, Map<String, String> map) {
        super.A0n(enumC1944dS, map);
        if (this.A01 != null && enumC1944dS == EnumC1944dS.A09) {
            Map<String, String> params = this.A01.A06();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C1158Do c1158Do = new C1158Do(this);
        if (this.A0C.A0t()) {
            XJ.A00(c1158Do);
            return;
        }
        E1 e12 = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        e12.getStateHandler().post(c1158Do);
    }
}
