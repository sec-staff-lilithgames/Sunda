package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.Calendar;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Tb extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ub f32305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tb(Ub ub2, boolean z10) {
        super(0);
        this.f32305a = ub2;
        this.f32306b = z10;
    }

    @Override // kv.a
    public final Object invoke() {
        Ub ub2 = this.f32305a;
        if (!ub2.f32369g.isEmpty() && !ub2.f32370h.isEmpty()) {
            String strC = ub2.c();
            kotlin.jvm.internal.e0.checkNotNullParameter(strC, "<this>");
            if (!kotlin.jvm.internal.e0.areEqual(strC, "{}")) {
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                if (this.f32305a.f32372j.length() == 0) {
                    Ub ub3 = this.f32305a;
                    ScheduledExecutorService scheduledExecutorService = AbstractC2969r7.f33307a;
                    Context context = ub3.f32363a;
                    kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
                    File file = new File(context.getFilesDir() + "/logging");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    ub3.f32372j = context.getFilesDir() + "/logging/" + timeInMillis + ".txt";
                }
                Ub ub4 = this.f32305a;
                if (AbstractC2986s7.a("RemoteLogger", ub4.c(), ub4.f32372j)) {
                    Ub ub5 = this.f32305a;
                    boolean z10 = this.f32306b;
                    String str = ub5.f32372j;
                    C2750e7 data = new C2750e7(str, timeInMillis, 0, 0L, z10, ub5.f32373k.get(), 12);
                    C2767f7 c2767f7D = AbstractC2807hd.d();
                    c2767f7D.getClass();
                    kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
                    if (V1.a(c2767f7D, j1.o2.f(AbstractJsonLexerKt.STRING, "filename=\"", str), null, null, null, null, null, 62).isEmpty()) {
                        int i10 = this.f32305a.f32365c;
                        c2767f7D.a((Object) data);
                        if (c2767f7D.f32838b != null) {
                            I5.a();
                        }
                        ScheduledExecutorService scheduledExecutorService2 = AbstractC2969r7.f33307a;
                        Ub ub6 = this.f32305a;
                        AbstractC2953q7.a(c2767f7D, timeInMillis - ub6.f32364b, ub6.f32365c);
                    } else {
                        c2767f7D.b(data);
                    }
                }
            }
        }
        return tu.x0.f87415a;
    }
}
