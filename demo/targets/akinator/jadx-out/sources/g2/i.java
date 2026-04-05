package g2;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements l2.v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56767b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static Map f56768c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final o2.o f56769d = o2.n.createSynchronizedObject();

    /* renamed from: a, reason: collision with root package name */
    public final l2.y f56770a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final l2.v from(l2.y fontFamilyResolver) {
            kotlin.jvm.internal.e0.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
            synchronized (getLock()) {
                a aVar = i.f56767b;
                l2.v vVar = aVar.getCache().get(fontFamilyResolver);
                if (vVar != null) {
                    return vVar;
                }
                i iVar = new i(fontFamilyResolver, null);
                aVar.getCache().put(fontFamilyResolver, iVar);
                return iVar;
            }
        }

        public final Map<l2.y, l2.v> getCache() {
            return i.f56768c;
        }

        public final o2.o getLock() {
            return i.f56769d;
        }

        public final void setCache(Map<l2.y, l2.v> map) {
            kotlin.jvm.internal.e0.checkNotNullParameter(map, "<set-?>");
            i.f56768c = map;
        }
    }

    public i(l2.y yVar, kotlin.jvm.internal.u uVar) {
        this.f56770a = yVar;
    }

    @Override // l2.v
    @tu.f
    public Object load(l2.w font) {
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        return l2.y.m5481resolveDPcqOEQ$default(this.f56770a, l2.k0.toFontFamily(font), font.getWeight(), font.mo5433getStyle_LCdwA(), 0, 8, null).getValue();
    }
}
