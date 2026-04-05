package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3469u0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f38969a;

    /* renamed from: b, reason: collision with root package name */
    private final List<NetworkSettings> f38970b;

    /* renamed from: c, reason: collision with root package name */
    private final C3360na f38971c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3469u0(String str, List<? extends NetworkSettings> providerList, C3360na publisherDataHolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f38969a = str;
        this.f38970b = providerList;
        this.f38971c = publisherDataHolder;
    }

    public final String a() {
        return this.f38969a;
    }

    public final List<NetworkSettings> b() {
        return this.f38970b;
    }

    public final C3360na c() {
        return this.f38971c;
    }

    public final List<NetworkSettings> d() {
        return this.f38970b;
    }

    public final C3360na e() {
        return this.f38971c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3469u0)) {
            return false;
        }
        C3469u0 c3469u0 = (C3469u0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f38969a, c3469u0.f38969a) && kotlin.jvm.internal.e0.areEqual(this.f38970b, c3469u0.f38970b) && kotlin.jvm.internal.e0.areEqual(this.f38971c, c3469u0.f38971c);
    }

    public final String f() {
        return this.f38969a;
    }

    public int hashCode() {
        String str = this.f38969a;
        return this.f38971c.hashCode() + j1.o2.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f38970b);
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.f38969a + ", providerList=" + this.f38970b + ", publisherDataHolder=" + this.f38971c + ")";
    }

    public final C3469u0 a(String str, List<? extends NetworkSettings> providerList, C3360na publisherDataHolder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C3469u0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3469u0 a(C3469u0 c3469u0, String str, List list, C3360na c3360na, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3469u0.f38969a;
        }
        if ((i10 & 2) != 0) {
            list = c3469u0.f38970b;
        }
        if ((i10 & 4) != 0) {
            c3360na = c3469u0.f38971c;
        }
        return c3469u0.a(str, list, c3360na);
    }
}
