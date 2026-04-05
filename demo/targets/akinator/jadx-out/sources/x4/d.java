package x4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.c2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f91739c;

    /* renamed from: a, reason: collision with root package name */
    public final Set f91740a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f91741b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        f91739c = new d(c2.emptySet(), null, p1.emptyMap());
    }

    public d(Set<? extends b> flags, c cVar, Map<String, ? extends Set<Class<? extends o>>> allowedViolations) {
        e0.checkNotNullParameter(flags, "flags");
        e0.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f91740a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Set<Class<? extends o>>> entry : allowedViolations.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.f91741b = linkedHashMap;
    }

    public final Set<b> getFlags$fragment_release() {
        return this.f91740a;
    }

    public final c getListener$fragment_release() {
        return null;
    }

    public final Map<String, Set<Class<? extends o>>> getMAllowedViolations$fragment_release() {
        return this.f91741b;
    }
}
