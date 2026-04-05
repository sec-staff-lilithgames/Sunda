package sh;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a0 extends jh.i {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f85771c = AtomicReferenceFieldUpdater.newUpdater(c0.class, Set.class, "j");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f85772e = AtomicIntegerFieldUpdater.newUpdater(c0.class, CampaignEx.JSON_KEY_AD_K);

    @Override // jh.i
    public final int B(z zVar) {
        return f85772e.decrementAndGet(zVar);
    }

    @Override // jh.i
    public final void x(z zVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f85771c;
            if (atomicReferenceFieldUpdater.compareAndSet(zVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zVar) == null);
    }
}
