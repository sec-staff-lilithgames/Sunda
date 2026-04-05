package b7;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p0.g3;
import p0.h3;
import p0.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final g3 f8913a;

    public /* synthetic */ y(g3 g3Var) {
        this.f8913a = g3Var;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ y m145boximpl(g3 g3Var) {
        return new y(g3Var);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ g3 m147constructorimpl$default(g3 g3Var, int i10, kotlin.jvm.internal.u uVar) {
        if ((i10 & 1) != 0) {
            g3Var = o0.staticCompositionLocalOf(x.f8912e);
        }
        return m146constructorimpl(g3Var);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m148equalsimpl(g3 g3Var, Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.e0.areEqual(g3Var, ((y) obj).m153unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m149equalsimpl0(g3 g3Var, g3 g3Var2) {
        return kotlin.jvm.internal.e0.areEqual(g3Var, g3Var2);
    }

    public static final a7.m getCurrent(g3 g3Var, p0.w wVar, int i10) {
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-617597678, i10, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        a7.m mVarImageLoader = (a7.m) wVar.consume(g3Var);
        if (mVarImageLoader == null) {
            mVarImageLoader = a7.a.imageLoader((Context) wVar.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        return mVarImageLoader;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m150hashCodeimpl(g3 g3Var) {
        return g3Var.hashCode();
    }

    @tu.f
    /* renamed from: provides-impl, reason: not valid java name */
    public static final h3 m151providesimpl(g3 g3Var, a7.m mVar) {
        return g3Var.provides(mVar);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m152toStringimpl(g3 g3Var) {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + g3Var + ')';
    }

    public boolean equals(Object obj) {
        return m148equalsimpl(this.f8913a, obj);
    }

    public int hashCode() {
        return m150hashCodeimpl(this.f8913a);
    }

    public String toString() {
        return m152toStringimpl(this.f8913a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ g3 m153unboximpl() {
        return this.f8913a;
    }

    @tu.f
    public static /* synthetic */ void getCurrent$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static g3 m146constructorimpl(g3 g3Var) {
        return g3Var;
    }
}
