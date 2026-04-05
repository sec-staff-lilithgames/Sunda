package nh;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.digidust.elokence.akinator.activities.DefiDuJourActivity;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.PostProposeActivity;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.activities.WebviewGeneralActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.Function;
import io.odeeo.internal.f.g;
import io.odeeo.internal.f.h;
import j$.util.DesugarTimeZone;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Locale;
import java.util.Spliterator;
import o9.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class n1 implements k1, st.c, st.q, Function, rr.b, da.j, i.b, z9.d, x3.q0, ee.u, jd.j, io.bidmachine.media3.common.util.x, io.odeeo.internal.q0.h, h.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76488b;

    public /* synthetic */ n1(int i10) {
        this.f76488b = i10;
    }

    @Override // io.odeeo.internal.q0.h
    public void accept(Object obj) {
        switch (this.f76488b) {
            case 25:
                ((g.a) obj).drmKeysRemoved();
                break;
            case 26:
                ((g.a) obj).drmKeysLoaded();
                break;
            case 27:
                ((g.a) obj).drmKeysRestored();
                break;
            default:
                ((g.a) obj).drmSessionAcquired(3);
                break;
        }
    }

    @Override // st.c
    public Object apply(Object obj, Object obj2) {
        return nj.i0.create((String) obj, (tj.k) obj2);
    }

    @Override // ee.u
    public ee.p[] createExtractors() {
        switch (this.f76488b) {
            case 18:
                return new ee.p[]{new oe.a()};
            case 19:
                return new ee.p[]{new oe.c()};
            case 20:
                return new ee.p[]{new oe.e()};
            case 21:
                return new ee.p[]{new oe.y()};
            default:
                return new ee.p[]{new oe.e0()};
        }
    }

    @Override // rr.b
    public Object get() {
        Calendar calendar;
        switch (this.f76488b) {
            case 8:
                Handler handler = nm.j.f77050a;
                return "Manifest permission not found: android.permission.ACCESS_NETWORK_STATE. Check the integration.";
            default:
                Handler handler2 = nm.j.f77050a;
                try {
                    try {
                        calendar = Calendar.getInstance();
                    } catch (Throwable unused) {
                        calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"), Locale.US);
                    }
                } catch (Throwable unused2) {
                    calendar = Calendar.getInstance(Locale.US);
                }
                return Integer.valueOf(calendar.get(1));
        }
    }

    @Override // io.bidmachine.media3.common.util.x
    public void invoke(Object obj, gn.v vVar) {
    }

    @Override // nh.k1
    public Spliterator newFlatMapSpliterator(Spliterator spliterator, Spliterator spliterator2, java.util.function.Function function, int i10, long j10) {
        switch (this.f76488b) {
            case 0:
                return new o1((Spliterator.OfInt) spliterator, spliterator2, function, i10, j10);
            case 1:
                return new p1((Spliterator.OfLong) spliterator, spliterator2, function, i10, j10);
            default:
                return new q1(spliterator, spliterator2, function, i10, j10);
        }
    }

    @Override // i.b
    public void onActivityResult(Object obj) {
        int i10 = GameOverSliderActivity.L;
        ((Boolean) obj).getClass();
    }

    @Override // x3.q0
    public x3.e3 onApplyWindowInsets(View view, x3.e3 e3Var) {
        switch (this.f76488b) {
            case 16:
                int i10 = WebviewCGV.R;
                o3.c insets = e3Var.getInsets(x3.t3.systemBars());
                view.setPadding(insets.f77432a, insets.f77433b, insets.f77434c, insets.f77435d);
                break;
            default:
                int i11 = WebviewGeneralActivity.D;
                o3.c insets2 = e3Var.getInsets(x3.t3.systemBars());
                view.setPadding(insets2.f77432a, insets2.f77433b, insets2.f77434c, insets2.f77435d);
                break;
        }
        return e3Var;
    }

    @Override // z9.d
    public void onInappPurchasesRequested(boolean z10) {
        int i10 = HomeActivity.U;
    }

    @Override // da.j
    public void onOk() {
        switch (this.f76488b) {
            case 10:
                s.a aVar = o9.s.f78491t;
                break;
            case 11:
                break;
            case 12:
                int[] iArr = DefiDuJourActivity.P;
                ca.u.sharedInstance().showPubTemp(false);
                break;
            default:
                int i10 = PostProposeActivity.Z;
                ca.u.sharedInstance().showPubTemp(false);
                break;
        }
    }

    @Override // io.odeeo.internal.f.h.b
    public void release() {
        h.b.a();
    }

    @Override // st.q
    public boolean test(Object obj) {
        boolean zBooleanValue;
        switch (this.f76488b) {
            case 4:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 5:
                nj.i0 i0Var = (nj.i0) obj;
                return (TextUtils.isEmpty(i0Var.a()) || TextUtils.isEmpty(i0Var.b().getToken())) ? false : true;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    @Override // io.bidmachine.Function
    public Object apply(Object obj) {
        switch (this.f76488b) {
            case 7:
                return obj.toString();
            default:
                return oi.a.f79398b.reportToJson((ki.f2) obj).getBytes(Charset.forName(C.UTF8_NAME));
        }
    }

    private final void b() {
    }
}
