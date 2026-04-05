package y6;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f94088i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f94089j;

    /* renamed from: k, reason: collision with root package name */
    public int f94090k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ConstraintTrackingWorker constraintTrackingWorker, zu.d dVar) {
        super(dVar);
        this.f94089j = constraintTrackingWorker;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f94088i = obj;
        this.f94090k |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.access$runWorker(this.f94089j, null, null, null, this);
    }
}
