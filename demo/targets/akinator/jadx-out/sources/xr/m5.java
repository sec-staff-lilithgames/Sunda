package xr;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m5 extends wr.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f92788a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f92789b;

    public m5(List list, Map map) {
        this.f92788a = list;
        this.f92789b = map;
    }

    @Override // wr.r1
    public List<wr.a6> getServices() {
        return this.f92788a;
    }

    @Override // wr.r1
    public wr.t5 lookupMethod(String str, String str2) {
        return (wr.t5) this.f92789b.get(str);
    }
}
