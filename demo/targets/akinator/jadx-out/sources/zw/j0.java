package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f98865a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final ax.b f98866b = new ax.b();

    /* renamed from: c, reason: collision with root package name */
    public final q f98867c;

    public j0(a0 a0Var) {
        this.f98867c = new q(a0Var);
    }

    public final h0 a(Class cls) throws Exception {
        ax.b bVar = this.f98866b;
        if (bVar.contains(cls)) {
            return null;
        }
        ax.b bVar2 = this.f98865a;
        h0 h0Var = (h0) bVar2.fetch(cls);
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarMatch = this.f98867c.match(cls);
        if (h0VarMatch != null) {
            bVar2.cache(cls, h0VarMatch);
            return h0VarMatch;
        }
        bVar.cache(cls, this);
        return h0VarMatch;
    }

    public Object read(String str, Class cls) throws Exception {
        h0 h0VarA = a(cls);
        if (h0VarA != null) {
            return h0VarA.read(str);
        }
        throw new i0("Transform of %s not supported", cls);
    }

    public boolean valid(Class cls) throws Exception {
        return a(cls) != null;
    }

    public String write(Object obj, Class cls) throws Exception {
        h0 h0VarA = a(cls);
        if (h0VarA != null) {
            return h0VarA.write(obj);
        }
        throw new i0("Transform of %s not supported", cls);
    }
}
