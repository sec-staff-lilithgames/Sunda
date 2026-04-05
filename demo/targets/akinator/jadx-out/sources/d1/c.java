package d1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final x f51697a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f51698b;

    public c(x xVar, Integer num) {
        this.f51697a = xVar;
        this.f51698b = num;
    }

    public static /* synthetic */ c copy$default(c cVar, x xVar, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            xVar = cVar.f51697a;
        }
        if ((i10 & 2) != 0) {
            num = cVar.f51698b;
        }
        return cVar.copy(xVar, num);
    }

    public final x component1() {
        return this.f51697a;
    }

    public final Integer component2() {
        return this.f51698b;
    }

    public final c copy(x xVar, Integer num) {
        return new c(xVar, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e0.areEqual(this.f51697a, cVar.f51697a) && e0.areEqual(this.f51698b, cVar.f51698b);
    }

    public final Integer getGroupOffset() {
        return this.f51698b;
    }

    public final x getSourceInfo() {
        return this.f51697a;
    }

    public int hashCode() {
        int iHashCode = this.f51697a.hashCode() * 31;
        Integer num = this.f51698b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ComposeStackTraceFrame(sourceInfo=");
        sb2.append(this.f51697a);
        sb2.append(", groupOffset=");
        return com.google.android.gms.internal.play_billing.a.j(sb2, this.f51698b, ')');
    }
}
