package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.dL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1937dL extends SQ {
    public static String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final SO A02;
    public final AtomicReference<SN> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<LH> A05;

    public C1937dL(Activity activity, SS ss, LH lh2) {
        super(activity.getApplicationContext(), ss);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new SO();
        this.A04 = new AtomicReference<>();
        this.A05.set(lh2);
        this.A00 = new WeakReference<>(activity);
    }

    public C1937dL(Context context, SS ss, LH lh2) {
        super(context.getApplicationContext(), ss);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new SO();
        this.A04 = new AtomicReference<>();
        this.A05.set(lh2);
        Activity activityA00 = A00(context);
        if (activityA00 != null) {
            this.A00 = new WeakReference<>(activityA00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof C1937dL) && ((C1937dL) context).A0E() != null) {
                return ((C1937dL) context).A0E();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final Activity A0E() {
        return this.A00.get();
    }

    public LH A0F() {
        LH funnel = this.A05.get();
        if (funnel == null) {
            return new C2273j3();
        }
        return funnel;
    }

    public final SN A0G() {
        return this.A03.get();
    }

    public final SO A0H() {
        return this.A02;
    }

    public final Object A0I() {
        return this.A04.get();
    }

    public final void A0J(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0K(LH lh2) {
        this.A05.set(lh2);
    }

    public final void A0L(C1937dL c1937dL) {
        c1937dL.A01.putAll(this.A01);
        this.A01 = c1937dL.A01;
    }

    public final void A0M(C1937dL c1937dL) {
        A0K(c1937dL.A0F());
        A0D(c1937dL.A0C());
        A0N(c1937dL.A0G());
    }

    public final void A0N(SN sn2) {
        this.A03.set(sn2);
    }

    public final void A0O(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0P(Object obj) {
        this.A04.set(obj);
    }

    public final void A0Q(Throwable th2) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (zHasNext) {
                it.next().getKey().repair(th2);
            } else {
                return;
            }
        }
    }
}
