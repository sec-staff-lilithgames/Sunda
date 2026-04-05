package on;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.rarecharacter.CongratRareCharacterActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.OptionRareCharacterActivity;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.p0;
import com.google.android.material.search.SearchBar;
import com.inmobi.ads.InMobiAudio;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.f.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import o9.b3;
import pw.b1;
import qg.l0;
import r7.k0;
import wr.t6;
import xr.na;
import xr.o0;
import xr.rd;
import xr.wc;
import xr.yc;
import xr.zc;
import yr.v0;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79685c;

    public /* synthetic */ w(Object obj, int i10) {
        this.f79684b = i10;
        this.f79685c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f79684b) {
            case 0:
                x xVar = (x) this.f79685c;
                b bVarA = xVar.a();
                xVar.f(bVarA, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new j(bVarA, 5));
                xVar.f79691h.release();
                return;
            case 1:
                ((c.f) this.f79685c).b();
                return;
            case 2:
                ((io.odeeo.internal.f.b) this.f79685c).release(null);
                return;
            case 3:
                try {
                    ((BufferedReader) this.f79685c).close();
                    return;
                } catch (IOException e10) {
                    throw new UncheckedIOException(e10);
                }
            case 4:
                qe.g gVar = (qe.g) this.f79685c;
                synchronized (gVar.f82817a) {
                    try {
                        if (gVar.f82828l) {
                            return;
                        }
                        long j10 = gVar.f82827k - 1;
                        gVar.f82827k = j10;
                        if (j10 > 0) {
                            return;
                        }
                        if (j10 >= 0) {
                            gVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (gVar.f82817a) {
                            gVar.f82829m = illegalStateException;
                        }
                        return;
                    } finally {
                    }
                }
            case 5:
                r4.c cVar = (r4.c) ((r4.c) this.f79685c).f83737c.f7184a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = cVar.f83736b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    r4.a aVar = (r4.a) arrayList.get(i10);
                    if (aVar != null) {
                        t1 t1Var = cVar.f83735a;
                        Long l9 = (Long) t1Var.get(aVar);
                        if (l9 == null) {
                            aVar.doAnimationFrame(jUptimeMillis);
                        } else if (l9.longValue() < jUptimeMillis2) {
                            t1Var.remove(aVar);
                            aVar.doAnimationFrame(jUptimeMillis);
                        }
                    }
                }
                if (cVar.f83740f) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        cVar.f83742h.unregister();
                    }
                    cVar.f83740f = false;
                }
                if (arrayList.size() > 0) {
                    ((r4.e) cVar.f83739e).postFrameCallback(cVar.f83738d);
                    return;
                }
                return;
            case 6:
                e8.n.closeQuietly((d8.c) this.f79685c);
                return;
            case 7:
                e8.n.closeQuietly((b1) this.f79685c);
                return;
            case 8:
                e8.n.closeQuietly((InputStream) this.f79685c);
                return;
            case 9:
                k0 k0Var = (k0) this.f79685c;
                Executor executor = k0.f83955e;
                k0Var.a();
                return;
            case 10:
                ((Future) this.f79685c).cancel(false);
                return;
            case 11:
                sn.i iVar = (sn.i) this.f79685c;
                if (iVar.f85984e) {
                    return;
                }
                sn.o oVar = iVar.f85983c;
                if (oVar != null) {
                    oVar.release(iVar.f85982b);
                }
                iVar.f85985f.f86004n.remove(iVar);
                iVar.f85984e = true;
                return;
            case 12:
                ((sn.d) this.f79685c).release(null);
                return;
            case 13:
                tf.k kVar = (tf.k) this.f79685c;
                Surface surface = kVar.f86895j;
                if (surface != null) {
                    Iterator it = kVar.f86888b.iterator();
                    while (it.hasNext()) {
                        ((p0) ((tf.l) it.next())).onVideoSurfaceDestroyed(surface);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f86894i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f86894i = null;
                kVar.f86895j = null;
                return;
            case 14:
                ((tj.e) this.f79685c).a(false);
                return;
            case 15:
                ((tn.l) ((tn.q) this.f79685c)).onPrepared();
                return;
            case 16:
                ((u9.b) this.f79685c).f88156b.majIcon(false);
                return;
            case 17:
                ((u9.c) this.f79685c).f88161f.setImageResource(R.drawable.icon_indice_dispo);
                return;
            case 18:
                ((u9.i) this.f79685c).f88165b.majIcon(false);
                return;
            case 19:
                ud.j jVar = (ud.j) this.f79685c;
                ((vd.p) jVar.f88448d).runCriticalSection(new b3(jVar, 20));
                return;
            case 20:
                CongratRareCharacterActivity congratRareCharacterActivity = (CongratRareCharacterActivity) this.f79685c;
                int i11 = CongratRareCharacterActivity.G;
                if (congratRareCharacterActivity.D) {
                    return;
                }
                congratRareCharacterActivity.D = true;
                congratRareCharacterActivity.F.launch(new Intent(congratRareCharacterActivity, (Class<?>) OptionRareCharacterActivity.class));
                return;
            case 21:
                ((OptionRareCharacterActivity) this.f79685c).updateUI();
                return;
            case 22:
                SearchBar searchBar = (SearchBar) this.f79685c;
                com.google.android.material.search.c cVar2 = searchBar.f29311h0;
                Iterator it2 = cVar2.f29355a.iterator();
                while (it2.hasNext()) {
                    ((SearchBar.a) it2.next()).onAnimationStart();
                }
                TextView textView = searchBar.getTextView();
                View centerView = searchBar.getCenterView();
                View secondaryActionMenuItemView = l0.getSecondaryActionMenuItemView(searchBar);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(250L);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(qg.x.alphaListener(textView));
                LinearInterpolator linearInterpolator = vf.a.f89240a;
                valueAnimatorOfFloat.setInterpolator(linearInterpolator);
                valueAnimatorOfFloat.setDuration(250L);
                animatorSet.play(valueAnimatorOfFloat);
                if (secondaryActionMenuItemView != null) {
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(qg.x.alphaListener(secondaryActionMenuItemView));
                    valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
                    valueAnimatorOfFloat2.setDuration(250L);
                    animatorSet.play(valueAnimatorOfFloat2);
                }
                animatorSet.addListener(new com.google.android.material.search.b(cVar2));
                cVar2.f29358d = animatorSet;
                textView.setAlpha(0.0f);
                if (secondaryActionMenuItemView != null) {
                    secondaryActionMenuItemView.setAlpha(0.0f);
                }
                if (centerView == null) {
                    animatorSet.start();
                    return;
                }
                centerView.setAlpha(0.0f);
                centerView.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat3.addUpdateListener(qg.x.alphaListener(centerView));
                valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
                valueAnimatorOfFloat3.setDuration(cVar2.f29362h ? 250L : 0L);
                valueAnimatorOfFloat3.setStartDelay(cVar2.f29362h ? 500L : 0L);
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat4.addUpdateListener(qg.x.alphaListener(centerView));
                valueAnimatorOfFloat4.setInterpolator(linearInterpolator);
                valueAnimatorOfFloat4.setDuration(250L);
                valueAnimatorOfFloat4.setStartDelay(750L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
                cVar2.f29359e = animatorSet2;
                animatorSet2.addListener(new wg.b(centerView, animatorSet));
                animatorSet2.start();
                return;
            case 23:
                InMobiAudio.a((InMobiAudio) this.f79685c);
                return;
            case 24:
                xn.f fVar = (xn.f) this.f79685c;
                synchronized (fVar.f92070a) {
                    try {
                        if (fVar.f92082m) {
                            return;
                        }
                        long j11 = fVar.f92081l - 1;
                        fVar.f92081l = j11;
                        if (j11 > 0) {
                            return;
                        }
                        if (j11 >= 0) {
                            fVar.a();
                            return;
                        }
                        IllegalStateException illegalStateException2 = new IllegalStateException();
                        synchronized (fVar.f92070a) {
                            fVar.f92083n = illegalStateException2;
                        }
                        return;
                    } finally {
                    }
                }
            case 25:
                o0 o0Var = (o0) this.f79685c;
                t6 t6Var = o0Var.f92839e;
                if (t6Var != null && t6Var.isPending()) {
                    o0Var.f92839e.cancel();
                }
                o0Var.f92838d = null;
                return;
            case 26:
                ((na) this.f79685c).requestConnection();
                return;
            case 27:
                zc zcVar = ((yc) this.f79685c).f93267b;
                zcVar.f93334b.schedule(new wc(zcVar));
                return;
            case 28:
                yr.k0 k0Var2 = (yr.k0) this.f79685c;
                Logger logger = yr.k0.f94938n;
                while (true) {
                    try {
                        try {
                            v0 v0Var = new v0(k0Var2.f94943e, k0Var2.f94945g.accept());
                            v0Var.start(((rd) k0Var2.f94950l).transportCreated(v0Var));
                        } catch (IOException e11) {
                            if (!k0Var2.f94951m) {
                                throw e11;
                            }
                            ((rd) k0Var2.f94950l).serverShutdown();
                            return;
                        }
                    } catch (Throwable th2) {
                        yr.k0.f94938n.log(Level.SEVERE, "Accept loop failed", th2);
                        ((rd) k0Var2.f94950l).serverShutdown();
                        return;
                    }
                }
            default:
                zd.v vVar = (zd.v) this.f79685c;
                zd.b bVarA2 = vVar.a();
                vVar.f(bVarA2, IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, new zd.n(bVarA2, 4));
                vVar.f97876h.release();
                return;
        }
    }
}
