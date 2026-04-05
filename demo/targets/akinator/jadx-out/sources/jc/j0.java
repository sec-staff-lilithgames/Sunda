package jc;

import java.io.IOException;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j0 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f69321f = new j0(null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final o f69322b;

    /* renamed from: c, reason: collision with root package name */
    public final w f69323c;

    /* renamed from: e, reason: collision with root package name */
    public final wc.j f69324e;

    public j0(o oVar, w wVar, wc.j jVar) {
        this.f69322b = oVar;
        this.f69323c = wVar;
        this.f69324e = jVar;
    }

    public j0 forRootType(k0 k0Var, o oVar) {
        o oVar2 = this.f69322b;
        if (oVar == null) {
            if (oVar2 != null && this.f69323c != null) {
                return new j0(null, null, null);
            }
        } else if (!oVar.equals(oVar2)) {
            if (oVar.isJavaLangObject()) {
                try {
                    return new j0(null, null, k0Var.f().findTypeSerializer(oVar));
                } catch (r e10) {
                    throw new q0(e10);
                }
            }
            if (k0Var.isEnabled(t0.EAGER_SERIALIZER_FETCH)) {
                try {
                    w wVarFindTypedValueSerializer = k0Var.f().findTypedValueSerializer(oVar, true, (g) null);
                    return wVarFindTypedValueSerializer instanceof ad.b0 ? new j0(oVar, null, ((ad.b0) wVarFindTypedValueSerializer).typeSerializer()) : new j0(oVar, wVarFindTypedValueSerializer, null);
                } catch (i unused) {
                }
            }
            return new j0(oVar, null, this.f69324e);
        }
        return this;
    }

    public final wc.j getTypeSerializer() {
        return this.f69324e;
    }

    public final w getValueSerializer() {
        return this.f69323c;
    }

    public boolean hasSerializer() {
        return (this.f69323c == null && this.f69324e == null) ? false : true;
    }

    public void serialize(ub.o oVar, Object obj, zc.l lVar) throws IOException {
        wc.j jVar = this.f69324e;
        if (jVar != null) {
            lVar.serializePolymorphic(oVar, obj, this.f69322b, this.f69323c, jVar);
            return;
        }
        o oVar2 = this.f69322b;
        w wVar = this.f69323c;
        if (wVar != null) {
            lVar.serializeValue(oVar, obj, oVar2, wVar);
        } else if (oVar2 != null) {
            lVar.serializeValue(oVar, obj, oVar2);
        } else {
            lVar.serializeValue(oVar, obj);
        }
    }
}
