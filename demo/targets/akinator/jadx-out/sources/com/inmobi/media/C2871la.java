package com.inmobi.media;

import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2871la extends X9 {

    /* renamed from: y, reason: collision with root package name */
    public final C2854ka f33055y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2871la(C2854ka novatiqData, F5 f52) {
        super(novatiqData.f33019c.getBeaconUrl(), f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(novatiqData, "novatiqData");
        this.f33055y = novatiqData;
        this.f32511t = false;
        this.f32512u = false;
        this.f32515x = false;
    }

    @Override // com.inmobi.media.X9
    public final void f() {
        F5 f52 = this.f32496e;
        if (f52 != null) {
            this.f33055y.getClass();
            ((G5) f52).a("Novatiq", "preparing Novatiq request with data - hyperId - " + this.f33055y.f33017a + " - sspHost - " + this.f33055y.f33018b + " - pubId - inmobi");
        }
        super.f();
        HashMap map = this.f32501j;
        if (map != null) {
            map.put("sptoken", this.f33055y.f33017a);
        }
        HashMap map2 = this.f32501j;
        if (map2 != null) {
            this.f33055y.getClass();
            map2.put("sspid", "i6i");
        }
        HashMap map3 = this.f32501j;
        if (map3 != null) {
            map3.put("ssphost", this.f33055y.f33018b);
        }
        HashMap map4 = this.f32501j;
        if (map4 != null) {
            this.f33055y.getClass();
            map4.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "inmobi");
        }
    }
}
