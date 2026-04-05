package com.ironsource;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W1 implements X1 {

    /* renamed from: a, reason: collision with root package name */
    private final C3339m9 f35659a;

    /* renamed from: b, reason: collision with root package name */
    private final com.ironsource.mediationsdk.d f35660b;

    /* renamed from: c, reason: collision with root package name */
    private final C3171d2 f35661c;

    public W1(C3339m9 instanceInfo, com.ironsource.mediationsdk.d auctionDataUtils, C3171d2 c3171d2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceInfo, "instanceInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f35659a = instanceInfo;
        this.f35660b = auctionDataUtils;
        this.f35661c = c3171d2;
    }

    @Override // com.ironsource.X1
    public void a(String methodName) {
        List<String> listEmptyList;
        kotlin.jvm.internal.e0.checkNotNullParameter(methodName, "methodName");
        C3171d2 c3171d2 = this.f35661c;
        if (c3171d2 == null || (listEmptyList = c3171d2.b()) == null) {
            listEmptyList = uu.p0.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void b(String methodName) {
        List<String> listEmptyList;
        kotlin.jvm.internal.e0.checkNotNullParameter(methodName, "methodName");
        C3171d2 c3171d2 = this.f35661c;
        if (c3171d2 == null || (listEmptyList = c3171d2.a()) == null) {
            listEmptyList = uu.p0.emptyList();
        }
        a(listEmptyList, methodName);
    }

    @Override // com.ironsource.X1
    public void c(String methodName) {
        List<String> listEmptyList;
        kotlin.jvm.internal.e0.checkNotNullParameter(methodName, "methodName");
        C3171d2 c3171d2 = this.f35661c;
        if (c3171d2 == null || (listEmptyList = c3171d2.c()) == null) {
            listEmptyList = uu.p0.emptyList();
        }
        a(listEmptyList, methodName);
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f35660b.a(str, this.f35659a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.f35659a.e(), this.f35659a.f(), this.f35659a.d(), "", "", "", ""));
        }
    }
}
