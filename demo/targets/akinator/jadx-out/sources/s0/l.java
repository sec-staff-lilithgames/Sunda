package s0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l extends e {
    k builder();

    @Override // java.util.Map
    l clear();

    @Override // s0.e
    /* synthetic */ f getEntries();

    @Override // s0.e
    /* synthetic */ f getKeys();

    @Override // s0.e
    /* synthetic */ b getValues();

    @Override // java.util.Map
    l put(Object obj, Object obj2);

    @Override // java.util.Map
    l putAll(Map<Object, Object> map);

    @Override // java.util.Map
    l remove(Object obj);

    @Override // java.util.Map
    l remove(Object obj, Object obj2);
}
