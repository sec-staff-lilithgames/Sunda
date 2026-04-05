package t9;

import ca.o;
import com.digidust.elokence.akinator.activities.AkActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import lb.b1;
import lb.e;
import mt.p0;
import mt.r0;
import t9.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f86595c;

    public /* synthetic */ d(f fVar, int i10) {
        this.f86594b = i10;
        this.f86595c = fVar;
    }

    @Override // mt.r0
    public final void subscribe(p0 e10) {
        int questionsFromString;
        int objectsForQuestionWithListSize;
        int i10 = this.f86594b;
        f fVar = this.f86595c;
        switch (i10) {
            case 0:
                f.a aVar = f.f86599m;
                e0.checkNotNullParameter(e10, "e");
                AkActivity akActivity = fVar.f86603g;
                ArrayList<e.h> arrayList = fVar.f86605i;
                e0.checkNotNull(akActivity);
                akActivity.displayLoader();
                String str = fVar.f86604h;
                e0.checkNotNull(str);
                if (str.length() > 10) {
                    lb.e currentSession = o.sharedInstance().getCurrentSession();
                    e0.checkNotNull(currentSession);
                    String str2 = fVar.f86604h;
                    e0.checkNotNull(str2);
                    String strSubstring = str2.substring(0, 10);
                    e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    questionsFromString = currentSession.getQuestionsFromString(strSubstring, arrayList);
                } else {
                    lb.e currentSession2 = o.sharedInstance().getCurrentSession();
                    e0.checkNotNull(currentSession2);
                    String str3 = fVar.f86604h;
                    e0.checkNotNull(str3);
                    questionsFromString = currentSession2.getQuestionsFromString(str3, arrayList);
                }
                AkActivity akActivity2 = fVar.f86603g;
                e0.checkNotNull(akActivity2);
                akActivity2.hideLoader();
                pt.c cVar = fVar.f86602f;
                if (cVar != null) {
                    e0.checkNotNull(cVar);
                    if (!cVar.isDisposed()) {
                        if (questionsFromString != 0) {
                            ((du.g) e10).onError(new UnknownError(b1.f72741d.sharedInstance().getTraductionFromToken("PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD")));
                            break;
                        } else {
                            ((du.g) e10).onSuccess(Integer.valueOf(questionsFromString));
                            break;
                        }
                    }
                }
                break;
            default:
                f.a aVar2 = f.f86599m;
                e0.checkNotNullParameter(e10, "e");
                AkActivity akActivity3 = fVar.f86603g;
                e0.checkNotNull(akActivity3);
                akActivity3.displayLoader();
                ArrayList<e.b> arrayList2 = new ArrayList<>();
                if (o.sharedInstance().getCurrentSession() != null) {
                    lb.e currentSession3 = o.sharedInstance().getCurrentSession();
                    e0.checkNotNull(currentSession3);
                    objectsForQuestionWithListSize = currentSession3.getObjectsForQuestionWithListSize(10, arrayList2);
                } else {
                    objectsForQuestionWithListSize = -1;
                }
                AkActivity akActivity4 = fVar.f86603g;
                e0.checkNotNull(akActivity4);
                akActivity4.hideLoader();
                pt.c cVar2 = fVar.f86602f;
                if (cVar2 != null) {
                    e0.checkNotNull(cVar2);
                    if (!cVar2.isDisposed()) {
                        if (objectsForQuestionWithListSize != 0) {
                            ((du.g) e10).onSuccess(arrayList2);
                            break;
                        } else {
                            ((du.g) e10).onSuccess(arrayList2);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
