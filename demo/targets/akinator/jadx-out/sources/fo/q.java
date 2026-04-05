package fo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p[] f55921a;

    /* renamed from: b, reason: collision with root package name */
    public int f55922b;

    public q(p... pVarArr) {
        this.f55921a = pVarArr;
        int length = pVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f55921a, ((q) obj).f55921a);
    }

    public p get(int i10) {
        return this.f55921a[i10];
    }

    public p[] getAll() {
        return (p[]) this.f55921a.clone();
    }

    public int hashCode() {
        if (this.f55922b == 0) {
            this.f55922b = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f55921a);
        }
        return this.f55922b;
    }
}
