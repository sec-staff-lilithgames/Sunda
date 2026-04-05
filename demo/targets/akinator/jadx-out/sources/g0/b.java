package g0;

import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final kv.l f56352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kv.l lineProviderBlock) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(lineProviderBlock, "lineProviderBlock");
            this.f56352a = lineProviderBlock;
        }

        public static /* synthetic */ a copy$default(a aVar, kv.l lVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = aVar.f56352a;
            }
            return aVar.copy(lVar);
        }

        @Override // g0.b
        public int calculateAlignmentLinePosition(x1.q1 placeable) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            return ((Number) this.f56352a.invoke(placeable)).intValue();
        }

        public final kv.l component1() {
            return this.f56352a;
        }

        public final a copy(kv.l lineProviderBlock) {
            kotlin.jvm.internal.e0.checkNotNullParameter(lineProviderBlock, "lineProviderBlock");
            return new a(lineProviderBlock);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f56352a, ((a) obj).f56352a);
        }

        public final kv.l getLineProviderBlock() {
            return this.f56352a;
        }

        public int hashCode() {
            return this.f56352a.hashCode();
        }

        public String toString() {
            return PcrIk.UltTcGzsCR + this.f56352a + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: g0.b$b, reason: collision with other inner class name */
    public static final class C0568b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final x1.a f56353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0568b(x1.a alignmentLine) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
            this.f56353a = alignmentLine;
        }

        public static /* synthetic */ C0568b copy$default(C0568b c0568b, x1.a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                aVar = c0568b.f56353a;
            }
            return c0568b.copy(aVar);
        }

        @Override // g0.b
        public int calculateAlignmentLinePosition(x1.q1 placeable) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            return placeable.get(this.f56353a);
        }

        public final x1.a component1() {
            return this.f56353a;
        }

        public final C0568b copy(x1.a alignmentLine) {
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
            return new C0568b(alignmentLine);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0568b) && kotlin.jvm.internal.e0.areEqual(this.f56353a, ((C0568b) obj).f56353a);
        }

        public final x1.a getAlignmentLine() {
            return this.f56353a;
        }

        public int hashCode() {
            return this.f56353a.hashCode();
        }

        public String toString() {
            return "Value(alignmentLine=" + this.f56353a + ')';
        }
    }

    public b(kotlin.jvm.internal.u uVar) {
    }

    public abstract int calculateAlignmentLinePosition(x1.q1 q1Var);
}
