package a1;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h {
    boolean canBeSaved(Object obj);

    Object consumeRestored(String str);

    Map<String, List<Object>> performSave();

    g registerProvider(String str, kv.a aVar);
}
