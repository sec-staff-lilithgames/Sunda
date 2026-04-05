package bi;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9588a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9590c;

    public q(Class cls, int i10, int i11) {
        this(b0.unqualified(cls), i10, i11);
    }

    public static q deferred(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    @Deprecated
    public static q optional(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q optionalProvider(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q required(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q requiredProvider(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q setOf(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public static q setOfProvider(Class<?> cls) {
        return new q(cls, 2, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f9588a.equals(qVar.f9588a) && this.f9589b == qVar.f9589b && this.f9590c == qVar.f9590c;
    }

    public b0 getInterface() {
        return this.f9588a;
    }

    public int hashCode() {
        return ((((this.f9588a.hashCode() ^ 1000003) * 1000003) ^ this.f9589b) * 1000003) ^ this.f9590c;
    }

    public boolean isDeferred() {
        return this.f9590c == 2;
    }

    public boolean isDirectInjection() {
        return this.f9590c == 0;
    }

    public boolean isRequired() {
        return this.f9589b == 1;
    }

    public boolean isSet() {
        return this.f9589b == 2;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f9588a);
        sb2.append(", type=");
        int i10 = this.f9589b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f9590c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = IronSourceConstants.EVENTS_PROVIDER;
        } else {
            if (i11 != 2) {
                throw new AssertionError(a.b.e(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return o2.o(sb2, str, "}");
    }

    public q(b0 b0Var, int i10, int i11) {
        this.f9588a = (b0) z.checkNotNull(b0Var, "Null dependency anInterface.");
        this.f9589b = i10;
        this.f9590c = i11;
    }

    public static q deferred(b0 b0Var) {
        return new q(b0Var, 0, 2);
    }

    public static q optionalProvider(b0 b0Var) {
        return new q(b0Var, 0, 1);
    }

    public static q required(b0 b0Var) {
        return new q(b0Var, 1, 0);
    }

    public static q requiredProvider(b0 b0Var) {
        return new q(b0Var, 1, 1);
    }

    public static q setOf(b0 b0Var) {
        return new q(b0Var, 2, 0);
    }

    public static q setOfProvider(b0 b0Var) {
        return new q(b0Var, 2, 1);
    }
}
