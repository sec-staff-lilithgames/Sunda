package io.odeeo.internal.o1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f65171a;

    /* renamed from: b, reason: collision with root package name */
    public final c f65172b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f65171a;
        }
        if ((i10 & 2) != 0) {
            cVar = bVar.f65172b;
        }
        return bVar.copy(str, cVar);
    }

    public final String component1() {
        return this.f65171a;
    }

    public final c component2() {
        return this.f65172b;
    }

    public final b copy(String str, c parameters) {
        e0.checkNotNullParameter(parameters, "parameters");
        return new b(str, parameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e0.areEqual(this.f65171a, bVar.f65171a) && e0.areEqual(this.f65172b, bVar.f65172b);
    }

    public final c getParameters() {
        return this.f65172b;
    }

    public final String getUrl() {
        return this.f65171a;
    }

    public int hashCode() {
        String str = this.f65171a;
        return this.f65172b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "CustomEventRequest(url=" + ((Object) this.f65171a) + ", parameters=" + this.f65172b + ')';
    }

    public b(String str, c parameters) {
        e0.checkNotNullParameter(parameters, "parameters");
        this.f65171a = str;
        this.f65172b = parameters;
    }

    public /* synthetic */ b(String str, c cVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? new c(null, null, null, null, null, null, null, null, null, 0L, null, 2047, null) : cVar);
    }
}
