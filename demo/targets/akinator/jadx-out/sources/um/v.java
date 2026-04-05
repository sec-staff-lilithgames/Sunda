package um;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class v extends s {
    public v(View.OnClickListener onClickListener) {
        super(onClickListener);
    }

    @Override // um.s
    public final View b(Context context, p pVar) {
        return ("text".equals(pVar.getStyle()) || "text-reverse".equals(pVar.getStyle())) ? new zm.e(context) : ("circular".equals(pVar.getStyle()) || "circular-reverse".equals(pVar.getStyle())) ? new zm.a(context) : new zm.d(context);
    }

    @Override // um.s
    public final p c(Context context, p pVar) {
        if (pVar != null) {
            if ("text".equals(pVar.getStyle()) || "text-reverse".equals(pVar.getStyle())) {
                return a.f88532k;
            }
            if ("circular".equals(pVar.getStyle()) || "circular-reverse".equals(pVar.getStyle())) {
                return a.f88534m;
            }
        }
        return a.f88533l;
    }

    public void changePercentage(float f10, int i10, int i11) {
        p pVar = this.f88643c;
        if (pVar == null) {
            return;
        }
        boolean z10 = pVar.getStyle() != null && this.f88643c.getStyle().endsWith("reverse");
        View view = this.f88642b;
        if (view instanceof zm.e) {
            zm.e eVar = (zm.e) view;
            if (i11 == 0) {
                eVar.setText("");
                return;
            }
            if (z10) {
                i10 = i11 - i10;
            }
            eVar.setRemaining(Math.max(1, i10));
            return;
        }
        if (view instanceof zm.a) {
            zm.a aVar = (zm.a) view;
            if (z10) {
                aVar.changePercentage(f10, i11 != 0 ? Math.max(1, i11 - i10) : 0);
                return;
            } else {
                aVar.changePercentage(100.0f - f10, i10);
                return;
            }
        }
        if (view instanceof zm.d) {
            zm.d dVar = (zm.d) view;
            if (z10) {
                f10 = 100.0f - f10;
            }
            dVar.changePercentage(f10);
        }
    }
}
