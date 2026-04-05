package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f7185a;

    /* renamed from: b, reason: collision with root package name */
    public int f7186b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7187c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f7188d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f7189e = null;

    public m(g1 g1Var) {
        this.f7185a = g1Var;
    }

    public void dispatchLastEvent() {
        int i10 = this.f7186b;
        if (i10 == 0) {
            return;
        }
        g1 g1Var = this.f7185a;
        if (i10 == 1) {
            g1Var.onInserted(this.f7187c, this.f7188d);
        } else if (i10 == 2) {
            g1Var.onRemoved(this.f7187c, this.f7188d);
        } else if (i10 == 3) {
            g1Var.onChanged(this.f7187c, this.f7188d, this.f7189e);
        }
        this.f7189e = null;
        this.f7186b = 0;
    }

    @Override // androidx.recyclerview.widget.g1
    public void onChanged(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14;
        if (this.f7186b == 3 && i10 <= (i13 = this.f7188d + (i12 = this.f7187c)) && (i14 = i10 + i11) >= i12 && this.f7189e == obj) {
            this.f7187c = Math.min(i10, i12);
            this.f7188d = Math.max(i13, i14) - this.f7187c;
            return;
        }
        dispatchLastEvent();
        this.f7187c = i10;
        this.f7188d = i11;
        this.f7189e = obj;
        this.f7186b = 3;
    }

    @Override // androidx.recyclerview.widget.g1
    public void onInserted(int i10, int i11) {
        int i12;
        if (this.f7186b == 1 && i10 >= (i12 = this.f7187c)) {
            int i13 = this.f7188d;
            if (i10 <= i12 + i13) {
                this.f7188d = i13 + i11;
                this.f7187c = Math.min(i10, i12);
                return;
            }
        }
        dispatchLastEvent();
        this.f7187c = i10;
        this.f7188d = i11;
        this.f7186b = 1;
    }

    @Override // androidx.recyclerview.widget.g1
    public void onMoved(int i10, int i11) {
        dispatchLastEvent();
        this.f7185a.onMoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.g1
    public void onRemoved(int i10, int i11) {
        int i12;
        if (this.f7186b == 2 && (i12 = this.f7187c) >= i10 && i12 <= i10 + i11) {
            this.f7188d += i11;
            this.f7187c = i10;
        } else {
            dispatchLastEvent();
            this.f7187c = i10;
            this.f7188d = i11;
            this.f7186b = 2;
        }
    }
}
