package ww;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f91304a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f91305b;

    public c(Map map) {
        this(map, null);
    }

    @Override // ww.b
    public String replace(String str) {
        Map map = this.f91305b;
        Object obj = map != null ? map.get(str) : null;
        if (obj != null) {
            return obj.toString();
        }
        b bVar = this.f91304a;
        if (bVar != null) {
            return bVar.replace(str);
        }
        return null;
    }

    public c(Map map, b bVar) {
        this.f91304a = bVar;
        this.f91305b = map;
    }
}
