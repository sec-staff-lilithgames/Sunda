package io.bidmachine.iab.vast;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f60553a = new WeakHashMap();

    public static synchronized t get(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f60553a.entrySet().iterator();
        while (it.hasNext()) {
            t tVar = (t) ((Map.Entry) it.next()).getKey();
            if (tVar.getId().equals(str)) {
                return tVar;
            }
        }
        return null;
    }

    public static synchronized void store(t tVar) {
        if (tVar == null) {
            return;
        }
        f60553a.put(tVar, Boolean.TRUE);
    }
}
