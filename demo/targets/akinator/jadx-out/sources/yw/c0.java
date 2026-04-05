package yw;

import java.io.Writer;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f96673a;

    /* renamed from: b, reason: collision with root package name */
    public final k f96674b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f96675c;

    public c0(Writer writer) {
        this(writer, new j());
    }

    public final void a(h0 h0Var) throws Exception {
        String name = h0Var.getName();
        String prefix = h0Var.getPrefix(false);
        if (h0Var.getValue() != null) {
            c(h0Var);
        }
        if (name != null) {
            k kVar = this.f96674b;
            kVar.writeEnd(name, prefix);
            kVar.flush();
        }
    }

    public final void b(h0 h0Var) throws Exception {
        String comment = h0Var.getComment();
        k kVar = this.f96674b;
        if (comment != null) {
            kVar.writeComment(comment);
        }
        String prefix = h0Var.getPrefix(false);
        String name = h0Var.getName();
        if (name != null) {
            kVar.writeStart(name, prefix);
        }
        z attributes = h0Var.getAttributes();
        for (String str : attributes) {
            h0 h0Var2 = (h0) attributes.get(str);
            kVar.writeAttribute(str, h0Var2.getValue(), h0Var2.getPrefix(false));
        }
        this.f96675c.remove(h0Var);
        u namespaces = h0Var.getNamespaces();
        for (String str2 : namespaces) {
            kVar.writeNamespace(str2, namespaces.getPrefix(str2));
        }
    }

    public final void c(h0 h0Var) throws Exception {
        t mode = h0Var.getMode();
        String value = h0Var.getValue();
        if (value != null) {
            Iterator<h0> it = this.f96673a.iterator();
            while (it.hasNext()) {
                h0 next = it.next();
                if (mode != t.f96761e) {
                    break;
                } else {
                    mode = next.getMode();
                }
            }
            this.f96674b.writeText(value, mode);
        }
        h0Var.setValue(null);
    }

    public void commit(h0 h0Var) throws Exception {
        j0 j0Var = this.f96673a;
        if (j0Var.contains(h0Var)) {
            h0 pVar = j0Var.top();
            if (!isCommitted(pVar)) {
                b(pVar);
            }
            while (j0Var.top() != h0Var) {
                a(j0Var.pop());
            }
            a(h0Var);
            j0Var.pop();
        }
    }

    public boolean isCommitted(h0 h0Var) {
        return !this.f96675c.contains(h0Var);
    }

    public boolean isRoot(h0 h0Var) {
        return this.f96673a.bottom() == h0Var;
    }

    public void remove(h0 h0Var) throws Exception {
        j0 j0Var = this.f96673a;
        if (j0Var.top() != h0Var) {
            throw new x("Cannot remove node");
        }
        j0Var.pop();
    }

    public h0 writeElement(h0 h0Var, String str) throws Exception {
        j0 j0Var = this.f96673a;
        if (j0Var.isEmpty()) {
            g0 g0Var = new g0(h0Var, this, str);
            if (str != null) {
                return j0Var.push(g0Var);
            }
            throw new x("Can not have a null name");
        }
        if (!j0Var.contains(h0Var)) {
            return null;
        }
        h0 pVar = j0Var.top();
        if (!isCommitted(pVar)) {
            b(pVar);
        }
        while (j0Var.top() != h0Var) {
            a(j0Var.pop());
        }
        if (!j0Var.isEmpty()) {
            c(h0Var);
        }
        g0 g0Var2 = new g0(h0Var, this, str);
        if (str != null) {
            return j0Var.push(g0Var2);
        }
        throw new x("Can not have a null name");
    }

    public h0 writeRoot() throws Exception {
        j0 j0Var = this.f96673a;
        f0 f0Var = new f0(this, j0Var);
        if (j0Var.isEmpty()) {
            this.f96674b.writeProlog();
        }
        return f0Var;
    }

    public c0(Writer writer, j jVar) {
        this.f96674b = new k(writer, jVar);
        HashSet hashSet = new HashSet();
        this.f96675c = hashSet;
        this.f96673a = new j0(hashSet);
    }
}
