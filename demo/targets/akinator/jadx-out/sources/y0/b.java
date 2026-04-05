package y0;

import e3.g;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f93943a;

    public b() {
        this(0, 1, null);
    }

    public static /* synthetic */ b copy$default(b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f93943a;
        }
        return bVar.copy(i10);
    }

    public final int component1() {
        return this.f93943a;
    }

    public final b copy(int i10) {
        return new b(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f93943a == ((b) obj).f93943a;
    }

    public final int getCount() {
        return this.f93943a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f93943a);
    }

    public final void plusAssign(int i10) {
        this.f93943a += i10;
    }

    public final void setCount(int i10) {
        this.f93943a = i10;
    }

    public String toString() {
        return g.m(new StringBuilder("DeltaCounter(count="), this.f93943a, ')');
    }

    public b(int i10) {
        this.f93943a = i10;
    }

    public /* synthetic */ b(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
