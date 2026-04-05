package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.AbstractC3876i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class H extends AbstractC3876i {

    /* renamed from: j, reason: collision with root package name */
    public static final a f59898j = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final J f59899g;

    /* renamed from: h, reason: collision with root package name */
    private final I f59900h;

    /* renamed from: i, reason: collision with root package name */
    private final String f59901i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ H(J j10, I i10, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, (i11 & 2) != 0 ? new I(j10, null, 2, null) : i10);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f59901i;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    public void e(Context context) {
        super.e(context);
        this.f59900h.a();
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        this.f59900h.b();
        super.f(context);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i, io.bidmachine.analytics.internal.AbstractC3877j
    /* renamed from: a */
    public void b(AbstractC3876i.a aVar) {
        super.b(aVar);
        this.f59900h.a(aVar);
    }

    public H(J j10, I i10) {
        this.f59899g = j10;
        this.f59900h = i10;
        this.f59901i = "alog";
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3876i
    public Object a(ReaderConfig.Rule rule, zu.d dVar) {
        return this.f59900h.a(rule);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
    }
}
