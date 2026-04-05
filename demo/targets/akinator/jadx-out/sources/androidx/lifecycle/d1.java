package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d1 extends k0 {

    /* renamed from: k, reason: collision with root package name */
    public static final a f6538k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6539b;

    /* renamed from: c, reason: collision with root package name */
    public s.a f6540c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f6541d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f6542e;

    /* renamed from: f, reason: collision with root package name */
    public int f6543f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6544g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6545h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6546i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f6547j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final d1 createUnsafe(b1 owner) {
            kotlin.jvm.internal.e0.checkNotNullParameter(owner, "owner");
            return new d1(owner, false, null);
        }

        public final j0 min$lifecycle_runtime_release(j0 state1, j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(state1, "state1");
            return (j0Var == null || j0Var.compareTo(state1) >= 0) ? state1 : j0Var;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public j0 f6548a;

        /* renamed from: b, reason: collision with root package name */
        public v0 f6549b;

        public b(a1 a1Var, j0 initialState) {
            kotlin.jvm.internal.e0.checkNotNullParameter(initialState, "initialState");
            kotlin.jvm.internal.e0.checkNotNull(a1Var);
            this.f6549b = g1.lifecycleEventObserver(a1Var);
            this.f6548a = initialState;
        }

        public final void dispatchEvent(b1 b1Var, i0 event) {
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            j0 targetState = event.getTargetState();
            this.f6548a = d1.f6538k.min$lifecycle_runtime_release(this.f6548a, targetState);
            v0 v0Var = this.f6549b;
            kotlin.jvm.internal.e0.checkNotNull(b1Var);
            v0Var.onStateChanged(b1Var, event);
            this.f6548a = targetState;
        }

        public final v0 getLifecycleObserver() {
            return this.f6549b;
        }

        public final j0 getState() {
            return this.f6548a;
        }

        public final void setLifecycleObserver(v0 v0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(v0Var, "<set-?>");
            this.f6549b = v0Var;
        }

        public final void setState(j0 j0Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<set-?>");
            this.f6548a = j0Var;
        }
    }

    public /* synthetic */ d1(b1 b1Var, boolean z10, kotlin.jvm.internal.u uVar) {
        this(b1Var, z10);
    }

    public static final d1 createUnsafe(b1 b1Var) {
        return f6538k.createUnsafe(b1Var);
    }

    public final j0 a(a1 a1Var) {
        b bVar;
        Map.Entry<Object, Object> entryCeil = this.f6540c.ceil(a1Var);
        j0 state = (entryCeil == null || (bVar = (b) entryCeil.getValue()) == null) ? null : bVar.getState();
        ArrayList arrayList = this.f6546i;
        j0 j0Var = arrayList.isEmpty() ? null : (j0) j1.o2.e(1, arrayList);
        j0 j0Var2 = this.f6541d;
        a aVar = f6538k;
        return aVar.min$lifecycle_runtime_release(aVar.min$lifecycle_runtime_release(j0Var2, state), j0Var);
    }

    @Override // androidx.lifecycle.k0
    public void addObserver(a1 observer) {
        b1 b1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        b("addObserver");
        j0 j0Var = this.f6541d;
        j0 j0Var2 = j0.f6614b;
        if (j0Var != j0Var2) {
            j0Var2 = j0.f6615c;
        }
        b bVar = new b(observer, j0Var2);
        if (((b) this.f6540c.putIfAbsent(observer, bVar)) == null && (b1Var = (b1) this.f6542e.get()) != null) {
            boolean z10 = this.f6543f != 0 || this.f6544g;
            j0 j0VarA = a(observer);
            this.f6543f++;
            while (bVar.getState().compareTo(j0VarA) < 0 && this.f6540c.contains(observer)) {
                j0 state = bVar.getState();
                ArrayList arrayList = this.f6546i;
                arrayList.add(state);
                i0 i0VarUpFrom = i0.Companion.upFrom(bVar.getState());
                if (i0VarUpFrom == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.dispatchEvent(b1Var, i0VarUpFrom);
                arrayList.remove(arrayList.size() - 1);
                j0VarA = a(observer);
            }
            if (!z10) {
                d();
            }
            this.f6543f--;
        }
    }

    public final void b(String str) {
        if (this.f6539b && !f1.isMainThread()) {
            throw new IllegalStateException(a.b.l("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void c(j0 j0Var) {
        if (this.f6541d == j0Var) {
            return;
        }
        e1.checkLifecycleStateTransition((b1) this.f6542e.get(), this.f6541d, j0Var);
        this.f6541d = j0Var;
        if (this.f6544g || this.f6543f != 0) {
            this.f6545h = true;
            return;
        }
        this.f6544g = true;
        d();
        this.f6544g = false;
        if (this.f6541d == j0.f6614b) {
            this.f6540c = new s.a();
        }
    }

    public final void d() {
        b1 b1Var = (b1) this.f6542e.get();
        if (b1Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (this.f6540c.size() != 0) {
            Map.Entry<Object, Object> entryEldest = this.f6540c.eldest();
            kotlin.jvm.internal.e0.checkNotNull(entryEldest);
            j0 state = ((b) entryEldest.getValue()).getState();
            Map.Entry<Object, Object> entryNewest = this.f6540c.newest();
            kotlin.jvm.internal.e0.checkNotNull(entryNewest);
            j0 state2 = ((b) entryNewest.getValue()).getState();
            if (state == state2 && this.f6541d == state2) {
                break;
            }
            this.f6545h = false;
            j0 j0Var = this.f6541d;
            Map.Entry<Object, Object> entryEldest2 = this.f6540c.eldest();
            kotlin.jvm.internal.e0.checkNotNull(entryEldest2);
            int iCompareTo = j0Var.compareTo(((b) entryEldest2.getValue()).getState());
            ArrayList arrayList = this.f6546i;
            if (iCompareTo < 0) {
                Iterator<Map.Entry<Object, Object>> itDescendingIterator = this.f6540c.descendingIterator();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
                while (itDescendingIterator.hasNext() && !this.f6545h) {
                    Map.Entry<Object, Object> next = itDescendingIterator.next();
                    kotlin.jvm.internal.e0.checkNotNull(next);
                    a1 a1Var = (a1) next.getKey();
                    b bVar = (b) next.getValue();
                    while (bVar.getState().compareTo(this.f6541d) > 0 && !this.f6545h && this.f6540c.contains(a1Var)) {
                        i0 i0VarDownFrom = i0.Companion.downFrom(bVar.getState());
                        if (i0VarDownFrom == null) {
                            throw new IllegalStateException("no event down from " + bVar.getState());
                        }
                        arrayList.add(i0VarDownFrom.getTargetState());
                        bVar.dispatchEvent(b1Var, i0VarDownFrom);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            Map.Entry<Object, Object> entryNewest2 = this.f6540c.newest();
            if (!this.f6545h && entryNewest2 != null && this.f6541d.compareTo(((b) entryNewest2.getValue()).getState()) > 0) {
                s.d dVarIteratorWithAdditions = this.f6540c.iteratorWithAdditions();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(dVarIteratorWithAdditions, "iteratorWithAdditions(...)");
                while (dVarIteratorWithAdditions.hasNext() && !this.f6545h) {
                    Map.Entry entry = (Map.Entry) dVarIteratorWithAdditions.next();
                    a1 a1Var2 = (a1) entry.getKey();
                    b bVar2 = (b) entry.getValue();
                    while (bVar2.getState().compareTo(this.f6541d) < 0 && !this.f6545h && this.f6540c.contains(a1Var2)) {
                        arrayList.add(bVar2.getState());
                        i0 i0VarUpFrom = i0.Companion.upFrom(bVar2.getState());
                        if (i0VarUpFrom == null) {
                            throw new IllegalStateException("no event up from " + bVar2.getState());
                        }
                        bVar2.dispatchEvent(b1Var, i0VarUpFrom);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
        this.f6545h = false;
        this.f6547j.setValue(getCurrentState());
    }

    @Override // androidx.lifecycle.k0
    public j0 getCurrentState() {
        return this.f6541d;
    }

    @Override // androidx.lifecycle.k0
    public StateFlow<j0> getCurrentStateFlow() {
        return FlowKt.asStateFlow(this.f6547j);
    }

    public int getObserverCount() {
        b("getObserverCount");
        return this.f6540c.size();
    }

    public void handleLifecycleEvent(i0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        b("handleLifecycleEvent");
        c(event.getTargetState());
    }

    @tu.f
    public void markState(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        b("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.k0
    public void removeObserver(a1 observer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(observer, "observer");
        b("removeObserver");
        this.f6540c.remove(observer);
    }

    public void setCurrentState(j0 state) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        b("setCurrentState");
        c(state);
    }

    public d1(b1 b1Var, boolean z10) {
        this.f6539b = z10;
        this.f6540c = new s.a();
        j0 j0Var = j0.f6615c;
        this.f6541d = j0Var;
        this.f6546i = new ArrayList();
        this.f6542e = new WeakReference(b1Var);
        this.f6547j = StateFlowKt.MutableStateFlow(j0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(b1 provider) {
        this(provider, true);
        kotlin.jvm.internal.e0.checkNotNullParameter(provider, "provider");
    }
}
