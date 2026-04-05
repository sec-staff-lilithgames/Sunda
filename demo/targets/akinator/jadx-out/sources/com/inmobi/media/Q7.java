package com.inmobi.media;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Q7 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: a, reason: collision with root package name */
    public static final Q7 f32164a = new Q7();

    public Q7() {
        super(2);
    }

    public static void a(Bundle bundle, String topic) {
        kotlin.jvm.internal.e0.checkNotNullParameter(topic, "topic");
        C2925od.a(new zk.n(7, bundle, topic));
    }

    public static final void b(Bundle bundle, String topic) {
        LinkedHashMap linkedHashMapA;
        kotlin.jvm.internal.e0.checkNotNullParameter(topic, "$topic");
        if (bundle == null) {
            return;
        }
        try {
            if (kotlin.jvm.internal.e0.areEqual(topic, R7.f32208c) && (linkedHashMapA = R7.a(bundle)) != null) {
                C2973rb.f33316a.getClass();
                C2973rb.a(linkedHashMapA);
                linkedHashMapA.toString();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // kv.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((Bundle) obj, (String) obj2);
        return tu.x0.f87415a;
    }
}
