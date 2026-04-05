package es;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import nh.g4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f55100b = new HashMap();

    @Override // nh.g4
    public final Map c() {
        return this.f55100b;
    }

    public final double d() {
        HashMap map = this.f55100b;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            i11++;
            if (((r) it.next()).d()) {
                i10++;
            }
        }
        return (i10 / i11) * 100.0d;
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f55100b;
    }
}
