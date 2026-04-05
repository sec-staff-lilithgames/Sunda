package p2;

import android.graphics.Typeface;
import android.text.Spannable;
import g2.r1;
import j2.m;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.q;
import kv.r;
import l2.a1;
import l2.c1;
import l2.x;
import l2.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends f0 implements q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Spannable f80674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f80675f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Spannable spannable, r rVar) {
        super(3);
        this.f80674e = spannable;
        this.f80675f = rVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((r1) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return x0.f87415a;
    }

    public final void invoke(r1 spanStyle, int i10, int i11) {
        e0.checkNotNullParameter(spanStyle, "spanStyle");
        x fontFamily = spanStyle.getFontFamily();
        c1 fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = c1.f72258c.getNormal();
        }
        y0 y0VarM4018getFontStyle4Lr2A7w = spanStyle.m4018getFontStyle4Lr2A7w();
        y0 y0VarM5482boximpl = y0.m5482boximpl(y0VarM4018getFontStyle4Lr2A7w != null ? y0VarM4018getFontStyle4Lr2A7w.m5488unboximpl() : y0.f72394b.m5480getNormal_LCdwA());
        a1 a1VarM4019getFontSynthesisZQGJjVo = spanStyle.m4019getFontSynthesisZQGJjVo();
        this.f80674e.setSpan(new m((Typeface) this.f80675f.invoke(fontFamily, fontWeight, y0VarM5482boximpl, a1.m5423boximpl(a1VarM4019getFontSynthesisZQGJjVo != null ? a1VarM4019getFontSynthesisZQGJjVo.m5431unboximpl() : a1.f72244b.m5489getAllGVVA2EU()))), i10, i11, 33);
    }
}
