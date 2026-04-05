package b3;

import j1.o2;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: i, reason: collision with root package name */
    public static final ArrayList f8729i;

    static {
        ArrayList arrayList = new ArrayList();
        f8729i = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public d(char[] cArr) {
        super(cArr);
    }

    public static c allocate(char[] cArr) {
        return new d(cArr);
    }

    @Override // b3.b, b3.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(getName(), ((d) obj).getName())) {
            return super.equals(obj);
        }
        return false;
    }

    public String getName() {
        return content();
    }

    public c getValue() {
        if (this.f8723h.size() > 0) {
            return (c) this.f8723h.get(0);
        }
        return null;
    }

    @Override // b3.b, b3.c
    public int hashCode() {
        return super.hashCode();
    }

    public void set(c cVar) {
        if (this.f8723h.size() > 0) {
            this.f8723h.set(0, cVar);
        } else {
            this.f8723h.add(cVar);
        }
    }

    @Override // b3.c
    public final String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder("");
        c.a(i10, sb2);
        String strContent = content();
        if (this.f8723h.size() <= 0) {
            return o2.l(strContent, ": <> ");
        }
        sb2.append(strContent);
        sb2.append(": ");
        if (f8729i.contains(strContent)) {
            i11 = 3;
        }
        if (i11 > 0) {
            sb2.append(((c) this.f8723h.get(0)).toFormattedJSON(i10, i11 - 1));
        } else {
            String json = ((c) this.f8723h.get(0)).toJSON();
            if (json.length() + i10 < 80) {
                sb2.append(json);
            } else {
                sb2.append(((c) this.f8723h.get(0)).toFormattedJSON(i10, i11 - 1));
            }
        }
        return sb2.toString();
    }

    @Override // b3.c
    public final String toJSON() {
        if (this.f8723h.size() <= 0) {
            return "" + content() + ": <> ";
        }
        return "" + content() + ": " + ((c) this.f8723h.get(0)).toJSON();
    }

    public static c allocate(String str, c cVar) {
        d dVar = new d(str.toCharArray());
        dVar.setStart(0L);
        dVar.setEnd(str.length() - 1);
        dVar.set(cVar);
        return dVar;
    }
}
