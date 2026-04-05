package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f70021b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final k1.a f70022c = new k1.a(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, null);

    /* renamed from: d, reason: collision with root package name */
    public static final c f70023d = new c(new float[]{0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f}, null);

    /* renamed from: e, reason: collision with root package name */
    public static final b f70024e = new b(new float[]{0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f}, null);

    /* renamed from: a, reason: collision with root package name */
    public final float[] f70025a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final d getBradford() {
            return d.f70022c;
        }

        public final d getCiecat02() {
            return d.f70024e;
        }

        public final d getVonKries() {
            return d.f70023d;
        }
    }

    public d(float[] fArr, kotlin.jvm.internal.u uVar) {
        this.f70025a = fArr;
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.f70025a;
    }
}
