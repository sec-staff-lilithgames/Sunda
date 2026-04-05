package c8;

import com.apm.insight.b.El.rJqlArycrfkilN;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11865a = d8.a.of(rJqlArycrfkilN.onibtvbaxHpGjq, "x", "y");

    public static y7.o a(d8.c cVar, r7.h hVar) throws IOException {
        cVar.beginObject();
        y7.e eVar = null;
        y7.b bVar = null;
        boolean z10 = false;
        y7.b bVar2 = null;
        while (cVar.peek() != d8.b.f51927f) {
            int iSelectName = cVar.selectName(f11865a);
            if (iSelectName != 0) {
                d8.b bVar3 = d8.b.f51929h;
                if (iSelectName != 1) {
                    if (iSelectName != 2) {
                        cVar.skipName();
                        cVar.skipValue();
                    } else if (cVar.peek() == bVar3) {
                        cVar.skipValue();
                        z10 = true;
                    } else {
                        bVar = d.parseFloat(cVar, hVar);
                    }
                } else if (cVar.peek() == bVar3) {
                    cVar.skipValue();
                    z10 = true;
                } else {
                    bVar2 = d.parseFloat(cVar, hVar);
                }
            } else {
                eVar = parse(cVar, hVar);
            }
        }
        cVar.endObject();
        if (z10) {
            hVar.addWarning("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new y7.i(bVar2, bVar);
    }

    public static y7.e parse(d8.c cVar, r7.h hVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.peek() == d8.b.f51924b) {
            cVar.beginArray();
            while (cVar.hasNext()) {
                d8.c cVar2 = cVar;
                r7.h hVar2 = hVar;
                arrayList.add(new u7.o(hVar2, t.b(cVar2, hVar2, e8.n.dpScale(), y.f11928a, cVar.peek() == d8.b.f51926e, false)));
                cVar = cVar2;
                hVar = hVar2;
            }
            cVar.endArray();
            u.setEndFrames(arrayList);
        } else {
            arrayList.add(new f8.a(s.b(cVar, e8.n.dpScale())));
        }
        return new y7.e(arrayList);
    }
}
