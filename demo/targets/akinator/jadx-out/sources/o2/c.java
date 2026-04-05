package o2;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f77395e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f77395e = dVar;
    }

    @Override // kv.a
    public final i2.a invoke() {
        d dVar = this.f77395e;
        return new i2.a(dVar.getTextLocale$ui_text_release(), dVar.f77400e.getText());
    }
}
