package ll;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f73392a = new ConcurrentHashMap();

    public Object getQueryInfo(String str) {
        return this.f73392a.get(str);
    }

    public void put(String str, Object obj) {
        this.f73392a.put(str, obj);
    }
}
