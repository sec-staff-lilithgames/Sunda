package lc;

import java.io.Serializable;
import oc.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class t implements Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final mc.t[] f73150h = new mc.t[0];

    /* renamed from: i, reason: collision with root package name */
    public static final mc.i[] f73151i = new mc.i[0];

    /* renamed from: j, reason: collision with root package name */
    public static final jc.a[] f73152j = new jc.a[0];

    /* renamed from: k, reason: collision with root package name */
    public static final mc.e0[] f73153k = new mc.e0[0];

    /* renamed from: l, reason: collision with root package name */
    public static final mc.u[] f73154l = {new a1()};

    /* renamed from: b, reason: collision with root package name */
    public final mc.t[] f73155b;

    /* renamed from: c, reason: collision with root package name */
    public final mc.u[] f73156c;

    /* renamed from: e, reason: collision with root package name */
    public final mc.i[] f73157e;

    /* renamed from: f, reason: collision with root package name */
    public final jc.a[] f73158f;

    /* renamed from: g, reason: collision with root package name */
    public final mc.e0[] f73159g;

    public t() {
        this(null, null, null, null, null);
    }

    public Iterable<jc.a> abstractTypeResolvers() {
        return new dd.e(this.f73158f);
    }

    public Iterable<mc.i> deserializerModifiers() {
        return new dd.e(this.f73157e);
    }

    public Iterable<mc.t> deserializers() {
        return new dd.e(this.f73155b);
    }

    public boolean hasAbstractTypeResolvers() {
        return this.f73158f.length > 0;
    }

    public boolean hasDeserializerModifiers() {
        return this.f73157e.length > 0;
    }

    public boolean hasDeserializers() {
        return this.f73155b.length > 0;
    }

    public boolean hasKeyDeserializers() {
        return this.f73156c.length > 0;
    }

    public boolean hasValueInstantiators() {
        return this.f73159g.length > 0;
    }

    public Iterable<mc.u> keyDeserializers() {
        return new dd.e(this.f73156c);
    }

    public Iterable<mc.e0> valueInstantiators() {
        return new dd.e(this.f73159g);
    }

    public t withAbstractTypeResolver(jc.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        jc.a[] aVarArr = (jc.a[]) dd.d.insertInListNoDup(this.f73158f, aVar);
        return new t(this.f73155b, this.f73156c, this.f73157e, aVarArr, this.f73159g);
    }

    public t withAdditionalDeserializers(mc.t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("Cannot pass null Deserializers");
        }
        return new t((mc.t[]) dd.d.insertInListNoDup(this.f73155b, tVar), this.f73156c, this.f73157e, this.f73158f, this.f73159g);
    }

    public t withAdditionalKeyDeserializers(mc.u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
        }
        return new t(this.f73155b, (mc.u[]) dd.d.insertInListNoDup(this.f73156c, uVar), this.f73157e, this.f73158f, this.f73159g);
    }

    public t withDeserializerModifier(mc.i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new t(this.f73155b, this.f73156c, (mc.i[]) dd.d.insertInListNoDup(this.f73157e, iVar), this.f73158f, this.f73159g);
    }

    public t withValueInstantiators(mc.e0 e0Var) {
        if (e0Var == null) {
            throw new IllegalArgumentException("Cannot pass null resolver");
        }
        mc.e0[] e0VarArr = (mc.e0[]) dd.d.insertInListNoDup(this.f73159g, e0Var);
        return new t(this.f73155b, this.f73156c, this.f73157e, this.f73158f, e0VarArr);
    }

    public t(mc.t[] tVarArr, mc.u[] uVarArr, mc.i[] iVarArr, jc.a[] aVarArr, mc.e0[] e0VarArr) {
        this.f73155b = tVarArr == null ? f73150h : tVarArr;
        this.f73156c = uVarArr == null ? f73154l : uVarArr;
        this.f73157e = iVarArr == null ? f73151i : iVarArr;
        this.f73158f = aVarArr == null ? f73152j : aVarArr;
        this.f73159g = e0VarArr == null ? f73153k : e0VarArr;
    }
}
