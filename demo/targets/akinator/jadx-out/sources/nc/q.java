package nc;

import j1.o2;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q extends mc.y {

    /* renamed from: r, reason: collision with root package name */
    public final String f75952r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f75953s;

    /* renamed from: t, reason: collision with root package name */
    public final mc.z f75954t;

    public q(mc.z zVar, String str, mc.z zVar2, boolean z10) {
        super(zVar);
        this.f75952r = str;
        this.f75954t = zVar2;
        this.f75953s = z10;
    }

    @Override // mc.y
    public final mc.z c(mc.z zVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // mc.y, mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        set(obj, this.f74236q.deserialize(uVar, kVar));
    }

    @Override // mc.y, mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(uVar, kVar));
    }

    @Override // mc.y, mc.z
    public void fixAccess(jc.j jVar) {
        this.f74236q.fixAccess(jVar);
        this.f75954t.fixAccess(jVar);
    }

    @Override // mc.y, mc.z
    public final void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    @Override // mc.y, mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            boolean z10 = this.f75953s;
            mc.z zVar = this.f75954t;
            if (!z10) {
                zVar.set(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        zVar.set(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        zVar.set(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    StringBuilder sb2 = new StringBuilder("Unsupported container type (");
                    sb2.append(obj2.getClass().getName());
                    sb2.append(") when resolving reference '");
                    throw new IllegalStateException(o2.o(sb2, this.f75952r, "'"));
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        zVar.set(obj5, obj);
                    }
                }
            }
        }
        return this.f74236q.setAndReturn(obj, obj2);
    }
}
