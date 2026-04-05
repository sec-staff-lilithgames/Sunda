package o9;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.view.Display;
import androidx.activity.result.ActivityResult;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.MenuActivity;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import com.digidust.elokence.akinator.activities.rarecharacter.CongratRareCharacterActivity;
import com.explorestack.protobuf.Struct;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.CustomParams;
import io.bidmachine.Executable;
import io.bidmachine.nativead.view.VideoPlayerActivity;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.sdk.Placement;
import io.odeeo.internal.f.g;
import io.odeeo.internal.g.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.function.Predicate;
import lb.e;
import q9.k;
import r9.e;
import s9.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements z9.d, z9.c, da.j, Executable, io.odeeo.internal.q0.h, mt.o, nj.o0, nj.m0, ko.l, mt.r0, jn.c0, a.d, sf.n, ir.d, um.i0, wd.b, i.b, w3.k, rr.b, xv.c0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f78045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f78046c;

    public /* synthetic */ b3(Object obj, int i10) {
        this.f78045b = i10;
        this.f78046c = obj;
    }

    @Override // io.odeeo.internal.q0.h
    public void accept(Object obj) {
        ((g.a) obj).drmSessionManagerError((Exception) this.f78046c);
    }

    @Override // jn.c0
    public void consume(long j10, io.bidmachine.media3.common.util.m0 m0Var) {
        ko.p.consume(j10, m0Var, ((rp.f0) this.f78046c).f84631c);
    }

    @Override // xv.c0
    public xv.b0 create(xv.j it) {
        xv.b0 b0Var = (xv.b0) this.f78046c;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return b0Var;
    }

    @Override // io.bidmachine.Executable
    public void execute(Object obj) {
        switch (this.f78045b) {
            case 3:
                Placement.Builder builder = (Placement.Builder) this.f78046c;
                Struct.Builder builderNewBuilder = Struct.newBuilder();
                ((CustomParams) obj).fillStructBuilder(builderNewBuilder);
                if (builderNewBuilder.getFieldsCount() > 0) {
                    builder.setCustomData(builderNewBuilder);
                    break;
                }
                break;
            default:
                tm.g gVar = (tm.g) this.f78046c;
                gVar.f87056u.onOpenUrlIntention(gVar, (String) obj);
                break;
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f78045b) {
            case 24:
                return "Unsupported ScaleType - " + ((Rendering.Image.ScaleType) this.f78046c).name();
            case 25:
                return "Unsupported TaskName - " + ((Rendering.Phase.Event.Task.TaskName) this.f78046c).name();
            case 26:
                return "Unsupported ViewComponentType - " + ((Rendering.Phase.ViewComponent.ViewComponentType) this.f78046c).name();
            case 27:
                return "Unsupported EventName - " + ((Rendering.Phase.Event.EventName) this.f78046c).name();
            default:
                return a.b.e(((VideoPlayerActivity) this.f78046c).f61962b, "VideoPlayerActivity started, position: ");
        }
    }

    @Override // nj.m0
    public void logEvent(byte[] bArr) {
        ((md.f0) ((jd.k) this.f78046c)).send(jd.f.ofData(bArr));
    }

    @Override // i.b
    public void onActivityResult(Object obj) {
        CongratRareCharacterActivity congratRareCharacterActivity = (CongratRareCharacterActivity) this.f78046c;
        ActivityResult result = (ActivityResult) obj;
        int i10 = CongratRareCharacterActivity.G;
        kotlin.jvm.internal.e0.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1) {
            congratRareCharacterActivity.setResult(-1);
        } else {
            congratRareCharacterActivity.setResult(0);
        }
        congratRareCharacterActivity.finish();
    }

    @Override // sf.n
    public void onDefaultDisplayChanged(Display display) {
        sf.s sVar = (sf.s) this.f78046c;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f85718k = refreshRate;
            sVar.f85719l = (refreshRate * 80) / 100;
        } else {
            com.google.android.exoplayer2.util.f0.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            sVar.f85718k = C.TIME_UNSET;
            sVar.f85719l = C.TIME_UNSET;
        }
    }

    @Override // nj.o0
    public void onEventTrigger(String str) {
        ((mt.n) this.f78046c).onNext(str);
    }

    @Override // z9.c
    public void onInappInit(boolean z10) {
        PopPedagogiqueActivity popPedagogiqueActivity = (PopPedagogiqueActivity) this.f78046c;
        int i10 = PopPedagogiqueActivity.V;
        if (!z10) {
            popPedagogiqueActivity.r();
            return;
        }
        l4 l4Var = new l4(popPedagogiqueActivity);
        z9.e.getInstance().requestInappDetailsUpdate(new j4(popPedagogiqueActivity, l4Var));
        z9.e.getInstance().requestAllPurchases(new j4(popPedagogiqueActivity, l4Var));
    }

    @Override // z9.d
    public void onInappPurchasesRequested(boolean z10) {
        MenuActivity menuActivity = (MenuActivity) this.f78046c;
        int i10 = MenuActivity.D;
        if (z10) {
            menuActivity.runOnUiThread(new e3(menuActivity, 0));
        } else {
            menuActivity.runOnUiThread(new a(menuActivity, 4));
        }
    }

    @Override // da.j
    public void onOk() {
        SelectLanguageActivity selectLanguageActivity = (SelectLanguageActivity) this.f78046c;
        int i10 = SelectLanguageActivity.I;
        selectLanguageActivity.j();
    }

    @Override // um.i0
    public void onVisibilityChanged(boolean z10) {
        tm.s0 s0Var = (tm.s0) this.f78046c;
        tm.r0 r0Var = tm.s0.f87123i;
        s0Var.a();
    }

    @Override // mt.r0
    public void subscribe(mt.p0 emitter) throws IOException {
        int i10 = this.f78045b;
        Object obj = this.f78046c;
        switch (i10) {
            case 9:
                q9.k kVar = (q9.k) obj;
                k.a aVar = q9.k.f82639l;
                kotlin.jvm.internal.e0.checkNotNullParameter(emitter, "emitter");
                e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
                if (persoPropose != null) {
                    AkActivity akActivity = kVar.f82642f;
                    if (akActivity != null) {
                        akActivity.displayLoader();
                    }
                    String str = q9.h.f82630g.getReasons().get(kVar.f82644h);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "get(...)");
                    String strD = str;
                    String str2 = kVar.f82647k;
                    if (str2 != null) {
                        strD = w0.i.d(strD, " ", str2);
                    }
                    String str3 = strD;
                    lb.e currentSession = ca.o.sharedInstance().getCurrentSession();
                    Integer numValueOf = currentSession != null ? Integer.valueOf(currentSession.correctName(persoPropose.getIdBase(), kVar.f82645i, kVar.f82646j, persoPropose.getName(), persoPropose.getDescription(), str3)) : null;
                    AkActivity akActivity2 = kVar.f82642f;
                    if (akActivity2 != null) {
                        akActivity2.hideLoader();
                    }
                    pt.c cVar = kVar.f82640c;
                    if (cVar != null && !cVar.isDisposed()) {
                        if (numValueOf == null || numValueOf.intValue() != 0) {
                            ((du.g) emitter).onError(new UnknownError(lb.b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                            break;
                        } else {
                            ((du.g) emitter).onSuccess(numValueOf);
                            break;
                        }
                    }
                }
                break;
            case 10:
                r9.e eVar = (r9.e) obj;
                e.a aVar2 = r9.e.f84058h;
                kotlin.jvm.internal.e0.checkNotNullParameter(emitter, "e");
                AkActivity akActivity3 = eVar.f84061f;
                if (akActivity3 != null) {
                    akActivity3.displayLoader();
                }
                e.g persoPropose2 = ca.u.sharedInstance().getPersoPropose();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(persoPropose2, "getPersoPropose(...)");
                if (ca.o.sharedInstance().getCurrentSession() != null) {
                    try {
                        lb.e currentSession2 = ca.o.sharedInstance().getCurrentSession();
                        kotlin.jvm.internal.e0.checkNotNull(currentSession2);
                        eVar.f84062g = currentSession2.getQuestionsToAsk(persoPropose2.getIdBase());
                    } catch (nb.b e10) {
                        ((du.g) emitter).onError(e10);
                        return;
                    }
                }
                if (eVar.f84062g == null) {
                    ((du.g) emitter).onError(new nb.b());
                    break;
                } else {
                    ((du.g) emitter).onSuccess(0);
                    break;
                }
            default:
                s9.x xVar = (s9.x) obj;
                x.a aVar3 = s9.x.f85568j;
                kotlin.jvm.internal.e0.checkNotNullParameter(emitter, "e");
                lb.b bVar = xVar.f85572g;
                kotlin.jvm.internal.e0.checkNotNull(bVar);
                Bitmap bitmapDownloadPicture = kb.e.downloadPicture(bVar.getPhotoUrl1(), ca.m.sharedInstance().canDownloadPicture());
                lb.b bVar2 = xVar.f85572g;
                kotlin.jvm.internal.e0.checkNotNull(bVar2);
                Bitmap bitmapDownloadPicture2 = kb.e.downloadPicture(bVar2.getPhotoUrl2(), ca.m.sharedInstance().canDownloadPicture());
                pt.c cVar2 = xVar.f85573h;
                if (cVar2 != null) {
                    kotlin.jvm.internal.e0.checkNotNull(cVar2);
                    if (!cVar2.isDisposed()) {
                        if (bitmapDownloadPicture != null && bitmapDownloadPicture2 != null) {
                            ((du.g) emitter).onSuccess(new w3.e(bitmapDownloadPicture, bitmapDownloadPicture2));
                            break;
                        } else {
                            ((du.g) emitter).onError(new NullPointerException());
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // w3.k
    public boolean test(Object obj) {
        switch (this.f78045b) {
            case 22:
                return !((w3.k) this.f78046c).test(obj);
            default:
                return ((Predicate) this.f78046c).test((ClipData.Item) obj);
        }
    }

    @Override // ko.l
    public long timeUsToTargetTime(long j10) {
        switch (this.f78045b) {
            case 8:
                return ((ko.k0) this.f78046c).getSampleNumber(j10);
            default:
                return ((io.odeeo.internal.g.p) this.f78046c).getSampleNumber(j10);
        }
    }

    @Override // wd.b
    public Object execute() {
        switch (this.f78045b) {
            case 17:
                return ((vd.p) ((vd.c) this.f78046c)).loadClientMetrics();
            case 18:
                ((vd.p) ((ud.h) this.f78046c).f88435i).resetClientMetrics();
                return null;
            case 19:
                return Integer.valueOf(((vd.p) ((vd.d) this.f78046c)).cleanUp());
            default:
                ud.j jVar = (ud.j) this.f78046c;
                Iterator<md.d0> it = ((vd.p) jVar.f88446b).loadActiveContexts().iterator();
                while (it.hasNext()) {
                    jVar.f88447c.schedule(it.next(), 1);
                }
                return null;
        }
    }

    @Override // mt.o
    public void subscribe(mt.n nVar) {
        ((pj.c0) this.f78046c).f81425a.setListener(new b3(nVar, 6));
    }
}
