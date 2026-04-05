package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3888v extends AbstractC3871d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f60274h = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final String f60275g = "aexs";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.v$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f60275g;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3871d
    public File a(ReaderConfig.Rule rule) {
        return new File(s0.b(rule.getPath()));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
    }
}
