package com.iab.omid.library.odeeoio.c;

import android.view.View;
import com.iab.omid.library.odeeoio.c.a;
import com.iab.omid.library.odeeoio.d.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f31205a;

    public c(a aVar) {
        this.f31205a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.odeeoio.b.a aVarA = com.iab.omid.library.odeeoio.b.a.a();
        if (aVarA != null) {
            Collection<com.iab.omid.library.odeeoio.adsession.a> collectionC = aVarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<com.iab.omid.library.odeeoio.adsession.a> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && f.c(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA = f.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && f.a(arrayList.get(size - 1)) > fA) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.odeeoio.c.a
    public JSONObject a(View view) {
        return com.iab.omid.library.odeeoio.d.b.a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.odeeoio.c.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0197a interfaceC0197a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0197a.a(it.next(), this.f31205a, jSONObject, z11);
        }
    }
}
