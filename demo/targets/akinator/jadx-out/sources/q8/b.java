package q8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface b {
    void clearMemory();

    <T> T get(int i10, Class<T> cls);

    <T> T getExact(int i10, Class<T> cls);

    <T> void put(T t10);

    @Deprecated
    <T> void put(T t10, Class<T> cls);

    void trimMemory(int i10);
}
