package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kv.l;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    private SubscriptionCountStateFlow _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private S[] slots;

    public final S allocateSlot() {
        S s10;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) createSlotArray(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractSharedFlowSlot[]) objArrCopyOf);
                }
                int i10 = this.nextIndex;
                do {
                    s10 = sArr[i10];
                    if (s10 == null) {
                        s10 = (S) createSlot();
                        sArr[i10] = s10;
                    }
                    i10++;
                    if (i10 >= sArr.length) {
                        i10 = 0;
                    }
                    e0.checkNotNull(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s10.allocateLocked(this));
                this.nextIndex = i10;
                this.nCollectors++;
                subscriptionCountStateFlow = this._subscriptionCount;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(1);
        }
        return s10;
    }

    public abstract S createSlot();

    public abstract S[] createSlotArray(int i10);

    public final void forEachSlotLocked(l lVar) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (this.nCollectors == 0 || (abstractSharedFlowSlotArr = this.slots) == null) {
            return;
        }
        for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
            if (abstractSharedFlowSlot != null) {
                lVar.invoke(abstractSharedFlowSlot);
            }
        }
    }

    public final void freeSlot(S s10) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i10;
        d<x0>[] dVarArrFreeLocked;
        synchronized (this) {
            try {
                int i11 = this.nCollectors - 1;
                this.nCollectors = i11;
                subscriptionCountStateFlow = this._subscriptionCount;
                if (i11 == 0) {
                    this.nextIndex = 0;
                }
                e0.checkNotNull(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dVarArrFreeLocked = s10.freeLocked(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (d<x0> dVar : dVarArrFreeLocked) {
            if (dVar != null) {
                int i12 = z.f87419c;
                dVar.resumeWith(z.m7131constructorimpl(x0.f87415a));
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.increment(-1);
        }
    }

    public final int getNCollectors() {
        return this.nCollectors;
    }

    public final S[] getSlots() {
        return this.slots;
    }

    public final StateFlow<Integer> getSubscriptionCount() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this._subscriptionCount;
            if (subscriptionCountStateFlow == null) {
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(this.nCollectors);
                this._subscriptionCount = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }
}
