package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import b1.a1;
import b1.m;
import b1.m0;
import b1.n0;
import b1.w0;
import b1.y;
import b1.y0;
import b1.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import lv.h;
import rw.hIT.uQjDr;
import s0.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class SnapshotStateSet<T> implements Parcelable, w0, Set<T>, RandomAccess, h {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public y0 f5308b = n0.stateRecordWith(this, s0.a.persistentSetOf());

    static {
        new a(null);
        CREATOR = new m0();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        int modification$runtime;
        n set$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (n0.f8657a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                a1 a1Var = (a1) y.current((a1) firstStateRecord);
                modification$runtime = a1Var.getModification$runtime();
                set$runtime = a1Var.getSet$runtime();
            }
            e0.checkNotNull(set$runtime);
            n nVarAdd = set$runtime.add((Object) t10);
            if (e0.areEqual(nVarAdd, set$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            a1 a1Var2 = (a1) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = n0.attemptUpdate((a1) y.writableRecord(a1Var2, this, current), modification$runtime, nVarAdd);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime;
        n set$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (n0.f8657a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                a1 a1Var = (a1) y.current((a1) firstStateRecord);
                modification$runtime = a1Var.getModification$runtime();
                set$runtime = a1Var.getSet$runtime();
            }
            e0.checkNotNull(set$runtime);
            n nVarAddAll = set$runtime.addAll((Collection<Object>) collection);
            if (e0.areEqual(nVarAddAll, set$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            a1 a1Var2 = (a1) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = n0.attemptUpdate((a1) y.writableRecord(a1Var2, this, current), modification$runtime, nVarAddAll);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        m current;
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        a1 a1Var = (a1) firstStateRecord;
        synchronized (y.getLock()) {
            current = m.f8651e.getCurrent();
            a1 a1Var2 = (a1) y.writableRecord(a1Var, this, current);
            synchronized (n0.f8657a) {
                a1Var2.setSet$runtime(s0.a.persistentSetOf());
                a1Var2.setModification$runtime(a1Var2.getModification$runtime() + 1);
            }
        }
        y.notifyWrite(current, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return n0.getReadable(this).getSet$runtime().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return n0.getReadable(this).getSet$runtime().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Set<T> getDebuggerDisplayValue() {
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((a1) y.current((a1) firstStateRecord)).getSet$runtime();
    }

    @Override // b1.w0
    public y0 getFirstStateRecord() {
        return this.f5308b;
    }

    public int getSize() {
        return n0.getReadable(this).getSet$runtime().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return n0.getReadable(this).getSet$runtime().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new z0(this, n0.getReadable(this).getSet$runtime().iterator());
    }

    @Override // b1.w0
    public /* bridge */ /* synthetic */ y0 mergeRecords(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        return super.mergeRecords(y0Var, y0Var2, y0Var3);
    }

    @Override // b1.w0
    public void prependStateRecord(y0 y0Var) {
        y0Var.setNext$runtime(getFirstStateRecord());
        e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.f5308b = (a1) y0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int modification$runtime;
        n set$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (n0.f8657a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                a1 a1Var = (a1) y.current((a1) firstStateRecord);
                modification$runtime = a1Var.getModification$runtime();
                set$runtime = a1Var.getSet$runtime();
            }
            e0.checkNotNull(set$runtime);
            n nVarRemoveAll = set$runtime.removeAll((Collection<Object>) collection);
            if (e0.areEqual(nVarRemoveAll, set$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            a1 a1Var2 = (a1) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = n0.attemptUpdate((a1) y.writableRecord(a1Var2, this, current), modification$runtime, nVarRemoveAll);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return n0.mutateBoolean(this, new b1.e0(1, collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    public final Set<T> toSet() {
        return n0.getReadable(this).getSet$runtime();
    }

    public String toString() {
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((a1) y.current((a1) firstStateRecord)).getSet$runtime() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Set<T> set = toSet();
        parcel.writeInt(size());
        Iterator<T> it = set.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) t.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime;
        n set$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (n0.f8657a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, uQjDr.JYzKdajPUJVEJgi);
                a1 a1Var = (a1) y.current((a1) firstStateRecord);
                modification$runtime = a1Var.getModification$runtime();
                set$runtime = a1Var.getSet$runtime();
            }
            e0.checkNotNull(set$runtime);
            n nVarRemove = set$runtime.remove(obj);
            if (e0.areEqual(nVarRemove, set$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            a1 a1Var2 = (a1) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = n0.attemptUpdate((a1) y.writableRecord(a1Var2, this, current), modification$runtime, nVarRemove);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }
}
