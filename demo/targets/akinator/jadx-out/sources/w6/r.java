package w6;

import android.net.NetworkRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final a f90430b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f90431c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f90432a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final String getTAG() {
            return r.f90431c;
        }
    }

    static {
        String strTagWithPrefix = n6.c0.tagWithPrefix("NetworkRequestCompat");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(...)");
        f90431c = strTagWithPrefix;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public r() {
        kotlin.jvm.internal.u uVar = null;
        this(uVar, 1, uVar);
    }

    public static /* synthetic */ r copy$default(r rVar, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = rVar.f90432a;
        }
        return rVar.copy(obj);
    }

    public final Object component1() {
        return this.f90432a;
    }

    public final r copy(Object obj) {
        return new r(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.e0.areEqual(this.f90432a, ((r) obj).f90432a);
    }

    public final NetworkRequest getNetworkRequest() {
        return (NetworkRequest) this.f90432a;
    }

    public final Object getWrapped() {
        return this.f90432a;
    }

    public int hashCode() {
        Object obj = this.f90432a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f90432a + ')';
    }

    public r(Object obj) {
        this.f90432a = obj;
    }

    public /* synthetic */ r(Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
