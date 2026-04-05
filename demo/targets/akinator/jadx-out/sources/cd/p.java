package cd;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f12165a;

    /* renamed from: b, reason: collision with root package name */
    public final jc.o[] f12166b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12167c;

    public p(Class<?> cls, jc.o[] oVarArr, int i10) {
        this.f12165a = cls;
        this.f12166b = oVarArr;
        this.f12167c = (cls.hashCode() * 31) + i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != p.class) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12167c == pVar.f12167c && this.f12165a == pVar.f12165a) {
            jc.o[] oVarArr = pVar.f12166b;
            jc.o[] oVarArr2 = this.f12166b;
            int length = oVarArr2.length;
            if (length == oVarArr.length) {
                for (int i10 = 0; i10 < length; i10++) {
                    if (!Objects.equals(oVarArr2[i10], oVarArr[i10])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f12167c;
    }

    public String toString() {
        return this.f12165a.getName().concat("<>");
    }
}
