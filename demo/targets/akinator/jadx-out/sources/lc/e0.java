package lc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final zc.t[] f73099f = new zc.t[0];

    /* renamed from: g, reason: collision with root package name */
    public static final zc.h[] f73100g = new zc.h[0];

    /* renamed from: b, reason: collision with root package name */
    public final zc.t[] f73101b;

    /* renamed from: c, reason: collision with root package name */
    public final zc.t[] f73102c;

    /* renamed from: e, reason: collision with root package name */
    public final zc.h[] f73103e;

    public e0() {
        this(null, null, null);
    }

    public boolean hasKeySerializers() {
        return this.f73102c.length > 0;
    }

    public boolean hasSerializerModifiers() {
        return this.f73103e.length > 0;
    }

    public boolean hasSerializers() {
        return this.f73101b.length > 0;
    }

    public Iterable<zc.t> keySerializers() {
        return new dd.e(this.f73102c);
    }

    public Iterable<zc.h> serializerModifiers() {
        return new dd.e(this.f73103e);
    }

    public Iterable<zc.t> serializers() {
        return new dd.e(this.f73101b);
    }

    public e0 withAdditionalKeySerializers(zc.t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("Cannot pass null Serializers");
        }
        return new e0(this.f73101b, (zc.t[]) dd.d.insertInListNoDup(this.f73102c, tVar), this.f73103e);
    }

    public e0 withAdditionalSerializers(zc.t tVar) {
        if (tVar != null) {
            return new e0((zc.t[]) dd.d.insertInListNoDup(this.f73101b, tVar), this.f73102c, this.f73103e);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public e0 withSerializerModifier(zc.h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Cannot pass null modifier");
        }
        return new e0(this.f73101b, this.f73102c, (zc.h[]) dd.d.insertInListNoDup(this.f73103e, hVar));
    }

    public e0(zc.t[] tVarArr, zc.t[] tVarArr2, zc.h[] hVarArr) {
        zc.t[] tVarArr3 = f73099f;
        this.f73101b = tVarArr == null ? tVarArr3 : tVarArr;
        this.f73102c = tVarArr2 == null ? tVarArr3 : tVarArr2;
        this.f73103e = hVarArr == null ? f73100g : hVarArr;
    }
}
