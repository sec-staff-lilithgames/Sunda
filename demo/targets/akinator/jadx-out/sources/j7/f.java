package j7;

import coil.memory.MemoryCache$Key;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f {
    void clear();

    e get(MemoryCache$Key memoryCache$Key);

    Set<MemoryCache$Key> getKeys();

    int getMaxSize();

    int getSize();

    boolean remove(MemoryCache$Key memoryCache$Key);

    void set(MemoryCache$Key memoryCache$Key, e eVar);

    void trimMemory(int i10);
}
