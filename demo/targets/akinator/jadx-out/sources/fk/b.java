package fk;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Mutex f55718a;

    /* renamed from: b, reason: collision with root package name */
    public g f55719b;

    public b(Mutex mutex, g gVar) {
        e0.checkNotNullParameter(mutex, "mutex");
        this.f55718a = mutex;
        this.f55719b = gVar;
    }

    public static /* synthetic */ b copy$default(b bVar, Mutex mutex, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutex = bVar.f55718a;
        }
        if ((i10 & 2) != 0) {
            gVar = bVar.f55719b;
        }
        return bVar.copy(mutex, gVar);
    }

    public final Mutex component1() {
        return this.f55718a;
    }

    public final g component2() {
        return this.f55719b;
    }

    public final b copy(Mutex mutex, g gVar) {
        e0.checkNotNullParameter(mutex, "mutex");
        return new b(mutex, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e0.areEqual(this.f55718a, bVar.f55718a) && e0.areEqual(this.f55719b, bVar.f55719b);
    }

    public final Mutex getMutex() {
        return this.f55718a;
    }

    public final g getSubscriber() {
        return this.f55719b;
    }

    public int hashCode() {
        int iHashCode = this.f55718a.hashCode() * 31;
        g gVar = this.f55719b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public final void setSubscriber(g gVar) {
        this.f55719b = gVar;
    }

    public String toString() {
        return "Dependency(mutex=" + this.f55718a + ", subscriber=" + this.f55719b + ')';
    }

    public /* synthetic */ b(Mutex mutex, g gVar, int i10, u uVar) {
        this(mutex, (i10 & 2) != 0 ? null : gVar);
    }
}
