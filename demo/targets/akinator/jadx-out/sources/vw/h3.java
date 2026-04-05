package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h3 implements xw.g {

    /* renamed from: a, reason: collision with root package name */
    public final xw.g f89877a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89878b;

    public h3(xw.g gVar, Class cls) {
        this.f89877a = gVar;
        this.f89878b = cls;
    }

    @Override // xw.g
    public int getLength() {
        return this.f89877a.getLength();
    }

    @Override // xw.g
    public Class getType() {
        return this.f89878b;
    }

    @Override // xw.g
    public Object getValue() {
        return this.f89877a.getValue();
    }

    @Override // xw.g
    public boolean isReference() {
        return this.f89877a.isReference();
    }

    @Override // xw.g
    public void setValue(Object obj) {
        this.f89877a.setValue(obj);
    }
}
