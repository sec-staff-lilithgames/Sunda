package ji;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.digidust.elokence.akinator.activities.GameOverSliderActivity;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.activities.WebviewCGV;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.ViewPagerCustom;
import com.digidust.elokence.akinator.paid.databinding.ActivityHomeBinding;
import io.bidmachine.media3.exoplayer.j0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import ji.u;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import lb.b1;
import lb.s0;
import mt.b0;
import nh.yh;
import nj.k;
import o5.b2;
import o9.a1;
import o9.d1;
import o9.l3;
import o9.n3;
import o9.x;
import o9.y0;
import o9.y2;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f69617c;

    public /* synthetic */ t(Object obj, int i10) {
        this.f69616b = i10;
        this.f69617c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [k3.l] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        Object obj;
        Application application = null;
        z = false;
        boolean z10 = false;
        ?? r32 = 1;
        r32 = 1;
        Map<String, String> keys = null;
        ActivityHomeBinding activityHomeBinding = null;
        ActivityHomeBinding activityHomeBinding2 = null;
        ActivityHomeBinding activityHomeBinding3 = null;
        switch (this.f69616b) {
            case 0:
                u.a aVar = (u.a) this.f69617c;
                aVar.f69626b.set(null);
                synchronized (aVar) {
                    try {
                        if (aVar.f69625a.isMarked()) {
                            keys = ((f) aVar.f69625a.getReference()).getKeys();
                            AtomicMarkableReference atomicMarkableReference = aVar.f69625a;
                            atomicMarkableReference.set((f) atomicMarkableReference.getReference(), false);
                        }
                    } finally {
                    }
                }
                if (keys != null) {
                    u uVar = u.this;
                    uVar.f69618a.writeKeyData(uVar.f69620c, keys, aVar.f69627c);
                    return;
                }
                return;
            case 1:
                jo.k kVar = (jo.k) this.f69617c;
                Surface surface = kVar.f69875j;
                if (surface != null) {
                    Iterator it = kVar.f69868b.iterator();
                    while (it.hasNext()) {
                        ((j0) ((jo.l) it.next())).onVideoSurfaceDestroyed(surface);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f69874i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f69874i = null;
                kVar.f69875j = null;
                return;
            case 2:
                Activity activity = (Activity) this.f69617c;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = k3.m.f70222g;
                Method method = k3.m.f70221f;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i10 != 26 && i10 != 27) || method != null) && (k3.m.f70220e != null || k3.m.f70219d != null)) {
                    try {
                        Object obj2 = k3.m.f70218c.get(activity);
                        if (obj2 != null && (obj = k3.m.f70217b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            k3.l lVar = new k3.l(activity);
                            application2.registerActivityLifecycleCallbacks(lVar);
                            handler.post(new k3.i(lVar, obj2));
                            if (i10 != 26 && i10 != 27) {
                                r32 = 0;
                            }
                            try {
                                if (r32 != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        application = application2;
                                        r32 = lVar;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        application = application2;
                                        k3.l lVar2 = lVar;
                                        handler.post(new k3.j(application, lVar2));
                                        throw th;
                                    }
                                } else {
                                    application = application2;
                                    r32 = lVar;
                                    activity.recreate();
                                }
                                handler.post(new k3.j(application, r32));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 3:
                ((io.odeeo.internal.c.a) this.f69617c).e();
                return;
            case 4:
                lb.e eVar = (lb.e) this.f69617c;
                ArrayList arrayList = lb.e.f72801n;
                eVar.cancelSession();
                return;
            case 5:
                s0 s0Var = (s0) this.f69617c;
                s0.b bVar = s0.f72971j;
                s0Var.updateInstancesListFromWSC();
                return;
            case 6:
                ((m3.m) this.f69617c).disconnectFromService();
                return;
            case 7:
                Job job = (Job) this.f69617c;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    return;
                }
                return;
            case 8:
                yh.a((IntStream[]) this.f69617c);
                return;
            case 9:
                ((IntStream) this.f69617c).close();
                return;
            case 10:
                ((DoubleStream) this.f69617c).close();
                return;
            case 11:
                ((LongStream) this.f69617c).close();
                return;
            case 12:
                yh.a((DoubleStream[]) this.f69617c);
                return;
            case 13:
                yh.a((LongStream[]) this.f69617c);
                return;
            case 14:
                ((Stream) this.f69617c).close();
                return;
            case 15:
                yh.a((Stream[]) this.f69617c);
                return;
            case 16:
                ((k.c) this.f69617c).getListener();
                throw null;
            case 17:
                ((k.a) this.f69617c).getListener();
                throw null;
            case 18:
                ((k.b) this.f69617c).getListener();
                throw null;
            case 19:
                ((k.e) this.f69617c).getListener();
                throw null;
            case 20:
                nj.s sVar = (nj.s) this.f69617c;
                boolean z11 = sVar.f77005c;
                if ((!z11 || !sVar.f77006e) && z11) {
                    z10 = true;
                }
                sVar.f77005c = z10;
                return;
            case 21:
                o0.u.m5759setRippleState$lambda2((o0.u) this.f69617c);
                return;
            case 22:
                b2.access$invalidated((b2) this.f69617c);
                return;
            case 23:
                o9.j jVar = (o9.j) this.f69617c;
                ViewGroup viewGroup = jVar.f78237h;
                e0.checkNotNull(viewGroup);
                viewGroup.removeView(jVar.f78238i);
                jVar.f78238i = null;
                return;
            case 24:
                a1 a1Var = ((y0) this.f69617c).f78683b;
                if (a1Var.f78017b.getCurrentItem() == a1Var.f78018c.getCount() - 1) {
                    a1Var.f78017b.setCurrentItem(0);
                    return;
                } else {
                    ViewPagerCustom viewPagerCustom = a1Var.f78017b;
                    viewPagerCustom.setCurrentItem(viewPagerCustom.getCurrentItem() + 1);
                    return;
                }
            case 25:
                GameOverSliderActivity gameOverSliderActivity = (GameOverSliderActivity) this.f69617c;
                int i11 = gameOverSliderActivity.C;
                if (i11 == 6 || i11 == 7) {
                    ta.o.sharedInstance().updateScoreFromChallengeAkiAward(gameOverSliderActivity.getIntent().getIntExtra("keyNbDefi", 0));
                } else {
                    ta.o.sharedInstance().updateScoreFromClassicAkiAward();
                }
                if (ca.m.sharedInstance().isUserConnected()) {
                    gameOverSliderActivity.disposeAtDestruction(b0.fromCallable(new x(5)).subscribeOn(ou.j.io()).observeOn(ot.c.mainThread()).subscribe(new d1(gameOverSliderActivity, 1 == true ? 1 : 0)));
                    return;
                }
                return;
            case 26:
                HomeActivity homeActivity = (HomeActivity) this.f69617c;
                int i12 = HomeActivity.U;
                Timber.Forest forest = Timber.Forest;
                forest.tag("Banerinou").d("Home - updateHomeBannerGraphicConf", new Object[0]);
                if (!ca.m.sharedInstance().isHomeBannerAvailable()) {
                    forest.tag("Banerinou").d("Home - updateHomeBannerGraphicConf - pas de banner disponible", new Object[0]);
                    ActivityHomeBinding activityHomeBinding4 = homeActivity.D;
                    if (activityHomeBinding4 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                        activityHomeBinding4 = null;
                    }
                    activityHomeBinding4.homeOverlayMessageLayout.setVisibility(8);
                    ActivityHomeBinding activityHomeBinding5 = homeActivity.D;
                    if (activityHomeBinding5 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                        activityHomeBinding5 = null;
                    }
                    activityHomeBinding5.generalBannerComLayout.setVisibility(8);
                    ActivityHomeBinding activityHomeBinding6 = homeActivity.D;
                    if (activityHomeBinding6 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        activityHomeBinding3 = activityHomeBinding6;
                    }
                    activityHomeBinding3.homeOverlayButton.setVisibility(8);
                    ca.m.sharedInstance().setHomeBannerOpened(true);
                    return;
                }
                forest.tag("Banerinou").d("Home - updateHomeBannerGraphicConf - banner disponible", new Object[0]);
                ActivityHomeBinding activityHomeBinding7 = homeActivity.D;
                if (activityHomeBinding7 == null) {
                    e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding7 = null;
                }
                activityHomeBinding7.homeOverlayText.setText(ca.o.sharedInstance().getHomeBannerText());
                try {
                    if (ca.o.sharedInstance().getBase64Img() != null) {
                        byte[] bArrDecode = z9.f.decode(ca.o.sharedInstance().getBase64Img());
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        ActivityHomeBinding activityHomeBinding8 = homeActivity.D;
                        if (activityHomeBinding8 == null) {
                            e0.throwUninitializedPropertyAccessException("mBinding");
                            activityHomeBinding8 = null;
                        }
                        activityHomeBinding8.akinatorTete.setImageBitmap(bitmapDecodeByteArray);
                    }
                } catch (z9.g e10) {
                    Timber.Forest.tag("HomeActivity").e(e10);
                }
                ActivityHomeBinding activityHomeBinding9 = homeActivity.D;
                if (activityHomeBinding9 == null) {
                    e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding9 = null;
                }
                activityHomeBinding9.homeOverlayButton.setVisibility(0);
                if (!ca.m.sharedInstance().isHomeBannerOpened()) {
                    CountDownTimer countDownTimer = homeActivity.E;
                    if (countDownTimer != null) {
                        e0.checkNotNull(countDownTimer);
                        countDownTimer.cancel();
                    }
                    Timber.Forest.tag("Banerinou").d("Home - updateHomeBannerGraphicConf - banner disponible et fermé", new Object[0]);
                    ActivityHomeBinding activityHomeBinding10 = homeActivity.D;
                    if (activityHomeBinding10 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                        activityHomeBinding10 = null;
                    }
                    activityHomeBinding10.homeOverlayMessageLayout.setVisibility(8);
                    ActivityHomeBinding activityHomeBinding11 = homeActivity.D;
                    if (activityHomeBinding11 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                        activityHomeBinding11 = null;
                    }
                    activityHomeBinding11.generalBannerComLayout.setVisibility(8);
                    ActivityHomeBinding activityHomeBinding12 = homeActivity.D;
                    if (activityHomeBinding12 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        activityHomeBinding2 = activityHomeBinding12;
                    }
                    activityHomeBinding2.homeOverlayButton.setImageResource(R.drawable.ak_arrow_right_btq_unpressed);
                    Animation animation = homeActivity.J;
                    if (animation != null) {
                        e0.checkNotNull(animation);
                        animation.cancel();
                        return;
                    }
                    return;
                }
                Timber.Forest.tag("Banerinou").d("Home - updateHomeBannerGraphicConf - banner disponible et ouvert", new Object[0]);
                CountDownTimer countDownTimer2 = homeActivity.E;
                e0.checkNotNull(countDownTimer2);
                countDownTimer2.cancel();
                homeActivity.E = new y2(homeActivity, ca.m.sharedInstance().getDelaiTimerBanniereCom()).start();
                ActivityHomeBinding activityHomeBinding13 = homeActivity.D;
                if (activityHomeBinding13 == null) {
                    e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding13 = null;
                }
                activityHomeBinding13.generalBannerComLayout.setVisibility(0);
                ActivityHomeBinding activityHomeBinding14 = homeActivity.D;
                if (activityHomeBinding14 == null) {
                    e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding14 = null;
                }
                activityHomeBinding14.homeOverlayMessageLayout.setVisibility(0);
                ActivityHomeBinding activityHomeBinding15 = homeActivity.D;
                if (activityHomeBinding15 == null) {
                    e0.throwUninitializedPropertyAccessException("mBinding");
                    activityHomeBinding15 = null;
                }
                activityHomeBinding15.homeOverlayButton.setImageResource(R.drawable.ak_arrow_left_btq_unpressed);
                if (homeActivity.J != null) {
                    ActivityHomeBinding activityHomeBinding16 = homeActivity.D;
                    if (activityHomeBinding16 == null) {
                        e0.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        activityHomeBinding = activityHomeBinding16;
                    }
                    activityHomeBinding.akinatorTete.startAnimation(homeActivity.J);
                    return;
                }
                return;
            case 27:
                l3 l3Var = (l3) this.f69617c;
                n3 n3Var = l3Var.f78317c;
                RecyclerView recyclerView = n3Var.f78385e;
                if (recyclerView != null) {
                    int i13 = l3Var.f78316b + 1;
                    l3Var.f78316b = i13;
                    try {
                        recyclerView.smoothScrollToPosition(i13);
                        return;
                    } catch (ArithmeticException unused2) {
                        l3Var.f78316b = 0;
                        n3Var.f78385e.smoothScrollToPosition(0);
                        return;
                    }
                }
                return;
            case 28:
                SendFormActivity sendFormActivity = (SendFormActivity) this.f69617c;
                int i14 = SendFormActivity.O;
                sendFormActivity.getClass();
                Toast.makeText(sendFormActivity, b1.sharedInstance().getTraductionFromToken("MERCI_DE_LAISSER_UN_COMMENTAIRE"), 1).show();
                return;
            default:
                WebviewCGV webviewCGV = (WebviewCGV) this.f69617c;
                int i15 = WebviewCGV.R;
                webviewCGV.getClass();
                try {
                    Thread.sleep(2000L);
                    webviewCGV.trySmth();
                    return;
                } catch (InterruptedException e11) {
                    Timber.tag("WebViewCGV").e(e11);
                    return;
                }
        }
    }

    public /* synthetic */ t(k.d dVar, rj.o oVar, int i10) {
        this.f69616b = i10;
        this.f69617c = dVar;
    }

    public /* synthetic */ t(k.d dVar, rj.o oVar, Object obj, int i10) {
        this.f69616b = i10;
        this.f69617c = dVar;
    }
}
