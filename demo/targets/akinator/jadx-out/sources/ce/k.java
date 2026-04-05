package ce;

import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f12244a;

    /* renamed from: b, reason: collision with root package name */
    public final z0 f12245b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f12246c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12247d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12248e;

    public k(String str, z0 z0Var, z0 z0Var2, int i10, int i11) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 == 0 || i11 == 0);
        this.f12244a = com.google.android.exoplayer2.util.a.checkNotEmpty(str);
        this.f12245b = (z0) com.google.android.exoplayer2.util.a.checkNotNull(z0Var);
        this.f12246c = (z0) com.google.android.exoplayer2.util.a.checkNotNull(z0Var2);
        this.f12247d = i10;
        this.f12248e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f12247d == kVar.f12247d && this.f12248e == kVar.f12248e && this.f12244a.equals(kVar.f12244a) && this.f12245b.equals(kVar.f12245b) && this.f12246c.equals(kVar.f12246c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f12246c.hashCode() + ((this.f12245b.hashCode() + o2.e((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f12247d) * 31) + this.f12248e) * 31, 31, this.f12244a)) * 31);
    }
}
