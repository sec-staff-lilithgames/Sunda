package ag;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import x3.e3;
import x3.s2;
import x3.t3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class l extends s2.b {

    /* renamed from: e, reason: collision with root package name */
    public final View f4411e;

    /* renamed from: f, reason: collision with root package name */
    public int f4412f;

    /* renamed from: g, reason: collision with root package name */
    public int f4413g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f4414h;

    public l(View view) {
        super(0);
        this.f4414h = new int[2];
        this.f4411e = view;
    }

    @Override // x3.s2.b
    public void onEnd(s2 s2Var) {
        this.f4411e.setTranslationY(0.0f);
    }

    @Override // x3.s2.b
    public void onPrepare(s2 s2Var) {
        View view = this.f4411e;
        int[] iArr = this.f4414h;
        view.getLocationOnScreen(iArr);
        this.f4412f = iArr[1];
    }

    @Override // x3.s2.b
    public e3 onProgress(e3 e3Var, List<s2> list) {
        Iterator<s2> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & t3.ime()) != 0) {
                this.f4411e.setTranslationY(vf.a.lerp(this.f4413g, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return e3Var;
    }

    @Override // x3.s2.b
    public s2.a onStart(s2 s2Var, s2.a aVar) {
        View view = this.f4411e;
        int[] iArr = this.f4414h;
        view.getLocationOnScreen(iArr);
        int i10 = this.f4412f - iArr[1];
        this.f4413g = i10;
        view.setTranslationY(i10);
        return aVar;
    }
}
