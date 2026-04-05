package io.odeeo.internal.e;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.t;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f63715a;

    /* renamed from: b, reason: collision with root package name */
    public final t f63716b;

    /* renamed from: c, reason: collision with root package name */
    public final t f63717c;

    /* renamed from: d, reason: collision with root package name */
    public final int f63718d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63719e;

    public i(String str, t tVar, t tVar2, int i10, int i11) {
        io.odeeo.internal.q0.a.checkArgument(i10 == 0 || i11 == 0);
        this.f63715a = io.odeeo.internal.q0.a.checkNotEmpty(str);
        this.f63716b = (t) io.odeeo.internal.q0.a.checkNotNull(tVar);
        this.f63717c = (t) io.odeeo.internal.q0.a.checkNotNull(tVar2);
        this.f63718d = i10;
        this.f63719e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f63718d == iVar.f63718d && this.f63719e == iVar.f63719e && this.f63715a.equals(iVar.f63715a) && this.f63716b.equals(iVar.f63716b) && this.f63717c.equals(iVar.f63717c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f63717c.hashCode() + ((this.f63716b.hashCode() + o2.e((((this.f63718d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f63719e) * 31, 31, this.f63715a)) * 31);
    }
}
