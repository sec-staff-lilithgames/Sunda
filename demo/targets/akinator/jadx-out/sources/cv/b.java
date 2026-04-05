package cv;

import kotlin.jvm.internal.e0;
import tu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends Enum<T>> a enumEntries() {
        throw new u(null, 1, 0 == true ? 1 : 0);
    }

    public static final <E extends Enum<E>> a enumEntries(kv.a entriesProvider) {
        e0.checkNotNullParameter(entriesProvider, "entriesProvider");
        return new c((Enum[]) entriesProvider.invoke());
    }

    public static final <E extends Enum<E>> a enumEntries(E[] entries) {
        e0.checkNotNullParameter(entries, "entries");
        return new c(entries);
    }
}
