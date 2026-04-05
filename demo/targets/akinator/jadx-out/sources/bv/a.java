package bv;

import java.io.Serializable;
import kotlin.jvm.internal.e0;
import tu.a0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a implements zu.d, e, Serializable {
    private final zu.d<Object> completion;

    public a(zu.d<Object> dVar) {
        this.completion = dVar;
    }

    public zu.d<x0> create(zu.d<?> completion) {
        e0.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // bv.e
    public e getCallerFrame() {
        zu.d<Object> dVar = this.completion;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public final zu.d<Object> getCompletion() {
        return this.completion;
    }

    @Override // zu.d
    public abstract /* synthetic */ zu.m getContext();

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return g.getStackTraceElement(this);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zu.d
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        zu.d dVar = this;
        while (true) {
            h.probeCoroutineResumed(dVar);
            a aVar = (a) dVar;
            zu.d dVar2 = aVar.completion;
            e0.checkNotNull(dVar2);
            try {
                objInvokeSuspend = aVar.invokeSuspend(obj);
            } catch (Throwable th2) {
                int i10 = z.f87419c;
                obj = z.m7131constructorimpl(a0.createFailure(th2));
            }
            if (objInvokeSuspend == av.e.getCOROUTINE_SUSPENDED()) {
                return;
            }
            obj = z.m7131constructorimpl(objInvokeSuspend);
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public zu.d<x0> create(Object obj, zu.d<?> completion) {
        e0.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
