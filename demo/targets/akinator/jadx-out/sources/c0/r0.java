package c0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f11586a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public int f11590b;

        /* renamed from: a, reason: collision with root package name */
        public int f11589a = 300;

        /* renamed from: c, reason: collision with root package name */
        public final LinkedHashMap f11591c = new LinkedHashMap();

        /* JADX WARN: Multi-variable type inference failed */
        public final a at(Object obj, int i10) {
            a aVar = new a(obj, null, 2, 0 == true ? 1 : 0);
            this.f11591c.put(Integer.valueOf(i10), aVar);
            return aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11590b == bVar.f11590b && this.f11589a == bVar.f11589a && kotlin.jvm.internal.e0.areEqual(this.f11591c, bVar.f11591c);
        }

        public final int getDelayMillis() {
            return this.f11590b;
        }

        public final int getDurationMillis() {
            return this.f11589a;
        }

        public final Map<Integer, a> getKeyframes$animation_core_release() {
            return this.f11591c;
        }

        public int hashCode() {
            return this.f11591c.hashCode() + (((this.f11589a * 31) + this.f11590b) * 31);
        }

        public final void setDelayMillis(int i10) {
            this.f11590b = i10;
        }

        public final void setDurationMillis(int i10) {
            this.f11589a = i10;
        }

        public final void with(a aVar, g0 easing) {
            kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
            aVar.setEasing$animation_core_release(easing);
        }
    }

    public r0(b config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f11586a = config;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r0) {
            return kotlin.jvm.internal.e0.areEqual(this.f11586a, ((r0) obj).f11586a);
        }
        return false;
    }

    public final b getConfig() {
        return this.f11586a;
    }

    public int hashCode() {
        return this.f11586a.hashCode();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11587a;

        /* renamed from: b, reason: collision with root package name */
        public g0 f11588b;

        public a(Object obj, g0 easing) {
            kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
            this.f11587a = obj;
            this.f11588b = easing;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.e0.areEqual(aVar.f11587a, this.f11587a) && kotlin.jvm.internal.e0.areEqual(aVar.f11588b, this.f11588b);
        }

        public final g0 getEasing$animation_core_release() {
            return this.f11588b;
        }

        public final Object getValue$animation_core_release() {
            return this.f11587a;
        }

        public int hashCode() {
            Object obj = this.f11587a;
            return this.f11588b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
        }

        public final void setEasing$animation_core_release(g0 g0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(g0Var, "<set-?>");
            this.f11588b = g0Var;
        }

        public final <V extends v> tu.v toPair$animation_core_release(kv.l convertToVector) {
            kotlin.jvm.internal.e0.checkNotNullParameter(convertToVector, "convertToVector");
            return tu.e0.to(convertToVector.invoke(this.f11587a), this.f11588b);
        }

        public /* synthetic */ a(Object obj, g0 g0Var, int i10, kotlin.jvm.internal.u uVar) {
            this(obj, (i10 & 2) != 0 ? i0.getLinearEasing() : g0Var);
        }
    }

    @Override // c0.f0, c0.j0, c0.n
    public <V extends v> t3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        b bVar = this.f11586a;
        Map<Integer, a> keyframes$animation_core_release = bVar.getKeyframes$animation_core_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uu.o1.mapCapacity(keyframes$animation_core_release.size()));
        Iterator<T> it = keyframes$animation_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((a) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new t3(linkedHashMap, bVar.getDurationMillis(), bVar.getDelayMillis());
    }
}
