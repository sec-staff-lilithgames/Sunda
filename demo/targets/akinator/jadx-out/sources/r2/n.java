package r2;

import g2.v1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f83709b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final n f83710c = new n(0);

    /* renamed from: d, reason: collision with root package name */
    public static final n f83711d = new n(1);

    /* renamed from: e, reason: collision with root package name */
    public static final n f83712e = new n(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f83713a;

    public n(int i10) {
        this.f83713a = i10;
    }

    public final boolean contains(n other) {
        e0.checkNotNullParameter(other, "other");
        int i10 = other.f83713a;
        int i11 = this.f83713a;
        return (i10 | i11) == i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f83713a == ((n) obj).f83713a;
        }
        return false;
    }

    public final int getMask() {
        return this.f83713a;
    }

    public int hashCode() {
        return this.f83713a;
    }

    public final n plus(n decoration) {
        e0.checkNotNullParameter(decoration, "decoration");
        return new n(decoration.f83713a | this.f83713a);
    }

    public String toString() {
        int i10 = this.f83713a;
        if (i10 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((f83711d.f83713a & i10) != 0) {
            arrayList.add("Underline");
        }
        if ((i10 & f83712e.f83713a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return o2.q(new StringBuilder("TextDecoration["), v1.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), AbstractJsonLexerKt.END_LIST);
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final n combine(List<n> decorations) {
            e0.checkNotNullParameter(decorations, "decorations");
            Integer numValueOf = 0;
            int size = decorations.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | decorations.get(i10).getMask());
            }
            return new n(numValueOf.intValue());
        }

        public final n getLineThrough() {
            return n.f83712e;
        }

        public final n getNone() {
            return n.f83710c;
        }

        public final n getUnderline() {
            return n.f83711d;
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }
    }
}
