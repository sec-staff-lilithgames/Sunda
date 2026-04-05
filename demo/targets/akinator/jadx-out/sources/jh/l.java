package jh;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f69554a = new AtomicReference(null);

    public static void zzb(k kVar) {
        while (true) {
            AtomicReference atomicReference = f69554a;
            if (atomicReference.compareAndSet(null, kVar)) {
                return;
            }
            if (atomicReference.get() != null && atomicReference.get() != null) {
                return;
            }
        }
    }
}
