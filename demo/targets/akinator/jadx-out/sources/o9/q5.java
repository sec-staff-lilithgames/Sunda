package o9;

import android.content.Intent;
import com.digidust.elokence.akinator.activities.QuestionActivity;
import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78460i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78461j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.g f78462k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78463l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(QuestionActivity questionActivity, e.g gVar, ArrayList arrayList, zu.d dVar) {
        super(2, dVar);
        this.f78461j = questionActivity;
        this.f78462k = gVar;
        this.f78463l = arrayList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new q5(this.f78461j, this.f78462k, this.f78463l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78460i;
        QuestionActivity questionActivity = this.f78461j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            questionActivity.O = ka.a.f70679k;
            ka.a aVar = questionActivity.O;
            oa.l lVar = null;
            if (aVar == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("reactionAkitude");
                aVar = null;
            }
            List<ka.b> listMutableListOf = uu.p0.mutableListOf(new ka.b(aVar, 10));
            oa.l lVar2 = questionActivity.F;
            if (lVar2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("akinatorPlayer");
            } else {
                lVar = lVar2;
            }
            Job jobPlaySequence = lVar.playSequence(questionActivity.L, listMutableListOf);
            this.f78460i = 1;
            if (jobPlaySequence.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        questionActivity.L = ka.a.f70679k;
        e.g gVar = this.f78462k;
        ArrayList arrayList = this.f78463l;
        if (gVar != null && arrayList.size() > 1) {
            final aw.f fVar = new aw.f(gVar, 28);
            arrayList.removeIf(new Predicate() { // from class: o9.p5
                @Override // java.util.function.Predicate
                public final boolean test(Object obj2) {
                    return ((Boolean) fVar.invoke(obj2)).booleanValue();
                }
            });
        }
        if (arrayList.isEmpty()) {
            intent = new Intent(questionActivity, (Class<?>) SoundlikeActivity.class);
        } else {
            intent = new Intent(questionActivity, (Class<?>) SoundlikeActivity.class);
            kotlin.jvm.internal.e0.checkNotNull(intent.putExtra("several", arrayList));
        }
        questionActivity.startActivity(intent);
        questionActivity.finish();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((q5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
