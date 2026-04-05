package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {0}, l = {337}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends n implements p {
    final /* synthetic */ CompletableDeferred<z> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<z> completableDeferred, zu.d<? super FlowKt__ShareKt$launchSharingDeferred$1> dVar) {
        super(2, dVar);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, dVar);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final b1 b1Var2 = new b1();
                Flow<T> flow = this.$upstream;
                final CompletableDeferred<z> completableDeferred = this.$result;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(T t10, zu.d<? super x0> dVar) {
                        b1 b1Var3 = b1Var2;
                        MutableStateFlow mutableStateFlow = (MutableStateFlow) b1Var3.f71816b;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(t10);
                        } else {
                            CoroutineScope coroutineScope2 = coroutineScope;
                            CompletableDeferred<z> completableDeferred2 = completableDeferred;
                            MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(t10);
                            int i11 = z.f87419c;
                            completableDeferred2.complete(z.m7130boximpl(z.m7131constructorimpl(new ReadonlyStateFlow(MutableStateFlow, JobKt.getJob(coroutineScope2.getCoroutineContext())))));
                            b1Var3.f71816b = MutableStateFlow;
                        }
                        return x0.f87415a;
                    }
                };
                this.L$0 = b1Var2;
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                b1Var = b1Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1Var = (b1) this.L$0;
                a0.throwOnFailure(obj);
            }
            if (b1Var.f71816b == null) {
                CompletableDeferred<z> completableDeferred2 = this.$result;
                int i11 = z.f87419c;
                completableDeferred2.complete(z.m7130boximpl(z.m7131constructorimpl(a0.createFailure(new NoSuchElementException("Flow is empty")))));
            }
            return x0.f87415a;
        } catch (Throwable th2) {
            this.$result.completeExceptionally(th2);
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
