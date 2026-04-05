package o9;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78357i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78357i = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new m2(this.f78357i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(100, 8, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-16777216);
        Resources resources = this.f78357i.getResources();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(resources, "getResources(...)");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        bitmapDrawable.setAlpha(175);
        return bitmapDrawable;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super BitmapDrawable> dVar) {
        return ((m2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
