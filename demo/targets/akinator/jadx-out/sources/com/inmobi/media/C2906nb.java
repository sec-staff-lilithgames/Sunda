package com.inmobi.media;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.nb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2906nb extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2906nb(Context context) {
        super(0);
        this.f33161a = context;
    }

    @Override // kv.a
    public final Object invoke() {
        C2973rb c2973rb = C2973rb.f33316a;
        Context context = this.f33161a;
        c2973rb.getClass();
        if (C2973rb.f33319d == null) {
            C2973rb.f33319d = new C2720cb(context, "pub_signals_store");
        }
        C2720cb c2720cb = null;
        try {
            C2720cb c2720cb2 = C2973rb.f33319d;
            if (c2720cb2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                c2720cb2 = null;
            }
            String strA = c2720cb2.a("saved_signals");
            if (strA != null) {
                JSONObject jSONObject = new JSONObject(strA);
                Iterator<String> itKeys = jSONObject.keys();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys, "keys(...)");
                Iterator it = rv.f0.toList(rv.f0.filterNot(rv.y.asSequence(itKeys), C2872lb.f33056a)).iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                C2720cb c2720cb3 = C2973rb.f33319d;
                if (c2720cb3 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                    c2720cb3 = null;
                }
                String string = jSONObject.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                c2720cb3.a("saved_signals", string, true);
            }
        } catch (Exception unused) {
            C2720cb c2720cb4 = C2973rb.f33319d;
            if (c2720cb4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                c2720cb4 = null;
            }
            c2720cb4.c("saved_signals");
        }
        try {
            C2720cb c2720cb5 = C2973rb.f33319d;
            if (c2720cb5 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                c2720cb5 = null;
            }
            String strA2 = c2720cb5.a("imp_depth");
            if (strA2 != null) {
                JSONObject jSONObject2 = new JSONObject(strA2);
                Iterator<String> itKeys2 = jSONObject2.keys();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(itKeys2, "keys(...)");
                Iterator it2 = rv.f0.toList(rv.f0.filterNot(rv.y.asSequence(itKeys2), C2889mb.f33095a)).iterator();
                while (it2.hasNext()) {
                    jSONObject2.remove((String) it2.next());
                }
                C2720cb c2720cb6 = C2973rb.f33319d;
                if (c2720cb6 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
                    c2720cb6 = null;
                }
                String string2 = jSONObject2.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(...)");
                c2720cb6.a("imp_depth", string2);
            }
        } catch (Exception unused2) {
            C2720cb c2720cb7 = C2973rb.f33319d;
            if (c2720cb7 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("prefDao");
            } else {
                c2720cb = c2720cb7;
            }
            c2720cb.c("imp_depth");
        }
        C2973rb.f33316a.getClass();
        C2973rb.f33320e.b();
        C2973rb.f33321f.b();
        return tu.x0.f87415a;
    }
}
