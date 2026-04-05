package yi;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface d {
    <T> void subscribe(Class<T> cls, Executor executor, b bVar);

    <T> void subscribe(Class<T> cls, b bVar);

    <T> void unsubscribe(Class<T> cls, b bVar);
}
