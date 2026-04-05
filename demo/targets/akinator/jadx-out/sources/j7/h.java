package j7;

import coil.memory.MemoryCache$Key;
import java.util.Set;
import uu.d2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final l f69162a;

    /* renamed from: b, reason: collision with root package name */
    public final m f69163b;

    public h(l lVar, m mVar) {
        this.f69162a = lVar;
        this.f69163b = mVar;
    }

    @Override // j7.f
    public void clear() {
        this.f69162a.clearMemory();
        this.f69163b.clearMemory();
    }

    @Override // j7.f
    public e get(MemoryCache$Key memoryCache$Key) {
        e eVar = this.f69162a.get(memoryCache$Key);
        return eVar == null ? this.f69163b.get(memoryCache$Key) : eVar;
    }

    @Override // j7.f
    public Set<MemoryCache$Key> getKeys() {
        return d2.plus((Set) this.f69162a.getKeys(), (Iterable) this.f69163b.getKeys());
    }

    @Override // j7.f
    public int getMaxSize() {
        return this.f69162a.getMaxSize();
    }

    @Override // j7.f
    public int getSize() {
        return this.f69162a.getSize();
    }

    @Override // j7.f
    public boolean remove(MemoryCache$Key memoryCache$Key) {
        return this.f69162a.remove(memoryCache$Key) || this.f69163b.remove(memoryCache$Key);
    }

    @Override // j7.f
    public void set(MemoryCache$Key memoryCache$Key, e eVar) {
        this.f69162a.set(MemoryCache$Key.copy$default(memoryCache$Key, null, q7.c.toImmutableMap(memoryCache$Key.getExtras()), 1, null), eVar.getBitmap(), q7.c.toImmutableMap(eVar.getExtras()));
    }

    @Override // j7.f
    public void trimMemory(int i10) {
        this.f69162a.trimMemory(i10);
        this.f69163b.trimMemory(i10);
    }
}
