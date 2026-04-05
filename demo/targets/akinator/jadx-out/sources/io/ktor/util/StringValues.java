package io.ktor.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kv.l;
import kv.p;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface StringValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final StringValues Empty = new StringValuesImpl(false, null, 3, 0 == true ? 1 : 0);

        private Companion() {
        }

        public static /* synthetic */ StringValues build$default(Companion companion, boolean z10, l builder, int i10, Object obj) {
            int i11 = i10 & 1;
            int i12 = 0;
            if (i11 != 0) {
                z10 = false;
            }
            e0.checkNotNullParameter(builder, "builder");
            StringValuesBuilderImpl stringValuesBuilderImpl = new StringValuesBuilderImpl(z10, i12, 2, null);
            builder.invoke(stringValuesBuilderImpl);
            return stringValuesBuilderImpl.build();
        }

        public final StringValues build(boolean z10, l builder) {
            e0.checkNotNullParameter(builder, "builder");
            StringValuesBuilderImpl stringValuesBuilderImpl = new StringValuesBuilderImpl(z10, 0, 2, null);
            builder.invoke(stringValuesBuilderImpl);
            return stringValuesBuilderImpl.build();
        }

        public final StringValues getEmpty() {
            return Empty;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static boolean contains(StringValues stringValues, String name) {
            e0.checkNotNullParameter(name, "name");
            return stringValues.getAll(name) != null;
        }

        public static void forEach(StringValues stringValues, p body) {
            e0.checkNotNullParameter(body, "body");
            Iterator<T> it = stringValues.entries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                body.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String get(StringValues stringValues, String name) {
            e0.checkNotNullParameter(name, "name");
            List<String> all = stringValues.getAll(name);
            if (all != null) {
                return (String) y0.firstOrNull((List) all);
            }
            return null;
        }

        public static boolean contains(StringValues stringValues, String name, String value) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(value, "value");
            List<String> all = stringValues.getAll(name);
            if (all != null) {
                return all.contains(value);
            }
            return false;
        }
    }

    boolean contains(String str);

    boolean contains(String str, String str2);

    Set<Map.Entry<String, List<String>>> entries();

    void forEach(p pVar);

    String get(String str);

    List<String> getAll(String str);

    boolean getCaseInsensitiveName();

    boolean isEmpty();

    Set<String> names();
}
