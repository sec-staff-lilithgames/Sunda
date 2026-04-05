package com.inmobi.media;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2700b8 implements Sb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2734d8 f32687a;

    public C2700b8(C2734d8 c2734d8) {
        this.f32687a = c2734d8;
    }

    @Override // com.inmobi.media.Sb
    public final boolean a() {
        return true;
    }

    @Override // com.inmobi.media.Sb
    public final boolean d() {
        return true;
    }

    @Override // com.inmobi.media.Sb
    public final long getViewTouchTimestamp() {
        return -1L;
    }

    @Override // com.inmobi.media.Sb
    public final void a(String triggerApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(triggerApi, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.f32687a.getCreativeId());
        map.put("trigger", triggerApi);
        map.put("impressionId", this.f32687a.getImpressionId());
        map.put("adType", "native");
        C2926oe c2926oe = C2926oe.f33217a;
        C2926oe.b("BlockAutoRedirection", map, EnumC2993se.f33373a);
    }
}
