package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public n f23305a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer a(String str) {
        n nVar = this.f23305a;
        if (nVar == null || nVar.a() == null || this.f23305a.a().size() <= 0) {
            return null;
        }
        return this.f23305a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String b(String str) {
        n nVar = this.f23305a;
        if (nVar == null || nVar.a() == null || this.f23305a.a().size() <= 0) {
            return null;
        }
        return this.f23305a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean c(String str) {
        n nVar = this.f23305a;
        if (nVar == null || nVar.a() == null || this.f23305a.a().size() <= 0) {
            return null;
        }
        return this.f23305a.c(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.f23305a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public final Map a() {
        n nVar = this.f23305a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
