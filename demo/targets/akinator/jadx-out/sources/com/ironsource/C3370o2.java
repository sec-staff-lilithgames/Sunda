package com.ironsource;

import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.o2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3370o2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f38017a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f38018b;

    public C3370o2(String serverData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverData, "serverData");
        this.f38017a = serverData;
        this.f38018b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.f38017a;
    }

    public final C3370o2 a(String serverData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(serverData, "serverData");
        return new C3370o2(serverData);
    }

    public final Map<String, String> b() throws JSONException {
        Map<String, String> mapB = this.f38018b.b(this.f38017a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mapB, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return mapB;
    }

    public final String d() throws JSONException {
        String strC = this.f38018b.c(this.f38017a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strC, "auctionDataUtils.getDyna…romServerData(serverData)");
        return strC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3370o2) && kotlin.jvm.internal.e0.areEqual(this.f38017a, ((C3370o2) obj).f38017a);
    }

    public int hashCode() {
        return this.f38017a.hashCode();
    }

    public String toString() {
        return a.b.l("AuctionServerData(serverData=", this.f38017a, ")");
    }

    public static /* synthetic */ C3370o2 a(C3370o2 c3370o2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3370o2.f38017a;
        }
        return c3370o2.a(str);
    }

    public final String a() {
        String strA = this.f38018b.a(this.f38017a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "auctionDataUtils.getAdmFromServerData(serverData)");
        return strA;
    }
}
