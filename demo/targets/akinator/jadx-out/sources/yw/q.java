package yw;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q extends LinkedHashMap implements z {

    /* renamed from: b, reason: collision with root package name */
    public final p f96743b;

    public q(n nVar) {
        this.f96743b = nVar;
    }

    @Override // yw.z
    public String getName() {
        return this.f96743b.getName();
    }

    @Override // yw.z, java.lang.Iterable
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    @Override // yw.z
    public p get(String str) {
        return (p) super.get((Object) str);
    }

    @Override // yw.z
    public p getNode() {
        return this.f96743b;
    }

    @Override // yw.z
    public p put(String str, String str2) {
        n nVar = new n(this.f96743b, str, str2);
        if (str != null) {
            put((q) str, (String) nVar);
        }
        return nVar;
    }

    @Override // yw.z
    public p remove(String str) {
        return (p) super.remove((Object) str);
    }

    public q(p pVar, g gVar) {
        this.f96743b = pVar;
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            n nVar = new n(this.f96743b, aVar);
            if (!aVar.isReserved()) {
                put((q) nVar.getName(), (String) nVar);
            }
        }
    }
}
