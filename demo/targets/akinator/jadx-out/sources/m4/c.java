package m4;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f74012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f74013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(0);
        this.f74012e = context;
        this.f74013f = str;
    }

    @Override // kv.a
    public final SharedPreferences invoke() {
        SharedPreferences sharedPreferences = this.f74012e.getSharedPreferences(this.f74013f, 0);
        e0.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
