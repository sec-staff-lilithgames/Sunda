package g0;

import g0.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f56514a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f56515b = m0.f56523e;

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f56516c = o0.f56533e;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f56517d = n0.f56529e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends l0 {

        /* renamed from: e, reason: collision with root package name */
        public final g0.b f56518e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g0.b alignmentLineProvider) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLineProvider, "alignmentLineProvider");
            this.f56518e = alignmentLineProvider;
        }

        @Override // g0.l0
        public int align$foundation_layout_release(int i10, s2.x layoutDirection, x1.q1 placeable, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            int iCalculateAlignmentLinePosition = this.f56518e.calculateAlignmentLinePosition(placeable);
            if (iCalculateAlignmentLinePosition == Integer.MIN_VALUE) {
                return 0;
            }
            int i12 = i11 - iCalculateAlignmentLinePosition;
            return layoutDirection == s2.x.f85364c ? i10 - i12 : i12;
        }

        @Override // g0.l0
        public Integer calculateAlignmentLinePosition$foundation_layout_release(x1.q1 placeable) {
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            return Integer.valueOf(this.f56518e.calculateAlignmentLinePosition(placeable));
        }

        public final g0.b getAlignmentLineProvider() {
            return this.f56518e;
        }

        @Override // g0.l0
        public boolean isRelative$foundation_layout_release() {
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends l0 {

        /* renamed from: e, reason: collision with root package name */
        public final e1.b f56519e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e1.b horizontal) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(horizontal, "horizontal");
            this.f56519e = horizontal;
        }

        @Override // g0.l0
        public int align$foundation_layout_release(int i10, s2.x layoutDirection, x1.q1 placeable, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            return this.f56519e.align(0, i10, layoutDirection);
        }

        public final e1.b getHorizontal() {
            return this.f56519e;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends l0 {

        /* renamed from: e, reason: collision with root package name */
        public final e1.c f56520e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e1.c vertical) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(vertical, "vertical");
            this.f56520e = vertical;
        }

        @Override // g0.l0
        public int align$foundation_layout_release(int i10, s2.x layoutDirection, x1.q1 placeable, int i11) {
            kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
            return this.f56520e.align(0, i10);
        }

        public final e1.c getVertical() {
            return this.f56520e;
        }
    }

    public l0(kotlin.jvm.internal.u uVar) {
    }

    public abstract int align$foundation_layout_release(int i10, s2.x xVar, x1.q1 q1Var, int i11);

    public Integer calculateAlignmentLinePosition$foundation_layout_release(x1.q1 placeable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(placeable, "placeable");
        return null;
    }

    public boolean isRelative$foundation_layout_release() {
        return false;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final l0 AlignmentLine(x1.a alignmentLine) {
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLine, "alignmentLine");
            return new a(new b.C0568b(alignmentLine));
        }

        public final l0 Relative$foundation_layout_release(g0.b alignmentLineProvider) {
            kotlin.jvm.internal.e0.checkNotNullParameter(alignmentLineProvider, "alignmentLineProvider");
            return new a(alignmentLineProvider);
        }

        public final l0 getCenter() {
            return l0.f56515b;
        }

        public final l0 getEnd() {
            return l0.f56517d;
        }

        public final l0 getStart() {
            return l0.f56516c;
        }

        public final l0 horizontal$foundation_layout_release(e1.b horizontal) {
            kotlin.jvm.internal.e0.checkNotNullParameter(horizontal, "horizontal");
            return new c(horizontal);
        }

        public final l0 vertical$foundation_layout_release(e1.c vertical) {
            kotlin.jvm.internal.e0.checkNotNullParameter(vertical, "vertical");
            return new d(vertical);
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }
    }
}
