package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.internal.w;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w f47072a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47073b;

    public c(w sdkInitResult, String fetchType) {
        e0.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        e0.checkNotNullParameter(fetchType, "fetchType");
        this.f47072a = sdkInitResult;
        this.f47073b = fetchType;
    }

    public final w a() {
        return this.f47072a;
    }

    public final String b() {
        return this.f47073b;
    }

    public final String c() {
        return this.f47073b;
    }

    public final w d() {
        return this.f47072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.f47072a, cVar.f47072a) && e0.areEqual(this.f47073b, cVar.f47073b);
    }

    public int hashCode() {
        return this.f47073b.hashCode() + (this.f47072a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FetchState(sdkInitResult=");
        sb2.append(this.f47072a);
        sb2.append(", fetchType=");
        return o2.q(sb2, this.f47073b, ')');
    }

    public final c a(w sdkInitResult, String fetchType) {
        e0.checkNotNullParameter(sdkInitResult, "sdkInitResult");
        e0.checkNotNullParameter(fetchType, "fetchType");
        return new c(sdkInitResult, fetchType);
    }

    public static /* synthetic */ c a(c cVar, w wVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = cVar.f47072a;
        }
        if ((i10 & 2) != 0) {
            str = cVar.f47073b;
        }
        return cVar.a(wVar, str);
    }
}
