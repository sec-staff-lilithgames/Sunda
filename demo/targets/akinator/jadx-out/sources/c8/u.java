package c8;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11919a = d8.a.of(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(d8.c cVar, r7.h hVar, float f10, l0 l0Var, boolean z10) throws IOException {
        d8.c cVar2;
        r7.h hVar2;
        float f11;
        l0 l0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.peek() == d8.b.f51929h) {
            hVar.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.beginObject();
        while (cVar.hasNext()) {
            if (cVar.selectName(f11919a) != 0) {
                cVar.skipValue();
            } else if (cVar.peek() == d8.b.f51924b) {
                cVar.beginArray();
                if (cVar.peek() == d8.b.f51930i) {
                    d8.c cVar3 = cVar;
                    r7.h hVar3 = hVar;
                    float f12 = f10;
                    l0 l0Var3 = l0Var;
                    boolean z12 = z10;
                    f8.a aVarB = t.b(cVar3, hVar3, f12, l0Var3, false, z12);
                    cVar2 = cVar3;
                    hVar2 = hVar3;
                    f11 = f12;
                    l0Var2 = l0Var3;
                    z11 = z12;
                    arrayList.add(aVarB);
                } else {
                    cVar2 = cVar;
                    hVar2 = hVar;
                    f11 = f10;
                    l0Var2 = l0Var;
                    z11 = z10;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.b(cVar2, hVar2, f11, l0Var2, true, z11));
                    }
                }
                cVar2.endArray();
                cVar = cVar2;
                hVar = hVar2;
                f10 = f11;
                l0Var = l0Var2;
                z10 = z11;
            } else {
                d8.c cVar4 = cVar;
                arrayList.add(t.b(cVar4, hVar, f10, l0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends f8.a> list) {
        int i10;
        Object obj;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            f8.a aVar = list.get(i11);
            i11++;
            f8.a aVar2 = list.get(i11);
            aVar.f55495h = Float.valueOf(aVar2.f55494g);
            if (aVar.f55490c == null && (obj = aVar2.f55489b) != null) {
                aVar.f55490c = obj;
                if (aVar instanceof u7.o) {
                    ((u7.o) aVar).createPath();
                }
            }
        }
        f8.a aVar3 = list.get(i10);
        if ((aVar3.f55489b == null || aVar3.f55490c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
