package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2258io implements MK {
    public final /* synthetic */ C1937dL A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2258io(JSONObject jSONObject, C1937dL c1937dL, String str) {
        this.A02 = jSONObject;
        this.A00 = c1937dL;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final String A7G() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final Collection<String> A7h() {
        return ML.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.MK
    public final MJ A8C() {
        return ML.A00(this.A02);
    }
}
