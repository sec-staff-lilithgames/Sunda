package b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends c {
    public j(char[] cArr) {
        super(cArr);
    }

    public static c allocate(char[] cArr) {
        return new j(cArr);
    }

    public static j from(String str) {
        j jVar = new j(str.toCharArray());
        jVar.setStart(0L);
        jVar.setEnd(str.length() - 1);
        return jVar;
    }

    @Override // b3.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && content().equals(((j) obj).content())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // b3.c
    public int hashCode() {
        return super.hashCode();
    }

    @Override // b3.c
    public final String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        c.a(i10, sb2);
        sb2.append("'");
        sb2.append(content());
        sb2.append("'");
        return sb2.toString();
    }

    @Override // b3.c
    public final String toJSON() {
        return "'" + content() + "'";
    }
}
