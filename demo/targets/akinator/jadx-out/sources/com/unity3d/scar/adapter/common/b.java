package com.unity3d.scar.adapter.common;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends n {
    public b(c cVar, Object... objArr) {
        super(cVar, null, objArr);
    }

    public static b AdNotLoadedError(kl.d dVar) {
        String strK = a.b.k("Cannot show ad that is not loaded for placement ", dVar.getPlacementId());
        return new b(c.f50724v, strK, dVar.getPlacementId(), dVar.getQueryId(), strK);
    }

    public static b AdapterCreationError(String str) {
        return new b(c.f50711i, str, new Object[0]);
    }

    public static b InternalLoadError(kl.d dVar, String str) {
        return new b(c.f50718p, str, dVar.getPlacementId(), dVar.getQueryId(), str);
    }

    public static b InternalShowError(kl.d dVar, String str) {
        return new b(c.f50723u, str, dVar.getPlacementId(), dVar.getQueryId(), str);
    }

    public static b InternalSignalsError(String str) {
        return new b(c.f50714l, str, str);
    }

    public static b NoAdsError(String str, String str2, String str3) {
        return new b(c.f50721s, str3, str, str2, str3);
    }

    public static b QueryNotFoundError(kl.d dVar) {
        String strK = a.b.k("Missing queryInfoMetadata for ad ", dVar.getPlacementId());
        return new b(c.f50719q, strK, dVar.getPlacementId(), dVar.getQueryId(), strK);
    }

    @Override // com.unity3d.scar.adapter.common.n, com.unity3d.scar.adapter.common.j
    public String getDomain() {
        return "GMA";
    }

    public b(c cVar, String str, Object... objArr) {
        super(cVar, str, objArr);
    }
}
