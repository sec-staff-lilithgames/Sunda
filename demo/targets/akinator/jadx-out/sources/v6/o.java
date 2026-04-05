package v6;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface o {
    n getSystemIdInfo(String str, int i10);

    default n getSystemIdInfo(s id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }

    List<String> getWorkSpecIds();

    void insertSystemIdInfo(n nVar);

    void removeSystemIdInfo(String str);

    void removeSystemIdInfo(String str, int i10);

    default void removeSystemIdInfo(s id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
    }
}
