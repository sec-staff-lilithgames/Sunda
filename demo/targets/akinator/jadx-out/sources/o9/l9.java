package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f78329i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f78330j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78331k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(SplashscreenActivity splashscreenActivity, boolean z10, List list, zu.d dVar) {
        super(2, dVar);
        this.f78329i = z10;
        this.f78330j = list;
        this.f78331k = splashscreenActivity;
    }

    public static final void a(lb.b1 b1Var, ca.m mVar, SplashscreenActivity splashscreenActivity, b1.b bVar, int i10, boolean z10) throws IOException, ParseException {
        b1Var.setApplicationLanguage(bVar.getCode(), i10);
        AkApplication.f21719f.setCoeffFont(Float.parseFloat(bVar.getFontCoeffAndroid()));
        if (z10) {
            mVar.dontNeedToDownloadFlagAnymore();
            splashscreenActivity.p(kb.e.downloadBitmapFromUrl(bVar.getFlagUrl()));
        }
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l9(this.f78331k, this.f78329i, this.f78330j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws IOException, ParseException {
        b1.b bVar;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ca.m mVarSharedInstance = ca.m.sharedInstance();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mVarSharedInstance, "sharedInstance(...)");
        lb.b1 b1VarSharedInstance = lb.b1.f72741d.sharedInstance();
        String language = Locale.getDefault().getLanguage();
        Object obj2 = null;
        List list = this.f78330j;
        boolean z10 = this.f78329i;
        if (z10) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.e0.areEqual(((b1.b) next).getCode(), language)) {
                    obj2 = next;
                    break;
                }
            }
            bVar = (b1.b) obj2;
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.e0.areEqual(((b1.b) next2).getCode(), b1VarSharedInstance.getApplicationLanguage())) {
                    obj2 = next2;
                    break;
                }
            }
            bVar = (b1.b) obj2;
        }
        b1.b bVar2 = bVar;
        lb.c currentInstance = mVarSharedInstance.getCurrentInstance();
        int tradsAppId = currentInstance != null ? currentInstance.getTradsAppId() : 1;
        if (mVarSharedInstance.getCurrentInstance() == null) {
            mVarSharedInstance.setCurrentSubject(1);
        }
        if (z10) {
            if (bVar2 != null) {
                a(b1VarSharedInstance, mVarSharedInstance, this.f78331k, bVar2, tradsAppId, true);
                mVarSharedInstance.setCurrentLanguage(language);
            } else {
                mVarSharedInstance.setCurrentLanguage("en");
            }
            mVarSharedInstance.setCurrentSubject(1);
        } else if (bVar2 != null) {
            a(b1VarSharedInstance, mVarSharedInstance, this.f78331k, bVar2, tradsAppId, mVarSharedInstance.hasToDownloadFlagOnSplash());
        }
        AkApplication.f21719f.setViet(sv.k0.equals(b1VarSharedInstance.getApplicationLanguage(), "vi", true));
        this.f78331k.C = true;
        return bv.b.boxBoolean(z10 && bVar2 == null);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
        return ((l9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
