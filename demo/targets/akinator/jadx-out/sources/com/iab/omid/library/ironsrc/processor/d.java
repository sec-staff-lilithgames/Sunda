package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.ironsrc.processor.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f30948a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0189a interfaceC0189a, boolean z10) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0189a.a((View) it2.next(), this, jSONObject, z10);
            }
        }
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public JSONObject a(View view) {
        if (view == null) {
            return com.iab.omid.library.ironsrc.utils.c.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f30948a);
        int[] iArr = this.f30948a;
        return com.iab.omid.library.ironsrc.utils.c.a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.ironsrc.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0189a interfaceC0189a, boolean z10, boolean z11) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z10) {
                b(viewGroup, jSONObject, interfaceC0189a, z11);
            } else {
                a(viewGroup, jSONObject, interfaceC0189a, z11);
            }
        }
    }

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0189a interfaceC0189a, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            interfaceC0189a.a(viewGroup.getChildAt(i10), this, jSONObject, z10);
        }
    }
}
