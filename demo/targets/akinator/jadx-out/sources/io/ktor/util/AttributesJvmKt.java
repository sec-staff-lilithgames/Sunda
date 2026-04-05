package io.ktor.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AttributesJvmKt {
    public static final Attributes Attributes(boolean z10) {
        return z10 ? new ConcurrentSafeAttributes() : new HashMapAttributes();
    }

    public static /* synthetic */ Attributes Attributes$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return Attributes(z10);
    }
}
