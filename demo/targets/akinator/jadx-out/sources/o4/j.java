package o4;

import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f77484a;

        public a(String name) {
            e0.checkNotNullParameter(name, "name");
            this.f77484a = name;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return e0.areEqual(this.f77484a, ((a) obj).f77484a);
        }

        public final String getName() {
            return this.f77484a;
        }

        public int hashCode() {
            return this.f77484a.hashCode();
        }

        public final b to(Object obj) {
            return new b(this, obj);
        }

        public String toString() {
            return this.f77484a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a f77485a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f77486b;

        public b(a key, Object obj) {
            e0.checkNotNullParameter(key, "key");
            this.f77485a = key;
            this.f77486b = obj;
        }

        public final a getKey$datastore_preferences_core_release() {
            return this.f77485a;
        }

        public final Object getValue$datastore_preferences_core_release() {
            return this.f77486b;
        }
    }

    public abstract Map<a, Object> asMap();

    public abstract <T> boolean contains(a aVar);

    public abstract <T> T get(a aVar);

    public final d toMutablePreferences() {
        return new d(p1.toMutableMap(asMap()), false);
    }

    public final j toPreferences() {
        return new d(p1.toMutableMap(asMap()), true);
    }
}
