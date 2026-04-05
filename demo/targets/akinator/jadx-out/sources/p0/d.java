package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d {
    default void apply(kv.p pVar, Object obj) {
        pVar.invoke(getCurrent(), obj);
    }

    void clear();

    void down(Object obj);

    Object getCurrent();

    void insertBottomUp(int i10, Object obj);

    void insertTopDown(int i10, Object obj);

    void move(int i10, int i11, int i12);

    void remove(int i10, int i11);

    default void reuse() {
        getCurrent();
    }

    void up();

    default void onBeginChanges() {
    }

    default void onEndChanges() {
    }
}
