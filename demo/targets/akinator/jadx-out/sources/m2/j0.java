package m2;

import g2.a2;
import g2.b2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a1.m f73926d;

    /* renamed from: a, reason: collision with root package name */
    public final g2.b f73927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73928b;

    /* renamed from: c, reason: collision with root package name */
    public final a2 f73929c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final a1.m getSaver() {
            return j0.f73926d;
        }
    }

    static {
        new a(null);
        f73926d = a1.q.Saver(h0.f73920e, i0.f73921e);
    }

    public j0(g2.b bVar, long j10, a2 a2Var, kotlin.jvm.internal.u uVar) {
        this.f73927a = bVar;
        this.f73928b = b2.m3973constrain8ffj60Q(j10, 0, getText().length());
        this.f73929c = a2Var != null ? a2.m3948boximpl(b2.m3973constrain8ffj60Q(a2Var.m3964unboximpl(), 0, getText().length())) : null;
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ j0 m5586copy3r_uNRQ$default(j0 j0Var, g2.b bVar, long j10, a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = j0Var.f73927a;
        }
        if ((i10 & 2) != 0) {
            j10 = j0Var.f73928b;
        }
        if ((i10 & 4) != 0) {
            a2Var = j0Var.f73929c;
        }
        return j0Var.m5588copy3r_uNRQ(bVar, j10, a2Var);
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final j0 m5588copy3r_uNRQ(g2.b annotatedString, long j10, a2 a2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(annotatedString, "annotatedString");
        return new j0(annotatedString, j10, a2Var, (kotlin.jvm.internal.u) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return a2.m3953equalsimpl0(this.f73928b, j0Var.f73928b) && kotlin.jvm.internal.e0.areEqual(this.f73929c, j0Var.f73929c) && kotlin.jvm.internal.e0.areEqual(this.f73927a, j0Var.f73927a);
    }

    public final g2.b getAnnotatedString() {
        return this.f73927a;
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final a2 m5590getCompositionMzsxiRA() {
        return this.f73929c;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m5591getSelectiond9O1mEE() {
        return this.f73928b;
    }

    public final String getText() {
        return this.f73927a.getText();
    }

    public int hashCode() {
        int iM3961hashCodeimpl = (a2.m3961hashCodeimpl(this.f73928b) + (this.f73927a.hashCode() * 31)) * 31;
        a2 a2Var = this.f73929c;
        return iM3961hashCodeimpl + (a2Var != null ? a2.m3961hashCodeimpl(a2Var.m3964unboximpl()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f73927a) + "', selection=" + ((Object) a2.m3963toStringimpl(this.f73928b)) + ", composition=" + this.f73929c + ')';
    }

    /* renamed from: copy-3r_uNRQ, reason: not valid java name */
    public final j0 m5589copy3r_uNRQ(String text, long j10, a2 a2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        return new j0(new g2.b(text, null, null, 6, null), j10, a2Var, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ j0(g2.b bVar, long j10, a2 a2Var, int i10, kotlin.jvm.internal.u uVar) {
        this(bVar, (i10 & 2) != 0 ? a2.f56706b.m4051getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : a2Var, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: copy-3r_uNRQ$default, reason: not valid java name */
    public static /* synthetic */ j0 m5587copy3r_uNRQ$default(j0 j0Var, String str, long j10, a2 a2Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = j0Var.f73928b;
        }
        if ((i10 & 4) != 0) {
            a2Var = j0Var.f73929c;
        }
        return j0Var.m5589copy3r_uNRQ(str, j10, a2Var);
    }

    public /* synthetic */ j0(String str, long j10, a2 a2Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? a2.f56706b.m4051getZerod9O1mEE() : j10, (i10 & 4) != 0 ? null : a2Var, (kotlin.jvm.internal.u) null);
    }

    public j0(String str, long j10, a2 a2Var, kotlin.jvm.internal.u uVar) {
        this(new g2.b(str, null, null, 6, null), j10, a2Var, (kotlin.jvm.internal.u) null);
    }
}
