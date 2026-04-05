package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Concurrent_commonKt {
    public static final <T> T getValue(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void loop(AtomicReference<T> atomicReference, p pVar) {
        while (true) {
            pVar.invoke(atomicReference, getValue(atomicReference));
        }
    }

    public static final <T> void setValue(AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }

    public static /* synthetic */ void getValue$annotations(AtomicReference atomicReference) {
    }
}
