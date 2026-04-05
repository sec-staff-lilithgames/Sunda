package d1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f51708a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f51709b;

    public r(int i10, Integer num) {
        this.f51708a = i10;
        this.f51709b = num;
    }

    public static /* synthetic */ r copy$default(r rVar, int i10, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = rVar.f51708a;
        }
        if ((i11 & 2) != 0) {
            num = rVar.f51709b;
        }
        return rVar.copy(i10, num);
    }

    public final int component1() {
        return this.f51708a;
    }

    public final Integer component2() {
        return this.f51709b;
    }

    public final r copy(int i10, Integer num) {
        return new r(i10, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f51708a == rVar.f51708a && e0.areEqual(this.f51709b, rVar.f51709b);
    }

    public final Integer getDataOffset() {
        return this.f51709b;
    }

    public final int getGroup() {
        return this.f51708a;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f51708a) * 31;
        Integer num = this.f51709b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ObjectLocation(group=");
        sb2.append(this.f51708a);
        sb2.append(", dataOffset=");
        return com.google.android.gms.internal.play_billing.a.j(sb2, this.f51709b, ')');
    }
}
