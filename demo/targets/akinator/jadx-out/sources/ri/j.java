package ri;

import kotlin.jvm.internal.e0;
import o4.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class j {
    public static final <T> T getOrDefault(o4.j jVar, j.a key, T t10) {
        e0.checkNotNullParameter(jVar, "<this>");
        e0.checkNotNullParameter(key, "key");
        T t11 = (T) jVar.get(key);
        return t11 == null ? t10 : t11;
    }
}
