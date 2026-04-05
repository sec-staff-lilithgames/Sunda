package w3;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f90370a;

    /* renamed from: b, reason: collision with root package name */
    public int f90371b;

    public g(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f90370a = new Object[i10];
    }

    @Override // w3.f
    public Object acquire() {
        int i10 = this.f90371b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f90370a;
        Object obj = objArr[i11];
        e0.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i11] = null;
        this.f90371b--;
        return obj;
    }

    @Override // w3.f
    public boolean release(Object instance) {
        Object[] objArr;
        boolean z10;
        e0.checkNotNullParameter(instance, "instance");
        int i10 = this.f90371b;
        int i11 = 0;
        while (true) {
            objArr = this.f90370a;
            if (i11 >= i10) {
                z10 = false;
                break;
            }
            if (objArr[i11] == instance) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i12 = this.f90371b;
        if (i12 >= objArr.length) {
            return false;
        }
        objArr[i12] = instance;
        this.f90371b = i12 + 1;
        return true;
    }
}
