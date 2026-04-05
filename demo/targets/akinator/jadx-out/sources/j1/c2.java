package j1;

import android.graphics.Shader;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c2 {
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4708ImageShaderF49vj9s(y0 image, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        return q.m4902ActualImageShaderF49vj9s(image, i10, i11);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m4709ImageShaderF49vj9s$default(y0 y0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = r2.f68961b.m4915getClamp3opZhB0();
        }
        if ((i12 & 4) != 0) {
            i11 = r2.f68961b.m4915getClamp3opZhB0();
        }
        return m4708ImageShaderF49vj9s(y0Var, i10, i11);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4710LinearGradientShaderVjE6UOU(long j10, long j11, List<m0> colors, List<Float> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        return q.m4903ActualLinearGradientShaderVjE6UOU(j10, j11, colors, list, i10);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m4711LinearGradientShaderVjE6UOU$default(long j10, long j11, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = r2.f68961b.m4915getClamp3opZhB0();
        }
        return m4710LinearGradientShaderVjE6UOU(j10, j11, list, list3, i10);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4712RadialGradientShader8uybcMk(long j10, float f10, List<m0> colors, List<Float> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        return q.m4904ActualRadialGradientShader8uybcMk(j10, f10, colors, list, i10);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m4713RadialGradientShader8uybcMk$default(long j10, float f10, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            i10 = r2.f68961b.m4915getClamp3opZhB0();
        }
        return m4712RadialGradientShader8uybcMk(j10, f10, list, list3, i10);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4714SweepGradientShader9KIMszo(long j10, List<m0> colors, List<Float> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        return q.m4905ActualSweepGradientShader9KIMszo(j10, colors, list);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m4715SweepGradientShader9KIMszo$default(long j10, List list, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list2 = null;
        }
        return m4714SweepGradientShader9KIMszo(j10, list, list2);
    }
}
