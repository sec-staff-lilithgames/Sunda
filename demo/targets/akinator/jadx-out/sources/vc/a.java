package vc;

import jc.t;
import tb.c1;
import tb.n;
import yc.o;
import yc.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final v f89201a;

    @n
    public a(v vVar) {
        this.f89201a = vVar;
    }

    public static t getDefaultSchemaNode() {
        v vVarObjectNode = o.f94329c.objectNode();
        vVarObjectNode.put("type", "any");
        return vVarObjectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        v vVar = ((a) obj).f89201a;
        v vVar2 = this.f89201a;
        return vVar2 == null ? vVar == null : vVar2.equals(vVar);
    }

    @c1
    public v getSchemaNode() {
        return this.f89201a;
    }

    public int hashCode() {
        return this.f89201a.hashCode();
    }

    public String toString() {
        return this.f89201a.toString();
    }
}
