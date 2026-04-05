package o6;

import android.content.Context;
import java.io.File;
import y5.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements y5.f, b8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f77886a;

    public /* synthetic */ e0(Context context) {
        this.f77886a = context;
    }

    @Override // y5.f
    public y5.g create(y5.e configuration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(configuration, "configuration");
        e.a aVarBuilder = y5.e.f94075f.builder(this.f77886a);
        aVarBuilder.name(configuration.f94077b).callback(configuration.f94078c).noBackupDirectory(true).allowDataLossOnRecovery(true);
        return new z5.g().create(aVarBuilder.build());
    }

    @Override // b8.e
    public File getCacheDir() {
        return new File(this.f77886a.getCacheDir(), "lottie_network_cache");
    }
}
