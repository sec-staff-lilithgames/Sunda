package kotlinx.coroutines.debug.internal;

import bv.e;
import bv.f;
import bv.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kv.p;
import rv.f0;
import rv.v;
import rv.w;
import tu.a0;
import tu.x0;
import uu.p0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DebugCoroutineInfoImpl {
    private final WeakReference<m> _context;
    public volatile WeakReference<e> _lastObservedFrame;
    public volatile String _state = DebugCoroutineInfoImplKt.CREATED;
    private final StackTraceFrame creationStackBottom;
    public volatile Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    public static final class AnonymousClass1 extends l implements p {
        final /* synthetic */ StackTraceFrame $bottom;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StackTraceFrame stackTraceFrame, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$bottom = stackTraceFrame;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = DebugCoroutineInfoImpl.this.new AnonymousClass1(this.$bottom, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                v vVar = (v) this.L$0;
                DebugCoroutineInfoImpl debugCoroutineInfoImpl = DebugCoroutineInfoImpl.this;
                e callerFrame = this.$bottom.getCallerFrame();
                this.label = 1;
                if (debugCoroutineInfoImpl.yieldFrames(vVar, callerFrame, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(v vVar, d<? super x0> dVar) {
            return ((AnonymousClass1) create(vVar, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0}, l = {169}, m = "yieldFrames", n = {"$this$yieldFrames", "frame"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    public static final class C41531 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41531(d<? super C41531> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DebugCoroutineInfoImpl.this.yieldFrames(null, null, this);
        }
    }

    public DebugCoroutineInfoImpl(m mVar, StackTraceFrame stackTraceFrame, long j10) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j10;
        this._context = new WeakReference<>(mVar);
    }

    private final List<StackTraceElement> creationStackTrace() {
        StackTraceFrame stackTraceFrame = this.creationStackBottom;
        return stackTraceFrame == null ? p0.emptyList() : f0.toList(w.sequence(new AnonymousClass1(stackTraceFrame, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004b -> B:24:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:23:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yieldFrames(rv.v r6, bv.e r7, zu.d<? super tu.x0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C41531
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C41531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            tu.x0 r3 = tu.x0.f87415a
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r6
            java.lang.Object r7 = r0.L$1
            bv.e r7 = (bv.e) r7
            java.lang.Object r2 = r0.L$0
            rv.v r2 = (rv.v) r2
            tu.a0.throwOnFailure(r8)
            goto L5f
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            tu.a0.throwOnFailure(r8)
            r8 = r7
            r7 = r5
        L44:
            if (r8 != 0) goto L47
            return r3
        L47:
            java.lang.StackTraceElement r2 = r8.getStackTraceElement()
            if (r2 == 0) goto L62
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r2 = r6.yield(r2, r0)
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r2 = r6
            r6 = r7
            r7 = r8
        L5f:
            r8 = r7
            r7 = r6
            r6 = r2
        L62:
            bv.e r8 = r8.getCallerFrame()
            if (r8 == 0) goto L69
            goto L44
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.yieldFrames(rv.v, bv.e, zu.d):java.lang.Object");
    }

    public final m getContext() {
        return this._context.get();
    }

    public final StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final e getLastObservedFrame$kotlinx_coroutines_core() {
        WeakReference<e> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final String getState$kotlinx_coroutines_core() {
        return this._state;
    }

    public final List<StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        e lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(e eVar) {
        this._lastObservedFrame = eVar != null ? new WeakReference<>(eVar) : null;
    }

    public String toString() {
        return "DebugCoroutineInfo(state=" + getState$kotlinx_coroutines_core() + ",context=" + getContext() + ')';
    }

    public final synchronized void updateState$kotlinx_coroutines_core(String str, d<?> dVar, boolean z10) {
        try {
            if (e0.areEqual(this._state, DebugCoroutineInfoImplKt.RUNNING) && e0.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) && z10) {
                this.unmatchedResume++;
            } else if (this.unmatchedResume > 0 && e0.areEqual(str, DebugCoroutineInfoImplKt.SUSPENDED)) {
                this.unmatchedResume--;
                return;
            }
            if (e0.areEqual(this._state, str) && e0.areEqual(str, DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
                return;
            }
            this._state = str;
            setLastObservedFrame$kotlinx_coroutines_core(dVar instanceof e ? (e) dVar : null);
            this.lastObservedThread = e0.areEqual(str, DebugCoroutineInfoImplKt.RUNNING) ? Thread.currentThread() : null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
