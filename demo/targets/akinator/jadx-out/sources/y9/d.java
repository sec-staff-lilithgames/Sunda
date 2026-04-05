package y9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import p0.o2;
import sv.k0;
import timber.log.Timber;
import tu.a0;
import tu.x0;
import xv.o0;
import xv.v0;
import y9.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class d extends bv.n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f94166i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f.a f94167j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f.a aVar, String str, zu.d dVar) {
        super(2, dVar);
        this.f94166i = str;
        this.f94167j = aVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f94167j, this.f94166i, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Bitmap> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        String str = this.f94166i;
        if (str == null) {
            return null;
        }
        String strReplace$default = k0.replace$default(str, "http:", TJzY.Wma, false, 4, (Object) null);
        o0 o0VarBuild = new o0.a().url(strReplace$default).build();
        Timber.Forest forest = Timber.Forest;
        Timber.Tree treeTag = forest.tag("AsynchFlagLoader");
        f.a aVar = this.f94167j;
        treeTag.v("Pos " + aVar.getPosition() + " Downloading flag : " + strReplace$default, new Object[0]);
        try {
            v0 v0VarExecute = aVar.getClient().newCall(o0VarBuild).execute();
            try {
                forest.tag("AsynchFlagLoader").v("Pos " + aVar.getPosition() + " Response : " + v0VarExecute, new Object[0]);
                if (!v0VarExecute.isSuccessful()) {
                    gv.d.closeFinally(v0VarExecute, null);
                    return null;
                }
                byte[] bArrBytes = v0VarExecute.body().bytes();
                forest.tag("AsynchFlagLoader").v("Pos " + aVar.getPosition() + " Downloaded flag : " + bArrBytes.length + " bytes", new Object[0]);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
                gv.d.closeFinally(v0VarExecute, null);
                return bitmapDecodeByteArray;
            } finally {
            }
        } catch (Exception unused) {
            Timber.Forest.tag("AsynchFlagLoader").e(o2.k(aVar.getPosition(), "Pos ", " Exception downloading flag"), new Object[0]);
            return null;
        }
    }
}
