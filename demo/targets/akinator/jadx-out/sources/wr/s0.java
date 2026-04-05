package wr;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f91124a;

    static {
        t0 v6Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            v6Var = (t0) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(t0.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            atomicReference.set(e10);
            v6Var = new v6();
        } catch (Exception e11) {
            throw new RuntimeException("Storage override failed to initialize", e11);
        }
        f91124a = v6Var;
        Throwable th2 = (Throwable) atomicReference.get();
        if (th2 != null) {
            u0.f91141f.log(Level.FINE, "Storage override doesn't exist. Using default", th2);
        }
    }
}
