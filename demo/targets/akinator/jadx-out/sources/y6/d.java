package y6;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import n6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public b0 f94096i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f94097j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f94098k;

    /* renamed from: l, reason: collision with root package name */
    public int f94099l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstraintTrackingWorker constraintTrackingWorker, zu.d dVar) {
        super(dVar);
        this.f94098k = constraintTrackingWorker;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f94097j = obj;
        this.f94099l |= Integer.MIN_VALUE;
        return ConstraintTrackingWorker.access$setupAndRunConstraintTrackingWork(this.f94098k, this);
    }
}
