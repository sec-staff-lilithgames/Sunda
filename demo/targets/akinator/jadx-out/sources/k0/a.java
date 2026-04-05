package k0;

import i1.o;
import j1.f2;
import j1.g1;
import kotlin.jvm.internal.e0;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements f2 {

    /* renamed from: a, reason: collision with root package name */
    public final b f70003a;

    /* renamed from: b, reason: collision with root package name */
    public final b f70004b;

    /* renamed from: c, reason: collision with root package name */
    public final b f70005c;

    /* renamed from: d, reason: collision with root package name */
    public final b f70006d;

    public a(b topStart, b topEnd, b bottomEnd, b bottomStart) {
        e0.checkNotNullParameter(topStart, "topStart");
        e0.checkNotNullParameter(topEnd, "topEnd");
        e0.checkNotNullParameter(bottomEnd, "bottomEnd");
        e0.checkNotNullParameter(bottomStart, "bottomStart");
        this.f70003a = topStart;
        this.f70004b = topEnd;
        this.f70005c = bottomEnd;
        this.f70006d = bottomStart;
    }

    public static /* synthetic */ a copy$default(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            bVar = aVar.f70003a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.f70004b;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f70005c;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f70006d;
        }
        return aVar.copy(bVar, bVar2, bVar3, bVar4);
    }

    public final a copy(b all) {
        e0.checkNotNullParameter(all, "all");
        return copy(all, all, all, all);
    }

    public abstract a copy(b bVar, b bVar2, b bVar3, b bVar4);

    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public abstract g1 mo5088createOutlineLjSzlW0(long j10, float f10, float f11, float f12, float f13, x xVar);

    @Override // j1.f2
    /* renamed from: createOutline-Pq9zytI */
    public final g1 mo3688createOutlinePq9zytI(long j10, x layoutDirection, s2.e density) {
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        e0.checkNotNullParameter(density, "density");
        float fMo5089toPxTmRCtEA = this.f70003a.mo5089toPxTmRCtEA(j10, density);
        float fMo5089toPxTmRCtEA2 = this.f70004b.mo5089toPxTmRCtEA(j10, density);
        float fMo5089toPxTmRCtEA3 = this.f70005c.mo5089toPxTmRCtEA(j10, density);
        float fMo5089toPxTmRCtEA4 = this.f70006d.mo5089toPxTmRCtEA(j10, density);
        float fM4251getMinDimensionimpl = o.m4251getMinDimensionimpl(j10);
        float f10 = fMo5089toPxTmRCtEA + fMo5089toPxTmRCtEA4;
        if (f10 > fM4251getMinDimensionimpl) {
            float f11 = fM4251getMinDimensionimpl / f10;
            fMo5089toPxTmRCtEA *= f11;
            fMo5089toPxTmRCtEA4 *= f11;
        }
        float f12 = fMo5089toPxTmRCtEA2 + fMo5089toPxTmRCtEA3;
        if (f12 > fM4251getMinDimensionimpl) {
            float f13 = fM4251getMinDimensionimpl / f12;
            fMo5089toPxTmRCtEA2 *= f13;
            fMo5089toPxTmRCtEA3 *= f13;
        }
        if (fMo5089toPxTmRCtEA >= 0.0f && fMo5089toPxTmRCtEA2 >= 0.0f && fMo5089toPxTmRCtEA3 >= 0.0f && fMo5089toPxTmRCtEA4 >= 0.0f) {
            return mo5088createOutlineLjSzlW0(j10, fMo5089toPxTmRCtEA, fMo5089toPxTmRCtEA2, fMo5089toPxTmRCtEA3, fMo5089toPxTmRCtEA4, layoutDirection);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fMo5089toPxTmRCtEA + ", topEnd = " + fMo5089toPxTmRCtEA2 + ", bottomEnd = " + fMo5089toPxTmRCtEA3 + ", bottomStart = " + fMo5089toPxTmRCtEA4 + ")!").toString());
    }

    public final b getBottomEnd() {
        return this.f70005c;
    }

    public final b getBottomStart() {
        return this.f70006d;
    }

    public final b getTopEnd() {
        return this.f70004b;
    }

    public final b getTopStart() {
        return this.f70003a;
    }
}
