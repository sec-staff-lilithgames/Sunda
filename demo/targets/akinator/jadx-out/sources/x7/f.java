package x7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f91781c = new f("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f91782a;

    /* renamed from: b, reason: collision with root package name */
    public g f91783b;

    public f(String... strArr) {
        this.f91782a = Arrays.asList(strArr);
    }

    public f addKey(String str) {
        f fVar = new f(this);
        fVar.f91782a.add(str);
        return fVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            if (!this.f91782a.equals(fVar.f91782a)) {
                return false;
            }
            g gVar = this.f91783b;
            g gVar2 = fVar.f91783b;
            if (gVar != null) {
                return gVar.equals(gVar2);
            }
            if (gVar2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fullyResolvesTo(java.lang.String r8, int r9) {
        /*
            r7 = this;
            java.util.List r0 = r7.f91782a
            int r1 = r0.size()
            r2 = 0
            if (r9 < r1) goto Lb
            goto L87
        Lb:
            int r1 = r0.size()
            r3 = 1
            int r1 = r1 - r3
            if (r9 != r1) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.lang.Object r4 = r0.get(r9)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "**"
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L4f
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L35
            java.lang.String r8 = "*"
            boolean r8 = r4.equals(r8)
            if (r8 == 0) goto L33
            goto L35
        L33:
            r8 = r2
            goto L36
        L35:
            r8 = r3
        L36:
            if (r1 != 0) goto L4c
            int r1 = r0.size()
            int r1 = r1 + (-2)
            if (r9 != r1) goto L87
            java.lang.Object r9 = p0.o2.g(r3, r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L87
        L4c:
            if (r8 == 0) goto L87
            goto L7e
        L4f:
            if (r1 != 0) goto L7c
            int r4 = r9 + 1
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L7c
            int r8 = r0.size()
            int r8 = r8 + (-2)
            if (r9 == r8) goto L7e
            int r8 = r0.size()
            int r8 = r8 + (-3)
            if (r9 != r8) goto L87
            java.lang.Object r8 = p0.o2.g(r3, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L87
            goto L7e
        L7c:
            if (r1 == 0) goto L7f
        L7e:
            return r3
        L7f:
            int r9 = r9 + r3
            int r1 = r0.size()
            int r1 = r1 - r3
            if (r9 >= r1) goto L88
        L87:
            return r2
        L88:
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r8 = r9.equals(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.f.fullyResolvesTo(java.lang.String, int):boolean");
    }

    public g getResolvedElement() {
        return this.f91783b;
    }

    public int hashCode() {
        int iHashCode = this.f91782a.hashCode() * 31;
        g gVar = this.f91783b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public int incrementDepthBy(String str, int i10) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f91782a;
        if (((String) list.get(i10)).equals("**")) {
            return (i10 != list.size() - 1 && ((String) list.get(i10 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.f91782a.toString();
    }

    public boolean matches(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f91782a;
        if (i10 >= list.size()) {
            return false;
        }
        return ((String) list.get(i10)).equals(str) || ((String) list.get(i10)).equals("**") || ((String) list.get(i10)).equals("*");
    }

    public boolean propagateToChildren(String str, int i10) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f91782a;
        return i10 < list.size() - 1 || ((String) list.get(i10)).equals("**");
    }

    public f resolve(g gVar) {
        f fVar = new f(this);
        fVar.f91783b = gVar;
        return fVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("KeyPath{keys=");
        sb2.append(this.f91782a);
        sb2.append(",resolved=");
        return a.b.p(sb2, this.f91783b != null, AbstractJsonLexerKt.END_OBJ);
    }

    public f(f fVar) {
        this.f91782a = new ArrayList(fVar.f91782a);
        this.f91783b = fVar.f91783b;
    }
}
