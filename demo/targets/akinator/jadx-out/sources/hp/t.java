package hp;

import android.util.SparseArray;
import ko.c0;
import ko.e1;
import ko.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t implements c0 {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f59128b;

    /* renamed from: c, reason: collision with root package name */
    public final q f59129c;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f59130e = new SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f59131f;

    public t(c0 c0Var, q qVar) {
        this.f59128b = c0Var;
        this.f59129c = qVar;
    }

    @Override // ko.c0
    public void endTracks() {
        this.f59128b.endTracks();
        if (!this.f59131f) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f59130e;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((u) sparseArray.valueAt(i10)).shouldSuppressParsingErrors(true);
            i10++;
        }
    }

    public void resetSubtitleParsers() {
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f59130e;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((u) sparseArray.valueAt(i10)).resetSubtitleParser();
            i10++;
        }
    }

    @Override // ko.c0
    public void seekMap(y0 y0Var) {
        this.f59128b.seekMap(y0Var);
    }

    @Override // ko.c0
    public e1 track(int i10, int i11) {
        c0 c0Var = this.f59128b;
        if (i11 != 3) {
            this.f59131f = true;
            return c0Var.track(i10, i11);
        }
        SparseArray sparseArray = this.f59130e;
        u uVar = (u) sparseArray.get(i10);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(c0Var.track(i10, i11), this.f59129c);
        sparseArray.put(i10, uVar2);
        return uVar2;
    }
}
