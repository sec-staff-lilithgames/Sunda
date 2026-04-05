package nc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends mc.y {

    /* renamed from: r, reason: collision with root package name */
    public final rc.l f75955r;

    public r(mc.z zVar, rc.l lVar) {
        super(zVar);
        this.f75955r = lVar;
    }

    public static r construct(mc.z zVar, rc.l lVar) {
        return new r(zVar, lVar);
    }

    @Override // mc.y
    public final mc.z c(mc.z zVar) {
        return new r(zVar, this.f75955r);
    }

    @Override // mc.y, mc.z
    public void deserializeAndSet(ub.u uVar, jc.k kVar, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object value = this.f75955r.getValue(obj);
        mc.z zVar = this.f74236q;
        Object objDeserialize = value == null ? zVar.deserialize(uVar, kVar) : zVar.deserializeWith(uVar, kVar, value);
        if (objDeserialize != value) {
            zVar.set(obj, objDeserialize);
        }
    }

    @Override // mc.y, mc.z
    public Object deserializeSetAndReturn(ub.u uVar, jc.k kVar, Object obj) throws UnsupportedOperationException, IOException, IllegalArgumentException {
        Object value = this.f75955r.getValue(obj);
        mc.z zVar = this.f74236q;
        Object objDeserialize = value == null ? zVar.deserialize(uVar, kVar) : zVar.deserializeWith(uVar, kVar, value);
        return (objDeserialize == value || objDeserialize == null) ? obj : zVar.setAndReturn(obj, objDeserialize);
    }

    @Override // mc.y, mc.z
    public void set(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            this.f74236q.set(obj, obj2);
        }
    }

    @Override // mc.y, mc.z
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return obj2 != null ? this.f74236q.setAndReturn(obj, obj2) : obj;
    }
}
