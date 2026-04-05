package ir;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface d {
    void execute(Object obj);

    default boolean executeSafely(Object obj) {
        if (obj == null) {
            return false;
        }
        execute(obj);
        return true;
    }
}
