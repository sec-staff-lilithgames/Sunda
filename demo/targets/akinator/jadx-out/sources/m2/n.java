package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final a f73947f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final n f73948g = new n(false, 0, false, 0, 0, 31, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73951c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73952d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73953e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final n getDefault() {
            return n.f73948g;
        }
    }

    public n(boolean z10, int i10, boolean z11, int i11, int i12, kotlin.jvm.internal.u uVar) {
        this.f73949a = z10;
        this.f73950b = i10;
        this.f73951c = z11;
        this.f73952d = i11;
        this.f73953e = i12;
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ n m5607copyuxg59PA$default(n nVar, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = nVar.f73949a;
        }
        if ((i13 & 2) != 0) {
            i10 = nVar.f73950b;
        }
        if ((i13 & 4) != 0) {
            z11 = nVar.f73951c;
        }
        if ((i13 & 8) != 0) {
            i11 = nVar.f73952d;
        }
        if ((i13 & 16) != 0) {
            i12 = nVar.f73953e;
        }
        int i14 = i12;
        boolean z12 = z11;
        return nVar.m5608copyuxg59PA(z10, i10, z12, i11, i14);
    }

    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final n m5608copyuxg59PA(boolean z10, int i10, boolean z11, int i11, int i12) {
        return new n(z10, i10, z11, i11, i12, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f73949a == nVar.f73949a && u.m5622equalsimpl0(this.f73950b, nVar.f73950b) && this.f73951c == nVar.f73951c && w.m5638equalsimpl0(this.f73952d, nVar.f73952d) && m.m5603equalsimpl0(this.f73953e, nVar.f73953e);
    }

    public final boolean getAutoCorrect() {
        return this.f73951c;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m5609getCapitalizationIUNYP9k() {
        return this.f73950b;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m5610getImeActioneUduSuo() {
        return this.f73953e;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m5611getKeyboardTypePjHm6EE() {
        return this.f73952d;
    }

    public final boolean getSingleLine() {
        return this.f73949a;
    }

    public int hashCode() {
        return m.m5604hashCodeimpl(this.f73953e) + ((w.m5639hashCodeimpl(this.f73952d) + com.google.android.gms.internal.play_billing.a.c((u.m5623hashCodeimpl(this.f73950b) + (Boolean.hashCode(this.f73949a) * 31)) * 31, 31, this.f73951c)) * 31);
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f73949a + ", capitalization=" + ((Object) u.m5624toStringimpl(this.f73950b)) + ", autoCorrect=" + this.f73951c + ", keyboardType=" + ((Object) w.m5640toStringimpl(this.f73952d)) + ", imeAction=" + ((Object) m.m5605toStringimpl(this.f73953e)) + ')';
    }

    public /* synthetic */ n(boolean z10, int i10, boolean z11, int i11, int i12, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? u.f73967b.m5616getNoneIUNYP9k() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? w.f73983b.m5633getTextPjHm6EE() : i11, (i13 & 16) != 0 ? m.f73932b.m5592getDefaulteUduSuo() : i12, null);
    }
}
