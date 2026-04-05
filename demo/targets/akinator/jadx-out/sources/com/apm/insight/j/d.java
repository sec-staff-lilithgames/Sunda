package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f13074a = new ArrayList(3);

    private d(Handler handler, Context context) {
        if (com.apm.insight.l.a.b(context)) {
            this.f13074a.add(new c(handler));
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }

    public final void a() {
        com.apm.insight.a.a((Object) ("[ScheduleTaskManager] execute, task size=" + this.f13074a.size()));
        Iterator<a> it = this.f13074a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (Throwable unused) {
            }
        }
    }
}
