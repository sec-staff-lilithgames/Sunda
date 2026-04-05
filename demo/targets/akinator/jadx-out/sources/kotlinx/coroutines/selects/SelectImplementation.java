package kotlinx.coroutines.selects;

import bv.f;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectBuilder;
import kv.l;
import kv.p;
import kv.q;
import uu.o0;
import uu.y0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    private final m context;
    private Object disposableHandleOrSegment;
    private volatile /* synthetic */ Object state$volatile = SelectKt.STATE_REG;
    private List<SelectImplementation<R>.ClauseData> clauses = new ArrayList(2);
    private int indexInSegment = -1;
    private Object internalResult = SelectKt.NO_RESULT;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class ClauseData {
        private final Object block;
        public final Object clauseObject;
        public Object disposableHandleOrSegment;
        public int indexInSegment = -1;
        public final q onCancellationConstructor;
        private final Object param;
        private final q processResFunc;
        private final q regFunc;

        public ClauseData(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.clauseObject = obj;
            this.regFunc = qVar;
            this.processResFunc = qVar2;
            this.param = obj2;
            this.block = obj3;
            this.onCancellationConstructor = qVar3;
        }

        public final q createOnCancellationAction(SelectInstance<?> selectInstance, Object obj) {
            q qVar = this.onCancellationConstructor;
            if (qVar != null) {
                return (q) qVar.invoke(selectInstance, this.param, obj);
            }
            return null;
        }

        public final void dispose() {
            Object obj = this.disposableHandleOrSegment;
            SelectImplementation<R> selectImplementation = SelectImplementation.this;
            if (obj instanceof Segment) {
                ((Segment) obj).onCancellation(this.indexInSegment, null, selectImplementation.getContext());
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }

        public final Object invokeBlock(Object obj, d<? super R> dVar) {
            Object obj2 = this.block;
            if (this.param == SelectKt.getPARAM_CLAUSE_0()) {
                e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((l) obj2).invoke(dVar);
            }
            e0.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, dVar);
        }

        public final Object processResult(Object obj) {
            return this.processResFunc.invoke(this.clauseObject, this.param, obj);
        }

        public final boolean tryRegisterAsWaiter(SelectImplementation<R> selectImplementation) {
            this.regFunc.invoke(this.clauseObject, selectImplementation, this.param);
            return ((SelectImplementation) selectImplementation).internalResult == SelectKt.NO_RESULT;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {453, 456}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectImplementation<R> selectImplementation, d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = selectImplementation;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doSelectSuspend(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {729}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41721 extends bv.d {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SelectImplementation<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41721(SelectImplementation<R> selectImplementation, d<? super C41721> dVar) {
            super(dVar);
            this.this$0 = selectImplementation;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        }
    }

    public SelectImplementation(m mVar) {
        this.context = mVar;
    }

    private final void checkClauseObject(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        e0.checkNotNull(list);
        List<SelectImplementation<R>.ClauseData> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((ClauseData) it.next()).clauseObject == obj) {
                throw new IllegalStateException(o2.j(obj, "Cannot use select clauses on the same object: ").toString());
            }
        }
    }

    private final void cleanup(SelectImplementation<R>.ClauseData clauseData) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        if (list == null) {
            return;
        }
        for (SelectImplementation<R>.ClauseData clauseData2 : list) {
            if (clauseData2 != clauseData) {
                clauseData2.dispose();
            }
        }
        state$volatile$FU.set(this, SelectKt.STATE_COMPLETED);
        this.internalResult = SelectKt.NO_RESULT;
        this.clauses = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object complete(d<? super R> dVar) {
        Object obj = state$volatile$FU.get(this);
        e0.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.internalResult;
        cleanup(clauseData);
        return clauseData.invokeBlock(clauseData.processResult(obj2), dVar);
    }

    public static /* synthetic */ <R> Object doSelect$suspendImpl(SelectImplementation<R> selectImplementation, d<? super R> dVar) {
        return selectImplementation.isSelected() ? selectImplementation.complete(dVar) : selectImplementation.doSelectSuspend(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doSelectSuspend(zu.d<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            tu.a0.throwOnFailure(r6)
            goto L4b
        L3c:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.waitUntilSelected(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.complete(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.doSelectSuspend(zu.d):java.lang.Object");
    }

    private final SelectImplementation<R>.ClauseData findClause(Object obj) {
        List<SelectImplementation<R>.ClauseData> list = this.clauses;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((ClauseData) next).clauseObject == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getInRegistrationPhase() {
        Object obj = state$volatile$FU.get(this);
        return obj == SelectKt.STATE_REG || (obj instanceof List);
    }

    private final /* synthetic */ Object getState$volatile() {
        return this.state$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCancelled() {
        return state$volatile$FU.get(this) == SelectKt.STATE_CANCELLED;
    }

    private final boolean isSelected() {
        return state$volatile$FU.get(this) instanceof ClauseData;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation<R>.ClauseData r5, java.lang.Object r6, zu.d<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation.C41721
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation.C41721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r7)
            return r7
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r6 = r5.processResult(r6)
            r0.label = r3
            java.lang.Object r5 = r5.invokeBlock(r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.processResultAndInvokeBlockRecoveringException(kotlinx.coroutines.selects.SelectImplementation$ClauseData, java.lang.Object, zu.d):java.lang.Object");
    }

    public static /* synthetic */ void register$default(SelectImplementation selectImplementation, ClauseData clauseData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        selectImplementation.register(clauseData, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reregisterClause(Object obj) {
        SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
        e0.checkNotNull(clauseDataFindClause);
        clauseDataFindClause.disposableHandleOrSegment = null;
        clauseDataFindClause.indexInSegment = -1;
        register(clauseDataFindClause, true);
    }

    private final /* synthetic */ void setState$volatile(Object obj) {
        this.state$volatile = obj;
    }

    private final int trySelectInternal(Object obj, Object obj2) {
        while (true) {
            Object obj3 = state$volatile$FU.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (e0.areEqual(obj3, SelectKt.STATE_COMPLETED) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (e0.areEqual(obj3, SelectKt.STATE_CANCELLED)) {
                    return 2;
                }
                if (e0.areEqual(obj3, SelectKt.STATE_REG)) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
                    List listListOf = o0.listOf(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listListOf)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(p0.o2.o(obj3, "Unexpected state: "));
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = state$volatile$FU;
                List listPlus = y0.plus((Collection<? extends Object>) obj3, obj);
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, listPlus)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            SelectImplementation<R>.ClauseData clauseDataFindClause = findClause(obj);
            if (clauseDataFindClause != null) {
                q qVarCreateOnCancellationAction = clauseDataFindClause.createOnCancellationAction(this, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = state$volatile$FU;
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj3, clauseDataFindClause)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj3) {
                        break;
                    }
                }
                this.internalResult = obj2;
                if (SelectKt.tryResume((CancellableContinuation) obj3, qVarCreateOnCancellationAction)) {
                    return 0;
                }
                this.internalResult = SelectKt.NO_RESULT;
                return 2;
            }
            continue;
        }
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lVar.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r0 = r0.getResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r0 != av.e.getCOROUTINE_SUSPENDED()) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        bv.h.probeCoroutineSuspended(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0 != av.e.getCOROUTINE_SUSPENDED()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitUntilSelected(zu.d<? super tu.x0> r7) {
        /*
            r6 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            zu.d r1 = av.b.intercepted(r7)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = access$getState$volatile$FU()
        L11:
            java.lang.Object r2 = r1.get(r6)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
            tu.x0 r4 = tu.x0.f87415a
            if (r2 != r3) goto L32
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
        L21:
            boolean r5 = r3.compareAndSet(r6, r2, r0)
            if (r5 == 0) goto L2b
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(r0, r6)
            goto L70
        L2b:
            java.lang.Object r5 = r3.get(r6)
            if (r5 == r2) goto L21
            goto L11
        L32:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L5f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = access$getState$volatile$FU()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.selects.SelectKt.access$getSTATE_REG$p()
        L3e:
            boolean r4 = r3.compareAndSet(r6, r2, r5)
            if (r4 == 0) goto L58
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L4a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            access$reregisterClause(r6, r3)
            goto L4a
        L58:
            java.lang.Object r4 = r3.get(r6)
            if (r4 == r2) goto L3e
            goto L11
        L5f:
            boolean r1 = r2 instanceof kotlinx.coroutines.selects.SelectImplementation.ClauseData
            if (r1 == 0) goto L85
            kotlinx.coroutines.selects.SelectImplementation$ClauseData r2 = (kotlinx.coroutines.selects.SelectImplementation.ClauseData) r2
            java.lang.Object r1 = access$getInternalResult$p(r6)
            kv.q r1 = r2.createOnCancellationAction(r6, r1)
            r0.resume(r4, r1)
        L70:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L7d
            bv.h.probeCoroutineSuspended(r7)
        L7d:
            java.lang.Object r7 = av.e.getCOROUTINE_SUSPENDED()
            if (r0 != r7) goto L84
            return r0
        L84:
            return r4
        L85:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected state: "
            java.lang.String r0 = p0.o2.o(r2, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.waitUntilSelected(zu.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.disposableHandleOrSegment = disposableHandle;
    }

    public Object doSelect(d<? super R> dVar) {
        return doSelect$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public m getContext() {
        return this.context;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, p pVar) {
        SelectBuilder.DefaultImpls.invoke(this, selectClause2, pVar);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i10) {
        this.disposableHandleOrSegment = segment;
        this.indexInSegment = i10;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    @tu.f
    public void onTimeout(long j10, l lVar) {
        SelectBuilder.DefaultImpls.onTimeout(this, j10, lVar);
    }

    public final void register(SelectImplementation<R>.ClauseData clauseData, boolean z10) {
        if (state$volatile$FU.get(this) instanceof ClauseData) {
            return;
        }
        if (!z10) {
            checkClauseObject(clauseData.clauseObject);
        }
        if (!clauseData.tryRegisterAsWaiter(this)) {
            state$volatile$FU.set(this, clauseData);
            return;
        }
        if (!z10) {
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            e0.checkNotNull(list);
            list.add(clauseData);
        }
        clauseData.disposableHandleOrSegment = this.disposableHandleOrSegment;
        clauseData.indexInSegment = this.indexInSegment;
        this.disposableHandleOrSegment = null;
        this.indexInSegment = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void selectInRegistrationPhase(Object obj) {
        this.internalResult = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect(Object obj, Object obj2) {
        return trySelectInternal(obj, obj2) == 0;
    }

    public final TrySelectDetailedResult trySelectDetailed(Object obj, Object obj2) {
        return SelectKt.TrySelectDetailedResult(trySelectInternal(obj, obj2));
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(SelectClause0 selectClause0, l lVar) {
        register$default(this, new ClauseData(selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), SelectKt.getPARAM_CLAUSE_0(), lVar, selectClause0.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(SelectClause1<? extends Q> selectClause1, p pVar) {
        register$default(this, new ClauseData(selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, pVar, selectClause1.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(SelectClause2<? super P, ? extends Q> selectClause2, P p10, p pVar) {
        register$default(this, new ClauseData(selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), p10, pVar, selectClause2.getOnCancellationConstructor()), false, 1, null);
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.STATE_COMPLETED) {
                return;
            }
            Symbol symbol = SelectKt.STATE_CANCELLED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            List<SelectImplementation<R>.ClauseData> list = this.clauses;
            if (list == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ClauseData) it.next()).dispose();
            }
            this.internalResult = SelectKt.NO_RESULT;
            this.clauses = null;
            return;
        }
    }
}
