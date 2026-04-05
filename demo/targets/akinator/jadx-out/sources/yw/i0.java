package yw;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i0 extends LinkedHashMap implements z {

    /* renamed from: b, reason: collision with root package name */
    public final h0 f96704b;

    public i0(h0 h0Var) {
        this.f96704b = h0Var;
    }

    @Override // yw.z
    public String getName() {
        return this.f96704b.getName();
    }

    @Override // yw.z, java.lang.Iterable
    public Iterator<String> iterator() {
        return keySet().iterator();
    }

    @Override // yw.z
    public h0 get(String str) {
        return (h0) super.get((Object) str);
    }

    @Override // yw.z
    public h0 getNode() {
        return this.f96704b;
    }

    @Override // yw.z
    public h0 put(String str, String str2) {
        h0 h0Var = this.f96704b;
        d0 d0Var = new d0(h0Var, str, str2);
        if (h0Var != null) {
            put((i0) str, (String) d0Var);
        }
        return d0Var;
    }

    @Override // yw.z
    public h0 remove(String str) {
        return (h0) super.remove((Object) str);
    }
}
