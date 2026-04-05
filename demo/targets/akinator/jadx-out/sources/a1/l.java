package a1;

import java.util.List;
import java.util.Map;
import p0.g3;
import p0.o0;
import z.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f3411a = o0.staticCompositionLocalOf(new k(0));

    public static final h SaveableStateRegistry(Map<String, ? extends List<? extends Object>> map, kv.l lVar) {
        return new j(map, lVar);
    }

    public static final boolean access$fastIsBlank(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!sv.e.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final u0 access$toMutableScatterMap(Map map) {
        u0 u0Var = new u0(map.size());
        u0Var.putAll((Map<Object, Object>) map);
        return u0Var;
    }

    public static final g3 getLocalSaveableStateRegistry() {
        return f3411a;
    }
}
