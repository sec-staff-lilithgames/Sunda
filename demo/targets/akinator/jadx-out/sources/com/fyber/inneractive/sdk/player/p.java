package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements com.fyber.inneractive.sdk.player.controller.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.measurement.f f26231a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26232b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26233c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26234d = false;

    public p(com.fyber.inneractive.sdk.measurement.f fVar) {
        this.f26231a = fVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.mediaplayer.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        IAlog.a("MeasurementHelper onPlayerStateChanged=%s mBuffering=%s mPrepared=%s", bVar, String.valueOf(this.f26232b), String.valueOf(this.f26234d));
        if (this.f26231a != null) {
            int i10 = o.f26230a[bVar.ordinal()];
            if (i10 == 1) {
                this.f26234d = true;
                return;
            }
            if (i10 == 2) {
                if (this.f26234d) {
                    com.fyber.inneractive.sdk.measurement.f fVar = this.f26231a;
                    if (fVar.f24015c != null) {
                        IAlog.a("%s bufferStart", "OMVideo");
                        try {
                            fVar.f24015c.bufferStart();
                        } catch (Throwable th2) {
                            fVar.a(th2);
                        }
                    }
                    this.f26232b = true;
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 == 4) {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = this.f26231a;
                    if (fVar2.f24015c != null) {
                        IAlog.a("%s pause", "OMVideo");
                        try {
                            fVar2.f24015c.pause();
                        } catch (Throwable th3) {
                            fVar2.a(th3);
                        }
                    }
                    this.f26233c = true;
                    return;
                }
                if (i10 != 5) {
                    return;
                }
                com.fyber.inneractive.sdk.measurement.f fVar3 = this.f26231a;
                if (fVar3.f24015c != null) {
                    IAlog.a("%s complete", "OMVideo");
                    try {
                        fVar3.f24015c.complete();
                        return;
                    } catch (Throwable th4) {
                        fVar3.a(th4);
                        return;
                    }
                }
                return;
            }
            if (this.f26232b) {
                this.f26232b = false;
                com.fyber.inneractive.sdk.measurement.f fVar4 = this.f26231a;
                if (fVar4.f24015c != null) {
                    IAlog.a("%s bufferEnd", "OMVideo");
                    try {
                        fVar4.f24015c.bufferFinish();
                        return;
                    } catch (Throwable th5) {
                        fVar4.a(th5);
                        return;
                    }
                }
                return;
            }
            if (this.f26233c) {
                com.fyber.inneractive.sdk.measurement.f fVar5 = this.f26231a;
                if (fVar5.f24015c != null) {
                    IAlog.a("%s resume", "OMVideo");
                    try {
                        fVar5.f24015c.resume();
                    } catch (Throwable th6) {
                        fVar5.a(th6);
                    }
                }
                this.f26233c = false;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void d() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.p
    public final void c(boolean z10) {
    }
}
