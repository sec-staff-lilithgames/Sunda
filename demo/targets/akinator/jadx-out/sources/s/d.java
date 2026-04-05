package s;

import java.util.Iterator;
import java.util.Map;
import s.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends f.a implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public c f85137b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f85138c = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f85139e;

    public d(f fVar) {
        this.f85139e = fVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f85138c) {
            return this.f85139e.f85142b != null;
        }
        c cVar = this.f85137b;
        return (cVar == null || cVar.f85135e == null) ? false : true;
    }

    @Override // s.f.a
    public final void supportRemove(c cVar) {
        c cVar2 = this.f85137b;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f85136f;
            this.f85137b = cVar3;
            this.f85138c = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public Map.Entry<Object, Object> next() {
        if (this.f85138c) {
            this.f85138c = false;
            this.f85137b = this.f85139e.f85142b;
        } else {
            c cVar = this.f85137b;
            this.f85137b = cVar != null ? cVar.f85135e : null;
        }
        return this.f85137b;
    }
}
