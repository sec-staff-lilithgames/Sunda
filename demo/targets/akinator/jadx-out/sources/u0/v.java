package u0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        y0.a.m8013assert(hasNextKey());
        int i10 = this.f87512e;
        this.f87512e = i10 + 2;
        Object[] objArr = this.f87510b;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
