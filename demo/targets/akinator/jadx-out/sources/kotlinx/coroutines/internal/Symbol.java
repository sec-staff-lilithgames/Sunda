package kotlinx.coroutines.internal;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Symbol {
    public final String symbol;

    public Symbol(String str) {
        this.symbol = str;
    }

    public String toString() {
        return o2.q(new StringBuilder("<"), this.symbol, '>');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T unbox(Object obj) {
        if (obj == this) {
            return null;
        }
        return obj;
    }
}
