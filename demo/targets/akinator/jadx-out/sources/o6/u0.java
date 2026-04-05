package o6;

import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f77973a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f77974b;

    public u0(p processor, x6.b workTaskExecutor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processor, "processor");
        kotlin.jvm.internal.e0.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f77973a = processor;
        this.f77974b = workTaskExecutor;
    }

    public final p getProcessor() {
        return this.f77973a;
    }

    public final x6.b getWorkTaskExecutor() {
        return this.f77974b;
    }

    @Override // o6.t0
    public /* bridge */ /* synthetic */ void startWork(u uVar) {
        super.startWork(uVar);
    }

    @Override // o6.t0
    public /* bridge */ /* synthetic */ void stopWork(u uVar) {
        super.stopWork(uVar);
    }

    @Override // o6.t0
    public /* bridge */ /* synthetic */ void stopWorkWithReason(u uVar, int i10) {
        super.stopWorkWithReason(uVar, i10);
    }

    @Override // o6.t0
    public void startWork(u workSpecId, WorkerParameters.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        this.f77974b.executeOnTaskThread(new io.bidmachine.media3.exoplayer.b1(this, 11, workSpecId, aVar));
    }

    @Override // o6.t0
    public void stopWork(u workSpecId, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(workSpecId, "workSpecId");
        this.f77974b.executeOnTaskThread(new w6.b0(this.f77973a, workSpecId, false, i10));
    }
}
