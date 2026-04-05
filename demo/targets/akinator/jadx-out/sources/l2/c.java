package l2;

import android.content.Context;
import android.graphics.Typeface;
import com.unity3d.services.core.request.NJc.yFkbx;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class c implements h1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f72256a;

    public c(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f72256a = context.getApplicationContext();
    }

    @Override // l2.h1
    public Object awaitLoad(w wVar, zu.d<? super Typeface> dVar) {
        boolean z10 = wVar instanceof b;
        Context context = this.f72256a;
        if (z10) {
            ((b) wVar).getTypefaceLoader();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            throw null;
        }
        if (wVar instanceof p1) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new d((p1) wVar, context, null), dVar);
            return objWithContext == av.e.getCOROUTINE_SUSPENDED() ? objWithContext : (Typeface) objWithContext;
        }
        throw new IllegalArgumentException("Unknown font type: " + wVar);
    }

    @Override // l2.h1
    public Object getCacheKey() {
        return null;
    }

    @Override // l2.h1
    public Typeface loadBlocking(w font) {
        Object objM7131constructorimpl;
        kotlin.jvm.internal.e0.checkNotNullParameter(font, "font");
        boolean z10 = font instanceof b;
        String str = yFkbx.BGIExrVN;
        Context context = this.f72256a;
        if (z10) {
            ((b) font).getTypefaceLoader();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, str);
            throw null;
        }
        if (!(font instanceof p1)) {
            return null;
        }
        int iMo5432getLoadingStrategyPKNRLFQ = font.mo5432getLoadingStrategyPKNRLFQ();
        u0 u0Var = v0.f72378b;
        if (v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5461getBlockingPKNRLFQ())) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, str);
            return e.access$load((p1) font, context);
        }
        if (!v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5462getOptionalLocalPKNRLFQ())) {
            if (v0.m5471equalsimpl0(iMo5432getLoadingStrategyPKNRLFQ, u0Var.m5460getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) v0.m5473toStringimpl(font.mo5432getLoadingStrategyPKNRLFQ())));
        }
        try {
            int i10 = tu.z.f87419c;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, str);
            objM7131constructorimpl = tu.z.m7131constructorimpl(e.access$load((p1) font, context));
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        return (Typeface) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }
}
