package com.mbridge.msdk.foundation.same.task;

import android.content.Context;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.r0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f41011a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> f41012b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f41013c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements a.InterfaceC0275a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f41014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0275a f41015b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0275a interfaceC0275a) {
            this.f41014a = aVar;
            this.f41015b = interfaceC0275a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0275a
        public void a(a.b bVar) {
            if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                b.this.f41012b.remove(Long.valueOf(this.f41014a.getId()));
            } else if (bVar == a.b.RUNNING && b.this.f41013c.get() == null) {
                b.this.a();
            }
            a.InterfaceC0275a interfaceC0275a = this.f41015b;
            if (interfaceC0275a != null) {
                interfaceC0275a.a(bVar);
            }
        }
    }

    public b(Context context, int i10) {
        if (r0.a().a("c_t_l_t_p", true)) {
            this.f41011a = c.b();
        } else {
            if (i10 == 0) {
                this.f41011a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f41011a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f41011a.allowCoreThreadTimeOut(true);
        }
        this.f41012b = new HashMap<>();
        this.f41013c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f41011a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0275a interfaceC0275a) {
        a(aVar, interfaceC0275a);
        this.f41011a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, a.InterfaceC0275a interfaceC0275a) {
        this.f41012b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0275a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.f41012b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.f41012b.clear();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public b(Context context) {
        if (r0.a().a("c_t_l_t_p", true)) {
            this.f41011a = c.b();
        } else {
            if (r0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f41011a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f41011a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f41011a.allowCoreThreadTimeOut(true);
        }
        this.f41012b = new HashMap<>();
        this.f41013c = new WeakReference<>(context);
    }
}
