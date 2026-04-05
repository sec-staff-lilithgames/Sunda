package pf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o[] f81132a;

    /* renamed from: b, reason: collision with root package name */
    public int f81133b;

    public p(o... oVarArr) {
        this.f81132a = oVarArr;
        int length = oVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f81132a, ((p) obj).f81132a);
    }

    public o get(int i10) {
        return this.f81132a[i10];
    }

    public o[] getAll() {
        return (o[]) this.f81132a.clone();
    }

    public int hashCode() {
        if (this.f81133b == 0) {
            this.f81133b = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f81132a);
        }
        return this.f81133b;
    }
}
