package l2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f72386c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final q f72387e = new q();

    /* renamed from: f, reason: collision with root package name */
    public static final e1 f72388f = new e1(C.SANS_SERIF_NAME, "FontFamily.SansSerif");

    /* renamed from: g, reason: collision with root package name */
    public static final e1 f72389g = new e1(C.SERIF_NAME, "FontFamily.Serif");

    /* renamed from: h, reason: collision with root package name */
    public static final e1 f72390h = new e1("monospace", "FontFamily.Monospace");

    /* renamed from: i, reason: collision with root package name */
    public static final e1 f72391i = new e1("cursive", "FontFamily.Cursive");

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72392b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final e1 getCursive() {
            return x.f72391i;
        }

        public final r1 getDefault() {
            return x.f72387e;
        }

        public final e1 getMonospace() {
            return x.f72390h;
        }

        public final e1 getSansSerif() {
            return x.f72388f;
        }

        public final e1 getSerif() {
            return x.f72389g;
        }
    }

    public x(boolean z10, kotlin.jvm.internal.u uVar) {
        this.f72392b = z10;
    }

    @tu.f
    public final boolean getCanLoadSynchronously() {
        return this.f72392b;
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
