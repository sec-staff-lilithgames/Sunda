package ci;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12338b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12339c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f12340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f12341f;

    public /* synthetic */ e(g gVar, Runnable runnable, i iVar, int i10) {
        this.f12338b = i10;
        this.f12339c = gVar;
        this.f12340e = runnable;
        this.f12341f = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12338b) {
            case 0:
                ExecutorService executorService = this.f12339c.f12346b;
                final int i10 = 0;
                final Runnable runnable = this.f12340e;
                final i iVar = this.f12341f;
                executorService.execute(new Runnable() { // from class: ci.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) iVar).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) iVar).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar2 = iVar;
                                try {
                                    runnable2.run();
                                    ((h) iVar2).set(null);
                                    return;
                                } catch (Exception e12) {
                                    ((h) iVar2).setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f12339c.f12346b;
                final int i11 = 2;
                final Runnable runnable2 = this.f12340e;
                final i iVar2 = this.f12341f;
                executorService2.execute(new Runnable() { // from class: ci.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) iVar2).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) iVar2).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar22 = iVar2;
                                try {
                                    runnable22.run();
                                    ((h) iVar22).set(null);
                                    return;
                                } catch (Exception e12) {
                                    ((h) iVar22).setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f12339c.f12346b;
                final int i12 = 1;
                final Runnable runnable3 = this.f12340e;
                final i iVar3 = this.f12341f;
                executorService3.execute(new Runnable() { // from class: ci.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) iVar3).setException(e10);
                                    throw e10;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    ((h) iVar3).setException(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar22 = iVar3;
                                try {
                                    runnable22.run();
                                    ((h) iVar22).set(null);
                                    return;
                                } catch (Exception e12) {
                                    ((h) iVar22).setException(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
