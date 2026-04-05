package jr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface h {
    static /* synthetic */ Object toOrDefault$default(h hVar, Object obj, Object obj2, int i10, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toOrDefault");
        }
        if ((i10 & 2) != 0) {
            obj2 = null;
        }
        return hVar.toOrDefault(obj, obj2);
    }

    Object toOrDefault(Object obj, Object obj2);

    Object toOrDefault(String str, Object obj);

    static /* synthetic */ Object toOrDefault$default(h hVar, String str, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toOrDefault");
        }
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return hVar.toOrDefault(str, obj);
    }
}
