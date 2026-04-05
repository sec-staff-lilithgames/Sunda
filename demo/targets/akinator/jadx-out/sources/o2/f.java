package o2;

import android.graphics.Typeface;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.r;
import l2.a1;
import l2.c1;
import l2.x;
import l2.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends f0 implements r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f77403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(4);
        this.f77403e = gVar;
    }

    @Override // kv.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m5768invokeDPcqOEQ((x) obj, (c1) obj2, ((y0) obj3).m5488unboximpl(), ((a1) obj4).m5431unboximpl());
    }

    /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
    public final Typeface m5768invokeDPcqOEQ(x xVar, c1 fontWeight, int i10, int i11) {
        e0.checkNotNullParameter(fontWeight, "fontWeight");
        g gVar = this.f77403e;
        p pVar = new p(gVar.getFontFamilyResolver().mo5437resolveDPcqOEQ(xVar, fontWeight, i10, i11));
        gVar.f77413j.add(pVar);
        return pVar.getTypeface();
    }
}
