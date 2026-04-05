package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g1 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends g1 {

        /* renamed from: a, reason: collision with root package name */
        public final l1 f68865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l1 path) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
            this.f68865a = path;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return kotlin.jvm.internal.e0.areEqual(this.f68865a, ((a) obj).f68865a);
            }
            return false;
        }

        @Override // j1.g1
        public i1.j getBounds() {
            return this.f68865a.getBounds();
        }

        public final l1 getPath() {
            return this.f68865a;
        }

        public int hashCode() {
            return this.f68865a.hashCode();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends g1 {

        /* renamed from: a, reason: collision with root package name */
        public final i1.j f68866a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i1.j rect) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
            this.f68866a = rect;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.e0.areEqual(this.f68866a, ((b) obj).f68866a);
            }
            return false;
        }

        @Override // j1.g1
        public i1.j getBounds() {
            return this.f68866a;
        }

        public final i1.j getRect() {
            return this.f68866a;
        }

        public int hashCode() {
            return this.f68866a.hashCode();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends g1 {

        /* renamed from: a, reason: collision with root package name */
        public final i1.l f68867a;

        /* renamed from: b, reason: collision with root package name */
        public final l1 f68868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i1.l roundRect) {
            super(null);
            kotlin.jvm.internal.e0.checkNotNullParameter(roundRect, "roundRect");
            l1 l1VarPath = null;
            this.f68867a = roundRect;
            if (!h1.access$hasSameCornerRadius(roundRect)) {
                l1VarPath = p.Path();
                l1VarPath.addRoundRect(roundRect);
            }
            this.f68868b = l1VarPath;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return kotlin.jvm.internal.e0.areEqual(this.f68867a, ((c) obj).f68867a);
            }
            return false;
        }

        @Override // j1.g1
        public i1.j getBounds() {
            return i1.m.getBoundingRect(this.f68867a);
        }

        public final i1.l getRoundRect() {
            return this.f68867a;
        }

        public final l1 getRoundRectPath$ui_graphics_release() {
            return this.f68868b;
        }

        public int hashCode() {
            return this.f68867a.hashCode();
        }
    }

    public g1(kotlin.jvm.internal.u uVar) {
    }

    public abstract i1.j getBounds();
}
