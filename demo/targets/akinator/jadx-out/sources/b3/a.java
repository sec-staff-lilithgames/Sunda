package b3;

import com.ironsource.C3191e4;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a extends b {
    public a(char[] cArr) {
        super(cArr);
    }

    public static c allocate(char[] cArr) {
        return new a(cArr);
    }

    @Override // b3.c
    public final String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= 80) {
            sb2.append("[\n");
            Iterator it = this.f8723h.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                int i12 = i10 + 2;
                c.a(i12, sb2);
                sb2.append(cVar.toFormattedJSON(i12, i11 - 1));
            }
            sb2.append("\n");
            c.a(i10, sb2);
            sb2.append(C3191e4.i.f36531e);
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // b3.c
    public final String toJSON() {
        StringBuilder sb2 = new StringBuilder(C3191e4.i.f36529d);
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f8723h.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(((c) this.f8723h.get(i10)).toJSON());
        }
        return ((Object) sb2) + C3191e4.i.f36531e;
    }
}
