package vw;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f89666a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f89667b;

    /* renamed from: c, reason: collision with root package name */
    public final String f89668c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f89669d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f89670e;

    public a0(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f89666a = new o(l0Var, fVar);
        this.f89667b = new g5(l0Var);
        this.f89669d = fVar2;
        this.f89670e = fVar;
        this.f89668c = str;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 oVar = this.f89666a.getInstance(pVar);
        Object a2Var = oVar.getInstance();
        if (oVar.isReference()) {
            return a2Var;
        }
        Collection collection = (Collection) a2Var;
        while (true) {
            yw.p next = pVar.getNext();
            Class type = this.f89669d.getType();
            if (next == null) {
                return collection;
            }
            collection.add(this.f89667b.read(next, type));
        }
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        a2 oVar = this.f89666a.getInstance(pVar);
        if (oVar.isReference()) {
            return true;
        }
        oVar.setInstance(null);
        oVar.getType();
        while (true) {
            yw.p next = pVar.getNext();
            Class type = this.f89669d.getType();
            if (next == null) {
                return true;
            }
            this.f89667b.validate(next, type);
        }
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        for (Object obj2 : (Collection) obj) {
            if (obj2 != null) {
                xw.f fVar = this.f89669d;
                Class type = fVar.getType();
                Class<?> cls = obj2.getClass();
                if (!type.isAssignableFrom(cls)) {
                    throw new p3("Entry %s does not match %s for %s", cls, fVar, this.f89670e);
                }
                this.f89667b.write(h0Var, obj2, type, this.f89668c);
            }
        }
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        a2 oVar = this.f89666a.getInstance(pVar);
        if (oVar.isReference()) {
            return oVar.getInstance();
        }
        oVar.setInstance(obj);
        if (obj == null) {
            return obj;
        }
        Collection collection = (Collection) obj;
        while (true) {
            yw.p next = pVar.getNext();
            Class type = this.f89669d.getType();
            if (next == null) {
                return collection;
            }
            collection.add(this.f89667b.read(next, type));
        }
    }
}
