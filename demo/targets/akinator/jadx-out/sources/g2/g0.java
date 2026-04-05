package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f56757e = new g0(2);

    @Override // kv.p
    public final Object invoke(a1.r Saver, b it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(Saver, "$this$Saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return uu.p0.arrayListOf(q1.save(it.getText()), q1.save(it.getSpanStyles(), q1.f56808b, Saver), q1.save(it.getParagraphStyles(), q1.f56808b, Saver), q1.save(it.getAnnotations$ui_text_release(), q1.f56808b, Saver));
    }
}
