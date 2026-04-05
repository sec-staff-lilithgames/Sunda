package j7;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.u;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f69170a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f69171b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f69172a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f69173b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f69174c;

        /* renamed from: d, reason: collision with root package name */
        public final int f69175d;

        public b(int i10, WeakReference<Bitmap> weakReference, Map<String, ? extends Object> map, int i11) {
            this.f69172a = i10;
            this.f69173b = weakReference;
            this.f69174c = map;
            this.f69175d = i11;
        }

        public final WeakReference<Bitmap> getBitmap() {
            return this.f69173b;
        }

        public final Map<String, Object> getExtras() {
            return this.f69174c;
        }

        public final int getIdentityHashCode() {
            return this.f69172a;
        }

        public final int getSize() {
            return this.f69175d;
        }
    }

    static {
        new a(null);
    }

    public final void cleanUp$coil_base_release() {
        WeakReference<Bitmap> bitmap;
        this.f69171b = 0;
        Iterator it = this.f69170a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) y0.firstOrNull((List) arrayList);
                if (((bVar == null || (bitmap = bVar.getBitmap()) == null) ? null : bitmap.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).getBitmap().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // j7.m
    public synchronized void clearMemory() {
        this.f69171b = 0;
        this.f69170a.clear();
    }

    @Override // j7.m
    public synchronized e get(MemoryCache$Key memoryCache$Key) {
        try {
            ArrayList arrayList = (ArrayList) this.f69170a.get(memoryCache$Key);
            e eVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                b bVar = (b) arrayList.get(i10);
                Bitmap bitmap = bVar.getBitmap().get();
                e eVar2 = bitmap != null ? new e(bitmap, bVar.getExtras()) : null;
                if (eVar2 != null) {
                    eVar = eVar2;
                    break;
                }
                i10++;
            }
            int i11 = this.f69171b;
            this.f69171b = i11 + 1;
            if (i11 >= 10) {
                cleanUp$coil_base_release();
            }
            return eVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final LinkedHashMap<MemoryCache$Key, ArrayList<b>> getCache$coil_base_release() {
        return this.f69170a;
    }

    @Override // j7.m
    public synchronized Set<MemoryCache$Key> getKeys() {
        return y0.toSet(this.f69170a.keySet());
    }

    @Override // j7.m
    public synchronized boolean remove(MemoryCache$Key memoryCache$Key) {
        return this.f69170a.remove(memoryCache$Key) != null;
    }

    @Override // j7.m
    public synchronized void set(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map<String, ? extends Object> map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f69170a;
            Object arrayList = linkedHashMap.get(memoryCache$Key);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(memoryCache$Key, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = (b) arrayList2.get(i11);
                if (i10 < bVar2.getSize()) {
                    i11++;
                } else if (bVar2.getIdentityHashCode() == iIdentityHashCode && bVar2.getBitmap().get() == bitmap) {
                    arrayList2.set(i11, bVar);
                } else {
                    arrayList2.add(i11, bVar);
                }
            }
            int i12 = this.f69171b;
            this.f69171b = i12 + 1;
            if (i12 >= 10) {
                cleanUp$coil_base_release();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // j7.m
    public synchronized void trimMemory(int i10) {
        if (i10 >= 10 && i10 != 20) {
            cleanUp$coil_base_release();
        }
    }

    public static /* synthetic */ void getCache$coil_base_release$annotations() {
    }
}
