package com.ironsource;

import com.ironsource.mediationsdk.e;
import java.net.URL;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3261i2 extends e.a {
    public C3261i2(S1 s12, URL url, JSONObject jSONObject, boolean z10, C3387p2 c3387p2) {
        super(s12, url, jSONObject, z10, c3387p2);
    }

    @Override // com.ironsource.mediationsdk.e.a
    public void a(boolean z10, S1 s12, long j10) {
        try {
            if (z10) {
                ((InterfaceC3135b2) s12).a(this.f37502b, this.f37506f + 1, j10, this.f37510j, this.f37509i);
            } else {
                s12.a(this.f37503c, this.f37504d, this.f37506f + 1, this.f37507g, j10);
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            s12.a(1009, e10.getMessage(), this.f37506f + 1, this.f37507g, j10);
        }
    }
}
