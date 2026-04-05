package vw;

import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h5 implements x2 {

    /* renamed from: b, reason: collision with root package name */
    public o1 f89879b;

    /* renamed from: c, reason: collision with root package name */
    public final m2 f89880c;

    /* renamed from: e, reason: collision with root package name */
    public final m2 f89881e;

    /* renamed from: f, reason: collision with root package name */
    public final a3 f89882f;

    /* renamed from: g, reason: collision with root package name */
    public final a f89883g;

    /* renamed from: h, reason: collision with root package name */
    public final r3 f89884h;

    /* renamed from: i, reason: collision with root package name */
    public final t0 f89885i;

    /* renamed from: j, reason: collision with root package name */
    public final String f89886j;

    /* renamed from: k, reason: collision with root package name */
    public final String f89887k;

    /* renamed from: l, reason: collision with root package name */
    public i2 f89888l;

    /* renamed from: m, reason: collision with root package name */
    public i2 f89889m;

    /* renamed from: n, reason: collision with root package name */
    public final int f89890n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends ArrayList {
    }

    public h5(r3 r3Var, t0 t0Var) {
        this(r3Var, t0Var, null, null, 1);
    }

    public final void a(i2 i2Var) throws Exception {
        o1 expression = i2Var.getExpression();
        o1 o1Var = this.f89879b;
        if (o1Var == null) {
            this.f89879b = expression;
            return;
        }
        String path = o1Var.getPath();
        String path2 = expression.getPath();
        if (!path.equals(path2)) {
            throw new m3("Path '%s' does not match '%s' in %s", path, path2, this.f89885i);
        }
    }

    @Override // vw.x2
    public m2 getAttributes() throws Exception {
        return this.f89880c.getLabels();
    }

    @Override // vw.x2
    public m2 getElements() throws Exception {
        return this.f89881e.getLabels();
    }

    @Override // vw.x2
    public o1 getExpression() {
        return this.f89879b;
    }

    @Override // vw.x2
    public int getIndex() {
        return this.f89890n;
    }

    @Override // vw.x2
    public a3 getModels() throws Exception {
        return this.f89882f.getModels();
    }

    @Override // vw.x2
    public String getName() {
        return this.f89886j;
    }

    @Override // vw.x2
    public String getPrefix() {
        return this.f89887k;
    }

    @Override // vw.x2
    public i2 getText() {
        i2 i2Var = this.f89889m;
        return i2Var != null ? i2Var : this.f89888l;
    }

    @Override // vw.x2
    public boolean isAttribute(String str) {
        return this.f89880c.containsKey(str);
    }

    @Override // vw.x2
    public boolean isComposite() {
        Iterator<z2> it = this.f89882f.iterator();
        while (it.hasNext()) {
            Iterator<E> it2 = it.next().iterator();
            while (it2.hasNext()) {
                x2 x2Var = (x2) it2.next();
                if (x2Var != null && !x2Var.isEmpty()) {
                    return true;
                }
            }
        }
        return !r0.isEmpty();
    }

    @Override // vw.x2
    public boolean isElement(String str) {
        return this.f89881e.containsKey(str);
    }

    @Override // vw.x2
    public boolean isEmpty() {
        if (this.f89888l == null && this.f89881e.isEmpty() && this.f89880c.isEmpty()) {
            return !isComposite();
        }
        return false;
    }

    @Override // vw.x2
    public boolean isModel(String str) {
        return this.f89882f.containsKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.f89883g.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    @Override // vw.x2
    public x2 lookup(o1 o1Var) {
        x2 x2VarLookup = lookup(o1Var.getFirst(), o1Var.getIndex());
        if (o1Var.isPath()) {
            o1 path = o1Var.getPath(1, 0);
            if (x2VarLookup != null) {
                return x2VarLookup.lookup(path);
            }
        }
        return x2VarLookup;
    }

    @Override // vw.x2
    public void register(i2 i2Var) throws Exception {
        if (i2Var.isAttribute()) {
            registerAttribute(i2Var);
        } else if (i2Var.isText()) {
            registerText(i2Var);
        } else {
            registerElement(i2Var);
        }
    }

    @Override // vw.x2
    public void registerAttribute(String str) throws Exception {
        this.f89880c.put(str, null);
    }

    @Override // vw.x2
    public void registerElement(String str) throws Exception {
        a aVar = this.f89883g;
        if (!aVar.contains(str)) {
            aVar.add(str);
        }
        this.f89881e.put(str, null);
    }

    @Override // vw.x2
    public void registerText(i2 i2Var) throws Exception {
        if (this.f89888l != null) {
            throw new b5("Duplicate text annotation on %s", i2Var);
        }
        this.f89888l = i2Var;
    }

    public String toString() {
        return "model '" + this.f89886j + C3191e4.i.f36529d + this.f89890n + "]'";
    }

    @Override // vw.x2
    public void validate(Class cls) throws Exception {
        m2 m2Var = this.f89881e;
        Iterator<i2> it = m2Var.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null) {
                a(next);
            }
        }
        m2 m2Var2 = this.f89880c;
        Iterator<i2> it2 = m2Var2.iterator();
        while (it2.hasNext()) {
            i2 next2 = it2.next();
            if (next2 != null) {
                a(next2);
            }
        }
        i2 i2Var = this.f89888l;
        if (i2Var != null) {
            a(i2Var);
        }
        for (String str : m2Var2.keySet()) {
            if (((i2) m2Var2.get(str)) == null) {
                throw new e("Ordered attribute '%s' does not exist in %s", str, cls);
            }
            o1 o1Var = this.f89879b;
            if (o1Var != null) {
                o1Var.getAttribute(str);
            }
        }
        Iterator it3 = m2Var.keySet().iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            a3 a3Var = this.f89882f;
            if (!zHasNext) {
                Iterator<z2> it4 = a3Var.iterator();
                while (it4.hasNext()) {
                    Iterator<E> it5 = it4.next().iterator();
                    int i10 = 1;
                    while (it5.hasNext()) {
                        x2 x2Var = (x2) it5.next();
                        if (x2Var != null) {
                            String name = x2Var.getName();
                            int index = x2Var.getIndex();
                            int i11 = i10 + 1;
                            if (index != i10) {
                                throw new y0("Path section '%s[%s]' is out of sequence in %s", name, Integer.valueOf(index), cls);
                            }
                            x2Var.validate(cls);
                            i10 = i11;
                        }
                    }
                }
                if (this.f89888l != null) {
                    if (!m2Var.isEmpty()) {
                        throw new b5("Text annotation %s used with elements in %s", this.f89888l, cls);
                    }
                    if (isComposite()) {
                        throw new b5("Text annotation %s can not be used with paths in %s", this.f89888l, cls);
                    }
                    return;
                }
                return;
            }
            String str2 = (String) it3.next();
            z2 z2Var = (z2) a3Var.get(str2);
            i2 i2Var2 = (i2) m2Var.get(str2);
            if (z2Var == null && i2Var2 == null) {
                throw new y0("Ordered element '%s' does not exist in %s", str2, cls);
            }
            if (z2Var != null && i2Var2 != null && !z2Var.isEmpty()) {
                throw new y0("Element '%s' is also a path name in %s", str2, cls);
            }
            o1 o1Var2 = this.f89879b;
            if (o1Var2 != null) {
                o1Var2.getElement(str2);
            }
        }
    }

    public h5(r3 r3Var, t0 t0Var, String str, String str2, int i10) {
        this.f89880c = new m2(r3Var);
        this.f89881e = new m2(r3Var);
        this.f89882f = new a3(t0Var);
        this.f89883g = new a();
        this.f89885i = t0Var;
        this.f89884h = r3Var;
        this.f89887k = str2;
        this.f89890n = i10;
        this.f89886j = str;
    }

    @Override // vw.x2
    public void registerAttribute(i2 i2Var) throws Exception {
        String name = i2Var.getName();
        m2 m2Var = this.f89880c;
        if (m2Var.get(name) != 0) {
            throw new e("Duplicate annotation of name '%s' on %s", name, i2Var);
        }
        m2Var.put(name, i2Var);
    }

    @Override // vw.x2
    public void registerElement(i2 i2Var) throws Exception {
        String name = i2Var.getName();
        m2 m2Var = this.f89881e;
        if (m2Var.get(name) == 0) {
            a aVar = this.f89883g;
            if (!aVar.contains(name)) {
                aVar.add(name);
            }
            if (i2Var.isTextList()) {
                this.f89889m = i2Var;
            }
            m2Var.put(name, i2Var);
            return;
        }
        throw new y0("Duplicate annotation of name '%s' on %s", name, i2Var);
    }

    @Override // vw.x2
    public x2 register(String str, String str2, int i10) throws Exception {
        a3 a3Var = this.f89882f;
        x2 x2VarLookup = a3Var.lookup(str, i10);
        if (x2VarLookup != null) {
            return x2VarLookup;
        }
        h5 h5Var = new h5(this.f89884h, this.f89885i, str, str2, i10);
        if (str != null) {
            a3Var.register(str, h5Var);
            this.f89883g.add(str);
        }
        return h5Var;
    }

    @Override // vw.x2
    public x2 lookup(String str, int i10) {
        return this.f89882f.lookup(str, i10);
    }
}
