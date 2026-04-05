package com.moloco.sdk.internal.error;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f45899a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f45899a;
    }

    public final String b() {
        return this.f45899a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && e0.areEqual(this.f45899a, ((a) obj).f45899a);
    }

    public int hashCode() {
        String str = this.f45899a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("ErrorMetadata(mtid="), this.f45899a, ')');
    }

    public a(String str) {
        this.f45899a = str;
    }

    public final a a(String str) {
        return new a(str);
    }

    public /* synthetic */ a(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }

    public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aVar.f45899a;
        }
        return aVar.a(str);
    }
}
