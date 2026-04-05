package io.ktor.utils.io.jvm.javaio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Parking<T> {
    void park(long j10);

    T token();

    void unpark(T t10);
}
