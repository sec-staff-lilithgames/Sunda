package com.iab.omid.library.appodeal.processor;

import android.view.View;
import com.iab.omid.library.appodeal.processor.a;
import com.iab.omid.library.appodeal.utils.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f30411a;

    public c(a aVar) {
        this.f30411a = aVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            Collection<com.iab.omid.library.appodeal.adsession.a> collectionA = cVarC.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionA.size() * 2) + 3);
            Iterator<com.iab.omid.library.appodeal.adsession.a> it = collectionA.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && h.g(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fD = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > fD) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.appodeal.processor.a
    public JSONObject a(View view) throws JSONException {
        JSONObject jSONObjectA = com.iab.omid.library.appodeal.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.appodeal.utils.c.a(jSONObjectA, e.a());
        return jSONObjectA;
    }

    @Override // com.iab.omid.library.appodeal.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0173a interfaceC0173a, boolean z10, boolean z11) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0173a.a(it.next(), this.f30411a, jSONObject, z11);
        }
    }
}
