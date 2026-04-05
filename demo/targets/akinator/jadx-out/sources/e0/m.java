package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public final float f53169a;

        /* renamed from: b, reason: collision with root package name */
        public final long f53170b;

        public a(float f10, long j10, kotlin.jvm.internal.u uVar) {
            super(null);
            this.f53169a = f10;
            this.f53170b = j10;
        }

        public final float getDelta() {
            return this.f53169a;
        }

        /* renamed from: getPointerPosition-F1C5BW0, reason: not valid java name */
        public final long m3766getPointerPositionF1C5BW0() {
            return this.f53170b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final long f53171a;

        public b(long j10, kotlin.jvm.internal.u uVar) {
            super(null);
            this.f53171a = j10;
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m3767getStartPointF1C5BW0() {
            return this.f53171a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name */
        public final float f53172a;

        public c(float f10) {
            super(null);
            this.f53172a = f10;
        }

        public final float getVelocity() {
            return this.f53172a;
        }
    }

    public m(kotlin.jvm.internal.u uVar) {
    }
}
