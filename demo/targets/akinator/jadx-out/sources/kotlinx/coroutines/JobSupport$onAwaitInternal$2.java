package kotlinx.coroutines;

import kotlin.jvm.internal.a0;
import kv.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public /* synthetic */ class JobSupport$onAwaitInternal$2 extends a0 implements q {
    public static final JobSupport$onAwaitInternal$2 INSTANCE = new JobSupport$onAwaitInternal$2();

    public JobSupport$onAwaitInternal$2() {
        super(3, JobSupport.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kv.q
    public final Object invoke(JobSupport jobSupport, Object obj, Object obj2) {
        return jobSupport.onAwaitInternalProcessResFunc(obj, obj2);
    }
}
