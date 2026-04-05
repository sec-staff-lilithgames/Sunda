package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Of {

    /* renamed from: a, reason: collision with root package name */
    private String f35158a;

    /* JADX WARN: Multi-variable type inference failed */
    public Of() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f35158a;
    }

    public final String b() {
        return this.f35158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Of) && kotlin.jvm.internal.e0.areEqual(this.f35158a, ((Of) obj).f35158a);
    }

    public int hashCode() {
        String str = this.f35158a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.b.l("TestSuiteSettings(controllerUrl=", this.f35158a, ")");
    }

    public Of(String str) {
        this.f35158a = str;
    }

    public final Of a(String str) {
        return new Of(str);
    }

    public final void b(String str) {
        this.f35158a = str;
    }

    public /* synthetic */ Of(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ Of a(Of of2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = of2.f35158a;
        }
        return of2.a(str);
    }
}
