package io.bidmachine.analytics.internal;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.bidmachine.analytics.internal.AbstractC3872e;
import io.bidmachine.analytics.internal.AbstractC3874g;
import io.bidmachine.analytics.internal.q0;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class A extends AbstractC3872e {

    /* renamed from: j, reason: collision with root package name */
    public static final a f59870j = new a(null);

    /* renamed from: h, reason: collision with root package name */
    private final String f59871h = "isimp";

    /* renamed from: i, reason: collision with root package name */
    private b f59872i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements ImpressionDataListener {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3873f f59873a;

        public b(InterfaceC3873f interfaceC3873f) {
            this.f59873a = interfaceC3873f;
        }

        public void onImpressionSuccess(ImpressionData impressionData) {
            if (impressionData == null) {
                return;
            }
            try {
                int i10 = tu.z.f87419c;
                JSONObject allData = impressionData.getAllData();
                if (allData == null || allData.length() <= 0) {
                    this.f59873a.a(new q0("isimp", q0.a.MONITOR_NO_CONTENT, null, 4, null));
                    return;
                }
                try {
                    this.f59873a.a(s0.a(allData));
                } catch (Throwable th2) {
                    this.f59873a.a(new q0("isimp", q0.a.MONITOR_BAD_CONTENT, s0.a(th2)));
                }
                tu.z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th3) {
                int i11 = tu.z.f87419c;
                tu.z.m7131constructorimpl(tu.a0.createFailure(th3));
            }
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public String a() {
        return this.f59871h;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3872e
    public AbstractC3872e.a c(Map map) {
        String string;
        String upperCase;
        Object obj = map.get("adFormat");
        if (obj == null || (string = obj.toString()) == null || (upperCase = string.toUpperCase(Locale.US)) == null) {
            return null;
        }
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1466654086) {
            if (iHashCode != -1372958932) {
                if (iHashCode != 1666382058) {
                    if (iHashCode == 1951953708 && upperCase.equals(com.ironsource.mediationsdk.l.f37554a)) {
                        return AbstractC3872e.a.BANNER;
                    }
                } else if (upperCase.equals("REWARDED_VIDEO")) {
                    return AbstractC3872e.a.REWARDED;
                }
            } else if (upperCase.equals("INTERSTITIAL")) {
                return AbstractC3872e.a.INTERSTITIAL;
            }
        } else if (upperCase.equals("NATIVEAD")) {
            return AbstractC3872e.a.NATIVE;
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void e(Context context) {
        b bVar = this.f59872i;
        if (bVar != null) {
            IronSource.removeImpressionDataListener(bVar);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3872e, io.bidmachine.analytics.internal.AbstractC3877j
    public void f(Context context) {
        super.f(context);
        b bVar = this.f59872i;
        if (bVar != null) {
            IronSource.addImpressionDataListener(bVar);
        }
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(AbstractC3874g.a aVar) {
        super.b(aVar);
        this.f59872i = new b(this);
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3872e
    public AbstractC3872e.b b(Map map) {
        String string;
        Float fA = a0.a(map.get("revenue"));
        if (fA != null) {
            float fFloatValue = fA.floatValue();
            Object obj = map.get("adNetwork");
            if (obj != null && (string = obj.toString()) != null) {
                return new AbstractC3872e.b(0, fFloatValue, string, 1, null);
            }
        }
        return null;
    }

    @Override // io.bidmachine.analytics.internal.AbstractC3877j
    public void d(Context context) {
    }
}
