package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import b1.c1;
import b1.f0;
import b1.g0;
import b1.h0;
import b1.m;
import b1.p0;
import b1.q0;
import b1.w0;
import b1.y;
import b1.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import lv.d;
import p0.a3;
import s0.i;
import s0.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements Parcelable, w0, List<T>, RandomAccess, d {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public y0 f5307b;

    static {
        new a(null);
        CREATOR = new g0();
    }

    public SnapshotStateList(j jVar) {
        this.f5307b = h0.stateRecordWith(this, jVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarAdd = list$runtime.add((Object) t10);
            if (e0.areEqual(jVarAdd, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarAdd, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        return h0.mutateBoolean(this, new f0(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        m current;
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        q0 q0Var = (q0) firstStateRecord;
        synchronized (y.getLock()) {
            current = m.f8651e.getCurrent();
            q0 q0Var2 = (q0) y.writableRecord(q0Var, this, current);
            synchronized (h0.f8614a) {
                q0Var2.setList$runtime(s0.a.persistentListOf());
                q0Var2.setModification$runtime(q0Var2.getModification$runtime() + 1);
                q0Var2.setStructuralChange$runtime(q0Var2.getStructuralChange$runtime() + 1);
            }
        }
        y.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return h0.getReadable(this).getList$runtime().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return h0.getReadable(this).getList$runtime().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public T get(int i10) {
        return (T) h0.getReadable(this).getList$runtime().get(i10);
    }

    public final List<T> getDebuggerDisplayValue() {
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((q0) y.current((q0) firstStateRecord)).getList$runtime();
    }

    @Override // b1.w0
    public y0 getFirstStateRecord() {
        return this.f5307b;
    }

    public int getSize() {
        return h0.getReadable(this).getList$runtime().size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return h0.getReadable(this).getList$runtime().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return h0.getReadable(this).getList$runtime().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return h0.getReadable(this).getList$runtime().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new p0(this, 0);
    }

    @Override // b1.w0
    public /* bridge */ /* synthetic */ y0 mergeRecords(y0 y0Var, y0 y0Var2, y0 y0Var3) {
        return super.mergeRecords(y0Var, y0Var2, y0Var3);
    }

    @Override // b1.w0
    public void prependStateRecord(y0 y0Var) {
        y0Var.setNext$runtime(getFirstStateRecord());
        e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f5307b = (q0) y0Var;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarRemoveAll = list$runtime.removeAll((Collection<Object>) collection);
            if (e0.areEqual(jVarRemoveAll, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarRemoveAll, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public T removeAt(int i10) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        T t10 = get(i10);
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarRemoveAt = list$runtime.removeAt(i10);
            if (e0.areEqual(jVarRemoveAt, list$runtime)) {
                return t10;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarRemoveAt, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t10;
    }

    public final void removeRange(int i10, int i11) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            i iVarBuilder = list$runtime.builder();
            iVarBuilder.subList(i10, i11).clear();
            j jVarBuild = iVarBuilder.build();
            if (e0.areEqual(jVarBuild, list$runtime)) {
                return;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarBuild, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return h0.mutateBoolean(this, new b1.e0(0, collection));
    }

    public final int retainAllInRange$runtime(Collection<? extends T> collection, int i10, int i11) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        int size = size();
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            i iVarBuilder = list$runtime.builder();
            iVarBuilder.subList(i10, i11).retainAll(collection);
            j jVarBuild = iVarBuilder.build();
            if (e0.areEqual(jVarBuild, list$runtime)) {
                break;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarBuild, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        T t11 = get(i10);
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVar = list$runtime.set(i10, (Object) t10);
            if (e0.areEqual(jVar, list$runtime)) {
                return t11;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVar, false);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            a3.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new c1(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return t.toArray(this);
    }

    public final List<T> toList() {
        return h0.getReadable(this).getList$runtime();
    }

    public String toString() {
        y0 firstStateRecord = getFirstStateRecord();
        e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((q0) y.current((q0) firstStateRecord)).getList$runtime() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List<T> list = toList();
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeValue(list.get(i11));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarAddAll = list$runtime.addAll((Collection<Object>) collection);
            if (e0.areEqual(jVarAddAll, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarAddAll, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new p0(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarRemove = list$runtime.remove(obj);
            if (e0.areEqual(jVarRemove, list$runtime)) {
                return false;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarRemove, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) t.toArray(this, tArr);
    }

    public SnapshotStateList() {
        this(s0.a.persistentListOf());
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        int modification$runtime;
        j list$runtime;
        m current;
        boolean zAttemptUpdate;
        do {
            synchronized (h0.f8614a) {
                y0 firstStateRecord = getFirstStateRecord();
                e0.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                q0 q0Var = (q0) y.current((q0) firstStateRecord);
                modification$runtime = q0Var.getModification$runtime();
                list$runtime = q0Var.getList$runtime();
            }
            e0.checkNotNull(list$runtime);
            j jVarAdd = list$runtime.add(i10, (Object) t10);
            if (e0.areEqual(jVarAdd, list$runtime)) {
                return;
            }
            y0 firstStateRecord2 = getFirstStateRecord();
            e0.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            q0 q0Var2 = (q0) firstStateRecord2;
            synchronized (y.getLock()) {
                current = m.f8651e.getCurrent();
                zAttemptUpdate = h0.attemptUpdate((q0) y.writableRecord(q0Var2, this, current), modification$runtime, jVarAdd, true);
            }
            y.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }
}
