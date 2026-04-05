package l7;

import com.google.android.gms.ads.RequestConfiguration;
import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final a f72653b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final t f72654c = new t(p1.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public final Map f72655a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final t from(Map<Class<?>, ? extends Object> map) {
            return new t(q7.c.toImmutableMap(map), null);
        }
    }

    public /* synthetic */ t(Map map, kotlin.jvm.internal.u uVar) {
        this(map);
    }

    public static final t from(Map<Class<?>, ? extends Object> map) {
        return f72653b.from(map);
    }

    public final Map<Class<?>, Object> asMap() {
        return this.f72655a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return e0.areEqual(this.f72655a, ((t) obj).f72655a);
        }
        return false;
    }

    public int hashCode() {
        return this.f72655a.hashCode();
    }

    public final /* synthetic */ <T> T tag() {
        e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        return (T) tag(Object.class);
    }

    public String toString() {
        return o2.q(new StringBuilder("Tags(tags="), this.f72655a, ')');
    }

    public t(Map map) {
        this.f72655a = map;
    }

    public final <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.f72655a.get(cls));
    }
}
