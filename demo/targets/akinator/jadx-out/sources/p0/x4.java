package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x4 extends b1.x0 implements b1.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final y4 f80598c;

    /* renamed from: e, reason: collision with root package name */
    public a f80599e;

    public x4(Object obj, y4 y4Var) {
        this.f80598c = y4Var;
        b1.m mVarCurrentSnapshot = b1.y.currentSnapshot();
        a aVar = new a(mVarCurrentSnapshot.getSnapshotId(), obj);
        if (!(mVarCurrentSnapshot instanceof b1.c)) {
            aVar.setNext$runtime(new a(b1.v.toSnapshotId(1), obj));
        }
        this.f80599e = aVar;
    }

    @Override // b1.d0, p0.j2
    public Object component1() {
        return getValue();
    }

    @Override // b1.d0, p0.j2
    public kv.l component2() {
        return new g2(this, 4);
    }

    public final Object getDebuggerDisplayValue() {
        return ((a) b1.y.current(this.f80599e)).getValue();
    }

    @Override // b1.x0, b1.w0
    public b1.y0 getFirstStateRecord() {
        return this.f80599e;
    }

    @Override // b1.d0
    public y4 getPolicy() {
        return this.f80598c;
    }

    @Override // b1.d0, p0.j2, p0.v5
    public Object getValue() {
        return ((a) b1.y.readable(this.f80599e, this)).getValue();
    }

    @Override // b1.x0, b1.w0
    public b1.y0 mergeRecords(b1.y0 y0Var, b1.y0 y0Var2, b1.y0 y0Var3) {
        kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) y0Var;
        kotlin.jvm.internal.e0.checkNotNull(y0Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) y0Var2;
        kotlin.jvm.internal.e0.checkNotNull(y0Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) y0Var3;
        if (getPolicy().equivalent(aVar2.getValue(), aVar3.getValue())) {
            return y0Var2;
        }
        Object objMerge = getPolicy().merge(aVar.getValue(), aVar2.getValue(), aVar3.getValue());
        if (objMerge == null) {
            return null;
        }
        a aVarCreate = aVar3.create(aVar3.getSnapshotId$runtime());
        aVarCreate.setValue(objMerge);
        return aVarCreate;
    }

    @Override // b1.x0, b1.w0
    public void prependStateRecord(b1.y0 y0Var) {
        kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f80599e = (a) y0Var;
    }

    @Override // b1.d0, p0.j2
    public void setValue(Object obj) {
        b1.m current;
        a aVar = (a) b1.y.current(this.f80599e);
        if (getPolicy().equivalent(aVar.getValue(), obj)) {
            return;
        }
        a aVar2 = this.f80599e;
        synchronized (b1.y.getLock()) {
            current = b1.m.f8651e.getCurrent();
            ((a) b1.y.overwritableRecord(aVar2, this, current, aVar)).setValue(obj);
        }
        b1.y.notifyWrite(current, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) b1.y.current(this.f80599e)).getValue() + ")@" + hashCode();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends b1.y0 {

        /* renamed from: c, reason: collision with root package name */
        public Object f80600c;

        public a(long j10, Object obj) {
            super(j10);
            this.f80600c = obj;
        }

        @Override // b1.y0
        public void assign(b1.y0 y0Var) {
            kotlin.jvm.internal.e0.checkNotNull(y0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f80600c = ((a) y0Var).f80600c;
        }

        public final Object getValue() {
            return this.f80600c;
        }

        public final void setValue(Object obj) {
            this.f80600c = obj;
        }

        @Override // b1.y0
        public a create() {
            return new a(b1.y.currentSnapshot().getSnapshotId(), this.f80600c);
        }

        @Override // b1.y0
        public a create(long j10) {
            return new a(b1.y.currentSnapshot().getSnapshotId(), this.f80600c);
        }
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
