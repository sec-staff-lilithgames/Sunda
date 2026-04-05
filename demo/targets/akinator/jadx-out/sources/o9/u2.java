package o9;

import android.graphics.Bitmap;
import com.digidust.elokence.akinator.activities.HomeActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78585i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78585i = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u2(this.f78585i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HomeActivity homeActivity = this.f78585i;
        HomeActivity.access$getInstancesForCurrentLanguage(homeActivity, arrayList2);
        ca.t.sharedInstance().loadSubjectsButtons(arrayList2, homeActivity.K, new s1(homeActivity));
        Iterator it = arrayList2.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(next, "next(...)");
            lb.c cVar = (lb.c) next;
            Integer numBoxInt = bv.b.boxInt(cVar.getSubjectId());
            Bitmap subjectIcon = ca.t.sharedInstance().getSubjectIcon(cVar.getSubjectId());
            Bitmap subjectIconSelected = ca.t.sharedInstance().getSubjectIconSelected(cVar.getSubjectId());
            String translatedSubjectName = cVar.getTranslatedSubjectName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(translatedSubjectName, "getTranslatedSubjectName(...)");
            String strSubstring = translatedSubjectName.substring(0, 1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String translatedSubjectName2 = cVar.getTranslatedSubjectName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(translatedSubjectName2, "getTranslatedSubjectName(...)");
            String strSubstring2 = translatedSubjectName2.substring(1);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            arrayList.add(new kb.d(numBoxInt, subjectIcon, subjectIconSelected, j1.o2.l(upperCase, strSubstring2)));
        }
        return arrayList;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super ArrayList<kb.d>> dVar) {
        return ((u2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
