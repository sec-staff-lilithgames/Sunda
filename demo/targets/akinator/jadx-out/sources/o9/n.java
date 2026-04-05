package o9;

import com.digidust.elokence.akinator.paid.databinding.FragmentAwardsBinding;
import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o9.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78375i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f78376j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, zu.d dVar) {
        super(2, dVar);
        this.f78376j = jVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n(this.f78376j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78375i;
        j jVar = this.f78376j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            jVar.a().loadingBarAward.setVisibility(0);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            m mVar = new m(jVar, null);
            this.f78375i = 1;
            obj = BuildersKt.withContext(io2, mVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        j.a aVar = (j.a) obj;
        jVar.a().loadingBarAward.setVisibility(8);
        FragmentAwardsBinding fragmentAwardsBindingA = jVar.a();
        fragmentAwardsBindingA.textNbBadgeStandard.setText(String.valueOf(aVar.getQ1()));
        fragmentAwardsBindingA.textNbBadgeBronze.setText(String.valueOf(aVar.getQ2()));
        fragmentAwardsBindingA.textNbBadgeSilver.setText(String.valueOf(aVar.getQ3()));
        fragmentAwardsBindingA.textNbBadgeGold.setText(String.valueOf(aVar.getQ4()));
        fragmentAwardsBindingA.textNbBadgePlatinum.setText(String.valueOf(aVar.getQ5()));
        fragmentAwardsBindingA.textNbBadgeBlack.setText(String.valueOf(aVar.getQ6()));
        fragmentAwardsBindingA.textNbBadgeStandard.resizeText();
        fragmentAwardsBindingA.textNbBadgeBronze.resizeText();
        fragmentAwardsBindingA.textNbBadgeSilver.resizeText();
        fragmentAwardsBindingA.textNbBadgeGold.resizeText();
        fragmentAwardsBindingA.textNbBadgePlatinum.resizeText();
        fragmentAwardsBindingA.textNbBadgeBlack.resizeText();
        if (aVar.getQ4() == 0) {
            fragmentAwardsBindingA.buttonShowGoldAwards.setVisibility(4);
        } else {
            fragmentAwardsBindingA.buttonShowGoldAwards.setOnClickListener(jVar.getAwardClickListener());
        }
        if (aVar.getQ5() == 0) {
            fragmentAwardsBindingA.buttonShowPlatinumAwards.setVisibility(4);
        } else {
            fragmentAwardsBindingA.buttonShowPlatinumAwards.setOnClickListener(jVar.getAwardClickListener());
        }
        if (aVar.getQ6() == 0) {
            fragmentAwardsBindingA.buttonShowBlackAwards.setVisibility(4);
        } else {
            fragmentAwardsBindingA.buttonShowBlackAwards.setOnClickListener(jVar.getAwardClickListener());
        }
        if (ca.m.sharedInstance().isUserConnected()) {
            fragmentAwardsBindingA.textNbBadgeDDJ.setText(String.valueOf(aVar.getQ7()));
            fragmentAwardsBindingA.textNbBadgeDdjFull.setText(String.valueOf(aVar.getQ8()));
        } else {
            fragmentAwardsBindingA.textNbBadgeDDJ.setText(String.valueOf(aa.f.sharedInstance().getNbAwardDdj(1)));
            fragmentAwardsBindingA.textNbBadgeDdjFull.setText(String.valueOf(aa.f.sharedInstance().getNbAwardDdj(2)));
        }
        fragmentAwardsBindingA.textNbBadgeStandard.resizeText();
        fragmentAwardsBindingA.textNbBadgeBronze.resizeText();
        fragmentAwardsBindingA.layoutAwardsDetails.setVisibility(0);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
