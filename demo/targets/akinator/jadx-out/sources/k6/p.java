package k6;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f70622a;

    /* renamed from: b, reason: collision with root package name */
    public String f70623b = "appassets.androidplatform.net";

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f70624c = new ArrayList();

    public p addPathHandler(String str, q qVar) {
        this.f70624c.add(w3.e.create(str, qVar));
        return this;
    }

    public s build() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f70624c.iterator();
        while (it.hasNext()) {
            w3.e eVar = (w3.e) it.next();
            arrayList.add(new r(this.f70623b, (String) eVar.f90368a, this.f70622a, (q) eVar.f90369b));
        }
        return new s(arrayList);
    }

    public p setDomain(String str) {
        this.f70623b = str;
        return this;
    }

    public p setHttpAllowed(boolean z10) {
        this.f70622a = z10;
        return this;
    }
}
