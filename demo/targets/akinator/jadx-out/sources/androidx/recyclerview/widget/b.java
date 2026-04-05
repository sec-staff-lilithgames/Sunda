package androidx.recyclerview.widget;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f7050a;

    /* renamed from: b, reason: collision with root package name */
    public int f7051b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7052c;

    /* renamed from: d, reason: collision with root package name */
    public int f7053d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i10 = this.f7050a;
        if (i10 != bVar.f7050a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f7053d - this.f7051b) == 1 && this.f7053d == bVar.f7051b && this.f7051b == bVar.f7053d) {
            return true;
        }
        if (this.f7053d != bVar.f7053d || this.f7051b != bVar.f7051b) {
            return false;
        }
        Object obj2 = this.f7052c;
        if (obj2 != null) {
            if (!obj2.equals(bVar.f7052c)) {
                return false;
            }
        } else if (bVar.f7052c != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f7050a * 31) + this.f7051b) * 31) + this.f7053d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(C3191e4.i.f36529d);
        int i10 = this.f7050a;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : ProductAction.ACTION_ADD);
        sb2.append(",s:");
        sb2.append(this.f7051b);
        sb2.append("c:");
        sb2.append(this.f7053d);
        sb2.append(",p:");
        return w0.i.e(sb2, this.f7052c, C3191e4.i.f36531e);
    }
}
