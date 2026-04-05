package q8;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f82575a = new g(null);

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f82576b = new HashMap();

    public Object get(q qVar) {
        HashMap map = this.f82576b;
        g gVar = (g) map.get(qVar);
        if (gVar == null) {
            gVar = new g(qVar);
            map.put(qVar, gVar);
        } else {
            qVar.offer();
        }
        g gVar2 = gVar.f82574d;
        gVar2.f82573c = gVar.f82573c;
        gVar.f82573c.f82574d = gVar2;
        g gVar3 = this.f82575a;
        gVar.f82574d = gVar3;
        g gVar4 = gVar3.f82573c;
        gVar.f82573c = gVar4;
        gVar4.f82574d = gVar;
        gVar.f82574d.f82573c = gVar;
        return gVar.removeLast();
    }

    public void put(q qVar, Object obj) {
        HashMap map = this.f82576b;
        g gVar = (g) map.get(qVar);
        if (gVar == null) {
            gVar = new g(qVar);
            gVar.f82574d = gVar;
            g gVar2 = this.f82575a;
            gVar.f82574d = gVar2.f82574d;
            gVar.f82573c = gVar2;
            gVar2.f82574d = gVar;
            gVar.f82574d.f82573c = gVar;
            map.put(qVar, gVar);
        } else {
            qVar.offer();
        }
        gVar.add(obj);
    }

    public Object removeLast() {
        g gVar = this.f82575a;
        g gVar2 = gVar.f82574d;
        while (true) {
            boolean zEquals = gVar2.equals(gVar);
            Object obj = gVar2.f82571a;
            if (zEquals) {
                return null;
            }
            Object objRemoveLast = gVar2.removeLast();
            if (objRemoveLast != null) {
                return objRemoveLast;
            }
            g gVar3 = gVar2.f82574d;
            gVar3.f82573c = gVar2.f82573c;
            gVar2.f82573c.f82574d = gVar3;
            this.f82576b.remove(obj);
            ((q) obj).offer();
            gVar2 = gVar2.f82574d;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        g gVar = this.f82575a;
        g gVar2 = gVar.f82573c;
        boolean z10 = false;
        while (!gVar2.equals(gVar)) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb2.append(gVar2.f82571a);
            sb2.append(AbstractJsonLexerKt.COLON);
            sb2.append(gVar2.size());
            sb2.append("}, ");
            gVar2 = gVar2.f82573c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(PcrIk.eOaul);
        return sb2.toString();
    }
}
