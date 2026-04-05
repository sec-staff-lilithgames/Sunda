package f7;

import c7.s;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends g {

    /* renamed from: a, reason: collision with root package name */
    public final s f55485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55486b;

    /* renamed from: c, reason: collision with root package name */
    public final c7.f f55487c;

    public o(s sVar, String str, c7.f fVar) {
        super(null);
        this.f55485a = sVar;
        this.f55486b = str;
        this.f55487c = fVar;
    }

    public static /* synthetic */ o copy$default(o oVar, s sVar, String str, c7.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = oVar.f55485a;
        }
        if ((i10 & 2) != 0) {
            str = oVar.f55486b;
        }
        if ((i10 & 4) != 0) {
            fVar = oVar.f55487c;
        }
        return oVar.copy(sVar, str, fVar);
    }

    public final o copy(s sVar, String str, c7.f fVar) {
        return new o(sVar, str, fVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return e0.areEqual(this.f55485a, oVar.f55485a) && e0.areEqual(this.f55486b, oVar.f55486b) && this.f55487c == oVar.f55487c;
    }

    public final c7.f getDataSource() {
        return this.f55487c;
    }

    public final String getMimeType() {
        return this.f55486b;
    }

    public final s getSource() {
        return this.f55485a;
    }

    public int hashCode() {
        int iHashCode = this.f55485a.hashCode() * 31;
        String str = this.f55486b;
        return this.f55487c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
