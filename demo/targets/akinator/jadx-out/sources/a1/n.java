package a1;

import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoSamplesKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import io.ktor.client.plugins.HttpRequestRetry;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.flow.internal.SafeCollector;
import tu.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3412b;

    public /* synthetic */ n(int i10) {
        this.f3412b = i10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        zu.c cVar;
        switch (this.f3412b) {
            case 0:
                return obj2;
            case 1:
                return MolocoSamplesKt.MolocoCreateRewardedInterstitialAd$lambda$7((RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 2:
                return MolocoSamplesKt.MolocoCreateNativeAd$lambda$5((NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 3:
                return MolocoSamplesKt.MolocoCreateInterstitialAd$lambda$6((InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            case 4:
                return Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.a((HttpRequestRetry.DelayContext) obj, ((Integer) obj2).intValue()));
            case 5:
                return Long.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a((HttpRequestRetry.DelayContext) obj, ((Integer) obj2).intValue()));
            case 6:
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (zu.k) obj2));
            case 7:
                return CoroutineContextKt.foldCopies$lambda$2((zu.m) obj, (zu.k) obj2);
            case 8:
                return ConcurrentWeakMap._get_keys_$lambda$0(obj, obj2);
            case 9:
                return ConcurrentWeakMap._get_entries_$lambda$1(obj, obj2);
            case 10:
                return Integer.valueOf(SafeCollector.collectContextSize$lambda$0(((Integer) obj).intValue(), (zu.k) obj2));
            case 11:
                return e0.to(obj, obj2);
            case 12:
                return e0.to(obj, obj2);
            case 13:
                String acc = (String) obj;
                zu.k element = (zu.k) obj2;
                kotlin.jvm.internal.e0.checkNotNullParameter(acc, "acc");
                kotlin.jvm.internal.e0.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            default:
                zu.m acc2 = (zu.m) obj;
                zu.k element2 = (zu.k) obj2;
                kotlin.jvm.internal.e0.checkNotNullParameter(acc2, "acc");
                kotlin.jvm.internal.e0.checkNotNullParameter(element2, "element");
                zu.m mVarMinusKey = acc2.minusKey(element2.getKey());
                zu.n nVar = zu.n.f98854b;
                if (mVarMinusKey == nVar) {
                    return element2;
                }
                zu.f fVar = zu.f.f98853b;
                zu.g gVar = (zu.g) mVarMinusKey.get(fVar);
                if (gVar == null) {
                    cVar = new zu.c(mVarMinusKey, element2);
                } else {
                    zu.m mVarMinusKey2 = mVarMinusKey.minusKey(fVar);
                    if (mVarMinusKey2 == nVar) {
                        return new zu.c(element2, gVar);
                    }
                    cVar = new zu.c(new zu.c(mVarMinusKey2, element2), gVar);
                }
                return cVar;
        }
    }
}
