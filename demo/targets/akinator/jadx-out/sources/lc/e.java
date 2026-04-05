package lc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final int f73094g = cd.h.values().length;

    /* renamed from: b, reason: collision with root package name */
    public final c f73095b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f73096c;

    /* renamed from: e, reason: collision with root package name */
    public b0[] f73097e;

    /* renamed from: f, reason: collision with root package name */
    public Map f73098f;

    public e() {
        this(c.f73086c, new b0(), null, null);
    }

    public e copy() {
        b0[] b0VarArr;
        b0[] b0VarArr2 = this.f73097e;
        HashMap map = null;
        if (b0VarArr2 == null) {
            b0VarArr = null;
        } else {
            int length = b0VarArr2.length;
            b0VarArr = new b0[length];
            for (int i10 = 0; i10 < length; i10++) {
                b0 b0Var = this.f73097e[i10];
                b0VarArr[i10] = b0Var == null ? null : b0Var.copy();
            }
        }
        if (this.f73098f != null) {
            map = new HashMap();
            for (Map.Entry entry : this.f73098f.entrySet()) {
                map.put(entry.getKey(), ((b0) entry.getValue()).copy());
            }
        }
        return new e(this.f73095b, this.f73096c.copy(), b0VarArr, map);
    }

    public b0 defaultCoercions() {
        return this.f73096c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3.isEnabled(jc.l.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r3.isEnabled(jc.l.ACCEPT_FLOAT_AS_INT) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009a, code lost:
    
        if (r3.isEnabled(jc.l.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lc.c findCoercion(jc.j r3, cd.h r4, java.lang.Class<?> r5, lc.f r6) {
        /*
            r2 = this;
            java.util.Map r0 = r2.f73098f
            if (r0 == 0) goto L15
            if (r5 == 0) goto L15
            java.lang.Object r5 = r0.get(r5)
            lc.b0 r5 = (lc.b0) r5
            if (r5 == 0) goto L15
            lc.c r5 = r5.findAction(r6)
            if (r5 == 0) goto L15
            return r5
        L15:
            lc.b0[] r5 = r2.f73097e
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L2a
            int r0 = r4.ordinal()
            r5 = r5[r0]
            if (r5 == 0) goto L2a
            lc.c r5 = r5.findAction(r6)
            if (r5 == 0) goto L2a
            return r5
        L2a:
            lc.b0 r5 = r2.f73096c
            lc.c r5 = r5.findAction(r6)
            if (r5 == 0) goto L33
            return r5
        L33:
            int r5 = r6.ordinal()
            r0 = 2
            cd.h r1 = cd.h.f12144h
            if (r5 == r0) goto L57
            r0 = 3
            if (r5 == r0) goto L4c
            r0 = 7
            if (r5 == r0) goto L43
            goto L64
        L43:
            jc.l r4 = jc.l.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT
            boolean r3 = r3.isEnabled(r4)
            if (r3 == 0) goto L9d
            goto La0
        L4c:
            if (r4 != r1) goto L64
            jc.l r4 = jc.l.ACCEPT_FLOAT_AS_INT
            boolean r3 = r3.isEnabled(r4)
            if (r3 == 0) goto L9d
            goto L8f
        L57:
            cd.h r5 = cd.h.f12147k
            if (r4 != r5) goto L64
            jc.l r5 = jc.l.f69351k
            boolean r5 = r3.isEnabled(r5)
            if (r5 == 0) goto L64
            goto L9d
        L64:
            cd.h r5 = cd.h.f12145i
            if (r4 == r5) goto L75
            if (r4 == r1) goto L75
            cd.h r0 = cd.h.f12146j
            if (r4 == r0) goto L75
            cd.h r0 = cd.h.f12150n
            if (r4 != r0) goto L73
            goto L75
        L73:
            r0 = 0
            goto L76
        L75:
            r0 = 1
        L76:
            if (r0 == 0) goto L87
            jc.y r1 = jc.y.ALLOW_COERCION_OF_SCALARS
            boolean r1 = r3.isEnabled(r1)
            if (r1 != 0) goto L87
            if (r4 != r5) goto L9d
            lc.f r5 = lc.f.f73104b
            if (r6 == r5) goto L87
            goto L9d
        L87:
            lc.f r5 = lc.f.f73109h
            if (r6 != r5) goto La3
            cd.h r5 = cd.h.f12151o
            if (r4 != r5) goto L92
        L8f:
            lc.c r3 = lc.c.f73086c
            return r3
        L92:
            if (r0 != 0) goto La0
            jc.l r4 = jc.l.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT
            boolean r3 = r3.isEnabled(r4)
            if (r3 == 0) goto L9d
            goto La0
        L9d:
            lc.c r3 = lc.c.f73085b
            return r3
        La0:
            lc.c r3 = lc.c.f73087e
            return r3
        La3:
            lc.c r3 = r2.f73095b
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.e.findCoercion(jc.j, cd.h, java.lang.Class, lc.f):lc.c");
    }

    public c findCoercionFromBlankString(jc.j jVar, cd.h hVar, Class<?> cls, c cVar) {
        Boolean acceptBlankAsEmpty;
        c cVarFindAction;
        b0 b0Var;
        b0 b0Var2;
        Map map = this.f73098f;
        f fVar = f.f73109h;
        if (map == null || cls == null || (b0Var2 = (b0) map.get(cls)) == null) {
            acceptBlankAsEmpty = null;
            cVarFindAction = null;
        } else {
            acceptBlankAsEmpty = b0Var2.getAcceptBlankAsEmpty();
            cVarFindAction = b0Var2.findAction(fVar);
        }
        b0[] b0VarArr = this.f73097e;
        if (b0VarArr != null && hVar != null && (b0Var = b0VarArr[hVar.ordinal()]) != null) {
            if (acceptBlankAsEmpty == null) {
                acceptBlankAsEmpty = b0Var.getAcceptBlankAsEmpty();
            }
            if (cVarFindAction == null) {
                cVarFindAction = b0Var.findAction(fVar);
            }
        }
        b0 b0Var3 = this.f73096c;
        if (acceptBlankAsEmpty == null) {
            acceptBlankAsEmpty = b0Var3.getAcceptBlankAsEmpty();
        }
        if (cVarFindAction == null) {
            cVarFindAction = b0Var3.findAction(fVar);
        }
        if (!Boolean.FALSE.equals(acceptBlankAsEmpty)) {
            if (cVarFindAction != null) {
                return cVarFindAction;
            }
            cd.h hVar2 = cd.h.f12145i;
            c cVar2 = c.f73087e;
            if (hVar == hVar2 || hVar == cd.h.f12144h || hVar == cd.h.f12146j || hVar == cd.h.f12150n || jVar.isEnabled(jc.l.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return cVar2;
            }
        }
        return cVar;
    }

    public b0 findOrCreateCoercion(cd.h hVar) {
        if (this.f73097e == null) {
            this.f73097e = new b0[f73094g];
        }
        b0 b0Var = this.f73097e[hVar.ordinal()];
        if (b0Var != null) {
            return b0Var;
        }
        b0[] b0VarArr = this.f73097e;
        int iOrdinal = hVar.ordinal();
        b0 b0Var2 = new b0();
        b0VarArr[iOrdinal] = b0Var2;
        return b0Var2;
    }

    public e(c cVar, b0 b0Var, b0[] b0VarArr, HashMap map) {
        this.f73096c = b0Var;
        this.f73095b = cVar;
        this.f73097e = b0VarArr;
        this.f73098f = map;
    }

    public b0 findOrCreateCoercion(Class<?> cls) {
        if (this.f73098f == null) {
            this.f73098f = new HashMap();
        }
        b0 b0Var = (b0) this.f73098f.get(cls);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        this.f73098f.put(cls, b0Var2);
        return b0Var2;
    }
}
