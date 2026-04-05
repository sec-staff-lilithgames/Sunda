package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3145bc extends U {

    /* renamed from: s, reason: collision with root package name */
    private final String f36090s;

    /* renamed from: t, reason: collision with root package name */
    private final List<NetworkSettings> f36091t;

    /* renamed from: u, reason: collision with root package name */
    private final Rb f36092u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3145bc(String str, List<? extends NetworkSettings> list, Rb configs) {
        super(IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new H0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        this.f36090s = str;
        this.f36091t = list;
        this.f36092u = configs;
    }

    public final C3145bc a(String str, List<? extends NetworkSettings> list, Rb configs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        return new C3145bc(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3145bc)) {
            return false;
        }
        C3145bc c3145bc = (C3145bc) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f36090s, c3145bc.f36090s) && kotlin.jvm.internal.e0.areEqual(this.f36091t, c3145bc.f36091t) && kotlin.jvm.internal.e0.areEqual(this.f36092u, c3145bc.f36092u);
    }

    public int hashCode() {
        String str = this.f36090s;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.f36091t;
        return this.f36092u.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.U
    public List<NetworkSettings> j() {
        return this.f36091t;
    }

    @Override // com.ironsource.U
    public String o() {
        return this.f36090s;
    }

    public final String s() {
        return this.f36090s;
    }

    public final List<NetworkSettings> t() {
        return this.f36091t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.f36090s + ", providerList=" + this.f36091t + ", configs=" + this.f36092u + ")";
    }

    public final Rb u() {
        return this.f36092u;
    }

    public final Rb v() {
        return this.f36092u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3145bc a(C3145bc c3145bc, String str, List list, Rb rb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c3145bc.f36090s;
        }
        if ((i10 & 2) != 0) {
            list = c3145bc.f36091t;
        }
        if ((i10 & 4) != 0) {
            rb2 = c3145bc.f36092u;
        }
        return c3145bc.a(str, list, rb2);
    }
}
