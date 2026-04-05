package kotlinx.coroutines;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import zu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineName extends zu.a {
    public static final Key Key = new Key(null);
    private final String name;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineName(String str) {
        super(Key);
        this.name = str;
    }

    public static /* synthetic */ CoroutineName copy$default(CoroutineName coroutineName, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = coroutineName.name;
        }
        return coroutineName.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final CoroutineName copy(String str) {
        return new CoroutineName(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && e0.areEqual(this.name, ((CoroutineName) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("CoroutineName("), this.name, ')');
    }
}
