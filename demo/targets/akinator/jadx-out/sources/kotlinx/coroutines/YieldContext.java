package kotlinx.coroutines;

import kotlin.jvm.internal.u;
import zu.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class YieldContext extends zu.a {
    public static final Key Key = new Key(null);
    public boolean dispatcherWasUnconfined;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    public YieldContext() {
        super(Key);
    }
}
