package j7;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m f69164a;

    /* renamed from: b, reason: collision with root package name */
    public final j f69165b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bitmap f69166a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f69167b;

        /* renamed from: c, reason: collision with root package name */
        public final int f69168c;

        public a(Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
            this.f69166a = bitmap;
            this.f69167b = map;
            this.f69168c = i10;
        }

        public final Bitmap getBitmap() {
            return this.f69166a;
        }

        public final Map<String, Object> getExtras() {
            return this.f69167b;
        }

        public final int getSize() {
            return this.f69168c;
        }
    }

    public i(int i10, m mVar) {
        this.f69164a = mVar;
        this.f69165b = new j(i10, this);
    }

    @Override // j7.l
    public void clearMemory() {
        this.f69165b.evictAll();
    }

    @Override // j7.l
    public e get(MemoryCache$Key memoryCache$Key) {
        a aVar = (a) this.f69165b.get(memoryCache$Key);
        if (aVar != null) {
            return new e(aVar.getBitmap(), aVar.getExtras());
        }
        return null;
    }

    @Override // j7.l
    public Set<MemoryCache$Key> getKeys() {
        return this.f69165b.snapshot().keySet();
    }

    @Override // j7.l
    public int getMaxSize() {
        return this.f69165b.maxSize();
    }

    @Override // j7.l
    public int getSize() {
        return this.f69165b.size();
    }

    @Override // j7.l
    public boolean remove(MemoryCache$Key memoryCache$Key) {
        return this.f69165b.remove(memoryCache$Key) != null;
    }

    @Override // j7.l
    public void set(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map<String, ? extends Object> map) {
        int allocationByteCountCompat = q7.a.getAllocationByteCountCompat(bitmap);
        int maxSize = getMaxSize();
        j jVar = this.f69165b;
        if (allocationByteCountCompat <= maxSize) {
            jVar.put(memoryCache$Key, new a(bitmap, map, allocationByteCountCompat));
        } else {
            jVar.remove(memoryCache$Key);
            this.f69164a.set(memoryCache$Key, bitmap, map, allocationByteCountCompat);
        }
    }

    @Override // j7.l
    public void trimMemory(int i10) {
        if (i10 >= 40) {
            clearMemory();
        } else {
            if (10 > i10 || i10 >= 20) {
                return;
            }
            this.f69165b.trimToSize(getSize() / 2);
        }
    }
}
