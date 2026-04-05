package w6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final o6.p f90392b;

    /* renamed from: c, reason: collision with root package name */
    public final o6.u f90393c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90394e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90395f;

    public b0(o6.p processor, o6.u token, boolean z10, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processor, "processor");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
        this.f90392b = processor;
        this.f90393c = token;
        this.f90394e = z10;
        this.f90395f = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10 = this.f90394e;
        int i10 = this.f90395f;
        o6.p pVar = this.f90392b;
        o6.u uVar = this.f90393c;
        boolean zStopForegroundWork = z10 ? pVar.stopForegroundWork(uVar, i10) : pVar.stopWork(uVar, i10);
        n6.c0.get().debug(n6.c0.tagWithPrefix("StopWorkRunnable"), "StopWorkRunnable for " + uVar.getId().getWorkSpecId() + "; Processor.stopWork = " + zStopForegroundWork);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(o6.p processor, o6.u token, boolean z10) {
        this(processor, token, z10, -512);
        kotlin.jvm.internal.e0.checkNotNullParameter(processor, "processor");
        kotlin.jvm.internal.e0.checkNotNullParameter(token, "token");
    }
}
