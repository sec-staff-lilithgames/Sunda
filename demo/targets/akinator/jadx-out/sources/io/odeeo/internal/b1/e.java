package io.odeeo.internal.b1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f63255a;

    /* renamed from: b, reason: collision with root package name */
    public final Exception f63256b;

    public e(int i10, Exception exc) {
        this.f63255a = i10;
        this.f63256b = exc;
    }

    public static /* synthetic */ e copy$default(e eVar, int i10, Exception exc, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eVar.f63255a;
        }
        if ((i11 & 2) != 0) {
            exc = eVar.f63256b;
        }
        return eVar.copy(i10, exc);
    }

    public final int component1() {
        return this.f63255a;
    }

    public final Exception component2() {
        return this.f63256b;
    }

    public final e copy(int i10, Exception exc) {
        return new e(i10, exc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f63255a == eVar.f63255a && e0.areEqual(this.f63256b, eVar.f63256b);
    }

    public final Exception getError() {
        return this.f63256b;
    }

    public final int getErrorCode() {
        return this.f63255a;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f63255a) * 31;
        Exception exc = this.f63256b;
        return iHashCode + (exc == null ? 0 : exc.hashCode());
    }

    public String toString() {
        return "PlayerErrorData(errorCode=" + this.f63255a + ", error=" + this.f63256b + ')';
    }

    public /* synthetic */ e(int i10, Exception exc, int i11, u uVar) {
        this(i10, (i11 & 2) != 0 ? null : exc);
    }
}
