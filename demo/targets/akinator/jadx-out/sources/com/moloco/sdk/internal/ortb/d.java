package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.ortb.model.e;
import com.moloco.sdk.internal.ortb.model.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import sv.x;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final x f46078a = new x("\\$\\{AUCTION_PRICE\\}");

    public static final e a(e eVar) {
        e0.checkNotNullParameter(eVar, "<this>");
        List<s> listB = eVar.b();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            List<com.moloco.sdk.internal.ortb.model.c> listB2 = ((s) it.next()).b();
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(listB2, 10));
            for (com.moloco.sdk.internal.ortb.model.c cVar : listB2) {
                float fG = cVar.g();
                String strA = a(cVar.a(), Float.valueOf(fG));
                String strC = cVar.c();
                arrayList2.add(new com.moloco.sdk.internal.ortb.model.c(strA, fG, strC != null ? a(strC, Float.valueOf(fG)) : null, cVar.e()));
            }
            arrayList.add(new s(arrayList2));
        }
        return new e(arrayList);
    }

    public static final String a(String str, Float f10) {
        String string;
        e0.checkNotNullParameter(str, "<this>");
        if (f10 == null || (string = f10.toString()) == null) {
            string = "";
        }
        return f46078a.replace(str, string);
    }
}
