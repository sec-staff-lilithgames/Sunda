package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x6 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public SelectLanguageActivity f78670i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicReference f78671j;

    /* renamed from: k, reason: collision with root package name */
    public int f78672k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f78673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78674m;

    /* renamed from: n, reason: collision with root package name */
    public int f78675n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(SelectLanguageActivity selectLanguageActivity, zu.d dVar) {
        super(dVar);
        this.f78674m = selectLanguageActivity;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78673l = obj;
        this.f78675n |= Integer.MIN_VALUE;
        return SelectLanguageActivity.access$asyncCheckLanguage(this.f78674m, null, 0, null, this);
    }
}
