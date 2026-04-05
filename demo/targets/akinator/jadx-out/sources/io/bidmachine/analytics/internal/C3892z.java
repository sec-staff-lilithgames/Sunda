package io.bidmachine.analytics.internal;

import android.content.Context;
import io.bidmachine.analytics.ReaderConfig;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3892z extends AbstractC3871d {

    /* renamed from: i, reason: collision with root package name */
    public static final a f60306i = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final File f60307g;

    /* renamed from: h, reason: collision with root package name */
    private final String f60308h = "aints";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.bidmachine.analytics.internal.z$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    public C3892z(File file) {
        this.f60307g = file;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f60308h;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3871d
    public File a(ReaderConfig.Rule rule) {
        return new File(this.f60307g, s0.b(rule.getPath()));
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
    }
}
