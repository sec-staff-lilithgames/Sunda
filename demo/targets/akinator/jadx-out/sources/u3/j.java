package u3;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f87804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f87805c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f87806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f87807f;

    public j(Context context, List list, String str, int i10) {
        this.f87804b = str;
        this.f87805c = context;
        this.f87806e = list;
        this.f87807f = i10;
    }

    @Override // java.util.concurrent.Callable
    public l call() {
        try {
            return m.b(this.f87805c, this.f87806e, this.f87804b, this.f87807f);
        } catch (Throwable unused) {
            return new l(-3);
        }
    }
}
