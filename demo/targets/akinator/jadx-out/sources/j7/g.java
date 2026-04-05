package j7;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache$Key;
import g7.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;
import l7.o;
import l7.r;
import l7.s;
import q7.n;
import q7.v;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a7.m f69160a;

    /* renamed from: b, reason: collision with root package name */
    public final r f69161b;

    static {
        new a(null);
    }

    public g(a7.m mVar, r rVar, v vVar) {
        this.f69160a = mVar;
        this.f69161b = rVar;
    }

    public final e getCacheValue(l7.i iVar, MemoryCache$Key memoryCache$Key, m7.j jVar, m7.i iVar2) {
        if (!iVar.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        f memoryCache = this.f69160a.getMemoryCache();
        e eVar = memoryCache != null ? memoryCache.get(memoryCache$Key) : null;
        if (eVar == null || !isCacheValueValid$coil_base_release(iVar, memoryCache$Key, eVar, jVar, iVar2)) {
            return null;
        }
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[PHI: r16 r18
      0x00ce: PHI (r16v1 boolean) = (r16v0 boolean), (r16v0 boolean), (r16v2 boolean) binds: [B:41:0x00cb, B:37:0x00be, B:32:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r18v2 boolean) = (r18v1 boolean), (r18v1 boolean), (r18v3 boolean) binds: [B:41:0x00cb, B:37:0x00be, B:32:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCacheValueValid$coil_base_release(l7.i r18, coil.memory.MemoryCache$Key r19, j7.e r20, m7.j r21, m7.i r22) {
        /*
            r17 = this;
            android.graphics.Bitmap r0 = r20.getBitmap()
            android.graphics.Bitmap$Config r0 = q7.a.getSafeConfig(r0)
            r1 = r17
            l7.r r2 = r1.f69161b
            r3 = r18
            boolean r0 = r2.isConfigValidForHardware(r3, r0)
            if (r0 != 0) goto L18
        L14:
            r16 = 0
            goto Ldc
        L18:
            java.util.Map r0 = r20.getExtras()
            java.lang.String r4 = "coil#is_sampled"
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.lang.Boolean
            if (r4 == 0) goto L29
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L31
            boolean r0 = r0.booleanValue()
            goto L32
        L31:
            r0 = 0
        L32:
            boolean r4 = m7.b.isOriginal(r21)
            r5 = 1
            if (r4 == 0) goto L3c
            if (r0 == 0) goto Ldd
            goto L14
        L3c:
            java.util.Map r4 = r19.getExtras()
            java.lang.String r6 = "coil#transformation_size"
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L53
            java.lang.String r0 = r21.toString()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r4, r0)
            return r0
        L53:
            android.graphics.Bitmap r4 = r20.getBitmap()
            int r4 = r4.getWidth()
            android.graphics.Bitmap r6 = r20.getBitmap()
            int r6 = r6.getHeight()
            m7.c r7 = r21.getWidth()
            boolean r8 = r7 instanceof m7.c.a
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L73
            m7.c$a r7 = (m7.c.a) r7
            int r7 = r7.f74052a
            goto L74
        L73:
            r7 = r9
        L74:
            m7.c r8 = r21.getHeight()
            boolean r10 = r8 instanceof m7.c.a
            if (r10 == 0) goto L80
            m7.c$a r8 = (m7.c.a) r8
            int r9 = r8.f74052a
        L80:
            r8 = r22
            double r10 = c7.i.computeSizeMultiplier(r4, r6, r7, r9, r8)
            boolean r3 = q7.l.getAllowInexactSize(r3)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 == 0) goto Laf
            double r14 = qv.v.coerceAtMost(r10, r12)
            double r7 = (double) r7
            r18 = r3
            r16 = 0
            double r2 = (double) r4
            double r2 = r2 * r14
            double r7 = r7 - r2
            double r2 = java.lang.Math.abs(r7)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 <= 0) goto Ldd
            double r2 = (double) r9
            double r6 = (double) r6
            double r14 = r14 * r6
            double r2 = r2 - r14
            double r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 > 0) goto Lce
            goto Ldd
        Laf:
            r18 = r3
            r16 = 0
            boolean r2 = q7.n.isMinOrMax(r7)
            if (r2 != 0) goto Lc0
            int r7 = r7 - r4
            int r2 = java.lang.Math.abs(r7)
            if (r2 > r5) goto Lce
        Lc0:
            boolean r2 = q7.n.isMinOrMax(r9)
            if (r2 != 0) goto Ldd
            int r9 = r9 - r6
            int r2 = java.lang.Math.abs(r9)
            if (r2 > r5) goto Lce
            goto Ldd
        Lce:
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 != 0) goto Ld3
            goto Ld6
        Ld3:
            if (r18 != 0) goto Ld6
            goto Ldc
        Ld6:
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto Ldd
            if (r0 == 0) goto Ldd
        Ldc:
            return r16
        Ldd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.g.isCacheValueValid$coil_base_release(l7.i, coil.memory.MemoryCache$Key, j7.e, m7.j, m7.i):boolean");
    }

    public final MemoryCache$Key newCacheKey(l7.i iVar, Object obj, o oVar, a7.g gVar) {
        MemoryCache$Key memoryCacheKey = iVar.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        a7.c cVar = (a7.c) gVar;
        cVar.keyStart(iVar, obj);
        String strKey = this.f69160a.getComponents().key(obj, oVar);
        cVar.keyEnd(iVar, strKey);
        if (strKey == null) {
            return null;
        }
        List<o7.a> transformations = iVar.getTransformations();
        Map<String, String> mapMemoryCacheKeys = iVar.getParameters().memoryCacheKeys();
        if (transformations.isEmpty() && mapMemoryCacheKeys.isEmpty()) {
            return new MemoryCache$Key(strKey, null, 2, null);
        }
        Map mutableMap = p1.toMutableMap(mapMemoryCacheKeys);
        if (!transformations.isEmpty()) {
            List<o7.a> transformations2 = iVar.getTransformations();
            if (transformations2.size() > 0) {
                transformations2.get(0).getClass();
                throw new ClassCastException();
            }
            mutableMap.put("coil#transformation_size", oVar.getSize().toString());
        }
        return new MemoryCache$Key(strKey, mutableMap);
    }

    public final s newResult(g7.i iVar, l7.i iVar2, MemoryCache$Key memoryCache$Key, e eVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar2.getContext().getResources(), eVar.getBitmap());
        Object obj = eVar.getExtras().get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = eVar.getExtras().get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        return new s(bitmapDrawable, iVar2, c7.f.f11833b, memoryCache$Key, str, bool != null ? bool.booleanValue() : false, n.isPlaceholderCached(iVar));
    }

    public final boolean setCacheValue(MemoryCache$Key memoryCache$Key, l7.i iVar, a.b bVar) {
        f memoryCache;
        Bitmap bitmap;
        if (iVar.getMemoryCachePolicy().getWriteEnabled() && (memoryCache = this.f69160a.getMemoryCache()) != null && memoryCache$Key != null) {
            Drawable drawable = bVar.getDrawable();
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(bVar.isSampled()));
                String diskCacheKey = bVar.getDiskCacheKey();
                if (diskCacheKey != null) {
                    linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
                }
                memoryCache.set(memoryCache$Key, new e(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ void getEXTRA_DISK_CACHE_KEY$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_IS_SAMPLED$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_TRANSFORMATION_INDEX$coil_base_release$annotations() {
        }

        public static /* synthetic */ void getEXTRA_TRANSFORMATION_SIZE$coil_base_release$annotations() {
        }
    }
}
