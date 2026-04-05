package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f98858a;

    public a(a0 a0Var) {
        this.f98858a = a0Var;
    }

    @Override // zw.a0
    public h0 match(Class cls) throws Exception {
        Class<?> componentType = cls.getComponentType();
        if (componentType == Character.TYPE) {
            return new i(componentType);
        }
        if (componentType == Character.class) {
            return new i(componentType);
        }
        if (componentType == String.class) {
            return new e0();
        }
        h0 h0VarMatch = this.f98858a.match(componentType);
        if (h0VarMatch == null) {
            return null;
        }
        return new b(h0VarMatch, componentType);
    }
}
