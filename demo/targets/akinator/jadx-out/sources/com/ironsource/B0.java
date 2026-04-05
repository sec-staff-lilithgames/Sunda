package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B0 extends J5 {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f33857a;

    /* renamed from: b, reason: collision with root package name */
    private final C3205f0 f33858b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33859c;

    public /* synthetic */ B0(C3350n0 c3350n0, C3205f0 c3205f0, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(c3350n0, c3205f0, (i10 & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        Map<String, Object> mapA = a(this.f33858b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.f33857a.f()));
        String str = this.f33859c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }

    public B0(C3350n0 adTools, C3205f0 adProperties, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        this.f33857a = adTools;
        this.f33858b = adProperties;
        this.f33859c = str;
    }
}
