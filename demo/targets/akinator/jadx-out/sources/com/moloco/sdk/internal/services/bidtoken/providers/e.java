package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements j {

    /* renamed from: b, reason: collision with root package name */
    public final Context f46882b;

    /* renamed from: c, reason: collision with root package name */
    public d f46883c;

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

    public e(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f46882b = context;
        this.f46883c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.f46883c = new d(e());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        d dVar = new d(e());
        boolean z10 = !e0.areEqual(dVar, this.f46883c);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z10 + ", with adi: " + dVar.b(), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "ADISignalProvider";
    }

    public final Long e() {
        try {
            return Long.valueOf(this.f46882b.getFilesDir().getTotalSpace());
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e10, false, 8, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d d() {
        d dVar = this.f46883c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI providing " + dVar.b(), false, 4, null);
        return dVar;
    }
}
