package f8;

import u7.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f55511a;

    /* renamed from: b, reason: collision with root package name */
    public f f55512b;

    /* renamed from: c, reason: collision with root package name */
    public Object f55513c;

    public c() {
        this.f55511a = new b();
        this.f55513c = null;
    }

    public Object getValue(b bVar) {
        return this.f55513c;
    }

    public final Object getValueInternal(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        return getValue(this.f55511a.set(f10, f11, obj, obj2, f12, f13, f14));
    }

    public final void setAnimation(f fVar) {
        this.f55512b = fVar;
    }

    public final void setValue(Object obj) {
        this.f55513c = obj;
        f fVar = this.f55512b;
        if (fVar != null) {
            fVar.notifyListeners();
        }
    }

    public c(Object obj) {
        this.f55511a = new b();
        this.f55513c = obj;
    }
}
