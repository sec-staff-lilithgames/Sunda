package j7;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.util.Map;
import java.util.Set;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m f69152a;

    public a(m mVar) {
        this.f69152a = mVar;
    }

    @Override // j7.l
    public e get(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // j7.l
    public Set<MemoryCache$Key> getKeys() {
        return c2.emptySet();
    }

    @Override // j7.l
    public int getMaxSize() {
        return 0;
    }

    @Override // j7.l
    public int getSize() {
        return 0;
    }

    @Override // j7.l
    public boolean remove(MemoryCache$Key memoryCache$Key) {
        return false;
    }

    @Override // j7.l
    public void set(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map<String, ? extends Object> map) {
        this.f69152a.set(memoryCache$Key, bitmap, map, q7.a.getAllocationByteCountCompat(bitmap));
    }

    @Override // j7.l
    public void clearMemory() {
    }

    @Override // j7.l
    public void trimMemory(int i10) {
    }
}
