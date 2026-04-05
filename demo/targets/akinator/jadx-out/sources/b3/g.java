package b3;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g extends b implements Iterable {
    public g(char[] cArr) {
        super(cArr);
    }

    public static g allocate(char[] cArr) {
        return new g(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        f fVar = new f();
        fVar.f8732c = 0;
        fVar.f8731b = this;
        return fVar;
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // b3.c
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder("{ ");
        Iterator it = this.f8723h.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cVar.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // b3.c
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder("");
        sb2.append("{\n");
        Iterator it = this.f8723h.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cVar.toFormattedJSON(i10 + 2, i11 - 1));
        }
        sb2.append("\n");
        c.a(i10, sb2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // b3.b, b3.c
    /* renamed from: clone */
    public g mo128clone() {
        return (g) super.mo128clone();
    }
}
