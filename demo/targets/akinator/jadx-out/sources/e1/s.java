package e1;

import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends h {

    /* renamed from: f, reason: collision with root package name */
    public final String f53494f;

    /* renamed from: g, reason: collision with root package name */
    public final Object[] f53495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String fqName, Object[] keys, kv.l inspectorInfo, kv.q factory) {
        super(inspectorInfo, factory);
        e0.checkNotNullParameter(fqName, "fqName");
        e0.checkNotNullParameter(keys, "keys");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        this.f53494f = fqName;
        this.f53495g = keys;
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return e0.areEqual(this.f53494f, sVar.f53494f) && Arrays.equals(this.f53495g, sVar.f53495g);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final String getFqName() {
        return this.f53494f;
    }

    public final Object[] getKeys() {
        return this.f53495g;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f53495g) + (this.f53494f.hashCode() * 31);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
