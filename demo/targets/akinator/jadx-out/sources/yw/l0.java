package yw;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l0 extends LinkedHashMap implements u {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f96725b;

    public l0(h0 h0Var) {
        this.f96725b = h0Var;
    }

    @Override // yw.u
    public String getPrefix() {
        return this.f96725b.getPrefix();
    }

    @Override // yw.u
    public String getReference(String str) {
        if (containsValue(str)) {
            Iterator<String> it = iterator();
            while (it.hasNext()) {
                String next = it.next();
                String str2 = (String) get(next);
                if (str2 != null && str2.equals(str)) {
                    return next;
                }
            }
        }
        u namespaces = this.f96725b.getNamespaces();
        if (namespaces != null) {
            return namespaces.getReference(str);
        }
        return null;
    }

    @Override // yw.u, java.lang.Iterable
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    @Override // yw.u
    public String setReference(String str) {
        return setReference(str, "");
    }

    @Override // yw.u
    public String getPrefix(String str) {
        String str2;
        if (size() > 0 && (str2 = (String) get(str)) != null) {
            return str2;
        }
        u namespaces = this.f96725b.getNamespaces();
        if (namespaces == null) {
            return null;
        }
        String prefix = namespaces.getPrefix(str);
        if (containsValue(prefix)) {
            return null;
        }
        return prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // yw.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String setReference(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            yw.h0 r0 = r3.f96725b
            yw.u r0 = r0.getNamespaces()
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getPrefix(r4)
            boolean r2 = r3.containsValue(r0)
            if (r2 != 0) goto L14
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L18
            return r1
        L18:
            java.lang.Object r4 = r3.put(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.l0.setReference(java.lang.String, java.lang.String):java.lang.String");
    }
}
