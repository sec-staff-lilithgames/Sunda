package vw;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final d3 f90113a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f90114b;

    /* renamed from: c, reason: collision with root package name */
    public final q f90115c;

    /* renamed from: d, reason: collision with root package name */
    public final f4 f90116d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f90117e;

    /* renamed from: f, reason: collision with root package name */
    public final xw.f f90118f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final u f90119a;

        /* renamed from: b, reason: collision with root package name */
        public final p0 f90120b;

        /* renamed from: c, reason: collision with root package name */
        public final j4 f90121c;

        /* renamed from: d, reason: collision with root package name */
        public final a2 f90122d;

        public a(u uVar, p0 p0Var, j4 j4Var, a2 a2Var) {
            this.f90119a = uVar;
            this.f90120b = p0Var;
            this.f90121c = j4Var;
            this.f90122d = a2Var;
        }

        public Object read(yw.p pVar) throws Exception {
            a2 a2Var = this.f90122d;
            Object a2Var2 = a2Var.getInstance();
            j4 j4Var = this.f90121c;
            k4 section = j4Var.getSection();
            a2Var.setInstance(a2Var2);
            u uVar = this.f90119a;
            uVar.e(pVar, a2Var2, j4Var);
            i2 text = section.getText();
            if (text != null) {
                uVar.c(pVar, a2Var2, text);
            }
            uVar.a(pVar, a2Var2, section);
            uVar.b(pVar, a2Var2, section);
            this.f90120b.commit(a2Var2);
            return a2Var2;
        }
    }

    public u(l0 l0Var, xw.f fVar) {
        this(l0Var, fVar, null);
    }

    public final void a(yw.p pVar, Object obj, k4 k4Var) throws Exception {
        yw.z attributes = pVar.getAttributes();
        m2 attributes2 = k4Var.getAttributes();
        Iterator<String> it = attributes.iterator();
        while (it.hasNext()) {
            yw.p attribute = pVar.getAttribute(it.next());
            if (attribute != null) {
                String attribute2 = k4Var.getAttribute(attribute.getName());
                i2 label = attributes2.getLabel(attribute2);
                if (label == null) {
                    yw.k0 position = attribute.getPosition();
                    xw.f fVar = this.f90118f;
                    l0 l0Var = this.f90117e;
                    Class type = l0Var.getType(fVar, obj);
                    if (attributes2.isStrict(l0Var) && this.f90116d.isEqual()) {
                        throw new e("Attribute '%s' does not have a match in %s at %s", attribute2, type, position);
                    }
                } else {
                    c(attribute, obj, label);
                }
            }
        }
        h(pVar, attributes2, obj);
    }

    public final void b(yw.p pVar, Object obj, k4 k4Var) throws Exception {
        m2 elements = k4Var.getElements();
        yw.p next = pVar.getNext();
        while (next != null) {
            k4 section = k4Var.getSection(next.getName());
            if (section != null) {
                i2 text = section.getText();
                if (text != null) {
                    c(next, obj, text);
                }
                a(next, obj, section);
                b(next, obj, section);
            } else {
                String path = k4Var.getPath(next.getName());
                i2 label = elements.getLabel(path);
                q qVar = this.f90115c;
                if (label == null) {
                    label = qVar.resolve(path);
                }
                if (label == null) {
                    yw.k0 position = next.getPosition();
                    xw.f fVar = this.f90118f;
                    l0 l0Var = this.f90117e;
                    Class type = l0Var.getType(fVar, obj);
                    if (elements.isStrict(l0Var) && this.f90116d.isEqual()) {
                        throw new y0("Element '%s' does not have a match in %s at %s", path, type, position);
                    }
                    next.skip();
                } else {
                    Object objC = c(next, obj, label);
                    for (String str : label.getPaths()) {
                        elements.getLabel(str);
                    }
                    if (label.isInline()) {
                        qVar.set(label, objC);
                    }
                }
            }
            next = pVar.getNext();
        }
        h(pVar, elements, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(yw.p r6, java.lang.Object r7, vw.i2 r8) throws java.lang.Exception {
        /*
            r5 = this;
            vw.l0 r0 = r5.f90117e
            vw.n0 r1 = r8.getConverter(r0)
            boolean r2 = r8.isCollection()
            vw.q r3 = r5.f90115c
            if (r2 == 0) goto L2e
            vw.l5 r2 = r3.get(r8)
            vw.i0 r4 = r8.getContact()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r2.getValue()
            java.lang.Object r1 = r1.read(r6, r2)
            goto L32
        L21:
            if (r7 == 0) goto L2e
            java.lang.Object r2 = r4.get(r7)
            if (r2 == 0) goto L2e
            java.lang.Object r1 = r1.read(r6, r2)
            goto L32
        L2e:
            java.lang.Object r1 = r1.read(r6)
        L32:
            if (r1 != 0) goto L59
            yw.k0 r6 = r6.getPosition()
            xw.f r2 = r5.f90118f
            java.lang.Class r7 = r0.getType(r2, r7)
            boolean r0 = r8.isRequired()
            if (r0 == 0) goto L62
            vw.f4 r0 = r5.f90116d
            boolean r0 = r0.isEqual()
            if (r0 != 0) goto L4d
            goto L62
        L4d:
            vw.k5 r0 = new vw.k5
            java.lang.String r1 = "Empty value for %s in %s at %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r7, r6}
            r0.<init>(r1, r6)
            throw r0
        L59:
            java.lang.Object r6 = r8.getEmpty(r0)
            if (r1 == r6) goto L62
            r3.set(r8, r1)
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.u.c(yw.p, java.lang.Object, vw.i2):java.lang.Object");
    }

    public final Object d(yw.p pVar, Object obj, j jVar) throws Exception {
        if (obj == null) {
            return obj;
        }
        yw.k0 position = pVar.getPosition();
        Object objResolve = jVar.resolve(obj);
        Class type = this.f90118f.getType();
        Class<?> cls = objResolve.getClass();
        if (type.isAssignableFrom(cls)) {
            return objResolve;
        }
        throw new y0("Type %s does not match %s at %s", cls, type, position);
    }

    public final void e(yw.p pVar, Object obj, j4 j4Var) throws Exception {
        i2 version = j4Var.getVersion();
        xw.f fVar = this.f90118f;
        Class type = fVar.getType();
        if (version != null) {
            yw.p pVar2 = (yw.p) pVar.getAttributes().remove(version.getName());
            l0 l0Var = this.f90117e;
            f4 f4Var = this.f90116d;
            if (pVar2 == null) {
                uw.s version2 = l0Var.getVersion(type);
                Double dValueOf = Double.valueOf(f4Var.getDefault());
                Double dValueOf2 = Double.valueOf(version2.revision());
                this.f90115c.set(version, dValueOf);
                f4Var.compare(dValueOf2, dValueOf);
                return;
            }
            Object objC = c(pVar2, obj, version);
            Class type2 = fVar.getType();
            if (objC != null) {
                Double dValueOf3 = Double.valueOf(l0Var.getVersion(type2).revision());
                if (objC.equals(f4Var)) {
                    return;
                }
                f4Var.compare(dValueOf3, objC);
            }
        }
    }

    public final void f(yw.p pVar, i2 i2Var) throws Exception {
        n0 converter = i2Var.getConverter(this.f90117e);
        yw.k0 position = pVar.getPosition();
        Class type = this.f90118f.getType();
        if (!converter.validate(pVar)) {
            throw new p3("Invalid value for %s in %s at %s", i2Var, type, position);
        }
        this.f90115c.set(i2Var, null);
    }

    public final void g(yw.p pVar, m2 m2Var) throws k5 {
        yw.k0 position = pVar.getPosition();
        Iterator<i2> it = m2Var.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            Class type = this.f90118f.getType();
            if (next.isRequired() && this.f90116d.isEqual()) {
                throw new k5("Unable to satisfy %s for %s at %s", next, type, position);
            }
        }
    }

    public final void h(yw.p pVar, m2 m2Var, Object obj) throws Exception {
        xw.f fVar = this.f90118f;
        l0 l0Var = this.f90117e;
        Class type = l0Var.getType(fVar, obj);
        yw.k0 position = pVar.getPosition();
        Iterator<i2> it = m2Var.iterator();
        while (it.hasNext()) {
            i2 next = it.next();
            if (next.isRequired() && this.f90116d.isEqual()) {
                throw new k5("Unable to satisfy %s for %s at %s", next, type, position);
            }
            Object empty = next.getEmpty(l0Var);
            if (empty != null) {
                this.f90115c.set(next, empty);
            }
        }
    }

    public final void i(yw.p pVar, k4 k4Var) throws Exception {
        yw.z attributes = pVar.getAttributes();
        m2 attributes2 = k4Var.getAttributes();
        Iterator<String> it = attributes.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            f4 f4Var = this.f90116d;
            l0 l0Var = this.f90117e;
            xw.f fVar = this.f90118f;
            if (!zHasNext) {
                g(pVar, attributes2);
                m2 elements = k4Var.getElements();
                yw.p next = pVar.getNext();
                while (next != null) {
                    k4 section = k4Var.getSection(next.getName());
                    if (section != null) {
                        i(next, section);
                    } else {
                        String path = k4Var.getPath(next.getName());
                        i2 label = elements.getLabel(path);
                        q qVar = this.f90115c;
                        if (label == null) {
                            label = qVar.resolve(path);
                        }
                        if (label == null) {
                            yw.k0 position = next.getPosition();
                            Class type = fVar.getType();
                            if (elements.isStrict(l0Var) && f4Var.isEqual()) {
                                throw new y0("Element '%s' does not exist for %s at %s", path, type, position);
                            }
                            next.skip();
                        } else {
                            for (String str : label.getPaths()) {
                                elements.getLabel(str);
                            }
                            if (label.isInline()) {
                                qVar.set(label, null);
                            }
                            f(next, label);
                        }
                    }
                    next = pVar.getNext();
                }
                g(pVar, elements);
                return;
            }
            yw.p attribute = pVar.getAttribute(it.next());
            if (attribute != null) {
                yw.k0 position2 = attribute.getPosition();
                String attribute2 = k4Var.getAttribute(attribute.getName());
                i2 label2 = attributes2.getLabel(attribute2);
                if (label2 == null) {
                    Class type2 = fVar.getType();
                    if (attributes2.isStrict(l0Var) && f4Var.isEqual()) {
                        throw new e("Attribute '%s' does not exist for %s at %s", attribute2, type2, position2);
                    }
                } else {
                    f(attribute, label2);
                }
            }
        }
    }

    public final void j(yw.h0 h0Var, Object obj, i2 i2Var) {
        if (obj != null) {
            i2Var.getDecorator().decorate(h0Var.setAttribute(i2Var.getName(), this.f90113a.getText(obj)));
        }
    }

    public final void k(yw.h0 h0Var, Object obj, k4 k4Var) throws Exception {
        u uVar = this;
        yw.u namespaces = h0Var.getNamespaces();
        String prefix = k4Var.getPrefix();
        xw.f fVar = uVar.f90118f;
        if (prefix != null) {
            String reference = namespaces.getReference(prefix);
            if (reference == null) {
                throw new y0("Namespace prefix '%s' in %s is not in scope", prefix, fVar);
            }
            h0Var.setReference(reference);
        }
        Iterator<i2> it = k4Var.getAttributes().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            l0 l0Var = uVar.f90117e;
            if (zHasNext) {
                i2 next = it.next();
                Object empty = next.getContact().get(obj);
                Class type = l0Var.getType(fVar, obj);
                if (empty == null) {
                    empty = next.getEmpty(l0Var);
                }
                if (empty == null && next.isRequired()) {
                    throw new e("Value for %s is null in %s", next, type);
                }
                uVar.j(h0Var, empty, next);
            } else {
                Iterator it2 = k4Var.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    d3 d3Var = uVar.f90113a;
                    if (!zHasNext2) {
                        i2 text = k4Var.getText();
                        if (text != null) {
                            Object empty2 = text.getContact().get(obj);
                            Class type2 = l0Var.getType(fVar, obj);
                            if (empty2 == null) {
                                empty2 = text.getEmpty(l0Var);
                            }
                            if (empty2 == null && text.isRequired()) {
                                throw new b5("Value for %s is null in %s", text, type2);
                            }
                            if (empty2 == null || text.isTextList()) {
                                return;
                            }
                            String text2 = d3Var.getText(empty2);
                            h0Var.setData(text.isData());
                            h0Var.setValue(text2);
                            return;
                        }
                        return;
                    }
                    String str = (String) it2.next();
                    k4 section = k4Var.getSection(str);
                    if (section != null) {
                        uVar.k(h0Var.getChild(str), obj, section);
                    } else {
                        i2 element = k4Var.getElement(k4Var.getPath(str));
                        Class type3 = l0Var.getType(fVar, obj);
                        q qVar = uVar.f90115c;
                        if (qVar.get(element) != null) {
                            continue;
                        } else {
                            if (element == null) {
                                throw new y0("Element '%s' not defined in %s", str, type3);
                            }
                            Object objReplace = element.getContact().get(obj);
                            Class type4 = l0Var.getType(fVar, obj);
                            if (objReplace == null && element.isRequired()) {
                                throw new y0("Value for %s is null in %s", element, type4);
                            }
                            if (objReplace != null) {
                                objReplace = l0Var.getCaller(objReplace.getClass()).replace(objReplace);
                            }
                            if (objReplace != null) {
                                Class<?> cls = objReplace.getClass();
                                i2 label = element.getLabel(cls);
                                String name = label.getName();
                                xw.f type5 = element.getType(cls);
                                yw.h0 child = h0Var.getChild(name);
                                if (!label.isInline()) {
                                    label.getDecorator().decorate(child, l0Var.getDecorator(type5.getType()));
                                }
                                if (label.isInline() || !d3Var.setOverride(type5, objReplace, child)) {
                                    n0 converter = label.getConverter(l0Var);
                                    child.setData(label.isData());
                                    converter.write(child, objReplace);
                                }
                            }
                            qVar.set(element, objReplace);
                        }
                    }
                    uVar = this;
                }
            }
        }
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 d3Var = this.f90113a.getInstance(pVar);
        Class type = d3Var.getType();
        if (d3Var.isReference()) {
            return d3Var.getInstance();
        }
        l0 l0Var = this.f90117e;
        if (l0Var.isPrimitive(type)) {
            Class type2 = d3Var.getType();
            Object obj = this.f90114b.read(pVar, type2);
            if (type2 != null) {
                d3Var.setInstance(obj);
            }
            return obj;
        }
        j4 schema = l0Var.getSchema(type);
        j caller = schema.getCaller();
        boolean zIsDefault = schema.getInstantiator().isDefault();
        q qVar = this.f90115c;
        Object obj2 = (zIsDefault ? new a(this, qVar, schema, d3Var) : new v(this, qVar, schema, d3Var)).read(pVar);
        caller.validate(obj2);
        caller.commit(obj2);
        d3Var.setInstance(obj2);
        return d(pVar, obj2, caller);
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        a2 d3Var = this.f90113a.getInstance(pVar);
        if (d3Var.isReference()) {
            return true;
        }
        d3Var.setInstance(null);
        j4 schema = this.f90117e.getSchema(d3Var.getType());
        k4 section = schema.getSection();
        i2 text = schema.getText();
        if (text != null) {
            f(pVar, text);
        }
        i(pVar, section);
        return pVar.isElement();
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        j4 schema = this.f90117e.getSchema(obj.getClass());
        j caller = schema.getCaller();
        try {
            if (schema.isPrimitive()) {
                this.f90114b.write(h0Var, obj);
            } else {
                caller.persist(obj);
                k4 section = schema.getSection();
                f4 f4Var = this.f90116d;
                uw.s revision = schema.getRevision();
                i2 version = schema.getVersion();
                if (revision != null) {
                    Double dValueOf = Double.valueOf(f4Var.getDefault());
                    Double dValueOf2 = Double.valueOf(revision.revision());
                    if (!f4Var.compare(dValueOf2, dValueOf) || version.isRequired()) {
                        j(h0Var, dValueOf2, version);
                    }
                }
                k(h0Var, obj, section);
            }
            caller.complete(obj);
        } catch (Throwable th2) {
            caller.complete(obj);
            throw th2;
        }
    }

    public u(l0 l0Var, xw.f fVar, Class cls) {
        this.f90113a = new d3(l0Var, fVar, cls);
        this.f90114b = new s3(l0Var, fVar);
        this.f90115c = new q();
        this.f90116d = new f4();
        this.f90117e = l0Var;
        this.f90118f = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        j4 schema = this.f90117e.getSchema(obj.getClass());
        j caller = schema.getCaller();
        k4 section = schema.getSection();
        e(pVar, obj, schema);
        i2 text = section.getText();
        if (text != null) {
            c(pVar, obj, text);
        }
        a(pVar, obj, section);
        b(pVar, obj, section);
        this.f90115c.commit(obj);
        caller.validate(obj);
        caller.commit(obj);
        return d(pVar, obj, caller);
    }
}
