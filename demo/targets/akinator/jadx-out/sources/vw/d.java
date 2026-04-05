package vw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final xw.g f89732a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89733b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89734c;

    public d(xw.g gVar) {
        this.f89734c = gVar.getLength();
        this.f89733b = gVar.getType();
        this.f89732a = gVar;
    }

    @Override // vw.a2
    public Object getInstance() throws Exception {
        xw.g gVar = this.f89732a;
        if (gVar.isReference()) {
            return gVar.getValue();
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f89733b, this.f89734c);
        if (gVar != null) {
            gVar.setValue(objNewInstance);
        }
        return objNewInstance;
    }

    @Override // vw.a2
    public Class getType() {
        return this.f89733b;
    }

    @Override // vw.a2
    public boolean isReference() {
        return this.f89732a.isReference();
    }

    @Override // vw.a2
    public Object setInstance(Object obj) {
        xw.g gVar = this.f89732a;
        if (gVar != null) {
            gVar.setValue(obj);
        }
        return obj;
    }
}
