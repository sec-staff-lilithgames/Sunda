package vw;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e2 {

    /* renamed from: b, reason: collision with root package name */
    public k f89771b;

    /* renamed from: g, reason: collision with root package name */
    public final h4 f89776g;

    /* renamed from: h, reason: collision with root package name */
    public final t0 f89777h;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f89770a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final s f89775f = new s();

    /* renamed from: c, reason: collision with root package name */
    public final m2 f89772c = new m2();

    /* renamed from: d, reason: collision with root package name */
    public final m2 f89773d = new m2();

    /* renamed from: e, reason: collision with root package name */
    public final m2 f89774e = new m2();

    public e2(h4 h4Var, t0 t0Var) {
        this.f89776g = h4Var;
        this.f89777h = t0Var;
    }

    public static void a(i2 i2Var, m2 m2Var) throws Exception {
        String name = i2Var.getName();
        String path = i2Var.getPath();
        if (!m2Var.containsKey(name)) {
            m2Var.put(name, i2Var);
        } else if (!((i2) m2Var.get(name)).getPath().equals(name)) {
            m2Var.remove(name);
        }
        m2Var.put(path, i2Var);
    }

    public static i2 b(i3 i3Var, m2 m2Var) {
        String name = i3Var.getName();
        i2 i2Var = (i2) m2Var.get(i3Var.getPath());
        return i2Var == null ? (i2) m2Var.get(name) : i2Var;
    }

    public d2 build() throws Exception {
        m2 m2Var;
        m2 m2Var2;
        m2 m2Var3;
        ArrayList arrayList;
        if (this.f89771b == null) {
            h4 h4Var = this.f89776g;
            Iterator<o4> it = h4Var.getSignatures().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                m2Var = this.f89774e;
                m2Var2 = this.f89773d;
                m2Var3 = this.f89772c;
                arrayList = this.f89770a;
                if (!zHasNext) {
                    break;
                }
                o4 next = it.next();
                o4 o4Var = new o4(next);
                Iterator<i3> it2 = next.iterator();
                while (it2.hasNext()) {
                    i3 next2 = it2.next();
                    i2 i2VarB = next2.isAttribute() ? b(next2, m2Var3) : next2.isText() ? b(next2, m2Var) : b(next2, m2Var2);
                    i iVar = i2VarB != null ? new i(next2, i2VarB) : null;
                    if (iVar != null) {
                        o4Var.add(iVar);
                    }
                }
                arrayList.add(new q4(o4Var));
            }
            k kVar = this.f89771b;
            t0 t0Var = this.f89777h;
            if (kVar == null) {
                o4 signature = h4Var.getSignature();
                this.f89771b = new k(arrayList, signature != null ? new q4(signature) : null, h4Var.getParameters(), t0Var);
            }
            for (i3 i3Var : h4Var.getParameters().getAll()) {
                i2 i2VarB2 = i3Var.isAttribute() ? b(i3Var, m2Var3) : i3Var.isText() ? b(i3Var, m2Var) : b(i3Var, m2Var2);
                String path = i3Var.getPath();
                if (i2VarB2 == null) {
                    throw new g0("Parameter '%s' does not have a match in %s", path, t0Var);
                }
                i0 contact = i2VarB2.getContact();
                String name = i3Var.getName();
                if (!v4.isAssignable(i3Var.getType(), contact.getType())) {
                    throw new g0("Type is not compatible with %s for '%s' in %s", i2VarB2, name, i3Var);
                }
                String[] names = i2VarB2.getNames();
                String name2 = i3Var.getName();
                int length = names.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        String str = names[i10];
                        if (str == name2 || str.equals(name2)) {
                            break;
                        }
                        i10++;
                    } else {
                        String name3 = i2VarB2.getName();
                        if (name2 != name3) {
                            if (name2 == null || name3 == null) {
                                throw new g0("Annotation does not match %s for '%s' in %s", i2VarB2, name2, i3Var);
                            }
                            if (!name2.equals(name3)) {
                                throw new g0("Annotation does not match %s for '%s' in %s", i2VarB2, name2, i3Var);
                            }
                        }
                    }
                }
                Annotation annotation = i2VarB2.getAnnotation();
                Annotation annotation2 = i3Var.getAnnotation();
                String name4 = i3Var.getName();
                if (!this.f89775f.equals(annotation, annotation2)) {
                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                    Class<? extends Annotation> clsAnnotationType2 = annotation2.annotationType();
                    if (!clsAnnotationType.equals(clsAnnotationType2)) {
                        throw new g0("Annotation %s does not match %s for '%s' in %s", clsAnnotationType2, clsAnnotationType, name4, i3Var);
                    }
                }
            }
            List<o0> creators = this.f89771b.getCreators();
            if (this.f89771b.isDefault()) {
                c(m2Var2);
                c(m2Var3);
            }
            if (!creators.isEmpty()) {
                d(m2Var2, creators);
                d(m2Var3, creators);
            }
        }
        return this.f89771b;
    }

    public final void c(m2 m2Var) throws g0 {
        Iterator<i2> it = m2Var.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null && next.getContact().isReadOnly()) {
                throw new g0("Default constructor can not accept read only %s in %s", next, this.f89777h);
            }
        }
    }

    public final void d(m2 m2Var, List list) throws Exception {
        Iterator<i2> it = m2Var.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    o4 signature = ((o0) it2.next()).getSignature();
                    i0 contact = next.getContact();
                    Object key = next.getKey();
                    if (contact.isReadOnly() && signature.get(key) == null) {
                        it2.remove();
                    }
                }
            }
        }
        if (list.isEmpty()) {
            throw new g0("No constructor accepts all read only values in %s", this.f89777h);
        }
    }

    public void register(i2 i2Var) throws Exception {
        if (i2Var.isAttribute()) {
            a(i2Var, this.f89772c);
        } else if (i2Var.isText()) {
            a(i2Var, this.f89774e);
        } else {
            a(i2Var, this.f89773d);
        }
    }
}
