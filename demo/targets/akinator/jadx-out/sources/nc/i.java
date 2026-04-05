package nc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final mc.z f75916a;

    /* renamed from: b, reason: collision with root package name */
    public final wc.g f75917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75918c;

    /* renamed from: d, reason: collision with root package name */
    public mc.z f75919d;

    public i(mc.z zVar, wc.g gVar) {
        this.f75916a = zVar;
        this.f75917b = gVar;
        this.f75918c = gVar.getPropertyName();
    }

    public String getDefaultTypeId() {
        wc.g gVar = this.f75917b;
        Class<?> defaultImpl = gVar.getDefaultImpl();
        if (defaultImpl == null) {
            return null;
        }
        return gVar.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
    }

    public mc.z getProperty() {
        return this.f75916a;
    }

    public mc.z getTypeProperty() {
        return this.f75919d;
    }

    public String getTypePropertyName() {
        return this.f75918c;
    }

    public boolean hasDefaultType() {
        return this.f75917b.hasDefaultImpl();
    }

    public boolean hasTypePropertyName(String str) {
        return str.equals(this.f75918c);
    }

    public void linkTypeProperty(mc.z zVar) {
        this.f75919d = zVar;
    }
}
