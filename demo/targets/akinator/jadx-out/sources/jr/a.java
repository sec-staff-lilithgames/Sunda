package jr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a implements h {
    public abstract Object to(Object obj);

    public abstract Object to(String str);

    @Override // jr.h
    public Object toOrDefault(Object obj, Object obj2) {
        Object obj3;
        return (obj == null || (obj3 = to(obj)) == null) ? obj2 : obj3;
    }

    @Override // jr.h
    public Object toOrDefault(String str, Object obj) {
        Object obj2;
        return (str == null || (obj2 = to(str)) == null) ? obj : obj2;
    }
}
