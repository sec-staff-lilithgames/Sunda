package kotlinx.coroutines.internal;

import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kv.l;
import qv.m;
import qv.v;
import uu.j1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater controlState$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;
    private final l create;
    private final /* synthetic */ AtomicReferenceArray elements;
    private final int maxCapacity;

    public OnDemandAllocatingPool(int i10, l lVar) {
        this.maxCapacity = i10;
        this.create = lVar;
        this.elements = new AtomicReferenceArray(i10);
    }

    private final /* synthetic */ int getControlState$volatile() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ AtomicReferenceArray getElements() {
        return this.elements;
    }

    private final boolean isClosed(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void setControlState$volatile(int i10) {
        this.controlState$volatile = i10;
    }

    private final int tryForbidNewElements() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i10, Integer.MIN_VALUE | i10));
        return i10;
    }

    public final boolean allocate() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i10) != 0) {
                return false;
            }
            if (i10 >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$volatile$FU.compareAndSet(this, i10, i10 + 1));
        getElements().set(i10, this.create.invoke(Integer.valueOf(i10)));
        return true;
    }

    public final List<T> close() {
        int i10;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$volatile$FU;
        while (true) {
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i10 = 0;
                break;
            }
            if (controlState$volatile$FU.compareAndSet(this, i10, Integer.MIN_VALUE | i10)) {
                break;
            }
        }
        m mVarUntil = v.until(0, i10);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator<T> it = mVarUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j1) it).nextInt();
            do {
                andSet = getElements().getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final String stateRepresentation$kotlinx_coroutines_core() {
        int i10 = controlState$volatile$FU.get(this);
        m mVarUntil = v.until(0, Integer.MAX_VALUE & i10);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator<T> it = mVarUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(getElements().get(((j1) it).nextInt()));
        }
        return o2.l(arrayList.toString(), (i10 & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
