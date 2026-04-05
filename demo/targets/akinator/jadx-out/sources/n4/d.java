package n4;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f75608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f75609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, e eVar) {
        super(0);
        this.f75608e = context;
        this.f75609f = eVar;
    }

    @Override // kv.a
    public final File invoke() {
        Context applicationContext = this.f75608e;
        e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return c.preferencesDataStoreFile(applicationContext, this.f75609f.f75610a);
    }
}
