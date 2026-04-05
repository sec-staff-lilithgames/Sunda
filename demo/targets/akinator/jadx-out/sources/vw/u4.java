package vw;

import java.lang.annotation.Annotation;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final e2 f90131a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f90132b;

    /* renamed from: c, reason: collision with root package name */
    public final y2 f90133c;

    /* renamed from: d, reason: collision with root package name */
    public d2 f90134d;

    /* renamed from: e, reason: collision with root package name */
    public final m2 f90135e;

    /* renamed from: f, reason: collision with root package name */
    public final m2 f90136f;

    /* renamed from: g, reason: collision with root package name */
    public final m2 f90137g;

    /* renamed from: h, reason: collision with root package name */
    public final h4 f90138h;

    /* renamed from: i, reason: collision with root package name */
    public final v4 f90139i;

    /* renamed from: j, reason: collision with root package name */
    public i2 f90140j;

    /* renamed from: k, reason: collision with root package name */
    public final h5 f90141k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f90142l;

    public u4(h4 h4Var, t0 t0Var, v4 v4Var) throws Exception {
        p1 p1Var = new p1(t0Var, v4Var);
        this.f90132b = p1Var;
        this.f90133c = new y2(p1Var, t0Var, v4Var);
        this.f90131a = new e2(h4Var, t0Var);
        this.f90141k = new h5(h4Var, t0Var);
        this.f90135e = new m2(h4Var);
        this.f90136f = new m2(h4Var);
        this.f90137g = new m2(h4Var);
        this.f90138h = h4Var;
        this.f90139i = v4Var;
    }

    public final void a(i0 i0Var, Annotation annotation, m2 m2Var) throws Exception {
        i2 label = this.f90139i.getLabel(i0Var, annotation);
        String path = label.getPath();
        String name = label.getName();
        if (m2Var.get(path) != 0) {
            throw new p3("Duplicate annotation of name '%s' on %s", name, i0Var);
        }
        b(label, m2Var);
    }

    public void assemble(Class cls) throws Exception {
        uw.m order = this.f90138h.getOrder();
        if (order != null) {
            this.f90133c.assemble(this.f90141k, order);
        }
    }

    public final void b(i2 i2Var, m2 m2Var) throws Exception {
        o1 expression = i2Var.getExpression();
        String path = i2Var.getPath();
        x2 x2VarC = !expression.isEmpty() ? c(expression) : this.f90141k;
        this.f90131a.register(i2Var);
        x2VarC.register(i2Var);
        m2Var.put(path, i2Var);
    }

    public t4 build(Class cls) throws Exception {
        return new t4(this.f90134d, this.f90141k, this.f90140j, null, this.f90142l);
    }

    public final x2 c(o1 o1Var) throws Exception {
        x2 x2VarRegister = this.f90141k;
        x2 x2VarLookup = x2VarRegister.lookup(o1Var);
        if (x2VarLookup != null) {
            return x2VarLookup;
        }
        while (x2VarRegister != null) {
            String prefix = o1Var.getPrefix();
            String first = o1Var.getFirst();
            int index = o1Var.getIndex();
            if (first != null) {
                x2VarRegister = x2VarRegister.register(first, prefix, index);
            }
            if (!o1Var.isPath()) {
                return x2VarRegister;
            }
            o1Var = o1Var.getPath(1);
        }
        return x2VarRegister;
    }

    public void commit(Class cls) throws Exception {
        if (this.f90134d == null) {
            this.f90134d = this.f90131a.build();
        }
    }

    public final void d(i0 i0Var, Annotation annotation, m2 m2Var) throws Exception {
        for (i2 i2Var : this.f90139i.getLabels(i0Var, annotation)) {
            String path = i2Var.getPath();
            String name = i2Var.getName();
            if (m2Var.get(path) != 0) {
                throw new p3("Duplicate annotation of name '%s' on %s", name, i2Var);
            }
            b(i2Var, m2Var);
        }
    }

    public void process(i0 i0Var, Annotation annotation) throws Exception {
        if (annotation instanceof uw.a) {
            a(i0Var, annotation, this.f90135e);
        }
        boolean z10 = annotation instanceof uw.j;
        m2 m2Var = this.f90136f;
        if (z10) {
            d(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.g) {
            d(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.i) {
            d(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.f) {
            a(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.e) {
            a(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.h) {
            a(i0Var, annotation, m2Var);
        }
        if (annotation instanceof uw.d) {
            a(i0Var, annotation, m2Var);
        }
        boolean z11 = annotation instanceof uw.s;
        v4 v4Var = this.f90139i;
        if (z11) {
            i2 label = v4Var.getLabel(i0Var, annotation);
            if (this.f90140j != null) {
                throw new e("Multiple version annotations in %s", annotation);
            }
            this.f90140j = label;
        }
        if (annotation instanceof uw.q) {
            i2 label2 = v4Var.getLabel(i0Var, annotation);
            o1 expression = label2.getExpression();
            String path = label2.getPath();
            x2 x2VarC = !expression.isEmpty() ? c(expression) : this.f90141k;
            m2 m2Var2 = this.f90137g;
            if (m2Var2.get(path) != 0) {
                throw new b5("Multiple text annotations in %s", annotation);
            }
            this.f90131a.register(label2);
            x2VarC.register(label2);
            m2Var2.put(path, label2);
        }
    }

    public void validate(Class cls) throws Exception {
        h4 h4Var = this.f90138h;
        uw.m order = h4Var.getOrder();
        m2 m2Var = this.f90136f;
        Iterator<i2> it = m2Var.iterator();
        while (true) {
            if (!it.hasNext()) {
                p1 p1Var = this.f90132b;
                h5 h5Var = this.f90141k;
                if (order != null) {
                    for (String str : order.elements()) {
                        o1 o1VarBuild = p1Var.build(str);
                        x2 x2VarLookup = o1VarBuild.isPath() ? h5Var.lookup(o1VarBuild.getPath(0, 1)) : h5Var;
                        if (x2VarLookup != null) {
                            String last = o1VarBuild.getLast();
                            int index = o1VarBuild.getIndex();
                            if (x2VarLookup.isElement(last) || (x2VarLookup.isModel(last) && !x2VarLookup.lookup(last, index).isEmpty())) {
                            }
                        }
                        throw new y0("Ordered element '%s' missing for %s", str, cls);
                    }
                }
                if (order != null) {
                    for (String str2 : order.attributes()) {
                        o1 o1VarBuild2 = p1Var.build(str2);
                        x2 x2VarLookup2 = o1VarBuild2.isPath() ? h5Var.lookup(o1VarBuild2.getPath(0, 1)) : h5Var;
                        if (!(x2VarLookup2 != null ? !o1VarBuild2.isPath() ? x2VarLookup2.isAttribute(str2) : x2VarLookup2.isAttribute(o1VarBuild2.getLast()) : false)) {
                            throw new e("Ordered attribute '%s' missing in %s", str2, cls);
                        }
                    }
                }
                if (!h5Var.isEmpty()) {
                    h5Var.validate(cls);
                }
                i2 text = h5Var.getText();
                if (text != null) {
                    if (!text.isTextList()) {
                        if (!m2Var.isEmpty()) {
                            throw new b5("Elements used with %s in %s", text, cls);
                        }
                        if (h5Var.isComposite()) {
                            throw new b5("Paths used with %s in %s", text, cls);
                        }
                    }
                } else if (h4Var.isEmpty()) {
                    this.f90142l = h5Var.isEmpty();
                }
                i2 text2 = h5Var.getText();
                if (text2 == null || !text2.isTextList()) {
                    return;
                }
                Object key = text2.getKey();
                Iterator<i2> it2 = m2Var.iterator();
                while (it2.hasNext()) {
                    i2 next = it2.next();
                    if (!next.getKey().equals(key)) {
                        throw new b5("Elements used with %s in %s", text2, cls);
                    }
                    Class type = next.getDependent().getType();
                    if (type == String.class) {
                        throw new b5("Illegal entry of %s with text annotations on %s in %s", type, text2, cls);
                    }
                }
                if (h5Var.isComposite()) {
                    throw new b5("Paths used with %s in %s", text2, cls);
                }
                return;
            }
            i2 next2 = it.next();
            String[] paths = next2.getPaths();
            i0 contact = next2.getContact();
            for (String str3 : paths) {
                Annotation annotation = contact.getAnnotation();
                i2 i2Var = (i2) m2Var.get(str3);
                if (next2.isInline() != i2Var.isInline()) {
                    throw new i5("Inline must be consistent in %s for %s", annotation, contact);
                }
                if (next2.isRequired() != i2Var.isRequired()) {
                    throw new i5("Required must be consistent in %s for %s", annotation, contact);
                }
            }
        }
    }
}
