package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3466te {

    /* renamed from: a, reason: collision with root package name */
    private final String f38954a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38955b;

    /* renamed from: c, reason: collision with root package name */
    private final List<IronSource.a> f38956c;

    public C3466te(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f38954a = appKey;
        this.f38955b = str;
        this.f38956c = legacyAdFormats;
    }

    public final String a() {
        return this.f38954a;
    }

    public final String b() {
        return this.f38955b;
    }

    public final List<IronSource.a> c() {
        return this.f38956c;
    }

    public final String d() {
        return this.f38954a;
    }

    public final List<IronSource.a> e() {
        return this.f38956c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3466te)) {
            return false;
        }
        C3466te c3466te = (C3466te) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f38954a, c3466te.f38954a) && kotlin.jvm.internal.e0.areEqual(this.f38955b, c3466te.f38955b) && kotlin.jvm.internal.e0.areEqual(this.f38956c, c3466te.f38956c);
    }

    public final String f() {
        return this.f38955b;
    }

    public int hashCode() {
        int iHashCode = this.f38954a.hashCode() * 31;
        String str = this.f38955b;
        return this.f38956c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.f38954a;
        String str2 = this.f38955b;
        List<IronSource.a> list = this.f38956c;
        StringBuilder sbB = b3.h.b("SdkInitRequest(appKey=", str, ", userId=", str2, ", legacyAdFormats=");
        sbB.append(list);
        sbB.append(")");
        return sbB.toString();
    }

    public final C3466te a(String appKey, String str, List<IronSource.a> legacyAdFormats) {
        kotlin.jvm.internal.e0.checkNotNullParameter(appKey, "appKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C3466te(appKey, str, legacyAdFormats);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3466te a(C3466te c3466te, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3466te.f38954a;
        }
        if ((i10 & 2) != 0) {
            str2 = c3466te.f38955b;
        }
        if ((i10 & 4) != 0) {
            list = c3466te.f38956c;
        }
        return c3466te.a(str, str2, list);
    }

    public final void a(List<? extends IronSource.a> adFormats) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormats, "adFormats");
        this.f38956c.clear();
        this.f38956c.addAll(adFormats);
    }

    public /* synthetic */ C3466te(String str, String str2, List list, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }
}
