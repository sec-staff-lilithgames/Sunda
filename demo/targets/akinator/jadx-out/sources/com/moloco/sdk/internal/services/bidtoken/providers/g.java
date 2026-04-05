package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.y;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements j {

    /* renamed from: b, reason: collision with root package name */
    public final y f46886b;

    /* renamed from: c, reason: collision with root package name */
    public f f46887c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(y audioService) {
        e0.checkNotNullParameter(audioService, "audioService");
        this.f46886b = audioService;
        this.f46887c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46887c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        f fVarE = e();
        boolean z10 = !e0.areEqual(fVarE, this.f46887c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z10 + ", with current: " + fVarE + ", cached: " + this.f46887c, false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "AudSignalProvider";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f e() {
        y yVar = this.f46886b;
        try {
            return new f(yVar.a(), Integer.valueOf(yVar.b()));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e10, false, 8, null);
            return new f(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f d() {
        return this.f46887c;
    }
}
