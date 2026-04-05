package xw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public Object f93912a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f93913b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93914c;

    public a(Class cls, int i10) {
        this.f93913b = cls;
        this.f93914c = i10;
    }

    @Override // xw.g
    public int getLength() {
        return this.f93914c;
    }

    @Override // xw.g
    public Class getType() {
        return this.f93913b;
    }

    @Override // xw.g
    public Object getValue() {
        return this.f93912a;
    }

    @Override // xw.g
    public boolean isReference() {
        return false;
    }

    @Override // xw.g
    public void setValue(Object obj) {
        this.f93912a = obj;
    }
}
