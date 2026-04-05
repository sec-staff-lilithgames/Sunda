package o9;

import com.digidust.elokence.akinator.activities.SplashscreenActivity;
import java.util.ArrayList;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g9 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SplashscreenActivity f78177i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(SplashscreenActivity splashscreenActivity, zu.d dVar) {
        super(2, dVar);
        this.f78177i = splashscreenActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new g9(this.f78177i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        b1.a aVar = lb.b1.f72741d;
        String applicationLanguage = aVar.sharedInstance().getApplicationLanguage();
        String phoneLang = ca.m.sharedInstance().getPhoneLang();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(phoneLang, "getPhoneLang(...)");
        if (applicationLanguage == null || (!kotlin.jvm.internal.e0.areEqual(phoneLang, ca.m.transFormLang(Locale.getDefault().getLanguage())) && !ca.m.sharedInstance().hasAlreadyChangeLangManually())) {
            ca.m.sharedInstance().setFirstLaunch(true);
            ca.m.sharedInstance().setPhoneLang(ca.m.transFormLang(Locale.getDefault().getLanguage()));
        }
        ArrayList<b1.b> arrayList = new ArrayList<>();
        if (aVar.sharedInstance().createTraductionFactory(arrayList, this.f78177i.J) == 0) {
            return arrayList;
        }
        return null;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super ArrayList<b1.b>> dVar) {
        return ((g9) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
