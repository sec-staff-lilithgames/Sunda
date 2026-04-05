package nc;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends HashMap {

    /* renamed from: b, reason: collision with root package name */
    public final Locale f75976b;

    @Deprecated
    public z() {
        this(Locale.getDefault());
    }

    public static z construct(Locale locale) {
        return new z(locale);
    }

    public z(Locale locale) {
        this.f75976b = locale;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public mc.z get(Object obj) {
        return (mc.z) super.get((Object) ((String) obj).toLowerCase(this.f75976b));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public mc.z put(String str, mc.z zVar) {
        return (mc.z) super.put((z) str.toLowerCase(this.f75976b), (String) zVar);
    }
}
