package n4;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e implements nv.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f75610a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f75611b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.l f75612c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f75613d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f75614e;

    /* renamed from: f, reason: collision with root package name */
    public volatile k4.n f75615f;

    public e(String name, l4.b bVar, kv.l produceMigrations, CoroutineScope scope) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(produceMigrations, "produceMigrations");
        e0.checkNotNullParameter(scope, "scope");
        this.f75610a = name;
        this.f75611b = bVar;
        this.f75612c = produceMigrations;
        this.f75613d = scope;
        this.f75614e = new Object();
    }

    @Override // nv.b
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((Context) obj, (KProperty<?>) kProperty);
    }

    public k4.n getValue(Context thisRef, KProperty<?> property) {
        k4.n nVar;
        e0.checkNotNullParameter(thisRef, "thisRef");
        e0.checkNotNullParameter(property, "property");
        k4.n nVar2 = this.f75615f;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (this.f75614e) {
            try {
                if (this.f75615f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    o4.i iVar = o4.i.f77483a;
                    l4.b bVar = this.f75611b;
                    kv.l lVar = this.f75612c;
                    e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f75615f = iVar.create(bVar, (List<? extends k4.h>) lVar.invoke(applicationContext), this.f75613d, new d(applicationContext, this));
                }
                nVar = this.f75615f;
                e0.checkNotNull(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
